package lu.die.foza.SleepyFox;

import android.os.IInterface;
import android.os.WorkSource;
/* renamed from: lu.die.foza.SleepyFox.ჼ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჼ.class */
public final class C0498 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ჼ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჼ$Ϳ.class */
    public static final class C0499 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                if (C0153.f201.m722(objArr, WorkSource.class) >= 0) {
                    objArr[0] = null;
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        C0277.f587.getClass();
        this.f168 = C0277.f588;
        try {
            Object systemService = C0276.m1701().getApplicationContext().getSystemService("wifi");
            IInterface iInterface = null;
            String str = "mService";
            try {
                iInterface = C0047.f129.m465(systemService, "mService");
            } catch (Exception unused) {
            }
            if (iInterface == null) {
                str = "sService";
                if (systemService != null) {
                    try {
                        C0047.f129.m465(systemService, "sService");
                    } catch (Exception unused2) {
                    }
                }
            }
            C0033 m646 = iInterface == null ? null : m646("wifi", iInterface);
            if (m646 == null) {
                return;
            }
            if (systemService != null) {
                C0047.f129.m464(systemService, str, m646.f100);
            }
            C0033 c0033 = m646;
            C0499 c0499 = new C0499();
            String[] strArr = new String[5];
            strArr[0] = "acquireWifiLock";
            strArr[1] = "updateWifiLockWorkSource";
            strArr[2] = "startLocationRestrictedScan";
            strArr[3] = "startScan";
            strArr[4] = "requestBatchedScan";
            c0033.m377(c0499, strArr);
        } catch (Exception unused3) {
        }
    }
}
