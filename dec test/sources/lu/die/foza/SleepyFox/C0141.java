package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.os.IInterface;
import android.view.WindowManager;
import lu.die.foza.SleepyFox.C0248;
import lu.die.foza.SleepyFox.C0301;
/* renamed from: lu.die.foza.SleepyFox.ۥ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ۥ.class */
public final class C0141 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ۥ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ۥ$Ϳ.class */
    public static final class C0142 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        @SuppressLint({"SwitchIntDef"})
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) C0153.f201.m726(c0253.f519, WindowManager.LayoutParams.class);
            if (layoutParams != null) {
                if (C0175.f262) {
                    switch (layoutParams.type) {
                        case 2002:
                        case 2003:
                        case 2006:
                        case 2007:
                        case 2010:
                            layoutParams.type = 2038;
                            C0248.C0249 c0249 = C0248.f515;
                            c0249.getClass();
                            C0248.f516.getClass();
                            c0249.getClass();
                            C0248 c0248 = C0248.f516;
                            layoutParams.toString();
                            c0248.getClass();
                            break;
                    }
                }
                layoutParams.packageName = m1135();
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԩ */
    public boolean mo645() {
        return true;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.C0302 c0302 = C0301.f718;
            c0302.getClass();
            this.f168 = C0301.f719;
            C0047 c0047 = C0047.f129;
            Object m470 = c0047.m470("android.view.WindowManagerGlobal", "getWindowManagerService");
            if (m470 == null) {
                return;
            }
            Object m4702 = c0047.m470("android.view.WindowManagerGlobal", "getWindowSession");
            C0033 m646 = m646("window", (IInterface) m470);
            Object obj = null;
            if (m4702 != null) {
                C0342 c0342 = C0342.f813;
                c0302.getClass();
                C0033 m2097 = c0342.m2097(m4702, C0301.f719);
                Object obj2 = m2097 != null ? m2097.f100 : null;
                if (obj2 != null) {
                    c0047.m469("android.view.WindowManagerGlobal", "sWindowSession", obj2);
                    C0142 c0142 = new C0142();
                    String[] strArr = new String[6];
                    strArr[0] = "add";
                    strArr[1] = "addToDisplayWithoutInputChannel";
                    strArr[2] = "addWithoutInputChannel";
                    strArr[3] = "relayout";
                    strArr[4] = "addToDisplay";
                    strArr[5] = "addToDisplayAsUser";
                    m2097.m377(c0142, strArr);
                    obj = obj2;
                }
            }
            Object obj3 = m646 != null ? m646.f100 : null;
            if (obj3 == null) {
                return;
            }
            c0047.m469("android.view.WindowManagerGlobal", "sWindowManagerService", obj3);
            try {
                c0047.m469(C0175.f260 ? "com.android.internal.policy.PhoneWindow$WindowManagerHolder" : "com.android.internal.policy.impl.PhoneWindow$WindowManagerHolder", "sWindowManager", obj3);
            } catch (Exception unused) {
            }
            if (obj == null) {
                return;
            }
            C0202.f299.getClass();
            C0167 c0167 = new C0167(obj);
            String[] strArr2 = new String[3];
            strArr2[0] = "openSession";
            strArr2[1] = "overridePendingAppTransition";
            strArr2[2] = "setAppStartingWindow";
            m646.m377(c0167, strArr2);
        } catch (Exception unused2) {
        }
    }
}
