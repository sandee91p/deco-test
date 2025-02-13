package lu.die.foza.SleepyFox;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import lu.die.foza.SleepyFox.C0255;
/* renamed from: lu.die.foza.SleepyFox.ʴ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʴ.class */
public class C0019 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final String f56 = "";

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final int f57 = -1;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final int f58 = 8192;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final Pattern f59 = Pattern.compile("\\s+");

    /* renamed from: lu.die.foza.SleepyFox.ʴ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʴ$Ϳ.class */
    public static class C0020 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final Throwable f60;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static final Method f61;

        /* renamed from: ԩ  reason: contains not printable characters */
        public static final Pattern f62;

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static final Throwable f63;

        /* renamed from: ԫ  reason: contains not printable characters */
        public static final Method f64;

        /* renamed from: Ԭ  reason: contains not printable characters */
        public static final Object f65;

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final Pattern f66;

        static {
            Pattern compile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            f62 = compile;
            f66 = compile;
            Object obj = null;
            Method method = null;
            Method method2 = null;
            Exception e = null;
            Exception e2 = null;
            try {
                Class<?> loadClass = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
                obj = loadClass.getField("NFD").get(null);
                Class<?> loadClass2 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer");
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = CharSequence.class;
                clsArr[1] = loadClass;
                method = loadClass2.getMethod("normalize", clsArr);
            } catch (Exception e3) {
                e = e3;
                try {
                    Class<?> loadClass3 = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer");
                    Class<?>[] clsArr2 = new Class[3];
                    clsArr2[0] = String.class;
                    clsArr2[1] = Boolean.TYPE;
                    clsArr2[2] = Integer.TYPE;
                    method2 = loadClass3.getMethod("decompose", clsArr2);
                } catch (Exception e4) {
                    e2 = e4;
                }
            }
            f63 = e;
            f65 = obj;
            f64 = method;
            f60 = e2;
            f61 = method2;
        }
    }

    /* renamed from: ރ  reason: contains not printable characters */
    public static String m106(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        if (C0020.f61 != null) {
            return C0020.f62.matcher((String) C0020.f61.invoke(null, charSequence, Boolean.FALSE, 0)).replaceAll(f56);
        }
        throw new IllegalStateException("sun.text.Normalizer is not available", C0020.f60);
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static boolean m107(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static boolean m108(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null) ? charSequence == charSequence2 : C0183.m1025(charSequence, true, 0, charSequence2, 0, Math.max(charSequence.length(), charSequence2.length()));
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static int m111(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0183.m1021(charSequence, charSequence2, 0);
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public static int m115(CharSequence charSequence, CharSequence charSequence2) {
        return m116(charSequence, charSequence2, 0);
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public static int m119(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0183.m1023(charSequence, charSequence2, charSequence.length());
    }

    /* renamed from: ނ  reason: contains not printable characters */
    public static int m122(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return m123(charSequence, charSequence2, charSequence.length());
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public static int m133(CharSequence charSequence, CharSequence charSequence2) {
        if (m89(charSequence) || m89(charSequence2)) {
            return -1;
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return -1;
            }
            char charAt = charSequence.charAt(i2);
            boolean z = C0183.m1020(charSequence2, charAt, 0) >= 0;
            int i3 = i2 + 1;
            if (i3 < length && Character.isHighSurrogate(charAt)) {
                boolean z2 = z;
                char charAt2 = charSequence.charAt(i3);
                if (z2 && C0183.m1020(charSequence2, charAt2, 0) < 0) {
                    return i2;
                }
            } else if (!z) {
                return i2;
            }
            i = i3;
        }
    }

    /* renamed from: ޅ  reason: contains not printable characters */
    public static String m149(String str, String str2) {
        return m150(str, str2, str2);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m197(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return f56;
        }
        int i = length - 1;
        String substring = str.substring(0, i);
        if (str.charAt(i) == '\n') {
            int i2 = i - 1;
            if (substring.charAt(i2) == '\r') {
                return substring.substring(0, i2);
            }
        }
        return substring;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m208(String str, int i) {
        return m209(str, i, ' ');
    }

    /* renamed from: އ  reason: contains not printable characters */
    public static String m211(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    /* renamed from: ކ  reason: contains not printable characters */
    public static String m216(String str) {
        int length;
        return (str == null || (length = str.length()) == 0) ? str : new StringBuilder(length).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m218(CharSequence charSequence, CharSequence charSequence2) {
        if (m89(charSequence) || m89(charSequence2)) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int m1021 = C0183.m1021(charSequence, charSequence2, i2);
            if (m1021 == -1) {
                return i;
            }
            i++;
            i2 = charSequence2.length() + m1021;
        }
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static <T extends CharSequence> T m231(T t, T t2) {
        if (m91(t)) {
            t = t2;
        }
        return t;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static <T extends CharSequence> T m232(T t, T t2) {
        if (m89(t)) {
            t = t2;
        }
        return t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m235(String str, int i) {
        return m236(str, 0, i);
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public static int m239(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        if (charSequence == null || charSequence2 == null) {
            return 0;
        }
        int i = 0;
        while (i < charSequence.length() && i < charSequence2.length() && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        if (i >= charSequence2.length() && i >= charSequence.length()) {
            return -1;
        }
        return i;
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static int m242(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = charSequence.length();
        int i = length;
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return i;
        }
        if (i > length2) {
            length2 = charSequence.length();
            i = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int i2 = i + 1;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 <= i; i3++) {
            int i4 = i3;
            iArr[i4] = i4;
        }
        int i5 = 1;
        while (i5 <= length2) {
            char charAt = charSequence.charAt(i5 - 1);
            iArr2[0] = i5;
            for (int i6 = 1; i6 <= i; i6++) {
                int i7 = i6 - 1;
                iArr2[i6] = Math.min(Math.min(iArr2[i7] + 1, iArr[i6] + 1), iArr[i7] + (charSequence2.charAt(i7) == charAt ? 0 : 1));
            }
            i5++;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
        }
        return iArr[i];
    }

    /* renamed from: ބ  reason: contains not printable characters */
    public static boolean m245(CharSequence charSequence, CharSequence charSequence2) {
        return m246(charSequence, charSequence2, true);
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static boolean m248(CharSequence charSequence, CharSequence charSequence2) {
        return m250(charSequence, charSequence2, false);
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static boolean m249(CharSequence charSequence, CharSequence charSequence2) {
        return m250(charSequence, charSequence2, true);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static boolean m89(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static boolean m90(CharSequence charSequence) {
        return !m89(charSequence);
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static boolean m91(CharSequence charSequence) {
        int length;
        if (charSequence == null || (length = charSequence.length()) == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static boolean m92(CharSequence charSequence) {
        return !m91(charSequence);
    }

    /* renamed from: ޅ  reason: contains not printable characters */
    public static String m94(String str) {
        String m93 = m93(str);
        String str2 = m93;
        if (m89((CharSequence) m93)) {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: ނ  reason: contains not printable characters */
    public static String m105(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        if (C0020.f64 != null && (obj = C0020.f65) != null) {
            return C0020.f66.matcher((String) C0020.f64.invoke(null, charSequence, obj)).replaceAll(f56);
        }
        throw new IllegalStateException("java.text.Normalizer is not available", C0020.f63);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m126(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        int length = charSequence2.length();
        int length2 = charSequence.length() - length;
        for (int i = 0; i <= length2; i++) {
            if (C0183.m1025(charSequence, true, i, charSequence2, 0, length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ބ  reason: contains not printable characters */
    public static String m147(String str, String str2) {
        if (m89((CharSequence) str) || m89((CharSequence) str2)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(str2);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m179(String str) {
        if (m89((CharSequence) str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        return i == length ? str : new String(cArr, 0, i);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m195(String str) {
        if (m89((CharSequence) str)) {
            return str;
        }
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            return (charAt == '\r' || charAt == '\n') ? f56 : str;
        }
        int length = str.length() - 1;
        int i = length;
        char charAt2 = str.charAt(length);
        if (charAt2 == '\n') {
            if (str.charAt(i - 1) == '\r') {
                i--;
            }
        } else if (charAt2 != '\r') {
            i++;
        }
        return str.substring(0, i);
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public static int m207(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static boolean m221(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static boolean m222(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i)) && charSequence.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static boolean m223(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C0184.m1041(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public static boolean m224(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public static boolean m225(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i)) && charSequence.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public static boolean m226(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m229(String str) {
        if (str == null) {
            str = f56;
        }
        return str;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m236(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 4) {
            throw new IllegalArgumentException("Minimum abbreviation width is 4");
        }
        if (str.length() <= i2) {
            return str;
        }
        if (i > str.length()) {
            i = str.length();
        }
        int i3 = i2 - 3;
        if (str.length() - i < i3) {
            i = str.length() - i3;
        }
        if (i <= 4) {
            return str.substring(0, i3) + "...";
        }
        if (i2 < 7) {
            throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
        }
        return (i + i2) - 3 < str.length() ? "..." + m236(str.substring(i), 0, i3) : "..." + str.substring(str.length() - i3);
    }

    /* renamed from: ބ  reason: contains not printable characters */
    public static String m95(String str) {
        return str == null ? f56 : str.trim();
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public static String m96(String str) {
        return m99(str, (String) null);
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public static String m97(String str) {
        if (str == null) {
            return null;
        }
        String m99 = m99(str, (String) null);
        String str2 = m99;
        if (m99.length() == 0) {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public static String m100(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i = 0;
        if (str2 == null) {
            while (i != length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
        } else if (str2.length() == 0) {
            return str;
        } else {
            while (i != length && str2.indexOf(str.charAt(i)) != -1) {
                i++;
            }
        }
        return str.substring(i);
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public static String m104(String str) {
        String m106;
        if (str == null) {
            return null;
        }
        try {
            if (C0020.f64 != null) {
                m106 = m105((CharSequence) str);
            } else if (C0020.f61 != null) {
                m106 = m106((CharSequence) str);
            } else {
                throw new UnsupportedOperationException("The stripAccents(CharSequence) method requires at least Java6, but got: " + C0020.f63 + "; or a Sun JVM: " + C0020.f60);
            }
            return m106;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("IllegalAccessException occurred", e);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException("IllegalArgumentException occurred", e2);
        } catch (SecurityException e3) {
            throw new RuntimeException("SecurityException occurred", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("InvocationTargetException occurred", e4);
        }
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static int m120(CharSequence charSequence, CharSequence charSequence2, int i) {
        return m114(charSequence, charSequence2, i, true);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m128(CharSequence charSequence, char... cArr) {
        if (m89(charSequence) || C0166.m927(cArr)) {
            return -1;
        }
        int length = charSequence.length();
        int i = length - 1;
        int length2 = cArr.length;
        int i2 = length2 - 1;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            for (int i4 = 0; i4 < length2; i4++) {
                if (cArr[i4] == charAt) {
                    if (i3 >= i || i4 >= i2 || !Character.isHighSurrogate(charAt)) {
                        return i3;
                    }
                    if (cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m131(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return m130(charSequence, C0183.m1024(charSequence2));
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static int m132(CharSequence charSequence, char... cArr) {
        if (m89(charSequence) || C0166.m927(cArr)) {
            return -1;
        }
        int length = charSequence.length();
        int i = length - 1;
        int length2 = cArr.length;
        int i2 = length2 - 1;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            for (int i4 = 0; i4 < length2; i4++) {
                if (cArr[i4] != charAt || (i3 < i && i4 < i2 && Character.isHighSurrogate(charAt) && cArr[i4 + 1] != charSequence.charAt(i3 + 1))) {
                }
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m134(CharSequence charSequence, char... cArr) {
        if (cArr == null || charSequence == null) {
            return false;
        }
        if (charSequence.length() == 0) {
            return true;
        }
        return cArr.length != 0 && m132(charSequence, cArr) == -1;
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static String[] m152(String str) {
        return m166(str, null, -1, false);
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static String[] m161(String str) {
        return m166(str, null, -1, true);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static String[] m167(String str) {
        return m169(str, false);
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static String[] m168(String str) {
        return m169(str, true);
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static String m181(String str, String str2) {
        return (m89((CharSequence) str) || m89((CharSequence) str2)) ? str : m246((CharSequence) str, (CharSequence) str2, true) ? str.substring(str2.length()) : str;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static String m251(String str) {
        if (str == null) {
            return null;
        }
        return f59.matcher(m93(str)).replaceAll(" ");
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public static String m98(String str) {
        return str == null ? f56 : m99(str, (String) null);
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public static String m99(String str, String str2) {
        return m89((CharSequence) str) ? str : m101(m100(str, str2), str2);
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static int m113(CharSequence charSequence, CharSequence charSequence2, int i) {
        return m114(charSequence, charSequence2, i, false);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m136(CharSequence charSequence, char... cArr) {
        if (charSequence == null || cArr == null) {
            return true;
        }
        int length = charSequence.length();
        int i = length - 1;
        int length2 = cArr.length;
        int i2 = length2 - 1;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            for (int i4 = 0; i4 < length2; i4++) {
                if (cArr[i4] == charAt) {
                    if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                        return false;
                    }
                    if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public static String m146(String str, String str2) {
        int indexOf;
        return m89((CharSequence) str) ? str : (str2 == null || (indexOf = str.indexOf(str2)) == -1) ? f56 : str.substring(str2.length() + indexOf);
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static String[] m154(String str, String str2) {
        return m166(str, str2, -1, false);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static String[] m156(String str, String str2) {
        return m160(str, str2, -1, false);
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static String[] m158(String str, String str2) {
        return m160(str, str2, -1, true);
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static String[] m164(String str, String str2) {
        return m166(str, str2, -1, true);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static String m213(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static boolean m219(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static boolean m220(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(charSequence.charAt(i)) && charSequence.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m237(String str, String str2, int i) {
        if (m89((CharSequence) str) || m89((CharSequence) str2)) {
            return str;
        }
        if (i >= str.length() || i < str2.length() + 2) {
            return str;
        }
        int length = i - str2.length();
        int i2 = length / 2;
        int length2 = str.length() - i2;
        StringBuilder sb = new StringBuilder(i);
        sb.append(str.substring(0, (length % 2) + i2));
        sb.append(str2);
        sb.append(str.substring(length2));
        return sb.toString();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m238(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int m239 = m239((CharSequence) str, (CharSequence) str2);
        return m239 == -1 ? f56 : str2.substring(m239);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static int m121(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0183.m1023(charSequence, charSequence2, i);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static int m123(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        if (i > charSequence.length() - charSequence2.length()) {
            i = charSequence.length() - charSequence2.length();
        }
        if (i < 0) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            return i;
        }
        while (i >= 0) {
            if (C0183.m1025(charSequence, true, i, charSequence2, 0, charSequence2.length())) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m129(CharSequence charSequence, String str) {
        if (m89(charSequence) || m89((CharSequence) str)) {
            return -1;
        }
        return m128(charSequence, str.toCharArray());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m135(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return m134(charSequence, str.toCharArray());
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static String m180(String str, String str2) {
        return (m89((CharSequence) str) || m89((CharSequence) str2)) ? str : str.startsWith(str2) ? str.substring(str2.length()) : str;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static String m183(String str, String str2) {
        return (m89((CharSequence) str) || m89((CharSequence) str2)) ? str : m250((CharSequence) str, (CharSequence) str2, true) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m215(String str) {
        int length;
        return (str == null || (length = str.length()) == 0) ? str : new StringBuilder(length).append(Character.toTitleCase(str.charAt(0))).append(str.substring(1)).toString();
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static String m233(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m116(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        int i2 = i;
        int length = (charSequence.length() - charSequence2.length()) + 1;
        if (i2 > length) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            return i;
        }
        while (i < length) {
            if (C0183.m1025(charSequence, true, i, charSequence2, 0, charSequence2.length())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static String m140(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i = str.length() + i;
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? f56 : str.substring(i);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m182(String str, String str2) {
        return (m89((CharSequence) str) || m89((CharSequence) str2)) ? str : str.endsWith(str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static String m201(String str, int i) {
        return m202(str, i, ' ');
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m204(String str, int i) {
        return m205(str, i, ' ');
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m209(String str, int i, char c) {
        if (str == null || i <= 0) {
            return str;
        }
        int length = str.length();
        int i2 = i - length;
        return i2 <= 0 ? str : m202(m205(str, (i2 / 2) + length, c), i, c);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m230(String str, String str2) {
        if (str == null) {
            str = str2;
        }
        return str;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m109(CharSequence charSequence, int i) {
        if (m89(charSequence)) {
            return -1;
        }
        return C0183.m1020(charSequence, i, 0);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static String m143(String str, int i) {
        if (str == null) {
            return null;
        }
        return i < 0 ? f56 : str.length() <= i ? str : str.substring(str.length() - i);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m184(String str, String str2) {
        return (m89((CharSequence) str) || m89((CharSequence) str2)) ? str : m188(str, str2, f56, -1);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m198(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return f56;
        }
        int length = str.length();
        if (i == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i <= 8192) {
            return m200(str.charAt(0), i);
        }
        int i2 = length * i;
        if (length == 1) {
            return m200(str.charAt(0), i);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i2);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char[] cArr = new char[i2];
        int i4 = (i * 2) - 2;
        while (true) {
            int i5 = i4;
            if (i5 < 0) {
                return new String(cArr);
            }
            cArr[i5] = charAt;
            cArr[i5 + 1] = charAt2;
            i4 = (i5 - 1) - 1;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m210(String str, int i, String str2) {
        if (str == null || i <= 0) {
            return str;
        }
        if (m89((CharSequence) str2)) {
            str2 = " ";
        }
        int length = str.length();
        int i2 = i - length;
        return i2 <= 0 ? str : m203(m206(str, (i2 / 2) + length, str2), i, str2);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m228(CharSequence charSequence) {
        if (charSequence == null || m89(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isUpperCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ރ  reason: contains not printable characters */
    public static boolean m244(CharSequence charSequence, CharSequence charSequence2) {
        return m246(charSequence, charSequence2, false);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m112(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0183.m1021(charSequence, charSequence2, i);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m117(CharSequence charSequence, int i) {
        if (m89(charSequence)) {
            return -1;
        }
        return C0183.m1022(charSequence, i, charSequence.length());
    }

    /* renamed from: ރ  reason: contains not printable characters */
    public static String m145(String str, String str2) {
        if (m89((CharSequence) str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return f56;
        }
        int indexOf = str.indexOf(str2);
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String[] m157(String str, String str2, int i) {
        return m160(str, str2, i, false);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String[] m159(String str, String str2, int i) {
        return m160(str, str2, i, true);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static String[] m165(String str, String str2, int i) {
        return m166(str, str2, i, true);
    }

    @Deprecated
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m196(String str, String str2) {
        return m182(str, str2);
    }

    /* renamed from: ރ  reason: contains not printable characters */
    public static String m93(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public static String m101(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = length;
            if (length != 0) {
                if (str2 == null) {
                    while (i != 0 && Character.isWhitespace(str.charAt(i - 1))) {
                        i--;
                    }
                } else if (str2.length() == 0) {
                    return str;
                } else {
                    while (i != 0 && str2.indexOf(str.charAt(i - 1)) != -1) {
                        i--;
                    }
                }
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m124(CharSequence charSequence, int i) {
        return !m89(charSequence) && C0183.m1020(charSequence, i, 0) >= 0;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m138(CharSequence charSequence, CharSequence... charSequenceArr) {
        int m1021;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (m1021 = C0183.m1021(charSequence, charSequence2, 0)) != -1 && m1021 < i) {
                i = m1021;
            }
        }
        if (i == Integer.MAX_VALUE) {
            i = -1;
        }
        return i;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m139(CharSequence charSequence, CharSequence... charSequenceArr) {
        int m1023;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i = -1;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (m1023 = C0183.m1023(charSequence, charSequence2, charSequence.length())) > i) {
                i = m1023;
            }
        }
        return i;
    }

    /* renamed from: ނ  reason: contains not printable characters */
    public static String m148(String str, String str2) {
        int lastIndexOf;
        return m89((CharSequence) str) ? str : (m89((CharSequence) str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1 || lastIndexOf == str.length() - str2.length()) ? f56 : str.substring(str2.length() + lastIndexOf);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String[] m151(String str, String str2, String str3) {
        int indexOf;
        int i;
        int indexOf2;
        if (str == null || m89((CharSequence) str2) || m89((CharSequence) str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0166.f234;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length - length2 || (indexOf = str.indexOf(str2, i3)) < 0 || (indexOf2 = str.indexOf(str3, (i = indexOf + length3))) < 0) {
                break;
            }
            arrayList.add(str.substring(i, indexOf2));
            i2 = indexOf2 + length2;
        }
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String[] m162(String str, char c) {
        return m163(str, c, true);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m125(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || C0183.m1021(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m142(String str, int i) {
        if (str == null) {
            return null;
        }
        return i < 0 ? f56 : str.length() <= i ? str : str.substring(0, i);
    }

    /* renamed from: ނ  reason: contains not printable characters */
    public static String m217(String str) {
        if (m89((CharSequence) str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isTitleCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m227(CharSequence charSequence) {
        if (charSequence == null || m89(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLowerCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static boolean m247(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (m89(charSequence) || C0166.m923((Object[]) charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (m246(charSequence, charSequence2, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m118(CharSequence charSequence, int i, int i2) {
        if (m89(charSequence)) {
            return -1;
        }
        return C0183.m1022(charSequence, i, i2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m130(CharSequence charSequence, char... cArr) {
        if (m89(charSequence) || C0166.m927(cArr)) {
            return false;
        }
        int length = charSequence.length();
        int length2 = cArr.length;
        int i = length - 1;
        int i2 = length2 - 1;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            for (int i4 = 0; i4 < length2; i4++) {
                if (cArr[i4] == charAt) {
                    if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                        return true;
                    }
                    if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m150(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || str2 == null || str3 == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m186(String str, String str2, String str3) {
        return m188(str, str2, str3, 1);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m137(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return true;
        }
        return m136(charSequence, str.toCharArray());
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m202(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        return length <= 0 ? str : length > 8192 ? m203(str, i, String.valueOf(c)) : str.concat(m200(c, length));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m205(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        return length <= 0 ? str : length > 8192 ? m206(str, i, String.valueOf(c)) : m200(c, length).concat(str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m127(CharSequence charSequence) {
        if (m89(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m203(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (m89((CharSequence) str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return m202(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return str.concat(new String(cArr));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m206(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (m89((CharSequence) str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return m205(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return new String(cArr).concat(str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m144(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0 || i > str.length()) {
            return f56;
        }
        if (i < 0) {
            i = 0;
        }
        int i3 = i + i2;
        return str.length() <= i3 ? str.substring(i) : str.substring(i, i3);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String[] m153(String str, char c) {
        return m163(str, c, false);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m250(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        } else if (charSequence2.length() <= charSequence.length()) {
            return C0183.m1025(charSequence, z, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
        } else {
            return false;
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String[] m155(String str, String str2, int i) {
        return m166(str, str2, i, false);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m199(String str, String str2, int i) {
        return (str == null || str2 == null) ? m198(str, i) : m182(m198(str.concat(str2), i), str2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m252(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (m89(charSequence) || C0166.m923((Object[]) charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (m250(charSequence, charSequence2, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m141(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 = str.length() + i2;
        }
        if (i < 0) {
            i = str.length() + i;
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return f56;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m193(String str, String str2, String str3) {
        if (m89((CharSequence) str) || m89((CharSequence) str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = f56;
        }
        boolean z = false;
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length2);
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            int indexOf = str2.indexOf(charAt);
            if (indexOf >= 0) {
                z = true;
                if (indexOf < length) {
                    sb.append(str3.charAt(indexOf));
                }
            } else {
                sb.append(charAt);
            }
        }
        return z ? sb.toString() : str;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m241(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return f56;
        }
        int m240 = m240((CharSequence[]) strArr);
        if (m240 != -1) {
            return m240 == 0 ? f56 : strArr[0].substring(0, m240);
        }
        String str = strArr[0];
        return str == null ? f56 : str;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m190(String str, String[] strArr, String[] strArr2) {
        return m191(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m243(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        int length = charSequence.length();
        int i2 = length;
        int length2 = charSequence2.length();
        if (length == 0) {
            if (length2 > i) {
                length2 = -1;
            }
            return length2;
        } else if (length2 == 0) {
            if (i2 > i) {
                i2 = -1;
            }
            return i2;
        } else {
            if (i2 > length2) {
                length2 = charSequence.length();
                i2 = length2;
            } else {
                charSequence2 = charSequence;
                charSequence = charSequence2;
            }
            int i3 = i2 + 1;
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int min = Math.min(i2, i) + 1;
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = i4;
                iArr[i5] = i5;
            }
            Arrays.fill(iArr, min, i3, Integer.MAX_VALUE);
            Arrays.fill(iArr2, Integer.MAX_VALUE);
            int i6 = 1;
            while (i6 <= length2) {
                char charAt = charSequence.charAt(i6 - 1);
                iArr2[0] = i6;
                int max = Math.max(1, i6 - i);
                int i7 = max;
                int min2 = Math.min(i2, i6 + i);
                if (max > min2) {
                    return -1;
                }
                if (i7 > 1) {
                    iArr2[i7 - 1] = Integer.MAX_VALUE;
                }
                while (i7 <= min2) {
                    int i8 = i7 - 1;
                    if (charSequence2.charAt(i8) == charAt) {
                        iArr2[i7] = iArr[i8];
                    } else {
                        iArr2[i7] = Math.min(Math.min(iArr2[i8], iArr[i7]), iArr[i8]) + 1;
                    }
                    i7++;
                }
                i6++;
                int[] iArr3 = iArr2;
                iArr2 = iArr;
                iArr = iArr3;
            }
            int i9 = iArr[i2];
            if (i9 > i) {
                return -1;
            }
            return i9;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m110(CharSequence charSequence, int i, int i2) {
        if (m89(charSequence)) {
            return -1;
        }
        return C0183.m1020(charSequence, i, i2);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m234(String str, char c) {
        if (str == null) {
            return null;
        }
        String[] m163 = m163(str, c, false);
        C0166.m840(m163);
        return m171(m163, c);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m240(CharSequence... charSequenceArr) {
        if (charSequenceArr == null || charSequenceArr.length <= 1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = true;
        int length = charSequenceArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            CharSequence charSequence = charSequenceArr[i3];
            if (charSequence == null) {
                z = true;
                i = 0;
            } else {
                z2 = false;
                i = Math.min(charSequence.length(), i);
                i2 = Math.max(charSequenceArr[i3].length(), i2);
            }
        }
        if (z2) {
            return -1;
        }
        if (i2 == 0 && !z) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            char charAt = charSequenceArr[0].charAt(i5);
            int i6 = 1;
            while (true) {
                if (i6 >= length) {
                    break;
                } else if (charSequenceArr[i6].charAt(i5) != charAt) {
                    i4 = i5;
                    break;
                } else {
                    i6++;
                }
            }
            if (i4 != -1) {
                break;
            }
        }
        return (i4 != -1 || i == i2) ? i4 : i;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String[] m166(String str, String str2, int i, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0166.f234;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        if (str2 == null) {
            while (i3 < length) {
                if (Character.isWhitespace(str.charAt(i3))) {
                    if (z2 || z) {
                        int i5 = i2;
                        boolean z4 = true;
                        i2++;
                        if (i5 == i) {
                            z4 = false;
                            i3 = length;
                        }
                        arrayList.add(str.substring(i4, i3));
                        z3 = z4;
                        z2 = false;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                } else {
                    z3 = false;
                    z2 = true;
                    i3++;
                }
            }
        } else if (str2.length() == 1) {
            char charAt = str2.charAt(0);
            while (i3 < length) {
                if (str.charAt(i3) == charAt) {
                    if (z2 || z) {
                        int i6 = i2;
                        boolean z5 = true;
                        i2++;
                        if (i6 == i) {
                            z5 = false;
                            i3 = length;
                        }
                        arrayList.add(str.substring(i4, i3));
                        z3 = z5;
                        z2 = false;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                } else {
                    z3 = false;
                    z2 = true;
                    i3++;
                }
            }
        } else {
            while (i3 < length) {
                if (str2.indexOf(str.charAt(i3)) >= 0) {
                    if (z2 || z) {
                        int i7 = i2;
                        boolean z6 = true;
                        i2++;
                        if (i7 == i) {
                            z6 = false;
                            i3 = length;
                        }
                        arrayList.add(str.substring(i4, i3));
                        z3 = z6;
                        z2 = false;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                } else {
                    z3 = false;
                    z2 = true;
                    i3++;
                }
            }
        }
        if (z2 || (z && z3)) {
            arrayList.add(str.substring(i4, i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m177(Iterable<?> iterable, char c) {
        if (iterable == null) {
            return null;
        }
        return m175(iterable.iterator(), c);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m178(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return m176(iterable.iterator(), str);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m246(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        } else if (charSequence2.length() <= charSequence.length()) {
            return C0183.m1025(charSequence, z, 0, charSequence2, 0, charSequence2.length());
        } else {
            return false;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String[] m102(String... strArr) {
        return m103(strArr, (String) null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m175(Iterator<?> it, char c) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return f56;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0472.m2417(next);
        }
        StringBuilder sb = new StringBuilder((int) C0255.C0256.f529);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(c);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m176(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return f56;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0472.m2417(next);
        }
        StringBuilder sb = new StringBuilder((int) C0255.C0256.f529);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m212(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(locale);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> String m170(T... tArr) {
        return m173(tArr, (String) null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m171(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        return m172(objArr, c, 0, objArr.length);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m172(Object[] objArr, char c, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f56;
        }
        StringBuilder sb = new StringBuilder(i3 * 16);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(c);
            }
            Object obj = objArr[i4];
            if (obj != null) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m173(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return m174(objArr, str, 0, objArr.length);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m174(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = f56;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return f56;
        }
        StringBuilder sb = new StringBuilder(i3 * 16);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(str);
            }
            Object obj = objArr[i4];
            if (obj != null) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m214(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(locale);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m114(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        int i2;
        if (charSequence == null || charSequence2 == null || i <= 0) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            if (!z) {
                return 0;
            }
            return charSequence.length();
        }
        int i3 = 0;
        int length = z ? charSequence.length() : -1;
        do {
            length = z ? C0183.m1023(charSequence, charSequence2, length - 1) : C0183.m1021(charSequence, charSequence2, length + 1);
            if (length < 0) {
                return length;
            }
            i2 = i3 + 1;
            i3 = i2;
        } while (i2 < i);
        return length;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m194(String str, String str2, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = f56;
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        if (i > length) {
            i = length;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > length) {
            i2 = length;
        }
        if (i > i2) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        return new StringBuilder(str2.length() + ((length + i) - i2) + 1).append(str.substring(0, i)).append(str2).append(str.substring(i2)).toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m185(String str, char c) {
        if (m89((CharSequence) str) || str.indexOf(c) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        for (char c2 : charArray) {
            if (c2 != c) {
                charArray[i] = c2;
                i++;
            }
        }
        return new String(charArray, 0, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m200(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m187(String str, String str2, String str3) {
        return m188(str, str2, str3, -1);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m188(String str, String str2, String str3, int i) {
        if (m89((CharSequence) str) || m89((CharSequence) str2) || str3 == null || i == 0) {
            return str;
        }
        int i2 = 0;
        int indexOf = str.indexOf(str2, 0);
        int i3 = indexOf;
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        int i4 = length2;
        if (length2 < 0) {
            i4 = 0;
        }
        StringBuilder sb = new StringBuilder(str.length() + (i4 * (i < 0 ? 16 : i > 64 ? 64 : i)));
        while (i3 != -1) {
            sb.append(str.substring(i2, i3)).append(str3);
            i2 = i3 + length;
            int i5 = i - 1;
            i = i5;
            if (i5 == 0) {
                break;
            }
            i3 = str.indexOf(str2, i2);
        }
        sb.append(str.substring(i2));
        return sb.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m192(String str, char c, char c2) {
        if (str == null) {
            return null;
        }
        return str.replace(c, c2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m189(String str, String[] strArr, String[] strArr2) {
        return m191(str, strArr, strArr2, false, 0);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m191(String str, String[] strArr, String[] strArr2, boolean z, int i) {
        String str2;
        String str3;
        int length;
        String str4;
        if (str == null || str.length() == 0 || strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return str;
        }
        if (i < 0) {
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
        }
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (length2 != length3) {
            throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
        }
        boolean[] zArr = new boolean[length2];
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!zArr[i4] && (str4 = strArr[i4]) != null && str4.length() != 0 && strArr2[i4] != null) {
                int indexOf = str.indexOf(strArr[i4]);
                if (indexOf == -1) {
                    zArr[i4] = true;
                } else if (i2 == -1 || indexOf < i2) {
                    i3 = i4;
                    i2 = indexOf;
                }
            }
        }
        if (i2 == -1) {
            return str;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (strArr[i7] != null && (str3 = strArr2[i7]) != null && (length = str3.length() - strArr[i7].length()) > 0) {
                i6 = (length * 3) + i6;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + Math.min(i6, str.length() / 5));
        while (i2 != -1) {
            while (i5 < i2) {
                sb.append(str.charAt(i5));
                i5++;
            }
            sb.append(strArr2[i3]);
            i5 = strArr[i3].length() + i2;
            i2 = -1;
            i3 = -1;
            for (int i8 = 0; i8 < length2; i8++) {
                if (!zArr[i8] && (str2 = strArr[i8]) != null && str2.length() != 0 && strArr2[i8] != null) {
                    int indexOf2 = str.indexOf(strArr[i8], i5);
                    if (indexOf2 == -1) {
                        zArr[i8] = true;
                    } else if (i2 == -1 || indexOf2 < i2) {
                        i3 = i8;
                        i2 = indexOf2;
                    }
                }
            }
        }
        int length4 = str.length();
        while (i5 < length4) {
            sb.append(str.charAt(i5));
            i5++;
        }
        String sb2 = sb.toString();
        return !z ? sb2 : m191(sb2, strArr, strArr2, z, i - 1);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String[] m169(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return C0166.f234;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int type = Character.getType(charArray[0]);
        for (int i2 = 1; i2 < charArray.length; i2++) {
            int type2 = Character.getType(charArray[i2]);
            if (type2 != type) {
                if (z && type2 == 2 && type == 1) {
                    int i3 = i2 - 1;
                    if (i3 != i) {
                        arrayList.add(new String(charArray, i, i3 - i));
                        i = i3;
                    }
                } else {
                    arrayList.add(new String(charArray, i, i2 - i));
                    i = i2;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String[] m160(String str, String str2, int i, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0166.f234;
        }
        if (str2 == null || f56.equals(str2)) {
            return m166(str, null, i, z);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int indexOf = str.indexOf(str2, i3);
            i4 = indexOf;
            if (indexOf > -1) {
                if (i4 > i3) {
                    int i5 = i2 + 1;
                    i2 = i5;
                    if (i5 != i) {
                        arrayList.add(str.substring(i3, i4));
                        i3 = i4 + length2;
                    }
                } else {
                    if (z) {
                        int i6 = i2 + 1;
                        i2 = i6;
                        if (i6 == i) {
                            arrayList.add(str.substring(i3));
                            i4 = length;
                        } else {
                            arrayList.add(f56);
                        }
                    }
                    i3 = i4 + length2;
                }
            }
            arrayList.add(str.substring(i3));
            i4 = length;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String[] m163(String str, char c, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C0166.f234;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (z2 || z) {
                    arrayList.add(str.substring(i2, i));
                    z3 = true;
                    z2 = false;
                }
                i2 = i + 1;
                i = i2;
            } else {
                z3 = false;
                z2 = true;
                i++;
            }
        }
        if (z2 || (z && z3)) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String[] m103(String[] strArr, String str) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = m99(strArr[i], str);
        }
        return strArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m253(byte[] bArr, String str) throws UnsupportedEncodingException {
        String str2;
        if (str == null) {
            str2 = r0;
            String str3 = new String(bArr);
        } else {
            str2 = new String(bArr, str);
        }
        return str2;
    }
}
