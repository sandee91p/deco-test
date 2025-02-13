package lu.die.foza.SleepyFox;

import android.media.AudioManager;
import android.os.IInterface;
/* renamed from: lu.die.foza.SleepyFox.ވ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ވ.class */
public final class C0168 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0047 c0047 = C0047.f129;
            Object m470 = c0047.m470(AudioManager.class.getName(), "getService");
            if (m470 == null) {
                return;
            }
            C0033 m646 = m646("audio", (IInterface) m470);
            if ((m646 != null ? m646.f100 : null) == null) {
                return;
            }
            c0047.m469(AudioManager.class.getName(), "sService", m646.f100);
        } catch (Exception unused) {
        }
    }
}
