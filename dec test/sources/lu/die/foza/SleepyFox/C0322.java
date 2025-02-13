package lu.die.foza.SleepyFox;

import android.content.pm.ApplicationInfo;
import java.io.File;
import lu.die.foza.SleepyFox.C0255;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢻ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢻ.class */
public final class C0322 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0322 f760 = new C0322();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1903(@Nullable ApplicationInfo applicationInfo) {
        File file;
        File file2;
        if (applicationInfo == null) {
            return;
        }
        try {
            String str = applicationInfo.nativeLibraryDir;
            if (str != null) {
                file = file2;
                file2 = new File(str, "libtersafe2.so");
            } else {
                file = null;
            }
            if (!(file != null && file.exists())) {
                String str2 = applicationInfo.nativeLibraryDir;
                file = str2 != null ? new File(str2, "libtersafe.so") : null;
            }
            if (!(file != null && file.exists())) {
                return;
            }
            File canonicalFile = file.getCanonicalFile();
            C0255 c0255 = C0255.f522;
            c0255.m1561(canonicalFile);
            ApplicationInfo applicationInfo2 = C0276.m1701().getApplicationInfo();
            if (applicationInfo2 == null) {
                return;
            }
            String str3 = applicationInfo2.nativeLibraryDir;
            if (str3 == null) {
                return;
            }
            File file3 = new File(str3, "libfoza.so");
            C0255.m1523(c0255, file3.getCanonicalPath(), canonicalFile.getAbsolutePath(), false, 4, null);
            if (!C0255.m1523(c0255, file3.getCanonicalPath(), canonicalFile.getAbsolutePath(), false, 4, null)) {
                return;
            }
            c0255.m1535(canonicalFile, C0255.C0256.f538);
        } catch (Exception unused) {
        }
    }
}
