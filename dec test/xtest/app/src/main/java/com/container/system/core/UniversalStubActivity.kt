// File: app/src/main/java/com/container/system/core/UniversalStubActivity.kt
package com.container.system.core

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.container.ContainerApi

class UniversalStubActivity : Activity() {
    private val TAG = "UniversalStub"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            // 1. Get target package from intent
            val targetPackage = parseTargetPackage(intent)

            // 2. Initialize container if needed
            if (!ContainerApi.isInitialized) {
                ContainerApi.initialize(applicationContext)
            }

            // 3. Start target application
            ContainerApi.startApp(targetPackage)

            // 4. Close proxy activity
            finish()

        } catch (e: Exception) {
            Log.e(TAG, "Failed to launch app", e)
            finishAndRemoveTask()
        }
    }

    private fun parseTargetPackage(intent: Intent?): String {
        return intent?.getStringExtra("target_pkg")
            ?: throw IllegalArgumentException("No target package specified")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Clean up temporary resources
        ContainerEngine.cleanTempFiles()
    }
}