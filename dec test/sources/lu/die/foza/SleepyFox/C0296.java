package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0255;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢮ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢮ.class */
public final class C0296 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0296 f713 = new C0296();

    @SourceDebugExtension({"SMAP\nFozaDxIntentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaActivityResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaActivityResolver\n*L\n111#1:176,2\n115#1:178,2\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ࢮ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢮ$Ϳ.class */
    public static final class C0297 extends AbstractC0418<PackageParser.ActivityIntentInfo> {
        public C0297(@Nullable Iterable<PackageParser.Activity> iterable) {
            if (iterable != null) {
                for (PackageParser.Activity activity : iterable) {
                    m1808(activity);
                }
            }
        }

        @NotNull
        /* renamed from: Ԩ  reason: contains not printable characters */
        public PackageParser.ActivityIntentInfo[] m1804(int i) {
            return new PackageParser.ActivityIntentInfo[i];
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1808(PackageParser.Activity activity) {
            ArrayList<PackageParser.ActivityIntentInfo> arrayList;
            if (activity.info == null || (arrayList = activity.intents) == null) {
                return;
            }
            for (PackageParser.ActivityIntentInfo activityIntentInfo : arrayList) {
                m2333((C0297) activityIntentInfo);
            }
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0418
        /* renamed from: Ϳ  reason: contains not printable characters */
        public PackageParser.ActivityIntentInfo[] mo1806(int i) {
            return new PackageParser.ActivityIntentInfo[i];
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0418
        /* renamed from: Ϳ  reason: contains not printable characters */
        public /* bridge */ /* synthetic */ void mo1807(PackageParser.ActivityIntentInfo activityIntentInfo, int i, int i2, List list, C0065 c0065) {
            m1805(activityIntentInfo, i, i2, (List<ResolveInfo>) list, c0065);
        }

        /* renamed from: Ϳ  reason: avoid collision after fix types in other method and contains not printable characters */
        public void m1805(@NotNull PackageParser.ActivityIntentInfo activityIntentInfo, int i, int i2, @NotNull List<ResolveInfo> list, @NotNull C0065 c0065) {
            ActivityInfo activityInfo = activityIntentInfo.activity.info;
            if ((activityInfo.enabled || (i2 & C0255.C0256.f528) != 0) && c0065.m634(activityInfo.name.hashCode())) {
                ResolveInfo m1803 = C0296.f713.m1803(activityIntentInfo, i2, i);
                m1803.activityInfo = activityInfo;
                list.add(m1803);
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢮ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢮ$Ԩ.class */
    public static final class C0298 {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0297 f714;
        @NotNull

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final C0297 f715;
        @NotNull

        /* renamed from: ԩ  reason: contains not printable characters */
        public final C0300 f716;
        @NotNull

        /* renamed from: Ԫ  reason: contains not printable characters */
        public final C0299 f717;

        public C0298(@NotNull PackageParser.Package r9) {
            this.f714 = new C0297(r9.activities);
            this.f715 = new C0297(r9.receivers);
            this.f716 = new C0300(r9.services);
            this.f717 = new C0299(r9.providers);
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final List<ResolveInfo> m1809(@NotNull Intent intent, @Nullable String str, int i) {
            return this.f714.m2334(intent, str, i);
        }

        @NotNull
        /* renamed from: ԩ  reason: contains not printable characters */
        public final List<ResolveInfo> m1810(@NotNull Intent intent, @Nullable String str, int i) {
            return this.f715.m2334(intent, str, i);
        }

        @NotNull
        /* renamed from: Ԫ  reason: contains not printable characters */
        public final List<ResolveInfo> m1811(@NotNull Intent intent, @Nullable String str, int i) {
            return this.f716.m2334(intent, str, i);
        }

        @NotNull
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final List<ResolveInfo> m1812(@NotNull Intent intent, @Nullable String str, int i) {
            return this.f717.m2334(intent, str, i);
        }
    }

    @SourceDebugExtension({"SMAP\nFozaDxIntentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaProviderResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaProviderResolver\n*L\n77#1:176,2\n81#1:178,2\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ࢮ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢮ$Ԫ.class */
    public static final class C0299 extends AbstractC0418<PackageParser.ProviderIntentInfo> {
        public C0299(@Nullable Iterable<PackageParser.Provider> iterable) {
            if (iterable != null) {
                for (PackageParser.Provider provider : iterable) {
                    m1815(provider);
                }
            }
        }

        @NotNull
        /* renamed from: Ԩ  reason: contains not printable characters */
        public PackageParser.ProviderIntentInfo[] m1813(int i) {
            return new PackageParser.ProviderIntentInfo[i];
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1815(PackageParser.Provider provider) {
            ArrayList<PackageParser.ProviderIntentInfo> arrayList;
            if (provider.info == null || (arrayList = provider.intents) == null) {
                return;
            }
            for (PackageParser.ProviderIntentInfo providerIntentInfo : arrayList) {
                m2333((C0299) providerIntentInfo);
            }
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0418
        /* renamed from: Ϳ */
        public PackageParser.ProviderIntentInfo[] mo1806(int i) {
            return new PackageParser.ProviderIntentInfo[i];
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0418
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ void mo1807(PackageParser.ProviderIntentInfo providerIntentInfo, int i, int i2, List list, C0065 c0065) {
            m1814(providerIntentInfo, i, i2, (List<ResolveInfo>) list, c0065);
        }

        /* renamed from: Ϳ  reason: avoid collision after fix types in other method and contains not printable characters */
        public void m1814(@NotNull PackageParser.ProviderIntentInfo providerIntentInfo, int i, int i2, @NotNull List<ResolveInfo> list, @NotNull C0065 c0065) {
            ProviderInfo providerInfo = providerIntentInfo.provider.info;
            if ((providerInfo.enabled || (i2 & C0255.C0256.f528) != 0) && c0065.m634(providerInfo.name.hashCode())) {
                ResolveInfo m1803 = C0296.f713.m1803(providerIntentInfo, i2, i);
                m1803.providerInfo = providerInfo;
                list.add(m1803);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nFozaDxIntentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaServiceResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 FozaDxIntentResolver.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaDxIntentResolver$FozaServiceResolver\n*L\n144#1:176,2\n148#1:178,2\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ࢮ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢮ$Ԭ.class */
    public static final class C0300 extends AbstractC0418<PackageParser.ServiceIntentInfo> {
        public C0300(@Nullable Iterable<PackageParser.Service> iterable) {
            if (iterable != null) {
                for (PackageParser.Service service : iterable) {
                    m1818(service);
                }
            }
        }

        @NotNull
        /* renamed from: Ԩ  reason: contains not printable characters */
        public PackageParser.ServiceIntentInfo[] m1816(int i) {
            return new PackageParser.ServiceIntentInfo[i];
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1818(PackageParser.Service service) {
            ArrayList<PackageParser.ServiceIntentInfo> arrayList;
            if (service.info == null || (arrayList = service.intents) == null) {
                return;
            }
            for (PackageParser.ServiceIntentInfo serviceIntentInfo : arrayList) {
                m2333((C0300) serviceIntentInfo);
            }
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0418
        /* renamed from: Ϳ */
        public PackageParser.ServiceIntentInfo[] mo1806(int i) {
            return new PackageParser.ServiceIntentInfo[i];
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0418
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ void mo1807(PackageParser.ServiceIntentInfo serviceIntentInfo, int i, int i2, List list, C0065 c0065) {
            m1817(serviceIntentInfo, i, i2, (List<ResolveInfo>) list, c0065);
        }

        /* renamed from: Ϳ  reason: avoid collision after fix types in other method and contains not printable characters */
        public void m1817(@NotNull PackageParser.ServiceIntentInfo serviceIntentInfo, int i, int i2, @NotNull List<ResolveInfo> list, @NotNull C0065 c0065) {
            ServiceInfo serviceInfo = serviceIntentInfo.service.info;
            if ((serviceInfo.enabled || (i2 & C0255.C0256.f528) != 0) && c0065.m634(serviceInfo.name.hashCode())) {
                ResolveInfo m1803 = C0296.f713.m1803(serviceIntentInfo, i2, i);
                m1803.serviceInfo = serviceInfo;
                list.add(m1803);
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ResolveInfo m1803(PackageParser.IntentInfo intentInfo, int i, int i2) {
        ResolveInfo resolveInfo = new ResolveInfo();
        if ((i & 64) != 0) {
            resolveInfo.filter = intentInfo;
        }
        resolveInfo.priority = intentInfo.getPriority();
        resolveInfo.preferredOrder = 0;
        resolveInfo.match = i2;
        resolveInfo.isDefault = intentInfo.hasDefault;
        resolveInfo.labelRes = intentInfo.labelRes;
        resolveInfo.nonLocalizedLabel = intentInfo.nonLocalizedLabel;
        resolveInfo.icon = intentInfo.icon;
        return resolveInfo;
    }
}
