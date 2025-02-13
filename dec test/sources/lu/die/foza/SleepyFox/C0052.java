package lu.die.foza.SleepyFox;

import lu.die.foza.SleepyFox.C0255;
/* renamed from: lu.die.foza.SleepyFox.ˢ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˢ.class */
public class C0052 implements AbstractC0177<String> {

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static volatile AbstractC0053 f130 = AbstractC0053.DEFAULT_STYLE;

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final StringBuffer f131;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Object f132;

    /* renamed from: ԩ  reason: contains not printable characters */
    public final AbstractC0053 f133;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static AbstractC0053 m476() {
        return f130;
    }

    public C0052(Object obj) {
        this(obj, null, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m485(byte b) {
        this.f133.append(this.f131, (String) null, b);
        return this;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public C0052 m529(Object obj) {
        C0472.m2416(m533(), obj);
        return this;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public Object m532() {
        return this.f132;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public StringBuffer m533() {
        return this.f131;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public AbstractC0053 m534() {
        return this.f133;
    }

    public String toString() {
        if (m532() == null) {
            m533().append(m534().m617());
        } else {
            this.f133.appendEnd(m533(), m532());
        }
        return m533().toString();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m478(Object obj) {
        return C0046.m434(obj);
    }

    public C0052(Object obj, AbstractC0053 abstractC0053) {
        this(obj, abstractC0053, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m487(char c) {
        this.f133.append(this.f131, (String) null, c);
        return this;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public C0052 m531(String str) {
        if (str != null) {
            this.f133.appendToString(this.f131, str);
        }
        return this;
    }

    public C0052(Object obj, AbstractC0053 abstractC0053, StringBuffer stringBuffer) {
        abstractC0053 = abstractC0053 == null ? m476() : abstractC0053;
        if (stringBuffer == null) {
            stringBuffer = r0;
            StringBuffer stringBuffer2 = new StringBuffer((int) C0255.C0256.f528);
        }
        this.f131 = stringBuffer;
        this.f133 = abstractC0053;
        this.f132 = obj;
        abstractC0053.appendStart(stringBuffer, obj);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m489(double d) {
        this.f133.append(this.f131, (String) null, d);
        return this;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0177
    /* renamed from: Ԩ  reason: contains not printable characters */
    public String mo536() {
        return toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m491(float f) {
        this.f133.append(this.f131, (String) null, f);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m493(int i) {
        this.f133.append(this.f131, (String) null, i);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m495(long j) {
        this.f133.append(this.f131, (String) null, j);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m497(Object obj) {
        this.f133.append(this.f131, (String) null, obj, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m504(String str, byte b) {
        this.f133.append(this.f131, str, b);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m507(String str, char c) {
        this.f133.append(this.f131, str, c);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m510(String str, double d) {
        this.f133.append(this.f131, str, d);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m513(String str, float f) {
        this.f133.append(this.f131, str, f);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m516(String str, int i) {
        this.f133.append(this.f131, str, i);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m519(String str, long j) {
        this.f133.append(this.f131, str, j);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m522(String str, Object obj) {
        this.f133.append(this.f131, str, obj, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m523(String str, Object obj, boolean z) {
        this.f133.append(this.f131, str, obj, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m526(String str, short s) {
        this.f133.append(this.f131, str, s);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m501(String str, boolean z) {
        this.f133.append(this.f131, str, z);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m505(String str, byte[] bArr) {
        this.f133.append(this.f131, str, bArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m506(String str, byte[] bArr, boolean z) {
        this.f133.append(this.f131, str, bArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m508(String str, char[] cArr) {
        this.f133.append(this.f131, str, cArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m509(String str, char[] cArr, boolean z) {
        this.f133.append(this.f131, str, cArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m511(String str, double[] dArr) {
        this.f133.append(this.f131, str, dArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m512(String str, double[] dArr, boolean z) {
        this.f133.append(this.f131, str, dArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m514(String str, float[] fArr) {
        this.f133.append(this.f131, str, fArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m515(String str, float[] fArr, boolean z) {
        this.f133.append(this.f131, str, fArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m517(String str, int[] iArr) {
        this.f133.append(this.f131, str, iArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m518(String str, int[] iArr, boolean z) {
        this.f133.append(this.f131, str, iArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m520(String str, long[] jArr) {
        this.f133.append(this.f131, str, jArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m521(String str, long[] jArr, boolean z) {
        this.f133.append(this.f131, str, jArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m524(String str, Object[] objArr) {
        this.f133.append(this.f131, str, objArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m525(String str, Object[] objArr, boolean z) {
        this.f133.append(this.f131, str, objArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m527(String str, short[] sArr) {
        this.f133.append(this.f131, str, sArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m528(String str, short[] sArr, boolean z) {
        this.f133.append(this.f131, str, sArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m502(String str, boolean[] zArr) {
        this.f133.append(this.f131, str, zArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m503(String str, boolean[] zArr, boolean z) {
        this.f133.append(this.f131, str, zArr, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m499(short s) {
        this.f133.append(this.f131, (String) null, s);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m483(boolean z) {
        this.f133.append(this.f131, (String) null, z);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m486(byte[] bArr) {
        this.f133.append(this.f131, (String) null, bArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m488(char[] cArr) {
        this.f133.append(this.f131, (String) null, cArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m490(double[] dArr) {
        this.f133.append(this.f131, (String) null, dArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m492(float[] fArr) {
        this.f133.append(this.f131, (String) null, fArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m494(int[] iArr) {
        this.f133.append(this.f131, (String) null, iArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m496(long[] jArr) {
        this.f133.append(this.f131, (String) null, jArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m498(Object[] objArr) {
        this.f133.append(this.f131, (String) null, objArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m500(short[] sArr) {
        this.f133.append(this.f131, (String) null, sArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m484(boolean[] zArr) {
        this.f133.append(this.f131, (String) null, zArr, (Boolean) null);
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0052 m530(String str) {
        if (str != null) {
            this.f133.appendSuper(this.f131, str);
        }
        return this;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m479(Object obj, AbstractC0053 abstractC0053) {
        return C0046.m435(obj, abstractC0053);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m480(Object obj, AbstractC0053 abstractC0053, boolean z) {
        return C0046.m438(obj, abstractC0053, z, false, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> String m481(T t, AbstractC0053 abstractC0053, boolean z, Class<? super T> cls) {
        return C0046.m438(t, abstractC0053, z, false, cls);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m477(AbstractC0053 abstractC0053) {
        if (abstractC0053 != null) {
            f130 = abstractC0053;
            return;
        }
        throw new IllegalArgumentException("The style must not be null");
    }
}
