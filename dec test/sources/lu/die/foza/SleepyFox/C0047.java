package lu.die.foza.SleepyFox;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0154;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nReflectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionUtils.kt\nlu/die/foza/HookEntity/Reflection/ReflectionUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n1#2:310\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ˋ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˋ.class */
public final class C0047 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0047 f129 = new C0047();

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object m465(@NotNull Object obj, @NotNull String str) {
        Field m461 = m461(obj, str);
        if (m461 != null) {
            m461.setAccessible(true);
            Object obj2 = null;
            try {
                obj2 = m461.get(obj);
            } catch (IllegalAccessException unused) {
            }
            return obj2;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final Object m467(@NotNull Class<?> cls, @NotNull String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m471(@NotNull Class<?> cls, @NotNull String str) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m472(@NotNull ClassLoader classLoader, @NotNull String str, @NotNull String str2) {
        try {
            Method declaredMethod = classLoader.loadClass(str).getDeclaredMethod(str2, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final Object m463(@Nullable Object obj, @NotNull String str) {
        return m462(obj, str, C0154.C0157.f209, C0154.C0157.f210);
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object m466(@NotNull Class<?> cls, @NotNull String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m470(@NotNull String str, @NotNull String str2) {
        try {
            return m471(Class.forName(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m475(@NotNull Object obj, @NotNull Object obj2, @NotNull String str) {
        try {
            Field m461 = m461(obj2, str);
            if (m461 == null) {
                return;
            }
            m461.setAccessible(true);
            m461.set(obj, m461.get(obj2));
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Object m455(@NotNull String str, @NotNull String str2) {
        return f129.m466(Class.forName(str), str2);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Field m461(@NotNull Object obj, @NotNull String str) {
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (!Intrinsics.areEqual(cls2, Object.class)) {
                try {
                    return cls2.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                    cls = cls2.getSuperclass();
                }
            } else {
                return null;
            }
        }
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object m473(@NotNull ClassLoader classLoader, @NotNull String str, @NotNull String str2) {
        try {
            Method declaredMethod = classLoader.loadClass(str).getDeclaredMethod(str2, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Method m459(@NotNull Object obj, @NotNull String str, @NotNull Class<?>[] clsArr) {
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (!Intrinsics.areEqual(cls2, Object.class)) {
                try {
                    return cls2.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    cls = cls2.getSuperclass();
                }
            } else {
                return null;
            }
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Class<?> m457(@NotNull Class<?> cls, int i) {
        Type genericSuperclass = cls.getGenericSuperclass();
        ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? (ParameterizedType) genericSuperclass : null;
        if (parameterizedType == null) {
            return Object.class;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= actualTypeArguments.length || i < 0) {
            return Object.class;
        }
        Type type = actualTypeArguments[i];
        if (!(type instanceof Class)) {
            return Object.class;
        }
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) type;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T> Class<?> m458(@NotNull Class<?> cls) {
        return m457(cls, 0);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m462(@Nullable Object obj, @NotNull String str, @NotNull Class<?>[] clsArr, @NotNull Object[] objArr) {
        Method m459;
        if (obj != null && (m459 = f129.m459(obj, str, clsArr)) != null) {
            m459.setAccessible(true);
            try {
                return m459.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m474(@NotNull String str, @Nullable Object obj) {
        try {
            return Class.forName(str).isInstance(obj);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m460(@NotNull Field field) {
        field.setAccessible(true);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m464(@NotNull Object obj, @NotNull String str, @Nullable Object obj2) {
        Field m461 = m461(obj, str);
        if (m461 != null) {
            m461.setAccessible(true);
            try {
                m461.set(obj, obj2);
                return;
            } catch (IllegalAccessException unused) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m468(@NotNull Class<?> cls, @NotNull String str, @Nullable Object obj) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(null, obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m469(@NotNull String str, @NotNull String str2, @Nullable Object obj) {
        try {
            m468(Class.forName(str), str2, obj);
        } catch (Exception unused) {
        }
    }
}
