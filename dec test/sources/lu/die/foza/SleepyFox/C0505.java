package lu.die.foza.SleepyFox;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ჿ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჿ.class */
public final class C0505 {
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static AbstractC0506 f1097;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0505 f1096 = new C0505();

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean f1098 = true;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int f1099 = 4;

    /* renamed from: lu.die.foza.SleepyFox.ჿ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჿ$Ϳ.class */
    public interface AbstractC0506 {
        /* renamed from: Ϳ  reason: contains not printable characters */
        void mo2475();

        /* renamed from: Ԩ  reason: contains not printable characters */
        void mo2476();
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2469(@Nullable AbstractC0506 abstractC0506) {
        f1097 = abstractC0506;
    }

    @JvmStatic
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final void m2470(@NotNull Context context) {
        try {
            if (f1098) {
                f1098 = false;
                f1099 = f1096.m2474(context);
            }
            C0505 c0505 = f1096;
            if (c0505.m2472()) {
                AbstractC0506 abstractC0506 = f1097;
                if (abstractC0506 == null) {
                    return;
                }
                abstractC0506.mo2475();
            } else if (!c0505.m2473()) {
            } else {
                AbstractC0506 abstractC05062 = f1097;
                if (abstractC05062 == null) {
                    return;
                }
                abstractC05062.mo2476();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m2473() {
        return f1099 == 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m2474(Context context) {
        int i = 4;
        String m2086 = C0341.f812.m2086();
        if (m2086 != null && StringsKt.startsWith$default(m2086, context.getPackageName() + C0281.C0289.f675, false, 2, (Object) null)) {
            i = 0;
        }
        return i;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2472() {
        return f1099 == 4;
    }
}
