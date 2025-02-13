package lu.die.foza.SleepyFox;

import android.hardware.camera2.CameraManager;
import android.os.IInterface;
import lu.die.foza.SleepyFox.C0248;
/* renamed from: lu.die.foza.SleepyFox.ޏ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޏ.class */
public final class C0181 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ޏ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޏ$Ϳ.class */
    public static final class C0182 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                C0248.C0249 c0249 = C0248.f515;
                c0249.getClass();
                C0248.f516.getClass();
                c0249.getClass();
                C0248.f516.getClass();
                if (objArr[2] instanceof String) {
                    objArr[2] = m1135();
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            if (!C0175.f259) {
                return;
            }
            if (C0175.f273 && C0175.f269) {
                C0276.m1701().getSystemService("camera");
            }
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            Class<?> cls = Class.forName(CameraManager.class.getName().concat("$CameraManagerGlobal"));
            C0047 c0047 = C0047.f129;
            Object m471 = c0047.m471(cls, "get");
            if (m471 == null) {
                return;
            }
            Object m463 = c0047.m463(m471, "getCameraService");
            if (m463 == null) {
                return;
            }
            C0033 m646 = m646("media.camera", (IInterface) m463);
            if ((m646 != null ? m646.f100 : null) == null) {
                return;
            }
            c0047.m464(m471, "mCameraService", m646.f100);
            C0182 c0182 = new C0182();
            String[] strArr = new String[1];
            strArr[0] = "connectDevice";
            m646.m377(c0182, strArr);
        } catch (Exception unused) {
        }
    }
}
