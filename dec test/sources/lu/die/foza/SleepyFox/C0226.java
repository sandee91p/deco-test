package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.app.Application;
import android.app.IServiceConnection;
import android.app.LoadedApk;
import android.app.Service;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0245;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.߿  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/߿.class */
public final class C0226 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0226 f423 = new C0226();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final ConcurrentHashMap<String, BinderC0227> f424 = new ConcurrentHashMap<>();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final Map<IBinder, Service> f425;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0343<Object> f426;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final C0344<Context> f427;
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final C0344<Object> f428;
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final C0344<Object> f429;
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final C0344<Object> f430;

    /* renamed from: lu.die.foza.SleepyFox.߿$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/߿$Ϳ.class */
    public static final class BinderC0227 extends Binder {
        @NotNull

        /* renamed from: ԭ  reason: contains not printable characters */
        public final ServiceInfo f431;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public int f432;

        /* renamed from: ԯ  reason: contains not printable characters */
        public int f433;
        @Nullable

        /* renamed from: ՠ  reason: contains not printable characters */
        public Service f434;
        @Nullable

        /* renamed from: ֏  reason: contains not printable characters */
        public Intent f436;
        @Nullable

        /* renamed from: ׯ  reason: contains not printable characters */
        public IBinder f437;
        @NotNull

        /* renamed from: ֈ  reason: contains not printable characters */
        public HashSet<IBinder> f435 = new HashSet<>();

        /* renamed from: ؠ  reason: contains not printable characters */
        public int f438 = -1;

        public BinderC0227(@NotNull ServiceInfo serviceInfo) {
            this.f431 = serviceInfo;
        }

        @NotNull
        /* renamed from: ԫ  reason: contains not printable characters */
        public final ServiceInfo m1282() {
            return this.f431;
        }

        /* renamed from: ԭ  reason: contains not printable characters */
        public final int m1283() {
            return this.f432;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final int m1285() {
            return this.f433;
        }

        @Nullable
        /* renamed from: Ԭ  reason: contains not printable characters */
        public final Service m1287() {
            return this.f434;
        }

        @NotNull
        /* renamed from: Ԫ  reason: contains not printable characters */
        public final HashSet<IBinder> m1289() {
            return this.f435;
        }

        @Nullable
        /* renamed from: ԩ  reason: contains not printable characters */
        public final Intent m1291() {
            return this.f436;
        }

        @Nullable
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final IBinder m1293() {
            return this.f437;
        }

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final int m1295() {
            return this.f438;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final void m1284(int i) {
            this.f432 = i;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1286(int i) {
            this.f433 = i;
        }

        /* renamed from: ԩ  reason: contains not printable characters */
        public final void m1296(int i) {
            this.f438 = i;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1294(@Nullable IBinder iBinder) {
            this.f437 = iBinder;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1292(@Nullable Intent intent) {
            this.f436 = intent;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1290(@NotNull HashSet<IBinder> hashSet) {
            this.f435 = hashSet;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1288(@Nullable Service service) {
            this.f434 = service;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.߿$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/߿$Ԩ.class */
    public static final class C0228 implements IBinder.DeathRecipient {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f439;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final /* synthetic */ BinderC0227 f440;

        public C0228(IBinder iBinder, BinderC0227 binderC0227) {
            this.f439 = iBinder;
            this.f440 = binderC0227;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f439.unlinkToDeath(this, 0);
            try {
                this.f440.f435.remove(this.f439);
                if (!this.f440.f435.isEmpty()) {
                    return;
                }
                Objects.toString(this.f440.f436);
                BinderC0227 binderC0227 = this.f440;
                Service service = binderC0227.f434;
                if (service != null) {
                    service.onUnbind(binderC0227.f436);
                }
                BinderC0227 binderC02272 = this.f440;
                binderC02272.f433 = 0;
                C0226.f423.m1279(binderC02272.f436, binderC02272.f431);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Map] */
    static {
        HashMap hashMap;
        Class[] clsArr;
        try {
            C0047 c0047 = C0047.f129;
            BinderC0293.f705.getClass();
            Object m465 = c0047.m465(BinderC0293.f707, "mServices");
            Intrinsics.checkNotNull(m465, "null cannot be cast to non-null type kotlin.collections.MutableMap<android.os.IBinder, android.app.Service>");
            hashMap = Collections.synchronizedMap(TypeIntrinsics.asMutableMap(m465));
        } catch (Throwable unused) {
            hashMap = r0;
            HashMap hashMap2 = new HashMap();
        }
        f425 = hashMap;
        f426 = new C0343<>("mPackageInfo");
        f427 = new C0344("createAppContext", new Class[]{ActivityThread.class, LoadedApk.class}).m2124("android.app.ContextImpl");
        f428 = new C0344("attach", new Class[]{Context.class, ActivityThread.class, String.class, IBinder.class, Application.class, Object.class}).m2125(Service.class);
        f429 = new C0344("setOuterContext", new Class[]{Context.class}).m2124("android.app.ContextImpl");
        if (C0175.f262) {
            clsArr = r0;
            Class[] clsArr2 = {ComponentName.class, IBinder.class, Boolean.TYPE};
        } else {
            clsArr = r0;
            Class[] clsArr3 = {ComponentName.class, IBinder.class};
        }
        f430 = new C0344("connected", clsArr).m2125(IServiceConnection.class);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1272() {
        try {
            C0343<Object> c0343 = f426;
            c0343.getClass();
            c0343.m2101(Class.forName("android.app.ContextImpl"));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:48|49|50|51|52|(3:54|55|(12:57|58|59|60|61|62|(1:64)|65|66|(2:68|69)|71|72))|74|58|59|60|61|62|(0)|65|66|(0)|71|72) */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b A[Catch: Exception -> 0x0177, TRY_ENTER, TryCatch #1 {Exception -> 0x0177, blocks: (B:61:0x012f, B:62:0x0132, B:64:0x013b, B:65:0x0143, B:66:0x014f, B:68:0x0159, B:69:0x0164), top: B:60:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159 A[Catch: Exception -> 0x0177, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0177, blocks: (B:61:0x012f, B:62:0x0132, B:64:0x013b, B:65:0x0143, B:66:0x014f, B:68:0x0159, B:69:0x0164), top: B:60:0x012f }] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1276(@org.jetbrains.annotations.Nullable android.content.Intent r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable android.content.pm.ServiceInfo r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0226.m1276(android.content.Intent, java.lang.Object, android.content.pm.ServiceInfo):int");
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final void m1270(BinderC0227 binderC0227) {
        try {
            Service service = binderC0227.f434;
            if (service == null) {
                return;
            }
            service.onDestroy();
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ int m1263(C0226 c0226, Intent intent, Object obj, ServiceInfo serviceInfo, int i, Object obj2) {
        if ((i & 4) != 0) {
            serviceInfo = null;
        }
        return c0226.m1276(intent, obj, serviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:2:0x0000, B:7:0x000e, B:13:0x0027, B:16:0x003b, B:17:0x006f, B:18:0x0075, B:20:0x007b, B:22:0x0087, B:23:0x009a, B:26:0x00a5, B:28:0x00b1, B:31:0x0047, B:34:0x005b, B:36:0x0069), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:2:0x0000, B:7:0x000e, B:13:0x0027, B:16:0x003b, B:17:0x006f, B:18:0x0075, B:20:0x007b, B:22:0x0087, B:23:0x009a, B:26:0x00a5, B:28:0x00b1, B:31:0x0047, B:34:0x005b, B:36:0x0069), top: B:1:0x0000 }] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1268(lu.die.foza.SleepyFox.C0226.BinderC0227 r12, android.content.Intent r13, android.content.Intent r14, java.lang.String r15, boolean r16, android.content.pm.ServiceInfo r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0226.m1268(lu.die.foza.SleepyFox.߿$Ϳ, android.content.Intent, android.content.Intent, java.lang.String, boolean, android.content.pm.ServiceInfo, java.lang.Object):void");
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0343<Object> m1274() {
        return f426;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Service m1273(@Nullable ComponentName componentName) {
        if (componentName != null) {
            try {
                String className = componentName.getClassName();
                if (className == null) {
                    return null;
                }
                BinderC0227 binderC0227 = f424.get(className);
                return binderC0227 != null ? binderC0227.f434 : null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Pair<Application, Context> m1281(String str) {
        try {
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            BinderC0293 binderC0293 = BinderC0293.f705;
            Object m2103 = f426.m2103(binderC0293.m1791(str));
            c0276.getClass();
            Intrinsics.checkNotNull(m2103);
            binderC0293.getClass();
            ActivityThread activityThread = BinderC0293.f707;
            Application m1790 = binderC0293.m1790(m2103, activityThread.getInstrumentation());
            C0344<Context> c0344 = f427;
            Object[] objArr = new Object[2];
            binderC0293.getClass();
            objArr[0] = activityThread;
            objArr[1] = m2103;
            return new Pair<>(m1790, c0344.m2127(null, objArr));
        } catch (Exception e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new RuntimeException(e);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1280(Runnable runnable) {
        BinderC0293.f705.getClass();
        return BinderC0293.f708.post(runnable);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ComponentName m1275(@Nullable Intent intent, boolean z, @Nullable ServiceInfo serviceInfo) {
        BinderC0227 binderC0227;
        int i;
        if (intent == null) {
            return null;
        }
        if (serviceInfo == null) {
            try {
                C0245.f512.getClass();
                ServiceInfo m1426 = C0245.f513.m1426(intent);
                serviceInfo = m1426;
                if (m1426 == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        String str = serviceInfo.name;
        if (str == null) {
            return null;
        }
        String str2 = serviceInfo.packageName;
        if (str2 == null) {
            return null;
        }
        C0276 c0276 = C0276.f576;
        if (!Intrinsics.areEqual(str2, c0276.m1713())) {
            C0245.C0246 c0246 = C0245.f512;
            c0246.getClass();
            if (!C0245.f513.m1444(str2)) {
                return null;
            }
            c0246.getClass();
            C0245 c0245 = C0245.f513;
            c0276.getClass();
            String m1462 = c0245.m1462(str2, C0276.f579);
            C0209.f304.getClass();
            return C0209.f305.m1167(intent, serviceInfo, m1462);
        } else if (!Intrinsics.areEqual(c0276.m1714(), serviceInfo.processName)) {
            C0209.f304.getClass();
            C0209 c0209 = C0209.f305;
            c0276.getClass();
            return c0209.m1167(intent, serviceInfo, C0276.f579);
        } else {
            ConcurrentHashMap<String, BinderC0227> concurrentHashMap = f424;
            BinderC0227 binderC02272 = concurrentHashMap.get(str);
            if (binderC02272 == null) {
                BinderC0227 binderC02273 = new BinderC0227(serviceInfo);
                concurrentHashMap.put(str, binderC02273);
                m1280(() -> {
                    m1267(r1, r2, r3, r4, r5);
                });
                return new ComponentName(str2, str);
            } else if (!z) {
                return new ComponentName(str2, str);
            } else {
                int i2 = binderC02272.f432;
                if (i2 <= 0) {
                    binderC0227 = binderC02272;
                    i = 1;
                } else {
                    binderC0227 = binderC02272;
                    i = i2 + 1;
                }
                binderC0227.f432 = i;
                m1280(() -> {
                    m1265(r1, r2, r3);
                });
                return new ComponentName(str2, str);
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ ComponentName m1262(C0226 c0226, Intent intent, boolean z, ServiceInfo serviceInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            serviceInfo = null;
        }
        return c0226.m1275(intent, z, serviceInfo);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1265(Intent intent, String str, BinderC0227 binderC0227) {
        try {
            intent.setExtrasClassLoader(C0276.f576.m1720(str));
            Service service = binderC0227.f434;
            binderC0227.f438 = service != null ? service.onStartCommand(intent, 0, binderC0227.f432) : -1;
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1267(String str, String str2, BinderC0227 binderC0227, Intent intent, boolean z) {
        try {
            String str3 = StringsKt.startsWith$default(str, '.', false, 2, (Object) null) ? str2 + str : str;
            ClassLoader m1720 = C0276.f576.m1720(str2);
            Class<?> loadClass = m1720.loadClass(str3);
            if (loadClass == null) {
                return;
            }
            Object newInstance = loadClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type android.app.Service");
            Service service = (Service) newInstance;
            binderC0227.f434 = service;
            C0226 c0226 = f423;
            Pair<Application, Context> m1281 = c0226.m1281(str2);
            Object[] objArr = new Object[6];
            objArr[0] = m1281.getSecond();
            BinderC0293.f705.getClass();
            objArr[1] = BinderC0293.f707;
            objArr[2] = str;
            objArr[3] = binderC0227;
            objArr[4] = m1281.getFirst();
            objArr[5] = C0263.f548.m1636();
            f429.m2127(m1281.getSecond(), service);
            f428.m2126(service, objArr);
            service.onCreate();
            f425.put(binderC0227, service);
            if (service instanceof JobService) {
                binderC0227.f437 = ((JobService) service).onBind(intent);
            }
            if (!z) {
                return;
            }
            binderC0227.f432++;
            c0226.m1280(() -> {
                m1266(r1, r2, r3, r4);
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1266(Intent intent, ClassLoader classLoader, BinderC0227 binderC0227, Service service) {
        try {
            intent.setExtrasClassLoader(classLoader);
            binderC0227.f438 = service.onStartCommand(intent, 0, binderC0227.f432);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1278(@Nullable ComponentName componentName, int i) {
        if (componentName == null) {
            return -1;
        }
        try {
            Intent component = new Intent().setComponent(componentName);
            C0245.f512.getClass();
            ServiceInfo m1426 = C0245.f513.m1426(component);
            if (m1426 == null) {
                return -1;
            }
            String str = m1426.packageName;
            if (str == null) {
                return -1;
            }
            String m1713 = C0276.f576.m1713();
            if (m1713 == null) {
                return -1;
            }
            if (!Intrinsics.areEqual(m1713, str)) {
                return 0;
            }
            if (i >= 0) {
                return m1279(component, m1426);
            }
            ConcurrentHashMap<String, BinderC0227> concurrentHashMap = f424;
            BinderC0227 binderC0227 = concurrentHashMap.get(m1426.name);
            if (binderC0227 == null) {
                return -1;
            }
            if (binderC0227.f433 > 0) {
                binderC0227.f432 = 0;
                return 0;
            }
            componentName.toString();
            m1280(() -> {
                m1269(r4);
            });
            concurrentHashMap.remove(m1426.name);
            f425.remove(binderC0227);
            concurrentHashMap.size();
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1269(BinderC0227 binderC0227) {
        try {
            Service service = binderC0227.f434;
            if (service == null) {
                return;
            }
            service.onDestroy();
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1279(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo) {
        if (intent == null) {
            return -1;
        }
        if (serviceInfo == null) {
            try {
                C0245.f512.getClass();
                ServiceInfo m1426 = C0245.f513.m1426(intent);
                serviceInfo = m1426;
                if (m1426 == null) {
                    return -1;
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        String str = serviceInfo.packageName;
        if (str == null) {
            return -1;
        }
        C0276 c0276 = C0276.f576;
        String m1713 = c0276.m1713();
        if (m1713 == null) {
            return -1;
        }
        if (!Intrinsics.areEqual(c0276.m1714(), serviceInfo.processName) && serviceInfo.processName != null) {
            C0245.f512.getClass();
            C0245 c0245 = C0245.f513;
            c0276.getClass();
            String m1462 = c0245.m1462(str, C0276.f579);
            C0209.f304.getClass();
            return C0209.f305.m1168(intent, serviceInfo, m1462);
        } else if (!Intrinsics.areEqual(m1713, str)) {
            return -1;
        } else {
            ConcurrentHashMap<String, BinderC0227> concurrentHashMap = f424;
            BinderC0227 binderC0227 = concurrentHashMap.get(serviceInfo.name);
            if (binderC0227 == null) {
                return 0;
            }
            int i = binderC0227.f432 - 1;
            binderC0227.f432 = i;
            int i2 = binderC0227.f433;
            if (i > 0 || i2 > 0) {
                return 0;
            }
            ServiceInfo serviceInfo2 = serviceInfo;
            serviceInfo.toString();
            m1280(() -> {
                m1270(r3);
            });
            concurrentHashMap.remove(serviceInfo2.name);
            f425.remove(binderC0227);
            return 1;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ int m1264(C0226 c0226, Intent intent, ServiceInfo serviceInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            serviceInfo = null;
        }
        return c0226.m1279(intent, serviceInfo);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1277(@NotNull IInterface iInterface) {
        BinderC0227 binderC0227;
        int i;
        try {
            IBinder asBinder = iInterface.asBinder();
            for (Map.Entry<String, BinderC0227> entry : f424.entrySet()) {
                BinderC0227 value = entry.getValue();
                if (value.f435.contains(asBinder)) {
                    int i2 = value.f433;
                    if (i2 > 1) {
                        value.f433 = i2 - 1;
                        return 0;
                    } else if (i2 != 1) {
                        return 1;
                    } else {
                        try {
                            Service service = value.f434;
                            if (service != null && service.onUnbind(value.f436)) {
                                binderC0227 = value;
                                i = -1;
                            } else {
                                binderC0227 = value;
                                i = 0;
                            }
                            binderC0227.f433 = i;
                        } catch (Exception unused) {
                        }
                        if (value.f432 > 0) {
                            return 1;
                        }
                        m1279(value.f436, value.f431);
                        return 1;
                    }
                }
            }
            return -1;
        } catch (Exception unused2) {
            return -1;
        }
    }
}
