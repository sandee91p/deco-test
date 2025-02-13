package lu.die.foza.SleepyFox;

import android.app.ActivityManager;
import android.app.ActivityManagerNative;
import android.app.IActivityManager;
import android.util.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ࢡ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢡ.class */
public final class C0263 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0263 f548 = new C0263();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Singleton<IActivityManager> f549;

    /* renamed from: lu.die.foza.SleepyFox.ࢡ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢡ$Ϳ.class */
    public static final class C0264 extends Singleton<IActivityManager> {
        /* renamed from: Ϳ  reason: contains not printable characters */
        public IActivityManager create() {
            throw new RuntimeException("Stub!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.util.Singleton] */
    static {
        C0264 c0264;
        Object m466;
        try {
            if (C0175.f262) {
                m466 = C0047.f129.m466(ActivityManager.class, "IActivityManagerSingleton");
                Intrinsics.checkNotNull(m466);
            } else {
                m466 = C0047.f129.m466(ActivityManagerNative.class, "gDefault");
                Intrinsics.checkNotNull(m466);
            }
            c0264 = (Singleton) m466;
        } catch (Exception unused) {
            c0264 = r1;
            C0264 c02642 = new C0264();
        }
        f549 = c0264;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final IActivityManager m1636() {
        return (IActivityManager) f549.get();
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Singleton<IActivityManager> m1637() {
        return f549;
    }
}
