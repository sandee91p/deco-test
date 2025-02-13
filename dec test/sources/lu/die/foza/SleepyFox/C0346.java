package lu.die.foza.SleepyFox;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaSandboxedStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaSandboxedStorage.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/WsaPark/FozaSandboxedStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,114:1\n1#2:115\n37#3,2:116\n13309#4,2:118\n*S KotlinDebug\n*F\n+ 1 FozaSandboxedStorage.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/WsaPark/FozaSandboxedStorage\n*L\n34#1:116,2\n55#1:118,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ೲ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ೲ.class */
public final class C0346 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0346 f821 = new C0346();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Lazy f822 = LazyKt.lazy(LazyThreadSafetyMode.NONE, C0347.INSTANCE);

    /* renamed from: lu.die.foza.SleepyFox.ೲ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ೲ$Ϳ.class */
    public static final class C0347 extends Lambda implements Function0<File[]> {
        public static final C0347 INSTANCE = new C0347();

        public C0347() {
            super(0);
        }

        /* renamed from: invoke */
        public final File[] m2138invoke() {
            return C0276.m1701().getObbDirs();
        }
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final File[] m2131() {
        try {
            ArrayList arrayList = new ArrayList();
            File[] m2136 = m2136();
            if (m2136 != null) {
                Iterator it = ArrayIteratorKt.iterator(m2136);
                while (it.hasNext()) {
                    File file = (File) it.next();
                    C0496 c0496 = C0496.f1092;
                    String[] strArr = new String[1];
                    strArr[0] = "scopedStorage";
                    arrayList.add(c0496.m2462(file, strArr));
                }
            }
            return (File[]) arrayList.toArray(new File[0]);
        } catch (Exception unused) {
            return new File[0];
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m2134(@NotNull File file, @NotNull String str, boolean z) {
        File m2135 = m2135(file);
        C0496 c0496 = C0496.f1092;
        File m2462 = c0496.m2462(m2135, "scopedStorage", str);
        if (z) {
            try {
                String[] strArr = new String[2];
                strArr[0] = "Android";
                strArr[1] = "data";
                File m24622 = c0496.m2462(m2462, strArr);
                if (!m24622.exists() && m24622.mkdirs()) {
                    String[] strArr2 = new String[1];
                    strArr2[0] = ".nomedia";
                    c0496.m2462(m24622, strArr2).createNewFile();
                }
            } catch (Exception unused) {
            }
        }
        return m2462;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final File[] m2136() {
        return (File[]) f822.getValue();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ File m2129(C0346 c0346, File file, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c0346.m2134(file, str, z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2132() {
        try {
            m2136();
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m2135(File file) {
        C0496 c0496 = C0496.f1092;
        C0276.f576.getClass();
        return c0496.m2462(file, "Android", "obb", C0276.f583);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2133(@Nullable String str) {
        if (str == null) {
            return;
        }
        try {
            File[] m2136 = m2136();
            if (m2136 == null) {
                return;
            }
            for (File file : m2136) {
                C0496 c0496 = C0496.f1092;
                String[] strArr = new String[1];
                strArr[0] = "scopedStorage";
                File m2462 = c0496.m2462(file, strArr);
                if (m2462.exists()) {
                    String[] strArr2 = new String[1];
                    strArr2[0] = str;
                    File m24622 = c0496.m2462(m2462, strArr2);
                    if (m24622.exists()) {
                        C0255.f522.m1559(m24622);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
