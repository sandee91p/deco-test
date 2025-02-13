package lu.die.foza.SleepyFox;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ServiceInfo;
import android.content.pm.UserInfo;
import android.os.IInterface;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0202;
import lu.die.foza.SleepyFox.C0281;
/* renamed from: lu.die.foza.SleepyFox.ՠ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ.class */
public final class C0116 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ՠ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$Ϳ.class */
    public static final class C0117 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ AbstractC0412 f184;

        public C0117(AbstractC0412 abstractC0412) {
            this.f184 = abstractC0412;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object mo85 = this.f184.mo85(c0253);
            if ((mo85 instanceof Integer) && ((Number) mo85).intValue() < 0) {
                Intent intent = (Intent) C0153.f201.m726(c0253.f519, Intent.class);
                ComponentName component = intent != null ? intent.getComponent() : null;
                if (component != null && StringsKt.startsWith$default(component.getPackageName(), "android.ext.services", false, 2, (Object) null)) {
                    return 0;
                }
            }
            return mo85;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityManagerNativeObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityManagerNativeObserver.kt\nlu/die/foza/HookEntity/ServiceHookDefs/ActivityManagerNativeObserver$observeOn$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ՠ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$Ԩ.class */
    public static final class C0118 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Intent intent = (Intent) C0153.f201.m726(c0253.f519, Intent.class);
                if (intent != null) {
                    ComponentName component = intent.getComponent();
                    if (Intrinsics.areEqual(component != null ? component.getPackageName() : null, m1135()) || Intrinsics.areEqual(intent.getPackage(), m1135())) {
                        return super.mo85(c0253);
                    }
                    ComponentName m1262 = C0226.m1262(C0226.f423, intent, false, (ServiceInfo) null, 6, (Object) null);
                    if (m1262 != null) {
                        return m1262;
                    }
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$Ԫ.class */
    public static final class C0119 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object m726 = C0153.f201.m726(c0253.f519, Intent.class);
                Intrinsics.checkNotNull(m726);
                int m1264 = C0226.m1264(C0226.f423, (Intent) m726, (ServiceInfo) null, 2, (Object) null);
                if (m1264 >= 0) {
                    return Integer.valueOf(m1264);
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$Ԭ.class */
    public static final class C0120 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                C0153 c0153 = C0153.f201;
                ComponentName componentName = (ComponentName) c0153.m726(objArr, ComponentName.class);
                Number number = (Number) c0153.m726(objArr, Number.class);
                if (C0226.f423.m1278(componentName, number != null ? number.intValue() : -1) >= 0) {
                    return Boolean.TRUE;
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$Ԯ.class */
    public static final class C0121 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                IServiceConnection iServiceConnection = (IServiceConnection) C0153.f201.m726(c0253.f519, IServiceConnection.class);
                if (iServiceConnection != null) {
                    if (C0226.f423.m1277((IInterface) iServiceConnection) >= 0) {
                        return Boolean.TRUE;
                    }
                    C0209.f304.getClass();
                    if (C0209.f305.m1171(iServiceConnection) >= 0) {
                        return Boolean.TRUE;
                    }
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$֏  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$֏.class */
    public static final class C0124 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object obj = c0253.f519[1];
                if (obj instanceof List) {
                    if (!C0222.f333.m1239((List) obj)) {
                        return null;
                    }
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$ׯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$ׯ.class */
    public static final class C0125 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object[] objArr;
            C0153 c0153;
            Intent intent;
            try {
                objArr = c0253.f519;
                c0153 = C0153.f201;
                intent = (Intent) c0153.m726(objArr, Intent.class);
            } catch (Exception unused) {
            }
            if (intent == null) {
                return super.mo85(c0253);
            }
            ComponentName component = intent.getComponent();
            String packageName = component != null ? component.getPackageName() : null;
            if (Intrinsics.areEqual(packageName, m1135()) || Intrinsics.areEqual(intent.getPackage(), m1135())) {
                return super.mo85(c0253);
            }
            int m1263 = C0226.m1263(C0226.f423, intent, c0153.m726(objArr, IServiceConnection.class), (ServiceInfo) null, 4, (Object) null);
            intent.toString();
            if (m1263 > 0) {
                return Integer.valueOf(m1263);
            }
            C0309 c0309 = C0309.f727;
            c0309.getClass();
            if ((!C0309.f728 && (c0309.m1846(intent.getPackage()) || c0309.m1846(packageName))) || Intrinsics.areEqual(packageName, "com.heytap.openid")) {
                return 0;
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$ؠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$ؠ.class */
    public static final class C0126 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            IntentFilter intentFilter;
            IIntentReceiver iIntentReceiver;
            String str;
            Object obj;
            try {
                Class<?>[] parameterTypes = c0253.f518.getParameterTypes();
                Object[] objArr = c0253.f519;
                int length = parameterTypes.length - 1;
                if (C0175.f273) {
                    Object obj2 = objArr[length];
                    if ((obj2 instanceof Integer) && (((Number) obj2).intValue() & 2) == 0 && (((Number) obj2).intValue() & 4) == 0) {
                        objArr[length] = Integer.valueOf(((Number) obj2).intValue() | 2);
                    }
                }
                while (true) {
                    if (length <= 0) {
                        break;
                    }
                    int i = length;
                    int i2 = i - 1;
                    if (Intrinsics.areEqual(parameterTypes[i], String.class)) {
                        objArr[length] = null;
                        break;
                    }
                    length = i2;
                }
                C0153 c0153 = C0153.f201;
                intentFilter = (IntentFilter) c0153.m726(objArr, IntentFilter.class);
                iIntentReceiver = (IIntentReceiver) c0153.m726(objArr, IIntentReceiver.class);
                try {
                    obj = objArr[1];
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (obj instanceof String) {
                str = (String) obj;
                if (intentFilter != null && iIntentReceiver != null) {
                    C0209.f304.getClass();
                    C0209.f305.m1174(intentFilter, iIntentReceiver, str);
                }
                C0301.f718.getClass();
                return C0301.f719.mo85(c0253);
            }
            str = null;
            if (intentFilter != null) {
                C0209.f304.getClass();
                C0209.f305.m1174(intentFilter, iIntentReceiver, str);
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
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
        UserInfo userInfo;
        C0277.f587.getClass();
        this.f168 = C0277.f588;
        C0263 c0263 = C0263.f548;
        C0033 m646 = m646(C0281.C0283.f620, (IInterface) c0263.m1636());
        if (m646 == null) {
            return;
        }
        C0030 c0030 = C0030.f93;
        c0263.getClass();
        c0030.m367(C0263.f549, m646.f100);
        C0131.f185.getClass();
        C0131.f186.m707(m646);
        if (!C0175.f271) {
            C0474.f1079.getClass();
            C0474.f1080.m2434(m646);
        }
        m646.m374("getRunningAppProcesses", C0340.f811);
        C0374.f879.getClass();
        m646.m374("getContentProvider", C0374.f880);
        C0125 c0125 = new C0125();
        m646.m377(new C0117(c0125), "bindServiceInstance", "bindIsolatedService");
        m646.m374("bindService", c0125);
        m646.m374("startService", new C0118());
        m646.m374("stopService", new C0119());
        m646.m374("stopServiceToken", new C0120());
        m646.m374("unbindService", new C0121());
        C0202.C0203 c0203 = C0202.f299;
        try {
            Class[] clsArr = new Class[3];
            Class cls = Integer.TYPE;
            clsArr[0] = cls;
            clsArr[1] = String.class;
            clsArr[2] = cls;
            Constructor declaredConstructor = UserInfo.class.getDeclaredConstructor(clsArr);
            Object[] objArr = new Object[3];
            objArr[0] = 0;
            objArr[1] = "Admin";
            objArr[2] = 1;
            userInfo = (UserInfo) declaredConstructor.newInstance(objArr);
        } catch (Exception unused) {
            userInfo = null;
        }
        c0203.getClass();
        m646.m374("getCurrentUser", new C0167(userInfo));
        m646.m374("setServiceForeground", C0032.f97);
        m646.m377(new C0122(), "broadcastIntent", "broadcastIntentWithFeature");
        C0126 c0126 = new C0126();
        if (C0175.f272) {
            C0202.f299.getClass();
            m646.m374("getCurrentUserId", new C0167(0));
        }
        if (C0175.f270) {
            m646.m374("registerReceiverWithFeature", c0126);
            C0301.f718.getClass();
            m646.m374("setActivityLocusContext", C0301.f719);
            C0131.f185.getClass();
            m646.m374("startActivityWithFeature", C0131.f186);
        }
        if (C0175.f264) {
            C0301.f718.getClass();
            m646.m374("isBackgroundRestricted", C0301.f719);
        }
        m646.m374("registerReceiver", c0126);
        m646.m374("unregisterReceiver", new C0123());
        C0348.f823.getClass();
        C0348 c0348 = C0348.f824;
        c0348.getClass();
        m646.m374("checkPermission", c0348);
        if (!C0175.f271) {
            C0202.f299.getClass();
            m646.m374("overridePendingTransition", C0202.f301);
            C0178.f277.getClass();
            C0178.f278.m1017(m646);
            C0110.f177.getClass();
            C0110.f178.m695(m646);
        }
        C0432.f1041.getClass();
        C0432.f1046.m2351(m646);
        C0007.f42.getClass();
        C0007.f43.m83(m646);
        if (C0175.f269) {
            C0202.C0203 c02032 = C0202.f299;
            Boolean bool = Boolean.TRUE;
            c02032.getClass();
            m646.m374("getIsSupportMultiApp", new C0167(bool));
        }
        m646.m374("publishContentProviders", new C0124());
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$ՠ.class */
    public static final class C0122 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Intent intent = (Intent) C0153.f201.m726(c0253.f519, Intent.class);
                if (intent != null) {
                    C0276.f576.m1722(() -> {
                        m703(r1);
                    });
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final void m703(Intent intent) {
            try {
                C0209.f304.getClass();
                C0209 c0209 = C0209.f305;
                C0276.f576.getClass();
                c0209.m1173(intent, C0276.f579);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ՠ$ֈ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ՠ$ֈ.class */
    public static final class C0123 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                IIntentReceiver iIntentReceiver = (IIntentReceiver) C0153.f201.m726(c0253.f519, IIntentReceiver.class);
                if (iIntentReceiver != null) {
                    C0276.f576.m1722(() -> {
                        m704(r1);
                    });
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final void m704(IIntentReceiver iIntentReceiver) {
            try {
                C0209.f304.getClass();
                C0209.f305.m1175(iIntentReceiver);
            } catch (Throwable unused) {
            }
        }
    }
}
