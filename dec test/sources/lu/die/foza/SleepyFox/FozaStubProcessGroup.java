package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.VpnService;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\u0018�� \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubProcessGroup;", "Landroid/app/Service;", "<init>", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "enrollStopForeground", C0019.f56, "onStartCommand", C0019.f56, "flags", "startId", "Companion", "foza_release"})
@SourceDebugExtension({"SMAP\nFozaStubProcessGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaStubProcessGroup.kt\nlu/die/foza/SleepyFox/FozaStubProcessGroup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubProcessGroup.class */
public final class FozaStubProcessGroup extends Service {
    @NotNull

    /* renamed from: Ϳ */
    public static final Companion f30 = new Companion();
    @Nullable

    /* renamed from: Ԩ */
    public static Object f31;
    @Nullable

    /* renamed from: ԩ */
    public static FozaStubProcessGroup f32;

    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubProcessGroup$Companion.class */
    public static final class Companion {

        @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubProcessGroup$Companion$FozaVpnService;", "Landroid/net/VpnService;", "<init>", "()V", "onStartCommand", C0019.f56, "intent", "Landroid/content/Intent;", "flags", "startId", "foza_release"})
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubProcessGroup$Companion$FozaVpnService.class */
        public static final class FozaVpnService extends VpnService {
            /* renamed from: Ϳ */
            public static final void m68(FozaVpnService fozaVpnService) {
                fozaVpnService.stopForeground(1);
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }

            @Override // android.app.Service
            public int onStartCommand(@Nullable Intent intent, int i, int i2) {
                try {
                    C0248.f515.getClass();
                    C0248.f516.getClass();
                    if (C0175.f261) {
                        BinderC0293.f705.getClass();
                        BinderC0293.f708.postDelayed(() -> {
                            m68(r1);
                        }, 3000L);
                    }
                } catch (Exception unused) {
                }
                return FozaStubProcessGroup.f30.m65(new Intent(intent).putExtra(C0281.C0282.f617, true), this);
            }
        }

        public Companion() {
        }

        @RequiresApi(26)
        /* renamed from: Ϳ */
        public final void m67(Context context) {
            try {
                Object obj = FozaStubProcessGroup.f31;
                Object obj2 = obj;
                if (!(obj instanceof NotificationManager)) {
                    Object systemService = context.getSystemService(NotificationManager.class);
                    obj2 = systemService;
                    FozaStubProcessGroup.f31 = systemService;
                }
                if (obj2 == null || ((NotificationManager) obj2).getNotificationChannel(C0281.C0289.f685) != null) {
                    return;
                }
                Object obj3 = obj2;
                NotificationChannel notificationChannel = new NotificationChannel(C0281.C0289.f685, C0281.C0289.f685, 2);
                notificationChannel.setDescription("Only for foza default - typedef.cn");
                ((NotificationManager) obj3).createNotificationChannel(notificationChannel);
            } catch (Exception unused) {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: Ϳ */
        public final FozaStubProcessGroup m66() {
            return FozaStubProcessGroup.f32;
        }

        /* renamed from: Ϳ */
        public final int m65(@Nullable Intent intent, @NotNull Service service) {
            if (intent == null) {
                return 2;
            }
            try {
                if (service instanceof FozaStubProcessGroup) {
                    FozaStubProcessGroup.f32 = (FozaStubProcessGroup) service;
                }
                if (!intent.getBooleanExtra(C0281.C0282.f617, false)) {
                    return 2;
                }
                if (!C0175.f262) {
                    service.startForeground(12580, new Notification());
                    return 2;
                }
                Notification notification = null;
                try {
                    Notification notification2 = (Notification) intent.getParcelableExtra(C0281.C0282.f618);
                    if (notification2 != null) {
                        notification = notification2;
                    }
                } catch (Exception unused) {
                }
                if (notification == null) {
                    Notification.Builder smallIcon = new Notification.Builder(service, C0281.C0289.f685).setAutoCancel(true).setShowWhen(true).setLargeIcon(BitmapFactory.decodeResource(service.getResources(), 17629184)).setSmallIcon(17629184);
                    try {
                        Context m1701 = C0276.m1701();
                        PackageManager packageManager = C0321.m1885().getPackageManager();
                        C0276.f576.getClass();
                        smallIcon.setContentIntent(PendingIntent.getActivity(m1701, 0, packageManager.getLaunchIntentForPackage(C0276.f583), 67108864));
                    } catch (Exception unused2) {
                    }
                    notification = smallIcon.setContentTitle("Starting Service").setContentText("Starting monitoring service").build();
                }
                if (Intrinsics.areEqual(notification.getChannelId(), C0281.C0289.f685)) {
                    m67(service);
                }
                if (C0175.f271) {
                    service.startForeground(12580, notification, intent.getIntExtra(C0281.C0282.f594, C0175.f274 ? 1073741824 : 0));
                    return 2;
                }
                service.startForeground(12580, notification);
                return 2;
            } catch (Exception unused3) {
                return 2;
            }
        }
    }

    /* renamed from: Ԩ */
    public static final /* synthetic */ FozaStubProcessGroup m62() {
        return f32;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            C0321.f756.m1896(extras);
        }
        BinderC0293 binderC0293 = BinderC0293.f705;
        binderC0293.getClass();
        return binderC0293;
    }

    /* renamed from: ԩ */
    public final void m64() {
        try {
            if (!C0175.f261) {
                return;
            }
            stopForeground(1);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        return f30.m65(intent, this);
    }
}
