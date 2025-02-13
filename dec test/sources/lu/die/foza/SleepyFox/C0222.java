package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.Context;
import android.os.ConditionVariable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nDiscoveryLocalProviderEnhancer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalProviderEnhancer.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalProviderEnhancer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ޱ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޱ.class */
public final class C0222 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0222 f333 = new C0222();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final ConditionVariable f334 = new ConditionVariable();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0344<Object> f335 = new C0344("installContentProviders", new Class[]{Context.class, List.class}).m2125(ActivityThread.class);
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final Map<? extends Object, ? extends Object> f336;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final C0343<List<?>> f337;
    @Nullable

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static C0065 f338;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map] */
    static {
        C0154 c0154;
        try {
            C0047 c0047 = C0047.f129;
            BinderC0293.f705.getClass();
            Object m465 = c0047.m465(BinderC0293.f707, "mProviderMap");
            Intrinsics.checkNotNull(m465);
            c0154 = TypeIntrinsics.asMutableMap(m465);
        } catch (Throwable unused) {
            c0154 = r0;
            C0154 c01542 = new C0154();
        }
        f336 = c0154;
        f337 = new C0343<>("providers");
        f338 = new C0065(10);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m1236() {
        f336.clear();
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Map<? extends Object, ? extends Object> m1237() {
        return f336;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        r6 = r6.providers;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004d, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0047, code lost:
        if (r0 != null) goto L16;
     */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1238() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0222.m1238():void");
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final void m1241() {
        f334.block(1000L);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1240(@NotNull Context context, @NotNull Object obj) {
        List<?> m2103;
        try {
            m2103 = f337.m2103(obj);
        } catch (Throwable unused) {
        }
        if (m2103 == null || m2103.isEmpty()) {
            f334.open();
            return;
        }
        C0065 c0065 = f338;
        if (c0065 == null) {
            f334.open();
            return;
        }
        f338 = null;
        Object obj2 = m2103.get(0);
        if (c0065.m635(obj2 != null ? obj2.hashCode() : 0)) {
            f334.open();
            return;
        }
        C0344<Object> c0344 = f335;
        BinderC0293.f705.getClass();
        c0344.m2127(BinderC0293.f707, context, m2103);
        f334.open();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1239(@NotNull List<?> list) {
        C0065 c0065 = f338;
        if (c0065 == null) {
            return false;
        }
        C0343 c0343 = new C0343("info");
        for (Object obj : list) {
            Intrinsics.checkNotNull(obj);
            Object m2103 = c0343.m2103(obj);
            c0065.m634(m2103 != null ? m2103.hashCode() : 0);
        }
        return true;
    }
}
