package lu.die.foza.SleepyFox;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
/* renamed from: lu.die.foza.SleepyFox.ႀ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ႀ.class */
public abstract class AbstractC0493<L, R> implements Map.Entry<L, R>, Comparable<AbstractC0493<L, R>>, Serializable {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final long f1087 = 4954918890077093841L;

    public static <L, R> AbstractC0493<L, R> of(L l, R r) {
        return new C0414(l, r);
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C0472.m2411(getKey(), entry.getKey()) && C0472.m2411(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0 : getValue().hashCode());
    }

    public String toString() {
        return "(" + getLeft() + ',' + getRight() + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC0493) ((AbstractC0493) obj));
    }

    public int compareTo(AbstractC0493<L, R> abstractC0493) {
        return new C0193().m1110(getLeft(), abstractC0493.getLeft(), (Comparator<?>) null).m1109(getRight(), abstractC0493.getRight()).m1129();
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
