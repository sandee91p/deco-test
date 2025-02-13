package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.IPackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.permission.PermissionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0202;
import lu.die.foza.SleepyFox.C0248;
import lu.die.foza.SleepyFox.C0301;
/* renamed from: lu.die.foza.SleepyFox.ၿ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ.class */
public final class C0478 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ၿ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$Ϳ.class */
    public static final class C0479 extends C0301 {
        public C0479() {
        }

        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0478.this.m2441(c0253.f519);
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$Ԩ.class */
    public static final class C0480 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0276.f576.getClass();
            if (C0276.f578) {
                C0245.f512.getClass();
                return Integer.valueOf(C0245.f513.m1450((ComponentName) C0153.f201.m726(c0253.f519, ComponentName.class)));
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$Ԫ.class */
    public static final class C0481 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object obj = c0253.f519[0];
                if (obj instanceof String) {
                    C0245.f512.getClass();
                    if (C0245.f513.m1446((String) obj)) {
                        return 23;
                    }
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$Ԭ.class */
    public static final class C0482 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0276.f576.getClass();
            if (C0276.f578) {
                Object[] objArr = c0253.f519;
                if (objArr.length > 1) {
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    if ((obj instanceof ComponentName) && (obj2 instanceof Integer)) {
                        C0245.f512.getClass();
                        C0245.f513.m1449((ComponentName) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }
                }
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$Ԯ.class */
    public static final class C0483 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                String valueOf = String.valueOf(objArr[0]);
                C0245.f512.getClass();
                if (C0245.f513.m1446(valueOf)) {
                    objArr[0] = m1135();
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ՠ.class */
    public static final class C0484 extends AbstractC0194 {
        @Override // lu.die.foza.SleepyFox.AbstractC0194
        /* renamed from: Ϳ */
        public ComponentInfo mo1131(ComponentName componentName, int i) {
            C0245.f512.getClass();
            return C0245.f513.m1435(componentName, i);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ֈ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ֈ.class */
    public static final class C0485 extends AbstractC0194 {
        @Override // lu.die.foza.SleepyFox.AbstractC0194
        /* renamed from: Ϳ */
        public ComponentInfo mo1131(ComponentName componentName, int i) {
            C0245.f512.getClass();
            return C0245.f513.m1434(componentName, i);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$֏  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$֏.class */
    public static final class C0486 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object obj;
            if (m1140()) {
                Object m2447 = m2447(c0253);
                obj = m2447;
                if (m2447 == null) {
                    obj = m2446(c0253);
                }
            } else {
                Object m2446 = m2446(c0253);
                obj = m2446;
                if (m2446 == null) {
                    obj = m2447(c0253);
                }
            }
            return obj;
        }

        /* renamed from: ԩ  reason: contains not printable characters */
        public final Object m2446(C0253 c0253) {
            Object obj;
            C0153.f201.m728(c0253.f519, 1);
            try {
                obj = c0253.m1485();
            } catch (Exception unused) {
                obj = null;
            }
            return obj;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Object m2447(C0253 c0253) {
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            if (obj == null) {
                return null;
            }
            Object obj2 = objArr[1];
            C0245.f512.getClass();
            return C0245.f513.m1443(obj.toString(), obj2 instanceof Number ? ((Number) obj2).intValue() : 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ׯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ׯ.class */
    public static final class C0487 extends AbstractC0194 {
        @Override // lu.die.foza.SleepyFox.AbstractC0194
        /* renamed from: Ϳ */
        public ComponentInfo mo1131(ComponentName componentName, int i) {
            C0245.f512.getClass();
            return C0245.f513.m1432(componentName, i);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ؠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ؠ.class */
    public static final class C0488 extends AbstractC0194 {
        @Override // lu.die.foza.SleepyFox.AbstractC0194
        /* renamed from: Ϳ */
        public ComponentInfo mo1131(ComponentName componentName, int i) {
            C0245.f512.getClass();
            return C0245.f513.m1431(componentName, i);
        }
    }

    @SourceDebugExtension({"SMAP\nPackageManagerServiceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageManagerServiceObserver.kt\nlu/die/foza/HookEntity/ServiceHookDefs/PackageManagerServiceObserver$observeInternal$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n1855#2,2:665\n*S KotlinDebug\n*F\n+ 1 PackageManagerServiceObserver.kt\nlu/die/foza/HookEntity/ServiceHookDefs/PackageManagerServiceObserver$observeInternal$6\n*L\n232#1:665,2\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ၿ$ހ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ހ.class */
    public static final class C0489 extends C0202 {

        /* renamed from: Ԫ  reason: contains not printable characters */
        public final List<PackageInfo> f1085 = CollectionsKt.emptyList();

        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object m1485 = c0253.m1485();
            if (m1485 != null) {
                try {
                    C0245.f512.getClass();
                    List<PackageInfo> m1424 = C0245.f513.m1424(this.f1085, 0);
                    List<?> m2455 = C0495.f1089.m2455(m1485);
                    List<?> list = m2455;
                    if (!(m2455 instanceof List)) {
                        list = null;
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList(list);
                    if (m1424 != null) {
                        for (PackageInfo packageInfo : m1424) {
                            arrayList.add(packageInfo.applicationInfo);
                        }
                    }
                    C0248.C0249 c0249 = C0248.f515;
                    c0249.getClass();
                    C0248.f516.getClass();
                    c0249.getClass();
                    C0248 c0248 = C0248.f516;
                    if (m1424 != null) {
                        m1424.size();
                    }
                    c0248.getClass();
                    return C0495.f1089.m2457(arrayList, c0253.f518);
                } catch (Exception unused) {
                }
            }
            return m1485;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ށ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ށ.class */
    public static final class C0490 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object m1485 = c0253.m1485();
            if (m1485 != null) {
                try {
                    C0245.f512.getClass();
                    C0245 c0245 = C0245.f513;
                    C0495 c0495 = C0495.f1089;
                    List<?> m2455 = c0495.m2455(m1485);
                    List<? extends PackageInfo> list = m2455;
                    if (!(m2455 instanceof List)) {
                        list = null;
                    }
                    Number number = (Number) C0153.f201.m726(c0253.f519, Number.class);
                    List<PackageInfo> m1424 = c0245.m1424(list, number != null ? number.intValue() : 0);
                    C0248.C0249 c0249 = C0248.f515;
                    c0249.getClass();
                    C0248.f516.getClass();
                    c0249.getClass();
                    C0248 c0248 = C0248.f516;
                    if (m1424 != null) {
                        m1424.size();
                    }
                    c0248.getClass();
                    return c0495.m2457(m1424, c0253.f518);
                } catch (Exception unused) {
                }
            }
            return m1485;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ނ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ނ.class */
    public static final class C0491 extends C0202 {
        public C0491() {
        }

        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                String valueOf = String.valueOf(objArr[0]);
                if (!Intrinsics.areEqual(valueOf, m1135())) {
                    if (!m1140() && m1139(valueOf)) {
                        C0478.this.m2441(objArr);
                        C0153.f201.m728(objArr, 1);
                        Object m1485 = c0253.m1485();
                        PackageInfo packageInfo = m1485;
                        if (m1485 instanceof PackageInfo) {
                            packageInfo = C0448.f1055.m2366((PackageInfo) packageInfo);
                        }
                        return packageInfo;
                    }
                    Object obj = objArr[1];
                    C0245.f512.getClass();
                    PackageInfo m1430 = C0245.f513.m1430(valueOf, obj instanceof Number ? ((Number) obj).intValue() : 0);
                    PackageInfo packageInfo2 = m1430;
                    if (m1430 != null) {
                        if (m1139(valueOf)) {
                            packageInfo2 = C0448.f1055.m2366(packageInfo2);
                        }
                        return packageInfo2;
                    } else if (!C0309.f727.m1847(valueOf)) {
                        return null;
                    }
                }
                C0478.this.m2441(objArr);
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၿ$ރ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၿ$ރ.class */
    public static final class C0492 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                String valueOf = String.valueOf(objArr[0]);
                if (!Intrinsics.areEqual(valueOf, m1135())) {
                    if (!m1140() && m1139(valueOf)) {
                        C0153.f201.m728(objArr, 1);
                        Object m1485 = c0253.m1485();
                        ApplicationInfo applicationInfo = m1485;
                        if (m1485 instanceof ApplicationInfo) {
                            applicationInfo = C0448.f1055.m2367((ApplicationInfo) applicationInfo);
                        }
                        return applicationInfo;
                    }
                    Object obj = objArr[1];
                    C0245.f512.getClass();
                    ApplicationInfo m1433 = C0245.f513.m1433(valueOf, obj instanceof Number ? ((Number) obj).intValue() : 0);
                    ApplicationInfo applicationInfo2 = m1433;
                    if (m1433 != null) {
                        if (m1139(valueOf)) {
                            applicationInfo2 = C0448.f1055.m2367(applicationInfo2);
                        }
                        return applicationInfo2;
                    } else if (!C0309.f727.m1847(valueOf)) {
                        return null;
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
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
        m2442();
        if (C0175.f270) {
            m2444();
        }
        if (C0175.f267) {
            m2445();
        }
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public final void m2442() {
        try {
            C0277.f587.getClass();
            this.f168 = C0277.f588;
            C0323.f761.getClass();
            PackageManager packageManager = C0323.f762;
            IPackageManager packageManager2 = ActivityThread.getPackageManager();
            Intrinsics.checkNotNull(packageManager2);
            C0033 m646 = m646("package", (IInterface) packageManager2);
            if (m646 == null) {
                return;
            }
            Object obj = m646.f100;
            C0047 c0047 = C0047.f129;
            BinderC0293.f705.getClass();
            c0047.m464(BinderC0293.f707, "sPackageManager", obj);
            m2443(obj);
            m646.m374("getReceiverInfo", new C0484());
            m646.m374("getProviderInfo", new C0485());
            m646.m374("resolveContentProvider", new C0486());
            m646.m374("getActivityInfo", new C0487());
            m646.m374("getServiceInfo", new C0488());
            m646.m374("getInstalledApplications", new C0489());
            m646.m374("getInstalledPackages", new C0490());
            m646.m374("getPackageInfo", new C0491());
            m646.m374("getApplicationInfo", new C0492());
            m646.m374("getSharedLibraries", new C0479());
            m646.m374("getComponentEnabledSetting", new C0480());
            C0202.C0203 c0203 = C0202.f299;
            Boolean bool = Boolean.TRUE;
            c0203.getClass();
            C0167 c0167 = new C0167(bool);
            m646.m374("canRequestPackageInstalls", c0167);
            C0481 c0481 = new C0481();
            String[] strArr = new String[1];
            strArr[0] = "getTargetSdkVersion";
            m646.m377(c0481, strArr);
            C0301.C0302 c0302 = C0301.f718;
            c0302.getClass();
            C0301 c0301 = C0301.f719;
            String[] strArr2 = new String[8];
            strArr2[0] = "setLastChosenActivity";
            strArr2[1] = "setPackageStoppedState";
            strArr2[2] = "addOnPermissionsChangeListener";
            strArr2[3] = "removeOnPermissionsChangeListener";
            strArr2[4] = "shouldShowRequestPermissionRationale";
            strArr2[5] = "notifyDexLoad";
            strArr2[6] = "notifyPackageUse";
            strArr2[7] = "setApplicationEnabledSetting";
            m646.m377(c0301, strArr2);
            if (C0175.f264) {
                c0302.getClass();
                m646.m374("hasSigningCertificate", C0301.f719);
            }
            if (C0175.f272) {
                c0302.getClass();
                C0301 c03012 = C0301.f719;
                String[] strArr3 = new String[2];
                strArr3[0] = "setSplashScreenTheme";
                strArr3[1] = "getSplashScreenTheme";
                m646.m377(c03012, strArr3);
            }
            if (C0175.f273) {
                m646.m374("canPackageQuery", c0167);
            }
            c0203.getClass();
            C0167 c01672 = new C0167(0);
            String[] strArr4 = new String[2];
            strArr4[0] = "checkSignatures";
            strArr4[1] = "checkUidSignatures";
            m646.m377(c01672, strArr4);
            c0203.getClass();
            m646.m374("getApplicationEnabledSetting", new C0167(1));
            m646.m374("setComponentEnabledSetting", new C0482());
            C0348.f823.getClass();
            C0348 c0348 = C0348.f824;
            c0348.getClass();
            m646.m374("checkPermission", c0348);
            C0421.f1030.getClass();
            C0421.f1031.m2345(m646);
            C0143.f191.getClass();
            C0143.f192.m715(m646);
            if (!C0175.f270) {
                return;
            }
            c0302.getClass();
            m646.m374("setMimeGroup", C0301.f719);
            m646.m374("getInstallSourceInfo", new C0483());
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final void m2444() {
        C0343 c0343 = new C0343("mCache");
        try {
            Object m455 = C0047.m455(PackageManager.class.getName(), "sPackageInfoCache");
            Intrinsics.checkNotNull(m455);
            Object m2103 = c0343.m2103(m455);
            Intrinsics.checkNotNull(m2103);
            ((Map) m2103).clear();
            Object m4552 = C0047.m455(PackageManager.class.getName(), "sApplicationInfoCache");
            Intrinsics.checkNotNull(m4552);
            Object m21032 = c0343.m2103(m4552);
            Intrinsics.checkNotNull(m21032);
            ((Map) m21032).clear();
        } catch (Exception unused) {
        }
        try {
            Object m4553 = C0047.m455(PermissionManager.class.getName(), "sPackageNamePermissionCache");
            Intrinsics.checkNotNull(m4553);
            Object m21033 = c0343.m2103(m4553);
            Intrinsics.checkNotNull(m21033);
            ((Map) m21033).clear();
            Object m4554 = C0047.m455(PermissionManager.class.getName(), "sPermissionCache");
            Intrinsics.checkNotNull(m4554);
            Object m21034 = c0343.m2103(m4554);
            Intrinsics.checkNotNull(m21034);
            ((Map) m21034).clear();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final void m2445() {
        C0047 c0047;
        String str;
        String str2;
        C0047 c00472;
        String str3;
        try {
            boolean z = C0175.f266;
            if (!z || !C0175.f272) {
                c0047 = C0047.f129;
                str = "huawei.android.app.HwApiCacheMangerEx";
                str2 = "getDefault";
            } else {
                c0047 = C0047.f129;
                str = "hihonor.android.app.HwApiCacheMangerEx";
                str2 = "getDefault";
            }
            Object m470 = c0047.m470(str, str2);
            if (m470 == null) {
                return;
            }
            C0047 c00473 = C0047.f129;
            c00473.m464(m470, "mPkg", (Object) null);
            Boolean bool = Boolean.FALSE;
            c00473.m464(m470, "bCanCache", bool);
            if (!C0175.f270) {
                c00472 = c00473;
                str3 = "sUseCache";
            } else if (!z || !C0175.f272) {
                return;
            } else {
                c00472 = c00473;
                str3 = "USE_CACHE";
            }
            c00472.m464(m470, str3, bool);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2443(Object obj) {
        try {
            C0047 c0047 = C0047.f129;
            BinderC0293.f705.getClass();
            Object m465 = c0047.m465(BinderC0293.f707, "mSystemContext");
            if (m465 == null) {
                return;
            }
            Object m4652 = c0047.m465(m465, "mPackageManager");
            if (m4652 == null) {
                return;
            }
            if (obj != null) {
                c0047.m464(m4652, "mPM", obj);
            } else {
                c0047.m464(m465, "mPackageManager", (Object) null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2441(Object[] objArr) {
        try {
            int m722 = C0153.f201.m722(objArr, Number.class);
            if (m722 >= 0) {
                Object obj = objArr[m722];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Number");
                Number number = (Number) obj;
                if ((number.longValue() & 4194304) != 0) {
                    if (number instanceof Long) {
                        objArr[m722] = Long.valueOf(number.longValue() & (-4194305));
                    } else {
                        objArr[m722] = Integer.valueOf(number.intValue() & (-4194305));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
