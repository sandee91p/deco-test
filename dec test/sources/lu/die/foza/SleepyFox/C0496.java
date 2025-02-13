package lu.die.foza.SleepyFox;

import java.io.File;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.Ⴧ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ⴧ.class */
public final class C0496 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0496 f1092 = new C0496();

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m2462(@NotNull File file, @NotNull String... strArr) {
        int i = 0;
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            i++;
            file = new File(file, str);
        }
        return file;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m2463(@NotNull String str, @NotNull String... strArr) {
        File file = r1;
        File file2 = new File(str);
        int i = 0;
        int length = strArr.length;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            file = new File(file, str2);
        }
        return file.getAbsolutePath();
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m2464(@NotNull String str) {
        try {
            return new File(str).getCanonicalPath();
        } catch (Exception unused) {
            return str;
        }
    }
}
