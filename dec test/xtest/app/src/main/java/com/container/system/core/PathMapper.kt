// File: app/src/main/java/com/container/system/core/PathMapper.kt
package com.container.system.core

import android.os.Build
import android.os.Environment
import java.io.File

object PathMapper {

    fun mapPath(originalPath: String, packageName: String): String {
        return when {
            originalPath.startsWith("/data/data/") -> 
                handleDataPath(originalPath, packageName)
            
            originalPath.contains("/sdcard/") ->
                handleSdcardPath(originalPath, packageName)
            
            else -> originalPath
        }
    }

    private fun handleDataPath(path: String, pkg: String): String {
        val containerRoot = File(
            Environment.getDataDirectory(), 
            "user/0/${ContainerApi.HOST_PACKAGE}/virtual/$pkg"
        )
        return path.replace("/data/data/$pkg", containerRoot.absolutePath)
    }

    private fun handleSdcardPath(path: String, pkg: String): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Use MediaStore for Android 10+
            "content://${ContainerApi.HOST_PACKAGE}.provider/virtual/$pkg/${File(path).name}"
        } else {
            File(
                Environment.getExternalStorageDirectory(),
                "Android/data/${ContainerApi.HOST_PACKAGE}/virtual/$pkg"
            ).absolutePath
        }
    }
}