package lu.die.foza.SleepyFox;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/* renamed from: lu.die.foza.SleepyFox.ˊ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˊ.class */
public class C0046 extends C0052 {

    /* renamed from: ԭ  reason: contains not printable characters */
    public String[] f127;

    /* renamed from: ԫ  reason: contains not printable characters */
    public boolean f125 = false;

    /* renamed from: Ԭ  reason: contains not printable characters */
    public boolean f126 = false;

    /* renamed from: Ԯ  reason: contains not printable characters */
    public Class<?> f128 = null;

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String m434(Object obj) {
        return m438(obj, null, false, false, null);
    }

    public C0046(Object obj) {
        super(obj);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean m443(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !m449()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !m448()) {
            return false;
        }
        String[] strArr = this.f127;
        return strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public String[] m445() {
        return (String[]) this.f127.clone();
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public Class<?> m446() {
        return this.f128;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public Object m447(Field field) throws IllegalArgumentException, IllegalAccessException {
        return field.get(m532());
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public boolean m448() {
        return this.f125;
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public boolean m449() {
        return this.f126;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public C0046 m450(Object obj) {
        m534().m558(m533(), null, obj);
        return this;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public void m452(boolean z) {
        this.f126 = z;
    }

    @Override // lu.die.foza.SleepyFox.C0052
    public String toString() {
        if (m532() == null) {
            return m534().m617();
        }
        Class<?> cls = m532().getClass();
        Class<? super Object> cls2 = cls;
        m444(cls);
        while (cls2.getSuperclass() != null && cls2 != m446()) {
            Class<? super Object> superclass = cls2.getSuperclass();
            cls2 = superclass;
            m444((Class<?>) superclass);
        }
        return super.toString();
    }

    public C0046(Object obj, AbstractC0053 abstractC0053) {
        super(obj, abstractC0053);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m444(Class<?> cls) {
        if (cls.isArray()) {
            m450(m532());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (m443(field)) {
                try {
                    m522(name, m447(field));
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m451(boolean z) {
        this.f125 = z;
    }

    public C0046(Object obj, AbstractC0053 abstractC0053, StringBuffer stringBuffer) {
        super(obj, abstractC0053, stringBuffer);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public C0046 m453(String... strArr) {
        if (strArr == null) {
            this.f127 = null;
        } else {
            String[] m441 = m441((Object[]) strArr);
            this.f127 = m441;
            Arrays.sort(m441);
        }
        return this;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m454(Class<?> cls) {
        Object m532;
        if (cls == null || (m532 = m532()) == null || cls.isInstance(m532)) {
            this.f128 = cls;
            return;
        }
        throw new IllegalArgumentException("Specified class is not a superclass of the object");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String[] m440(Collection<String> collection) {
        return collection == null ? C0166.f234 : m441(collection.toArray());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String[] m441(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(C0166.f234);
    }

    public <T> C0046(T t, AbstractC0053 abstractC0053, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(t, abstractC0053, stringBuffer);
        m454((Class<?>) cls);
        m452(z);
        m451(z2);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m435(Object obj, AbstractC0053 abstractC0053) {
        return m438(obj, abstractC0053, false, false, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m437(Object obj, AbstractC0053 abstractC0053, boolean z, boolean z2) {
        return m438(obj, abstractC0053, z, z2, null);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static String m436(Object obj, AbstractC0053 abstractC0053, boolean z) {
        return m438(obj, abstractC0053, z, false, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static <T> String m438(T t, AbstractC0053 abstractC0053, boolean z, boolean z2, Class<? super T> cls) {
        return new C0046(t, abstractC0053, null, cls, z, z2).toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m439(Object obj, Collection<String> collection) {
        return m442(obj, m440(collection));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static String m442(Object obj, String... strArr) {
        return new C0046(obj).m453(strArr).toString();
    }
}
