package lu.die.foza.SleepyFox;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: lu.die.foza.SleepyFox.ˣ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˣ.class */
public abstract class AbstractC0053 implements Serializable {

    /* renamed from: ކ  reason: contains not printable characters */
    public static final long f134 = -2587890625525655916L;
    public static final AbstractC0053 DEFAULT_STYLE = new C0054();
    public static final AbstractC0053 MULTI_LINE_STYLE = new C0055();
    public static final AbstractC0053 NO_FIELD_NAMES_STYLE = new C0056();
    public static final AbstractC0053 SHORT_PREFIX_STYLE = new C0057();
    public static final AbstractC0053 SIMPLE_STYLE = new C0058();

    /* renamed from: އ  reason: contains not printable characters */
    public static final ThreadLocal<WeakHashMap<Object, Object>> f135 = new ThreadLocal<>();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean f136 = true;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean f137 = true;

    /* renamed from: ԩ  reason: contains not printable characters */
    public boolean f138 = false;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public boolean f139 = true;

    /* renamed from: ԫ  reason: contains not printable characters */
    public String f140 = "[";

    /* renamed from: Ԭ  reason: contains not printable characters */
    public String f141 = "]";

    /* renamed from: ԭ  reason: contains not printable characters */
    public String f142 = "=";

    /* renamed from: Ԯ  reason: contains not printable characters */
    public boolean f143 = false;

    /* renamed from: ԯ  reason: contains not printable characters */
    public boolean f144 = false;

    /* renamed from: ՠ  reason: contains not printable characters */
    public String f145 = ",";

    /* renamed from: ֈ  reason: contains not printable characters */
    public String f146 = "{";

    /* renamed from: ֏  reason: contains not printable characters */
    public String f147 = ",";

    /* renamed from: ׯ  reason: contains not printable characters */
    public boolean f148 = true;

    /* renamed from: ؠ  reason: contains not printable characters */
    public String f149 = "}";

    /* renamed from: ހ  reason: contains not printable characters */
    public boolean f150 = true;

    /* renamed from: ށ  reason: contains not printable characters */
    public String f151 = "<null>";

    /* renamed from: ނ  reason: contains not printable characters */
    public String f152 = "<size=";

    /* renamed from: ރ  reason: contains not printable characters */
    public String f153 = ">";

    /* renamed from: ބ  reason: contains not printable characters */
    public String f154 = "<";

    /* renamed from: ޅ  reason: contains not printable characters */
    public String f155 = ">";

    /* renamed from: lu.die.foza.SleepyFox.ˣ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˣ$Ϳ.class */
    public static final class C0054 extends AbstractC0053 {

        /* renamed from: ވ  reason: contains not printable characters */
        public static final long f156 = 1;

