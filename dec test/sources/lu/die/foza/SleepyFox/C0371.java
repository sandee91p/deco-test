package lu.die.foza.SleepyFox;

import android.content.AttributionSource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import lu.die.foza.Platform.EmbeddedMachineCompat;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ຎ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຎ.class */
public final class C0371 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0371 f877 = new C0371();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final ArrayList<Pair<String, String>> f878 = new ArrayList<>(0);

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2241(@NotNull String str, @NotNull String str2) {
        try {
            C0476 c0476 = C0476.f1083;
            String[] strArr = new String[2];
            strArr[0] = str;
            strArr[1] = str2;
            c0476.getClass();
            EmbeddedMachineCompat.nativeIoctl(1002, strArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final void m2244() {
        try {
            m2253();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final void m2245() {
        try {
            C0476.f1083.getClass();
            EmbeddedMachineCompat.nativeIoctl(1009, C0019.f56);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public final void m2247() {
        try {
            C0476.f1083.getClass();
            EmbeddedMachineCompat.nativeIoctl(1001, C0019.f56);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2248(@NotNull String str, @NotNull String str2) {
        try {
            C0476 c0476 = C0476.f1083;
            String[] strArr = new String[2];
            strArr[0] = str;
            strArr[1] = str2;
            c0476.getClass();
            EmbeddedMachineCompat.nativeIoctl(1011, strArr);
            f878.add(TuplesKt.to(str, str2));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m2250() {
        return !f878.isEmpty();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m2252() {
        try {
            C0476.f1083.getClass();
            EmbeddedMachineCompat.nativeIoctl(1012, null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public final void m2253() {
        try {
            if (C0175.f272) {
                C0476 c0476 = C0476.f1083;
                Object[] objArr = new Object[2];
                C0276 c0276 = C0276.f576;
                c0276.getClass();
                String str = C0276.f583;
                objArr[0] = str;
                c0276.getClass();
                AttributionSource.Builder builder = new AttributionSource.Builder(C0276.f584);
                c0276.getClass();
                objArr[1] = builder.setPackageName(str).build();
                c0476.getClass();
                EmbeddedMachineCompat.nativeIoctl(1008, objArr);
            } else {
                C0476 c04762 = C0476.f1083;
                String[] strArr = new String[1];
                C0276.f576.getClass();
                strArr[0] = C0276.f583;
                c04762.getClass();
                EmbeddedMachineCompat.nativeIoctl(1008, strArr);
            }
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2242(@NotNull String str) {
        try {
            C0476 c0476 = C0476.f1083;
            String[] strArr = new String[1];
            strArr[0] = str;
            c0476.getClass();
            EmbeddedMachineCompat.nativeIoctl(1003, strArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2246() {
        try {
            C0476.f1083.getClass();
            EmbeddedMachineCompat.nativeIoctl(3101, C0019.f56);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2249() {
        try {
            C0476.f1083.getClass();
            EmbeddedMachineCompat.nativeIoctl(1013, null);
            f878.clear();
        } catch (Throwable unused) {
        }
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String m2251(@NotNull String str) {
        try {
            Iterator<Pair<String, String>> it = f878.iterator();
            while (it.hasNext()) {
                Pair<String, String> next = it.next();
                if (StringsKt.endsWith$default(str, (String) next.getFirst(), false, 2, (Object) null)) {
                    return (String) next.getSecond();
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }
}
