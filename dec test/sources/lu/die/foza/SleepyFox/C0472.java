package lu.die.foza.SleepyFox;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: lu.die.foza.SleepyFox.ၻ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၻ.class */
public class C0472 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0473 f1077 = new C0473();

    /* renamed from: lu.die.foza.SleepyFox.ၻ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၻ$Ϳ.class */
    public static class C0473 implements Serializable {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final long f1078 = 7092611880189329093L;

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Object m2429() {
            return C0472.f1077;
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static int m2413(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m2415(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        m2416(stringBuffer, obj);
        return stringBuffer.toString();
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m2417(Object obj) {
        return obj == null ? C0019.f56 : obj.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T m2426(T t) {
        Object invoke;
        if (t instanceof Cloneable) {
            if (t.getClass().isArray()) {
                Class<?> componentType = t.getClass().getComponentType();
                if (!componentType.isPrimitive()) {
                    invoke = ((Object[]) t).clone();
                } else {
                    int length = Array.getLength(t);
                    int i = length;
                    Object newInstance = Array.newInstance(componentType, length);
                    while (true) {
                        int i2 = i;
                        i = i2 - 1;
                        if (i2 <= 0) {
                            break;
                        }
                        Array.set(newInstance, i, Array.get(t, i));
                    }
                    invoke = newInstance;
                }
            } else {
                try {
                    invoke = t.getClass().getMethod("clone", new Class[0]).invoke(t, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new C0192("Cannot clone Cloneable type ".concat(t.getClass().getName()), e);
                } catch (NoSuchMethodException e2) {
                    throw new C0192("Cloneable type " + t.getClass().getName() + " has no clone method", e2);
                } catch (InvocationTargetException e3) {
                    throw new C0192("Exception cloning Cloneable type ".concat(t.getClass().getName()), e3.getCause());
                }
            }
            return (T) invoke;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T> T m2427(T t) {
        Object m2426 = m2426(t);
        if (m2426 != 0) {
            t = m2426;
        }
        return t;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean m2411(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static <T extends Comparable<? super T>> T m2419(T... tArr) {
        T t = null;
        if (tArr != null) {
            for (T t2 : tArr) {
                if (m2422(t2, t, true) < 0) {
                    t = t2;
                }
            }
        }
        return t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Comparable<? super T>> int m2421(T t, T t2) {
        return m2422(t, t2, false);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int m2414(Object... objArr) {
        int i = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                i = m2413(obj) + (i * 31);
            }
        }
        return i;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Comparable<? super T>> int m2422(T t, T t2, boolean z) {
        if (t == t2) {
            return 0;
        }
        return t == null ? z ? 1 : -1 : t2 == null ? z ? -1 : 1 : t.compareTo(t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ԩ  reason: contains not printable characters */
    public static <T> T m2425(T... tArr) {
        if (C0166.m932((Object[]) tArr)) {
            HashMap hashMap = new HashMap(tArr.length);
            for (T t : tArr) {
                C0463 c0463 = (C0463) hashMap.get(t);
                if (c0463 == null) {
                    hashMap.put(t, new C0463(1));
                } else {
                    c0463.increment();
                }
            }
            T t2 = null;
            int i = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((C0463) entry.getValue()).intValue();
                if (intValue == i) {
                    t2 = null;
                } else if (intValue > i) {
                    t2 = entry.getKey();
                    i = intValue;
                }
            }
            return t2;
        }
        return null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T m2409(T t, T t2) {
        if (t == null) {
            t = t2;
        }
        return t;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean m2412(Object obj, Object obj2) {
        return !m2411(obj, obj2);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static <T extends Comparable<? super T>> T m2423(T... tArr) {
        C0023.m271(tArr);
        C0023.m281((Object[]) tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T m2410(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                if (t != null) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m2416(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            stringBuffer.append(obj.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        throw new NullPointerException("Cannot get the toString of a null identity");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T extends Comparable<? super T>> T m2420(T... tArr) {
        T t = null;
        if (tArr != null) {
            for (T t2 : tArr) {
                if (m2422(t2, t, false) > 0) {
                    t = t2;
                }
            }
        }
        return t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> T m2424(Comparator<T> comparator, T... tArr) {
        C0023.m270(tArr, "null/empty items", new Object[0]);
        C0023.m281((Object[]) tArr);
        C0023.m269(comparator, "null comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m2418(Object obj, String str) {
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }
}
