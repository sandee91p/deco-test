package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.ຒ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຒ.class */
public final class C0381 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object f892;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int f893;

    public C0381(Object obj) {
        this.f893 = System.identityHashCode(obj);
        this.f892 = obj;
    }

    public int hashCode() {
        return this.f893;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0381)) {
            return false;
        }
        C0381 c0381 = (C0381) obj;
        return this.f893 == c0381.f893 && this.f892 == c0381.f892;
    }
}
