package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nDiscoveryLocalReceiverEnhancer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalReceiverEnhancer.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalReceiverEnhancer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,175:1\n13309#2,2:176\n*S KotlinDebug\n*F\n+ 1 DiscoveryLocalReceiverEnhancer.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalReceiverEnhancer\n*L\n126#1:176,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.߾  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/߾.class */
public final class C0225 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0225 f418 = new C0225();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0154<String, ActivityInfo> f419 = new C0154<>();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0154<String, WeakReference<BroadcastReceiver>> f420 = new C0154<>();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0343<BroadcastReceiver.PendingResult> f421;
    @Nullable

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final Object f422;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final void m1256(String str, Intent intent) {
        try {
            C0276 c0276 = C0276.f576;
            String m1713 = c0276.m1713();
            if (m1713 == null) {
                return;
            }
            BroadcastReceiver m1261 = f418.m1261(str);
            if (m1261 == null) {
                return;
            }
            c0276.getClass();
            Context m1791 = BinderC0293.f705.m1791(m1713);
            intent.setExtrasClassLoader(c0276.m1720(m1713));
            Unit unit = Unit.INSTANCE;
            m1261.onReceive(m1791, intent);
        } catch (Throwable unused) {
        }
    }

    static {
        Object obj;
        C0343<BroadcastReceiver.PendingResult> c0343 = new C0343<>("mPendingResult");
        try {
            c0343.m2101(BroadcastReceiver.class);
        } catch (Exception unused) {
        }
        f421 = c0343;
        try {
            Constructor<?> constructor = BroadcastReceiver.PendingResult.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length = parameterTypes.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = C0301.f718.m1824(parameterTypes[i]);
            }
            obj = constructor.newInstance(Arrays.copyOf(objArr, length));
            new C0343("mInitialStickyHint").m2104(obj, Boolean.TRUE);
        } catch (Exception unused2) {
            obj = null;
        }
        f422 = obj;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1260() {
        PackageInfo m1918;
        try {
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            if (C0276.f578) {
                C0245.f512.getClass();
                m1918 = C0245.f513.m1430(c0276.m1713(), 2);
            } else {
                m1918 = C0323.f761.m1918(c0276.m1713(), 2);
            }
            PackageInfo packageInfo = m1918;
            ActivityInfo[] activityInfoArr = packageInfo != null ? packageInfo.receivers : null;
            if (activityInfoArr == null) {
                return;
            }
            ActivityInfo[] activityInfoArr2 = activityInfoArr;
            String m1714 = c0276.m1714();
            int length = activityInfoArr2.length;
            for (int i = 0; i < length; i++) {
                ActivityInfo activityInfo = activityInfoArr[i];
                if (Intrinsics.areEqual(activityInfo.processName, m1714)) {
                    try {
                        if (StringsKt.startsWith$default(activityInfo.name, '.', false, 2, (Object) null)) {
                            activityInfo.name = activityInfo.packageName + activityInfo.name;
                        }
                        f419.put(activityInfo.name, activityInfo);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final BroadcastReceiver m1261(String str) {
        try {
            C0154<String, WeakReference<BroadcastReceiver>> c0154 = f420;
            WeakReference<BroadcastReceiver> weakReference = c0154.get(str);
            if (weakReference != null) {
                BroadcastReceiver broadcastReceiver = weakReference.get();
                if (broadcastReceiver != null) {
                    return broadcastReceiver;
                }
            }
            ActivityInfo activityInfo = f419.get(str);
            if (activityInfo == null) {
                return null;
            }
            C0276 c0276 = C0276.f576;
            String m1713 = c0276.m1713();
            if (m1713 == null) {
                return null;
            }
            Object newInstance = c0276.m1720(m1713).loadClass(activityInfo.name).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type android.content.BroadcastReceiver");
            BroadcastReceiver broadcastReceiver2 = (BroadcastReceiver) newInstance;
            try {
                f421.m2104(broadcastReceiver2, f422);
            } catch (Exception unused) {
            }
            c0154.put(str, new WeakReference<>(broadcastReceiver2));
            return broadcastReceiver2;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1259(@NotNull String str, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            BinderC0293.f705.getClass();
            BinderC0293.f708.post(() -> {
                m1256(r1, r2);
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1258(@NotNull IBinder iBinder, @NotNull Intent intent) {
        try {
            BinderC0293.f705.getClass();
            ActivityThread.ApplicationThread applicationThread = BinderC0293.f707.getApplicationThread();
            IIntentReceiver asInterface = IIntentReceiver.Stub.asInterface(iBinder);
            Bundle bundle = Bundle.EMPTY;
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            int i = C0276.f584;
            c0276.getClass();
            applicationThread.scheduleRegisteredReceiver(asInterface, intent, -1, (String) null, bundle, false, false, true, i, -1, i, "android");
        } catch (Throwable unused) {
        }
    }
}
