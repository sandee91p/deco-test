package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nDiscoveryLocalNotificationObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalNotificationObserver.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalNotificationObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1855#2,2:305\n1855#2,2:309\n13309#3,2:307\n1#4:311\n*S KotlinDebug\n*F\n+ 1 DiscoveryLocalNotificationObserver.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalNotificationObserver\n*L\n101#1:305,2\n162#1:309,2\n138#1:307,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ޥ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޥ.class */
public final class C0220 {
    @NotNull

    /* renamed from: ԭ */
    public static final C0221 f323 = new C0221();
    @NotNull

    /* renamed from: Ԯ */
    public static final C0220 f324 = new C0220();
    @NotNull

    /* renamed from: ԯ */
    public static final String f325 = "inner";
    @NotNull

    /* renamed from: ՠ */
    public static final String f326 = "@";
    @NotNull

    /* renamed from: Ϳ */
    public final C0343<Object> f327 = new C0343<>("mId");
    @NotNull

    /* renamed from: Ԩ */
    public final C0343<Integer> f328 = new C0343<>("mType");
    @NotNull

    /* renamed from: ԩ */
    public final C0343<Object> f329 = new C0343<>("mObj1");
    @NotNull

    /* renamed from: Ԫ */
    public final C0343<String> f330 = new C0343<>("mString1");
    @NotNull

    /* renamed from: ԫ */
    public final C0343<Integer> f331 = new C0343<>("mInt1");
    @NotNull

    /* renamed from: Ԭ */
    public final C0343<Object> f332 = new C0343<>("mChannelId");

    /* renamed from: lu.die.foza.SleepyFox.ޥ$Ϳ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޥ$Ϳ.class */
    public static final class C0221 {
        public C0221() {
        }

        @NotNull
        /* renamed from: Ϳ */
        public final C0220 m1234() {
            return C0220.f324;
        }

