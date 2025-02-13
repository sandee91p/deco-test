package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.IOnChecksumsReadyListener;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0202;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ဨ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ.class */
public final class C0421 {
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final C0422 f1030 = new C0422();
    @NotNull

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final C0421 f1031 = new C0421();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0427 f1032 = new C0427();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0424 f1033 = new C0424();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final C0426 f1034 = new C0426();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0425 f1035 = new C0425();
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final C0428 f1036 = new C0428();
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final C0429 f1037 = new C0429();
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public final C0423 f1038 = new C0423();
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public final C0430 f1039 = new C0430();
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public final C0431 f1040 = new C0431();

    /* renamed from: lu.die.foza.SleepyFox.ဨ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$Ϳ.class */
    public static final class C0422 {
        public C0422() {
        }

        public /* synthetic */ C0422(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m2348(ComponentInfo componentInfo) {
            componentInfo.applicationInfo = C0448.f1055.m2367(componentInfo.applicationInfo);
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0421 m2347() {
            return C0421.f1031;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ဨ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$Ԩ.class */
    public static final class C0423 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object obj = c0253.f519[0];
                if (obj instanceof String) {
                    C0245.f512.getClass();
                    if (C0245.f513.m1446((String) obj)) {
                        return m1135();
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    @SourceDebugExtension({"SMAP\nIntentResolverHooker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mActivityQueryHooker$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n2634#2:277\n1#3:278\n*S KotlinDebug\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mActivityQueryHooker$1\n*L\n62#1:277\n62#1:278\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ဨ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$Ԫ.class */
    public static final class C0424 extends AbstractC0279 {
        @Override // lu.die.foza.SleepyFox.AbstractC0279
        /* renamed from: Ϳ */
        public List<ResolveInfo> mo1734(Intent intent, String str, int i) {
            C0245.f512.getClass();
            List<ResolveInfo> m1437 = C0245.f513.m1437(intent, str, i);
            List<ResolveInfo> list = m1437;
            if (m1437 != null) {
                for (ResolveInfo resolveInfo : list) {
                    C0421.f1030.m2348(resolveInfo.activityInfo);
                }
            } else {
                list = null;
            }
            return list;
        }
    }

    @SourceDebugExtension({"SMAP\nIntentResolverHooker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mProviderQueryHooker$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n2634#2:277\n1#3:278\n*S KotlinDebug\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mProviderQueryHooker$1\n*L\n94#1:277\n94#1:278\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ဨ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$Ԭ.class */
    public static final class C0425 extends AbstractC0279 {
        @Override // lu.die.foza.SleepyFox.AbstractC0279
        /* renamed from: Ϳ */
        public List<ResolveInfo> mo1734(Intent intent, String str, int i) {
            C0245.f512.getClass();
            List<ResolveInfo> m1436 = C0245.f513.m1436(intent, str, i);
            List<ResolveInfo> list = m1436;
            if (m1436 != null) {
                for (ResolveInfo resolveInfo : list) {
                    C0421.f1030.m2348(resolveInfo.providerInfo);
                }
            } else {
                list = null;
            }
            return list;
        }
    }

    @SourceDebugExtension({"SMAP\nIntentResolverHooker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mReceiverQueryHooker$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n2634#2:277\n1#3:278\n*S KotlinDebug\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mReceiverQueryHooker$1\n*L\n78#1:277\n78#1:278\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ဨ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$Ԯ.class */
    public static final class C0426 extends AbstractC0279 {
        @Override // lu.die.foza.SleepyFox.AbstractC0279
        /* renamed from: Ϳ */
        public List<ResolveInfo> mo1734(Intent intent, String str, int i) {
            C0245.f512.getClass();
            List<ResolveInfo> m1439 = C0245.f513.m1439(intent, str, i);
            List<ResolveInfo> list = m1439;
            if (m1439 != null) {
                for (ResolveInfo resolveInfo : list) {
                    C0421.f1030.m2348(resolveInfo.activityInfo);
                }
            } else {
                list = null;
            }
            return list;
        }
    }

    @SourceDebugExtension({"SMAP\nIntentResolverHooker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mServiceQueryHooker$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n2634#2:277\n1#3:278\n*S KotlinDebug\n*F\n+ 1 IntentResolverHooker.kt\nlu/die/foza/HookEntity/SampleHookEntity/SharedHookEntity/IntentResolverHooker$mServiceQueryHooker$1\n*L\n46#1:277\n46#1:278\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ဨ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$ՠ.class */
    public static final class C0427 extends AbstractC0279 {
        @Override // lu.die.foza.SleepyFox.AbstractC0279
        /* renamed from: Ϳ */
        public List<ResolveInfo> mo1734(Intent intent, String str, int i) {
            C0245.f512.getClass();
            List<ResolveInfo> m1438 = C0245.f513.m1438(intent, str, i);
            List<ResolveInfo> list = m1438;
            if (m1438 != null) {
                for (ResolveInfo resolveInfo : list) {
                    C0421.f1030.m2348(resolveInfo.serviceInfo);
                }
            } else {
                list = null;
            }
            return list;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ဨ$ֈ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$ֈ.class */
    public static final class C0428 extends AbstractC0259 {
        @Override // lu.die.foza.SleepyFox.AbstractC0259
        /* renamed from: Ϳ */
        public ResolveInfo mo1608(Intent intent, String str, int i) {
            C0245.f512.getClass();
            List<ResolveInfo> m1437 = C0245.f513.m1437(intent, str, i);
            if (!(m1437 == null || m1437.isEmpty())) {
                ResolveInfo resolveInfo = m1437.get(0);
                C0421.f1030.m2348(resolveInfo.activityInfo);
                return resolveInfo;
            }
            return null;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ဨ$֏  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$֏.class */
    public static final class C0429 extends AbstractC0259 {
        @Override // lu.die.foza.SleepyFox.AbstractC0259
        /* renamed from: Ϳ */
        public ResolveInfo mo1608(Intent intent, String str, int i) {
            C0245.f512.getClass();
            List<ResolveInfo> m1438 = C0245.f513.m1438(intent, str, i);
            if (!(m1438 == null || m1438.isEmpty())) {
                ResolveInfo resolveInfo = m1438.get(0);
                C0421.f1030.m2348(resolveInfo.serviceInfo);
                return resolveInfo;
            }
            return null;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ဨ$ׯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$ׯ.class */
    public static final class C0430 extends C0202 {
        /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[Catch: Exception -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b9, blocks: (B:2:0x0000, B:3:0x0006, B:4:0x000a, B:6:0x0010, B:8:0x0016, B:9:0x0022, B:14:0x0037, B:15:0x0045, B:17:0x004b, B:19:0x0050, B:21:0x0056, B:22:0x0063, B:23:0x006a, B:26:0x0079, B:30:0x008d, B:32:0x0092, B:35:0x009c, B:37:0x00a3, B:38:0x00ae), top: B:1:0x0000 }] */
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo85(lu.die.foza.SleepyFox.C0253 r8) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0421.C0430.mo85(lu.die.foza.SleepyFox.ࡥ):java.lang.Object");
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ဨ$ؠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဨ$ؠ.class */
    public static final class C0431 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object obj = c0253.f519[0];
                String obj2 = obj != null ? obj.toString() : null;
                if (obj2 != null) {
                    C0245.f512.getClass();
                    if (C0245.f513.m1446(obj2)) {
                        IOnChecksumsReadyListener iOnChecksumsReadyListener = (IOnChecksumsReadyListener) C0153.f201.m726(c0253.f519, IOnChecksumsReadyListener.class);
                        if (iOnChecksumsReadyListener == null) {
                            return null;
                        }
                        iOnChecksumsReadyListener.onChecksumsReady(CollectionsKt.emptyList());
                        return null;
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2345(@Nullable C0033 c0033) {
        if (c0033 == null) {
            return;
        }
        try {
            c0033.m374("queryIntentServices", this.f1032);
            c0033.m374("resolveService", this.f1037);
            c0033.m374("queryIntentActivities", this.f1033);
            c0033.m374("resolveIntent", this.f1036);
            c0033.m374("queryIntentReceivers", this.f1034);
            c0033.m374("queryIntentContentProviders", this.f1035);
            c0033.m374("getInstallerPackageName", this.f1038);
            c0033.m374("queryContentProviders", this.f1039);
            if (C0175.f272) {
                c0033.m374("requestChecksums", this.f1040);
            }
            if (C0175.f261) {
                C0202.C0203 c0203 = C0202.f299;
                C0495.f1089.getClass();
                Object obj = C0495.f1091;
                c0203.getClass();
                C0167 c0167 = new C0167(obj);
                String[] strArr = new String[2];
                strArr[0] = "queryInstrumentation";
                strArr[1] = "queryIntentActivityOptions";
                c0033.m377(c0167, strArr);
            } else if (!C0175.f259) {
            } else {
                C0202.C0203 c02032 = C0202.f299;
                List emptyList = CollectionsKt.emptyList();
                c02032.getClass();
                C0167 c01672 = new C0167(emptyList);
                String[] strArr2 = new String[2];
                strArr2[0] = "queryInstrumentation";
                strArr2[1] = "queryIntentActivityOptions";
                c0033.m377(c01672, strArr2);
            }
        } catch (Exception unused) {
        }
    }
}
