package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.AbstractC0407;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nDiscoveryPackageObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryPackageObserver.kt\nlu/die/foza/Framework/Discover/DiscoveryPackageObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,575:1\n1#2:576\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࡠ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡠ.class */
public final class C0245 extends AbstractC0069<AbstractC0407> {
    @NotNull

    /* renamed from: ԩ */
    public static final C0246 f512 = new C0246();
    @NotNull

    /* renamed from: Ԫ */
    public static final C0245 f513 = new C0245();
    @NotNull

    /* renamed from: Ԩ */
    public final String f514 = BinderC0027.class.getName();

    /* renamed from: lu.die.foza.SleepyFox.ࡠ$Ϳ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡠ$Ϳ.class */
    public static final class C0246 {
        public C0246() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: Ϳ */
        public final C0245 m1469() {
            return C0245.f513;
        }

        public /* synthetic */ C0246(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࡠ$Ԩ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡠ$Ԩ.class */
    public /* synthetic */ class C0247 extends FunctionReferenceImpl implements Function1<IBinder, AbstractC0407> {
        public static final C0247 INSTANCE = new C0247();

        public C0247() {
            super(1, AbstractC0407.AbstractBinderC0409.class, "asInterface", "asInterface(Landroid/os/IBinder;)Llu/die/fozalib/IScalePackageObserver;", 0);
        }

        public final AbstractC0407 invoke(IBinder iBinder) {
            return AbstractC0407.AbstractBinderC0409.m2295(iBinder);
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: ԭ */
    public static final C0245 m1421() {
        f512.getClass();
        return f513;
    }

    /* renamed from: ԫ */
    public static final /* synthetic */ C0245 m1422() {
        return f513;
    }

    @Nullable
    /* renamed from: Ԯ */
    public final List<PackageInfo> m1440() {
        try {
            return m656().mo338(-1);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: ֏ */
    public final void m1441() {
        try {
            m656().mo326();
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final String m1442(@Nullable String str) {
        try {
            return m656().mo343(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return "Failed.";
        }
    }

    /* renamed from: Ԫ */
    public final int m1445(@NotNull String str) {
        try {
            return m656().mo346(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -1;
        }
    }

    @Nullable
    /* renamed from: ԩ */
    public final ProviderInfo m1447(@Nullable String str) {
        try {
            return m656().mo350(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: ԯ */
    public final void m1454() {
        try {
            m656().mo347();
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ԭ */
    public final void m1459() {
        try {
            m656().mo349();
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ϳ */
    public final void m1463(@NotNull String str, @NotNull String str2) {
        try {
            m656().mo359(str, str2);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: ֈ */
    public final void m1467() {
        try {
            m656().mo353(1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ՠ */
    public final boolean m1468(@NotNull String str) {
        try {
            return m656().mo352(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ԭ */
    public final int m1427(@Nullable String str) {
        try {
            return m656().mo339(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -6;
        }
    }

    /* renamed from: Ԭ */
    public final int m1428(@Nullable String str) {
        try {
            return m656().mo340(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -6;
        }
    }

    @Nullable
    /* renamed from: Ԫ */
    public final ServiceInfo m1431(@Nullable ComponentName componentName, int i) {
        try {
            return m656().mo328(componentName, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    @Nullable
    /* renamed from: ԩ */
    public final ActivityInfo m1435(@Nullable ComponentName componentName, int i) {
        try {
            return m656().mo332(componentName, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: ԯ */
    public final boolean m1444(@Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            return m656().mo344(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return false;
        }
    }

    /* renamed from: Ԯ */
    public final boolean m1446(@Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            return m656().mo345(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return false;
        }
    }

    /* renamed from: ֈ */
    public final void m1457(@Nullable String str) {
    }

    /* renamed from: Ϳ */
    public final void m1460(@Nullable String str) {
        try {
            m656().mo348(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @NotNull
    /* renamed from: ԫ */
    public final String[] m1464(@NotNull String str) {
        try {
            return m656().mo358(str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return new String[]{C0281.C0289.m1746()};
        }
    }

    /* renamed from: ՠ */
    public final void m1466() {
        try {
            m656().mo353(0);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: Ϳ */
    public final List<PackageInfo> m1424(@Nullable List<? extends PackageInfo> list, int i) {
        try {
            List<PackageInfo> mo338 = m656().mo338(i);
            ArrayList arrayList = new ArrayList(list != 0 ? list : CollectionsKt.emptyList());
            if (mo338 != null) {
                arrayList.addAll(mo338);
            }
            return arrayList;
        } catch (Exception unused) {
            C0321.f756.m1895();
            return list;
        }
    }

    @Nullable
    /* renamed from: Ԫ */
    public final List<ResolveInfo> m1438(@Nullable Intent intent, @Nullable String str, int i) {
        try {
            return m656().mo334(intent, str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ԭ */
    public final void m1453(boolean z) {
    }

    @NotNull
    /* renamed from: ԩ */
    public final String m1462(@NotNull String str, @NotNull String str2) {
        try {
            return m656().mo357(str, str2);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return C0281.C0289.m1746();
        }
    }

    /* renamed from: Ԩ */
    public final void m1465(@NotNull String str, @NotNull String str2) {
        try {
            m656().mo342(str, str2);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ԫ */
    public static /* synthetic */ List m1419(C0245 c0245, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0245.m1438(intent, str, i);
    }

    @Nullable
    /* renamed from: Ԩ */
    public final PackageInfo m1430(@Nullable String str, int i) {
        try {
            return m656().mo327(str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ActivityInfo m1432(@Nullable ComponentName componentName, int i) {
        try {
            return m656().mo329(componentName, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: ԫ */
    public final void m1449(@Nullable ComponentName componentName, int i) {
        try {
            m656().mo355(componentName, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ ActivityInfo m1416(C0245 c0245, ComponentName componentName, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c0245.m1432(componentName, i);
    }

    @Nullable
    /* renamed from: Ԩ */
    public final ProviderInfo m1434(@Nullable ComponentName componentName, int i) {
        try {
            return m656().mo331(componentName, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    @Nullable
    /* renamed from: ԩ */
    public final List<ResolveInfo> m1439(@Nullable Intent intent, @Nullable String str, int i) {
        try {
            return m656().mo336(intent, str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: ԫ */
    public final void m1452(boolean z) {
    }

    /* renamed from: Ԫ */
    public final void m1458(boolean z) {
    }

    /* renamed from: ԩ */
    public static /* synthetic */ List m1420(C0245 c0245, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0245.m1439(intent, str, i);
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ApplicationInfo m1433(@Nullable String str, int i) {
        try {
            return m656().mo330(str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final List<ResolveInfo> m1436(@Nullable Intent intent, @Nullable String str, int i) {
        try {
            return m656().mo335(intent, str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ԩ */
    public static /* synthetic */ List m1417(C0245 c0245, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0245.m1436(intent, str, i);
    }

    @Nullable
    /* renamed from: ԩ */
    public final ProviderInfo m1443(@NotNull String str, int i) {
        try {
            return m656().mo337(str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final int m1450(@Nullable ComponentName componentName) {
        try {
            return m656().mo354(componentName);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    @NotNull
    /* renamed from: Ϳ */
    public String mo650() {
        return this.f514;
    }

    @Nullable
    /* renamed from: Ԩ */
    public final ServiceInfo m1426(@NotNull Intent intent) {
        try {
            return m656().mo325(intent);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: ԩ */
    public final void m1461(boolean z) {
    }

    /* renamed from: Ϳ */
    public final int m1429(@Nullable String str, boolean z) {
        if (str == null) {
            return -2;
        }
        try {
            return m656().mo341(str, z);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -6;
        }
    }

    /* renamed from: Ԩ */
    public final void m1455(boolean z) {
    }

    @Nullable
    /* renamed from: Ϳ */
    public final List<ProviderInfo> m1451(@Nullable String str, int i, @Nullable String str2) {
        try {
            return m656().mo356(str, i, str2);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final List<ResolveInfo> m1437(@Nullable Intent intent, @Nullable String str, int i) {
        try {
            return m656().mo333(intent, str, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ List m1418(C0245 c0245, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0245.m1437(intent, str, i);
    }

    @NotNull
    /* renamed from: Ϳ */
    public final List<String> m1448(@NotNull String str, int i, int i2) {
        ArrayList arrayList;
        try {
            List<String> mo351 = m656().mo351(str, C0153.f201.m721(i, i2));
            ArrayList arrayList2 = mo351;
            if (mo351 == null) {
                arrayList2 = arrayList;
                arrayList = new ArrayList();
            }
            return arrayList2;
        } catch (Exception unused) {
            C0321.f756.m1895();
            return new ArrayList();
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ActivityInfo m1425(@NotNull Intent intent) {
        try {
            return m656().mo324(intent);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final void m1456(boolean z) {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    /* renamed from: Ϳ */
    public void mo651(@NotNull IBinder iBinder) {
        AbstractC0069.m649(this, iBinder, C0247.INSTANCE, null, 4, null);
    }
}