        public /* synthetic */ C0221(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: Ϳ */
    public static final /* synthetic */ C0220 m1216() {
        return f324;
    }

    @RequiresApi(26)
    /* renamed from: Ԩ */
    public final void m1224(@Nullable String str) {
        try {
            Object systemService = C0276.m1701().getSystemService("notification");
            Intrinsics.checkNotNull(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            String m1225 = m1225(str);
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                String id = notificationChannel.getId();
                if (StringsKt.startsWith$default(id, m1225, false, 2, (Object) null)) {
                    try {
                        notificationManager.deleteNotificationChannel(id);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: ԩ */
    public final String m1225(String str) {
        return "inner@" + str + '@';
    }

    /* renamed from: ԫ */
    public final String m1228(String str) {
        String m1225 = m1225(C0276.f576.m1713());
        if (str == null || !StringsKt.startsWith$default(str, m1225, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(m1225.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* renamed from: Ԫ */
    public final boolean m1229(String str) {
        if (str != null) {
            try {
                return StringsKt.startsWith$default(str, m1225(C0276.f576.m1713()), false, 2, (Object) null);
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: Ϳ */
    public final String m1218(@Nullable String str) {
        return m1226(C0276.f576.m1713(), str);
    }

    /* renamed from: Ԩ */
    public final String m1227() {
        return C0276.f576.m1713();
    }

    @SuppressLint({"ResourceType"})
    @Nullable
    /* renamed from: Ԩ */
    public final Notification m1223(@Nullable Notification notification) {
        if (notification == null) {
            return null;
        }
        try {
            if (C0175.f262) {
                String channelId = notification.getChannelId();
                this.f332.m2104(notification, channelId == null || channelId.length() == 0 ? m1218(C0281.C0289.f685) : m1218(channelId));
            }
            C0276.f576.getClass();
            if (C0276.f578) {
                if (C0175.f260) {
                    Icon[] iconArr = new Icon[2];
                    iconArr[0] = notification.getSmallIcon();
                    iconArr[1] = notification.getLargeIcon();
                    m1231(iconArr);
                }
                notification.icon = 17629184;
                notification.tickerView = null;
                notification.contentView = null;
                notification.bigContentView = null;
                notification.headsUpContentView = null;
            }
            m1232(notification);
            notification.sound = m1233(notification.sound);
        } catch (Exception unused) {
        }
        return notification;
    }

    /* renamed from: Ϳ */
    public final String m1226(String str, String str2) {
        return Intrinsics.areEqual(str2, C0281.C0289.f685) ? str2 : m1225(str) + str2;
    }

    @RequiresApi(26)
    @Nullable
    /* renamed from: Ϳ */
    public final List<NotificationChannel> m1220(@Nullable List<NotificationChannel> list) {
        try {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (NotificationChannel notificationChannel : list) {
                    if (m1219(notificationChannel)) {
                        arrayList.add(notificationChannel);
                    }
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return list;
        }
    }

    @RequiresApi(26)
    @Nullable
    /* renamed from: Ԩ */
    public final NotificationChannel m1221(@Nullable NotificationChannel notificationChannel) {
        if (notificationChannel != null) {
            try {
                this.f327.m2104(notificationChannel, m1218(notificationChannel.getId()));
            } catch (Exception unused) {
            }
        }
        return notificationChannel;
    }

    @RequiresApi(26)
    /* renamed from: Ϳ */
    public final boolean m1219(@Nullable NotificationChannel notificationChannel) {
        if (notificationChannel != null) {
            try {
                if (!m1229(notificationChannel.getId())) {
                    return false;
                }
                this.f327.m2104(notificationChannel, m1228(notificationChannel.getId()));
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    @RequiresApi(26)
    @Nullable
    /* renamed from: Ԩ */
    public final List<NotificationChannel> m1222(@Nullable List<NotificationChannel> list) {
        if (list != null) {
            try {
                for (NotificationChannel notificationChannel : list) {
                    m1221(notificationChannel);
                }
            } catch (Exception unused) {
            }
        }
        return list;
    }

    /* renamed from: Ϳ */
    public final void m1232(Notification notification) {
        if (notification == null) {
            return;
        }
        try {
            notification.flags &= -3;
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final void m1230(Icon icon) {
        if (icon != null) {
            try {
                this.f328.m2119((Object) icon, 2);
                this.f329.m2104(icon, C0276.m1701().getResources());
                C0343<String> c0343 = this.f330;
                C0276.f576.getClass();
                c0343.m2104(icon, C0276.f583);
                this.f331.m2119((Object) icon, 17629184);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Ϳ */
    public final void m1231(Icon... iconArr) {
        try {
            for (Icon icon : iconArr) {
                m1230(icon);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[Catch: Exception -> 0x005d, TRY_ENTER, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0004, B:10:0x0010, B:14:0x001f, B:16:0x0024, B:18:0x002e, B:20:0x0033, B:21:0x0037, B:23:0x003d, B:24:0x0044, B:27:0x0051, B:33:0x0086, B:35:0x0095, B:37:0x00a4, B:38:0x00ab, B:40:0x00b2, B:41:0x00b9, B:42:0x00c3, B:45:0x00ce, B:47:0x0061, B:50:0x006e, B:51:0x0075), top: B:6:0x0004 }] */
    /* renamed from: Ϳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri m1233(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = r5
            if (r0 == 0) goto Ld7
            r0 = r5
            java.lang.String r0 = r0.getAuthority()     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r4 = r1
            if (r0 != 0) goto L10
            goto Ld7
        L10:
            r0 = r5
            java.lang.String r0 = r0.getScheme()     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = "content"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L1f
            r0 = r5
            return r0
        L1f:
            lu.die.foza.SleepyFox.FozaStubProvider$Ϳ r0 = lu.die.foza.SleepyFox.FozaStubProvider.f33     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r6 = r1
            r1 = r4
            int r1 = r1.hashCode()     // Catch: java.lang.Exception -> L5d
            boolean r0 = r0.m76(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto Ld5
            lu.die.foza.SleepyFox.ࢦ r0 = lu.die.foza.SleepyFox.C0276.f576     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r7 = r1
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L5d
            boolean r0 = lu.die.foza.SleepyFox.C0276.f578     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L61
            lu.die.foza.SleepyFox.ࡠ$Ϳ r0 = lu.die.foza.SleepyFox.C0245.f512     // Catch: java.lang.Exception -> L5d
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L5d
            lu.die.foza.SleepyFox.ࡠ r0 = lu.die.foza.SleepyFox.C0245.m1422()     // Catch: java.lang.Exception -> L5d
            r1 = r4
            android.content.pm.ProviderInfo r0 = r0.m1447(r1)     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r8 = r1
            if (r0 != 0) goto L7f
            lu.die.foza.SleepyFox.ࢼ r0 = lu.die.foza.SleepyFox.C0323.f761     // Catch: java.lang.Exception -> L5d
            r1 = r4
            android.content.pm.ProviderInfo r0 = r0.m1926(r1)     // Catch: java.lang.Exception -> L5d
        L58:
            r8 = r0
            goto L7f
        L5d:
            goto Ld5
        L61:
            lu.die.foza.SleepyFox.ࢼ r0 = lu.die.foza.SleepyFox.C0323.f761     // Catch: java.lang.Exception -> L5d
            r1 = r4
            android.content.pm.ProviderInfo r0 = r0.m1926(r1)     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r8 = r1
            if (r0 != 0) goto L7f
            lu.die.foza.SleepyFox.ࡠ$Ϳ r0 = lu.die.foza.SleepyFox.C0245.f512     // Catch: java.lang.Exception -> L5d
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L5d
            lu.die.foza.SleepyFox.ࡠ r0 = lu.die.foza.SleepyFox.C0245.m1422()     // Catch: java.lang.Exception -> L5d
            r1 = r4
            android.content.pm.ProviderInfo r0 = r0.m1447(r1)     // Catch: java.lang.Exception -> L5d
            goto L58
        L7f:
            r0 = r8
            if (r0 != 0) goto L86
            r0 = r5
            return r0
        L86:
            r0 = r8
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> L5d
            r1 = r7
            java.lang.String r1 = r1.m1713()     // Catch: java.lang.Exception -> L5d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto Ld5
            r0 = r8
            java.lang.String r0 = r0.processName     // Catch: java.lang.Exception -> L5d
            r1 = r7
            java.lang.String r1 = r1.m1714()     // Catch: java.lang.Exception -> L5d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto Lb2
            r0 = r6
            r1 = r5
            r2 = r7
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Exception -> L5d
            int r2 = lu.die.foza.SleepyFox.C0276.f577     // Catch: java.lang.Exception -> L5d
            android.net.Uri r0 = r0.m77(r1, r2)     // Catch: java.lang.Exception -> L5d
            return r0
        Lb2:
            lu.die.foza.SleepyFox.ޠ$Ϳ r0 = lu.die.foza.SleepyFox.C0209.f304     // Catch: java.lang.Exception -> L5d
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L5d
            lu.die.foza.SleepyFox.ޠ r0 = lu.die.foza.SleepyFox.C0209.m1151()     // Catch: java.lang.Exception -> L5d
            r1 = r8
            r2 = r7
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = lu.die.foza.SleepyFox.C0276.f579     // Catch: java.lang.Exception -> L5d
            int r0 = r0.m1170(r1, r2)     // Catch: java.lang.Exception -> L5d
            r1 = r0
            r4 = r1
            if (r0 <= 0) goto Ld5
            r0 = r6
            r1 = r5
            r2 = r4
            android.net.Uri r0 = r0.m77(r1, r2)     // Catch: java.lang.Exception -> L5d
            return r0
        Ld5:
            r0 = r5
            return r0
        Ld7:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0220.m1233(android.net.Uri):android.net.Uri");
    }
}
