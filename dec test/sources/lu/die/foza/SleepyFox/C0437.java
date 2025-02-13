package lu.die.foza.SleepyFox;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.IncrementalStatesInfo;
import android.content.pm.LauncherActivityInfoInternal;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0202;
import lu.die.foza.SleepyFox.C0245;
/* renamed from: lu.die.foza.SleepyFox.ၝ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ.class */
public final class C0437 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ၝ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$Ϳ.class */
    public static final class C0438 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                ComponentName componentName = (ComponentName) C0153.f201.m726(c0253.f519, ComponentName.class);
                if (componentName != null) {
                    C0245.C0246 c0246 = C0245.f512;
                    c0246.getClass();
                    if (C0245.f513.m1446(componentName.getPackageName())) {
                        c0246.getClass();
                        return C0245.m1416(C0245.f513, componentName, 0, 2, null);
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$Ԩ.class */
    public static final class C0439 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, ComponentName.class);
                if (m722 >= 0) {
                    Object obj = objArr[m722];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.ComponentName");
                    ComponentName componentName = (ComponentName) obj;
                    objArr[m722] = new ComponentName(m1135(), componentName.getClassName());
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$Ԫ.class */
    public static final class C0440 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                boolean z = C0175.f262;
                String valueOf = String.valueOf(z ? objArr[1] : objArr[0]);
                C0245.C0246 c0246 = C0245.f512;
                c0246.getClass();
                if (C0245.f513.m1446(valueOf)) {
                    c0246.getClass();
                    C0245 c0245 = C0245.f513;
                    Object obj = z ? objArr[2] : objArr[1];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    return c0245.m1433(valueOf, ((Integer) obj).intValue());
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$Ԭ.class */
    public static final class C0441 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                ComponentName componentName = (ComponentName) c0253.f519[(C0175.f262 ? 1 : null) == 1 ? 1 : 0];
                if (componentName != null) {
                    C0245.C0246 c0246 = C0245.f512;
                    c0246.getClass();
                    if (C0245.f513.m1446(componentName.getPackageName())) {
                        c0246.getClass();
                        return Boolean.valueOf(C0245.m1416(C0245.f513, componentName, 0, 2, null) != null);
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$Ԯ.class */
    public static final class C0442 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                String valueOf = String.valueOf(c0253.f519[(C0175.f262 ? 1 : null) == 1 ? 1 : 0]);
                C0245.C0246 c0246 = C0245.f512;
                c0246.getClass();
                if (C0245.f513.m1446(valueOf)) {
                    c0246.getClass();
                    return Boolean.valueOf(C0245.f513.m1430(valueOf, C0175.f261 ? 786432 : 0) != null);
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$ՠ.class */
    public static final class C0443 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                ComponentName componentName = (ComponentName) C0153.f201.m726(c0253.f519, ComponentName.class);
                if (componentName != null) {
                    C0245.f512.getClass();
                    if (C0245.f513.m1444(componentName.getPackageName())) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.addFlags(270532608);
                        intent.setComponent(componentName);
                        C0276.m1701().startActivity(intent);
                        return null;
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$ֈ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$ֈ.class */
    public static final class C0444 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                ComponentName componentName = (ComponentName) C0153.f201.m726(c0253.f519, ComponentName.class);
                if (componentName != null) {
                    C0245.f512.getClass();
                    if (C0245.f513.m1444(componentName.getPackageName())) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.addFlags(270532608);
                        intent.setComponent(componentName);
                        return PendingIntent.getActivity(C0276.m1701(), 0, intent, 33554432);
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$֏  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$֏.class */
    public static final class C0445 extends C0202 {

        /* renamed from: Ԫ  reason: contains not printable characters */
        public final /* synthetic */ IncrementalStatesInfo f1053;

        public C0445(IncrementalStatesInfo incrementalStatesInfo) {
            this.f1053 = incrementalStatesInfo;
        }

        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            String obj;
            ArrayList arrayList;
            try {
                Object obj2 = c0253.f519[1];
                obj = obj2 != null ? obj2.toString() : null;
            } catch (Exception unused) {
            }
            if (obj == null) {
                Object m1485 = c0253.m1485();
                List<?> m2455 = C0495.f1089.m2455(m1485);
                ArrayList arrayList2 = m2455;
                if (m2455 == null) {
                    arrayList2 = arrayList;
                    arrayList = new ArrayList();
                }
                C0245.f512.getClass();
                List<ResolveInfo> m1418 = C0245.m1418(C0245.f513, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), (String) null, 0, 6, (Object) null);
                if (m1418 == null || m1418.isEmpty()) {
                    return m1485;
                }
                ArrayList arrayList3 = new ArrayList(m1418.size() + arrayList2.size());
                for (ResolveInfo resolveInfo : m1418) {
                    arrayList3.add(new LauncherActivityInfoInternal(resolveInfo.activityInfo, this.f1053));
                }
                arrayList3.addAll(arrayList2);
                return C0495.f1089.m2458((List<?>) arrayList3);
            }
            C0245.C0246 c0246 = C0245.f512;
            c0246.getClass();
            if (C0245.f513.m1446(obj)) {
                c0246.getClass();
                List<ResolveInfo> m14182 = C0245.m1418(C0245.f513, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(obj), (String) null, 0, 6, (Object) null);
                if (m14182 == null || m14182.isEmpty()) {
                    C0495.f1089.getClass();
                    return C0495.f1091;
                }
                ArrayList arrayList4 = new ArrayList(m14182.size());
                for (ResolveInfo resolveInfo2 : m14182) {
                    arrayList4.add(new LauncherActivityInfoInternal(resolveInfo2.activityInfo, this.f1053));
                }
                return C0495.f1089.m2458((List<?>) arrayList4);
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$ׯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$ׯ.class */
    public static final class C0446 extends C0202 {

        /* renamed from: Ԫ  reason: contains not printable characters */
        public final /* synthetic */ IncrementalStatesInfo f1054;

        public C0446(IncrementalStatesInfo incrementalStatesInfo) {
            this.f1054 = incrementalStatesInfo;
        }

        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                ComponentName componentName = (ComponentName) C0153.f201.m726(c0253.f519, ComponentName.class);
                if (componentName != null) {
                    C0245.C0246 c0246 = C0245.f512;
                    c0246.getClass();
                    if (C0245.f513.m1446(componentName.getPackageName())) {
                        c0246.getClass();
                        ActivityInfo m1416 = C0245.m1416(C0245.f513, componentName, 0, 2, null);
                        if (m1416 != null) {
                            return new LauncherActivityInfoInternal(m1416, this.f1054);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return c0253.m1485();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၝ$ؠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၝ$ؠ.class */
    public static final class C0447 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            String obj;
            List<?> arrayList;
            try {
                Object obj2 = c0253.f519[(C0175.f262 ? 1 : null) == 1 ? 1 : 0];
                obj = obj2 != null ? obj2.toString() : null;
            } catch (Exception unused) {
            }
            if (obj == null) {
                Object m1485 = c0253.m1485();
                C0495 c0495 = C0495.f1089;
                List<?> m2455 = c0495.m2455(m1485);
                List<?> list = m2455;
                if (m2455 == null) {
                    list = arrayList;
                    arrayList = new ArrayList<>();
                }
                C0245.f512.getClass();
                List m1418 = C0245.m1418(C0245.f513, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), (String) null, 0, 6, (Object) null);
                if (m1418 == null || m1418.isEmpty()) {
                    return m1485;
                }
                List<?> list2 = list;
                ArrayList arrayList2 = new ArrayList(m1418.size() + list.size());
                arrayList2.addAll(m1418);
                arrayList2.addAll(list2);
                return c0495.m2458((List<?>) arrayList2);
            }
            C0245.C0246 c0246 = C0245.f512;
            c0246.getClass();
            if (C0245.f513.m1446(obj)) {
                c0246.getClass();
                List<?> m14182 = C0245.m1418(C0245.f513, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(obj), (String) null, 0, 6, (Object) null);
                if (!(m14182 == null || m14182.isEmpty())) {
                    return C0495.f1089.m2458(m14182);
                }
                C0495.f1089.getClass();
                return C0495.f1091;
            }
            return c0253.m1485();
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        IncrementalStatesInfo incrementalStatesInfo;
        IncrementalStatesInfo incrementalStatesInfo2;
        IncrementalStatesInfo incrementalStatesInfo3;
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("launcherapps");
            if (m643 == null) {
                return;
            }
            m643.m374("showAppDetailsAsUser", new C0439());
            C0202.C0203 c0203 = C0202.f299;
            C0495.f1089.getClass();
            Object obj = C0495.f1091;
            c0203.getClass();
            m643.m374("getShortcuts", new C0167(obj));
            m643.m374("getApplicationInfo", new C0440());
            m643.m374("isActivityEnabled", new C0441());
            m643.m374("isPackageEnabled", new C0442());
            m643.m374("startActivityAsUser", new C0443());
            c0203.getClass();
            m643.m374("pinShortcuts", C0202.f301);
            if (!C0175.f272) {
                m643.m374("getLauncherActivities", new C0447());
                m643.m374("resolveActivity", new C0438());
                return;
            }
            m643.m374("getActivityLaunchIntent", new C0444());
            if (C0175.f274) {
                incrementalStatesInfo2 = incrementalStatesInfo3;
                incrementalStatesInfo3 = new IncrementalStatesInfo(false, 100.0f, 0L);
            } else {
                incrementalStatesInfo2 = incrementalStatesInfo;
                incrementalStatesInfo = new IncrementalStatesInfo(false, 100.0f);
            }
            m643.m374("getLauncherActivities", new C0445(incrementalStatesInfo2));
            m643.m374("resolveLauncherActivityInternal", new C0446(incrementalStatesInfo2));
        } catch (Throwable unused) {
        }
    }
}
