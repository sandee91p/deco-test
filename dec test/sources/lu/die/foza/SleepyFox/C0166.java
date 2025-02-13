package lu.die.foza.SleepyFox;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: lu.die.foza.SleepyFox.ކ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ކ.class */
public class C0166 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Object[] f232 = new Object[0];

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Class<?>[] f233 = new Class[0];

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String[] f234 = new String[0];

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final long[] f235 = new long[0];

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final Long[] f236 = new Long[0];

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final int[] f237 = new int[0];

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final Integer[] f238 = new Integer[0];

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final short[] f239 = new short[0];

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final Short[] f240 = new Short[0];

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final byte[] f241 = new byte[0];

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final Byte[] f242 = new Byte[0];

    /* renamed from: ֏  reason: contains not printable characters */
    public static final double[] f243 = new double[0];

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final Double[] f244 = new Double[0];

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final float[] f245 = new float[0];

    /* renamed from: ހ  reason: contains not printable characters */
    public static final Float[] f246 = new Float[0];

    /* renamed from: ށ  reason: contains not printable characters */
    public static final boolean[] f247 = new boolean[0];

    /* renamed from: ނ  reason: contains not printable characters */
    public static final Boolean[] f248 = new Boolean[0];

    /* renamed from: ރ  reason: contains not printable characters */
    public static final char[] f249 = new char[0];

    /* renamed from: ބ  reason: contains not printable characters */
    public static final Character[] f250 = new Character[0];

    /* renamed from: ޅ  reason: contains not printable characters */
    public static final int f251 = -1;

    /* renamed from: ԭ  reason: contains not printable characters */
    public static Map<Object, Object> m791(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap((int) (objArr.length * 1.5d));
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                hashMap.put(entry.getKey(), entry.getValue());
            } else if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Array element " + i + ", '" + obj + "', is neither of type Map.Entry nor an Array");
            } else {
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length < 2) {
                    throw new IllegalArgumentException("Array element " + i + ", '" + obj + "', has a length less than 2");
                }
                hashMap.put(objArr2[0], objArr2[1]);
            }
        }
        return hashMap;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m874(byte[] bArr, byte b) {
        return m875(bArr, b, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m876(byte[] bArr, byte b) {
        return m877(bArr, b, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m878(byte[] bArr, byte b) {
        return m875(bArr, b, 0) != -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m969(Object obj, int i, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i != 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Length: 0");
            }
            Object newInstance = Array.newInstance(cls, 1);
            Array.set(newInstance, 0, obj2);
            return newInstance;
        }
        int length = Array.getLength(obj);
        if (i > length || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + length);
        }
        Object newInstance2 = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance2, 0, i);
        Array.set(newInstance2, i, obj2);
        if (i < length) {
            System.arraycopy(obj, i, newInstance2, i + 1, length - i);
        }
        return newInstance2;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static int[] m982(int[] iArr, int i) {
        return (int[]) m988((Object) iArr, i);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static int[] m983(int[] iArr, int i) {
        int m860 = m860(iArr, i, 0);
        if (m860 == -1) {
            return m795(iArr);
        }
        return (int[]) m988((Object) iArr, m860);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m869(char[] cArr, char c) {
        return m870(cArr, c, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m871(char[] cArr, char c) {
        return m872(cArr, c, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m873(char[] cArr, char c) {
        return m870(cArr, c, 0) != -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m952(byte[] bArr, byte b) {
        byte[] bArr2 = (byte[]) m959((Object) bArr, (Class<?>) Byte.TYPE);
        bArr2[bArr2.length - 1] = b;
        return bArr2;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static byte[] m975(byte[] bArr, byte b) {
        int m875 = m875(bArr, b, 0);
        if (m875 == -1) {
            return m798(bArr);
        }
        return (byte[]) m988((Object) bArr, m875);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m879(double[] dArr, double d) {
        return m881(dArr, d, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m883(double[] dArr, double d) {
        return m885(dArr, d, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m887(double[] dArr, double d) {
        return m881(dArr, d, 0) != -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m963(byte[] bArr, int i, byte b) {
        return (byte[]) m969(bArr, i, Byte.valueOf(b), Byte.TYPE);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static <T> T[] m792(T... tArr) {
        return tArr;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m889(float[] fArr, float f) {
        return m890(fArr, f, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m891(float[] fArr, float f) {
        return m892(fArr, f, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m893(float[] fArr, float f) {
        return m890(fArr, f, 0) != -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m953(char[] cArr, char c) {
        char[] cArr2 = (char[]) m959((Object) cArr, (Class<?>) Character.TYPE);
        cArr2[cArr2.length - 1] = c;
        return cArr2;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m859(int[] iArr, int i) {
        return m860(iArr, i, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m861(int[] iArr, int i) {
        return m862(iArr, i, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m863(int[] iArr, int i) {
        return m860(iArr, i, 0) != -1;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Boolean[] m922(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return f248;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = zArr[i] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m962(char[] cArr, int i, char c) {
        return (char[]) m969(cArr, i, Character.valueOf(c), Character.TYPE);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static char[] m977(char[] cArr, char c) {
        int m870 = m870(cArr, c, 0);
        if (m870 == -1) {
            return m797(cArr);
        }
        return (char[]) m988((Object) cArr, m870);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m854(long[] jArr, long j) {
        return m855(jArr, j, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m856(long[] jArr, long j) {
        return m857(jArr, j, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m858(long[] jArr, long j) {
        return m855(jArr, j, 0) != -1;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Byte[] m913(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f242;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m954(double[] dArr, double d) {
        double[] dArr2 = (double[]) m959((Object) dArr, (Class<?>) Double.TYPE);
        dArr2[dArr2.length - 1] = d;
        return dArr2;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m849(Object[] objArr, Object obj) {
        return m850(objArr, obj, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m851(Object[] objArr, Object obj) {
        return m852(objArr, obj, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m853(Object[] objArr, Object obj) {
        return m850(objArr, obj, 0) != -1;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Character[] m901(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return f250;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m968(double[] dArr, int i, double d) {
        return (double[]) m969(dArr, i, Double.valueOf(d), Double.TYPE);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m864(short[] sArr, short s) {
        return m865(sArr, s, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m866(short[] sArr, short s) {
        return m867(sArr, s, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m868(short[] sArr, short s) {
        return m865(sArr, s, 0) != -1;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Double[] m916(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f244;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m955(float[] fArr, float f) {
        float[] fArr2 = (float[]) m959((Object) fArr, (Class<?>) Float.TYPE);
        fArr2[fArr2.length - 1] = f;
        return fArr2;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static double[] m979(double[] dArr, double d) {
        int m881 = m881(dArr, d, 0);
        if (m881 == -1) {
            return m799(dArr);
        }
        return (double[]) m988((Object) dArr, m881);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m894(boolean[] zArr, boolean z) {
        return m895(zArr, z, 0);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m896(boolean[] zArr, boolean z) {
        return m897(zArr, z, Integer.MAX_VALUE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m898(boolean[] zArr, boolean z) {
        return m895(zArr, z, 0) != -1;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Float[] m919(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f246;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m967(float[] fArr, int i, float f) {
        return (float[]) m969(fArr, i, Float.valueOf(f), Float.TYPE);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m789(Object obj) {
        return new C0370().m2234(obj).m2239();
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static byte[] m808(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? f241 : bArr;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Integer[] m907(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return f238;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m937(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int[] m956(int[] iArr, int i) {
        int[] iArr2 = (int[]) m959((Object) iArr, (Class<?>) Integer.TYPE);
        iArr2[iArr2.length - 1] = i;
        return iArr2;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static char[] m807(char[] cArr) {
        return (cArr == null || cArr.length == 0) ? f249 : cArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m880(double[] dArr, double d, double d2) {
        return m882(dArr, d, 0, d2);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Long[] m904(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return f236;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m936(char[] cArr) {
        return (cArr == null || cArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int[] m965(int[] iArr, int i, int i2) {
        return (int[]) m969(iArr, i, Integer.valueOf(i2), Integer.TYPE);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static float[] m981(float[] fArr, float f) {
        int m890 = m890(fArr, f, 0);
        if (m890 == -1) {
            return m800(fArr);
        }
        return (float[]) m988((Object) fArr, m890);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static double[] m809(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? f243 : dArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m860(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < iArr.length) {
            if (i == iArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Short[] m910(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return f240;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m938(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m966(long[] jArr, int i, long j) {
        return (long[]) m969(jArr, i, Long.valueOf(j), Long.TYPE);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static float[] m810(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? f245 : fArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m928(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m939(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m957(long[] jArr, long j) {
        long[] jArr2 = (long[]) m959((Object) jArr, (Class<?>) Long.TYPE);
        jArr2[jArr2.length - 1] = j;
        return jArr2;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int[] m805(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? f237 : iArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m927(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m934(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m960(T[] tArr, int i, T t) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t == null) {
            throw new IllegalArgumentException("Array and element cannot both be null");
        } else {
            cls = t.getClass();
        }
        return (T[]) ((Object[]) m969(tArr, i, t, cls));
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static long[] m985(long[] jArr, long j) {
        int m855 = m855(jArr, j, 0);
        if (m855 == -1) {
            return m794(jArr);
        }
        return (long[]) m988((Object) jArr, m855);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static long[] m804(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? f235 : jArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m929(double[] dArr) {
        return dArr == null || dArr.length == 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m933(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m950(T[] tArr, T t) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else if (t == null) {
            throw new IllegalArgumentException("Arguments cannot both be null");
        } else {
            cls = t.getClass();
        }
        T[] tArr2 = (T[]) ((Object[]) m959((Object) tArr, cls));
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static Object[] m802(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? f232 : objArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m930(float[] fArr) {
        return fArr == null || fArr.length == 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static <T> boolean m932(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m964(short[] sArr, int i, short s) {
        return (short[]) m969(sArr, i, Short.valueOf(s), Short.TYPE);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static short[] m806(short[] sArr) {
        return (sArr == null || sArr.length == 0) ? f239 : sArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m925(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m935(short[] sArr) {
        return (sArr == null || sArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m958(short[] sArr, short s) {
        short[] sArr2 = (short[]) m959((Object) sArr, (Class<?>) Short.TYPE);
        sArr2[sArr2.length - 1] = s;
        return sArr2;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static <T> T[] m971(T[] tArr, Object obj) {
        int m850 = m850(tArr, obj, 0);
        if (m850 == -1) {
            return (T[]) m793((Object[]) tArr);
        }
        return (T[]) ((Object[]) m988((Object) tArr, m850));
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static boolean[] m811(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? f247 : zArr;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m924(long[] jArr) {
        return jArr == null || jArr.length == 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m940(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? false : true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m961(boolean[] zArr, int i, boolean z) {
        return (boolean[]) m969(zArr, i, Boolean.valueOf(z), Boolean.TYPE);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m884(double[] dArr, double d, double d2) {
        return m886(dArr, d, Integer.MAX_VALUE, d2);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m923(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m951(boolean[] zArr, boolean z) {
        boolean[] zArr2 = (boolean[]) m959((Object) zArr, (Class<?>) Boolean.TYPE);
        zArr2[zArr2.length - 1] = z;
        return zArr2;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int[] m996(int[] iArr, int... iArr2) {
        int m860;
        if (m925(iArr) || m925(iArr2)) {
            return m795(iArr);
        }
        HashMap hashMap = new HashMap(iArr2.length);
        for (int i : iArr2) {
            Integer valueOf = Integer.valueOf(i);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int i2 = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i3 = 0; i3 < intValue && (m860 = m860(iArr, num.intValue(), i2)) >= 0; i3++) {
                i2 = m860 + 1;
                hashSet.add(Integer.valueOf(m860));
            }
        }
        return m995(iArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int[] m822(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > iArr.length) {
            i2 = iArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f237;
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i3);
        return iArr2;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m862(int[] iArr, int i, int i2) {
        if (iArr != null && i2 >= 0) {
            if (i2 >= iArr.length) {
                i2 = iArr.length - 1;
            }
            while (i2 >= 0) {
                if (i == iArr[i2]) {
                    return i2;
                }
                i2--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m926(short[] sArr) {
        return sArr == null || sArr.length == 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m944(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return m798(bArr2);
        }
        if (bArr2 == null) {
            return m798(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static short[] m987(short[] sArr, short s) {
        int m865 = m865(sArr, s, 0);
        if (m865 == -1) {
            return m796(sArr);
        }
        return (short[]) m988((Object) sArr, m865);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m931(boolean[] zArr) {
        return zArr == null || zArr.length == 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m943(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return m797(cArr2);
        }
        if (cArr2 == null) {
            return m797(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int[] m995(int[] iArr, int... iArr2) {
        return (int[]) m1007((Object) iArr, m795(iArr2));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m834(byte[] bArr, byte[] bArr2) {
        if (bArr != null || bArr2 == null || bArr2.length <= 0) {
            if (bArr2 == null && bArr != null && bArr.length > 0) {
                return false;
            }
            return bArr == null || bArr2 == null || bArr.length == bArr2.length;
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m949(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return m799(dArr2);
        }
        if (dArr2 == null) {
            return m799(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static byte[] m992(byte[] bArr, byte... bArr2) {
        int m875;
        if (m928(bArr) || m928(bArr2)) {
            return m798(bArr);
        }
        HashMap hashMap = new HashMap(bArr2.length);
        for (byte b : bArr2) {
            Byte valueOf = Byte.valueOf(b);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Byte b2 = (Byte) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m875 = m875(bArr, b2.byteValue(), i)) >= 0; i2++) {
                i = m875 + 1;
                hashSet.add(Integer.valueOf(m875));
            }
        }
        return m991(bArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m833(char[] cArr, char[] cArr2) {
        if (cArr != null || cArr2 == null || cArr2.length <= 0) {
            if (cArr2 == null && cArr != null && cArr.length > 0) {
                return false;
            }
            return cArr == null || cArr2 == null || cArr.length == cArr2.length;
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m948(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return m800(fArr2);
        }
        if (fArr2 == null) {
            return m800(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static boolean[] m973(boolean[] zArr, boolean z) {
        int m895 = m895(zArr, z, 0);
        if (m895 == -1) {
            return m801(zArr);
        }
        return (boolean[]) m988((Object) zArr, m895);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static char[] m998(char[] cArr, char... cArr2) {
        int m870;
        if (m927(cArr) || m927(cArr2)) {
            return m797(cArr);
        }
        HashMap hashMap = new HashMap(cArr2.length);
        for (char c : cArr2) {
            Character valueOf = Character.valueOf(c);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Character ch = (Character) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m870 = m870(cArr, ch.charValue(), i)) >= 0; i2++) {
                i = m870 + 1;
                hashSet.add(Integer.valueOf(m870));
            }
        }
        return m997(cArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m835(double[] dArr, double[] dArr2) {
        if (dArr != null || dArr2 == null || dArr2.length <= 0) {
            if (dArr2 == null && dArr != null && dArr.length > 0) {
                return false;
            }
            return dArr == null || dArr2 == null || dArr.length == dArr2.length;
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int[] m946(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return m795(iArr2);
        }
        if (iArr2 == null) {
            return m795(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static double[] m1004(double[] dArr, double... dArr2) {
        int m881;
        if (m929(dArr) || m929(dArr2)) {
            return m799(dArr);
        }
        HashMap hashMap = new HashMap(dArr2.length);
        for (double d : dArr2) {
            Double valueOf = Double.valueOf(d);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Double d2 = (Double) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m881 = m881(dArr, d2.doubleValue(), i)) >= 0; i2++) {
                i = m881 + 1;
                hashSet.add(Integer.valueOf(m881));
            }
        }
        return m1003(dArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m836(float[] fArr, float[] fArr2) {
        if (fArr != null || fArr2 == null || fArr2.length <= 0) {
            if (fArr2 == null && fArr != null && fArr.length > 0) {
                return false;
            }
            return fArr == null || fArr2 == null || fArr.length == fArr2.length;
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m947(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return m794(jArr2);
        }
        if (jArr2 == null) {
            return m794(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static float[] m1002(float[] fArr, float... fArr2) {
        int m890;
        if (m930(fArr) || m930(fArr2)) {
            return m800(fArr);
        }
        HashMap hashMap = new HashMap(fArr2.length);
        for (float f : fArr2) {
            Float valueOf = Float.valueOf(f);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Float f2 = (Float) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m890 = m890(fArr, f2.floatValue(), i)) >= 0; i2++) {
                i = m890 + 1;
                hashSet.add(Integer.valueOf(m890));
            }
        }
        return m1001(fArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m831(int[] iArr, int[] iArr2) {
        if (iArr != null || iArr2 == null || iArr2.length <= 0) {
            if (iArr2 == null && iArr != null && iArr.length > 0) {
                return false;
            }
            return iArr == null || iArr2 == null || iArr.length == iArr2.length;
        }
        return false;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m845(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m941(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) m793((Object[]) tArr2);
        }
        if (tArr2 == null) {
            return (T[]) m793((Object[]) tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (componentType.isAssignableFrom(componentType2)) {
                throw e;
            }
            throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e);
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static long[] m1000(long[] jArr, long... jArr2) {
        int m855;
        if (m924(jArr) || m924(jArr2)) {
            return m794(jArr);
        }
        HashMap hashMap = new HashMap(jArr2.length);
        for (long j : jArr2) {
            Long valueOf = Long.valueOf(j);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Long l = (Long) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m855 = m855(jArr, l.longValue(), i)) >= 0; i2++) {
                i = m855 + 1;
                hashSet.add(Integer.valueOf(m855));
            }
        }
        return m999(jArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m830(long[] jArr, long[] jArr2) {
        if (jArr != null || jArr2 == null || jArr2.length <= 0) {
            if (jArr2 == null && jArr != null && jArr.length > 0) {
                return false;
            }
            return jArr == null || jArr2 == null || jArr.length == jArr2.length;
        }
        return false;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m844(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i = 0; length > i; i++) {
            char c = cArr[length];
            cArr[length] = cArr[i];
            cArr[i] = c;
            length--;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m945(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return m796(sArr2);
        }
        if (sArr2 == null) {
            return m796(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static <T> T[] m990(T[] tArr, T... tArr2) {
        int m850;
        if (m923((Object[]) tArr) || m923((Object[]) tArr2)) {
            return (T[]) m793((Object[]) tArr);
        }
        HashMap hashMap = new HashMap(tArr2.length);
        for (T t : tArr2) {
            C0463 c0463 = (C0463) hashMap.get(t);
            if (c0463 == null) {
                hashMap.put(t, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m850 = m850(tArr, key, i)) >= 0; i2++) {
                i = m850 + 1;
                hashSet.add(Integer.valueOf(m850));
            }
        }
        return (T[]) m989((Object[]) tArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m829(Object[] objArr, Object[] objArr2) {
        if (objArr != null || objArr2 == null || objArr2.length <= 0) {
            if (objArr2 == null && objArr != null && objArr.length > 0) {
                return false;
            }
            return objArr == null || objArr2 == null || objArr.length == objArr2.length;
        }
        return false;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m846(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i = 0; length > i; i++) {
            double d = dArr[length];
            dArr[length] = dArr[i];
            dArr[i] = d;
            length--;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m942(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return m801(zArr2);
        }
        if (zArr2 == null) {
            return m801(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static short[] m994(short[] sArr, short... sArr2) {
        int m865;
        if (m926(sArr) || m926(sArr2)) {
            return m796(sArr);
        }
        HashMap hashMap = new HashMap(sArr2.length);
        for (short s : sArr2) {
            Short valueOf = Short.valueOf(s);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Short sh = (Short) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m865 = m865(sArr, sh.shortValue(), i)) >= 0; i2++) {
                i = m865 + 1;
                hashSet.add(Integer.valueOf(m865));
            }
        }
        return m993(sArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m798(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m832(short[] sArr, short[] sArr2) {
        if (sArr != null || sArr2 == null || sArr2.length <= 0) {
            if (sArr2 == null && sArr != null && sArr.length > 0) {
                return false;
            }
            return sArr == null || sArr2 == null || sArr.length == sArr2.length;
        }
        return false;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m847(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i = 0; length > i; i++) {
            float f = fArr[length];
            fArr[length] = fArr[i];
            fArr[i] = f;
            length--;
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean[] m1006(boolean[] zArr, boolean... zArr2) {
        int m895;
        if (m931(zArr) || m931(zArr2)) {
            return m801(zArr);
        }
        HashMap hashMap = new HashMap(zArr2.length);
        for (boolean z : zArr2) {
            Boolean valueOf = Boolean.valueOf(z);
            C0463 c0463 = (C0463) hashMap.get(valueOf);
            if (c0463 == null) {
                hashMap.put(valueOf, new C0463(1));
            } else {
                c0463.increment();
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Boolean bool = (Boolean) entry.getKey();
            int i = 0;
            int intValue = ((C0463) entry.getValue()).intValue();
            for (int i2 = 0; i2 < intValue && (m895 = m895(zArr, bool.booleanValue(), i)) >= 0; i2++) {
                i = m895 + 1;
                hashSet.add(Integer.valueOf(m895));
            }
        }
        return m1005(zArr, m1008((HashSet<Integer>) hashSet));
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m787(Object obj) {
        return m788(obj, "{}");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m797(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m837(boolean[] zArr, boolean[] zArr2) {
        if (zArr != null || zArr2 == null || zArr2.length <= 0) {
            if (zArr2 == null && zArr != null && zArr.length > 0) {
                return false;
            }
            return zArr == null || zArr2 == null || zArr.length == zArr2.length;
        }
        return false;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m842(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i = 0; length > i; i++) {
            int i2 = iArr[length];
            iArr[length] = iArr[i];
            iArr[i] = i2;
            length--;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m799(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m839(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        return obj.getClass().getName().equals(obj2.getClass().getName());
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m841(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i = 0; length > i; i++) {
            long j = jArr[length];
            jArr[length] = jArr[i];
            jArr[i] = j;
            length--;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m800(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m840(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length - 1;
        for (int i = 0; length > i; i++) {
            Object obj = objArr[length];
            objArr[length] = objArr[i];
            objArr[i] = obj;
            length--;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m877(byte[] bArr, byte b, int i) {
        if (bArr != null && i >= 0) {
            if (i >= bArr.length) {
                i = bArr.length - 1;
            }
            while (i >= 0) {
                if (b == bArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int[] m795(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m843(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i = 0; length > i; i++) {
            short s = sArr[length];
            sArr[length] = sArr[i];
            sArr[i] = s;
            length--;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m872(char[] cArr, char c, int i) {
        if (cArr != null && i >= 0) {
            if (i >= cArr.length) {
                i = cArr.length - 1;
            }
            while (i >= 0) {
                if (c == cArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m794(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static void m848(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i = 0; length > i; i++) {
            boolean z = zArr[length];
            zArr[length] = zArr[i];
            zArr[i] = z;
            length--;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m885(double[] dArr, double d, int i) {
        if (!m929(dArr) && i >= 0) {
            if (i >= dArr.length) {
                i = dArr.length - 1;
            }
            while (i >= 0) {
                if (d == dArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m793(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m886(double[] dArr, double d, int i, double d2) {
        if (!m929(dArr) && i >= 0) {
            if (i >= dArr.length) {
                i = dArr.length - 1;
            }
            double d3 = d - d2;
            double d4 = d + d2;
            while (i >= 0) {
                double d5 = dArr[i];
                if (d5 >= d3 && d5 <= d4) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m796(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m892(float[] fArr, float f, int i) {
        if (!m930(fArr) && i >= 0) {
            if (i >= fArr.length) {
                i = fArr.length - 1;
            }
            while (i >= 0) {
                if (f == fArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m801(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m857(long[] jArr, long j, int i) {
        if (jArr != null && i >= 0) {
            if (i >= jArr.length) {
                i = jArr.length - 1;
            }
            while (i >= 0) {
                if (j == jArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m852(Object[] objArr, Object obj, int i) {
        if (objArr != null && i >= 0) {
            if (i >= objArr.length) {
                i = objArr.length - 1;
            }
            if (obj == null) {
                while (i >= 0) {
                    if (objArr[i] == null) {
                        return i;
                    }
                    i--;
                }
                return -1;
            } else if (!objArr.getClass().getComponentType().isInstance(obj)) {
                return -1;
            } else {
                while (i >= 0) {
                    if (obj.equals(objArr[i])) {
                        return i;
                    }
                    i--;
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m888(double[] dArr, double d, double d2) {
        return m882(dArr, d, 0, d2) != -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m867(short[] sArr, short s, int i) {
        if (sArr != null && i >= 0) {
            if (i >= sArr.length) {
                i = sArr.length - 1;
            }
            while (i >= 0) {
                if (s == sArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m959(Object obj, Class<?> cls) {
        if (obj != null) {
            int length = Array.getLength(obj);
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            return newInstance;
        }
        return Array.newInstance(cls, 1);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m897(boolean[] zArr, boolean z, int i) {
        if (!m931(zArr) && i >= 0) {
            if (i >= zArr.length) {
                i = zArr.length - 1;
            }
            while (i >= 0) {
                if (z == zArr[i]) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int[] m1008(HashSet<Integer> hashSet) {
        int[] iArr = new int[hashSet.size()];
        int i = 0;
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            iArr[i2] = it.next().intValue();
        }
        return iArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m838(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static byte[] m911(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f241;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m875(byte[] bArr, byte b, int i) {
        if (bArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < bArr.length) {
            if (b == bArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static char[] m899(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f249;
        }
        char[] cArr = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            cArr[i] = chArr[i].charValue();
        }
        return cArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m870(char[] cArr, char c, int i) {
        if (cArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < cArr.length) {
            if (c == cArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static double[] m914(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f243;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m881(double[] dArr, double d, int i) {
        if (m929(dArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < dArr.length) {
            if (d == dArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static float[] m917(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f245;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m882(double[] dArr, double d, int i, double d2) {
        if (m929(dArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (i < dArr.length) {
            double d5 = dArr[i];
            if (d5 >= d3 && d5 <= d4) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int[] m905(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f237;
        }
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m890(float[] fArr, float f, int i) {
        if (m930(fArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < fArr.length) {
            if (f == fArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static long[] m902(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f235;
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m855(long[] jArr, long j, int i) {
        if (jArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < jArr.length) {
            if (j == jArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static short[] m908(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f239;
        }
        short[] sArr = new short[shArr.length];
        for (int i = 0; i < shArr.length; i++) {
            sArr[i] = shArr[i].shortValue();
        }
        return sArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m850(Object[] objArr, Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        } else if (!objArr.getClass().getComponentType().isInstance(obj)) {
            return -1;
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean[] m920(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f247;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m865(short[] sArr, short s, int i) {
        if (sArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < sArr.length) {
            if (s == sArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m895(boolean[] zArr, boolean z, int i) {
        if (m931(zArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < zArr.length) {
            if (z == zArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m790(Object obj, Object obj2) {
        return new C0254().m1501(obj, obj2).m1519();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Boolean[] m819(Boolean[] boolArr) {
        return (boolArr == null || boolArr.length == 0) ? f248 : boolArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Byte[] m816(Byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? f242 : bArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Character[] m815(Character[] chArr) {
        return (chArr == null || chArr.length == 0) ? f250 : chArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Double[] m817(Double[] dArr) {
        return (dArr == null || dArr.length == 0) ? f244 : dArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Float[] m818(Float[] fArr) {
        return (fArr == null || fArr.length == 0) ? f246 : fArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Integer[] m813(Integer[] numArr) {
        return (numArr == null || numArr.length == 0) ? f238 : numArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Long[] m812(Long[] lArr) {
        return (lArr == null || lArr.length == 0) ? f236 : lArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Short[] m814(Short[] shArr) {
        return (shArr == null || shArr.length == 0) ? f240 : shArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String[] m803(String[] strArr) {
        return (strArr == null || strArr.length == 0) ? f234 : strArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m988(Object obj, int i) {
        int m838 = m838(obj);
        if (i < 0 || i >= m838) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + m838);
        }
        int i2 = m838 - 1;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i2);
        System.arraycopy(obj, 0, newInstance, 0, i);
        if (i < i2) {
            System.arraycopy(obj, i + 1, newInstance, i, (m838 - i) - 1);
        }
        return newInstance;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m974(byte[] bArr, int i) {
        return (byte[]) m988((Object) bArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m976(char[] cArr, int i) {
        return (char[]) m988((Object) cArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m978(double[] dArr, int i) {
        return (double[]) m988((Object) dArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m980(float[] fArr, int i) {
        return (float[]) m988((Object) fArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m984(long[] jArr, int i) {
        return (long[]) m988((Object) jArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m970(T[] tArr, int i) {
        return (T[]) ((Object[]) m988((Object) tArr, i));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m986(short[] sArr, int i) {
        return (short[]) m988((Object) sArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m972(boolean[] zArr, int i) {
        return (boolean[]) m988((Object) zArr, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Object m1007(Object obj, int... iArr) {
        int i;
        int m838 = m838(obj);
        int i2 = 0;
        if (m934(iArr)) {
            Arrays.sort(iArr);
            int length = iArr.length;
            int i3 = m838;
            while (true) {
                int i4 = length - 1;
                length = i4;
                if (i4 < 0) {
                    break;
                }
                i = iArr[length];
                if (i < 0 || i >= m838) {
                    break;
                } else if (i < i3) {
                    i2++;
                    i3 = i;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + m838);
        }
        int i5 = i2;
        int i6 = m838 - i2;
        int i7 = i6;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i6);
        if (i5 < m838) {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i8 = m838;
                int i9 = iArr[length2];
                m838 = i9;
                int i10 = i8 - i9;
                if (i10 > 1) {
                    int i11 = i10 - 1;
                    int i12 = i7 - i11;
                    System.arraycopy(obj, m838 + 1, newInstance, i12, i11);
                    i7 = i12;
                }
            }
            if (m838 > 0) {
                System.arraycopy(obj, 0, newInstance, 0, m838);
            }
        }
        return newInstance;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m991(byte[] bArr, int... iArr) {
        return (byte[]) m1007((Object) bArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m997(char[] cArr, int... iArr) {
        return (char[]) m1007((Object) cArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m1003(double[] dArr, int... iArr) {
        return (double[]) m1007((Object) dArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m1001(float[] fArr, int... iArr) {
        return (float[]) m1007((Object) fArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m999(long[] jArr, int... iArr) {
        return (long[]) m1007((Object) jArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m989(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) m1007((Object) tArr, m795(iArr)));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m993(short[] sArr, int... iArr) {
        return (short[]) m1007((Object) sArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m1005(boolean[] zArr, int... iArr) {
        return (boolean[]) m1007((Object) zArr, m795(iArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m825(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > bArr.length) {
            i2 = bArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f241;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m824(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > cArr.length) {
            i2 = cArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f249;
        }
        char[] cArr2 = new char[i3];
        System.arraycopy(cArr, i, cArr2, 0, i3);
        return cArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m826(double[] dArr, int i, int i2) {
        if (dArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > dArr.length) {
            i2 = dArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f243;
        }
        double[] dArr2 = new double[i3];
        System.arraycopy(dArr, i, dArr2, 0, i3);
        return dArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m827(float[] fArr, int i, int i2) {
        if (fArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > fArr.length) {
            i2 = fArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f245;
        }
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, i3);
        return fArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m821(long[] jArr, int i, int i2) {
        if (jArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > jArr.length) {
            i2 = jArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f235;
        }
        long[] jArr2 = new long[i3];
        System.arraycopy(jArr, i, jArr2, 0, i3);
        return jArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m820(T[] tArr, int i, int i2) {
        if (tArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        int i3 = i2 - i;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i3 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i3));
        System.arraycopy(tArr, i, tArr2, 0, i3);
        return tArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m823(short[] sArr, int i, int i2) {
        if (sArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > sArr.length) {
            i2 = sArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f239;
        }
        short[] sArr2 = new short[i3];
        System.arraycopy(sArr, i, sArr2, 0, i3);
        return sArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m828(boolean[] zArr, int i, int i2) {
        if (zArr == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > zArr.length) {
            i2 = zArr.length;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f247;
        }
        boolean[] zArr2 = new boolean[i3];
        System.arraycopy(zArr, i, zArr2, 0, i3);
        return zArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m912(Byte[] bArr, byte b) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f241;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            Byte b2 = bArr[i];
            bArr2[i] = b2 == null ? b : b2.byteValue();
        }
        return bArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m900(Character[] chArr, char c) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f249;
        }
        char[] cArr = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            Character ch = chArr[i];
            cArr[i] = ch == null ? c : ch.charValue();
        }
        return cArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static double[] m915(Double[] dArr, double d) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f243;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            Double d2 = dArr[i];
            dArr2[i] = d2 == null ? d : d2.doubleValue();
        }
        return dArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static float[] m918(Float[] fArr, float f) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f245;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            Float f2 = fArr[i];
            fArr2[i] = f2 == null ? f : f2.floatValue();
        }
        return fArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int[] m906(Integer[] numArr, int i) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f237;
        }
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            Integer num = numArr[i2];
            iArr[i2] = num == null ? i : num.intValue();
        }
        return iArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static long[] m903(Long[] lArr, long j) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f235;
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            Long l = lArr[i];
            jArr[i] = l == null ? j : l.longValue();
        }
        return jArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static short[] m909(Short[] shArr, short s) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f239;
        }
        short[] sArr = new short[shArr.length];
        for (int i = 0; i < shArr.length; i++) {
            Short sh = shArr[i];
            sArr[i] = sh == null ? s : sh.shortValue();
        }
        return sArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean[] m921(Boolean[] boolArr, boolean z) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f247;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            Boolean bool = boolArr[i];
            zArr[i] = bool == null ? z : bool.booleanValue();
        }
        return zArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m788(Object obj, String str) {
        return obj == null ? str : new C0052(obj, AbstractC0053.SIMPLE_STYLE, null).m497(obj).toString();
    }
}
