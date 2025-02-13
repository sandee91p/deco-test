package lu.die.foza.SleepyFox;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Process;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaAppRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaAppRouter.kt\nlu/die/foza/FoxDev/ThirdParty/FozaAppRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢦ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢦ.class */
public final class C0276 {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static int f577;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static boolean f578;
    @Nullable

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static C0355 f581;

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final int f584;

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final int f585;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0276 f576 = new C0276();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static String f579 = C0019.f56;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static String f580 = C0019.f56;
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public static C0334 f582 = C0334.f793;

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final String f583 = C0321.m1885().getPackageName();
    @NotNull

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final String[] f586 = {"com.rekoo.pubgm", "com.pubg.krmobile", "com.vng.pubgmobile", "com.pubg.imobile", "com.tencent.ig"};

    @JvmStatic
    @NotNull
    /* renamed from: ֈ  reason: contains not printable characters */
    public static final Context m1701() {
        return C0321.m1885();
    }

    @JvmStatic
    /* renamed from: ޅ  reason: contains not printable characters */
    public static final void m1702() {
        C0321.f756.m1899();
    }

    static {
        C0334.f792.getClass();
        int myUid = Process.myUid();
        f584 = myUid;
        f585 = myUid / 100000;
    }

    @NotNull
    /* renamed from: ބ  reason: contains not printable characters */
    public final Object m1706() {
        File file;
        try {
            C0045.f123.getClass();
            file = C0045.f124;
        } catch (Exception unused) {
            file = Unit.INSTANCE;
        }
        return file;
    }

    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public final String m1707() {
        return f580;
    }

    /* renamed from: ރ  reason: contains not printable characters */
    public final boolean m1708() {
        return f581 != null;
    }

    @NotNull
    /* renamed from: ԭ  reason: contains not printable characters */
    public final ContentResolver m1709() {
        return C0321.m1885().getContentResolver();
    }

    @NotNull
    /* renamed from: ֏  reason: contains not printable characters */
    public final String m1710() {
        return f583;
    }

    @NotNull
    /* renamed from: Ԯ  reason: contains not printable characters */
    public final String m1712() {
        return f579;
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final String m1713() {
        C0355 c0355 = f581;
        if (c0355 != null) {
            return c0355.m2172();
        }
        return null;
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final String m1714() {
        C0355 c0355 = f581;
        if (c0355 != null) {
            return c0355.m2173();
        }
        return null;
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public final int m1715() {
        return f577;
    }

    /* renamed from: ނ  reason: contains not printable characters */
    public final boolean m1718() {
        return f578;
    }

    @Nullable
    /* renamed from: Ԭ  reason: contains not printable characters */
    public final ClassLoader m1719() {
        String m1713 = m1713();
        if (m1713 != null) {
            return m1720(m1713);
        }
        return null;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1722(@NotNull Runnable runnable) {
        C0321.f756.getClass();
        C0321.f758.execute(runnable);
    }

    @NotNull
    /* renamed from: ԯ  reason: contains not printable characters */
    public final BinderC0293 m1725() {
        return BinderC0293.f705;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m1726(@NotNull Runnable runnable) {
        return C0321.f756.m1898(m1723(runnable));
    }

    @NotNull
    /* renamed from: ؠ  reason: contains not printable characters */
    public final C0334 m1727() {
        return f582;
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public final int m1728() {
        return f584;
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public final int m1729() {
        return f585;
    }

    @NotNull
    /* renamed from: ՠ  reason: contains not printable characters */
    public final String[] m1730() {
        return f586;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m1716(@Nullable String str) {
        return Intrinsics.areEqual(m1713(), str);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Context m1721(@NotNull String str) {
        return BinderC0293.f705.m1791(str);
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0355 m1711() {
        return f581;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1717() {
        return f577;
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final Future<?> m1723(@NotNull Runnable runnable) {
        C0321.f756.getClass();
        return C0321.f758.submit(runnable);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1704(@NotNull C0355 c0355) {
        f578 = c0355.m2174();
        f577 = c0355.m2170();
        f579 = c0355.m2171();
        f580 = C0045.m421(c0355.m2172(), c0355.m2171());
        f581 = c0355;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final ClassLoader m1720(@NotNull String str) {
        return BinderC0293.f705.m1791(str).getClassLoader();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1705(@NotNull C0334 c0334) {
        f582 = c0334;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T> Future<T> m1724(@NotNull Callable<T> callable) {
        C0321.f756.getClass();
        return C0321.f758.submit(callable);
    }
}
