package lu.die.foza.SleepyFox;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢧ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢧ.class */
public class C0277 extends C0202 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0278 f587 = new C0278();
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final C0277 f588 = new C0277();

    /* renamed from: lu.die.foza.SleepyFox.ࢧ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢧ$Ϳ.class */
    public static final class C0278 {
        public C0278() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0277 m1733() {
            return C0277.f588;
        }

        public /* synthetic */ C0278(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        try {
            String m1136 = m1136();
            if (m1136 != null) {
                Object[] objArr = c0253.f519;
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    if (Intrinsics.areEqual(m1136, objArr[i])) {
                        objArr[i] = m1135();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return c0253.m1485();
    }
}
