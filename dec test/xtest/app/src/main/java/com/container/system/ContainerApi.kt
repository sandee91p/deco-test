// File: app/src/main/java/com/container/ContainerApi.kt
package com.container

import android.content.Context
import android.util.Log
import com.container.system.core.ContainerEngine
import com.container.system.core.NativeHookManager
import java.io.File

object ContainerApi {
    private const val TAG = "ContainerApi"
    private var isInitialized = false

    fun initialize(context: Context) {
        if (isInitialized) return

        try {
            // 1. Load native library
            System.loadLibrary("container")

            // 2. Create container directories
            createContainerStructure(context)

            // 3. Initialize native hooks
            NativeHookManager.installHooks(context)

            // 4. Start core services
            ContainerEngine.start(context)

            isInitialized = true
            Log.i(TAG, "Container system initialized")

        } catch (e: Exception) {
            Log.e(TAG, "Initialization failed", e)
            throw RuntimeException("Container initialization failed", e)
        }
    }

    private fun createContainerStructure(context: Context) {
        val containerRoot = context.getDir("container", Context.MODE_PRIVATE)
        arrayOf(
            "virtual",      // Virtual app containers
            "libs",         // Native libraries
            "tmp",          // Temporary files
            "cache"         // Container cache
        ).forEach { dir ->
            File(containerRoot, dir).mkdirs()
        }
    }

    fun installApp(apkPath: String, packageName: String) {
        checkInitialized()
        ContainerEngine.installPackage(apkPath, packageName)
    }

    fun startApp(packageName: String) {
        checkInitialized()
        ContainerEngine.launch(packageName)
    }

    private fun checkInitialized() {
        if (!isInitialized) throw IllegalStateException("Container not initialized")
    }
}