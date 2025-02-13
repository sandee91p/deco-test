package lu.die.foza.SleepyFox;

import android.location.GeocoderParams;
import android.location.Location;
import lu.die.foza.SleepyFox.C0248;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ၦ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၦ.class */
public final class C0450 extends AbstractC0066 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0451 f1061 = new C0451();

    /* renamed from: lu.die.foza.SleepyFox.ၦ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၦ$Ϳ.class */
    public static final class C0451 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0301.f718.getClass();
            Object mo85 = C0301.f719.mo85(c0253);
            try {
                C0248.C0249 c0249 = C0248.f515;
                c0249.getClass();
                C0248.f516.getClass();
                Location location = (Location) C0153.f201.m726(c0253.f519, Location.class);
                if (location != null) {
                    c0249.getClass();
                    C0248 c0248 = C0248.f516;
                    location.toString();
                    c0248.getClass();
                }
            } catch (Exception unused) {
            }
            return mo85;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၦ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၦ$Ԩ.class */
    public static final class C0452 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0343<Object> f1062 = new C0343<>("mPackageName");

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0343<Object> m2381() {
            return this.f1062;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                GeocoderParams geocoderParams = (GeocoderParams) C0153.f201.m726(c0253.f519, GeocoderParams.class);
                if (geocoderParams != null) {
                    C0343<Object> c0343 = this.f1062;
                    C0276.f576.getClass();
                    c0343.m2104(geocoderParams, C0276.f583);
                }
            } catch (Throwable unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
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
            this.f168 = this.f1061;
            C0033 m643 = m643("location");
            if (m643 == null) {
                return;
            }
            C0452 c0452 = new C0452();
            String[] strArr = new String[2];
            strArr[0] = "getFromLocation";
            strArr[1] = "getFromLocationName";
            m643.m377(c0452, strArr);
        } catch (Exception unused) {
        }
    }
}
