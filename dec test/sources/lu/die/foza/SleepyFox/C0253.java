package lu.die.foza.SleepyFox;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࡥ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡥ.class */
public final class C0253 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object f517;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Method f518;
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final Object[] f519;

    public C0253(@NotNull Object obj, @NotNull Method method, @NotNull Object[] objArr) {
        this.f517 = obj;
        this.f518 = method;
        this.f519 = objArr;
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final Object m1485() {
        return this.f518.invoke(this.f517, this.f519);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object[] m1486() {
        return this.f519;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Method m1487() {
        return this.f518;
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final Object m1488() {
        return this.f517;
    }
}
