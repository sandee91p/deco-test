package lu.die.fozacompatibility;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import lu.die.foza.SleepyFox.C0045;
import lu.die.foza.SleepyFox.C0209;
import lu.die.foza.SleepyFox.C0245;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.C0310;
import lu.die.foza.SleepyFox.C0338;
import lu.die.foza.SuperAPI.FozaSplashLauncher;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaActivityManager.class */
public class FozaActivityManager {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final FozaActivityManager f1103 = new FozaActivityManager();

    public static FozaActivityManager get() {
        return f1103;
    }

    public void launchActivityExistingAppProcess(String str) {
        C0209.m1150().getClass();
        launchActivityExistingAppProcess(str, C0281.C0289.m1746());
    }

    public void initialize(Context context) {
        C0310.m1848(context);
    }

    public boolean isInnerPackageInstalled(String str) {
        return C0245.m1421().m1444(str);
    }

    public boolean isAppRunning(String str) {
        C0209.m1150().getClass();
        return isAppRunning(str, C0281.C0289.m1746());
    }

    public void launchExistingApp(String str, String str2) {
        C0209.m1150().m1148(str, str2, false);
    }

    public void killAllApps() {
        C0209.m1150().m1157();
    }

    public void launchApp(int i, String str) {
        launchApp(String.valueOf(i), str);
    }

    public Intent obtainSplashLaunchIntent(int i, String str, Context context) {
        return obtainSplashLaunchIntent(String.valueOf(i), str, context);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, lu.die.foza.SleepyFox.ˉ] */
    public void factoryReset() {
        ?? r0;
        try {
            r0 = C0045.f123;
            r0.m425();
        } catch (Exception unused) {
            r0.printStackTrace();
        }
    }

    public void launchIntent(Intent intent) {
        C0209.m1150().getClass();
        launchIntent(intent, C0281.C0289.m1746());
    }

    public int broadcastIntentAsUser(Intent intent, int i) {
        return broadcastIntentAsUser(intent, String.valueOf(i));
    }

    public String getPackageByPid(int i) {
        return C0209.m1150().m1177(i);
    }

    public void killAppByPkg(int i, String str) {
        killAppByPkg(String.valueOf(i), str);
    }

    public void setUserName(String str) {
        C0209.m1150().m1181(str);
    }

    public void acquirePreloadNextProcess() {
        C0209.m1150().m1182();
    }

    public List<ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(String str) {
        C0209.m1150().getClass();
        return getRunningProcessInfo(str, C0281.C0289.m1746());
    }

    public Intent obtainSplashLaunchIntent(String str, Context context) {
        C0209.m1150().getClass();
        return obtainSplashLaunchIntent(C0281.C0289.m1746(), str, context);
    }

    public void launchApp(String str) {
        C0209.m1150().getClass();
        launchApp(C0281.C0289.m1746(), str);
    }

    public void killAppByPkg(String str) {
        C0209.m1150().m1165(str, null);
    }

    public int broadcastIntentAsUser(Intent intent, String str) {
        return C0209.m1150().m1173(intent, str);
    }

    public void launchActivityExistingAppProcess(String str, String str2) {
        C0209.m1150().m1148(str, str2, true);
    }

    public boolean isAppRunning(String str, int i) {
        return isAppRunning(str, String.valueOf(i));
    }

    public void launchIntent(Intent intent, int i) {
        launchIntent(intent, String.valueOf(i));
    }

    public void killAppByPkg(String str, String str2) {
        C0209.m1150().m1165(str2, str);
    }

    public List<ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(String str, String str2) {
        return C0209.m1150().m1183(C0338.m2078(str, str2));
    }

    public boolean isAppRunning(String str, String str2) {
        return C0209.m1150().m1147(str, str2, 0);
    }

    public void launchApp(String str, String str2) {
        C0209.m1150().m1147(str2, str, 2);
    }

    public Intent obtainSplashLaunchIntent(String str, String str2, Context context) {
        if (!FozaPackageManager.get().isAppSplashExists(str2)) {
            launchApp(str, str2);
            return null;
        } else if (C0209.m1150().m1147(str2, str, 1)) {
            return null;
        } else {
            Intent intent = new Intent(context, FozaSplashLauncher.class);
            intent.putExtra(C0281.C0282.f598, str2);
            intent.putExtra(C0281.C0282.f600, str);
            intent.putExtra(C0281.C0282.f599, false);
            return intent;
        }
    }

    public void launchIntent(Intent intent, String str) {
        C0209.m1150().m1159(intent, str);
    }
}
