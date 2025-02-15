package me.test.contener;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;

public class MainActivity extends Activity {

    private String vpkg = "";
    private LinearLayout linear1;
    private EditText editVPkg;
    private Button buttonSet;
    private ScrollView vscrollx;
    private LinearLayout linear2;
    private TextView textviewLog; // Ensure this is properly initialized
    private SharedPreferences Spre;
    private static final int PERMISSION_REQUEST_CODE = 100;
    private static final int MANAGE_EXTERNAL_STORAGE_REQUEST_CODE = 200;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        hideSystemUI();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Enable edge-to-edge mode for Android 10+
            getWindow().setNavigationBarContrastEnforced(false);
        }

        setContentView(R.layout.activity_main_contener); // Ensure this matches your XML layout file

        // Request necessary permissions
        requestPermissions();

        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = findViewById(R.id.linear1);
        editVPkg = findViewById(R.id.editVPkg);
        buttonSet = findViewById(R.id.buttonSet);
        vscrollx = findViewById(R.id.vscrollx);
        linear2 = findViewById(R.id.linear2);
        textviewLog = findViewById(R.id.textviewLog); // Ensure this matches the ID in XML

        // Debugging: Check if textviewLog is null
        if (textviewLog == null) {
            Log.e("MainActivity", "textviewLog is null! Check your XML layout.");
        }

        Spre = getSharedPreferences("Spre", Activity.MODE_PRIVATE);

        buttonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                vpkg = editVPkg.getText().toString().trim();
                if (vpkg.isEmpty()) {
                    showMessage("Package name cannot be empty.");
                } else if (!isValidPackageName(vpkg)) {
                    showMessage("Invalid package name format.");
                } else {
                    Spre.edit().putString("vpkg", vpkg).apply();
                    logMessage("Package name set: " + vpkg);
                }
            }
        });

        buttonSet.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _view) {
                editVPkg.setText("");
                Spre.edit().remove("vpkg").apply();
                logMessage("Package name cleared.");
                return true;
            }
        });
    }

    private void initializeLogic() {
        vpkg = "com.my.testv1";
        if (Spre.contains("vpkg")) {
            vpkg = Spre.getString("vpkg", "").trim();
            editVPkg.setText(vpkg);
        } else {
            showMessage("Please enter you   r package name to proceed...");
        }
    }

    private boolean isValidPackageName(String pkgName) {
        String pattern = "^[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)+$";

        // Check if the package name matches the valid format
        if (pkgName.matches(pattern)) {
            try {
                PackageManager packageManager = getPackageManager();
                ApplicationInfo appInfo = packageManager.getApplicationInfo(pkgName, 0);

                // Get the native library directory of the installed app
                String nativeLibraryDir = appInfo.nativeLibraryDir;
                File libDir = new File(nativeLibraryDir);

                // Check if the app has native libraries
                if (!libDir.exists() || !libDir.isDirectory()) {
                    logMessage("Package is installed but has no native libraries: " + pkgName);
                    return true; // No native libraries, so ABI doesn't matter
                }

                // List .so files in the native library directory
                File[] soFiles = libDir.listFiles((dir, name) -> name.endsWith(".so"));
                if (soFiles == null || soFiles.length == 0) {
                    logMessage("Package is installed but has no native libraries: " + pkgName);
                    return true; // No native libraries, so ABI doesn't matter
                }

                // Determine the ABI of the installed app
                String installedAppABI = extractABIFromPath(nativeLibraryDir);
                logMessage("Installed app ABI: " + installedAppABI);

                // Get the ABI of the host app (your app)
                String hostAppABI = Build.SUPPORTED_ABIS[0]; // Primary ABI of the host app
                logMessage("Host app ABI: " + hostAppABI);

                // Compare ABIs
                if (installedAppABI.equals(hostAppABI)) {
                    logMessage("ABI match: Installed app ABI matches host app ABI.");
                    return true; // ABI matches
                } else {
                    logMessage("ABI mismatch: Installed app ABI does not match host app ABI.");
                    showMessage("Please install the correct version of the host app (ABI: " + installedAppABI + ").");
                    return false; // ABI mismatch
                }
            } catch (PackageManager.NameNotFoundException e) {
                logMessage("Package is not installed: " + pkgName);
                return false; // Package is valid but not installed
            }
        }
        logMessage("Invalid package name format: " + pkgName);
        return false; // Package name format is invalid
    }

    // Helper method to extract ABI from the nativeLibraryDir path
    private String extractABIFromPath(String nativeLibraryDir) {
        // Example path: /data/app/<package-name>/lib/arm64
        String[] parts = nativeLibraryDir.split("/");
        if (parts.length > 0) {
            String lastPart = parts[parts.length - 1];
            if (lastPart.equals("arm64") || lastPart.equals("armeabi-v7a") || lastPart.equals("x86") || lastPart.equals("x86_64")) {
                return lastPart;
            }
        }
        return "unknown"; // Default if ABI cannot be determined
    }

    private void logMessage(String message) {
        if (textviewLog != null) { // Ensure textviewLog is not null
            String currentLog = textviewLog.getText().toString();
            textviewLog.setText(currentLog + "\n" + message);
        } else {
            Log.e("MainActivity", "textviewLog is null! Cannot log message: " + message);
        }
    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void hideSystemUI() {
        // Use immersive sticky mode for Android 4.4 and above
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // Hide navigation bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN      // Hide status bar
        );
    }

    private void requestPermissions() {
        // Check and request storage permissions
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // For Android 11+ (Scoped Storage)
            if (!Environment.isExternalStorageManager()) {
                try {
                    // Open the "Manage All Files Access" settings
                    Intent intent = new Intent(Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
                    Uri uri = Uri.fromParts("package", getPackageName(), null);
                    intent.setData(uri);
                    startActivityForResult(intent, MANAGE_EXTERNAL_STORAGE_REQUEST_CODE);
                } catch (Exception e) {
                    e.printStackTrace();
                    logMessage("Failed to open Manage All Files Access settings.");
                }
            }
        } else {
            // For Android 10 and below
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE},
                        PERMISSION_REQUEST_CODE);
            }
        }

        // Request notification permission for Android 13+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.POST_NOTIFICATIONS},
                        PERMISSION_REQUEST_CODE);
            }
        }
    }

    private boolean hasUnknownSourcesPermission() {
        return getPackageManager().canRequestPackageInstalls();
    }

    private void openUnknownSourcesSettings() {
        try {
            Intent intent = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES);
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, 300); // Use a unique request code
        } catch (Exception e) {
            e.printStackTrace();
            logMessage("Failed to open Unknown Sources settings.");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MANAGE_EXTERNAL_STORAGE_REQUEST_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                if (Environment.isExternalStorageManager()) {
                    logMessage("All files access granted.");

                    // Check if the app already has the MANAGE_UNKNOWN_APP_SOURCES permission
                    if (!hasUnknownSourcesPermission()) {
                        logMessage("Redirecting to unknown sources settings...");
                        openUnknownSourcesSettings();
                    } else {
                        logMessage("Unknown sources permission already granted.");
                    }
                } else {
                    logMessage("All files access denied.");
                }
            }
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI(); // Reapply full-screen mode
        }
    }
}