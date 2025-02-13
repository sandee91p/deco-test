package lu.die.foza.SleepyFox;

import java.io.File;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ၥ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၥ.class */
public final class C0449 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0449 f1059 = new C0449();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final File f1060 = C0276.m1701().getDir(C0281.C0286.f642, 0);

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m2369() {
        return f1060;
    }

    @NotNull
    /* renamed from: Ԭ  reason: contains not printable characters */
    public final File m2370(@NotNull String str) {
        return C0496.f1092.m2462(C0276.m1701().getCodeCacheDir(), str + ".apk");
    }

    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final File m2373(@NotNull String str) {
        return m2380(C0496.f1092.m2462(f1060, str));
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final File m2375(@NotNull String str) {
        return C0496.f1092.m2462(m2373(str), C0281.C0286.f644);
    }

    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public final File m2376(@NotNull String str) {
        C0496 c0496 = C0496.f1092;
        File m2380 = m2380(c0496.m2462(m2373(str), C0281.C0286.f645));
        String[] strArr = new String[1];
        strArr[0] = C0341.f812.m2087() ? C0281.C0286.f646 : C0281.C0286.f647;
        File m2462 = c0496.m2462(m2380, strArr);
        if (m2462.exists() && !m2462.delete()) {
            m2462.toString();
        }
        if (!C0255.m1523(C0255.f522, m2380.getAbsolutePath(), m2462.getAbsolutePath(), false, 4, null)) {
            m2380.toString();
            m2462.toString();
        }
        return m2462;
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final File m2377(@NotNull String str) {
        return C0496.f1092.m2462(m2373(str), C0281.C0286.f648);
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final File m2371() {
        return C0496.f1092.m2462(f1060, C0281.C0286.f652);
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final File m2378(@NotNull File file) {
        return C0496.f1092.m2462(file, C0281.C0286.f648);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m2380(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final File m2372() {
        return C0496.f1092.m2462(f1060, C0281.C0286.f649);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2379(@NotNull String str) {
        return C0255.f522.m1559(m2373(str));
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m2374(@NotNull String str, @NotNull String str2) {
        return C0496.f1092.m2462(m2373(str), str2);
    }
}
