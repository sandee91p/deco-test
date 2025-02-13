package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.ComponentName;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ၺ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ.class */
public final class C0465 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ၺ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ$Ϳ.class */
    public static final class C0466 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, Notification.class);
                if (m722 >= 0) {
                    C0220.f323.getClass();
                    C0220 c0220 = C0220.f324;
                    Object obj = objArr[m722];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Notification");
                    Notification m1223 = c0220.m1223(((Notification) obj).clone());
                    if (m1223 != null) {
                        objArr[m722] = m1223;
                    }
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၺ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ$Ԩ.class */
    public static final class C0467 extends C0301 {
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

    /* renamed from: lu.die.foza.SleepyFox.ၺ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ$Ԫ.class */
    public static final class C0468 extends C0301 {

        /* renamed from: ԯ  reason: contains not printable characters */
        public final int f1076;

        public C0468() {
            this.f1076 = C0175.f271 ? 3 : 1;
        }

        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int length = objArr.length;
                int i = this.f1076;
                if (length > i) {
                    C0220.f323.getClass();
                    objArr[i] = C0220.f324.m1218(String.valueOf(objArr[this.f1076]));
                }
            } catch (Exception unused) {
            }
            Object mo85 = super.mo85(c0253);
            if (C0175.f262 && (mo85 instanceof NotificationChannel)) {
                C0220.f323.getClass();
                C0220.f324.m1219((NotificationChannel) mo85);
            }
            return mo85;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၺ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ$Ԭ.class */
    public static final class C0469 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        @RequiresApi(26)
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object m2408 = m2408(c0253);
                if (m2408 != null) {
                    c0253.f519[1] = m2408;
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @RequiresApi(26)
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Object m2408(C0253 c0253) {
            Object obj;
            Object[] objArr = c0253.f519;
            if (objArr.length <= 1 || (obj = objArr[1]) == null) {
                return null;
            }
            C0495 c0495 = C0495.f1089;
            List<?> m2455 = c0495.m2455(obj);
            List<?> list = m2455;
            if (!(m2455 instanceof List)) {
                list = null;
            }
            C0220.f323.getClass();
            List<NotificationChannel> m1222 = C0220.f324.m1222((List<NotificationChannel>) list);
            return c0495.m2456(obj.getClass()) ? c0495.m2458((List<?>) m1222) : m1222;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၺ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ$Ԯ.class */
    public static final class C0470 extends C0301 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        @RequiresApi(26)
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object mo85 = super.mo85(c0253);
            try {
                C0495 c0495 = C0495.f1089;
                List<?> m2455 = c0495.m2455(mo85);
                List<?> list = m2455;
                if (!(m2455 instanceof List)) {
                    list = null;
                }
                C0220.f323.getClass();
                List<NotificationChannel> m1220 = C0220.f324.m1220((List<NotificationChannel>) list);
                return c0495.m2456(c0253.f518.getReturnType()) ? c0495.m2458((List<?>) m1220) : m1220;
            } catch (Exception unused) {
                return mo85;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၺ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၺ$ՠ.class */
    public static final class C0471 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                Object obj = objArr[1];
                if (obj != null) {
                    C0220.f323.getClass();
                    objArr[1] = C0220.f324.m1218(obj.toString());
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = new C0466();
            C0033 m643 = m643("notification");
            if (m643 == null) {
                return;
            }
            Object obj = m643.f100;
            try {
                C0047 c0047 = C0047.f129;
                c0047.m469("android.app.NotificationManager", "sService", obj);
                c0047.m469(Toast.class.getName(), "sService", obj);
            } catch (Exception unused) {
            }
            if (C0175.f262) {
                m2407(m643);
            }
            C0467 c0467 = new C0467();
            String[] strArr = new String[2];
            strArr[0] = "requestBindListener";
            strArr[1] = "registerListener";
            m643.m377(c0467, strArr);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2407(C0033 c0033) {
        c0033.m374("getNotificationChannel", new C0468());
        c0033.m374("createNotificationChannels", new C0469());
        c0033.m374("getNotificationChannels", new C0470());
        c0033.m374("deleteNotificationChannel", new C0471());
    }
}
