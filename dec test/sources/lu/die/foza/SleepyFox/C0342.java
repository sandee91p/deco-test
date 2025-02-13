package lu.die.foza.SleepyFox;

import android.os.IBinder;
import android.os.IInterface;
import android.os.IServiceManager;
import android.os.ServiceManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import lu.die.foza.SleepyFox.C0154;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ৼ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ৼ.class */
public final class C0342 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0342 f813 = new C0342();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0024<C0459> f814 = new C0024<>(0, 1, null);
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final Map<String, IBinder> f815;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map] */
    static {
        C0154 c0154;
        try {
            Object m466 = C0047.f129.m466(ServiceManager.class, "sCache");
            Intrinsics.checkNotNull(m466);
            c0154 = TypeIntrinsics.asMutableMap(m466);
        } catch (Exception unused) {
            c0154 = r0;
            C0154 c01542 = new C0154();
        }
        f815 = c0154;
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object m2096(@Nullable Object obj, @NotNull AbstractC0412 abstractC0412) {
        C0033 m2097 = m2097(obj, abstractC0412);
        return m2097 != null ? m2097.f100 : null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2099(IBinder iBinder, String str) {
        if (str == null) {
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (interfaceDescriptor == null) {
                    return null;
                }
                str = interfaceDescriptor.concat("$Stub");
            } catch (Throwable unused) {
                return null;
            }
        }
        Class<?> cls = Class.forName(str);
        Class<?>[] clsArr = new Class[1];
        clsArr[0] = IBinder.class;
        Method declaredMethod = cls.getDeclaredMethod("asInterface", clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(null, iBinder);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m2098(@Nullable Object obj) {
        C0202.f299.getClass();
        return m2097(obj, C0202.f300);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m2097(@Nullable Object obj, @NotNull AbstractC0412 abstractC0412) {
        try {
            if (obj != null) {
                return new C0033(abstractC0412, obj);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m2089(C0342 c0342, Object obj, AbstractC0412 abstractC0412, int i, Object obj2) {
        if ((i & 2) != 0) {
            C0202.f299.getClass();
            abstractC0412 = C0202.f300;
        }
        return c0342.m2096(obj, abstractC0412);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0459 m2092(@NotNull String str) {
        return (C0459) C0024.m302(f814, str.hashCode(), null, 2, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2093() {
        try {
            Field declaredField = ServiceManager.class.getDeclaredField("sServiceManager");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            ClassLoader classLoader = ServiceManager.class.getClassLoader();
            Class[] clsArr = new Class[1];
            clsArr[0] = IServiceManager.class;
            declaredField.set(null, Proxy.newProxyInstance(classLoader, clsArr, (v1, v2, v3) -> {
                return m2090(r3, v1, v2, v3);
            }));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Object m2090(Object obj, Object obj2, Method method, Object[] objArr) {
        try {
            if (Intrinsics.areEqual(method.getName(), "getService")) {
                C0024<C0459> c0024 = f814;
                Object obj3 = objArr != null ? objArr[0] : null;
                C0459 c0459 = (C0459) C0024.m302(c0024, obj3 != null ? obj3.hashCode() : 0, null, 2, null);
                if (c0459 != null) {
                    return c0459;
                }
            }
        } catch (Exception unused) {
        }
        if (objArr == null) {
            objArr = C0154.C0157.f210;
        }
        return method.invoke(obj, objArr);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m2094(@NotNull String str, @NotNull AbstractC0412 abstractC0412, @NotNull IInterface iInterface) {
        try {
            C0033 c0033 = new C0033(abstractC0412, iInterface);
            Map<String, IBinder> map = f815;
            synchronized (map) {
                IBinder service = ServiceManager.getService(str);
                if (service == null) {
                    return null;
                }
                C0459 c0459 = new C0459(service, c0033);
                C0024<C0459> c0024 = f814;
                synchronized (c0024) {
                    c0024.m309(str.hashCode(), c0459);
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (map) {
                    map.put(str, c0459);
                    Unit unit2 = Unit.INSTANCE;
                }
                return c0033;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m2095(@NotNull String str, @NotNull AbstractC0412 abstractC0412, @Nullable String str2) {
        try {
            Map<String, IBinder> map = f815;
            synchronized (map) {
                IBinder service = ServiceManager.getService(str);
                if (service == null) {
                    return null;
                }
                Object m2099 = m2099(service, str2);
                if (m2099 == null) {
                    return null;
                }
                C0033 c0033 = new C0033(abstractC0412, m2099);
                C0459 c0459 = new C0459(service, c0033);
                C0024<C0459> c0024 = f814;
                synchronized (c0024) {
                    c0024.m309(str.hashCode(), c0459);
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (map) {
                    map.put(str, c0459);
                    Unit unit2 = Unit.INSTANCE;
                }
                return c0033;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
