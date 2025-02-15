package me.test.contener.helper;

import android.content.Context;
import org.json.JSONArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class SandboxManager {
    private Context context;

    public SandboxManager(Context context) {
        this.context = context;
    }

    // Directory structure for the app interior (where APK and libraries are stored)
    public File getAppInteriorDir(String apkPackageName) {
        return new File(context.getFilesDir(), "app_interior/" + apkPackageName);
    }

    // Directory structure for app data
    public File getAppDataDir(String apkPackageName) {
        return new File(context.getFilesDir(), "app_data/" + apkPackageName);
    }

    // Scoped storage directory for Android/obb and Android/data
    public File getScopedStorageDir(String ownPackageName) {
        return new File(context.getExternalFilesDir(null), "Android/obb/" + ownPackageName + "/scopedStorage");
    }

    // Directory for OBB files
    public File getObbDir(String ownPackageName, String apkPackageName) {
        return new File(getScopedStorageDir(ownPackageName), "Android/obb/" + apkPackageName);
    }

    // Directory for app-specific data
    public File getDataDir(String ownPackageName, String apkPackageName) {
        return new File(getScopedStorageDir(ownPackageName), "Android/data/" + apkPackageName);
    }

    // Directory for media files
    public File getMediaDir(String ownPackageName, String apkPackageName) {
        return new File(getScopedStorageDir(ownPackageName), "Android/media/" + apkPackageName);
    }

    // Set up all necessary directories
    public void setupDirectories(String apkPackageName, String ownPackageName) {
        getAppInteriorDir(apkPackageName).mkdirs();
        getAppDataDir(apkPackageName).mkdirs();
        getObbDir(ownPackageName, apkPackageName).mkdirs();
        getDataDir(ownPackageName, apkPackageName).mkdirs();
        getMediaDir(ownPackageName, apkPackageName).mkdirs();
    }

    // Copy APK and native libraries to the app interior directory
    public void copyApkAndLibraries(File apkFile, String apkPackageName) throws IOException {
        File appInteriorDir = getAppInteriorDir(apkPackageName);
        File destApkFile = new File(appInteriorDir, "base.apk");
        copyFile(apkFile, destApkFile);

        JSONArray libraries = null;
        try {
            libraries = ApkManager.detectLibraries(apkFile.getAbsolutePath());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File libDir = new File(appInteriorDir, "lib");
        libDir.mkdirs();

        try (ZipFile zipFile = new ZipFile(apkFile)) {
            for (int i = 0; i < libraries.length(); i++) {
                String libraryPath = libraries.optString(i);
                if (libraryPath == null || libraryPath.isEmpty()) continue;

                ZipEntry libraryEntry = zipFile.getEntry(libraryPath);
                if (libraryEntry != null) {
                    File destLibrary = new File(libDir, libraryPath.substring(libraryPath.lastIndexOf("/") + 1));
                    try (InputStream inputStream = zipFile.getInputStream(libraryEntry);
                         FileOutputStream outputStream = new FileOutputStream(destLibrary)) {
                        byte[] buffer = new byte[1024];
                        int read;
                        while ((read = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, read);
                        }
                    }
                }
            }
        }

        String abiFolderName = determineAbiFolder(libraries);
        if (abiFolderName == null) {
            throw new RuntimeException("No compatible ABI found for the device.");
        }

        File abiFolder = new File(libDir, abiFolderName);
        abiFolder.mkdirs();
        createSymlinks(libDir, abiFolder, libraries);
    }

    // Determine the ABI folder name (e.g., "arm64" or "arm")
    private String determineAbiFolder(JSONArray libraries) {
        for (int i = 0; i < libraries.length(); i++) {
            String libraryPath = libraries.optString(i);
            if (libraryPath.contains("armeabi-v7a")) {
                return "arm";
            } else if (libraryPath.contains("arm64-v8a")) {
                return "arm64";
            }
        }
        return null;
    }

    // Create symbolic links for libraries
    private void createSymlinks(File libDir, File abiFolder, JSONArray libraries) throws IOException {
        Path abiSymlink = Paths.get(libDir.getAbsolutePath(), "arm64");
        if (!Files.exists(abiSymlink)) {
            Files.createSymbolicLink(abiSymlink, abiFolder.toPath());
        }

        File firstLevelArm64Dir = new File(libDir, "arm64");
        firstLevelArm64Dir.mkdirs();

        for (int i = 0; i < libraries.length(); i++) {
            String libraryName = libraries.optString(i);
            if (libraryName == null || libraryName.isEmpty()) continue;

            libraryName = libraryName.substring(libraryName.lastIndexOf("/") + 1);
            File libraryInFirstLevelArm64 = new File(firstLevelArm64Dir, libraryName);
            File libraryInLibDir = new File(libDir, libraryName);

            Path librarySymlink = Paths.get(libraryInFirstLevelArm64.getAbsolutePath());
            if (!Files.exists(librarySymlink)) {
                Files.createSymbolicLink(librarySymlink, libraryInLibDir.toPath());
            }
        }

        File currentArm64Dir = firstLevelArm64Dir;
        for (int i = 0; i < 36; i++) {
            File nextArm64Dir = new File(currentArm64Dir, "arm64");
            nextArm64Dir.mkdirs();

            for (int j = 0; j < libraries.length(); j++) {
                String libraryName = libraries.optString(j);
                if (libraryName == null || libraryName.isEmpty()) continue;

                libraryName = libraryName.substring(libraryName.lastIndexOf("/") + 1);
                File libraryInAbiFolder = new File(nextArm64Dir, libraryName);
                File libraryInLibDir = new File(libDir, libraryName);

                String relativePath = calculateRelativePath(nextArm64Dir, libDir);
                Path librarySymlink = Paths.get(libraryInAbiFolder.getAbsolutePath());

                if (!Files.exists(librarySymlink)) {
                    Files.createSymbolicLink(librarySymlink, Paths.get(relativePath, libraryName));
                }
            }
            currentArm64Dir = nextArm64Dir;
        }
    }

    // Calculate relative path between two directories
    private String calculateRelativePath(File fromDir, File toDir) {
        Path fromPath = fromDir.toPath();
        Path toPath = toDir.toPath();
        return toPath.relativize(fromPath).toString();
    }

    // Generate metadata JSON file
    public void generateMetadataJson(String apkPath, String apkPackageName, String outputJsonPath) {
        ApkManager.analyzeApk(context, apkPath, outputJsonPath);
    }

    // Helper method to copy a file
    private void copyFile(File source, File destination) throws IOException {
        try (InputStream in = new java.io.FileInputStream(source);
             FileOutputStream out = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
        }
    }
}