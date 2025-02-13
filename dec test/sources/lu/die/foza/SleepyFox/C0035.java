package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import lu.die.foza.SleepyFox.AbstractC0382;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ˇ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ.class */
public final class C0035 {
    @NotNull

    /* renamed from: Ϳ */
    public static final C0035 f103 = new C0035();
    @Nullable

    /* renamed from: Ԩ */
    public static C0036 f104;

    /* renamed from: lu.die.foza.SleepyFox.ˇ$Ϳ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$Ϳ.class */
    public static final class C0036 {

        /* renamed from: Ϳ */
        public final int f105;
        @NotNull

        /* renamed from: Ԩ */
        public final AbstractC0382 f106;

        /* renamed from: ԩ */
        public final int f107;

        public C0036(int i, @NotNull AbstractC0382 abstractC0382, int i2) {
            this.f105 = i;
            this.f106 = abstractC0382;
            this.f107 = i2;
        }

        /* renamed from: Ԩ */
        public final int m401() {
            return this.f105;
        }

        @NotNull
        /* renamed from: Ϳ */
        public final AbstractC0382 m402() {
            return this.f106;
        }

        /* renamed from: ԩ */
        public final int m403() {
            return this.f107;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$Ԩ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$Ԩ.class */
    public /* synthetic */ class C0037 extends FunctionReferenceImpl implements Function2<Parcel, Integer, Unit> {
        public C0037(Object obj) {
            super(2, obj, C0334.class, "writeToParcel", "writeToParcel(Landroid/os/Parcel;I)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Parcel) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Parcel parcel, int i) {
            ((C0334) ((FunctionReferenceImpl) this).receiver).writeToParcel(parcel, i);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$Ԫ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$Ԫ.class */
    public static final class C0038 extends Lambda implements Function1<IBinder, Unit> {

        /* renamed from: Ϳ */
        public final /* synthetic */ C0044 f108;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0038(C0044 c0044) {
            super(1);
            this.f108 = c0044;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IBinder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(IBinder iBinder) {
            C0035.f103.m396(this.f108, iBinder);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$Ԭ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$Ԭ.class */
    public static final class C0039 extends Lambda implements Function1<IBinder, Unit> {

        /* renamed from: Ϳ */
        public final /* synthetic */ C0044 f109;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0039(C0044 c0044) {
            super(1);
            this.f109 = c0044;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IBinder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(IBinder iBinder) {
            C0035.f103.m396(this.f109, iBinder);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$Ԯ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$Ԯ.class */
    public /* synthetic */ class C0040 extends FunctionReferenceImpl implements Function2<Parcel, Integer, Unit> {
        public C0040(Object obj) {
            super(2, obj, C0334.class, "writeToParcel", "writeToParcel(Landroid/os/Parcel;I)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Parcel) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Parcel parcel, int i) {
            ((C0334) ((FunctionReferenceImpl) this).receiver).writeToParcel(parcel, i);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$ՠ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$ՠ.class */
    public static final class C0041 extends Lambda implements Function1<IBinder, Unit> {

        /* renamed from: Ϳ */
        public final /* synthetic */ int f110;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0041(int i) {
            super(1);
            this.f110 = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IBinder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(IBinder iBinder) {
            C0035.f103.m398(iBinder, this.f110);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$ֈ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$ֈ.class */
    public static final class C0042 extends Lambda implements Function1<IBinder, Unit> {

        /* renamed from: Ϳ */
        public final /* synthetic */ int f111;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0042(int i) {
            super(1);
            this.f111 = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IBinder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(IBinder iBinder) {
            C0035.f103.m398(iBinder, this.f111);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ˇ$֏ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˇ$֏.class */
    public static final class ServiceConnectionC0043 implements ServiceConnection {

        /* renamed from: ԭ */
        public final AtomicBoolean f112 = new AtomicBoolean(false);

        /* renamed from: Ԯ */
        public final /* synthetic */ Function1<IBinder, Unit> f113;

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceConnectionC0043(Function1<? super IBinder, Unit> function1) {
            this.f113 = function1;
        }

        /* renamed from: Ϳ */
        public static final void m404(Function1 function1, IBinder iBinder) {
            function1.invoke(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (this.f112.getAndSet(true)) {
                return;
            }
            C0276 c0276 = C0276.f576;
            Function1<IBinder, Unit> function1 = this.f113;
            c0276.m1722(() -> {
                m404(r1, r2);
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: ԫ */
    public static final void m383(C0044 c0044) {
        f103.m391(c0044);
    }

    /* renamed from: Ԩ */
    public static final void m385(C0044 c0044) {
        if (!C0175.f268) {
            f103.m399(c0044);
        } else {
            f103.m400(c0044);
        }
    }

    /* renamed from: ԩ */
    public final void m399(C0044 c0044) {
        if (!m395(c0044.f838, new C0038(c0044))) {
            C0265.f550.m1669(c0044);
        }
    }

    /* renamed from: Ԫ */
    public final void m400(C0044 c0044) {
        if (!m394(c0044.f838, new C0039(c0044))) {
            C0265.f550.m1669(c0044);
        }
    }

    /* renamed from: Ԩ */
    public final void m397(C0036 c0036, C0044 c0044) {
        try {
            C0265.f550.m1679(c0036.f106, c0036.f107, c0044);
        } catch (Exception unused) {
            C0265.f550.m1669(c0044);
        }
    }

    /* renamed from: Ϳ */
    public final void m398(IBinder iBinder, int i) {
        try {
            AbstractC0382 m2265 = AbstractC0382.AbstractBinderC0384.m2265(iBinder);
            if (!(m2265.mo1796(1558605841, null) == 1)) {
                Bundle bundle = new Bundle();
                bundle.putInt(C0281.C0282.f609, i);
                C0337 c0337 = C0337.f801;
                c0337.getClass();
                bundle.putBoolean(C0281.C0282.f594, C0337.f807);
                bundle.putByteArray(C0281.C0282.f605, C0494.f1088.m2450(new C0037(c0337.m2077())));
                Unit unit = Unit.INSTANCE;
                f104 = new C0036(i, m2265, m2265.mo1796(-1479747291, bundle));
            } else if (C0265.f550.m1662(i)) {
            } else {
                m2265.mo1794();
                C0276.f576.m1722(() -> {
                    m386(r1);
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public static final void m386(int i) {
        f103.m392(Integer.valueOf(i));
    }

    /* renamed from: Ԩ */
    public static final void m387(Integer num) {
        try {
            int intValue = num != null ? num.intValue() : C0265.f550.m1664();
            C0035 c0035 = f103;
            if (c0035.m394(intValue, new C0042(intValue))) {
                return;
            }
            c0035.m395(intValue, new C0041(intValue));
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final void m391(@NotNull C0044 c0044) {
        try {
            C0036 c0036 = f104;
            f104 = null;
            if (c0036 == null || c0036.f105 != c0044.f838 || !c0036.f106.asBinder().isBinderAlive()) {
                C0276.f576.m1722(() -> {
                    m385(r1);
                });
                return;
            }
            C0276.f576.m1722(() -> {
                m384(r2, r3);
            });
            m381(this, null, 1, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԩ */
    public final boolean m394(int i, Function1<? super IBinder, Unit> function1) {
        try {
            Context m1701 = C0276.m1701();
            Intent intent = new Intent();
            C0276.f576.getClass();
            Intent component = intent.setComponent(new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubProcessGroup$Companion$FozaStubProcess" + i));
            C0229.f441.getClass();
            return m1701.bindService(component.putExtras(C0229.f442), new ServiceConnectionC0043(function1), 1);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: Ϳ */
    public static final void m384(C0036 c0036, C0044 c0044) {
        f103.m397(c0036, c0044);
    }

    /* renamed from: Ϳ */
    public final void m396(C0044 c0044, IBinder iBinder) {
        try {
            AbstractC0382 m2265 = AbstractC0382.AbstractBinderC0384.m2265(iBinder);
            if (m2265.mo1796(1558605841, null) == 1) {
                m2265.mo1794();
                C0276.f576.m1722(() -> {
                    m383(r1);
                });
                return;
            }
            C0265 c0265 = C0265.f550;
            Bundle bundle = new Bundle();
            bundle.putInt(C0281.C0282.f609, c0044.f838);
            C0337 c0337 = C0337.f801;
            c0337.getClass();
            bundle.putBoolean(C0281.C0282.f594, C0337.f807);
            bundle.putByteArray(C0281.C0282.f605, C0494.f1088.m2450(new C0040(c0337.m2077())));
            Unit unit = Unit.INSTANCE;
            c0265.m1679(m2265, m2265.mo1796(-1479747291, bundle), c0044);
            m381(this, null, 1, null);
        } catch (Exception unused) {
            C0265.f550.m1669(c0044);
        }
    }

    /* renamed from: Ϳ */
    public final void m392(@Nullable Integer num) {
        C0276.f576.m1722(() -> {
            m387(r1);
        });
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ void m381(C0035 c0035, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        c0035.m392(num);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:13:0x0073). Please submit an issue!!! */
    /* renamed from: Ϳ */
    public final void m393(@NotNull C0355 c0355, int i, @Nullable Notification notification) {
        try {
            int m2170 = c0355.m2170();
            Intent intent = new Intent();
            C0276.f576.getClass();
            Intent putExtra = intent.setComponent(new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubProcessGroup$Companion$FozaStubProcess" + m2170)).putExtra(C0281.C0282.f617, true).putExtra(C0281.C0282.f594, i);
            if (notification != null) {
                putExtra.putExtra(C0281.C0282.f618, notification);
            }
            try {
                if (C0175.f262) {
                    C0321.m1885().startForegroundService(putExtra);
                } else {
                    C0321.m1885().startService(putExtra);
                }
            } catch (Exception unused) {
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ void m382(C0035 c0035, C0355 c0355, int i, Notification notification, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            notification = null;
        }
        c0035.m393(c0355, i, notification);
    }

    /* renamed from: Ϳ */
    public final boolean m395(int i, Function1<? super IBinder, Unit> function1) {
        try {
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            ContentResolver contentResolver = C0321.m1885().getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            c0276.getClass();
            Uri parse = Uri.parse(sb.append(C0276.f583).append(C0281.C0289.f678).append(i).toString());
            C0229.f441.getClass();
            Bundle call = contentResolver.call(parse, C0281.C0283.f628, "arg", C0229.f442);
            IBinder binder = call != null ? call.getBinder(C0281.C0282.f616) : null;
            if (binder == null) {
                return false;
            }
            function1.invoke(binder);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
