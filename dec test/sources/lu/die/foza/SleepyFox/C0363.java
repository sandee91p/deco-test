package lu.die.foza.SleepyFox;

import androidx.annotation.RequiresApi;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ຆ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຆ.class */
public final class C0363 extends AbstractC0066 {
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final C0364 f855 = new C0364();

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final int f856 = 0;

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final int f857 = 1;

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final int f858 = 2;

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final int f859 = 3;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public int f860 = 1;

    /* renamed from: lu.die.foza.SleepyFox.ຆ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຆ$Ϳ.class */
    public static final class C0364 {

        @Retention(AnnotationRetention.SOURCE)
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        /* renamed from: lu.die.foza.SleepyFox.ຆ$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຆ$Ϳ$Ϳ.class */
        public @interface AbstractC0365 {
        }

        public C0364() {
        }

        public /* synthetic */ C0364(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຆ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຆ$Ԩ.class */
    public static final class C0366 implements AbstractC0412 {
        public C0366() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Integer mo85(C0253 c0253) {
            return Integer.valueOf(C0363.this.f860);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຆ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຆ$Ԫ.class */
    public static final class C0367 implements AbstractC0412 {
        public C0367() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            if (r0 != null) goto L9;
         */
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] mo85(lu.die.foza.SleepyFox.C0253 r6) {
            /*
                r5 = this;
                r0 = r6
                r1 = r5
                lu.die.foza.SleepyFox.ຆ r1 = lu.die.foza.SleepyFox.C0363.this     // Catch: java.lang.Exception -> L25
                r5 = r1
                java.lang.Object[] r0 = r0.f519     // Catch: java.lang.Exception -> L25
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Exception -> L25
                r1 = r0
                r6 = r1
                if (r0 == 0) goto L1c
                r0 = r6
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L25
                r1 = r0
                r6 = r1
                if (r0 == 0) goto L1c
                goto L1f
            L1c:
                java.lang.String r0 = "typedef.cn"
                r6 = r0
            L1f:
                r0 = r5
                r1 = r6
                int[] r0 = r0.m2197(r1)     // Catch: java.lang.Exception -> L25
                return r0
            L25:
                r0 = 1
                int[] r0 = new int[r0]
                r1 = r0
                r2 = 0
                r3 = 0
                r1[r2] = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0363.C0367.mo85(lu.die.foza.SleepyFox.ࡥ):int[]");
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຆ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຆ$Ԭ.class */
    public static final class C0368 implements AbstractC0412 {
        public C0368() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Integer num = (Integer) C0153.f201.m726(c0253.f519, Integer.class);
                if (num == null) {
                    return null;
                }
                C0363 c0363 = C0363.this;
                C0276.f576.m1713();
                c0363.f860 = num.intValue();
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static /* synthetic */ void m2192() {
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final int m2194() {
        return this.f860;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final int m2195(@NotNull String str) {
        return this.f860;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2196(@NotNull String str, int i) {
        this.f860 = i;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int[] m2197(@NotNull String str) {
        return new int[]{0, 1, 2, 3};
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    @RequiresApi(31)
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("game");
            if (m643 == null) {
                return;
            }
            m643.m374("getGameMode", new C0366());
            m643.m374("getAvailableGameModes", new C0367());
            m643.m374("setGameMode", new C0368());
        } catch (Exception unused) {
        }
    }
}
