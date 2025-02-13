package lu.die.foza.SleepyFox;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* renamed from: lu.die.foza.SleepyFox.ބ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ.class */
public final class C0154<K, V> implements Map<K, V> {

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final int f202 = 4;

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int[] f203;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public Object[] f204;

    /* renamed from: ԩ  reason: contains not printable characters */
    public int f205;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public AbstractC0158<K, V> f206;

    /* renamed from: lu.die.foza.SleepyFox.ބ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ϳ.class */
    public class C0155 extends AbstractC0158<K, V> {
        public C0155() {
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: ԩ  reason: contains not printable characters */
        public int mo750() {
            return C0154.this.f205;
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Map<K, V> mo754() {
            return C0154.this;
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ  reason: contains not printable characters */
        public void mo758() {
            C0154.this.clear();
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ  reason: contains not printable characters */
        public Object mo751(int i, int i2) {
            return C0154.this.f204[(i << 1) + i2];
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ԩ  reason: contains not printable characters */
        public int mo753(Object obj) {
            return C0154.this.m739(obj);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ  reason: contains not printable characters */
        public int mo752(Object obj) {
            return C0154.this.m738(obj);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ  reason: contains not printable characters */
        public void mo755(K k, V v) {
            C0154.this.put(k, v);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ  reason: contains not printable characters */
        public void mo757(int i) {
            C0154.this.m746(i);
        }

        @Override // lu.die.foza.SleepyFox.C0154.AbstractC0158
        /* renamed from: Ϳ  reason: contains not printable characters */
        public V mo756(int i, V v) {
            return (V) C0154.this.m742(i, (int) v);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ބ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԩ.class */
    public static class C0156 {
        /* renamed from: Ϳ  reason: contains not printable characters */
        public static int m759(int[] iArr, int i, int i2) {
            int i3 = 0;
            int i4 = i - 1;
            while (i3 <= i4) {
                int i5 = (i3 + i4) >>> 1;
                int i6 = iArr[i5];
                if (i6 < i2) {
                    i3 = i5 + 1;
                } else if (i6 <= i2) {
                    return i5;
                } else {
                    i4 = i5 - 1;
                }
            }
            return i3 ^ (-1);
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static int m760(long[] jArr, int i, long j) {
            int i2 = 0;
            int i3 = i - 1;
            while (i2 <= i3) {
                int i4 = (i2 + i3) >>> 1;
                long j2 = jArr[i4];
                if (j2 < j) {
                    i2 = i4 + 1;
                } else if (j2 <= j) {
                    return i4;
                } else {
                    i3 = i4 - 1;
                }
            }
            return i2 ^ (-1);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ބ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԫ.class */
    public static final class C0157 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final int[] f208 = new int[0];

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static final Class<?>[] f209 = new Class[0];

        /* renamed from: ԩ  reason: contains not printable characters */
        public static final Object[] f210 = new Object[0];

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static final String[] f211 = new String[0];
    }

    /* renamed from: lu.die.foza.SleepyFox.ބ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԭ.class */
    public static abstract class AbstractC0158<K, V> {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public AbstractC0158<K, V>.C0160 f212;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public AbstractC0158<K, V>.C0161 f213;

        /* renamed from: ԩ  reason: contains not printable characters */
        public AbstractC0158<K, V>.C0163 f214;

        /* renamed from: lu.die.foza.SleepyFox.ބ$Ԭ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԭ$Ϳ.class */
        public final class C0159<T> implements Iterator<T> {

            /* renamed from: Ϳ  reason: contains not printable characters */
            public final int f215;

            /* renamed from: Ԩ  reason: contains not printable characters */
            public int f216;

            /* renamed from: ԩ  reason: contains not printable characters */
            public int f217;

            /* renamed from: Ԫ  reason: contains not printable characters */
            public boolean f218 = false;

            public C0159(int i) {
                this.f215 = i;
                this.f216 = AbstractC0158.this.mo750();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f217 < this.f216;
            }

            @Override // java.util.Iterator
            public T next() {
                if (hasNext()) {
                    T t = (T) AbstractC0158.this.mo751(this.f217, this.f215);
                    this.f217++;
                    this.f218 = true;
                    return t;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f218) {
                    int i = this.f217 - 1;
                    this.f217 = i;
                    this.f216--;
                    this.f218 = false;
                    AbstractC0158.this.mo757(i);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.ބ$Ԭ$Ԩ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԭ$Ԩ.class */
        public final class C0160 implements Set<Map.Entry<K, V>> {
            public C0160() {
            }

            /* renamed from: Ϳ  reason: contains not printable characters */
            public boolean m771(Map.Entry<K, V> entry) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                int mo750 = AbstractC0158.this.mo750();
                for (Map.Entry<K, V> entry : collection) {
                    AbstractC0158.this.mo755((AbstractC0158) entry.getKey(), (K) entry.getValue());
                }
                return mo750 != AbstractC0158.this.mo750();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                AbstractC0158.this.mo758();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int mo752 = AbstractC0158.this.mo752(entry.getKey());
                if (mo752 >= 0) {
                    return Objects.equals(AbstractC0158.this.mo751(mo752, 1), entry.getValue());
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return AbstractC0158.this.mo750() == 0;
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0162();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return AbstractC0158.this.mo750();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return AbstractC0158.m765((Set) this, obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                int i = 0;
                for (int mo750 = AbstractC0158.this.mo750() - 1; mo750 >= 0; mo750--) {
                    Object mo751 = AbstractC0158.this.mo751(mo750, 0);
                    Object mo7512 = AbstractC0158.this.mo751(mo750, 1);
                    i += (mo751 == null ? 0 : mo751.hashCode()) ^ (mo7512 == null ? 0 : mo7512.hashCode());
                }
                return i;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.ބ$Ԭ$Ԫ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԭ$Ԫ.class */
        public final class C0161 implements Set<K> {
            public C0161() {
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K k) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends K> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                AbstractC0158.this.mo758();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return AbstractC0158.this.mo752(obj) >= 0;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return AbstractC0158.m762((Map) AbstractC0158.this.mo754(), collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return AbstractC0158.this.mo750() == 0;
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<K> iterator() {
                return new C0159(0);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                int mo752 = AbstractC0158.this.mo752(obj);
                if (mo752 >= 0) {
                    AbstractC0158.this.mo757(mo752);
                    return true;
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return AbstractC0158.m763(AbstractC0158.this.mo754(), collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return AbstractC0158.m764(AbstractC0158.this.mo754(), collection);
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return AbstractC0158.this.mo750();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return AbstractC0158.this.m766(0);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return AbstractC0158.m765((Set) this, obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                int i = 0;
                for (int mo750 = AbstractC0158.this.mo750() - 1; mo750 >= 0; mo750--) {
                    Object mo751 = AbstractC0158.this.mo751(mo750, 0);
                    i += mo751 == null ? 0 : mo751.hashCode();
                }
                return i;
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) AbstractC0158.this.m767(tArr, 0);
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.ބ$Ԭ$Ԭ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԭ$Ԭ.class */
        public final class C0162 implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

            /* renamed from: Ϳ  reason: contains not printable characters */
            public int f222;

            /* renamed from: Ԩ  reason: contains not printable characters */
            public int f223 = -1;

            public C0162() {
                this.f222 = AbstractC0158.this.mo750() - 1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f223 < this.f222;
            }

            @Override // java.util.Iterator
            /* renamed from: Ϳ  reason: contains not printable characters */
            public Map.Entry<K, V> next() {
                if (hasNext()) {
                    this.f223++;
                    return this;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                AbstractC0158.this.mo757(this.f223);
                this.f223--;
                this.f222--;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return (K) AbstractC0158.this.mo751(this.f223, 0);
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) AbstractC0158.this.mo751(this.f223, 1);
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
                return (V) AbstractC0158.this.mo756(this.f223, (int) v);
            }

            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Objects.equals(entry.getKey(), AbstractC0158.this.mo751(this.f223, 0)) && Objects.equals(entry.getValue(), AbstractC0158.this.mo751(this.f223, 1));
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                Object mo751 = AbstractC0158.this.mo751(this.f223, 0);
                Object mo7512 = AbstractC0158.this.mo751(this.f223, 1);
                return (mo751 == null ? 0 : mo751.hashCode()) ^ (mo7512 == null ? 0 : mo7512.hashCode());
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.ބ$Ԭ$Ԯ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ބ$Ԭ$Ԯ.class */
        public final class C0163 implements Collection<V> {
            public C0163() {
            }

            @Override // java.util.Collection
            public boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends V> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                AbstractC0158.this.mo758();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return AbstractC0158.this.mo753(obj) >= 0;
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return AbstractC0158.this.mo750() == 0;
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<V> iterator() {
                return new C0159(1);
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                int mo753 = AbstractC0158.this.mo753(obj);
                if (mo753 >= 0) {
                    AbstractC0158.this.mo757(mo753);
                    return true;
                }
                return false;
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                int mo750 = AbstractC0158.this.mo750();
                boolean z = false;
                int i = 0;
                while (i < mo750) {
                    if (collection.contains(AbstractC0158.this.mo751(i, 1))) {
                        AbstractC0158.this.mo757(i);
                        i--;
                        mo750--;
                        z = true;
                    }
                    i++;
                }
                return z;
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                int mo750 = AbstractC0158.this.mo750();
                boolean z = false;
                int i = 0;
                while (i < mo750) {
                    if (!collection.contains(AbstractC0158.this.mo751(i, 1))) {
                        AbstractC0158.this.mo757(i);
                        i--;
                        mo750--;
                        z = true;
                    }
                    i++;
                }
                return z;
            }

            @Override // java.util.Collection
            public int size() {
                return AbstractC0158.this.mo750();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return AbstractC0158.this.m766(1);
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) AbstractC0158.this.m767(tArr, 1);
            }
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static <K, V> boolean m762(Map<K, V> map, Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!map.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <K, V> boolean m763(Map<K, V> map, Collection<?> collection) {
            int size = map.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                map.remove(it.next());
            }
            return size != map.size();
        }

        /* renamed from: ԩ  reason: contains not printable characters */
        public static <K, V> boolean m764(Map<K, V> map, Collection<?> collection) {
            int size = map.size();
            Iterator<K> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                }
            }
            return size != map.size();
        }

        /* renamed from: Ԫ  reason: contains not printable characters */
        public Set<Map.Entry<K, V>> m768() {
            if (this.f212 == null) {
                this.f212 = new C0160();
            }
            return this.f212;
        }

        /* renamed from: ԫ  reason: contains not printable characters */
        public Set<K> m769() {
            if (this.f213 == null) {
                this.f213 = new C0161();
            }
            return this.f213;
        }

        /* renamed from: Ԭ  reason: contains not printable characters */
        public Collection<V> m770() {
            if (this.f214 == null) {
                this.f214 = new C0163();
            }
            return this.f214;
        }

        /* renamed from: ԩ */
        public abstract int mo750();

        /* renamed from: Ϳ */
        public abstract Object mo751(int i, int i2);

        /* renamed from: Ϳ */
        public abstract int mo752(Object obj);

        /* renamed from: Ԩ */
        public abstract int mo753(Object obj);

        /* renamed from: Ԩ */
        public abstract Map<K, V> mo754();

        /* renamed from: Ϳ */
        public abstract void mo755(K k, V v);

        /* renamed from: Ϳ */
        public abstract V mo756(int i, V v);

        /* renamed from: Ϳ */
        public abstract void mo757(int i);

        /* renamed from: Ϳ */
        public abstract void mo758();

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static <T> boolean m765(Set<T> set, Object obj) {
            if (set == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public Object[] m766(int i) {
            int mo750 = mo750();
            Object[] objArr = new Object[mo750];
            for (int i2 = 0; i2 < mo750; i2++) {
                objArr[i2] = mo751(i2, i);
            }
            return objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object[]] */
        /* renamed from: Ϳ  reason: contains not printable characters */
        public <T> T[] m767(T[] tArr, int i) {
            int mo750 = mo750();
            if (tArr.length < mo750) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo750);
            }
            for (int i2 = 0; i2 < mo750; i2++) {
                tArr[i2] = mo751(i2, i);
            }
            if (tArr.length > mo750) {
                tArr[mo750] = null;
            }
            return tArr;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m732(int i) {
        this.f203 = new int[i];
        this.f204 = new Object[i << 1];
    }

    public C0154() {
        this(0, false);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public int m735() {
        int i = this.f205;
        if (i == 0) {
            return -1;
        }
        int m759 = C0156.m759(this.f203, i, 0);
        if (m759 >= 0 && this.f204[m759 << 1] != null) {
            int i2 = m759 + 1;
            while (i2 < i && this.f203[i2] == 0) {
                if (this.f204[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m759 - 1; i3 >= 0 && this.f203[i3] == 0; i3--) {
                if (this.f204[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m759;
    }

    @Override // java.util.Map
    public void clear() {
        if (this.f205 > 0) {
            this.f203 = C0157.f208;
            this.f204 = C0157.f210;
            this.f205 = 0;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m737(int i) {
        int i2 = this.f205;
        int[] iArr = this.f203;
        if (iArr.length < i) {
            Object[] objArr = this.f204;
            m732(i);
            if (this.f205 <= 0) {
                return;
            }
            System.arraycopy(iArr, 0, this.f203, 0, i2);
            System.arraycopy(objArr, 0, this.f204, 0, i2 << 1);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m738(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m739(obj) >= 0;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int m738 = m738(obj);
        if (m738 >= 0) {
            return (V) this.f204[(m738 << 1) + 1];
        }
        return null;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public V m741(int i) {
        return (V) this.f204[(i << 1) + 1];
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f205 <= 0;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        int hashCode;
        int m734;
        int i = this.f205;
        if (k == null) {
            hashCode = 0;
            m734 = m735();
        } else {
            hashCode = k.hashCode();
            m734 = m734(k, hashCode);
        }
        if (m734 >= 0) {
            int i2 = (m734 << 1) + 1;
            Object[] objArr = this.f204;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = m734 ^ (-1);
        int[] iArr = this.f203;
        if (i >= iArr.length) {
            int i4 = i >= 8 ? i + (i >> 1) : i >= 4 ? 8 : 4;
            Object[] objArr2 = this.f204;
            m732(i4);
            int[] iArr2 = this.f203;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f204, 0, objArr2.length);
            }
        }
        if (i3 < i) {
            int[] iArr3 = this.f203;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.f204;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.f205 - i3) << 1);
        }
        this.f203[i3] = hashCode;
        Object[] objArr4 = this.f204;
        int i6 = i3 << 1;
        objArr4[i6] = k;
        objArr4[i6 + 1] = v;
        this.f205++;
        return null;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int m738 = m738(obj);
        if (m738 >= 0) {
            return m746(m738);
        }
        return null;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public V m746(int i) {
        int i2;
        Object[] objArr = this.f204;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f205;
        if (i4 <= 1) {
            this.f203 = C0157.f208;
            this.f204 = C0157.f210;
            i2 = 0;
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f203;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f204;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i3, i7 << 1);
                }
                Object[] objArr3 = this.f204;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m732(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f203, 0, i);
                    System.arraycopy(objArr, 0, this.f204, 0, i3);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f203, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f204, i3, i10 << 1);
                }
            }
            i2 = i5;
        }
        this.f205 = i2;
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.f205;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f205 != map.size()) {
            return false;
        }
        for (int i = 0; i < this.f205; i++) {
            try {
                K m740 = m740(i);
                V m741 = m741(i);
                Object obj2 = map.get(m740);
                if (m741 == null) {
                    if (obj2 != null || !map.containsKey(m740)) {
                        return false;
                    }
                } else if (!m741.equals(obj2)) {
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

    @Override // java.util.Map
    public int hashCode() {
        int[] iArr = this.f203;
        Object[] objArr = this.f204;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        int i4 = this.f205;
        while (i2 < i4) {
            Object obj = objArr[i3];
            i += iArr[i2] ^ (obj == null ? 0 : obj.hashCode());
            i2++;
            i3 += 2;
        }
        return i;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m737(map.size() + this.f205);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m733().m768();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m733().m769();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m733().m770();
    }

    public C0154(int i) {
        this(i, false);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final AbstractC0158<K, V> m733() {
        if (this.f206 == null) {
            this.f206 = new C0155();
        }
        return this.f206;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m743(K k, V v) {
        int i = this.f205;
        int hashCode = k == null ? 0 : k.hashCode();
        if (i > 0 && this.f203[i - 1] > hashCode) {
            put(k, v);
            return;
        }
        this.f205 = i + 1;
        this.f203[i] = hashCode;
        int i2 = i << 1;
        Object[] objArr = this.f204;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public void m744() {
        int i = this.f205;
        if (i <= 1) {
            return;
        }
        int i2 = this.f203[0];
        int i3 = 0;
        for (int i4 = 1; i4 < i; i4++) {
            int i5 = this.f203[i4];
            if (i5 != i2) {
                i3 = i4;
                i2 = i5;
            } else {
                Object obj = this.f204[i4 << 1];
                for (int i6 = i4 - 1; i6 >= i3; i6--) {
                    Object obj2 = this.f204[i6 << 1];
                }
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static int m731(int[] iArr, int i, int i2) {
        return C0156.m759(iArr, i, i2);
    }

    public C0154(int i, boolean z) {
        if (i <= 0) {
            this.f203 = C0157.f208;
            this.f204 = C0157.f210;
        } else {
            m732(i);
        }
        this.f205 = 0;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public int m739(Object obj) {
        int i = this.f205 * 2;
        Object[] objArr = this.f204;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public K m740(int i) {
        return (K) this.f204[i << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0154(C0154<K, V> c0154) {
        this();
        if (c0154 != 0) {
            m745((C0154) c0154);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean m747(Collection<?> collection) {
        return AbstractC0158.m762((Map) this, collection);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean m748(Collection<?> collection) {
        return AbstractC0158.m763(this, collection);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public boolean m749(Collection<?> collection) {
        return AbstractC0158.m764(this, collection);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m736() {
        int i = this.f205;
        if (i > 0) {
            int i2 = i << 1;
            Object[] objArr = this.f204;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            this.f205 = 0;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int m734(Object obj, int i) {
        int i2 = this.f205;
        if (i2 == 0) {
            return -1;
        }
        int m759 = C0156.m759(this.f203, i2, i);
        if (m759 >= 0 && !obj.equals(this.f204[m759 << 1])) {
            int i3 = m759 + 1;
            while (i3 < i2 && this.f203[i3] == i) {
                if (obj.equals(this.f204[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m759 - 1; i4 >= 0 && this.f203[i4] == i; i4--) {
                if (obj.equals(this.f204[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m759;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int m738(Object obj) {
        return obj == null ? m735() : m734(obj, obj.hashCode());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m745(C0154<? extends K, ? extends V> c0154) {
        int i = c0154.f205;
        m737(this.f205 + i);
        if (this.f205 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0154.m740(i2), c0154.m741(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c0154.f203, 0, this.f203, 0, i);
            System.arraycopy(c0154.f204, 0, this.f204, 0, i << 1);
            this.f205 = i;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public V m742(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f204;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }
}
