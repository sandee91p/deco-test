package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.os.IBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ގ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ގ.class */
public final class C0178 extends C0301 {
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final C0179 f277 = new C0179();
    @NotNull

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final C0178 f278 = new C0178();
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public final C0180 f279 = new C0180();

    /* renamed from: lu.die.foza.SleepyFox.ގ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ގ$Ϳ.class */
    public static final class C0179 {
        public C0179() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0178 m1018() {
            return C0178.f278;
        }

        public /* synthetic */ C0179(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ގ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ގ$Ԩ.class */
    public static final class C0180 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            ComponentName componentName;
            try {
                componentName = C0213.f309.m1191((IBinder) c0253.f519[0]);
            } catch (Exception unused) {
                componentName = null;
            }
            if (componentName == null) {
                componentName = super.mo85(c0253);
            }
            return componentName;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1017(@NotNull C0033 c0033) {
        c0033.m374("getCallingPackage", this);
        c0033.m374("getCallingActivity", this.f279);
    }

    @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        C0213.f309.getClass();
        String str = C0213.f310;
        String str2 = str;
        if (str == null) {
            String m1713 = C0276.f576.m1713();
            str2 = m1713;
            if (m1713 == null) {
                str2 = super.mo85(c0253);
            }
        }
        return str2;
    }
}
