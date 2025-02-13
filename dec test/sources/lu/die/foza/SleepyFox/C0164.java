package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import lu.die.foza.SleepyFox.C0154;
/* renamed from: lu.die.foza.SleepyFox.ޅ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޅ.class */
public final class C0164<E> implements Collection<E>, Set<E> {

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final int f226 = 4;

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int[] f227;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public Object[] f228;

    /* renamed from: ԩ  reason: contains not printable characters */
    public int f229;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public C0154.AbstractC0158<E, E> f230;

    /* renamed from: lu.die.foza.SleepyFox.ޅ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޅ$Ϳ.class */
    public class C0165 extends C0154.AbstractC0158<E, E> {
        public C0165() {
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: ԩ */
        public int mo750() {
            return C0164.this.f229;
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ԩ */
        public Map<E, E> mo754() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ */
        public void mo758() {
            C0164.this.clear();
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ */
        public Object mo751(int i, int i2) {
            return C0164.this.f228[i];
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ԩ */
        public int mo753(Object obj) {
            return C0164.this.indexOf(obj);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ */
        public int mo752(Object obj) {
            return C0164.this.indexOf(obj);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ */
        public void mo755(E e, E e2) {
            C0164.this.add(e);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ */
        public void mo757(int i) {
            C0164.this.m785(i);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ */
        public E mo756(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final int m775() {
        int i = this.f229;
        if (i == 0) {
            return -1;
        }
        int m759 = C0154.C0156.m759(this.f227, i, 0);
        if (m759 >= 0 && this.f228[m759] != null) {
            int i2 = m759 + 1;
            while (i2 < i && this.f227[i2] == 0) {
                if (this.f228[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m759 - 1; i3 >= 0 && this.f227[i3] == 0; i3--) {
                if (this.f228[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m759;
    }

    public C0164() {
        this(0, false);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m777() {
        int[] iArr = this.f227;
        return iArr.length > 8 && this.f229 < iArr.length / 3;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        this.f229 = 0;
        this.f227 = C0154.C0157.f208;
        this.f228 = C0154.C0157.f210;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m780(int i) {
        int[] iArr = this.f227;
        if (iArr.length < i) {
            Object[] objArr = this.f228;
            m776(i);
            int i2 = this.f229;
            if (i2 <= 0) {
                return;
            }
            System.arraycopy(iArr, 0, this.f227, 0, i2);
            System.arraycopy(objArr, 0, this.f228, 0, this.f229);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int indexOf(Object obj) {
        return obj == null ? m775() : m774(obj, obj.hashCode());
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public E m782(int i) {
        return (E) this.f228[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f229 <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int hashCode;
        int m774;
        int i = this.f229;
        if (e == null) {
            hashCode = 0;
            m774 = m775();
        } else {
            hashCode = e.hashCode();
            m774 = m774(e, hashCode);
        }
        if (m774 >= 0) {
            return false;
        }
        int i2 = m774 ^ (-1);
        int[] iArr = this.f227;
        if (i >= iArr.length) {
            int i3 = i >= 8 ? i + (i >> 1) : i >= 4 ? 8 : 4;
            Object[] objArr = this.f228;
            m776(i3);
            int[] iArr2 = this.f227;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f228, 0, objArr.length);
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.f227;
            int i4 = i2 + 1;
            int i5 = i - i2;
            System.arraycopy(iArr3, i2, iArr3, i4, i5);
            Object[] objArr2 = this.f228;
            System.arraycopy(objArr2, i2, objArr2, i4, i5);
        }
        this.f227[i2] = hashCode;
        this.f228[i2] = e;
        this.f229++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m784(C0164<? extends E> c0164) {
        int i = c0164.f229;
        m780(this.f229 + i);
        if (this.f229 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(c0164.f228[i2]);
            }
        } else if (i > 0) {
            System.arraycopy(c0164.f227, 0, this.f227, 0, i);
            System.arraycopy(c0164.f228, 0, this.f228, 0, i);
            this.f229 = i;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m785(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    @SuppressLint({"NewApi"})
    public boolean removeIf(Predicate<? super E> predicate) {
        int i;
        if (this.f229 == 0) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            i = this.f229;
            if (i5 >= i) {
                break;
            }
            if (predicate.test(this.f228[i4])) {
                i3++;
            } else {
                if (i2 != i4) {
                    Object[] objArr = this.f228;
                    objArr[i2] = objArr[i4];
                    int[] iArr = this.f227;
                    iArr[i2] = iArr[i4];
                }
                i2++;
            }
            i4++;
        }
        if (i3 == 0) {
            return false;
        }
        if (i3 == i) {
            clear();
            return true;
        }
        this.f229 = i - i3;
        if (m777()) {
            int m778 = m778();
            int[] iArr2 = this.f227;
            Object[] objArr2 = this.f228;
            m776(m778);
            System.arraycopy(iArr2, 0, this.f227, 0, this.f229);
            System.arraycopy(objArr2, 0, this.f228, 0, this.f229);
            return true;
        }
        int i6 = this.f229;
        while (true) {
            int i7 = i6;
            Object[] objArr3 = this.f228;
            if (i7 >= objArr3.length) {
                return true;
            }
            objArr3[i6] = null;
            i6++;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f229;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f229;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f228, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f229 != set.size()) {
            return false;
        }
        for (int i = 0; i < this.f229; i++) {
            try {
                if (!set.contains(this.f228[i])) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f227;
        int i = 0;
        int i2 = this.f229;
        for (int i3 = 0; i3 < i2; i3++) {
            i += iArr[i3];
        }
        return i;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m779().m769().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m780(collection.size() + this.f229);
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f229 - 1; i >= 0; i--) {
            if (!collection.contains(this.f228[i])) {
                m785(i);
                z = true;
            }
        }
        return z;
    }

    public C0164(int i) {
        this(i, false);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m778() {
        int i = this.f229;
        if (i > 8) {
            return i + (i >> 1);
        }
        return 8;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public E m781(int i) {
        return (E) this.f228[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object[]] */
    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f229) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f229);
        }
        System.arraycopy(this.f228, 0, tArr, 0, this.f229);
        int length = tArr.length;
        int i = this.f229;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m776(int i) {
        this.f227 = new int[i];
        this.f228 = new Object[i];
    }

    public C0164(int i, boolean z) {
        if (i == 0) {
            this.f227 = C0154.C0157.f208;
            this.f228 = C0154.C0157.f210;
        } else {
            m776(i);
        }
        this.f229 = 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public E m785(int i) {
        int i2 = this.f229;
        E e = (E) this.f228[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            if (m777()) {
                int m778 = m778();
                int[] iArr = this.f227;
                Object[] objArr = this.f228;
                m776(m778);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f227, 0, i);
                    System.arraycopy(objArr, 0, this.f228, 0, i);
                }
                if (i < i3) {
                    int i4 = i + 1;
                    int i5 = i3 - i;
                    System.arraycopy(iArr, i4, this.f227, i, i5);
                    System.arraycopy(objArr, i4, this.f228, i, i5);
                }
            } else {
                if (i < i3) {
                    int[] iArr2 = this.f227;
                    int i6 = i + 1;
                    int i7 = i3 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f228;
                    System.arraycopy(objArr2, i6, objArr2, i, i7);
                }
                this.f228[i3] = null;
            }
            this.f229 = i3;
        }
        return e;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean m786(C0164<? extends E> c0164) {
        int i = c0164.f229;
        int i2 = this.f229;
        for (int i3 = 0; i3 < i; i3++) {
            remove(c0164.f228[i3]);
        }
        return i2 != this.f229;
    }

    public C0164(Collection<? extends E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m783(E e) {
        int i = this.f229;
        int hashCode = e == null ? 0 : e.hashCode();
        if (i > 0 && this.f227[i - 1] > hashCode) {
            add(e);
            return;
        }
        this.f229 = i + 1;
        this.f227[i] = hashCode;
        this.f228[i] = e;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m773(int[] iArr, int i) {
        return C0154.C0156.m759(iArr, this.f229, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0164(C0164<E> c0164) {
        this();
        if (c0164 != 0) {
            m784((C0164) c0164);
        }
    }

    public C0164(E[] eArr) {
        this();
        if (eArr != null) {
            for (E e : eArr) {
                add(e);
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0154.AbstractC0158<E, E> m779() {
        if (this.f230 == null) {
            this.f230 = new C0165();
        }
        return this.f230;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m774(Object obj, int i) {
        int i2 = this.f229;
        if (i2 == 0) {
            return -1;
        }
        int m759 = C0154.C0156.m759(this.f227, i2, i);
        if (m759 >= 0 && !obj.equals(this.f228[m759])) {
            int i3 = m759 + 1;
            while (i3 < i2 && this.f227[i3] == i) {
                if (obj.equals(this.f228[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m759 - 1; i4 >= 0 && this.f227[i4] == i; i4--) {
                if (obj.equals(this.f228[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m759;
    }
}
