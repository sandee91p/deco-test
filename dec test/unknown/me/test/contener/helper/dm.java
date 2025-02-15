package me.test.contener.helper;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;
import java.io.File;
import java.io.FileOutputStream;

public class DeviceManager {
    private static final String TAG = "DeviceManager";

    public static void logDeviceInfo(Context context) {
        try {
            JSONObject deviceInfo = new JSONObject();

            // CPU Information
            deviceInfo.put("cpu_abi", Build.CPU_ABI);
            deviceInfo.put("cpu_abi2", Build.CPU_ABI2);
            deviceInfo.put("supported_abis", String.join(", ", Build.SUPPORTED_ABIS));
            deviceInfo.put("supported_32_bit_abis", String.join(", ", Build.SUPPORTED_32_BIT_ABIS));
            deviceInfo.put("supported_64_bit_abis", String.join(", ", Build.SUPPORTED_64_BIT_ABIS));

            // Board and Hardware Information
            deviceInfo.put("board", Build.BOARD);
            deviceInfo.put("bootloader", Build.BOOTLOADER);
            deviceInfo.put("hardware", Build.HARDWARE);
            deviceInfo.put("host", Build.HOST);

            // Build Information
            deviceInfo.put("id", Build.ID);
            deviceInfo.put("display", Build.DISPLAY);
            deviceInfo.put("fingerprint", Build.FINGERPRINT);
            deviceInfo.put("serial", Build.SERIAL);
            deviceInfo.put("tags", Build.TAGS);
            deviceInfo.put("type", Build.TYPE);
            deviceInfo.put("user", Build.USER);

            // Brand, Device, and Model Information
            deviceInfo.put("brand", Build.BRAND);
            deviceInfo.put("device", Build.DEVICE);
            deviceInfo.put("model", Build.MODEL);
            deviceInfo.put("product", Build.PRODUCT);
            deviceInfo.put("manufacturer", Build.MANUFACTURER);

            // Android Version Information
            deviceInfo.put("android_version", Build.VERSION.RELEASE);
            deviceInfo.put("sdk_version", Build.VERSION.SDK_INT);

            // GPU Information (Optional)
            try {
                String gpuVendor = getGpuVendor();
                String gpuRenderer = getGpuRenderer();
                String gpuVersion = getGpuVersion();

                deviceInfo.put("gpu_vendor", gpuVendor);
                deviceInfo.put("gpu_renderer", gpuRenderer);
                deviceInfo.put("gpu_version", gpuVersion);
            } catch (Exception e) {
                Log.w(TAG, "GPU information not available: " + e.getMessage());
                deviceInfo.put("gpu_vendor", "N/A");
                deviceInfo.put("gpu_renderer", "N/A");
                deviceInfo.put("gpu_version", "N/A");
            }

            // Kernel Version
            String kernelVersion = System.getProperty("os.version");
            deviceInfo.put("kernel_version", kernelVersion != null ? kernelVersion : "N/A");

            // Save device info to a JSON file
            File deviceInfoFile = new File(context.getFilesDir(), "device_info.json");
            try (FileOutputStream fos = new FileOutputStream(deviceInfoFile)) {
                fos.write(deviceInfo.toString(4).getBytes());
            }

            Log.d(TAG, "Device info saved to: " + deviceInfoFile.getAbsolutePath());
        } catch (Exception e) {
            Log.e(TAG, "Error logging device info: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Helper method to retrieve GPU vendor.
     */
    private static String getGpuVendor() {
        return android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_VENDOR);
    }

    /**
     * Helper method to retrieve GPU renderer.
     */
    private static String getGpuRenderer() {
        return android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_RENDERER);
    }

    /**
     * Helper method to retrieve GPU version.
     */
    private static String getGpuVersion() {
        return android.opengl.GLES20.glGetString(android.opengl.GLES20.GL_VERSION);
    }
}