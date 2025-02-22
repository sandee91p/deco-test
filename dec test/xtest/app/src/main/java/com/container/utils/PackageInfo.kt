// File: app/src/main/java/com/container/utils/PackageInfo.kt
package com.container.utils

data class PackageInfo(
    var packageName: String = "",
    var versionCode: Int = 0,
    var versionName: String = "",
    var permissions: Array<String> = emptyArray(),
    var activities: Array<String> = emptyArray(),
    var services: Array<String> = emptyArray()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PackageInfo

        if (packageName != other.packageName) return false
        if (versionCode != other.versionCode) return false
        if (versionName != other.versionName) return false
        if (!permissions.contentEquals(other.permissions)) return false
        if (!activities.contentEquals(other.activities)) return false
        if (!services.contentEquals(other.services)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = packageName.hashCode()
        result = 31 * result + versionCode
        result = 31 * result + versionName.hashCode()
        result = 31 * result + permissions.contentHashCode()
        result = 31 * result + activities.contentHashCode()
        result = 31 * result + services.contentHashCode()
        return result
    }
}