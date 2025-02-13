package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* renamed from: lu.die.foza.SleepyFox.ຌ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຌ.class */
public class C0370 implements AbstractC0177<Integer> {

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final ThreadLocal<Set<C0381>> f874 = new ThreadLocal<>();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int f875;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public int f876;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static Set<C0381> m2208() {
        return f874.get();
    }

    public C0370() {
        this.f875 = 37;
        this.f876 = 17;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2222(byte b) {
        this.f876 = (this.f876 * this.f875) + b;
        return this;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public C0370 m2238(int i) {
        this.f876 = (this.f876 * this.f875) + i;
        return this;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public int m2239() {
        return this.f876;
    }

    public int hashCode() {
        return m2239();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Class<lu.die.foza.SleepyFox.ຌ>] */
    /* renamed from: ԩ  reason: contains not printable characters */
    public static void m2217(Object obj) {
        synchronized (C0370.class) {
            if (m2208() == null) {
                f874.set(new HashSet());
            }
        }
        m2208().add(new C0381(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class<lu.die.foza.SleepyFox.ຌ>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: Ԫ  reason: contains not printable characters */
    public static void m2218(Object obj) {
        Set<C0381> m2208 = m2208();
        if (m2208 != null) {
            m2208.remove(new C0381(obj));
            ?? r0 = C0370.class;
            synchronized (r0) {
                Set<C0381> m22082 = m2208();
                if (m22082 != null && m22082.isEmpty()) {
                    f874.remove();
                }
                r0 = r0;
            }
        }
    }

    public C0370(int i, int i2) {
        this.f876 = 0;
        if (i != 0) {
            if (i % 2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
            }
            if (i2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
            }
            if (i2 % 2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
            }
            this.f875 = i2;
            this.f876 = i;
            return;
        }
        throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2224(char c) {
        this.f876 = (this.f876 * this.f875) + c;
        return this;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0177
    /* renamed from: Ԩ  reason: contains not printable characters */
    public Integer mo536() {
        return Integer.valueOf(m2239());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m2209(Object obj) {
        Set<C0381> m2208 = m2208();
        return m2208 != null && m2208.contains(new C0381(obj));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2226(double d) {
        return m2232(Double.doubleToLongBits(d));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2228(float f) {
        this.f876 = Float.floatToIntBits(f) + (this.f876 * this.f875);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2230(int i) {
        this.f876 = (this.f876 * this.f875) + i;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2232(long j) {
        this.f876 = (this.f876 * this.f875) + ((int) (this ^ (j >> 32)));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2234(Object obj) {
        if (obj == null) {
            this.f876 *= this.f875;
        } else if (!obj.getClass().isArray()) {
            this.f876 = obj.hashCode() + (this.f876 * this.f875);
        } else if (obj instanceof long[]) {
            m2233((long[]) obj);
        } else if (obj instanceof int[]) {
            m2231((int[]) obj);
        } else if (obj instanceof short[]) {
            m2237((short[]) obj);
        } else if (obj instanceof char[]) {
            m2225((char[]) obj);
        } else if (obj instanceof byte[]) {
            m2223((byte[]) obj);
        } else if (obj instanceof double[]) {
            m2227((double[]) obj);
        } else if (obj instanceof float[]) {
            m2229((float[]) obj);
        } else if (obj instanceof boolean[]) {
            m2221((boolean[]) obj);
        } else {
            m2235((Object[]) obj);
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2236(short s) {
        this.f876 = (this.f876 * this.f875) + s;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2220(boolean z) {
        this.f876 = (this.f876 * this.f875) + (!z ? 1 : 0);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2223(byte[] bArr) {
        if (bArr == null) {
            this.f876 *= this.f875;
        } else {
            for (byte b : bArr) {
                m2222(b);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2225(char[] cArr) {
        if (cArr == null) {
            this.f876 *= this.f875;
        } else {
            for (char c : cArr) {
                m2224(c);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2227(double[] dArr) {
        if (dArr == null) {
            this.f876 *= this.f875;
        } else {
            for (double d : dArr) {
                m2226(d);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2229(float[] fArr) {
        if (fArr == null) {
            this.f876 *= this.f875;
        } else {
            for (float f : fArr) {
                m2228(f);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2231(int[] iArr) {
        if (iArr == null) {
            this.f876 *= this.f875;
        } else {
            for (int i : iArr) {
                m2230(i);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2233(long[] jArr) {
        if (jArr == null) {
            this.f876 *= this.f875;
        } else {
            for (long j : jArr) {
                m2232(j);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2235(Object[] objArr) {
        if (objArr == null) {
            this.f876 *= this.f875;
        } else {
            for (Object obj : objArr) {
                m2234(obj);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2237(short[] sArr) {
        if (sArr == null) {
            this.f876 *= this.f875;
        } else {
            for (short s : sArr) {
                m2236(s);
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0370 m2221(boolean[] zArr) {
        if (zArr == null) {
            this.f876 *= this.f875;
        } else {
            for (boolean z : zArr) {
                m2220(z);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, java.lang.InternalError] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m2210(Object th, Class<?> cls, C0370 c0370, boolean z, String[] strArr) {
        ?? m2209 = m2209(th);
        if (m2209 != 0) {
            return;
        }
        try {
            m2217(th);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!C0166.m853((Object[]) strArr, (Object) field.getName()) && field.getName().indexOf(36) == -1 && ((z || !Modifier.isTransient(field.getModifiers())) && (m2209 = Modifier.isStatic(field.getModifiers())) == 0)) {
                    try {
                        c0370.m2234(field.get(th));
                    } catch (IllegalAccessException unused) {
                        m2209 = new InternalError("Unexpected IllegalAccessException");
                        throw m2209;
                    }
                }
            }
        } finally {
            m2218(th);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m2211(int i, int i2, Object obj) {
        return m2213(i, i2, obj, false, null, new String[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m2212(int i, int i2, Object obj, boolean z) {
        return m2213(i, i2, obj, z, null, new String[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> int m2213(int i, int i2, T t, boolean z, Class<? super T> cls, String... strArr) {
        if (t != null) {
            C0370 c0370 = new C0370(i, i2);
            Class<?> cls2 = t.getClass();
            Class<? super Object> cls3 = cls2;
            m2210(t, cls2, c0370, z, strArr);
            while (cls3.getSuperclass() != null && cls3 != cls) {
                Class<? super Object> superclass = cls3.getSuperclass();
                cls3 = superclass;
                m2210(t, superclass, c0370, z, strArr);
            }
            return c0370.f876;
        }
        throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m2215(Object obj, Collection<String> collection) {
        return m2216(obj, C0046.m440(collection));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m2214(Object obj, boolean z) {
        return m2213(17, 37, obj, z, null, new String[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m2216(Object obj, String... strArr) {
        return m2213(17, 37, obj, false, null, strArr);
    }
}
