package lu.die.foza.SleepyFox;

import lu.die.foza.SleepyFox.C0154;
/* renamed from: lu.die.foza.SleepyFox.ʹ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʹ.class */
public class C0065 {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int[] f164;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public int f165;

    public C0065() {
        this(10);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m634(int i) {
        int m636 = m636(i);
        if (m636 < 0) {
            this.f164 = C0024.m303(this.f164, this.f165, m636 ^ (-1), i);
            this.f165++;
            return true;
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m635(int i) {
        return m636(i) >= 0;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m636(int i) {
        return C0154.C0156.m759(this.f164, this.f165, i);
    }

    public C0065(int i) {
        if (i == 0) {
            this.f164 = C0154.C0157.f208;
        } else {
            this.f164 = new int[i];
        }
        this.f165 = 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m637() {
        return this.f165 != 0;
    }
}
