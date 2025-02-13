package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* renamed from: lu.die.foza.SleepyFox.ၶ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၶ.class */
public class C0461 {
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Method m2402(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return m2403(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static Method m2404(Class<?> cls, String str, Class<?>... clsArr) {
        Class<? super Object> superclass = cls.getSuperclass();
        while (true) {
            Class<? super Object> cls2 = superclass;
            if (cls2 != null) {
                if (Modifier.isPublic(cls2.getModifiers())) {
                    try {
                        return cls2.getMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        return null;
                    }
                }
                superclass = cls2.getSuperclass();
            } else {
                return null;
            }
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Method m2405(Class<?> cls, String str, Class<?>... clsArr) {
        Method method = null;
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        method = interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                    }
                    if (method != null) {
                        break;
                    }
                    Method m2405 = m2405(interfaces[i], str, clsArr);
                    method = m2405;
                    if (m2405 != null) {
                        break;
                    }
                    cls = cls.getSuperclass();
                }
            }
            cls = cls.getSuperclass();
        }
        return method;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static Method m2406(Class<?> cls, String str, Class<?>... clsArr) {
        Method[] methods;
        Method m2403;
        try {
            Method method = cls.getMethod(str, clsArr);
            AbstractC0458.m2384((AccessibleObject) method);
            return method;
        } catch (NoSuchMethodException unused) {
            Method method2 = null;
            for (Method method3 : cls.getMethods()) {
                if (method3.getName().equals(str) && C0185.m1064(clsArr, method3.getParameterTypes(), true) && (m2403 = m2403(method3)) != null && (method2 == null || AbstractC0458.m2387(m2403.getParameterTypes(), method2.getParameterTypes(), clsArr) < 0)) {
                    method2 = m2403;
                }
            }
            if (method2 != null) {
                AbstractC0458.m2384((AccessibleObject) method2);
            }
            return method2;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Object m2394(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = C0166.f232;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m2395(obj, str, objArr, clsArr);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Method m2403(Method method) {
        if (!AbstractC0458.m2386((Member) method)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method m2405 = m2405(declaringClass, name, parameterTypes);
        Method method2 = m2405;
        if (m2405 == null) {
            method2 = m2404(declaringClass, name, parameterTypes);
        }
        return method2;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Object m2395(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null) {
            clsArr = C0166.f233;
        }
        if (objArr == null) {
            objArr = C0166.f232;
        }
        Method m2406 = m2406(obj.getClass(), str, clsArr);
        if (m2406 != null) {
            return m2406.invoke(obj, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m2396(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = C0166.f232;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m2397(obj, str, objArr, clsArr);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m2397(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = C0166.f232;
        }
        if (clsArr == null) {
            clsArr = C0166.f233;
        }
        Method m2402 = m2402(obj.getClass(), str, clsArr);
        if (m2402 != null) {
            return m2402.invoke(obj, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Object m2399(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = C0166.f232;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m2400(cls, str, objArr, (Class<?>[]) clsArr);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Object m2400(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null) {
            clsArr = C0166.f233;
        }
        if (objArr == null) {
            objArr = C0166.f232;
        }
        Method m2406 = m2406(cls, str, clsArr);
        if (m2406 != null) {
            return m2406.invoke(null, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m2401(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = C0166.f232;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return m2398(cls, str, objArr, (Class<?>[]) clsArr);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m2398(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = C0166.f232;
        }
        if (clsArr == null) {
            clsArr = C0166.f233;
        }
        Method m2402 = m2402(cls, str, clsArr);
        if (m2402 != null) {
            return m2402.invoke(null, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }
}
