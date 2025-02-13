package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.ʺ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʺ.class */
public final class C0026 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("uri_grants");
            if (m643 == null) {
                return;
            }
            Object m455 = C0047.m455("android.app.UriGrantsManager", "IUriGrantsManagerSingleton");
            if (m455 != null) {
                C0030.f93.m367(m455, m643.f100);
            }
            C0500.f1093.getClass();
            C0500.f1094.m2467(m643);
        } catch (Exception unused) {
        }
    }
}
