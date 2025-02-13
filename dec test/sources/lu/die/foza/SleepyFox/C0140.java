package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ٴ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ٴ.class */
public final class C0140 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0140 f190 = new C0140();

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final ActivityInfo m711(@NotNull String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(str);
            List<ResolveInfo> m1980 = z ? C0325.f765.m1980(intent.setPackage(str), (String) null, 0) : C0323.f761.m1914(intent.setPackage(str), 0);
            if (m1980 != null) {
                for (ResolveInfo resolveInfo : m1980) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo.enabled) {
                        return activityInfo;
                    }
                }
            }
            intent.removeCategory("android.intent.category.LAUNCHER");
            intent.addCategory("android.intent.category.INFO");
            List<ResolveInfo> m1914 = z ? C0323.f761.m1914(intent, 0) : C0325.f765.m1980(intent, (String) null, 0);
            if (m1914 == null) {
                return null;
            }
            for (ResolveInfo resolveInfo2 : m1914) {
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                if (activityInfo2.enabled) {
                    return activityInfo2;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Pair<Intent, ActivityInfo> m712(@NotNull String str, boolean z) {
        Pair<Intent, ActivityInfo> pair;
        ActivityInfo m711 = m711(str, z);
        if (m711 != null) {
            pair = r0;
            Pair<Intent, ActivityInfo> pair2 = new Pair<>(C0417.f1015.m2328(str, m711.name), m711);
        } else {
            pair = null;
        }
        return pair;
    }
}
