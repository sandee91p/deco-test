package lu.die.foza.SleepyFox;

import lu.die.foza.SleepyFox.C0255;
/* renamed from: lu.die.foza.SleepyFox.ޑ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޑ.class */
public class C0184 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final String[] f280 = new String[C0255.C0256.f530];

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final char f281 = '\n';

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final char f282 = '\r';

    @Deprecated
    /* renamed from: ԯ  reason: contains not printable characters */
    public static Character m1026(char c) {
        return Character.valueOf(c);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static int m1032(char c) {
        if (m1046(c)) {
            return c - '0';
        }
        throw new IllegalArgumentException("The character " + c + " is not in the range '0' - '9'");
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static String m1036(char c) {
        return c < 128 ? f280[c] : new String(new char[]{c});
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static String m1038(char c) {
        return c < 16 ? "\\u000" + Integer.toHexString(c) : c < 256 ? "\\u00" + Integer.toHexString(c) : c < 4096 ? "\\u0" + Integer.toHexString(c) : "\\u" + Integer.toHexString(c);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1040(char c) {
        return c < 128;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static boolean m1041(char c) {
        return c >= ' ' && c < 127;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static boolean m1042(char c) {
        return c < ' ' || c == 127;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m1043(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static boolean m1044(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m1045(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static boolean m1046(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static boolean m1047(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    static {
        char c = 0;
        while (true) {
            char c2 = c;
            String[] strArr = f280;
            if (c2 < strArr.length) {
                strArr[c2] = String.valueOf(c2);
                c = (char) (c2 + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Character m1027(String str) {
        if (C0019.m89((CharSequence) str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char m1028(Character ch) {
        if (ch != null) {
            return ch.charValue();
        }
        throw new IllegalArgumentException("The Character must not be null");
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m1037(Character ch) {
        if (ch == null) {
            return null;
        }
        return m1036(ch.charValue());
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m1039(Character ch) {
        if (ch == null) {
            return null;
        }
        return m1038(ch.charValue());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char m1029(Character ch, char c) {
        return ch == null ? c : ch.charValue();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m1034(Character ch) {
        if (ch != null) {
            return m1032(ch.charValue());
        }
        throw new IllegalArgumentException("The character must not be null");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char m1030(String str) {
        if (!C0019.m89((CharSequence) str)) {
            return str.charAt(0);
        }
        throw new IllegalArgumentException("The String must not be empty");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char m1031(String str, char c) {
        return C0019.m89((CharSequence) str) ? c : str.charAt(0);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1033(char c, int i) {
        return !m1046(c) ? i : c - '0';
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1035(Character ch, int i) {
        return ch == null ? i : m1033(ch.charValue(), i);
    }
}
