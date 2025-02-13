package lu.die.foza.SleepyFox;

import android.os.IInterface;
import android.view.inputmethod.EditorInfo;
/* renamed from: lu.die.foza.SleepyFox.ྉ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ྉ.class */
public final class C0415 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ྉ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ྉ$Ϳ.class */
    public static final class C0416 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            EditorInfo editorInfo = (EditorInfo) C0153.f201.m726(c0253.f519, EditorInfo.class);
            if (editorInfo != null) {
                editorInfo.packageName = m1135();
            }
            return c0253.m1485();
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = new C0416();
            if (C0175.f274) {
                C0047 c0047 = C0047.f129;
                if (c0047.m470("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "getService") != null) {
                    C0033 m643 = m643("input_method");
                    Object obj = m643 != null ? m643.f100 : null;
                    if (obj != null) {
                        c0047.m469("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "sServiceCache", obj);
                        return;
                    }
                }
            }
            Object systemService = C0276.m1701().getSystemService("input_method");
            if (systemService == null) {
                return;
            }
            C0047 c00472 = C0047.f129;
            Object m465 = c00472.m465(systemService, "mService");
            if (m465 == null) {
                return;
            }
            C0033 m646 = m646("input_method", (IInterface) m465);
            if ((m646 != null ? m646.f100 : null) == null) {
                return;
            }
            c00472.m464(systemService, "mService", m646.f100);
        } catch (Exception unused) {
        }
    }
}
