package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.ၸ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၸ.class */
public class C0463 extends Number implements Comparable<C0463>, AbstractC0462<Number> {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final long f1074 = 512176391864L;

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int f1075;

    public C0463() {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0462
    /* renamed from: getValue */
    public Number getValue2() {
        return Integer.valueOf(this.f1075);
    }

    public void setValue(int i) {
        this.f1075 = i;
    }

    public void increment() {
        this.f1075++;
    }

    public void decrement() {
        this.f1075--;
    }

    public void add(int i) {
        this.f1075 += i;
    }

    public void subtract(int i) {
        this.f1075 -= i;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f1075;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f1075;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f1075;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f1075;
    }

    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0463) && this.f1075 == ((C0463) obj).intValue();
    }

    public int hashCode() {
        return this.f1075;
    }

    public String toString() {
        return String.valueOf(this.f1075);
    }

    public C0463(int i) {
        this.f1075 = i;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0462
    public void setValue(Number number) {
        this.f1075 = number.intValue();
    }

    public void add(Number number) {
        this.f1075 = number.intValue() + this.f1075;
    }

    public void subtract(Number number) {
        this.f1075 -= number.intValue();
    }

    @Override // java.lang.Comparable
    public int compareTo(C0463 c0463) {
        int i = c0463.f1075;
        int i2 = this.f1075;
        if (i2 < i) {
            return -1;
        }
        return i2 == i ? 0 : 1;
    }

    public C0463(Number number) {
        this.f1075 = number.intValue();
    }

    public C0463(String str) throws NumberFormatException {
        this.f1075 = Integer.parseInt(str);
    }
}
