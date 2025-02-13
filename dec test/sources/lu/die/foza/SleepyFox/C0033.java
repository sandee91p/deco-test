package lu.die.foza.SleepyFox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import lu.die.foza.SleepyFox.C0154;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ˁ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˁ.class */
public final class C0033 implements InvocationHandler {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final AbstractC0412 f98;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object f99;
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final Object f100;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0024<AbstractC0412> f101;

    public C0033(@NotNull AbstractC0412 abstractC0412, @NotNull Object obj) {
        this.f101 = new C0024<>(0, 1, null);
        this.f98 = abstractC0412;
        this.f99 = obj;
        this.f100 = Proxy.newProxyInstance(obj.getClass().getClassLoader(), C0153.f201.m723(obj.getClass()), this);
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final AbstractC0412 m373(@NotNull String str) {
        return (AbstractC0412) C0024.m302(this.f101, str.hashCode(), null, 2, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m374(@NotNull String str, @NotNull AbstractC0412 abstractC0412) {
        this.f101.m309(str.hashCode(), abstractC0412);
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@Nullable Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        try {
            AbstractC0412 abstractC0412 = (AbstractC0412) C0024.m302(this.f101, method.getName().hashCode(), null, 2, null);
            AbstractC0412 abstractC04122 = abstractC0412;
            if (abstractC0412 == null) {
                abstractC04122 = this.f98;
            }
            Object obj2 = this.f99;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            return abstractC04122.mo85(new C0253(obj2, method, objArr));
        } catch (InvocationTargetException e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw e;
        }
    }

    public C0033(@NotNull AbstractC0412 abstractC0412, @NotNull Object obj, @Nullable String str, @NotNull Class<?> cls) {
        this(abstractC0412, obj);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m376(@NotNull String str, @NotNull AbstractC0412 abstractC0412) {
        m374(str, abstractC0412);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m377(@NotNull AbstractC0412 abstractC0412, @NotNull String... strArr) {
        for (String str : strArr) {
            m374(str, abstractC0412);
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final AbstractC0412 m375(@NotNull String str) {
        return m373(str);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m372() {
        return this.f100;
    }
}
