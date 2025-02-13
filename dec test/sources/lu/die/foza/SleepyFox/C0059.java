package lu.die.foza.SleepyFox;

import android.content.res.ObbInfo;
import android.os.storage.StorageManager;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lu.die.foza.SleepyFox.C0248;
/* renamed from: lu.die.foza.SleepyFox.ˤ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˤ.class */
public final class C0059 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ˤ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˤ$Ϳ.class */
    public static final class C0060 extends C0301 {

        /* renamed from: lu.die.foza.SleepyFox.ˤ$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˤ$Ϳ$Ϳ.class */
        public static final class C0061 extends Lambda implements Function0<Object> {

            /* renamed from: Ԩ  reason: contains not printable characters */
            public final /* synthetic */ C0253 f162;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0061(C0253 c0253) {
                super(0);
                this.f162 = c0253;
            }

            public final Object invoke() {
                Object mo85 = C0060.super.mo85(this.f162);
                C0248.C0249 c0249 = C0248.f515;
                c0249.getClass();
                C0248.f516.getClass();
                if (mo85 instanceof Object[]) {
                    c0249.getClass();
                    C0248 c0248 = C0248.f516;
                    Intrinsics.checkNotNullExpressionValue(Arrays.toString((Object[]) mo85), "toString(...)");
                    c0248.getClass();
                }
                return mo85;
            }
        }

        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            if (!C0276.f576.m1708()) {
                return super.mo85(c0253);
            }
            C0303.f721.getClass();
            return C0303.f722.invoke(new C0061(c0253));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˤ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˤ$Ԩ.class */
    public static final class C0062 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                ObbInfo obbInfo = (ObbInfo) C0153.f201.m726(c0253.f519, ObbInfo.class);
                if (obbInfo != null) {
                    obbInfo.packageName = m1135();
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
            C0277.f587.getClass();
            this.f168 = C0277.f588;
            boolean z = C0175.f262;
            C0033 m643 = z ? m643("mount") : m642("mount", "android.os.storage.IMountService$Stub");
            if (m643 != null) {
                if (C0175.f261 && !z) {
                    C0047.f129.m468(StorageManager.class, "sMountService", (Object) null);
                }
                m643.m374("getVolumeList", new C0060());
                m643.m374("mountObb", new C0062());
            }
        } catch (Exception unused) {
        }
        try {
            if (!C0175.f258 || !C0175.f267) {
                return;
            }
            C0361.f848.m2189();
        } catch (Exception unused2) {
        }
    }
}
