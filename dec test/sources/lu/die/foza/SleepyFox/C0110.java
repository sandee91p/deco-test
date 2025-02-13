package lu.die.foza.SleepyFox;

import android.os.IBinder;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import lu.die.foza.SleepyFox.C0474;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.Ԭ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԭ.class */
public final class C0110 extends C0301 {
    @NotNull

    /* renamed from: ֏  reason: contains not printable characters */
    public static final C0111 f177 = new C0111();
    @NotNull

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final C0110 f178 = new C0110();
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public final Map<?, ?> f179;
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public final C0112 f180;
    @NotNull

    /* renamed from: ֈ  reason: contains not printable characters */
    public final C0113 f181;

    /* renamed from: lu.die.foza.SleepyFox.Ԭ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԭ$Ϳ.class */
    public static final class C0111 {
        public C0111() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0110 m696() {
            return C0110.f178;
        }

        public /* synthetic */ C0111(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԭ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԭ$Ԩ.class */
    public static final class C0112 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                if (objArr.length > 1) {
                    Object obj = objArr[0];
                    C0474.C0475 c0475 = C0474.f1079;
                    c0475.getClass();
                    if (Intrinsics.areEqual(obj, C0474.m2431()) && (objArr[objArr.length - 1] instanceof Integer)) {
                        objArr[objArr.length - 1] = 1;
                    }
                    c0475.getClass();
                    C0474.m2432((IBinder) null);
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԭ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԭ$Ԫ.class */
    public static final class C0113 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                c0253.f519[1] = Boolean.TRUE;
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    public C0110() {
        C0154 c0154;
        try {
            Object m465 = C0047.f129.m465(BinderC0293.f705.m1787(), "mActivities");
            Intrinsics.checkNotNull(m465, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            c0154 = TypeIntrinsics.asMutableMap(m465);
        } catch (Exception unused) {
            c0154 = r0;
            C0154 c01542 = new C0154();
        }
        this.f179 = c0154;
        this.f180 = new C0112();
        this.f181 = new C0113();
    }

    @NotNull
    /* renamed from: ֏  reason: contains not printable characters */
    public final Map<?, ?> m694() {
        return this.f179;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m695(@NotNull C0033 c0033) {
        try {
            c0033.m374("activityDestroyed", this);
            c0033.m374("finishActivity", this.f180);
            c0033.m374("moveActivityTaskToBack", this.f181);
        } catch (Exception unused) {
        }
    }

    @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        Object[] objArr = c0253.f519;
        C0276.f576.m1722(() -> {
            m691(r3);
        });
        return super.mo85(c0253);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m691(Object[] objArr) {
        try {
            IBinder iBinder = (IBinder) C0153.f201.m726(objArr, IBinder.class);
            if (iBinder == null) {
                return;
            }
            C0213.f309.m1189(iBinder);
        } catch (Exception unused) {
        }
    }
}
