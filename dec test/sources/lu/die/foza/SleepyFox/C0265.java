package lu.die.foza.SleepyFox;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.C0338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaActivityManagerStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaActivityManagerStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaActivityManagerStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1611:1\n1855#2,2:1612\n1855#2,2:1614\n1855#2,2:1616\n*S KotlinDebug\n*F\n+ 1 FozaActivityManagerStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaActivityManagerStore\n*L\n1429#1:1612,2\n1439#1:1614,2\n1442#1:1616,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢢ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢢ.class */
public final class C0265 {

    /* renamed from: Ԩ */
    public static final int f551 = 49;

    /* renamed from: ԫ */
    public static int f554;
    @NotNull

    /* renamed from: Ԭ */
    public static final HashSet<String> f555;
    @NotNull

    /* renamed from: Ϳ */
    public static final C0265 f550 = new C0265();
    @NotNull

    /* renamed from: ԩ */
    public static final ConcurrentHashMap<Integer, C0044> f552 = new ConcurrentHashMap<>(49);
    @NotNull

    /* renamed from: Ԫ */
    public static final ConcurrentHashMap<C0338, C0044> f553 = new ConcurrentHashMap<>(49);

    /* renamed from: lu.die.foza.SleepyFox.ࢢ$Ϳ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢢ$Ϳ.class */
    public static final class C0266 extends Lambda implements Function0<Intent> {

        /* renamed from: Ϳ */
        public final /* synthetic */ boolean f556;

        /* renamed from: Ԩ */
        public final /* synthetic */ Intent f557;

        /* renamed from: ԩ */
        public final /* synthetic */ C0044 f558;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0266(boolean z, Intent intent, C0044 c0044) {
            super(0);
            this.f556 = z;
            this.f557 = intent;
            this.f558 = c0044;
        }

