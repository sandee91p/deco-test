package lu.die.foza.SuperAPI;

import android.content.Context;
import lu.die.foza.SleepyFox.C0321;
import lu.die.fozacompatibility.FozaActivityManager;
import lu.die.fozacompatibility.FozaPackageManager;
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaCore.class */
public class FozaCore {
    public static Context getHostContext() {
        return C0321.m1885();
    }

    public static void startup(Context context) {
        FozaActivityManager.get().initialize(context);
    }

    public static void registerCoreCallback(IFozaCoreCallback iFozaCoreCallback) {
        FozaActivityManager.get().acquirePreloadNextProcess();
        new Thread(() -> {
            try {
                FozaPackageManager.get().waitForBackgroundScanner();
                iFozaCoreCallback.onPackageManagerReady();
            } catch (Exception unused) {
                iFozaCoreCallback.printStackTrace();
            }
        }).start();
    }
}
