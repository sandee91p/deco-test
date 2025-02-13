package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.ސ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ސ.class */
public class C0183 {
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1020(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < length) {
            if (charSequence.charAt(i2) == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m1022(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            return -1;
        }
        if (i2 >= length) {
            i2 = length - 1;
        }
        while (i2 >= 0) {
            if (charSequence.charAt(i2) == i) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m1021(CharSequence charSequence, CharSequence charSequence2, int i) {
        return charSequence.toString().indexOf(charSequence2.toString(), i);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m1023(CharSequence charSequence, CharSequence charSequence2, int i) {
        return charSequence.toString().lastIndexOf(charSequence2.toString(), i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1025(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        return (!(charSequence instanceof String) || !(charSequence2 instanceof String)) ? charSequence.toString().regionMatches(z, i, charSequence2.toString(), i2, i3) : ((String) charSequence).regionMatches(z, i, (String) charSequence2, i2, i3);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static CharSequence m1019(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i, charSequence.length());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static char[] m1024(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i = 0; i < length; i++) {
            cArr[i] = charSequence.charAt(i);
        }
        return cArr;
    }
}
