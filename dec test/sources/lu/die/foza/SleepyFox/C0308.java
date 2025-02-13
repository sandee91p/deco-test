package lu.die.foza.SleepyFox;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢲ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢲ.class */
public final class C0308 extends ClassLoader {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String f726;

    public C0308(@Nullable ClassLoader classLoader, @NotNull String str) {
        super(classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader);
        this.f726 = str;
    }

    @Override // java.lang.ClassLoader
    @NotNull
    public Class<?> loadClass(@Nullable String str, boolean z) {
        if (!Intrinsics.areEqual(this.f726, str)) {
            return super.loadClass(str, z);
        }
        throw new ClassNotFoundException(str);
    }
}
