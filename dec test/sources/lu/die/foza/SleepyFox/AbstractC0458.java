package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
/* renamed from: lu.die.foza.SleepyFox.ၰ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၰ.class */
public abstract class AbstractC0458 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final int f1068 = 7;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Class<?>[] f1069 = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m2387(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float m2388 = m2388(clsArr3, clsArr);
        float m23882 = m2388(clsArr3, clsArr2);
        if (m2388 < m23882) {
            return -1;
        }
        return m23882 < m2388 ? 1 : 0;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static float m2390(Class<?> cls, Class<?> cls2) {
        float f = 0.0f;
        if (!cls.isPrimitive()) {
            f = 0.1f;
            cls = C0185.m1071(cls);
        }
        int i = 0;
        while (cls != cls2) {
            int i2 = i;
            Class<?>[] clsArr = f1069;
            if (i2 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i]) {
                f += 0.1f;
                if (i < clsArr.length - 1) {
                    cls = clsArr[i + 1];
                }
            }
            i++;
        }
        return f;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float m2389(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return m2390(cls, cls2);
        }
        float f = 0.0f;
        while (true) {
            if (cls == null || cls2.equals(cls)) {
                break;
            } else if (cls2.isInterface() && C0185.m1067(cls, cls2)) {
                f += 0.25f;
                break;
            } else {
                f += 1.0f;
                cls = cls.getSuperclass();
            }
        }
        if (cls == null) {
            f += 1.5f;
        }
        return f;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float m2388(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            f = m2389(clsArr[i], clsArr2[i]) + f;
        }
        return f;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m2386(Member member) {
        return member != null && Modifier.isPublic(member.getModifiers()) && !member.isSynthetic();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m2385(int i) {
        return (i & 7) == 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m2384(AccessibleObject accessibleObject) {
        if (accessibleObject == null || accessibleObject.isAccessible()) {
            return;
        }
        Member member = (Member) accessibleObject;
        if (!Modifier.isPublic(member.getModifiers()) || !m2385(member.getDeclaringClass().getModifiers())) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }
}
