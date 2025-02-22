// File: app/src/main/java/com/container/system/core/NativeHookManager.kt
package com.container.system.core

import android.content.Context
import android.util.Log

object NativeHookManager {
    private const val TAG = "NativeHooks"

    init {
        System.loadLibrary("container")
    }

    external fun installHooks(context: Context)

    external fun redirectPath(original: String, packageName: String): String

    external fun cleanupHooks()
}