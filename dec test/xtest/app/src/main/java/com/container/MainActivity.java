package com.container;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.container.system.R;
import com.container.utils.PermissionHelper;
import com.container.utils.PrefsHelper;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPkg;
    private Button clone,install,start,stop,uninstall;
    private TextView Status,systemLog;
    private PrefsHelper prefsHelper;
    private PermissionHelper permissionHelper;

    private static final int REQUEST_BASIC_PERMISSIONS = 5678;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize PermissionHelper
        permissionHelper = new PermissionHelper(this);
        prefsHelper = new PrefsHelper(this);

        setupUI();
        checkAndRequestPermissions();
    }

    private void checkAndRequestPermissions() {
        if (!permissionHelper.hasAllPermissions()) {
            permissionHelper.requestAllPermissions();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        permissionHelper.onActivityResult(requestCode, resultCode);
        if (permissionHelper.hasAllPermissions()) {
        } else {
            Log.d("PermissionRequest", "Permissions still missing after activity result");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_BASIC_PERMISSIONS) {
            if (permissionHelper.hasAllPermissions()) {
                Log.d("PermissionRequest", "All permissions granted after permission request");
            } else {
                showiPermissionError();
            }
        }
    }

    private void showiPermissionError() {
        new AlertDialog.Builder(this)
                .setTitle("Permissions Required")
                .setMessage("This app requires certain permissions to function properly. " +
                        "Please grant all required permissions.")
                .setPositiveButton("Grant Permissions", (dialog, which) -> {
                    checkAndRequestPermissions();
                })
                .setNegativeButton("Cancel", (dialog, which) ->
                        Log.d("PermissionRequest", "User  cancelled permission request"))
                .show();
    }

    private void setupUI() {
        initializeViews();
    }

    private void initializeViews() {
        Status = findViewById(R.id.Status);
        systemLog = findViewById(R.id.systemLog);
        editTextPkg = findViewById(R.id.editTextPkg);
        clone = findViewById(R.id.clone);
        install = findViewById(R.id.install);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);
        uninstall = findViewById(R.id.uninstall);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
            new Handler().postDelayed(() -> {
                // Kill the app process
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }, 100);
    }
}
