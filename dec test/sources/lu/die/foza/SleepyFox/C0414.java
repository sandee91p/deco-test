package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.ྈ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ྈ.class */
public final class C0414<L, R> extends AbstractC0493<L, R> {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final long f1014 = 4954918890077093841L;
    public final L left;
    public final R right;

    public static <L, R> C0414<L, R> of(L l, R r) {
        return new C0414<>(l, r);
    }

    public C0414(L l, R r) {
        this.left = l;
        this.right = r;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0493
    public L getLeft() {
        return this.left;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0493
    public R getRight() {
        return this.right;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r) {
        throw new UnsupportedOperationException();
    }
}
