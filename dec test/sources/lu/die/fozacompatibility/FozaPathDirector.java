package lu.die.fozacompatibility;

import java.io.File;
import java.util.Objects;
import lu.die.foza.SleepyFox.C0045;
import lu.die.foza.SleepyFox.C0449;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaPathDirector.class */
public class FozaPathDirector {
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static File m2492(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File getDataUserPackageDirectory(int i, String str) {
        return m2492(new File((String) Objects.requireNonNull(C0045.m421(str, String.valueOf(i)))));
    }

    public static File getDataUserPackageDirectory64(int i, String str) {
        return m2492(new File((String) Objects.requireNonNull(C0045.m421(str, String.valueOf(i)))));
    }

    public static File getDeDataUserPackageDirectory(int i, String str) {
        return m2492(new File((String) Objects.requireNonNull(C0045.m421(str, String.valueOf(i)))));
    }

    public static File getDeDataUserPackageDirectory64(int i, String str) {
        return m2492(new File((String) Objects.requireNonNull(C0045.m421(str, String.valueOf(i)))));
    }

    public static File getDataAppPackageDirectory(String str) {
        return m2492((File) Objects.requireNonNull(C0449.f1059.m2373(str)));
    }

    public static File getDataAppPackageDirectory64(String str) {
        return m2492((File) Objects.requireNonNull(C0449.f1059.m2373(str)));
    }

    public static File getAppLibDirectory(String str) {
        return C0449.f1059.m2376(str);
    }

    public static File getAppLibDirectory64(String str) {
        return C0449.f1059.m2376(str);
    }

    public static File getUserAppLibDirectory(int i, String str) {
        return C0449.f1059.m2376(str);
    }

    public static File getUserAppLibDirectory64(int i, String str) {
        return C0449.f1059.m2376(str);
    }

    public static File getPackageCacheFile(String str) {
        return C0449.f1059.m2377(str);
    }
}
