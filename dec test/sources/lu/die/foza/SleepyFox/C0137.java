package lu.die.foza.SleepyFox;

import android.app.SyncNotedAppOp;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ؠ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ؠ.class */
public final class C0137 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ؠ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ؠ$Ϳ.class */
    public static final class C0138 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                if (C0175.f270 && Intrinsics.areEqual(c0253.f519[0], 92)) {
                    return 0;
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ؠ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ؠ$Ԩ.class */
    public static final class C0139 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0343<Integer> f189 = new C0343<>("mOpMode");

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0301.f718.getClass();
            Object mo85 = C0301.f719.mo85(c0253);
            try {
                if (C0175.f270 && (mo85 instanceof SyncNotedAppOp)) {
                    this.f189.m2119(mo85, 0);
                }
            } catch (Exception unused) {
            }
            return mo85;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("appops");
            if (m643 == null) {
                return;
            }
            m643.m374("checkOperation", new C0138());
            m643.m374("noteProxyOperation", new C0139());
            C0202.f299.getClass();
            m643.m374("checkPackage", new C0167(0));
        } catch (Exception unused) {
        }
    }
}
