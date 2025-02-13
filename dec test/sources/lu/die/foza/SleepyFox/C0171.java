package lu.die.foza.SleepyFox;

import android.bluetooth.BluetoothAdapter;
import android.os.IInterface;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ފ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ފ.class */
public final class C0171 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ފ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ފ$Ϳ.class */
    public static final class C0172 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object m1485 = c0253.m1485();
            C0342 c0342 = C0342.f813;
            C0301.f718.getClass();
            Object m2096 = c0342.m2096(m1485, C0301.f719);
            if (m2096 != null) {
                m1485 = m2096;
            }
            return m1485;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ފ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ފ$Ԩ.class */
    public static final class C0173 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final String f253;

        public C0173() {
            String upperCase = C0292.f698.m1778().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            this.f253 = upperCase;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            String str;
            try {
                C0202.f299.getClass();
                str = C0202.f300.mo85(c0253);
            } catch (Exception unused) {
                str = this.f253;
            }
            return str;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return;
            }
            C0343 c0343 = new C0343("mManagerService");
            IInterface iInterface = (IInterface) c0343.m2103(defaultAdapter);
            if (iInterface == null) {
                return;
            }
            c0343.m2104(defaultAdapter, (Object) null);
            C0033 m646 = m646("bluetooth_manager", iInterface);
            if (m646 == null) {
                return;
            }
            c0343.m2104(defaultAdapter, m646.f100);
            m646.m374("registerAdapter", new C0172());
            m646.m374("getAddress", new C0173());
        } catch (Exception unused) {
        }
    }
}
