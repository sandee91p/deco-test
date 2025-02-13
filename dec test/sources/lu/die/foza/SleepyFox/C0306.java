package lu.die.foza.SleepyFox;

import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢱ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢱ.class */
public final class C0306 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0307 f724 = new C0307();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0306 f725 = new C0306();

    /* renamed from: lu.die.foza.SleepyFox.ࢱ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢱ$Ϳ.class */
    public static final class C0307 {
        public C0307() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0306 m1840() {
            return C0306.f725;
        }

        public /* synthetic */ C0307(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @RequiresApi(24)
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m1839(@NotNull String str, boolean z) {
        try {
            StorageManager storageManager = (StorageManager) C0276.m1701().getSystemService(StorageManager.class);
            if (storageManager == null) {
                return null;
            }
            for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                if (storageVolume.isRemovable()) {
                    File directory = C0175.f270 ? storageVolume.getDirectory() : (File) C0047.f129.m463(storageVolume, "getPathFile");
                    if (directory != null) {
                        File m2134 = C0346.f821.m2134(directory, str, z);
                        if (m2134.canWrite()) {
                            return m2134;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ File m1834(C0306 c0306, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c0306.m1839(str, z);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m1837(@NotNull File file, @NotNull File file2) {
        try {
            if (Intrinsics.areEqual(file.getCanonicalFile(), file2.getCanonicalFile())) {
                return file2;
            }
        } catch (Exception unused) {
        }
        return file;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m1838(@NotNull String str) {
        File[] m2131;
        try {
            for (File file : C0346.f821.m2131()) {
                if (file.exists()) {
                    C0496 c0496 = C0496.f1092;
                    String[] strArr = new String[1];
                    strArr[0] = str;
                    File m2462 = c0496.m2462(file, strArr);
                    if (m2462.exists()) {
                        return m2462;
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
