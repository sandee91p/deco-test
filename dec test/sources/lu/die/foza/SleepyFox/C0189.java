package lu.die.foza.SleepyFox;

import android.app.ActivityClient;
import android.app.IActivityClientController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ޔ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޔ.class */
public final class C0189 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0189 f294 = new C0189();
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Object f295;

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m1095() {
        return f295;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1096() {
        try {
            if (f295 != null) {
                return;
            }
            C0047 c0047 = C0047.f129;
            Object m466 = c0047.m466(ActivityClient.class, "INTERFACE_SINGLETON");
            if (m466 == null) {
                return;
            }
            Object m465 = c0047.m465(m466, "mKnownInstance");
            if (m465 == null) {
                return;
            }
            Object m1097 = m1097(m465);
            if (m1097 == null) {
                return;
            }
            ActivityClient.setActivityClientController((IActivityClientController) m1097);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object m1097(@NotNull Object obj) {
        C0342 c0342 = C0342.f813;
        C0277.f587.getClass();
        C0033 m2097 = c0342.m2097(obj, C0277.f588);
        if (m2097 != null) {
            C0202.f299.getClass();
            m2097.m374("overridePendingTransition", C0202.f301);
            C0178.f277.getClass();
            C0178.f278.m1017(m2097);
            C0474.f1079.getClass();
            C0474.f1080.m2434(m2097);
            C0110.f177.getClass();
            C0110.f178.m695(m2097);
            Object obj2 = m2097.f100;
            f295 = obj2;
            return obj2;
        }
        return null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1098(@NotNull Object obj) {
        if (f295 != null) {
            return;
        }
        try {
            C0343 c0343 = new C0343("mActivityClientController");
            Object m2103 = c0343.m2103(obj);
            if (m2103 == null) {
                return;
            }
            Object m1097 = m1097(m2103);
            if (m1097 == null) {
                return;
            }
            c0343.m2104(obj, m1097);
            ActivityClient.setActivityClientController((IActivityClientController) m1097);
        } catch (Throwable unused) {
        }
    }
}
