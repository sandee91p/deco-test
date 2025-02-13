package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SuppressLint({"StaticFieldLeak"})
/* renamed from: lu.die.foza.SleepyFox.ࢺ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢺ.class */
public final class C0321 {
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final ThreadPoolExecutor f758;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0321 f756 = new C0321();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Context f757 = C0310.f729.m1850();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final ConcurrentLinkedDeque<Future<?>> f759 = new ConcurrentLinkedDeque<>();

    @JvmStatic
    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final Context m1885() {
        return f757;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final void m1886() {
        C0371 c0371 = C0371.f877;
        c0371.getClass();
        try {
            c0371.m2253();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final void m1887() {
        if (C0175.f272) {
            C0115.f182.m699(new C0363(), new C0497());
        }
        if (C0175.f258) {
            C0115 c0115 = C0115.f182;
            C0013 c0013 = new C0013();
            c0115.getClass();
            try {
                c0013.mo86();
            } catch (Throwable unused) {
            }
        }
        if (C0175.f262) {
            C0115.f182.m699(new C0169(), new C0204(), new C0028(), new C0050());
        }
        if (C0175.f270) {
            C0115.f182.m699(new C0048(), new C0011());
        } else {
            C0115 c01152 = C0115.f182;
            C0224 c0224 = new C0224();
            c01152.getClass();
            try {
                c0224.mo86();
            } catch (Throwable unused2) {
            }
        }
        if (C0175.f271) {
            C0115.f182.m699(new C0127(), new C0026());
        }
        if (C0175.f264) {
            C0115 c01153 = C0115.f182;
            C0200 c0200 = new C0200();
            c01153.getClass();
            try {
                c0200.mo86();
            } catch (Throwable unused3) {
            }
        }
        if (C0175.f267) {
            C0115 c01154 = C0115.f182;
            C0373 c0373 = new C0373();
            c01154.getClass();
            try {
                c0373.mo86();
            } catch (Throwable unused4) {
            }
        }
        if (C0175.f272 && C0175.f266) {
            C0115 c01155 = C0115.f182;
            C0372 c0372 = new C0372();
            c01155.getClass();
            try {
                c0372.mo86();
            } catch (Throwable unused5) {
            }
        }
        C0115 c01156 = C0115.f182;
        c01156.getClass();
        if (C0115.f183) {
            C0453 c0453 = new C0453();
            c01156.getClass();
            try {
                c0453.mo86();
            } catch (Throwable unused6) {
            }
        }
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final void m1888() {
        C0115.f182.m699(new C0252());
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final void m1889() {
        C0115.f182.m699(new C0251());
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final void m1890() {
        C0115.f182.m699(new C0116(), new C0059(), new C0498(), new C0465(), new C0171(), new C0150(), new C0435(), new C0141(), new C0195());
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public static final void m1891() {
        C0115.f182.m699(new C0450(), new C0190(), new C0206(), new C0196(), new C0063(), new C0021(), new C0181(), new C0250(), new C0464(), new C0437());
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final void m1892() {
        C0115.f182.m699(new C0022(), new C0137(), new C0478(), new C0129(), new C0168(), new C0415(), new C0072(), new C0503(), new C0454());
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f758 = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public final ThreadPoolExecutor m1894() {
        return f758;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m1895() {
        ComponentName componentName;
        try {
            Context context = f757;
            componentName = context.startService(new Intent(context, FozaStubJobService.class));
        } catch (Exception unused) {
            try {
                Context context2 = f757;
                context2.sendBroadcast(new Intent(context2, FozaStubReceiver.class).setAction(context2.getPackageName() + ".st.receiver").putExtra("Are you Okay?", 114514));
                componentName = Unit.INSTANCE;
            } catch (Exception unused2) {
                componentName = Unit.INSTANCE;
            }
        }
        return componentName;
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final C0321 m1897() {
        try {
            Context context = f757;
            Bundle call = context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + C0281.C0289.f677), "init", (String) null, (Bundle) null);
            if (call != null) {
                m1896(call);
            }
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public final void m1899() {
        while (true) {
            try {
                ConcurrentLinkedDeque<Future<?>> concurrentLinkedDeque = f759;
                if (!(!concurrentLinkedDeque.isEmpty())) {
                    return;
                }
                concurrentLinkedDeque.pop().get();
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1900() {
        m1901();
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final void m1901() {
        try {
            if (Debug.isDebuggerConnected()) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = f758;
            m1898(threadPoolExecutor.submit(C0321::m1886));
            m1898(threadPoolExecutor.submit(C0321::m1887));
            m1898(threadPoolExecutor.submit(C0321::m1888));
            m1898(threadPoolExecutor.submit(C0321::m1889));
            m1898(threadPoolExecutor.submit(C0321::m1890));
            m1898(threadPoolExecutor.submit(C0321::m1891));
            m1898(threadPoolExecutor.submit(C0321::m1892));
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m1898(@NotNull Future<?> future) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(f759.add(future));
        } catch (Exception unused) {
            bool = Unit.INSTANCE;
        }
        return bool;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1896(@NotNull Bundle bundle) {
        C0209.f304.getClass();
        C0209.m1151().m652(bundle);
        C0245.f512.getClass();
        C0245.m1422().m652(bundle);
        C0214.f312.m652(bundle);
        C0207.f302.m652(bundle);
    }
}
