// File: app/src/main/java/com/container/utils/AXMLResource.kt
package com.container.utils

import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream

class AXMLResource {

    private var packageName: String = ""
    private var versionCode: Int = 0
    private var versionName: String = ""
    private var permissions = mutableListOf<String>()
    private var activities = mutableListOf<String>()
    private var services = mutableListOf<String>()

    fun read(input: InputStream) {
        // TODO: Implement binary XML parsing logic
        // This will parse the AndroidManifest.xml from APK
    }

    fun write(output: OutputStream) {
        // TODO: Implement binary XML writing logic
        // This will generate a modified AndroidManifest.xml
    }

    fun print(out: PrintStream = System.out) {
        out.println("Package: $packageName")
        out.println("Version: $versionName ($versionCode)")
        out.println("Permissions: ${permissions.joinToString()}")
        out.println("Activities: ${activities.joinToString()}")
        out.println("Services: ${services.joinToString()}")
    }

    fun toPackageInfo(): PackageInfo {
        return PackageInfo().apply {
            this.packageName = this@AXMLResource.packageName
            this.versionCode = this@AXMLResource.versionCode
            this.versionName = this@AXMLResource.versionName
            this.permissions = this@AXMLResource.permissions.toTypedArray()
        }
    }
}