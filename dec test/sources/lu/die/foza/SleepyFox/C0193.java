package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
/* renamed from: lu.die.foza.SleepyFox.ޗ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޗ.class */
public class C0193 implements AbstractC0177<Integer> {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int f298 = 0;

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1115(byte b, byte b2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = b < b2 ? -1 : b > b2 ? 1 : 0;
        return this;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public int m1129() {
        return this.f298;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0177
    /* renamed from: Ԩ  reason: contains not printable characters */
    public Integer mo536() {
        return Integer.valueOf(m1129());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m1102(Object obj, Object obj2) {
        return m1106(obj, obj2, false, null, new String[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1114(char c, char c2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = c < c2 ? -1 : c > c2 ? 1 : 0;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1116(double d, double d2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = Double.compare(d, d2);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1117(float f, float f2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = Float.compare(f, f2);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1112(int i, int i2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = i < i2 ? -1 : i > i2 ? 1 : 0;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1111(long j, long j2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = j < j2 ? -1 : j > j2 ? 1 : 0;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1109(Object obj, Object obj2) {
        return m1110(obj, obj2, (Comparator<?>) null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1110(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f298 == 0 && obj != obj2) {
            if (obj == null) {
                this.f298 = -1;
                return this;
            } else if (obj2 == null) {
                this.f298 = 1;
                return this;
            } else {
                if (obj.getClass().isArray()) {
                    if (obj instanceof long[]) {
                        m1121((long[]) obj, (long[]) obj2);
                    } else if (obj instanceof int[]) {
                        m1122((int[]) obj, (int[]) obj2);
                    } else if (obj instanceof short[]) {
                        m1123((short[]) obj, (short[]) obj2);
                    } else if (obj instanceof char[]) {
                        m1124((char[]) obj, (char[]) obj2);
                    } else if (obj instanceof byte[]) {
                        m1125((byte[]) obj, (byte[]) obj2);
                    } else if (obj instanceof double[]) {
                        m1126((double[]) obj, (double[]) obj2);
                    } else if (obj instanceof float[]) {
                        m1127((float[]) obj, (float[]) obj2);
                    } else if (obj instanceof boolean[]) {
                        m1128((boolean[]) obj, (boolean[]) obj2);
                    } else {
                        m1120((Object[]) obj, (Object[]) obj2, comparator);
                    }
                } else if (comparator == null) {
                    this.f298 = ((Comparable) obj).compareTo(obj2);
                } else {
                    this.f298 = comparator.compare(obj, obj2);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1113(short s, short s2) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = s < s2 ? -1 : s > s2 ? 1 : 0;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1118(boolean z, boolean z2) {
        if (this.f298 == 0 && z != z2) {
            if (!z) {
                this.f298 = -1;
            } else {
                this.f298 = 1;
            }
            return this;
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1125(byte[] bArr, byte[] bArr2) {
        if (this.f298 == 0 && bArr != bArr2) {
            if (bArr == null) {
                this.f298 = -1;
                return this;
            } else if (bArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (bArr.length != bArr2.length) {
                this.f298 = bArr.length < bArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < bArr.length && this.f298 == 0; i++) {
                    m1115(bArr[i], bArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1124(char[] cArr, char[] cArr2) {
        if (this.f298 == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.f298 = -1;
                return this;
            } else if (cArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (cArr.length != cArr2.length) {
                this.f298 = cArr.length < cArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < cArr.length && this.f298 == 0; i++) {
                    m1114(cArr[i], cArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1126(double[] dArr, double[] dArr2) {
        if (this.f298 == 0 && dArr != dArr2) {
            if (dArr == null) {
                this.f298 = -1;
                return this;
            } else if (dArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (dArr.length != dArr2.length) {
                this.f298 = dArr.length < dArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < dArr.length && this.f298 == 0; i++) {
                    m1116(dArr[i], dArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1127(float[] fArr, float[] fArr2) {
        if (this.f298 == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.f298 = -1;
                return this;
            } else if (fArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (fArr.length != fArr2.length) {
                this.f298 = fArr.length < fArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < fArr.length && this.f298 == 0; i++) {
                    m1117(fArr[i], fArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1122(int[] iArr, int[] iArr2) {
        if (this.f298 == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.f298 = -1;
                return this;
            } else if (iArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (iArr.length != iArr2.length) {
                this.f298 = iArr.length < iArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < iArr.length && this.f298 == 0; i++) {
                    m1112(iArr[i], iArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1121(long[] jArr, long[] jArr2) {
        if (this.f298 == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.f298 = -1;
                return this;
            } else if (jArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (jArr.length != jArr2.length) {
                this.f298 = jArr.length < jArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < jArr.length && this.f298 == 0; i++) {
                    m1111(jArr[i], jArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1119(Object[] objArr, Object[] objArr2) {
        return m1120(objArr, objArr2, (Comparator<?>) null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1120(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f298 == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.f298 = -1;
                return this;
            } else if (objArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (objArr.length != objArr2.length) {
                this.f298 = objArr.length < objArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < objArr.length && this.f298 == 0; i++) {
                    m1110(objArr[i], objArr2[i], comparator);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1123(short[] sArr, short[] sArr2) {
        if (this.f298 == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.f298 = -1;
                return this;
            } else if (sArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (sArr.length != sArr2.length) {
                this.f298 = sArr.length < sArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < sArr.length && this.f298 == 0; i++) {
                    m1113(sArr[i], sArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1128(boolean[] zArr, boolean[] zArr2) {
        if (this.f298 == 0 && zArr != zArr2) {
            if (zArr == null) {
                this.f298 = -1;
                return this;
            } else if (zArr2 == null) {
                this.f298 = 1;
                return this;
            } else if (zArr.length != zArr2.length) {
                this.f298 = zArr.length < zArr2.length ? -1 : 1;
                return this;
            } else {
                for (int i = 0; i < zArr.length && this.f298 == 0; i++) {
                    m1118(zArr[i], zArr2[i]);
                }
                return this;
            }
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0193 m1108(int i) {
        if (this.f298 != 0) {
            return this;
        }
        this.f298 = i;
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m1107(Object obj, Object obj2, Class<?> cls, C0193 c0193, boolean z, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i = 0; i < declaredFields.length && c0193.f298 == 0; i++) {
            Field field = declaredFields[i];
            if (!C0166.m853((Object[]) strArr, (Object) field.getName()) && field.getName().indexOf(36) == -1 && ((z || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    c0193.m1109(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1104(Object obj, Object obj2, Collection<String> collection) {
        return m1105(obj, obj2, C0046.m440(collection));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1103(Object obj, Object obj2, boolean z) {
        return m1106(obj, obj2, z, null, new String[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1106(Object obj, Object obj2, boolean z, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null || obj2 == null) {
            throw null;
        }
        Class<?> cls2 = obj.getClass();
        Class<?> cls3 = cls2;
        if (cls2.isInstance(obj2)) {
            C0193 c0193 = new C0193();
            m1107(obj, obj2, cls3, c0193, z, strArr);
            while (cls3.getSuperclass() != null && cls3 != cls) {
                cls3 = cls3.getSuperclass();
                m1107(obj, obj2, cls3, c0193, z, strArr);
            }
            return c0193.f298;
        }
        throw new ClassCastException();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1105(Object obj, Object obj2, String... strArr) {
        return m1106(obj, obj2, false, null, strArr);
    }
}
