package lu.die.foza.SleepyFox;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
/* renamed from: lu.die.foza.SleepyFox.ʸ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʸ.class */
public class C0023 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final String f67 = "The value %s is not in the specified exclusive range of %s to %s";

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final String f68 = "The value %s is not in the specified inclusive range of %s to %s";

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String f69 = "The string %s does not match the pattern %s";

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final String f70 = "The validated object is null";

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final String f71 = "The validated expression is false";

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final String f72 = "The validated array contains null element at index: %d";

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final String f73 = "The validated collection contains null element at index: %d";

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final String f74 = "The validated character sequence is blank";

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final String f75 = "The validated array is empty";

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final String f76 = "The validated character sequence is empty";

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final String f77 = "The validated collection is empty";

    /* renamed from: ֏  reason: contains not printable characters */
    public static final String f78 = "The validated map is empty";

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final String f79 = "The validated array index is invalid: %d";

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final String f80 = "The validated character sequence index is invalid: %d";

    /* renamed from: ހ  reason: contains not printable characters */
    public static final String f81 = "The validated collection index is invalid: %d";

    /* renamed from: ށ  reason: contains not printable characters */
    public static final String f82 = "The validated state is false";

    /* renamed from: ނ  reason: contains not printable characters */
    public static final String f83 = "Cannot assign a %s to a %s";

    /* renamed from: ރ  reason: contains not printable characters */
    public static final String f84 = "Expected type: %s, actual: %s";

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T> void m294(T t, T t2, Comparable<T> comparable) {
        if (comparable.compareTo(t) < 0 || comparable.compareTo(t2) > 0) {
            throw new IllegalArgumentException(String.format(f68, comparable, t, t2));
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> void m296(T t, T t2, Comparable<T> comparable) {
        if (comparable.compareTo(t) <= 0 || comparable.compareTo(t2) >= 0) {
            throw new IllegalArgumentException(String.format(f67, comparable, t, t2));
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T> void m295(T t, T t2, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t) < 0 || comparable.compareTo(t2) > 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> void m297(T t, T t2, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t) <= 0 || comparable.compareTo(t2) >= 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T extends CharSequence> T m277(T t) {
        return (T) m276(t, f76, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m300(Class<?> cls, Class<?> cls2) {
        if (!cls.isAssignableFrom(cls2)) {
            Object[] objArr = new Object[2];
            objArr[0] = cls2 == null ? "null" : cls2.getName();
            objArr[1] = cls.getName();
            throw new IllegalArgumentException(String.format(f83, objArr));
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T extends CharSequence> T m276(T t, String str, Object... objArr) {
        if (t != null) {
            if (t.length() == 0) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m301(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T> T[] m271(T[] tArr) {
        return (T[]) m270(tArr, f75, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m298(Class<?> cls, Object obj) {
        if (!cls.isInstance(obj)) {
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = obj == null ? "null" : obj.getClass().getName();
            throw new IllegalArgumentException(String.format(f84, objArr));
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T> T[] m270(T[] tArr, String str, Object... objArr) {
        if (tArr != null) {
            if (tArr.length == 0) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return tArr;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m299(Class<?> cls, Object obj, String str, Object... objArr) {
        if (cls.isInstance(obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m267(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(f71);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static void m290(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException(f82);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m265(boolean z, String str, double d) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, Double.valueOf(d)));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static void m291(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m264(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, Long.valueOf(j)));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m266(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m292(CharSequence charSequence, String str) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        throw new IllegalArgumentException(String.format(f69, charSequence, str));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m293(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        throw new IllegalArgumentException(String.format(str2, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Iterable<?>> T m283(T t) {
        return (T) m282((Iterable) t, f73, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Iterable<?>> T m282(T t, String str, Object... objArr) {
        m268(t);
        int i = 0;
        for (Object obj : t) {
            if (obj == null) {
                throw new IllegalArgumentException(String.format(str, C0166.m941(objArr, Integer.valueOf(i))));
            }
            i++;
        }
        return t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m281(T[] tArr) {
        return (T[]) m280((Object[]) tArr, f72, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m280(T[] tArr, String str, Object... objArr) {
        m268(tArr);
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                throw new IllegalArgumentException(String.format(str, C0166.m950((Integer[]) objArr, Integer.valueOf(i))));
            }
        }
        return tArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends CharSequence> T m279(T t) {
        return (T) m278((CharSequence) t, f74, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends CharSequence> T m278(T t, String str, Object... objArr) {
        if (t != null) {
            if (C0019.m91(t)) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Collection<?>> T m273(T t) {
        return (T) m272((Collection) t, f77, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Collection<?>> T m272(T t, String str, Object... objArr) {
        if (t != null) {
            if (t.isEmpty()) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Map<?, ?>> T m275(T t) {
        return (T) m274((Map) t, f78, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Map<?, ?>> T m274(T t, String str, Object... objArr) {
        if (t != null) {
            if (t.isEmpty()) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T m268(T t) {
        return (T) m269(t, f70, new Object[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T m269(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends CharSequence> T m289(T t, int i) {
        return (T) m288(t, i, f80, Integer.valueOf(i));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends CharSequence> T m288(T t, int i, String str, Object... objArr) {
        m268(t);
        if (i < 0 || i >= t.length()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Collection<?>> T m287(T t, int i) {
        return (T) m286(t, i, f81, Integer.valueOf(i));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Collection<?>> T m286(T t, int i, String str, Object... objArr) {
        m268(t);
        if (i < 0 || i >= t.size()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m285(T[] tArr, int i) {
        return (T[]) m284(tArr, i, f79, Integer.valueOf(i));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T[] m284(T[] tArr, int i, String str, Object... objArr) {
        m268(tArr);
        if (i < 0 || i >= tArr.length) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return tArr;
    }
}
