package lu.die.foza.SleepyFox;

import android.app.WallpaperManager;
import android.os.IInterface;
/* renamed from: lu.die.foza.SleepyFox.ʵ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʵ.class */
public final class C0021 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            Object systemService = C0276.m1701().getSystemService("wallpaper");
            if (systemService == null) {
                return;
            }
            C0047 c0047 = C0047.f129;
            Object m463 = c0047.m463(systemService, "getIWallpaperManager");
            if (m463 == null) {
                return;
            }
            C0033 m646 = m646("wallpaper", (IInterface) m463);
            if ((m646 != null ? m646.f100 : null) == null) {
                return;
            }
            Object m466 = c0047.m466(WallpaperManager.class, "sGlobals");
            if (m466 == null) {
                return;
            }
            c0047.m464(m466, "mService", m646.f100);
        } catch (Exception unused) {
        }
    }
}
