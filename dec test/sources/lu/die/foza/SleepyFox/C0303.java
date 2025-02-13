package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.storage.StorageVolume;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaEnhancedScopedStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaEnhancedScopedStorage.kt\nlu/die/foza/HookEntity/FozaCoreHooker/FozaEnhancedScopedStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢰ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢰ.class */
public final class C0303 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0303 f721 = new C0303();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Function1<? super Function0<? extends Object>, ? extends Object> f722 = C0304.INSTANCE;

    /* renamed from: lu.die.foza.SleepyFox.ࢰ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢰ$Ϳ.class */
    public static final class C0304 extends Lambda implements Function1<Function0<? extends Object>, Object> {
        public static final C0304 INSTANCE = new C0304();

        /* renamed from: lu.die.foza.SleepyFox.ࢰ$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢰ$Ϳ$Ϳ.class */
        public static final class C0305 extends Lambda implements Function1<Function0<? extends Object>, StorageVolume[]> {

            /* renamed from: Ϳ  reason: contains not printable characters */
            public final /* synthetic */ StorageVolume[] f723;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0305(StorageVolume[] storageVolumeArr) {
                super(1);
                this.f723 = storageVolumeArr;
            }

            public final StorageVolume[] invoke(Function0<? extends Object> function0) {
                return (StorageVolume[]) this.f723.clone();
            }
        }

        public C0304() {
            super(1);
        }

        public final Object invoke(Function0<? extends Object> function0) {
            Object obj;
            try {
                obj = function0.invoke();
                C0303 c0303 = C0303.f721;
                StorageVolume[] m1832 = c0303.m1832(obj);
                if (m1832 != null) {
                    C0305 c0305 = new C0305(m1832);
                    c0303.getClass();
                    C0303.f722 = c0305;
                    obj = m1832.clone();
                }
            } catch (Exception unused) {
                obj = new StorageVolume[0];
            }
            return obj;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final StorageVolume[] m1832(Object obj) {
        if (obj != null) {
            try {
                if (obj.getClass().isArray()) {
                    StorageVolume[] storageVolumeArr = (StorageVolume[]) obj;
                    C0343<File> c0343 = new C0343<>("mPath");
                    StorageVolume[] m1831 = m1831(storageVolumeArr[0], c0343, new C0343<>("mState"));
                    if (m1831 == null) {
                        return null;
                    }
                    return m1831;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        Objects.toString(obj);
        return null;
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final File m1826(@NotNull String str) {
        try {
            return C0346.f821.m2134(Environment.getExternalStorageDirectory(), str, false);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Function1<Function0<? extends Object>, Object> m1829() {
        return f722;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final StorageVolume[] m1831(StorageVolume storageVolume, C0343<File> c0343, C0343<String> c03432) {
        String m1713;
        C0346 c0346 = C0346.f821;
        File m2103 = c0343.m2103(storageVolume);
        if (m2103 == null || (m1713 = C0276.f576.m1713()) == null) {
            return null;
        }
        File m2129 = C0346.m2129(c0346, m2103, m1713, false, 4, null);
        if ((m2129.exists() || m2129.mkdirs()) && !m2129.canRead()) {
            return null;
        }
        c0343.m2104(storageVolume, m2129);
        c03432.m2104(storageVolume, "mounted");
        return new StorageVolume[]{storageVolume};
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1830(@NotNull Function1<? super Function0<? extends Object>, ? extends Object> function1) {
        f722 = function1;
    }
}
