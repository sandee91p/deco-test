package lu.die.foza.SleepyFox;

import lu.die.foza.Platform.EmbeddedMachineCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ၽ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၽ.class */
public final class C0476 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0476 f1083 = new C0476();

    static {
        try {
            System.loadLibrary("loader");
        } catch (Throwable th) {
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2439(int i, @Nullable Object obj) {
        return EmbeddedMachineCompat.nativeIoctl(i, obj);
    }
}
