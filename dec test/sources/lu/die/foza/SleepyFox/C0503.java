package lu.die.foza.SleepyFox;

import android.os.WorkSource;
/* renamed from: lu.die.foza.SleepyFox.ჾ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჾ.class */
public final class C0503 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ჾ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჾ$Ϳ.class */
    public static final class C0504 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, WorkSource.class);
                if (m722 >= 0) {
                    objArr[m722] = null;
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = new C0504();
            m643("power");
        } catch (Exception unused) {
        }
    }
}
