package lu.die.foza.SleepyFox;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0154;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ಀ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ಀ.class */
public final class C0344<T> {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String f818;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Class<?>[] f819;
    @Nullable

    /* renamed from: ԩ  reason: contains not printable characters */
    public Method f820;

    public C0344(@NotNull String str, @NotNull Class<?>[] clsArr) {
        this.f818 = str;
        this.f819 = clsArr;
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final T m2126(@Nullable Object obj, @NotNull Object[] objArr) {
        Method method = this.f820;
        Method method2 = method;
        if (method == null) {
            Intrinsics.checkNotNull(obj);
            method2 = m2128(obj);
        }
        return (T) method2.invoke(obj, objArr);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Method m2128(Object obj) {
        C0360 c0360 = new C0360(3);
        Method method = null;
        while (method == null && c0360.m2181()) {
            try {
                Method m459 = C0047.f129.m459(obj, this.f818, this.f819);
                Intrinsics.checkNotNull(m459);
                m459.setAccessible(true);
                this.f820 = m459;
                method = m459;
            } catch (Exception unused) {
                C0354.f837.m2166();
            }
        }
        Method method2 = method;
        Intrinsics.checkNotNull(method2);
        return method2;
    }

    public /* synthetic */ C0344(String str, Class<?>[] clsArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C0154.C0157.f209 : clsArr);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0344<T> m2125(@NotNull Class<?> cls) {
        C0360 c0360 = new C0360(3);
        while (c0360.m2181()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(this.f818, this.f819);
                declaredMethod.setAccessible(true);
                this.f820 = declaredMethod;
                return this;
            } catch (Exception unused) {
                C0354.f837.m2166();
            }
        }
        return this;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0344<T> m2124(@NotNull String str) {
        try {
            m2125(Class.forName(str));
        } catch (Exception unused) {
        }
        return this;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final T m2127(@Nullable Object obj, @NotNull Object... objArr) {
        Method method = this.f820;
        Method method2 = method;
        if (method == null) {
            Intrinsics.checkNotNull(obj);
            method2 = m2128(obj);
        }
        return (T) method2.invoke(obj, objArr);
    }
}
