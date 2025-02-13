package lu.die.foza.SleepyFox;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ހ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ.class */
public final class C0143 {
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final C0144 f191 = new C0144();
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final C0143 f192 = new C0143();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0148 f193 = new C0148();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0149 f194 = new C0149();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final C0145 f195 = new C0145();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0146 f196 = new C0146();
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final AbstractC0412 f197 = C0202.f299.m1142(Integer.valueOf(C0448.f1055.m2364()));
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final C0147 f198 = new C0147();

    /* renamed from: lu.die.foza.SleepyFox.ހ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ$Ϳ.class */
    public static final class C0144 {
        public C0144() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0143 m716() {
            return C0143.f192;
        }

        public /* synthetic */ C0144(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ހ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ$Ԩ.class */
    public static final class C0145 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                C0276 c0276 = C0276.f576;
                if (c0276.m1708() && Intrinsics.areEqual(c0253.f519[0], Integer.valueOf(C0448.f1055.m2364()))) {
                    C0213.f309.getClass();
                    String str = C0213.f310;
                    String str2 = str;
                    if (str == null) {
                        str2 = c0276.m1713();
                    }
                    return str2;
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ހ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ$Ԫ.class */
    public static final class C0146 extends C0202 {
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
            if (r0 == null) goto L49;
         */
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo85(lu.die.foza.SleepyFox.C0253 r5) {
            /*
                r4 = this;
                r0 = r5
                java.lang.Object r0 = r0.m1485()
                r1 = r0
                r4 = r1
                boolean r0 = r0 instanceof java.lang.String[]
                if (r0 == 0) goto L14
                r0 = r4
                java.lang.String[] r0 = (java.lang.String[]) r0
                r4 = r0
                goto L16
            L14:
                r0 = 0
                r4 = r0
            L16:
                lu.die.foza.SleepyFox.ࢦ r0 = lu.die.foza.SleepyFox.C0276.f576     // Catch: java.lang.Exception -> L74
                r1 = r0
                r6 = r1
                boolean r0 = r0.m1708()     // Catch: java.lang.Exception -> L74
                if (r0 == 0) goto Lbc
                r0 = r5
                java.lang.Object[] r0 = r0.f519     // Catch: java.lang.Exception -> L74
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Exception -> L74
                r1 = r0
                r5 = r1
                boolean r0 = r0 instanceof int[]     // Catch: java.lang.Exception -> L74
                if (r0 == 0) goto L37
                r0 = r5
                int[] r0 = (int[]) r0     // Catch: java.lang.Exception -> L74
                r5 = r0
                goto L39
            L37:
                r0 = 0
                r5 = r0
            L39:
                r0 = r5
                if (r0 == 0) goto Lba
                r0 = r5
                int r0 = r0.length     // Catch: java.lang.Exception -> L74
                if (r0 != 0) goto L46
                r0 = 1
                goto L47
            L46:
                r0 = 0
            L47:
                if (r0 == 0) goto L4d
                goto Lba
            L4d:
                int r0 = android.os.Binder.getCallingPid()     // Catch: java.lang.Exception -> L74
                lu.die.foza.SleepyFox.ၡ r1 = lu.die.foza.SleepyFox.C0448.f1055     // Catch: java.lang.Exception -> L74
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Exception -> L74
                int r1 = lu.die.foza.SleepyFox.C0448.f1057     // Catch: java.lang.Exception -> L74
                if (r0 == r1) goto L6c
                lu.die.foza.SleepyFox.ޡ r0 = lu.die.foza.SleepyFox.C0213.f309     // Catch: java.lang.Exception -> L74
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L74
                java.lang.String r0 = lu.die.foza.SleepyFox.C0213.f310     // Catch: java.lang.Exception -> L74
                r1 = r0
                r7 = r1
                if (r0 != 0) goto L78
            L6c:
                r0 = r6
                java.lang.String r0 = r0.m1713()     // Catch: java.lang.Exception -> L74
                r7 = r0
                goto L78
            L74:
                goto Lbc
            L78:
                r0 = r5
                r1 = 0
                r6 = r1
                int r0 = r0.length     // Catch: java.lang.Exception -> L74
                r1 = r0
                r8 = r1
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L74
                r9 = r0
            L84:
                r0 = r6
                r1 = r8
                if (r0 >= r1) goto Lb7
                r0 = r5
                r1 = r6
                r0 = r0[r1]     // Catch: java.lang.Exception -> L74
                lu.die.foza.SleepyFox.ၡ r1 = lu.die.foza.SleepyFox.C0448.f1055     // Catch: java.lang.Exception -> L74
                int r1 = r1.m2364()     // Catch: java.lang.Exception -> L74
                if (r0 != r1) goto L9c
                r0 = r7
                r10 = r0
                goto Lab
            L9c:
                r0 = r4
                if (r0 == 0) goto La8
                r0 = r4
                r1 = r6
                r0 = r0[r1]     // Catch: java.lang.Exception -> L74
                r10 = r0
                goto Lab
            La8:
                r0 = 0
                r10 = r0
            Lab:
                r0 = r9
                r1 = r6
                r2 = r10
                r0[r1] = r2     // Catch: java.lang.Exception -> L74
                int r6 = r6 + 1
                goto L84
            Lb7:
                r0 = r9
                return r0
            Lba:
                r0 = r4
                return r0
            Lbc:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0143.C0146.mo85(lu.die.foza.SleepyFox.ࡥ):java.lang.Object");
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ހ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ$Ԭ.class */
    public static final class C0147 extends C0202 {

        /* renamed from: Ԫ  reason: contains not printable characters */
        public Object f199;

        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object obj = this.f199;
                if (obj != null) {
                    return obj;
                }
                C0342 c0342 = C0342.f813;
                Object m1485 = c0253.m1485();
                C0301.f718.getClass();
                Object m2096 = c0342.m2096(m1485, C0301.f719);
                this.f199 = m2096;
                return m2096;
            } catch (Exception unused) {
                return c0253.m1485();
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ހ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ$Ԯ.class */
    public static final class C0148 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            String valueOf;
            try {
                valueOf = String.valueOf(c0253.f519[0]);
            } catch (Exception unused) {
            }
            if (Intrinsics.areEqual(C0276.f576.m1713(), valueOf)) {
                return Integer.valueOf(C0448.f1055.m2364());
            }
            C0245.f512.getClass();
            int m1445 = C0245.f513.m1445(valueOf);
            if (m1445 >= 0) {
                return Integer.valueOf(m1445);
            }
            return c0253.m1485();
        }
    }

    @SourceDebugExtension({"SMAP\nAppUidHookManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUidHookManager.kt\nlu/die/foza/HookEntity/SampleHookEntity/AppUidHookManager$getPackagesForUid$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,191:1\n37#2,2:192\n*S KotlinDebug\n*F\n+ 1 AppUidHookManager.kt\nlu/die/foza/HookEntity/SampleHookEntity/AppUidHookManager$getPackagesForUid$1\n*L\n71#1:192,2\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ހ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ހ$ՠ.class */
    public static final class C0149 extends C0202 {
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
            if (r0 == lu.die.foza.SleepyFox.C0448.f1057) goto L28;
         */
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo85(lu.die.foza.SleepyFox.C0253 r6) {
            /*
                r5 = this;
                lu.die.foza.SleepyFox.ࢦ r0 = lu.die.foza.SleepyFox.C0276.f576
                java.lang.String r0 = r0.m1713()
                r1 = r0
                r5 = r1
                if (r0 != 0) goto L10
                r0 = r6
                java.lang.Object r0 = r0.m1485()
                return r0
            L10:
                r0 = r6
                java.lang.Object[] r0 = r0.f519     // Catch: java.lang.Exception -> L77
                r1 = 0
                r0 = r0[r1]     // Catch: java.lang.Exception -> L77
                r1 = r0
                r7 = r1
                boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L77
                if (r0 == 0) goto L72
                r0 = r7
                lu.die.foza.SleepyFox.ၡ r1 = lu.die.foza.SleepyFox.C0448.f1055     // Catch: java.lang.Exception -> L77
                r2 = r1
                r8 = r2
                int r1 = r1.m2364()     // Catch: java.lang.Exception -> L77
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L77
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L77
                if (r0 == 0) goto L41
                int r0 = android.os.Binder.getCallingPid()     // Catch: java.lang.Exception -> L77
                r1 = r0
                r9 = r1
                r1 = r8
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Exception -> L77
                int r1 = lu.die.foza.SleepyFox.C0448.f1057     // Catch: java.lang.Exception -> L77
                if (r0 != r1) goto L44
            L41:
                r0 = -1
                r9 = r0
            L44:
                lu.die.foza.SleepyFox.ࡠ$Ϳ r0 = lu.die.foza.SleepyFox.C0245.f512     // Catch: java.lang.Exception -> L77
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L77
                lu.die.foza.SleepyFox.ࡠ r0 = lu.die.foza.SleepyFox.C0245.m1422()     // Catch: java.lang.Exception -> L77
                r1 = r5
                r2 = r7
                java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L77
                int r2 = r2.intValue()     // Catch: java.lang.Exception -> L77
                r3 = r9
                java.util.List r0 = r0.m1448(r1, r2, r3)     // Catch: java.lang.Exception -> L77
                r1 = r0
                r5 = r1
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L77
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L72
                r0 = r5
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L77
                java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Exception -> L77
                return r0
            L72:
                r0 = r6
                java.lang.Object r0 = r0.m1485()     // Catch: java.lang.Exception -> L77
                return r0
            L77:
                r0 = 0
                java.lang.String[] r0 = new java.lang.String[r0]
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0143.C0149.mo85(lu.die.foza.SleepyFox.ࡥ):java.lang.Object");
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m715(@Nullable C0033 c0033) {
        if (c0033 == null) {
            return;
        }
        try {
            C0148 c0148 = this.f193;
            String[] strArr = new String[2];
            strArr[0] = "getPackageUid";
            strArr[1] = "getPackageUidEtc";
            c0033.m377(c0148, strArr);
            C0149 c0149 = this.f194;
            String[] strArr2 = new String[1];
            strArr2[0] = "getPackagesForUid";
            c0033.m377(c0149, strArr2);
            C0145 c0145 = this.f195;
            String[] strArr3 = new String[1];
            strArr3[0] = "getNameForUid";
            c0033.m377(c0145, strArr3);
            AbstractC0412 abstractC0412 = this.f197;
            String[] strArr4 = new String[1];
            strArr4[0] = "getUidForSharedUser";
            c0033.m377(abstractC0412, strArr4);
            c0033.m374("getPackageInstaller", this.f198);
            C0277.f587.getClass();
            c0033.m374("getPackageGids", C0277.f588);
            c0033.m374("getNamesForUids", this.f196);
        } catch (Exception unused) {
        }
    }
}
