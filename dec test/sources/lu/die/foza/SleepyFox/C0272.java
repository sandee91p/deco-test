package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢤ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢤ.class */
public final class C0272 {
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Timer f570;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final Handler f572;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0272 f569 = new C0272();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0164<String> f571 = new C0164<>();
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final HashSet<String> f573 = SetsKt.hashSetOf(new String[]{"com.tencent.mm", "com.tencent.mobileqq", "com.tencent.tim", "com.taobao.idlefish"});

    /* renamed from: lu.die.foza.SleepyFox.ࢤ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢤ$Ϳ.class */
    public static final class C0273 extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C0272.f569.m1698();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("AppServant");
        handlerThread.start();
        f572 = new Handler(handlerThread.getLooper());
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1698() {
        try {
            Intent intent = new Intent("android.intent.action.BOOT_COMPLETED");
            Iterator<String> it = f571.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C0325 c0325 = C0325.f765;
                if (c0325.m1991(next)) {
                    if (Intrinsics.areEqual(next, "com.taobao.idlefish")) {
                        boolean m1992 = c0325.m1992("com.taobao.idlefish");
                        String[] m2012 = c0325.m2012("com.taobao.idlefish");
                        int length = m2012.length > 3 ? 3 : m2012.length;
                        while (true) {
                            int i = length - 1;
                            length = i;
                            if (i >= 0) {
                                C0265 c0265 = C0265.f550;
                                C0044 m1688 = c0265.m1688("com.taobao.idlefish", "com.taobao.idlefish", m2012[length]);
                                C0044 c0044 = m1688;
                                if (m1688 == null) {
                                    C0044 m1642 = C0265.m1642(c0265, "com.taobao.idlefish", "com.taobao.idlefish", m2012[length], m1992, 3, null, 32, null);
                                    if (m1642 != null) {
                                        m1642.f121.block(C0281.C0289.f682);
                                        c0044 = m1642;
                                    } else {
                                        c0044 = null;
                                    }
                                    if (c0044 == null) {
                                    }
                                }
                                C0035.m382(C0035.f103, c0044, C0175.f274 ? 1073741824 : 0, null, 4, null);
                            }
                        }
                    } else {
                        intent.setPackage(next);
                        boolean m19922 = c0325.m1992(next);
                        List<ResolveInfo> m1940 = m19922 ? C0325.m1940(c0325, intent, null, 0, 4, null) : C0323.m1904(C0323.f761, intent, 0, 2, (Object) null);
                        if (!(m1940 == null || m1940.isEmpty())) {
                            for (ResolveInfo resolveInfo : m1940) {
                                ActivityInfo activityInfo = resolveInfo.activityInfo;
                                String str = activityInfo.processName;
                                String[] m20122 = C0325.f765.m2012(next);
                                Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = m20122.length > 3 ? 3 : m20122.length;
                                while (true) {
                                    int i2 = intRef.element - 1;
                                    intRef.element = i2;
                                    if (i2 >= 0) {
                                        C0265 c02652 = C0265.f550;
                                        C0044 m16882 = c02652.m1688(next, str, m20122[i2]);
                                        C0044 c00442 = m16882;
                                        if (m16882 == null) {
                                            C0044 m16422 = C0265.m1642(c02652, next, str, m20122[intRef.element], m19922, 3, null, 32, null);
                                            c00442 = m16422;
                                            if (m16422 != null) {
                                                c00442.f121.block(C0281.C0289.f682);
                                                f572.postDelayed(() -> {
                                                    m1693(r1, r2, r3, r4);
                                                }, C0281.C0289.f682);
                                            } else {
                                                c00442 = null;
                                            }
                                            if (c00442 == null) {
                                            }
                                        }
                                        if (!StringsKt.endsWith$default(str, ":push", false, 2, (Object) null)) {
                                            String lowerCase = str.toLowerCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                            if (!StringsKt.endsWith$default(lowerCase, ":msf", false, 2, (Object) null) && !Intrinsics.areEqual(next, "com.tencent.mm")) {
                                            }
                                        }
                                        C0035.m382(C0035.f103, c00442, C0175.f274 ? 1073741824 : 0, null, 4, null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0325 c03252 = C0325.f765;
            if (!c03252.m1991("com.tencent.mm")) {
                return;
            }
            String[] m20123 = c03252.m2012("com.tencent.mm");
            int length2 = m20123.length > 3 ? 3 : m20123.length;
            while (true) {
                int i3 = length2 - 1;
                length2 = i3;
                if (i3 < 0) {
                    return;
                }
                C0044 m16883 = C0265.f550.m1688("com.tencent.mm", "com.tencent.mm", m20123[length2]);
                if (m16883 != null) {
                    C0035.m382(C0035.f103, m16883, C0175.f274 ? 1073741824 : 0, null, 4, null);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1696() {
        Timer timer = f570;
        if (timer != null) {
            timer.cancel();
            f570 = null;
            f571.clear();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1697(@NotNull String str) {
        if (!f573.contains(str)) {
            return;
        }
        f571.add(str);
        if (f570 != null) {
            return;
        }
        Timer timer = new Timer();
        f570 = timer;
        timer.schedule(new C0273(), 5000L, 20000L);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1693(String[] strArr, Ref.IntRef intRef, String str, ActivityInfo activityInfo) {
        try {
            C0265 c0265 = C0265.f550;
            Intent intent = new Intent("android.intent.action.BOOT_COMPLETED");
            intent.setComponent(new ComponentName(str, activityInfo.name));
            c0265.m1682(intent, strArr[intRef.element]);
        } catch (Exception unused) {
        }
    }
}
