package lu.die.foza.SleepyFox;

import android.app.usage.StorageStats;
import androidx.annotation.RequiresApi;
/* renamed from: lu.die.foza.SleepyFox.ˡ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˡ.class */
public final class C0050 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ˡ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˡ$Ϳ.class */
    public static final class C0051 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object mo85 = super.mo85(c0253);
                return mo85 != null ? mo85 : StorageStats.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    @RequiresApi(26)
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("storagestats");
            if ((m643 != null ? m643.f100 : null) == null) {
                return;
            }
            m643.m374("queryStatsForPackage", new C0051());
        } catch (Exception unused) {
        }
    }
}
