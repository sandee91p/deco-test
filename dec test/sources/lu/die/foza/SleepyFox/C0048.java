package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IInterface;
import android.telephony.TelephonyManager;
import java.lang.reflect.Constructor;
/* renamed from: lu.die.foza.SleepyFox.ˑ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˑ.class */
public final class C0048 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ˑ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˑ$Ϳ.class */
    public static final class C0049 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object obj;
            try {
                C0202.f299.getClass();
                obj = C0202.f300.mo85(c0253);
            } catch (Exception unused) {
                obj = null;
            }
            return obj;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    @SuppressLint({"PrivateApi"})
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = C0063.f163;
            Class<?> cls = Class.forName("android.telephony.TelephonyRegistryManager");
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Context.class;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            Object[] objArr = new Object[1];
            objArr[0] = C0276.m1701();
            Object newInstance = declaredConstructor.newInstance(objArr);
            C0047 c0047 = C0047.f129;
            Object m465 = c0047.m465(newInstance, "sRegistry");
            C0033 m646 = m465 != null ? m646("telephony.registry", (IInterface) m465) : null;
            if ((m646 != null ? m646.f100 : null) != null) {
                c0047.m464(newInstance, "sRegistry", m646.f100);
            }
            Object m470 = c0047.m470(TelephonyManager.class.getName(), "getSubscriberInfoService");
            if (m470 == null) {
                return;
            }
            C0033 m6462 = m646("iphonesubinfo", (IInterface) m470);
            if ((m6462 != null ? m6462.f100 : null) == null) {
                return;
            }
            c0047.m469(TelephonyManager.class.getName(), "sIPhoneSubInfo", m6462.f100);
            C0049 c0049 = new C0049();
            String[] strArr = new String[2];
            strArr[0] = "getSubscriberIdForSubscriber";
            strArr[1] = "getIccSerialNumberForSubscriber";
            m6462.m377(c0049, strArr);
        } catch (Exception unused) {
        }
    }
}
