package lu.die.foza.SleepyFox;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ႎ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ႎ.class */
public final class C0495 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0495 f1089;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0343<List<?>> f1090 = new C0343<>("mList");
    @Nullable

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final Object f1091;

    static {
        C0495 c0495 = new C0495();
        f1089 = c0495;
        f1091 = c0495.m2458(CollectionsKt.emptyList());
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2458(@Nullable List<?> list) {
        try {
            return new ParceledListSlice(list);
        } catch (Throwable unused) {
            C0354.f837.m2166();
            return null;
        }
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Class<?> m2459() {
        return ParceledListSlice.class;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2457(@Nullable List<?> list, @NotNull Method method) {
        try {
            return C0175.f264 ? m2456(method.getReturnType()) ? new ParceledListSlice(list) : list : !ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? list : m2458(list);
        } catch (Throwable unused) {
            C0354.f837.m2166();
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2460() {
        return f1091;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<?> m2455(@Nullable Object obj) {
        try {
            if (C0175.f264) {
                return obj instanceof ParceledListSlice ? ((ParceledListSlice) obj).getList() : (List) obj;
            } else if (obj == null) {
                return null;
            } else {
                return !ParceledListSlice.class.isAssignableFrom(obj.getClass()) ? (List) obj : f1090.m2103(obj);
            }
        } catch (Throwable unused) {
            C0354.f837.m2166();
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2456(@NotNull Class<?> cls) {
        try {
            return ParceledListSlice.class.isAssignableFrom(cls);
        } catch (Throwable unused) {
            C0354.f837.m2166();
            return false;
        }
    }
}
