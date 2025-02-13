package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.servertransaction.ClientTransaction;
import android.os.Handler;
import android.os.Parcelable;
import java.lang.reflect.Field;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢿ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢿ.class */
public final class C0327 {
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static AbstractC0114 f773;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0327 f772 = new C0327();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0343<Handler.Callback> f774 = new C0343<>("mCallback");

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2014(@Nullable AbstractC0114 abstractC0114) {
        f773 = abstractC0114;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m2018() {
        try {
            Field declaredField = ClientTransaction.class.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj);
            if (!(obj instanceof C0186)) {
                declaredField.set(null, new C0186((Parcelable.Creator) obj));
            }
            AppComponentFactoryC0274.f574.m1700();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2019() {
        try {
            C0343<Handler.Callback> c0343 = f774;
            BinderC0293 binderC0293 = BinderC0293.f705;
            binderC0293.getClass();
            Handler handler = BinderC0293.f708;
            Handler.Callback m2103 = c0343.m2103(handler);
            if (m2103 == null) {
                C0369 c0369 = C0369.f864;
                c0369.getClass();
                C0369.f869 = null;
                binderC0293.getClass();
                c0343.m2104(handler, c0369);
            } else if (!(m2103 instanceof C0369)) {
                C0369 c03692 = C0369.f864;
                if (!c03692.m2203(m2103)) {
                    c03692.getClass();
                    C0369.f869 = m2103;
                    binderC0293.getClass();
                    c0343.m2104(handler, c03692);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2016(@Nullable String str, @Nullable String str2) {
        AbstractC0114 abstractC0114 = f773;
        if (abstractC0114 != null) {
            abstractC0114.m697(str, str2);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2017() {
        if (C0175.f264) {
            m2018();
        } else {
            m2019();
        }
    }
}
