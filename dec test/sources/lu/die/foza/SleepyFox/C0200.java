package lu.die.foza.SleepyFox;

import androidx.annotation.RequiresApi;
/* renamed from: lu.die.foza.SleepyFox.ޛ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޛ.class */
public final class C0200 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ޛ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޛ$Ϳ.class */
    public static final class C0201 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                C0277.f587.getClass();
                return C0277.f588.mo85(c0253);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    @RequiresApi(28)
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("crossprofileapps");
            if ((m643 != null ? m643.f100 : null) == null) {
                return;
            }
            m643.m374("startActivityAsUser", new C0201());
            if (!C0175.f270) {
                return;
            }
            C0131.f185.getClass();
            m643.m374("startActivityAsUserByIntent", C0131.f186);
        } catch (Exception unused) {
        }
    }
}
