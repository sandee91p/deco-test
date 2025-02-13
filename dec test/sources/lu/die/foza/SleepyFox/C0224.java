package lu.die.foza.SleepyFox;

import android.os.IInterface;
/* renamed from: lu.die.foza.SleepyFox.ߵ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ߵ.class */
public final class C0224 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԩ */
    public boolean mo645() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = C0063.f163;
            Object systemService = C0276.m1701().getSystemService("phone");
            if (systemService == null) {
                return;
            }
            IInterface m463 = C0175.f263 ? C0047.f129.m463(systemService, "getTelephonyRegistry") : C0047.f129.m465(systemService, "sRegistry");
            C0033 m646 = m463 != null ? m646("telephony.registry", m463) : null;
            if ((m646 != null ? m646.f100 : null) != null) {
                try {
                    C0047.f129.m464(systemService, "sRegistry", m646.f100);
                } catch (Exception unused) {
                }
            }
            C0047 c0047 = C0047.f129;
            Object m4632 = c0047.m463(systemService, "getSubscriberInfo");
            C0033 m6462 = m4632 != null ? m646("iphonesubinfo", (IInterface) m4632) : null;
            if ((m6462 != null ? m6462.f100 : null) == null || !C0175.f267) {
                return;
            }
            c0047.m464(systemService, "sIPhoneSubInfo", m6462.f100);
        } catch (Exception unused2) {
        }
    }
}
