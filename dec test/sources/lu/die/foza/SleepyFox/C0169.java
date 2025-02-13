package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.ComponentName;
/* renamed from: lu.die.foza.SleepyFox.މ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/މ.class */
public final class C0169 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.މ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/މ$Ϳ.class */
    public static final class C0170 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object obj;
            Object[] objArr = c0253.f519;
            int m724 = C0153.f201.m724(objArr, ComponentName.class);
            if (m724 != -1 && (obj = objArr[m724]) != null) {
                objArr[m724] = new ComponentName(m1135(), ((ComponentName) obj).getClassName());
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    @SuppressLint({"WrongConstant"})
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("autofill");
            if (m643 == null) {
                return;
            }
            C0170 c0170 = new C0170();
            m643.m374("startSession", c0170);
            m643.m374("updateOrRestartSession", c0170);
        } catch (Exception unused) {
        }
    }
}
