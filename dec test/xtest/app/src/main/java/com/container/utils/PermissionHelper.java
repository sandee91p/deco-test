package com.container.utils;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.List;

public class PermissionHelper {
    private static final int REQUEST_OVERLAY_PERMISSION = 1234;
    private static final int REQUEST_MANAGE_FILES = 9012;
    private static final int REQUEST_BASIC_PERMISSIONS = 5678;
    private static final int REQUEST_QUERY_ALL_PACKAGES = 3456;
    private static final int REQUEST_INSTALL_PACKAGES = 7890;

    private final Context context;
    private final Activity activity;
    private final String[] BASIC_PERMISSIONS;

    public PermissionHelper(Activity activity) {
        this.context = activity;
        this.activity = activity;
        this.BASIC_PERMISSIONS = getRequiredPermissions();
        Log.d("PermissionHelper", "PermissionHelper initialized for Android " + Build.VERSION.SDK_INT);
    }

    private String[] getRequiredPermissions() {
        List<String> permissions = new ArrayList<>();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            permissions.add(Manifest.permission.READ_MEDIA_IMAGES);
//            permissions.add(Manifest.permission.READ_MEDIA_VIDEO);
//            permissions.add(Manifest.permission.READ_MEDIA_AUDIO);
            permissions.add(Manifest.permission.POST_NOTIFICATIONS);
        } else {
            permissions.add(Manifest.permission.READ_EXTERNAL_STORAGE);
            permissions.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }

        permissions.add(Manifest.permission.REQUEST_INSTALL_PACKAGES);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            permissions.add(Manifest.permission.QUERY_ALL_PACKAGES);
        }

        return permissions.toArray(new String[0]);
    }

    public boolean hasAllPermissions() {
        boolean overlay = hasOverlayPermission();
        boolean file = hasFilePermission();
        boolean basic = hasBasicPermissions();
        boolean install = hasInstallPermission();

        Log.d("PermissionHelper", "Permission Status - Overlay: " + overlay +
                ", File: " + file +
                ", Basic: " + basic +
                ", Install: " + install);

        return overlay && file && basic && install;
    }

    private boolean hasBasicPermissions() {
        for (String permission : BASIC_PERMISSIONS) {
            if (!permission.equals(Manifest.permission.REQUEST_INSTALL_PACKAGES)) {
                boolean granted = ContextCompat.checkSelfPermission(context, permission)
                        == PackageManager.PERMISSION_GRANTED;
                Log.d("PermissionHelper", "Permission check: " + permission + " = " + granted);
                if (!granted) return false;
            }
        }
        return true;
    }

    private boolean hasInstallPermission() {
        boolean granted = context.getPackageManager().canRequestPackageInstalls();
        Log.d("PermissionHelper", "Install permission check: " + granted);
        return granted;
    }

    public void requestAllPermissions() {
        if (!hasOverlayPermission()) {
            requestOverlayPermission();
            return;
        }
        if (!hasFilePermission()) {
            requestFilePermission();
            return;
        }
        if (!hasInstallPermission()) {
            requestInstallPermission();
            return;
        }
        if (!hasBasicPermissions()) {
            requestBasicPermissions();
        }
    }

    private void requestBasicPermissions() {
        List<String> pendingPermissions = new ArrayList<>();
        for (String permission : BASIC_PERMISSIONS) {
            if (!permission.equals(Manifest.permission.REQUEST_INSTALL_PACKAGES) &&
                    ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                pendingPermissions.add(permission);
            }
        }

        if (!pendingPermissions.isEmpty()) {
            ActivityCompat.requestPermissions(activity,
                    pendingPermissions.toArray(new String[0]),
                    REQUEST_BASIC_PERMISSIONS);
        }
    }

    public boolean hasOverlayPermission() {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M || Settings.canDrawOverlays(context);
    }

    public void requestOverlayPermission() {
        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:" + context.getPackageName()));
        activity.startActivityForResult(intent, REQUEST_OVERLAY_PERMISSION);
    }

    public boolean hasFilePermission() {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.R || Environment.isExternalStorageManager();
    }

    public void requestFilePermission() {
        Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        activity.startActivityForResult(intent, REQUEST_MANAGE_FILES);
    }

    private void requestInstallPermission() {
        Intent intent = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES);
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        activity.startActivityForResult(intent, REQUEST_INSTALL_PACKAGES);
    }

    public void onActivityResult(int requestCode, int resultCode) {
        Log.d("PermissionHelper", "Permission result - Request: " + requestCode + ", Result: " + resultCode);

        switch (requestCode) {
            case REQUEST_OVERLAY_PERMISSION:
                if (!hasOverlayPermission()) {
                    showToast("Overlay permission required");
                    return;
                }
                break;

            case REQUEST_MANAGE_FILES:
                if (!hasFilePermission()) {
                    showToast("Storage permission required");
                    return;
                }
                break;

            case REQUEST_INSTALL_PACKAGES:
                if (!hasInstallPermission()) {
                    showToast("Install permission required");
                    return;
                }
                break;
        }

        if (!hasAllPermissions()) {
            requestAllPermissions();
        }
    }

    private void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        Log.d("PermissionHelper", "Toast shown: " + message);
    }
}
