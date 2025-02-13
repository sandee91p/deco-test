package lu.die.foza.SleepyFox;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* renamed from: lu.die.foza.SleepyFox.ޒ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޒ.class */
public class C0185 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final char f283 = '.';

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final char f285 = '$';

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final Map<Class<?>, Class<?>> f287;

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final Map<String, String> f289;

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final Map<String, String> f290;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final String f284 = String.valueOf('.');

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final String f286 = String.valueOf('$');

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final Map<Class<?>, Class<?>> f288 = new HashMap();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m1049(String str, String str2) {
        f289.put(str, str2);
        f290.put(str2, str);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static String m1051(Class<?> cls) {
        return cls == null ? C0019.f56 : m1052(cls.getName());
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static String m1053(Class<?> cls) {
        return cls == null ? C0019.f56 : cls.getSimpleName();
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m1056(Class<?> cls) {
        return cls == null ? C0019.f56 : m1057(cls.getName());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static List<String> m1062(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static boolean m1065(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || f288.containsKey(cls);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static boolean m1066(Class<?> cls) {
        return f288.containsKey(cls);
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static Class<?> m1069(Class<?> cls) {
        if (cls != null && cls.isPrimitive()) {
            cls = f287.get(cls);
        }
        return cls;
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static Class<?> m1071(Class<?> cls) {
        return f288.get(cls);
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static boolean m1073(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m1082(Class<?> cls) {
        return cls == null ? C0019.f56 : m1052(m1087(cls.getName()));
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m1085(Class<?> cls) {
        return cls == null ? C0019.f56 : m1057(m1087(cls.getName()));
    }

    static {
        HashMap hashMap = new HashMap();
        f287 = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        hashMap.put(cls, cls);
        for (Class<?> cls2 : hashMap.keySet()) {
            Class<?> cls3 = f287.get(cls2);
            if (!cls2.equals(cls3)) {
                f288.put(cls3, cls2);
            }
        }
        f289 = new HashMap();
        f290 = new HashMap();
        m1049("int", "I");
        m1049("boolean", "Z");
        m1049("float", "F");
        m1049("long", "J");
        m1049("short", "S");
        m1049("byte", "B");
        m1049("double", "D");
        m1049("char", "C");
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static String m1052(String str) {
        if (str == null || str.length() == 0) {
            return C0019.f56;
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append("[]");
            }
            if (str.charAt(0) == 'L') {
                String str2 = str;
                if (str2.charAt(str2.length() - 1) == ';') {
                    String str3 = str;
                    str = str3.substring(1, str3.length() - 1);
                }
            }
        }
        Map<String, String> map = f290;
        if (map.containsKey(str)) {
            str = map.get(str);
        }
        int lastIndexOf = str.lastIndexOf(46);
        int indexOf = str.indexOf(36, lastIndexOf == -1 ? 0 : lastIndexOf + 1);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m1057(String str) {
        if (str == null || str.length() == 0) {
            return C0019.f56;
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L') {
            String str2 = str;
            if (str2.charAt(str2.length() - 1) == ';') {
                str = str.substring(1);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? C0019.f56 : str.substring(0, lastIndexOf);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static List<Class<?>> m1058(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Class<? super Object> superclass = cls.getSuperclass();
        while (true) {
            Class<? super Object> cls2 = superclass;
            if (cls2 == null) {
                return arrayList;
            }
            arrayList.add(cls2);
            superclass = cls2.getSuperclass();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static List<Class<?>> m1061(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static String m1079(String str) {
        String m179 = C0019.m179(str);
        String str2 = m179;
        if (m179 != null) {
            if (str2.endsWith("[]")) {
                StringBuilder sb = new StringBuilder();
                while (str2.endsWith("[]")) {
                    String str3 = str2;
                    str2 = str3.substring(0, str3.length() - 2);
                    sb.append("[");
                }
                String str4 = f289.get(str2);
                if (str4 != null) {
                    sb.append(str4);
                } else {
                    sb.append("L").append(str2).append(";");
                }
                str2 = sb.toString();
            }
            return str2;
        }
        throw new NullPointerException("className must not be null.");
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m1083(String str) {
        return m1052(m1087(str));
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m1086(String str) {
        return m1057(m1087(str));
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String m1050(Object obj, String str) {
        return obj == null ? str : m1051(obj.getClass());
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m1054(Object obj, String str) {
        return obj == null ? str : m1053(obj.getClass());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static List<Class<?>> m1059(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m1060(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Class<?> m1076(String str) throws ClassNotFoundException {
        return m1077(str, true);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String m1081(Object obj, String str) {
        return obj == null ? str : m1052(m1087(obj.getClass().getName()));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m1055(Object obj, String str) {
        return obj == null ? str : m1056(obj.getClass());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m1060(Class<?> cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces;
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    m1060(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Class<?>[] m1072(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = m1071(clsArr[i]);
        }
        return clsArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m1087(String str) {
        String m179 = C0019.m179(str);
        String str2 = m179;
        if (m179 == null) {
            return null;
        }
        int i = 0;
        while (str2.startsWith("[")) {
            i++;
            str2 = str2.substring(1);
        }
        if (i < 1) {
            return str2;
        }
        if (str2.startsWith("L")) {
            str2 = str2.substring(1, str2.endsWith(";") ? str2.length() - 1 : str2.length());
        } else if (str2.length() > 0) {
            str2 = f290.get(str2.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(str2);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Class<?> m1075(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return m1074(classLoader, str, true);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Class<?> m1074(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        try {
            Map<String, String> map = f289;
            return map.containsKey(str) ? Class.forName("[" + map.get(str), z, classLoader).getComponentType() : Class.forName(m1079(str), z, classLoader);
        } catch (ClassNotFoundException e) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return m1074(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Class<?> m1077(String str, boolean z) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader = contextClassLoader;
        if (contextClassLoader == null) {
            classLoader = C0185.class.getClassLoader();
        }
        return m1074(classLoader, str, z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m1084(Object obj, String str) {
        return obj == null ? str : m1057(m1087(obj.getClass().getName()));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Method m1078(Class<?> cls, String str, Class<?>... clsArr) throws SecurityException, NoSuchMethodException {
        Method method = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m1059(cls));
        arrayList.addAll(m1058(cls));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + str + " " + C0166.m787((Object) clsArr));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1067(Class<?> cls, Class<?> cls2) {
        return m1068(cls, cls2, C0223.m1251(EnumC0434.JAVA_1_5));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1068(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive()) {
                Class<?> m1069 = m1069(cls);
                cls = m1069;
                if (m1069 == null) {
                    return false;
                }
            }
            if (cls2.isPrimitive() && !cls.isPrimitive()) {
                Class<?> m1071 = m1071(cls);
                cls = m1071;
                if (m1071 == null) {
                    return false;
                }
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        if (cls3.equals(cls)) {
            return Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        Class cls4 = Long.TYPE;
        if (cls4.equals(cls)) {
            return Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
            return false;
        } else {
            Class cls5 = Float.TYPE;
            if (cls5.equals(cls)) {
                return Double.TYPE.equals(cls2);
            }
            if (Character.TYPE.equals(cls)) {
                return cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
            } else if (Short.TYPE.equals(cls)) {
                return cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
            } else if (!Byte.TYPE.equals(cls)) {
                return false;
            } else {
                return Short.TYPE.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1063(Class<?>[] clsArr, Class<?>... clsArr2) {
        return m1064(clsArr, clsArr2, C0223.m1251(EnumC0434.JAVA_1_5));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static boolean m1064(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (!C0166.m829((Object[]) clsArr, (Object[]) clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = C0166.f233;
        }
        if (clsArr2 == null) {
            clsArr2 = C0166.f233;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!m1068(clsArr[i], clsArr2[i], z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Class<?>[] m1070(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = m1069(clsArr[i]);
        }
        return clsArr2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Class<?>[] m1080(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return C0166.f233;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? null : obj.getClass();
        }
        return clsArr;
    }
}
