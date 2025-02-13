package lu.die.foza.SleepyFox;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.app.Notification;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import lu.die.foza.SleepyFox.AbstractC0397;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ޠ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޠ.class */
public final class C0209 extends AbstractC0069<AbstractC0397> {
    @NotNull

    /* renamed from: Ԫ */
    public static final C0210 f304 = new C0210();
    @NotNull

    /* renamed from: ԫ */
    public static final C0209 f305 = new C0209();

    /* renamed from: Ԩ */
    public boolean f306 = true;
    @NotNull

    /* renamed from: ԩ */
    public final String f307 = BinderC0230.class.getName();

    /* renamed from: lu.die.foza.SleepyFox.ޠ$Ϳ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޠ$Ϳ.class */
    public static final class C0210 {
        public C0210() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: Ϳ */
        public final C0209 m1184() {
            return C0209.f305;
        }

        public /* synthetic */ C0210(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ޠ$Ԩ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޠ$Ԩ.class */
    public /* synthetic */ class C0211 extends FunctionReferenceImpl implements Function1<IBinder, AbstractC0397> {
        public static final C0211 INSTANCE = new C0211();

        public C0211() {
            super(1, AbstractC0397.AbstractBinderC0399.class, "asInterface", "asInterface(Landroid/os/IBinder;)Llu/die/fozalib/IScaleActivityManager;", 0);
        }

        public final AbstractC0397 invoke(IBinder iBinder) {
            return AbstractC0397.AbstractBinderC0399.m2283(iBinder);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ޠ$Ԫ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޠ$Ԫ.class */
    public static final class C0212 extends Lambda implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0212() {
            super(0);
            C0209.this = r5;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object m1186invoke() {
            invoke();
            return Unit.INSTANCE;
        }

        public final void invoke() {
            if (C0505.f1096.m2473()) {
                C0209 c0209 = C0209.this;
                c0209.f306 = c0209.m1149();
            }
        }
    }

    /* renamed from: ֈ */
    public final boolean m1149() {
        try {
            AbstractC0397 m656 = m656();
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            C0355 c0355 = C0276.f581;
            c0276.getClass();
            m656.mo1323(c0355, BinderC0293.f705);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: ԭ */
    public static final C0209 m1150() {
        f304.getClass();
        return f305;
    }

    /* renamed from: ԫ */
    public static final /* synthetic */ C0209 m1151() {
        return f305;
    }

    @Nullable
    /* renamed from: ԯ */
    public final AbstractC0387 m1155() {
        try {
            return m656().mo1302();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ՠ */
    public final void m1157() {
        try {
            m656().mo1310();
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: ԩ */
    public final boolean m1160(@Nullable String str, @Nullable String str2) {
        return m1147(str, str2, 0);
    }

    /* renamed from: Ԩ */
    public final boolean m1162(@Nullable String str, @Nullable String str2) {
        return m1147(str, str2, 2);
    }

    /* renamed from: Ԫ */
    public final void m1165(@Nullable String str, @Nullable String str2) {
        try {
            m656().mo1311(str, str2);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @NotNull
    /* renamed from: Ԯ */
    public final String m1180() {
        return C0281.C0289.m1746();
    }

    /* renamed from: Ԭ */
    public final void m1182() {
        try {
            m656().mo1322();
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: ԭ */
    public final void m1156(@NotNull String str, @NotNull String str2) {
        try {
            m656().mo1303(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԭ */
    public final void m1163(@Nullable String str, @Nullable String str2) {
        m1148(str, str2, false);
    }

    /* renamed from: ԫ */
    public final void m1164(@Nullable String str, @Nullable String str2) {
        m1148(str, str2, true);
    }

    /* renamed from: ԩ */
    public final void m1178(int i) {
        try {
            AbstractC0397 m656 = m656();
            C0153 c0153 = C0153.f201;
            C0276.f576.getClass();
            m656.mo1320(c0153.m721(C0276.f577, i));
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final List<ActivityManager.RunningAppProcessInfo> m1183(int i) {
        try {
            return m656().mo1324(i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final Intent m1158(@Nullable Intent intent, @Nullable String str) {
        try {
            return m656().mo1301(intent, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return intent;
        }
    }

    /* renamed from: Ϳ */
    public final int m1169(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable IServiceConnection iServiceConnection, @Nullable String str) {
        try {
            return m656().mo1307(intent, serviceInfo, iServiceConnection != null ? iServiceConnection.asBinder() : null, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -1;
        }
    }

    /* renamed from: Ϳ */
    public final int m1173(@NotNull Intent intent, @NotNull String str) {
        try {
            return m656().mo1315(intent, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -1;
        }
    }

    /* renamed from: Ԩ */
    public final void m1176(@Nullable Intent intent) {
        try {
            m656().mo1318(intent);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ϳ */
    public final boolean m1147(String str, String str2, int i) {
        try {
            return m656().mo1313(str, str2, i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return false;
        }
    }

    /* renamed from: ԩ */
    public final void m1159(@Nullable Intent intent, @Nullable String str) {
        try {
            m656().mo1309(intent, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ԩ */
    public final void m1181(@Nullable String str) {
        if (str != null) {
            try {
                C0281.C0289.m1747(str);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Ϳ */
    public final boolean m1161(@Nullable String str, @Nullable String str2) {
        return m1147(str, str2, 1);
    }

    /* renamed from: Ԩ */
    public final int m1168(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable String str) {
        try {
            return m656().mo1306(intent, serviceInfo, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -1;
        }
    }

    /* renamed from: Ϳ */
    public final void m1175(@NotNull IIntentReceiver iIntentReceiver) {
        try {
            m656().mo1317(iIntentReceiver.asBinder());
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ϳ */
    public final int m1171(@NotNull IServiceConnection iServiceConnection) {
        try {
            return m656().mo1308(iServiceConnection.asBinder());
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -1;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    @NotNull
    /* renamed from: Ϳ */
    public String mo650() {
        return this.f307;
    }

    @Nullable
    /* renamed from: Ϳ */
    public final String m1177(int i) {
        try {
            return m656().mo1319(i);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final int m1170(@Nullable ProviderInfo providerInfo, @Nullable String str) {
        try {
            return m656().mo1304(providerInfo, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return -1;
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final Intent m1172(@Nullable Intent intent) {
        try {
            AbstractC0397 m656 = m656();
            C0276.f576.getClass();
            return m656.mo1314(intent, C0276.f577);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final void m1166(@Nullable String str) {
        m1165(str, null);
    }

    /* renamed from: Ϳ */
    public final void m1148(String str, String str2, boolean z) {
        try {
            m656().mo1312(str, str2, z);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ϳ */
    public final void m1174(@NotNull IntentFilter intentFilter, @NotNull IIntentReceiver iIntentReceiver, @Nullable String str) {
        try {
            AbstractC0397 m656 = m656();
            IBinder asBinder = iIntentReceiver.asBinder();
            if (str == null || str.length() == 0) {
                str = C0276.f576.m1713();
            }
            m656.mo1316(intentFilter, asBinder, str, BinderC0293.f705);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    /* renamed from: Ϳ */
    public void mo651(@NotNull IBinder iBinder) {
        m655(iBinder, C0211.INSTANCE, new C0212());
        try {
            if (this.f306) {
                return;
            }
            AbstractC0397 abstractC0397 = (AbstractC0397) this.f171;
            if (abstractC0397 == null || !abstractC0397.asBinder().isBinderAlive()) {
                return;
            }
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            C0355 c0355 = C0276.f581;
            c0276.getClass();
            abstractC0397.mo1323(c0355, BinderC0293.f705);
            this.f306 = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final void m1179(int i, int i2, @Nullable Notification notification) {
        try {
            AbstractC0397 m656 = m656();
            long m721 = C0153.f201.m721(i, i2);
            C0276.f576.getClass();
            m656.mo1321(m721, notification, C0276.f577);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ComponentName m1167(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable String str) {
        try {
            return m656().mo1305(intent, serviceInfo, str);
        } catch (Exception unused) {
            C0321.f756.m1895();
            return null;
        }
    }
}
