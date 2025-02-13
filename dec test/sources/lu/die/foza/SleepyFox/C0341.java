package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.app.Application;
import android.os.Process;
import dalvik.system.VMRuntime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ॱ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ॱ.class */
public final class C0341 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0341 f812 = new C0341();

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m2086() {
        try {
            return C0175.f264 ? Application.getProcessName() : ActivityThread.currentProcessName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m2087() {
        boolean z;
        try {
            z = C0175.f260 ? Process.is64Bit() : VMRuntime.getRuntime().is64Bit();
        } catch (Throwable unused) {
            z = false;
        }
        return z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2088(@NotNull String str) {
        try {
            Class[] clsArr = new Class[1];
            clsArr[0] = String.class;
            Process.class.getMethod("setArgV0", clsArr).invoke(null, str);
        } catch (Throwable unused) {
        }
    }
}
