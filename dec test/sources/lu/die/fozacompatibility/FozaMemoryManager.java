package lu.die.fozacompatibility;

import java.io.Closeable;
import lu.die.foza.SleepyFox.C0217;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaMemoryManager.class */
public class FozaMemoryManager {

    /* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaMemoryManager$MemoryControllerHandler.class */
    public static class MemoryControllerHandler implements Closeable {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0217 f1106;

        public MemoryControllerHandler(C0217 c0217) {
            this.f1106 = c0217;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1106.close();
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m2488(long j, byte[] bArr) {
            this.f1106.m1209(j, bArr);
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final byte[] m2489(long j, int i) {
            return this.f1106.m1210(j, i);
        }
    }

    public static int getPidByPackages(String[] strArr) {
        return C0217.m1204(strArr);
    }

    public static void writeMemory(MemoryControllerHandler memoryControllerHandler, long j, byte[] bArr) {
        memoryControllerHandler.m2488(j, bArr);
    }

    public static byte[] readMemory(MemoryControllerHandler memoryControllerHandler, long j, int i) {
        return memoryControllerHandler.m2489(j, i);
    }

    public static void closeHandle(MemoryControllerHandler memoryControllerHandler) {
        memoryControllerHandler.close();
    }

    public static MemoryControllerHandler beginModifyMemory(String str, int i, boolean z) {
        return beginModifyMemory(str, String.valueOf(i), z);
    }

    public static MemoryControllerHandler beginModifyMemory(String str, String str2, boolean z) {
        try {
            return new MemoryControllerHandler(new C0217(str, z, str2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
