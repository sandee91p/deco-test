package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.Ⴭ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ⴭ.class */
public final class C0497 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("permission_checker");
            if (m643 == null) {
                return;
            }
            C0202.f299.getClass();
            C0167 c0167 = new C0167(0);
            String[] strArr = new String[2];
            strArr[0] = "checkPermission";
            strArr[1] = "checkOp";
            m643.m377(c0167, strArr);
        } catch (Exception unused) {
        }
    }
}
