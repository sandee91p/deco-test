package lu.die.foza.SleepyFox;

import android.os.IInterface;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.C0202;
import lu.die.foza.SleepyFox.C0248;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ˮ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˮ.class */
public final class C0063 extends AbstractC0066 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0064 f163 = new C0064();

    /* renamed from: lu.die.foza.SleepyFox.ˮ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˮ$Ϳ.class */
    public static final class C0064 implements AbstractC0412 {
        public C0064() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        @Nullable
        /* renamed from: Ϳ */
        public Object mo85(@NotNull C0253 c0253) {
            C0301.f718.getClass();
            Object mo85 = C0301.f719.mo85(c0253);
            C0248.C0249 c0249 = C0248.f515;
            c0249.getClass();
            C0248.f516.getClass();
            if ((mo85 instanceof String) || (mo85 instanceof Number)) {
                c0249.getClass();
                C0248 c0248 = C0248.f516;
                c0253.f518.getName();
                Objects.toString(mo85);
                c0248.getClass();
            }
            return mo85;
        }

        public /* synthetic */ C0064(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = f163;
            Object systemService = C0276.m1701().getSystemService("phone");
            if (systemService == null) {
                return;
            }
            C0047 c0047 = C0047.f129;
            Object m463 = c0047.m463(systemService, "getITelephony");
            C0033 m646 = m463 == null ? null : m646("phone", (IInterface) m463);
            if ((m646 != null ? m646.f100 : null) != null) {
                C0033 c0033 = m646;
                C0202.C0203 c0203 = C0202.f299;
                C0292.f698.getClass();
                String str = C0292.f703;
                c0203.getClass();
                C0167 c0167 = new C0167(str);
                String[] strArr = new String[4];
                strArr[0] = "getDeviceIdWithFeature";
                strArr[1] = "getDeviceId";
                strArr[2] = "getMeidForSlot";
                strArr[3] = "getImeiForSlot";
                c0033.m377(c0167, strArr);
                if (C0175.f272 || (C0175.f271 && C0175.f267)) {
                    try {
                        c0047.m464(systemService, "sITelephony", m646.f100);
                    } catch (Exception unused) {
                    }
                }
            }
            if (C0175.f271) {
                Object m4632 = C0047.f129.m463(systemService, "getIOns");
                if (m4632 != null) {
                    m646("ions", (IInterface) m4632);
                }
            }
            C0033 m643 = m643("isub");
            if (m643 == null || !C0175.f260) {
                return;
            }
            C0292.f698.getClass();
            Object obj = C0292.f704;
            if (obj == null) {
                return;
            }
            C0202.f299.getClass();
            m643.m374("getActiveSubscriptionInfoList", new C0167(obj));
        } catch (Exception unused2) {
        }
    }
}
