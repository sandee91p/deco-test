package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.ConditionVariable;
import android.os.Process;
import kotlin.Pair;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ˆ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˆ.class */
public final class C0034 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0034 f102 = new C0034();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m380(@NotNull C0044 c0044, @NotNull AbstractC0382 abstractC0382) {
        Pair<? extends Intent, ? extends ActivityInfo> pair;
        try {
            abstractC0382.mo1793(c0044);
            pair = c0044.f119;
        } catch (Exception unused) {
            try {
                C0265.f550.m1669(c0044);
                int i = c0044.f114;
                if (i != 0) {
                    Process.killProcess(i);
                } else {
                    abstractC0382.mo1794();
                }
            } catch (Throwable unused2) {
            }
            ConditionVariable conditionVariable = c0044.f121;
        } catch (Throwable th) {
            c0044.f121.open();
            throw th;
        }
        if (pair == null) {
            c0044.f121.open();
            return;
        }
        c0044.f119 = null;
        m379((Intent) pair.getFirst(), (ActivityInfo) pair.getSecond(), c0044);
        ConditionVariable conditionVariable2 = c0044.f121;
        conditionVariable2.open();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m379(@NotNull Intent intent, @NotNull ActivityInfo activityInfo, @NotNull C0044 c0044) {
        Intent m1680 = C0265.f550.m1680(intent, c0044, activityInfo);
        C0417.f1015.m2326(134217728, m1680);
        m1680.putExtra(C0281.C0282.f615, c0044.f839);
        C0276.m1701().startActivity(m1680);
    }
}