        /* renamed from: invoke */
        public final Intent m1689invoke() {
            if (this.f556) {
                return C0417.m2315(this.f557, this.f558.f838);
            }
            return C0417.m2312(this.f557, this.f558.f838);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢢ$Ԩ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢢ$Ԩ.class */
    public static final class C0267 extends Lambda implements Function1<ResolveInfo, Unit> {

        /* renamed from: Ϳ */
        public final /* synthetic */ C0164<ComponentName> f559;

        /* renamed from: Ԩ */
        public final /* synthetic */ Intent f560;

        /* renamed from: ԩ */
        public final /* synthetic */ String f561;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0267(C0164<ComponentName> c0164, Intent intent, String str) {
            super(1);
            this.f559 = c0164;
            this.f560 = intent;
            this.f561 = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ResolveInfo) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(ResolveInfo resolveInfo) {
            try {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                Objects.toString(activityInfo);
                String str = activityInfo.name;
                String str2 = str;
                if (StringsKt.startsWith$default(str, '.', false, 2, (Object) null)) {
                    str2 = activityInfo.packageName + str2;
                }
                String str3 = activityInfo.packageName;
                if (!this.f559.add(new ComponentName(str3, str2))) {
                    return;
                }
                C0265.f550.m1656(this.f560, str3, str2, activityInfo.processName, this.f561);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢢ$Ԫ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢢ$Ԫ.class */
    public static final class C0268 extends Lambda implements Function1<List<ResolveInfo>, Unit> {

        /* renamed from: Ϳ */
        public final /* synthetic */ C0044 f562;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0268(C0044 c0044) {
            super(1);
            this.f562 = c0044;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(List<ResolveInfo> list) {
            Iterator<ResolveInfo> it = list.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (!activityInfo.exported && !Intrinsics.areEqual(activityInfo.packageName, this.f562.f840)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢢ$Ԭ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢢ$Ԭ.class */
    public static final class C0269 implements IBinder.DeathRecipient {

        /* renamed from: ԭ */
        public final /* synthetic */ IBinder f563;

        /* renamed from: Ԯ */
        public final /* synthetic */ HashSet<IBinder> f564;

        public C0269(IBinder iBinder, HashSet<IBinder> hashSet) {
            this.f563 = iBinder;
            this.f564 = hashSet;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f563.unlinkToDeath(this, 0);
            try {
                this.f564.remove(this.f563);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢢ$Ԯ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢢ$Ԯ.class */
    public static final class C0270 implements IBinder.DeathRecipient {

        /* renamed from: ԭ */
        public final /* synthetic */ IBinder f565;

        /* renamed from: Ԯ */
        public final /* synthetic */ C0044 f566;

        public C0270(IBinder iBinder, C0044 c0044) {
            this.f565 = iBinder;
            this.f566 = c0044;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f565.unlinkToDeath(this, 0);
            C0044 c0044 = this.f566;
            int i = c0044.f838;
            C0265.f550.m1669(c0044);
        }
    }

    /* renamed from: ԩ */
    public final int m1641() {
        for (int i = 1; i < 50; i++) {
            try {
                if (!f552.containsKey(Integer.valueOf(i))) {
                    return i;
                }
            } catch (Exception unused) {
                return 0;
            }
        }
        m1666();
        f552.clear();
        f553.clear();
        return 0;
    }

    static {
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add("com.taobao.taobao");
        spreadBuilder.add("tv.danmaku.bili");
        C0276.f576.getClass();
        spreadBuilder.addSpread(C0276.f586);
        f555 = SetsKt.hashSetOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
    }

    /* renamed from: Ԫ */
    public final void m1666() {
        try {
            Iterator it = new C0164(f552.values()).iterator();
            while (it.hasNext()) {
                C0044 c0044 = (C0044) it.next();
                int i = c0044.f114;
                if (i != 0) {
                    Process.killProcess(i);
                } else {
                    AbstractC0382 abstractC0382 = c0044.f115;
                    if (abstractC0382 != null) {
                        abstractC0382.mo1794();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԫ */
    public final void m1686() {
        if (f554 == 0) {
            C0035.m381(C0035.f103, null, 1, null);
        }
    }

    @NotNull
    /* renamed from: Ԩ */
    public final ArrayList<ActivityManager.RunningAppProcessInfo> m1687(int i) {
        int i2;
        try {
            ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
            for (Map.Entry<Integer, C0044> entry : f552.entrySet()) {
                C0044 value = entry.getValue();
                if (C0338.f809.m2082(value) == i) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    runningAppProcessInfo.processName = value.f841;
                    runningAppProcessInfo.pid = value.f114;
                    String[] strArr = new String[1];
                    strArr[0] = value.f840;
                    runningAppProcessInfo.pkgList = strArr;
                    C0276.f576.getClass();
                    runningAppProcessInfo.uid = C0276.f584;
                    int i3 = value.f122;
                    if (i3 == 0) {
                        i2 = 100;
                    } else if (i3 == 1) {
                        runningAppProcessInfo.importanceReasonCode = 2;
                        i2 = 300;
                    } else if (i3 != 2) {
                        i2 = 400;
                    } else {
                        runningAppProcessInfo.importanceReasonCode = 1;
                        i2 = 230;
                    }
                    runningAppProcessInfo.importance = i2;
                    arrayList.add(runningAppProcessInfo);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList<>(0);
        }
    }

    /* renamed from: Ϳ */
    public final void m1639(C0044 c0044) {
        f552.put(Integer.valueOf(c0044.f838), c0044);
        f553.put(C0338.f809.m2080(c0044), c0044);
    }

    /* renamed from: ԩ */
    public final boolean m1662(int i) {
        return f552.containsKey(Integer.valueOf(i));
    }

    /* renamed from: ԩ */
    public final boolean m1650(String str, String str2) {
        Object systemService = C0276.m1701().getSystemService(C0281.C0283.f620);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.AppTask appTask : ((ActivityManager) systemService).getAppTasks()) {
            Intent intent = appTask.getTaskInfo().baseIntent;
            Intent m2316 = C0417.m2316(intent);
            if (m2316 != null && C0417.f1015.m2329(m2316, str)) {
                String stringExtra = intent.getStringExtra(C0281.C0282.f615);
                if ((stringExtra == null || stringExtra.length() == 0) || Intrinsics.areEqual(stringExtra, str2)) {
                    appTask.moveToFront();
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: ԩ */
    public final Intent m1673(@NotNull Intent intent, @NotNull String str) {
        try {
            C0325 c0325 = C0325.f765;
            List m1939 = C0325.m1939(c0325, intent, (String) null, 0, 4, (Object) null);
            List list = m1939;
            if (m1939 == null || list.isEmpty()) {
                List m1905 = C0323.m1905(C0323.f761, intent, 0, 2, null);
                list = m1905;
                if (m1905 == null || list.isEmpty()) {
                    return intent;
                }
            }
            ActivityInfo activityInfo = ((ResolveInfo) list.get(0)).activityInfo;
            if (!c0325.m1991(activityInfo.packageName)) {
                return intent;
            }
            C0044 m1645 = m1645(activityInfo, str);
            if (m1645 != null) {
                Intent m1680 = f550.m1680(intent, m1645, activityInfo);
                m1680.putExtra(C0281.C0282.f615, m1645.f839);
                return m1680;
            }
            String str2 = activityInfo.packageName;
            C0044 m1642 = m1642(this, str2, activityInfo.processName, str, c0325.m1992(str2), 0, null, 32, null);
            if (m1642 == null) {
                return null;
            }
            m1642.f121.block(C0281.C0289.f680);
            if (!m1642.f120) {
                return null;
            }
            Intent m16802 = m1680(intent, m1642, activityInfo);
            m16802.putExtra(C0281.C0282.f615, m1642.f839);
            return m16802;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final int m1678(@NotNull IBinder iBinder) {
        try {
            for (Map.Entry<Integer, C0044> entry : f552.entrySet()) {
                C0044 value = entry.getValue();
                if (value.f116.contains(iBinder)) {
                    AbstractC0382 abstractC0382 = value.f115;
                    if (abstractC0382 == null) {
                        return -1;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBinder(C0281.C0282.f606, iBinder);
                    Unit unit = Unit.INSTANCE;
                    int mo1796 = abstractC0382.mo1796(1218203648, bundle);
                    if (mo1796 > 0) {
                        value.f116.remove(iBinder);
                    }
                    return mo1796;
                }
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: Ԫ */
    public final void m1667(@NotNull String str, @NotNull String str2) {
        try {
            boolean m1992 = C0325.f765.m1992(str);
            Pair<Intent, ActivityInfo> m712 = C0140.f190.m712(str, m1992);
            if (m712 == null) {
                return;
            }
            m1644((Intent) m712.getFirst(), (ActivityInfo) m712.getSecond(), str2, m1992);
            C0272.f569.m1697(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final int m1670(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable IBinder iBinder, @NotNull String str) {
        if (serviceInfo == null || iBinder == null) {
            return -1;
        }
        try {
            C0044 m1645 = m1645((ComponentInfo) serviceInfo, str);
            C0044 c0044 = m1645;
            if (m1645 == null) {
                C0044 m1672 = m1672(intent, serviceInfo, str, false);
                c0044 = m1672;
                if (m1672 == null) {
                    return -1;
                }
            }
            AbstractC0382 abstractC0382 = c0044.f115;
            if (abstractC0382 == null) {
                Objects.toString(intent);
                iBinder.toString();
                return -1;
            }
            Bundle bundle = new Bundle();
            bundle.putBinder(C0281.C0282.f606, iBinder);
            bundle.putParcelable(C0281.C0282.f604, serviceInfo);
            bundle.putParcelable(C0281.C0282.f595, intent);
            Unit unit = Unit.INSTANCE;
            int mo1796 = abstractC0382.mo1796(1626959230, bundle);
            if (mo1796 > 0) {
                m1653(iBinder, c0044);
            }
            return mo1796;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: Ԩ */
    public final int m1640() {
        int i = f554;
        f554 = 0;
        return i != 0 ? i : m1641();
    }

    /* renamed from: Ϳ */
    public final boolean m1654(ActivityInfo activityInfo, C0355 c0355) {
        if (!Intrinsics.areEqual(activityInfo.packageName, c0355.m2172())) {
            return false;
        }
        return Intrinsics.areEqual(activityInfo.processName, c0355.m2173()) || (activityInfo.flags & 1) != 0;
    }

    /* renamed from: Ԩ */
    public final int m1682(@Nullable Intent intent, @Nullable String str) {
        if (intent == null) {
            return -1;
        }
        try {
            intent.toString();
            String str2 = intent.getPackage();
            ComponentName component = intent.getComponent();
            if (component != null) {
                C0325 c0325 = C0325.f765;
                ActivityInfo m1920 = c0325.m1992(component.getPackageName()) ^ true ? C0323.f761.m1920(component, 0) : c0325.m1987(component, 0);
                Objects.toString(m1920);
                if (m1920 == null) {
                    return 0;
                }
                String str3 = m1920.name;
                String str4 = str3;
                String str5 = m1920.packageName;
                if (StringsKt.startsWith$default(str3, '.', false, 2, (Object) null)) {
                    str4 = m1920.packageName + str4;
                }
                m1656(intent, str5, str4, m1920.processName, str);
                return 0;
            }
            C0267 c0267 = new C0267(new C0164(), intent, str);
            if (str2 != null) {
                C0313.f737.m1866(intent);
                C0325 c03252 = C0325.f765;
                List<ResolveInfo> m1913 = c03252.m1992(str2) ^ true ? C0323.f761.m1913(intent, 131072) : C0325.m1940(c03252, intent, null, 0, 4, null);
                if (m1913 == null || m1913.isEmpty()) {
                    return -1;
                }
                for (Object obj : m1913) {
                    c0267.invoke(obj);
                }
                return 0;
            }
            List<Object> m1940 = C0325.m1940(C0325.f765, intent, null, 0, 4, null);
            if (m1940 != null) {
                for (Object obj2 : m1940) {
                    c0267.invoke(obj2);
                }
            }
            List<ResolveInfo> m19132 = C0323.f761.m1913(intent, 131072);
            if (m19132 == null) {
                return 0;
            }
            for (Object obj3 : m19132) {
                c0267.invoke(obj3);
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: Ԩ */
    public static final void m1659(String str, String str2) {
        int i;
        if (str == null) {
            return;
        }
        try {
            boolean z = !(str2 == null || str2.length() == 0);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, C0044> entry : f552.entrySet()) {
                C0044 value = entry.getValue();
                if (Intrinsics.areEqual(str, value.f840) && (!z || Intrinsics.areEqual(str2, value.f839))) {
                    arrayList.add(value);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0044 c0044 = (C0044) it.next();
                try {
                    i = c0044.f114;
                } catch (Exception unused) {
                    Unit unit = Unit.INSTANCE;
                }
                if (i != 0) {
                    Process.killProcess(i);
                } else {
                    AbstractC0382 abstractC0382 = c0044.f115;
                    if (abstractC0382 != null) {
                        abstractC0382.mo1794();
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (Exception unused2) {
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final C0044 m1665(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, int i, @Nullable Pair<? extends Intent, ? extends ActivityInfo> pair) {
        try {
            C0325.f765.m1999(str, str3);
            C0044 c0044 = new C0044(str, str2, str3, m1640(), z);
            c0044.f122 = i;
            c0044.f119 = pair;
            m1639(c0044);
            C0035.f103.m391(c0044);
            return c0044;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ C0044 m1642(C0265 c0265, String str, String str2, String str3, boolean z, int i, Pair pair, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            pair = null;
        }
        return c0265.m1665(str, str2, str3, z, i, pair);
    }

    /* renamed from: Ϳ */
    public final void m1668(@NotNull Intent intent, @NotNull String str) {
        ActivityInfo m1986;
        try {
            ComponentName component = intent.getComponent();
            if (component == null) {
                ActivityInfo m2004 = C0325.f765.m2004(intent);
                m1986 = m2004;
                if (m2004 != null) {
                    intent.setComponent(new ComponentName(m1986.packageName, m1986.name));
                } else {
                    m1986 = null;
                }
            } else {
                C0325 c0325 = C0325.f765;
                m1986 = c0325.m1992(component.getPackageName()) ? c0325.m1986(component, 0) : C0323.m1908(C0323.f761, component, 0, 2, (Object) null);
            }
            if (m1986 == null) {
                return;
            }
            intent.addFlags(268435456);
            C0044 m1645 = m1645(m1986, str);
            if (m1645 != null) {
                C0034.f102.m379(intent, m1986, m1645);
            } else {
                m1644(intent, m1986, str, C0325.f765.m1992(m1986.packageName));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final int m1664() {
        int i = f554;
        int i2 = i;
        if (i == 0) {
            int m1641 = m1641();
            i2 = m1641;
            f554 = m1641;
        }
        return i2;
    }

    @NotNull
    /* renamed from: Ϳ */
    public final Intent m1680(@NotNull Intent intent, @NotNull C0044 c0044, @NotNull ActivityInfo activityInfo) {
        Object invoke;
        Intent intent2;
        int i;
        int i2;
        Intent m2313;
        Intent intent3;
        int i3;
        int i4;
        try {
            boolean m2309 = C0417.m2309(activityInfo);
            C0266 c0266 = new C0266(m2309, intent, c0044);
            C0276.f576.getClass();
            if (ArraysKt.contains(C0276.f586, activityInfo.packageName) && activityInfo.launchMode == 0) {
                activityInfo.launchMode = 1;
            }
            switch (activityInfo.launchMode) {
                case 1:
                    int hashCode = activityInfo.name.hashCode();
                    int[] iArr = c0044.f117;
                    int m410 = c0044.m410(hashCode, iArr);
                    if (m410 == -1) {
                        int m411 = c0044.m411(iArr);
                        if (m411 != -1) {
                            intent2 = intent;
                            iArr[m411] = hashCode;
                            i = c0044.f838;
                            i2 = m411 + 1;
                        } else {
                            invoke = c0266.invoke();
                            m2313 = (Intent) invoke;
                            break;
                        }
                    } else {
                        intent2 = intent;
                        i = c0044.f838;
                        i2 = m410 + 1;
                    }
                    m2313 = C0417.m2313(intent2, i, i2, m2309);
                    break;
                case 2:
                case 3:
                case 4:
                    int hashCode2 = activityInfo.name.hashCode();
                    int[] iArr2 = c0044.f118;
                    int m4102 = c0044.m410(hashCode2, iArr2);
                    if (m4102 == -1) {
                        int m4112 = c0044.m411(iArr2);
                        if (m4112 != -1) {
                            intent3 = intent;
                            iArr2[m4112] = hashCode2;
                            i3 = c0044.f838;
                            i4 = m4112 + 1;
                        } else {
                            invoke = c0266.invoke();
                            m2313 = (Intent) invoke;
                            break;
                        }
                    } else {
                        intent3 = intent;
                        i3 = c0044.f838;
                        i4 = m4102 + 1;
                    }
                    m2313 = C0417.m2314(intent3, i3, i4, m2309);
                    break;
                default:
                    invoke = c0266.invoke();
                    m2313 = (Intent) invoke;
                    break;
            }
            Intent intent4 = m2313;
            C0417 c0417 = C0417.f1015;
            Intent m2323 = c0417.m2323(intent, intent4);
            if (f555.contains(activityInfo.packageName)) {
                c0417.m2326(134217728, m2323);
            }
            return m2323;
        } catch (Exception unused) {
            return intent;
        }
    }

    /* renamed from: Ԩ */
    public static final void m1658(String str, String str2, boolean z, ActivityInfo activityInfo, C0044 c0044) {
        if (!z) {
            try {
                if (f550.m1650(str, str2)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (activityInfo == null) {
            ActivityInfo m711 = C0140.f190.m711(str, C0325.f765.m1992(str));
            activityInfo = m711;
            if (m711 == null) {
                return;
            }
        }
        if (c0044 == null) {
            c0044 = f550.m1645(activityInfo, str2);
        }
        if (c0044 != null) {
            f550.m1651(str, c0044, activityInfo);
        }
    }

    /* renamed from: Ԩ */
    public final void m1669(@NotNull C0044 c0044) {
        try {
            c0044.f120 = false;
            c0044.f121.open();
            ConcurrentHashMap<Integer, C0044> concurrentHashMap = f552;
            concurrentHashMap.remove(Integer.valueOf(c0044.f838));
            f553.remove(C0338.f809.m2080(c0044));
            if (!concurrentHashMap.isEmpty()) {
                return;
            }
            C0272.f569.m1696();
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԩ */
    public final Intent m1648(Intent intent, C0044 c0044, ActivityInfo activityInfo) {
        return m1680(intent, c0044, activityInfo);
    }

    /* renamed from: Ϳ */
    public final C0044 m1645(ComponentInfo componentInfo, String str) {
        try {
            ConcurrentHashMap<C0338, C0044> concurrentHashMap = f553;
            C0338.C0339 c0339 = C0338.f809;
            String str2 = componentInfo.packageName;
            String str3 = componentInfo.processName;
            c0339.getClass();
            return concurrentHashMap.get(new C0338(str2, str3, str));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final String m1683(int i) {
        try {
            for (Map.Entry<Integer, C0044> entry : f552.entrySet()) {
                C0044 value = entry.getValue();
                if (value.f114 == i) {
                    return value.f840;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final int m1677(@NotNull ProviderInfo providerInfo, @NotNull String str) {
        try {
            C0044 m1645 = m1645((ComponentInfo) providerInfo, str);
            if (m1645 != null) {
                return m1645.f838;
            }
            String str2 = providerInfo.packageName;
            C0044 m1642 = m1642(this, str2, providerInfo.processName, str, C0325.f765.m1992(str2), 2, null, 32, null);
            if (m1642 == null) {
                return -1;
            }
            m1642.f121.block(C0281.C0289.f680);
            if (!m1642.f120) {
                return -1;
            }
            AbstractC0382 abstractC0382 = m1642.f115;
            if (abstractC0382 != null) {
                return abstractC0382.mo1796(-987494927, null);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ int m1657(C0265 c0265, Intent intent, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c0265.m1682(intent, str);
    }

    /* renamed from: Ϳ */
    public final void m1656(Intent intent, String str, String str2, String str3, String str4) {
        if (str4 != null) {
            try {
                ConcurrentHashMap<C0338, C0044> concurrentHashMap = f553;
                C0338.f809.getClass();
                C0044 c0044 = concurrentHashMap.get(new C0338(str, str3, str4));
                if (c0044 != null) {
                    m1655(str2, intent, c0044);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        for (Map.Entry<Integer, C0044> entry : f552.entrySet()) {
            C0044 value = entry.getValue();
            if (Intrinsics.areEqual(value.f840, str) && Intrinsics.areEqual(str3, value.f841)) {
                m1655(str2, intent, value);
            }
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final C0044 m1688(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        try {
            ConcurrentHashMap<C0338, C0044> concurrentHashMap = f553;
            C0338.f809.getClass();
            return concurrentHashMap.get(new C0338(str, str2, str3));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final boolean m1674(@NotNull String str, @NotNull String str2, int i) {
        try {
            boolean m1992 = C0325.f765.m1992(str);
            ActivityInfo m711 = C0140.f190.m711(str, m1992);
            if (m711 == null) {
                return false;
            }
            C0044 m1645 = m1645(m711, str2);
            boolean z = m1645 != null;
            if (i != 0) {
                boolean z2 = z;
                C0272.f569.m1697(str);
                if (z2) {
                    m1675(str, str2, false, m711, m1645);
                } else if (i == 1) {
                    String str3 = m711.processName;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = str;
                    }
                    m1642(this, str, str4, str2, m1992, 0, null, 32, null);
                } else if (i == 2) {
                    m1644(C0417.f1015.m2328(str, m711.name), m711, str2, m1992);
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: Ϳ */
    public final void m1676(@Nullable String str, @Nullable String str2) {
        C0276.f576.m1722(() -> {
            m1659(r1, r2);
        });
    }

    /* renamed from: Ϳ */
    public final void m1675(@NotNull String str, @NotNull String str2, boolean z, @Nullable ActivityInfo activityInfo, @Nullable C0044 c0044) {
        C0276.f576.m1722(() -> {
            m1658(r1, r2, r3, r4, r5);
        });
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ void m1652(C0265 c0265, String str, String str2, boolean z, ActivityInfo activityInfo, C0044 c0044, int i, Object obj) {
        if ((i & 8) != 0) {
            activityInfo = null;
        }
        if ((i & 16) != 0) {
            c0044 = null;
        }
        c0265.m1675(str, str2, z, activityInfo, c0044);
    }

    /* renamed from: Ϳ */
    public final void m1651(String str, C0044 c0044, ActivityInfo activityInfo) {
        Intent m2328 = C0417.f1015.m2328(str, activityInfo.name);
        c0044.f121.block(C0281.C0289.f680);
        if (!c0044.f120) {
            return;
        }
        C0034.f102.m379(m2328, activityInfo, c0044);
    }

    /* renamed from: Ϳ */
    public final void m1646(C0044 c0044, Intent intent, ServiceInfo serviceInfo) {
        if (intent == null) {
            return;
        }
        try {
            AbstractC0382 abstractC0382 = c0044.f115;
            if (abstractC0382 == null) {
                intent.toString();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C0281.C0282.f595, intent);
            bundle.putParcelable(C0281.C0282.f604, serviceInfo);
            Unit unit = Unit.INSTANCE;
            abstractC0382.mo1796(1984153269, bundle);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final void m1684(int i, int i2) {
        try {
            C0044 c0044 = f552.get(Integer.valueOf(i));
            if (c0044 == null) {
                return;
            }
            int m410 = c0044.m410(i2, c0044.f117);
            if (m410 != -1) {
                c0044.f117[m410] = 0;
                return;
            }
            int m4102 = c0044.m410(i2, c0044.f118);
            if (m4102 == -1) {
                return;
            }
            c0044.f118[m4102] = 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final Intent m1649(Intent intent, ActivityInfo activityInfo, C0355 c0355) {
        ComponentName component;
        try {
            component = intent.getComponent();
        } catch (Exception unused) {
        }
        if (component == null) {
            return intent;
        }
        String packageName = component.getPackageName();
        if (!Intrinsics.areEqual(c0355.m2172(), packageName) && !C0325.f765.m1991(packageName)) {
            return intent;
        }
        String m2171 = Intrinsics.areEqual(packageName, c0355.m2172()) ? c0355.m2171() : C0325.f765.m2011(packageName, c0355.m2171());
        try {
            C0044 m1645 = m1645(activityInfo, m2171);
            if (m1645 != null) {
                Intent m1680 = f550.m1680(intent, m1645, activityInfo);
                m1680.putExtra(C0281.C0282.f615, m1645.f839);
                return m1680;
            }
        } catch (Exception unused2) {
        }
        C0044 m1642 = m1642(this, packageName, activityInfo.processName, m2171, C0325.f765.m1992(packageName), 0, null, 32, null);
        if (m1642 != null) {
            m1642.f121.block(C0281.C0289.f680);
            if (!m1642.f120) {
                return intent;
            }
            Intent m16802 = m1680(intent, m1642, activityInfo);
            m16802.putExtra(C0281.C0282.f615, m1642.f839);
            return m16802;
        }
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e7, code lost:
        if (r0 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0167, code lost:
        if (r18.isEmpty() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, ((android.content.pm.ResolveInfo) r19.get(0)).activityInfo.packageName) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016a, code lost:
        r17 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: Ϳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent m1681(@org.jetbrains.annotations.NotNull android.content.Intent r12, int r13) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0265.m1681(android.content.Intent, int):android.content.Intent");
    }

    /* renamed from: Ϳ */
    public final void m1663(@Nullable C0355 c0355, @Nullable AbstractC0382 abstractC0382) {
    }

    /* renamed from: Ϳ */
    public final void m1653(IBinder iBinder, C0044 c0044) {
        try {
            C0044 c00442 = f552.get(Integer.valueOf(c0044.f838));
            if (c00442 == null) {
                return;
            }
            HashSet<IBinder> hashSet = c00442.f116;
            if (hashSet == null) {
                return;
            }
            hashSet.add(iBinder);
            iBinder.linkToDeath(new C0269(iBinder, hashSet), 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final void m1679(@NotNull AbstractC0382 abstractC0382, int i, @NotNull C0044 c0044) {
        IBinder asBinder = abstractC0382.asBinder();
        asBinder.linkToDeath(new C0270(asBinder, c0044), 0);
        c0044.f114 = i;
        c0044.f115 = abstractC0382;
        C0034.f102.m380(c0044, abstractC0382);
    }

    /* renamed from: Ϳ */
    public final void m1685(int i, int i2, @Nullable Notification notification, int i3) {
        try {
            C0044 c0044 = f552.get(Integer.valueOf(i3));
            if (c0044 == null) {
                return;
            }
            if (i == 0) {
                AbstractC0382 abstractC0382 = c0044.f115;
                if (abstractC0382 != null) {
                    abstractC0382.mo1796(-1383862804, null);
                }
            } else {
                C0035.f103.m393(c0044, i2, notification);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final C0044 m1644(Intent intent, ActivityInfo activityInfo, String str, boolean z) {
        return m1665(activityInfo.packageName, activityInfo.processName, str, z, 0, new Pair<>(intent, activityInfo));
    }

    /* renamed from: Ϳ */
    public final C0044 m1643(ServiceInfo serviceInfo, String str) {
        String str2 = serviceInfo.packageName;
        return m1642(this, str2, serviceInfo.processName, str, C0325.f765.m1992(str2), 1, null, 32, null);
    }

    @Nullable
    /* renamed from: Ϳ */
    public final C0044 m1672(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @NotNull String str, boolean z) {
        if (serviceInfo == null) {
            return null;
        }
        try {
            C0044 m1645 = m1645((ComponentInfo) serviceInfo, str);
            if (m1645 != null) {
                if (z) {
                    f550.m1646(m1645, intent, serviceInfo);
                }
                return m1645;
            }
            C0044 m1643 = m1643(serviceInfo, str);
            if (m1643 == null) {
                return null;
            }
            m1643.f121.block(C0281.C0289.f682);
            if (!m1643.f120) {
                return null;
            }
            if (z) {
                m1646(m1643, intent, serviceInfo);
            }
            return m1643;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ C0044 m1647(C0265 c0265, Intent intent, ServiceInfo serviceInfo, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c0265.m1672(intent, serviceInfo, str, z);
    }

    /* renamed from: Ϳ */
    public final int m1671(@NotNull Intent intent, @NotNull ServiceInfo serviceInfo, @NotNull String str) {
        try {
            C0044 m1645 = m1645((ComponentInfo) serviceInfo, str);
            if (m1645 == null) {
                return -1;
            }
            AbstractC0382 abstractC0382 = m1645.f115;
            if (abstractC0382 == null) {
                return -1;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C0281.C0282.f595, intent);
            bundle.putParcelable(C0281.C0282.f604, serviceInfo);
            Unit unit = Unit.INSTANCE;
            return abstractC0382.mo1796(35172636, bundle);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: Ϳ */
    public final void m1655(String str, Intent intent, C0044 c0044) {
        AbstractC0382 abstractC0382 = c0044.f115;
        if (abstractC0382 != null) {
            Bundle bundle = new Bundle();
            bundle.putString(C0281.C0282.f594, str);
            bundle.putParcelable(C0281.C0282.f611, intent);
            Unit unit = Unit.INSTANCE;
            abstractC0382.mo1796(1518714126, bundle);
        }
    }
}
