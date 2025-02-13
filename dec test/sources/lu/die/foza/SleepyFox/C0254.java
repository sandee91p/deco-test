package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* renamed from: lu.die.foza.SleepyFox.ࡦ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡦ.class */
public class C0254 implements AbstractC0177<Boolean> {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final ThreadLocal<Set<AbstractC0493<C0381, C0381>>> f520 = new ThreadLocal<>();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean f521 = true;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static Set<AbstractC0493<C0381, C0381>> m1489() {
        return f520.get();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1506(byte b, byte b2) {
        if (!this.f521) {
            return this;
        }
        this.f521 = b == b2;
        return this;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public boolean m1519() {
        return this.f521;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0177
    /* renamed from: Ԩ  reason: contains not printable characters */
    public Boolean mo536() {
        return Boolean.valueOf(m1519());
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public void m1522() {
        this.f521 = true;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static AbstractC0493<C0381, C0381> m1490(Object obj, Object obj2) {
        return AbstractC0493.of(new C0381(obj), new C0381(obj2));
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m1491(Object obj, Object obj2) {
        Set<AbstractC0493<C0381, C0381>> m1489 = m1489();
        AbstractC0493<C0381, C0381> m1490 = m1490(obj, obj2);
        return m1489 != null && (m1489.contains(m1490) || m1489.contains(AbstractC0493.of(m1490.getLeft(), m1490.getRight())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Class<lu.die.foza.SleepyFox.ࡦ>] */
    /* renamed from: Ԫ  reason: contains not printable characters */
    public static void m1492(Object obj, Object obj2) {
        synchronized (C0254.class) {
            if (m1489() == null) {
                f520.set(new HashSet());
            }
        }
        m1489().add(m1490(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class<lu.die.foza.SleepyFox.ࡦ>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m1493(Object obj, Object obj2) {
        Set<AbstractC0493<C0381, C0381>> m1489 = m1489();
        if (m1489 != null) {
            m1489.remove(m1490(obj, obj2));
            ?? r0 = C0254.class;
            synchronized (r0) {
                Set<AbstractC0493<C0381, C0381>> m14892 = m1489();
                if (m14892 != null && m14892.isEmpty()) {
                    f520.remove();
                }
                r0 = r0;
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1505(char c, char c2) {
        if (!this.f521) {
            return this;
        }
        this.f521 = c == c2;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1507(double d, double d2) {
        return !this.f521 ? this : m1502(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m1521(boolean z) {
        this.f521 = z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1508(float f, float f2) {
        return !this.f521 ? this : m1503(Float.floatToIntBits(f), Float.floatToIntBits(f2));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1503(int i, int i2) {
        if (!this.f521) {
            return this;
        }
        this.f521 = i == i2;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1502(long j, long j2) {
        if (!this.f521) {
            return this;
        }
        this.f521 = j == j2;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1501(Object obj, Object obj2) {
        if (this.f521 && obj != obj2) {
            if (obj == null || obj2 == null) {
                m1521(false);
                return this;
            }
            if (!obj.getClass().isArray()) {
                this.f521 = obj.equals(obj2);
            } else if (obj.getClass() != obj2.getClass()) {
                m1521(false);
            } else if (obj instanceof long[]) {
                m1511((long[]) obj, (long[]) obj2);
            } else if (obj instanceof int[]) {
                m1512((int[]) obj, (int[]) obj2);
            } else if (obj instanceof short[]) {
                m1513((short[]) obj, (short[]) obj2);
            } else if (obj instanceof char[]) {
                m1514((char[]) obj, (char[]) obj2);
            } else if (obj instanceof byte[]) {
                m1515((byte[]) obj, (byte[]) obj2);
            } else if (obj instanceof double[]) {
                m1516((double[]) obj, (double[]) obj2);
            } else if (obj instanceof float[]) {
                m1517((float[]) obj, (float[]) obj2);
            } else if (obj instanceof boolean[]) {
                m1518((boolean[]) obj, (boolean[]) obj2);
            } else {
                m1510((Object[]) obj, (Object[]) obj2);
            }
            return this;
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1504(short s, short s2) {
        if (!this.f521) {
            return this;
        }
        this.f521 = s == s2;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1509(boolean z, boolean z2) {
        if (!this.f521) {
            return this;
        }
        this.f521 = z == z2;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1515(byte[] bArr, byte[] bArr2) {
        if (this.f521 && bArr != bArr2) {
            if (bArr == null || bArr2 == null) {
                m1521(false);
                return this;
            } else if (bArr.length != bArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < bArr.length && this.f521; i++) {
                    m1506(bArr[i], bArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1514(char[] cArr, char[] cArr2) {
        if (this.f521 && cArr != cArr2) {
            if (cArr == null || cArr2 == null) {
                m1521(false);
                return this;
            } else if (cArr.length != cArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < cArr.length && this.f521; i++) {
                    m1505(cArr[i], cArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1516(double[] dArr, double[] dArr2) {
        if (this.f521 && dArr != dArr2) {
            if (dArr == null || dArr2 == null) {
                m1521(false);
                return this;
            } else if (dArr.length != dArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < dArr.length && this.f521; i++) {
                    m1507(dArr[i], dArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1517(float[] fArr, float[] fArr2) {
        if (this.f521 && fArr != fArr2) {
            if (fArr == null || fArr2 == null) {
                m1521(false);
                return this;
            } else if (fArr.length != fArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < fArr.length && this.f521; i++) {
                    m1508(fArr[i], fArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1512(int[] iArr, int[] iArr2) {
        if (this.f521 && iArr != iArr2) {
            if (iArr == null || iArr2 == null) {
                m1521(false);
                return this;
            } else if (iArr.length != iArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < iArr.length && this.f521; i++) {
                    m1503(iArr[i], iArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1511(long[] jArr, long[] jArr2) {
        if (this.f521 && jArr != jArr2) {
            if (jArr == null || jArr2 == null) {
                m1521(false);
                return this;
            } else if (jArr.length != jArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < jArr.length && this.f521; i++) {
                    m1502(jArr[i], jArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1510(Object[] objArr, Object[] objArr2) {
        if (this.f521 && objArr != objArr2) {
            if (objArr == null || objArr2 == null) {
                m1521(false);
                return this;
            } else if (objArr.length != objArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < objArr.length && this.f521; i++) {
                    m1501(objArr[i], objArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1513(short[] sArr, short[] sArr2) {
        if (this.f521 && sArr != sArr2) {
            if (sArr == null || sArr2 == null) {
                m1521(false);
                return this;
            } else if (sArr.length != sArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < sArr.length && this.f521; i++) {
                    m1504(sArr[i], sArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1518(boolean[] zArr, boolean[] zArr2) {
        if (this.f521 && zArr != zArr2) {
            if (zArr == null || zArr2 == null) {
                m1521(false);
                return this;
            } else if (zArr.length != zArr2.length) {
                m1521(false);
                return this;
            } else {
                for (int i = 0; i < zArr.length && this.f521; i++) {
                    m1509(zArr[i], zArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0254 m1500(boolean z) {
        if (!this.f521) {
            return this;
        }
        this.f521 = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, java.lang.InternalError] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m1498(Object th, Object obj, Class<?> cls, C0254 c0254, boolean z, String[] strArr) {
        ?? m1491 = m1491(th, obj);
        if (m1491 != 0) {
            return;
        }
        try {
            m1492(th, obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i = 0; i < declaredFields.length && c0254.f521; i++) {
                Field field = declaredFields[i];
                if (!C0166.m853((Object[]) strArr, (Object) field.getName()) && field.getName().indexOf(36) == -1 && ((z || !Modifier.isTransient(field.getModifiers())) && (m1491 = Modifier.isStatic(field.getModifiers())) == 0)) {
                    try {
                        c0254.m1501(field.get(th), field.get(obj));
                    } catch (IllegalAccessException unused) {
                        m1491 = new InternalError("Unexpected IllegalAccessException");
                        throw m1491;
                    }
                }
            }
        } finally {
            m1493(th, obj);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1494(Object obj, Object obj2, Collection<String> collection) {
        return m1495(obj, obj2, C0046.m440(collection));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1496(Object obj, Object obj2, boolean z) {
        return m1497(obj, obj2, z, null, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r2.isInstance(r7) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0041, code lost:
        if (r12.isInstance(r8) == false) goto L13;
     */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1497(java.lang.Object r7, java.lang.Object r8, boolean r9, java.lang.Class<?> r10, java.lang.String... r11) {
        /*
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r7
            if (r0 == 0) goto L8f
            r0 = r8
            if (r0 != 0) goto L12
            goto L8f
        L12:
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            r1 = r0
            r12 = r1
            r1 = r8
            r2 = r1
            java.lang.Class r2 = r2.getClass()
            r13 = r2
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L32
            r0 = r13
            r1 = r7
            boolean r0 = r0.isInstance(r1)
            if (r0 != 0) goto L4b
            goto L47
        L32:
            r0 = r13
            r1 = r7
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L8d
            r0 = r12
            r1 = r8
            boolean r0 = r0.isInstance(r1)
            if (r0 != 0) goto L47
            goto L4b
        L47:
            r0 = r13
            r12 = r0
        L4b:
            r0 = r7
            lu.die.foza.SleepyFox.ࡦ r1 = new lu.die.foza.SleepyFox.ࡦ
            r2 = r1
            r13 = r2
            r1.<init>()
            r1 = r8
            r2 = r12
            r3 = r13
            r4 = r9
            r5 = r11
            m1498(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L8a
        L60:
            r0 = r12
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L8a
            if (r0 == 0) goto L84
            r0 = r12
            r1 = r10
            if (r0 == r1) goto L84
            r0 = r7
            r1 = r12
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L8a
            r12 = r1
            r1 = r8
            r2 = r12
            r3 = r13
            r4 = r9
            r5 = r11
            m1498(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L8a
            goto L60
        L84:
            r0 = r13
            boolean r0 = r0.f521
            return r0
        L8a:
            r0 = 0
            return r0
        L8d:
            r0 = 0
            return r0
        L8f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0254.m1497(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[]):boolean");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1495(Object obj, Object obj2, String... strArr) {
        return m1497(obj, obj2, false, null, strArr);
    }
}
