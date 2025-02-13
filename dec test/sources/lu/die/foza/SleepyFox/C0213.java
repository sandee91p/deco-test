package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ޡ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޡ.class */
public final class C0213 {
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String f310;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0213 f309 = new C0213();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0154<IBinder, ComponentName> f311 = new C0154<>();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1189(@NotNull IBinder iBinder) {
        try {
            f311.remove(iBinder);
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ComponentName m1191(@Nullable IBinder iBinder) {
        try {
            return f311.get(iBinder);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1188() {
        try {
            f310 = null;
            f311.clear();
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m1193() {
        return f310;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1190(@NotNull IBinder iBinder, @NotNull ComponentName componentName) {
        try {
            C0154<IBinder, ComponentName> c0154 = f311;
            if (c0154.f205 > 114514) {
                c0154.clear();
            }
            c0154.put(iBinder, componentName);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1192(@Nullable String str) {
        f310 = str;
    }
}
