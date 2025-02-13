package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ޣ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޣ.class */
public final class C0216 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0216 f314 = new C0216();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static C0024<ActivityInfo> f315 = new C0024<>(0);

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ActivityInfo m1202(@NotNull ComponentName componentName) {
        return (ActivityInfo) C0024.m302(f315, componentName.hashCode(), null, 2, null);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ActivityInfo m1201(@NotNull Intent intent) {
        C0024<ActivityInfo> c0024 = f315;
        ComponentName component = intent.getComponent();
        return (ActivityInfo) C0024.m302(c0024, component != null ? component.hashCode() : 0, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        r8 = r8.activities;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004e, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0048, code lost:
        if (r0 != null) goto L17;
     */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1200() {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0216.m1200():void");
    }
}
