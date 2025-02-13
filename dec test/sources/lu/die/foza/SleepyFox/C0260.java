package lu.die.foza.SleepyFox;

import android.util.Log;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࡪ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡪ.class */
public final class C0260 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0260 f542 = new C0260();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean f543;
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String f544 = "lu.die.foza.SleepyFox.ࡪ";

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final void m1611(@NotNull String str) {
        f544 = str;
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1613(@NotNull String str) {
        if (f543) {
            Log.d(f544, str);
        }
    }

    @JvmStatic
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final void m1614(@NotNull String str) {
        if (f543) {
            Log.e(f544, str);
        }
    }

    @JvmStatic
    /* renamed from: ԫ  reason: contains not printable characters */
    public static final void m1615(@NotNull String str) {
        if (f543) {
            Log.w(f544, str);
        }
    }

    @JvmStatic
    /* renamed from: ԩ  reason: contains not printable characters */
    public static final void m1616(@NotNull String str) {
        if (f543) {
            Log.i(f544, str);
        }
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1617(@NotNull Throwable th) {
        if (f543) {
            Log.e(f544, Log.getStackTraceString(th));
        }
    }

    @JvmStatic
    /* renamed from: ԩ  reason: contains not printable characters */
    public static final void m1619(@NotNull Throwable th) {
        if (f543) {
            Log.w(f544, Log.getStackTraceString(th));
        }
    }

    @JvmStatic
    @Deprecated(message = "Slow down app.")
    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final String m1620(@Nullable Throwable th) {
        return (!f543 || th == null) ? C0019.f56 : Log.getStackTraceString(th);
    }

    @JvmStatic
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static /* synthetic */ void m1612() {
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1618(@NotNull String str, @NotNull Throwable th) {
        if (f543) {
            Log.e(f544, str + Log.getStackTraceString(th));
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final String m1610() {
        return f544;
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1609(boolean z) {
        f543 = z;
    }
}
