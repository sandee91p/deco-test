package me.test.contener.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ApkManager {
    private static final String TAG = "ApkManager"; // Log tag for filtering in Logcat

    // Step 1: Decode AndroidManifest.xml using AXMLResource
    public static String decodeManifest(String apkPath) throws Exception {
        Log.d(TAG, "Decoding AndroidManifest.xml...");
        try (ZipFile zipFile = new ZipFile(new File(apkPath))) {
            ZipEntry manifestEntry = zipFile.getEntry("AndroidManifest.xml");
            if (manifestEntry == null) {
                throw new RuntimeException("AndroidManifest.xml not found in APK");
            }
            try (InputStream inputStream = zipFile.getInputStream(manifestEntry)) {
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                byte[] data = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
                    buffer.write(data, 0, bytesRead);
                }
                buffer.flush();
                byte[] manifestBytes = buffer.toByteArray();
                if (manifestBytes == null || manifestBytes.length == 0) {
                    throw new RuntimeException("Failed to read AndroidManifest.xml");
                }
                android.content.res.AXMLResource axmlResource = new android.content.res.AXMLResource();
                axmlResource.read(new ByteArrayInputStream(manifestBytes));
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outputStream));
                axmlResource.print();
                String decodedXml = outputStream.toString();
                Log.d(TAG, "AndroidManifest.xml decoded successfully.");
                return decodedXml;
            }
        } catch (Exception e) {
            Log.e(TAG, "Error decoding AndroidManifest.xml: " + e.getMessage());
            throw new RuntimeException("Error decoding AndroidManifest.xml: " + e.getMessage(), e);
        }
    }

    // Extract package name from the APK
    public static String extractPackageName(String apkPath) throws Exception {
        Log.d(TAG, "Extracting package name...");
        String decodedXml = decodeManifest(apkPath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new ByteArrayInputStream(decodedXml.getBytes()));
        String packageName = document.getDocumentElement().getAttribute("package");
        Log.d(TAG, "Package name extracted: " + packageName);
        return packageName;
    }

    // Step 2: Parse the decoded XML to extract metadata
    public static JSONObject parseManifest(String decodedXml) throws Exception {
        Log.d(TAG, "Parsing AndroidManifest.xml for metadata...");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new ByteArrayInputStream(decodedXml.getBytes()));
        JSONObject json = new JSONObject();

        // Extract package name
        String packageName = document.getDocumentElement().getAttribute("package");
        json.put("packageName", packageName);
        Log.d(TAG, "Package name: " + packageName);

        // Extract application-level metadata
        Element applicationElement = (Element) document.getElementsByTagName("application").item(0);
        JSONObject application = new JSONObject();
        application.put("label", applicationElement.getAttribute("android:label"));
        application.put("icon", applicationElement.getAttribute("android:icon"));
        json.put("application", application);
        Log.d(TAG, "Application metadata extracted.");

        // Extract activities, services, receivers, providers
        JSONArray activities = extractComponentsWithDetails(document, "activity");
        json.put("activities", activities);
        Log.d(TAG, "Activities extracted: " + activities.length());

        JSONArray services = extractComponentsWithDetails(document, "service");
        json.put("services", services);
        Log.d(TAG, "Services extracted: " + services.length());

        JSONArray receivers = extractComponentsWithDetails(document, "receiver");
        json.put("receivers", receivers);
        Log.d(TAG, "Receivers extracted: " + receivers.length());

        JSONArray providers = extractComponentsWithDetails(document, "provider");
        json.put("providers", providers);
        Log.d(TAG, "Providers extracted: " + providers.length());

        // Extract permissions
        JSONArray permissions = new JSONArray();
        NodeList permissionNodes = document.getElementsByTagName("uses-permission");
        for (int i = 0; i < permissionNodes.getLength(); i++) {
            String permissionName = permissionNodes.item(i).getAttributes().getNamedItem("android:name").getNodeValue();
            permissions.put(permissionName);
        }
        json.put("permissions", permissions);
        Log.d(TAG, "Permissions extracted: " + permissions.length());

        // Extract required features
        JSONArray features = new JSONArray();
        NodeList featureNodes = document.getElementsByTagName("uses-feature");
        for (int i = 0; i < featureNodes.getLength(); i++) {
            String featureName = ((Element) featureNodes.item(i)).getAttribute("android:name");
            features.put(featureName);
        }
        json.put("features", features);
        Log.d(TAG, "Features extracted: " + features.length());

        Log.d(TAG, "AndroidManifest.xml parsed successfully.");
        return json;
    }

    // Helper method to extract components with intent filters and metadata
    private static JSONArray extractComponentsWithDetails(Document document, String tagName) {
        JSONArray components = new JSONArray();
        NodeList componentNodes = document.getElementsByTagName(tagName);
        for (int i = 0; i < componentNodes.getLength(); i++) {
            Element componentElement = (Element) componentNodes.item(i);
            JSONObject component = new JSONObject();
            String componentName = componentElement.getAttribute("android:name");
            try {
                component.put("name", componentName);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            JSONArray intentFilters = extractIntentFilters(componentElement);
            try {
                component.put("intentFilters", intentFilters);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            JSONObject metadata = extractMetadata(componentElement);
            try {
                component.put("metadata", metadata);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            components.put(component);
        }
        return components;
    }

    // Helper method to extract intent filters
    private static JSONArray extractIntentFilters(Element element) {
        JSONArray intentFilters = new JSONArray();
        NodeList filterNodes = element.getElementsByTagName("intent-filter");
        for (int i = 0; i < filterNodes.getLength(); i++) {
            Element filterElement = (Element) filterNodes.item(i);
            JSONObject intentFilter = new JSONObject();

            // Actions
            JSONArray actions = new JSONArray();
            NodeList actionNodes = filterElement.getElementsByTagName("action");
            for (int j = 0; j < actionNodes.getLength(); j++) {
                String action = actionNodes.item(j).getAttributes().getNamedItem("android:name").getNodeValue();
                actions.put(action);
            }
            try {
                intentFilter.put("actions", actions);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

            // Categories
            JSONArray categories = new JSONArray();
            NodeList categoryNodes = filterElement.getElementsByTagName("category");
            for (int j = 0; j < categoryNodes.getLength(); j++) {
                String category = categoryNodes.item(j).getAttributes().getNamedItem("android:name").getNodeValue();
                categories.put(category);
            }
            try {
                intentFilter.put("categories", categories);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

            // Data
            JSONArray data = new JSONArray();
            NodeList dataNodes = filterElement.getElementsByTagName("data");
            for (int j = 0; j < dataNodes.getLength(); j++) {
                JSONObject dataObject = new JSONObject();
                Node dataNode = dataNodes.item(j);
                if (dataNode.getAttributes().getNamedItem("android:scheme") != null) {
                    try {
                        dataObject.put("scheme", dataNode.getAttributes().getNamedItem("android:scheme").getNodeValue());
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (dataNode.getAttributes().getNamedItem("android:host") != null) {
                    try {
                        dataObject.put("host", dataNode.getAttributes().getNamedItem("android:host").getNodeValue());
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                data.put(dataObject);
            }
            try {
                intentFilter.put("data", data);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            intentFilters.put(intentFilter);
        }
        return intentFilters;
    }

    // Helper method to extract metadata
    private static JSONObject extractMetadata(Element element) {
        JSONObject metadata = new JSONObject();
        NodeList metaNodes = element.getElementsByTagName("meta-data");
        for (int i = 0; i < metaNodes.getLength(); i++) {
            Element metaElement = (Element) metaNodes.item(i);
            String key = metaElement.getAttribute("android:name");
            String value = metaElement.getAttribute("android:value");
            try {
                metadata.put(key, value);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return metadata;
    }

    // Step 3: Detect signing information
    public static JSONObject extractSigningInfo(Context context, String apkPath) throws Exception {
        Log.d(TAG, "Extracting signing information...");
        JSONObject signingInfo = new JSONObject();
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = packageManager.getPackageArchiveInfo(apkPath, PackageManager.GET_SIGNATURES);
        if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length > 0) {
            Signature signature = packageInfo.signatures[0];
            signingInfo.put("signer", signature.toCharsString());
            signingInfo.put("issuer", "N/A"); // Additional issuer details may require parsing the certificate manually
            Log.d(TAG, "Signing information extracted.");
        } else {
            Log.d(TAG, "No signing information found.");
        }
        return signingInfo;
    }

    // Step 4: Detect multidex
    public static boolean isMultidex(String apkPath) throws Exception {
        Log.d(TAG, "Checking for multidex...");
        try (ZipFile zipFile = new ZipFile(new File(apkPath))) {
            int dexCount = 0;
            for (ZipEntry entry : zipFile.stream().toArray(ZipEntry[]::new)) {
                if (entry.getName().startsWith("classes") && entry.getName().endsWith(".dex")) {
                    dexCount++;
                }
            }
            boolean isMultidex = dexCount > 1;
            Log.d(TAG, "Multidex detected: " + isMultidex);
            return isMultidex;
        }
    }

    // Step 5: Detect native libraries
    public static JSONArray detectLibraries(String apkPath) throws Exception {
        Log.d(TAG, "Detecting native libraries...");
        JSONArray libraries = new JSONArray();
        try (ZipFile zipFile = new ZipFile(new File(apkPath))) {
            for (ZipEntry entry : zipFile.stream().toArray(ZipEntry[]::new)) {
                if (entry.getName().startsWith("lib/")) {
                    libraries.put(entry.getName());
                }
            }
        }
        Log.d(TAG, "Native libraries detected: " + libraries.length());
        return libraries;
    }

    // Step 6: Save metadata to JSON
    public static void saveMetadataToJson(JSONObject metadata, String outputPath) throws Exception {
        Log.d(TAG, "Saving metadata to JSON file: " + outputPath);
        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(metadata.toString(4)); // Pretty-print JSON
        }
        Log.d(TAG, "Metadata saved successfully.");
    }

    // Main method to analyze the APK
    public static void analyzeApk(Context context, String apkPath, String outputJsonPath) {
        try {
            // Step 1: Decode AndroidManifest.xml
            Log.d(TAG, "Step 1: Decoding AndroidManifest.xml...");
            String decodedXml = decodeManifest(apkPath);

            // Step 2: Parse the decoded XML
            Log.d(TAG, "Step 2: Parsing AndroidManifest.xml...");
            JSONObject metadata = parseManifest(decodedXml);

            // Step 3: Extract signing information
            Log.d(TAG, "Step 3: Extracting signing information...");
            JSONObject signingInfo = extractSigningInfo(context, apkPath);
            metadata.put("signingInfo", signingInfo);

            // Step 4: Detect multidex
            Log.d(TAG, "Step 4: Detecting multidex...");
            boolean isMultidex = isMultidex(apkPath);
            metadata.put("isMultidex", isMultidex);

            // Step 5: Detect native libraries
            Log.d(TAG, "Step 5: Detecting native libraries...");
            JSONArray libraries = detectLibraries(apkPath);
            metadata.put("nativeLibraries", libraries);

            // Step 6: Add ABI compatibility check
            String deviceAbi = Build.SUPPORTED_ABIS[0]; // Primary ABI
            boolean isAbiCompatible = isAbiCompatible(libraries, deviceAbi);
            metadata.put("isAbiCompatible", isAbiCompatible);

            // Step 7: Add GPU information
            Log.d(TAG, "Step 6: Retrieving GPU information...");
            JSONObject gpuInfo = getGpuInfo();
            metadata.put("gpuInfo", gpuInfo);

            // Step 8: Add device information
            Log.d(TAG, "Step 7: Retrieving device information...");
            JSONObject deviceInfo = getDeviceInfo();
            metadata.put("deviceInfo", deviceInfo);

            // Step 9: Add file details
            Log.d(TAG, "Step 8: Retrieving file details...");
            JSONObject fileDetails = getFileDetails(apkPath);
            metadata.put("fileDetails", fileDetails);

            // Step 10: Add directory paths using SandboxManager
            Log.d(TAG, "Step 9: Adding directory paths...");
            SandboxManager sandboxManager = new SandboxManager(context);
            String packageName = extractPackageName(apkPath);
            String ownPackageName = context.getPackageName();
            JSONObject directories = new JSONObject();
            directories.put("externalStorageDir", sandboxManager.getScopedStorageDir(ownPackageName).getAbsolutePath());
            directories.put("appRunStorageDir", sandboxManager.getAppInteriorDir(packageName).getAbsolutePath());
            directories.put("internalDataDir", sandboxManager.getAppDataDir(packageName).getAbsolutePath());
            directories.put("appLibPath", sandboxManager.getAppInteriorDir(packageName).getAbsolutePath() + "/lib");
            directories.put("baseApkPath", sandboxManager.getAppInteriorDir(packageName).getAbsolutePath() + "/base.apk");
            metadata.put("directories", directories);

            // Step 11: Save metadata to JSON
            Log.d(TAG, "Step 10: Saving metadata to JSON...");
            saveMetadataToJson(metadata, outputJsonPath);

            Log.d(TAG, "APK analysis completed. Metadata saved to: " + outputJsonPath);
        } catch (Exception e) {
            Log.e(TAG, "Error during APK analysis: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static JSONObject getDeviceInfo() {
        JSONObject deviceInfo = new JSONObject();
        try {
            deviceInfo.put("cpuAbi", Build.CPU_ABI);
            deviceInfo.put("cpuAbi2", Build.CPU_ABI2);
            deviceInfo.put("supportedAbis", String.join(", ", Build.SUPPORTED_ABIS));
            deviceInfo.put("androidVersion", Build.VERSION.RELEASE);
            deviceInfo.put("sdkVersion", Build.VERSION.SDK_INT);
            deviceInfo.put("deviceModel", Build.MODEL);
            deviceInfo.put("manufacturer", Build.MANUFACTURER);
            deviceInfo.put("fingerprint", Build.FINGERPRINT);
        } catch (JSONException e) {
            Log.e(TAG, "Error creating device info JSON: " + e.getMessage());
        }
        return deviceInfo;
    }
    private static JSONObject getGpuInfo() {
        JSONObject gpuInfo = new JSONObject();
        try {
            String gpuVendor = android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_VENDOR);
            String gpuRenderer = android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_RENDERER);
            String gpuVersion = android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_VERSION);

            gpuInfo.put("gpuVendor", gpuVendor != null ? gpuVendor : "N/A");
            gpuInfo.put("gpuRenderer", gpuRenderer != null ? gpuRenderer : "N/A");
            gpuInfo.put("gpuVersion", gpuVersion != null ? gpuVersion : "N/A");
        } catch (Exception e) {
            Log.w(TAG, "Error retrieving GPU information: " + e.getMessage());
        }
        return gpuInfo;
    }
    private static boolean isAbiCompatible(JSONArray libraries, String deviceAbi) {
        if (libraries.length() == 0) {
            return true; // No native libraries -> compatible
        }
        for (int i = 0; i < libraries.length(); i++) {
            String libraryPath = libraries.optString(i);
            if (libraryPath.contains(deviceAbi)) {
                return true;
            }
        }
        return false;
    }
    private static JSONObject getFileDetails(String apkPath) throws Exception {
        JSONObject fileDetails = new JSONObject();
        File apkFile = new File(apkPath);

        // File size
        long fileSize = apkFile.length();
        fileDetails.put("fileSize", fileSize);

        // SHA-256 hash
        String sha256Hash = calculateSHA256(apkPath);
        fileDetails.put("sha256Hash", sha256Hash);

        return fileDetails;
    }

    private static String calculateSHA256(String filePath) throws Exception {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
        try (InputStream inputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                digest.update(buffer, 0, bytesRead);
            }
        }
        byte[] hashBytes = digest.digest();
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }
}