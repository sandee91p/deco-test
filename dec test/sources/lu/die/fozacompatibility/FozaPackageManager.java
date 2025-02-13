package lu.die.fozacompatibility;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lu.die.foza.SleepyFox.C0245;
import lu.die.foza.SleepyFox.C0303;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaPackageManager.class */
public class FozaPackageManager {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final FozaPackageManager f1107 = new FozaPackageManager();

    public static FozaPackageManager get() {
        return f1107;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m2490(String str) {
        char charAt;
        int length = str.length();
        do {
            int i = length - 1;
            length = i;
            if (i < 0) {
                return true;
            }
            charAt = str.charAt(length);
            if (charAt < '0') {
                return false;
            }
        } while (charAt <= '9');
        return false;
    }

    public List<PackageInfo> getInstalledInnerApps() {
        return C0245.m1421().m1440();
    }

    public boolean isAppInstalledAsInternal(String str) {
        return C0245.m1421().m1446(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.io.File] */
    public File getAppExternalDirLocked(String str) {
        ?? m1826;
        try {
            m1826 = C0303.m1826(str);
            return m1826;
        } catch (Exception unused) {
            m1826.printStackTrace();
            return null;
        }
    }

    public ActivityInfo resolveIntentActivity(Intent intent) {
        return C0245.m1421().m1425(intent);
    }

    public boolean isInnerAppInstalled(String str) {
        return C0245.m1421().m1444(str);
    }

    public void waitForBackgroundScanner() {
        C0245.m1421().m1441();
    }

    public String uninstallAppFully(String str) {
        return C0245.m1421().m1442(str);
    }

    public PackageInfo getPackageInfo(String str) {
        return C0245.m1421().m1430(str, 0);
    }

    public ApplicationInfo getApplicationInfo(String str) {
        return C0245.m1421().m1433(str, 0);
    }

    public ActivityInfo getReceiverInfo(ComponentName componentName) {
        return C0245.m1421().m1435(componentName, 0);
    }

    public void acquireObtainAppSplash() {
        C0245.m1421().m1466();
    }

    public void acquireReleaseAppSplash() {
        C0245.m1421().m1467();
    }

    public boolean isAppSplashExists(String str) {
        return C0245.m1421().m1468(str);
    }

    public PackageInfo getInnerAppPackageInfo(String str, int i) {
        return C0245.m1421().m1430(str, i);
    }

    public Intent getLaunchIntentForPackage(Intent intent) {
        ActivityInfo m1425 = C0245.m1421().m1425(intent);
        Intent intent2 = new Intent();
        if (m1425 == null) {
            return intent2;
        }
        intent2.setComponent(new ComponentName(m1425.packageName, m1425.name));
        intent2.setAction("android.intent.action.MAIN");
        return intent2;
    }

    public String[] getInstalledUserName(String str) {
        return C0245.m1421().m1464(str);
    }

    public int[] getInstalledUserId(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            String[] installedUserName = getInstalledUserName(str);
            if (installedUserName != null) {
                for (String str2 : installedUserName) {
                    if (m2490(str2)) {
                        arrayList.add(Integer.valueOf(str2));
                    }
                }
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            return size == 0 ? new int[]{0} : iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }

    public void createEmptyUserById(String str) {
        try {
            int i = 0;
            while (Arrays.binarySearch(getInstalledUserId(str), i) >= 0) {
                i++;
            }
            createEmptyUser(str, String.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public void createEmptyUser(String str, int i) {
        try {
            if (Arrays.binarySearch(getInstalledUserId(str), i) >= 0) {
                return;
            }
            createEmptyUser(str, String.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public void cleanPackageDataAsUser(String str, int i) {
        C0245.m1421().m1465(str, String.valueOf(i));
    }

    public void setEnableIoRedirect(boolean z) {
        C0245.m1421().getClass();
    }

    public void setUnityGamingMode(boolean z) {
        C0245.m1421().getClass();
    }

    public void invalidCacheAndRestart() {
        C0245.m1421().m1454();
    }

    public void setInternalAppEnhancement(boolean z) {
        C0245.m1421().getClass();
    }

    public void setDumpDex(boolean z) {
        C0245.m1421().getClass();
    }

    public List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i, int i2) {
        return C0245.m1421().m1437(intent, str, i);
    }

    public List<ResolveInfo> queryIntentReceivers(Intent intent, String str, int i, int i2) {
        return C0245.m1421().m1439(intent, str, i);
    }

    public List<ResolveInfo> queryIntentProviders(Intent intent, String str, int i, int i2) {
        return C0245.m1421().m1436(intent, str, i);
    }

    public List<ResolveInfo> queryIntentServices(Intent intent, String str, int i, int i2) {
        return C0245.m1421().m1438(intent, str, i);
    }

    public ActivityInfo resolveActivityInfo(ComponentName componentName, int i) {
        return C0245.m1421().m1432(componentName, 0);
    }

    public Intent getLaunchIntent(String str, int i) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List<ResolveInfo> m1437 = C0245.m1421().m1437(intent, (String) null, 131072);
        List<ResolveInfo> list = m1437;
        if (m1437 == null || list.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            list = C0245.m1421().m1437(intent, (String) null, 131072);
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<ResolveInfo> list2 = list;
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268435456);
        intent2.setClassName(list2.get(0).activityInfo.packageName, list2.get(0).activityInfo.name);
        return intent2;
    }

    public void setNetFilterRules(String str) {
        C0245.m1421().getClass();
    }

    public void setEnabledEmbedClassMaker(boolean z) {
        C0245.m1421().getClass();
    }

    public void deleteAppCache(String str) {
        C0245.m1421().m1460(str);
    }

    public void deleteAllAppCache() {
        C0245.m1421().m1459();
    }

    public void createEmptyUser(String str, String str2) {
        C0245.m1421().m1463(str, str2);
    }

    public void cleanPackageDataAsUser(String str, String str2) {
        C0245.m1421().m1465(str, str2);
    }

    public ActivityInfo resolveActivityInfo(Intent intent, int i) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2 = null;
        if (intent.getComponent() == null) {
            ResolveInfo resolveInfo = C0245.m1421().m1437(intent, (String) null, 131072).get(0);
            if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                activityInfo2 = activityInfo;
            }
        } else {
            activityInfo2 = resolveActivityInfo(intent.getComponent(), i);
        }
        return activityInfo2;
    }
}