        /* renamed from: އ  reason: contains not printable characters */
        public final Object m627() {
            return AbstractC0053.DEFAULT_STYLE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˣ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˣ$Ԩ.class */
    public static final class C0055 extends AbstractC0053 {

        /* renamed from: ވ  reason: contains not printable characters */
        public static final long f157 = 1;

        public C0055() {
            m606("[");
            StringBuilder sb = new StringBuilder();
            String str = C0223.f376;
            m612(sb.append(str).append("  ").toString());
            m614(true);
            m608(str + "]");
        }

        /* renamed from: އ  reason: contains not printable characters */
        public final Object m628() {
            return AbstractC0053.MULTI_LINE_STYLE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˣ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˣ$Ԫ.class */
    public static final class C0056 extends AbstractC0053 {

        /* renamed from: ވ  reason: contains not printable characters */
        public static final long f158 = 1;

        public C0056() {
            m594(false);
        }

        /* renamed from: އ  reason: contains not printable characters */
        public final Object m629() {
            return AbstractC0053.NO_FIELD_NAMES_STYLE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˣ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˣ$Ԭ.class */
    public static final class C0057 extends AbstractC0053 {

        /* renamed from: ވ  reason: contains not printable characters */
        public static final long f159 = 1;

        public C0057() {
            m590(true);
            m592(false);
        }

        /* renamed from: އ  reason: contains not printable characters */
        public final Object m630() {
            return AbstractC0053.SHORT_PREFIX_STYLE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˣ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˣ$Ԯ.class */
    public static final class C0058 extends AbstractC0053 {

        /* renamed from: ވ  reason: contains not printable characters */
        public static final long f160 = 1;

        public C0058() {
            m588(false);
            m592(false);
            m594(false);
            m606(C0019.f56);
            m608(C0019.f56);
        }

        /* renamed from: އ  reason: contains not printable characters */
        public final Object m631() {
            return AbstractC0053.SIMPLE_STYLE;
        }
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static Map<Object, Object> m537() {
        return f135.get();
    }

    public void appendSuper(StringBuffer stringBuffer, String str) {
        appendToString(stringBuffer, str);
    }

    public void appendToString(StringBuffer stringBuffer, String str) {
        if (str != null) {
            int length = this.f140.length() + str.indexOf(this.f140);
            int lastIndexOf = str.lastIndexOf(this.f141);
            if (length == lastIndexOf || length < 0 || lastIndexOf < 0) {
                return;
            }
            String substring = str.substring(length, lastIndexOf);
            if (this.f143) {
                m542(stringBuffer);
            }
            stringBuffer.append(substring);
            m581(stringBuffer);
        }
    }

    public void appendStart(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            m576(stringBuffer, obj);
            m577(stringBuffer, obj);
            m578(stringBuffer);
            if (!this.f143) {
                return;
            }
            m581(stringBuffer);
        }
    }

    public void appendEnd(StringBuffer stringBuffer, Object obj) {
        if (!this.f144) {
            m542(stringBuffer);
        }
        m579(stringBuffer);
        m540(obj);
    }

    public void append(StringBuffer stringBuffer, String str, byte b) {
        m582(stringBuffer, str);
        m552(stringBuffer, str, b);
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m576(StringBuffer stringBuffer, Object obj) {
        if (!this.f137 || obj == null) {
            return;
        }
        m539(obj);
        if (this.f138) {
            stringBuffer.append(m586(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m578(StringBuffer stringBuffer) {
        stringBuffer.append(this.f140);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public void m581(StringBuffer stringBuffer) {
        stringBuffer.append(this.f145);
    }

    /* renamed from: ރ  reason: contains not printable characters */
    public boolean m587() {
        return this.f137;
    }

    /* renamed from: ކ  reason: contains not printable characters */
    public boolean m589() {
        return this.f138;
    }

    /* renamed from: ޅ  reason: contains not printable characters */
    public boolean m591() {
        return this.f139;
    }

    /* renamed from: ބ  reason: contains not printable characters */
    public boolean m593() {
        return this.f136;
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public boolean m595() {
        return this.f150;
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public boolean m597() {
        return this.f148;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public String m605() {
        return this.f140;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public String m607() {
        return this.f141;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public String m609() {
        return this.f142;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public String m611() {
        return this.f145;
    }

    /* renamed from: ނ  reason: contains not printable characters */
    public boolean m613() {
        return this.f143;
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public boolean m615() {
        return this.f144;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public String m617() {
        return this.f151;
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public String m619() {
        return this.f152;
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public String m621() {
        return this.f153;
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public String m623() {
        return this.f154;
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public String m625() {
        return this.f155;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m545(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    public void append(StringBuffer stringBuffer, String str, char c) {
        m582(stringBuffer, str);
        m553(stringBuffer, str, c);
        m583(stringBuffer, str);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public void m558(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f146);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            int i2 = i;
            Object obj2 = Array.get(obj, i);
            if (i2 > 0) {
                stringBuffer.append(this.f147);
            }
            if (obj2 == null) {
                m580(stringBuffer, str);
            } else {
                m543(stringBuffer, str, obj2, this.f148);
            }
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m579(StringBuffer stringBuffer) {
        stringBuffer.append(this.f141);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public void m580(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f151);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public void m606(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f140 = str;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public void m610(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f142 = str;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public void m612(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f145 = str;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public void m618(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f151 = str;
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public void m620(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f152 = str;
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public void m622(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f153 = str;
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public void m624(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f154 = str;
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public void m626(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f155 = str;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public void m542(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.f145.length();
        if (length <= 0 || length2 <= 0 || length < length2) {
            return;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            } else if (stringBuffer.charAt((length - 1) - i) != this.f145.charAt((length2 - 1) - i)) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return;
        }
        stringBuffer.setLength(length - length2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m544(StringBuffer stringBuffer, String str, Object obj) {
        C0472.m2416(stringBuffer, obj);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public void m548(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f154);
        stringBuffer.append(m586(obj.getClass()));
        stringBuffer.append(this.f155);
    }

    public void append(StringBuffer stringBuffer, String str, double d) {
        m582(stringBuffer, str);
        m554(stringBuffer, str, d);
        m583(stringBuffer, str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m582(StringBuffer stringBuffer, String str) {
        if (!this.f136 || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f142);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public void m588(boolean z) {
        this.f137 = z;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public void m590(boolean z) {
        this.f138 = z;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public void m592(boolean z) {
        this.f139 = z;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public void m594(boolean z) {
        this.f136 = z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m552(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append((int) b);
    }

    public void append(StringBuffer stringBuffer, String str, float f) {
        m582(stringBuffer, str);
        m555(stringBuffer, str, f);
        m583(stringBuffer, str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m577(StringBuffer stringBuffer, Object obj) {
        if (!m591() || obj == null) {
            return;
        }
        m539(obj);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public String m599() {
        return this.f146;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public void m608(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f141 = str;
    }

    public void append(StringBuffer stringBuffer, String str, int i) {
        m582(stringBuffer, str);
        m550(stringBuffer, str, i);
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m553(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m567(StringBuffer stringBuffer, String str, byte[] bArr) {
        m584(stringBuffer, str, bArr.length);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public void m600(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f146 = str;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public void m614(boolean z) {
        this.f143 = z;
    }

    public void append(StringBuffer stringBuffer, String str, long j) {
        m582(stringBuffer, str);
        m549(stringBuffer, str, j);
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m554(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m569(StringBuffer stringBuffer, String str, char[] cArr) {
        m584(stringBuffer, str, cArr.length);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public void m616(boolean z) {
        this.f144 = z;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static void m540(Object obj) {
        Map<Object, Object> m537;
        if (obj == null || (m537 = m537()) == null) {
            return;
        }
        m537.remove(obj);
        if (!m537.isEmpty()) {
            return;
        }
        f135.remove();
    }

    public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        m582(stringBuffer, str);
        if (obj == null) {
            m580(stringBuffer, str);
        } else {
            m543(stringBuffer, str, obj, m585(bool));
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m555(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m571(StringBuffer stringBuffer, String str, double[] dArr) {
        m584(stringBuffer, str, dArr.length);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m550(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    public void append(StringBuffer stringBuffer, String str, short s) {
        m582(stringBuffer, str);
        m551(stringBuffer, str, s);
        m583(stringBuffer, str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m573(StringBuffer stringBuffer, String str, float[] fArr) {
        m584(stringBuffer, str, fArr.length);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m549(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    public void append(StringBuffer stringBuffer, String str, boolean z) {
        m582(stringBuffer, str);
        m556(stringBuffer, str, z);
        m583(stringBuffer, str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m563(StringBuffer stringBuffer, String str, int[] iArr) {
        m584(stringBuffer, str, iArr.length);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m546(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m561(StringBuffer stringBuffer, String str, long[] jArr) {
        m584(stringBuffer, str, jArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        m582(stringBuffer, str);
        if (bArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m566(stringBuffer, str, bArr);
        } else {
            m567(stringBuffer, str, bArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m547(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m559(StringBuffer stringBuffer, String str, Object[] objArr) {
        m584(stringBuffer, str, objArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        m582(stringBuffer, str);
        if (cArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m568(stringBuffer, str, cArr);
        } else {
            m569(stringBuffer, str, cArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m551(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append((int) s);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m565(StringBuffer stringBuffer, String str, short[] sArr) {
        m584(stringBuffer, str, sArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        m582(stringBuffer, str);
        if (dArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m570(stringBuffer, str, dArr);
        } else {
            m571(stringBuffer, str, dArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m556(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        m582(stringBuffer, str);
        if (fArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m572(stringBuffer, str, fArr);
        } else {
            m573(stringBuffer, str, fArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m575(StringBuffer stringBuffer, String str, boolean[] zArr) {
        m584(stringBuffer, str, zArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        m582(stringBuffer, str);
        if (iArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m562(stringBuffer, str, iArr);
        } else {
            m563(stringBuffer, str, iArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m566(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m552(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m584(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.f152);
        stringBuffer.append(i);
        stringBuffer.append(this.f153);
    }

    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        m582(stringBuffer, str);
        if (jArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m560(stringBuffer, str, jArr);
        } else {
            m561(stringBuffer, str, jArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m568(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m553(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public String m603() {
        return this.f147;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static void m539(Object obj) {
        if (obj != null) {
            if (m537() == null) {
                f135.set(new WeakHashMap<>());
            }
            m537().put(obj, null);
        }
    }

    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        m582(stringBuffer, str);
        if (objArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m557(stringBuffer, str, objArr);
        } else {
            m559(stringBuffer, str, objArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m570(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m554(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        m582(stringBuffer, str);
        if (sArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m564(stringBuffer, str, sArr);
        } else {
            m565(stringBuffer, str, sArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m572(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m555(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m604(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f147 = str;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m562(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m550(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        m582(stringBuffer, str);
        if (zArr == null) {
            m580(stringBuffer, str);
        } else if (m585(bool)) {
            m574(stringBuffer, str, zArr);
        } else {
            m575(stringBuffer, str, zArr);
        }
        m583(stringBuffer, str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m596(boolean z) {
        this.f150 = z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m560(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m549(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m557(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < objArr.length; i++) {
            int i2 = i;
            Object obj = objArr[i];
            if (i2 > 0) {
                stringBuffer.append(this.f147);
            }
            if (obj == null) {
                m580(stringBuffer, str);
            } else {
                m543(stringBuffer, str, obj, this.f148);
            }
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m564(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m551(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m574(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f146);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f147);
            }
            m556(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.f149);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m583(StringBuffer stringBuffer, String str) {
        m581(stringBuffer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m543(StringBuffer stringBuffer, String str, Object th, boolean z) {
        int size;
        if (m538(th) && !(th instanceof Number) && !(th instanceof Boolean) && !(th instanceof Character)) {
            m544(stringBuffer, str, th);
            return;
        }
        m539(th);
        try {
            if (th instanceof Collection) {
                if (z) {
                    m546(stringBuffer, str, (Collection) th);
                } else {
                    size = ((Collection) th).size();
                    m584(stringBuffer, str, size);
                }
            } else if (th instanceof Map) {
                if (z) {
                    m547(stringBuffer, str, (Map) th);
                } else {
                    size = ((Map) th).size();
                    m584(stringBuffer, str, size);
                }
            } else if (th instanceof long[]) {
                if (z) {
                    m560(stringBuffer, str, (long[]) th);
                } else {
                    m561(stringBuffer, str, (long[]) th);
                }
            } else if (th instanceof int[]) {
                if (z) {
                    m562(stringBuffer, str, (int[]) th);
                } else {
                    m563(stringBuffer, str, (int[]) th);
                }
            } else if (th instanceof short[]) {
                if (z) {
                    m564(stringBuffer, str, (short[]) th);
                } else {
                    m565(stringBuffer, str, (short[]) th);
                }
            } else if (th instanceof byte[]) {
                if (z) {
                    m566(stringBuffer, str, (byte[]) th);
                } else {
                    m567(stringBuffer, str, (byte[]) th);
                }
            } else if (th instanceof char[]) {
                if (z) {
                    m568(stringBuffer, str, (char[]) th);
                } else {
                    m569(stringBuffer, str, (char[]) th);
                }
            } else if (th instanceof double[]) {
                if (z) {
                    m570(stringBuffer, str, (double[]) th);
                } else {
                    m571(stringBuffer, str, (double[]) th);
                }
            } else if (th instanceof float[]) {
                if (z) {
                    m572(stringBuffer, str, (float[]) th);
                } else {
                    m573(stringBuffer, str, (float[]) th);
                }
            } else if (th instanceof boolean[]) {
                if (z) {
                    m574(stringBuffer, str, (boolean[]) th);
                } else {
                    m575(stringBuffer, str, (boolean[]) th);
                }
            } else if (th.getClass().isArray()) {
                if (z) {
                    m557(stringBuffer, str, (Object[]) th);
                } else {
                    m559(stringBuffer, str, (Object[]) th);
                }
            } else if (z) {
                m545(stringBuffer, str, th);
            } else {
                m548(stringBuffer, str, th);
            }
        } finally {
            m540(th);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public String m601() {
        return this.f149;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public String m586(Class<?> cls) {
        return C0185.m1051(cls);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean m585(Boolean bool) {
        return bool == null ? this.f150 : bool.booleanValue();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m538(Object obj) {
        Map<Object, Object> m537 = m537();
        return m537 != null && m537.containsKey(obj);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m598(boolean z) {
        this.f148 = z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m602(String str) {
        if (str == null) {
            str = C0019.f56;
        }
        this.f149 = str;
    }
}
