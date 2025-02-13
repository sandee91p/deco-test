package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nLocalApplicationInfoFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalApplicationInfoFilter.kt\nlu/die/foza/HookEntity/BaseEntity/LocalApplicationInfoFilter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n13309#2,2:73\n13309#2,2:75\n13309#2,2:77\n13309#2,2:79\n*S KotlinDebug\n*F\n+ 1 LocalApplicationInfoFilter.kt\nlu/die/foza/HookEntity/BaseEntity/LocalApplicationInfoFilter\n*L\n30#1:73,2\n33#1:75,2\n36#1:77,2\n39#1:79,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ၡ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၡ.class */
public final class C0448 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0448 f1055 = new C0448();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean f1056 = true;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final int f1057 = Process.myPid();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0343<String> f1058 = new C0343<>("credentialProtectedDataDir");

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m2363() {
        return f1057;
    }

    @SuppressLint({"SdCardPath"})
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ApplicationInfo m2367(@Nullable ApplicationInfo applicationInfo) {
        String str;
        if (applicationInfo != null) {
            try {
                str = applicationInfo.packageName;
            } catch (Exception unused) {
            }
            if (str != null) {
                C0276 c0276 = C0276.f576;
                if (Intrinsics.areEqual(str, c0276.m1713())) {
                    c0276.getClass();
                    String str2 = C0276.f580;
                    c0276.getClass();
                    applicationInfo.uid = C0276.f584;
                    applicationInfo.enabled = true;
                    applicationInfo.dataDir = str2;
                    if (C0175.f261) {
                        applicationInfo.deviceProtectedDataDir = str2;
                        f1058.m2104(applicationInfo, str2);
                    }
                }
                return applicationInfo;
            }
        }
        return applicationInfo;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final PackageInfo m2366(@NotNull PackageInfo packageInfo) {
        try {
            ApplicationInfo m2367 = m2367(packageInfo.applicationInfo);
            packageInfo.applicationInfo = m2367;
            ActivityInfo[] activityInfoArr = packageInfo.activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    activityInfo.applicationInfo = m2367;
                }
            }
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    providerInfo.applicationInfo = m2367;
                }
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    serviceInfo.applicationInfo = m2367;
                }
            }
            ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
            if (activityInfoArr2 != null) {
                for (ActivityInfo activityInfo2 : activityInfoArr2) {
                    activityInfo2.applicationInfo = m2367;
                }
            }
        } catch (Exception unused) {
        }
        return packageInfo;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m2364() {
        C0276.f576.getClass();
        return C0276.f584;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T extends ComponentInfo> T m2365(@Nullable T t) {
        if (t == null) {
            return null;
        }
        m2367(((ComponentInfo) t).applicationInfo);
        ((ComponentInfo) t).enabled = true;
        return t;
    }
}
