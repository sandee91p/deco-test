package lu.die.foza.SleepyFox;

import android.app.ActivityClient;
import android.app.ActivityTaskManager;
import android.app.ActivityThread;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ၼ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၼ.class */
public final class C0474 extends C0301 {
    @NotNull

    /* renamed from: ՠ */
    public static final C0475 f1079 = new C0475();
    @NotNull

    /* renamed from: ֈ */
    public static final C0474 f1080 = new C0474();
    @Nullable

    /* renamed from: ֏ */
    public static IBinder f1081;
    @NotNull

    /* renamed from: ԯ */
    public final C0343<Intent> f1082 = new C0343<>("intent");

    /* renamed from: lu.die.foza.SleepyFox.ၼ$Ϳ */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၼ$Ϳ.class */
    public static final class C0475 {
        public C0475() {
        }

        @NotNull
        /* renamed from: Ԩ */
        public final C0474 m2435() {
            return C0474.f1080;
        }

        @Nullable
        /* renamed from: Ϳ */
        public final IBinder m2436() {
            return C0474.f1081;
        }

        public /* synthetic */ C0475(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: Ϳ */
        public final void m2437(@Nullable IBinder iBinder) {
            C0474.f1081 = iBinder;
        }
    }

    /* renamed from: Ϳ */
    public final void m2434(@NotNull C0033 c0033) {
        try {
            c0033.m374("onBackPressedOnTaskRoot", this);
        } catch (Exception unused) {
        }
    }

    @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        ActivityThread.ActivityClientRecord activityClientRecord;
        try {
            Object obj = c0253.f519[0];
            C0276 c0276 = C0276.f576;
            if (c0276.m1708() && (obj instanceof IBinder)) {
                if (C0175.f264) {
                    BinderC0293.f705.getClass();
                    activityClientRecord = BinderC0293.f707.getActivityClient((IBinder) obj);
                } else {
                    C0110.f177.getClass();
                    activityClientRecord = C0110.f178.f179.get(obj);
                }
                if (activityClientRecord != null) {
                    Intent m2103 = this.f1082.m2103(activityClientRecord);
                    if (m2103 != null && C0417.f1015.m2329(m2103, c0276.m1713())) {
                        if (C0175.f272) {
                            ActivityClient.getInstance().moveActivityTaskToBack((IBinder) obj, false);
                            return null;
                        } else if (C0175.f271) {
                            ActivityTaskManager.getService().moveActivityTaskToBack((IBinder) obj, false);
                            return null;
                        } else {
                            C0263.f548.m1636().moveActivityTaskToBack((IBinder) obj, false);
                            return null;
                        }
                    }
                }
                f1081 = (IBinder) obj;
            }
        } catch (Throwable unused) {
        }
        return super.mo85(c0253);
    }
}
