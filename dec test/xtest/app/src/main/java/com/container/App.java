package com.container;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class App extends Application {
    private static final String TAG = "App";
    private static App instance = null;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        try {
           // ContainerApi.get().doCreate();
            Log.i(TAG, "BlackBoxCore initialized successfully");
        } catch (Exception e) {
            Log.e(TAG, "Failed to create BlackBoxCore", e);
            Toast.makeText(this, "Failed to initialize virtualization engine", Toast.LENGTH_LONG).show();
        }
    }
}