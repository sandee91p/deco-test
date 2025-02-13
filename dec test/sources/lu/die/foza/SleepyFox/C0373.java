package lu.die.foza.SleepyFox;

import java.security.SecureRandom;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0202;
/* renamed from: lu.die.foza.SleepyFox.ຐ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຐ.class */
public final class C0373 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643((!C0175.f266 || !C0175.f272) ? "phone_huawei" : "phone_honor");
            if (m643 == null) {
                return;
            }
            C0202.C0203 c0203 = C0202.f299;
            C0292.f698.getClass();
            String str = C0292.f703;
            c0203.getClass();
            m643.m374("getUniqueDeviceId", new C0167(str));
            String str2 = "0x80" + m2254(6);
            c0203.getClass();
            m643.m374("getPesnForSubscriber", new C0167(str2));
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m2254(int i) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < i; i2++) {
                stringBuffer.append(Integer.toHexString(secureRandom.nextInt(16)));
            }
            String upperCase = stringBuffer.toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        } catch (Exception unused) {
            return null;
        }
    }
}
