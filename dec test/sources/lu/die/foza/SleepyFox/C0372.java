package lu.die.foza.SleepyFox;

import android.util.Singleton;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ຏ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຏ.class */
public final class C0372 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            Object m455 = C0047.m455("com.hihonor.android.content.pm.HwPackageManager", "PACKAGE_MANAGER_SINGLETON");
            Intrinsics.checkNotNull(m455);
            Singleton singleton = (Singleton) m455;
            Object obj = singleton.get();
            if (obj == null) {
                return;
            }
            C0342 c0342 = C0342.f813;
            C0301.f718.getClass();
            C0030.f93.m367(singleton, c0342.m2096(obj, C0301.f719));
        } catch (Exception unused) {
        }
    }
}
