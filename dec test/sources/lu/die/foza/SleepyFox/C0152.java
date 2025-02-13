package lu.die.foza.SleepyFox;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.security.net.config.NetworkSecurityConfigProvider;
import dalvik.system.VMRuntime;
import java.lang.reflect.Field;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ނ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ނ.class */
public final class C0152 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0152 f200 = new C0152();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m718(@NotNull String str, @NotNull Context context, @NotNull ApplicationInfo applicationInfo) {
        try {
            int i = applicationInfo.targetSdkVersion;
            try {
                VMRuntime.getRuntime().setTargetSdkVersion(i);
                if (C0175.f271) {
                    VMRuntime.setProcessPackageName(str);
                    VMRuntime.setProcessDataDirectory(applicationInfo.dataDir);
                }
            } catch (Throwable unused) {
            }
            if (C0175.f264) {
                if (i < 28) {
                    context = C0276.m1701();
                }
                NetworkSecurityConfigProvider.install(context);
            }
            if (i >= 24 || !C0175.f261) {
                return;
            }
            C0047.f129.m471(StrictMode.class, "disableDeathOnFileUriExposure");
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m719() {
        try {
            if (!C0175.f264) {
                C0327.f772.m2017();
            }
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            if (!ArraysKt.contains(C0276.f586, c0276.m1713())) {
                return;
            }
            ClassLoader m1719 = c0276.m1719();
            if (m1719 == null) {
                return;
            }
            Class<?> loadClass = m1719.loadClass("com.facebook.login.LoginBehavior");
            Field declaredField = loadClass.getDeclaredField("NATIVE_WITH_FALLBACK");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = loadClass.getDeclaredField("allowsGetTokenAuth");
            declaredField2.setAccessible(true);
            Boolean bool = Boolean.FALSE;
            declaredField2.set(obj, bool);
            Field declaredField3 = loadClass.getDeclaredField("allowsKatanaAuth");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, bool);
            Field declaredField4 = loadClass.getDeclaredField("allowsFacebookLiteAuth");
            declaredField4.setAccessible(true);
            declaredField4.set(obj, bool);
            Field declaredField5 = loadClass.getDeclaredField("allowsInstagramAppAuth");
            declaredField5.setAccessible(true);
            declaredField5.set(obj, bool);
        } catch (Throwable unused) {
        }
    }
}
