package lu.die.foza.SleepyFox;

import android.os.WorkSource;
/* renamed from: lu.die.foza.SleepyFox.֏  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/֏.class */
public final class C0129 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.֏$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/֏$Ϳ.class */
    public static final class C0130 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            int m722 = C0153.f201.m722(c0253.f519, WorkSource.class);
            if (m722 >= 0) {
                c0253.f519[m722] = null;
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("alarm");
            if (m643 == null) {
                return;
            }
            m643.m374("set", new C0130());
        } catch (Exception unused) {
        }
    }
}
