package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.app.Application;
import android.app.Instrumentation;
import android.app.LoadedApk;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.ddm.DdmHandleAppName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lu.die.foza.SleepyFox.AbstractC0382;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢭ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢭ.class */
public final class BinderC0293 extends AbstractC0382.AbstractBinderC0384 {
    @NotNull

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final BinderC0293 f705 = new BinderC0293();

    /* renamed from: ֏  reason: contains not printable characters */
    public static int f706;
    @NotNull

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final ActivityThread f707;
    @NotNull

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final Handler f708;
    @NotNull

    /* renamed from: ހ  reason: contains not printable characters */
    public static final Object f709;
    @NotNull

    /* renamed from: ށ  reason: contains not printable characters */
    public static final C0344<Application> f710;
    @NotNull

    /* renamed from: ނ  reason: contains not printable characters */
    public static final Function0<Unit> f711;
    @NotNull

    /* renamed from: ރ  reason: contains not printable characters */
    public static final C0024<Context> f712;

    /* renamed from: lu.die.foza.SleepyFox.ࢭ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢭ$Ϳ.class */
    public /* synthetic */ class C0294 extends FunctionReferenceImpl implements Function1<Parcel, C0334> {
        public C0294(Object obj) {
            super(1, obj, Parcelable.Creator.class, "createFromParcel", "createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;", 0);
        }

        public final C0334 invoke(Parcel parcel) {
            return (C0334) ((Parcelable.Creator) ((FunctionReferenceImpl) this).receiver).createFromParcel(parcel);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢭ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢭ$Ԩ.class */
    public static final class C0295 extends Lambda implements Function0<Unit> {
        public static final C0295 INSTANCE = new C0295();

        public C0295() {
            super(0);
        }

        /* renamed from: invoke  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m1800invoke() {
            invoke();
            return Unit.INSTANCE;
        }

        public final void invoke() {
            try {
                if (C0175.f264) {
                    C0354.f837.m2166();
                    C0152.f200.m719();
                }
                C0216.f314.m1200();
                C0225.f418.m1260();
                C0327 c0327 = C0327.f772;
                C0276 c0276 = C0276.f576;
                c0327.m2016(c0276.m1713(), c0276.m1714());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1783(Function0 function0) {
        function0.invoke();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final void m1784(C0355 c0355) {
        f705.m1798(c0355);
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final void m1785() {
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    static {
        Handler handler;
        Handler handler2;
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        f707 = currentActivityThread;
        try {
            if (C0175.f272) {
                handler2 = currentActivityThread.getHandler();
            } else {
                Object m465 = C0047.f129.m465(currentActivityThread, "mH");
                Intrinsics.checkNotNull(m465);
                handler2 = (Handler) m465;
            }
            handler = handler2;
        } catch (Exception unused) {
            handler = r1;
            Handler handler3 = new Handler(Looper.getMainLooper());
        }
        f708 = handler;
        try {
            Object m4652 = C0047.f129.m465(f707, "mBoundApplication");
            e = m4652;
            Intrinsics.checkNotNull(m4652);
        } catch (Exception e) {
            e = e;
        }
        f709 = e;
        f710 = new C0344(C0175.f273 ? "makeApplicationInner" : "makeApplication", new Class[]{Boolean.TYPE, Instrumentation.class}).m2125(LoadedApk.class);
        f711 = C0295.INSTANCE;
        f712 = new C0024<>(1);
    }

    @NotNull
    /* renamed from: ֈ  reason: contains not printable characters */
    public final Object m1788() {
        return f709;
    }

    @NotNull
    /* renamed from: ֏  reason: contains not printable characters */
    public final Context m1791(@NotNull String str) {
        C0024<Context> c0024 = f712;
        Context context = (Context) C0024.m302(c0024, str.hashCode(), null, 2, null);
        Context context2 = context;
        if (context == null) {
            context2 = C0276.m1701().createPackageContext(str, 3);
            c0024.m309(str.hashCode(), context2);
        }
        return context2;
    }

    @NotNull
    /* renamed from: ׯ  reason: contains not printable characters */
    public final ClassLoader m1792(@NotNull String str) {
        return m1791(str).getClassLoader();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0382
    /* renamed from: Ԯ  reason: contains not printable characters */
    public void mo1794() {
        f708.post(BinderC0293::m1785);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1798(C0355 c0355) {
        try {
            C0276 c0276 = C0276.f576;
            C0222 c0222 = C0222.f333;
            Future<?> m1723 = c0276.m1723(this::m1238);
            String m2172 = c0355.m2172();
            String m2173 = c0355.m2173();
            Context m1791 = m1791(m2172);
            C0226.f423.getClass();
            Object m2103 = C0226.f426.m2103(m1791);
            if (m2103 == null) {
                return;
            }
            ApplicationInfo applicationInfo = m1791.getApplicationInfo();
            if (applicationInfo == null) {
                return;
            }
            c0276.getClass();
            if (Intrinsics.areEqual(m2172, C0276.f583)) {
                C0047.f129.m464(m2103, "mApplication", (Object) null);
            }
            C0047 c0047 = C0047.f129;
            Object obj = f709;
            c0047.m464(obj, "appInfo", applicationInfo);
            c0047.m464(obj, "processName", (Object) m2173);
            c0047.m464(obj, "info", m2103);
            try {
                c0047.m464(m2103, "mSecurityViolation", Boolean.FALSE);
            } catch (Exception unused) {
            }
            C0343 c0343 = new C0343("mInitialApplication");
            ActivityThread activityThread = f707;
            c0343.m2104(activityThread, (Object) null);
            C0341.f812.m2088(m2173);
            if (C0175.f270) {
                C0276.f576.getClass();
                DdmHandleAppName.setAppName(m2173, m2172, C0276.f585);
            } else {
                C0276.f576.getClass();
                DdmHandleAppName.setAppName(m2173, C0276.f585);
            }
            C0152.f200.m718(m2172, m1791, applicationInfo);
            if (Intrinsics.areEqual(m2172, "com.tencent.mm")) {
                new C0453();
                C0342.f813.m2093();
            }
            m1723.get();
            Application m1780 = m1780(this, m2103, null, 2, null);
            if (m1780 == null) {
                return;
            }
            c0343.m2104(activityThread, m1780);
            C0222.f333.m1240(m1780, f709);
            Instrumentation instrumentation = activityThread.getInstrumentation();
            if (instrumentation != null) {
                instrumentation.callApplicationOnCreate(m1780);
            } else {
                m1780.onCreate();
            }
            C0276 c02762 = C0276.f576;
            Function0<Unit> function0 = f711;
            c02762.m1723(() -> {
                m1783(r1);
            });
        } catch (Throwable unused2) {
        }
    }

    @NotNull
    /* renamed from: ֏  reason: contains not printable characters */
    public final ActivityThread m1787() {
        return f707;
    }

    @NotNull
    /* renamed from: ׯ  reason: contains not printable characters */
    public final Handler m1789() {
        return f708;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0382
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public Intent mo1795(@Nullable Intent intent) {
        if (intent != null) {
            try {
                intent.setExtrasClassLoader(ActivityThread.currentApplication().getClassLoader());
            } catch (Exception unused) {
                return null;
            }
        } else {
            intent = null;
        }
        return C0417.m2318(intent);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1797(Bundle bundle) {
        C0334 c0334;
        if (f706 == 0) {
            f706 = bundle.getInt(C0281.C0282.f609, 0);
            byte[] byteArray = bundle.getByteArray(C0281.C0282.f605);
            if (byteArray == null || (c0334 = (C0334) C0494.f1088.m2452(byteArray, new C0294(C0334.CREATOR))) == null) {
                return;
            }
            C0276.f576.m1726(() -> {
                m1781(r1);
            });
            f708.post(() -> {
                m1782(r1);
            });
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1782(C0334 c0334) {
        C0354 c0354 = C0354.f837;
        c0354.m2163(c0334);
        c0354.m2165();
        C0276.m1702();
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Application m1790(@NotNull Object obj, @Nullable Instrumentation instrumentation) {
        try {
            C0344<Application> c0344 = f710;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.FALSE;
            objArr[1] = instrumentation;
            return c0344.m2127(obj, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ Application m1780(BinderC0293 binderC0293, Object obj, Instrumentation instrumentation, int i, Object obj2) {
        if ((i & 2) != 0) {
            instrumentation = null;
        }
        return binderC0293.m1790(obj, instrumentation);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0382
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1793(@NotNull C0355 c0355) {
        C0276.f576.m1704(c0355);
        f708.post(() -> {
            m1784(r1);
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (lu.die.foza.SleepyFox.C0276.f576.m1708() != false) goto L30;
     */
    @Override // lu.die.foza.SleepyFox.AbstractC0382
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo1796(int r6, @org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.BinderC0293.mo1796(int, android.os.Bundle):int");
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final void m1781(Bundle bundle) {
        C0115 c0115 = C0115.f182;
        boolean z = bundle.getBoolean(C0281.C0282.f594);
        c0115.getClass();
        C0115.f183 = z;
        C0321.f756.m1901();
        C0327.f772.m2017();
        C0222.f333.getClass();
        C0222.f336.clear();
        C0226.f423.m1272();
        C0276.f576.m1706();
    }
}
