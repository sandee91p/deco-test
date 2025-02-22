// File: app/src/main/java/com/container/system/core/BinderHookManager.kt
package com.container.system.core

import android.os.IBinder
import android.os.Parcel
import android.util.Log
import com.container.system.utils.ReflectionUtils

object BinderHookManager {
    private const val TAG = "BinderHook"
    private const val PACKAGE_MANAGER_SERVICE = "package"

    fun installHooks() {
        try {
            val packageManagerStub = PackageManagerHook()
            replaceBinderService(PACKAGE_MANAGER_SERVICE, packageManagerStub)
            Log.i(TAG, "Binder hooks installed")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to install binder hooks", e)
        }
    }

    private fun replaceBinderService(name: String, stub: IBinder) {
        val serviceManager = Class.forName("android.os.ServiceManager")
        val method = serviceManager.getDeclaredMethod("addService", String::class.java, IBinder::class.java)
        method.invoke(null, name, stub)
    }

    private class PackageManagerHook : IBinder {
        override fun transact(code: Int, data: Parcel, reply: Parcel?, flags: Int): Boolean {
            when (code) {
                1 -> { // TRANSACTION_getPackageInfo
                    val pkgName = data.readString()
                    val fakeInfo = ContainerEngine.getPackageInfo(pkgName)
                    reply?.writeParcelable(fakeInfo, 0)
                    return true
                }
            }
            return false
        }
        // Other required IBinder methods
    }
}