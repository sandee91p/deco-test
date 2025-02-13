package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import lu.die.foza.SleepyFox.C0202;
/* renamed from: lu.die.foza.SleepyFox.ޞ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޞ.class */
public final class C0206 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("device_policy");
            if (m643 == null) {
                return;
            }
            C0202.C0203 c0203 = C0202.f299;
            C0276.f576.getClass();
            ComponentName componentName = new ComponentName(C0276.f583, "main");
            c0203.getClass();
            m643.m374("getDeviceOwnerComponent", new C0167(componentName));
            c0203.getClass();
            m643.m374("getDeviceOwnerName", C0202.f301);
        } catch (Exception unused) {
        }
    }
}
