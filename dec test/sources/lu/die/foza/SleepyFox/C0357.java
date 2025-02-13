package lu.die.foza.SleepyFox;

import com.android.internal.net.VpnConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.FozaStubProcessGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ൕ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൕ.class */
public final class C0357 implements AbstractC0412 {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0358 f843 = new C0358();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0357 f844 = new C0357();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0359 f845 = new C0359();

    /* renamed from: lu.die.foza.SleepyFox.ൕ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൕ$Ϳ.class */
    public static final class C0358 {
        public C0358() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0357 m2180() {
            return C0357.f844;
        }

        public /* synthetic */ C0358(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ൕ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൕ$Ԩ.class */
    public static final class C0359 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                String.valueOf(c0253.f519[0]);
                C0248.f515.getClass();
                C0248.f516.getClass();
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2179(@NotNull C0033 c0033) {
        try {
            c0033.m374("establishVpn", this);
            c0033.m374("prepareVpn", this.f845);
        } catch (Exception unused) {
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        try {
            VpnConfig vpnConfig = (VpnConfig) C0153.f201.m726(c0253.f519, VpnConfig.class);
            if (vpnConfig != null) {
                vpnConfig.user = FozaStubProcessGroup.Companion.FozaVpnService.class.getName();
            }
        } catch (Exception unused) {
        }
        C0301.f718.getClass();
        return C0301.f719.mo85(c0253);
    }
}
