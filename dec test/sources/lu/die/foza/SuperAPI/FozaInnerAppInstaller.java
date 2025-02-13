package lu.die.foza.SuperAPI;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0245;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0012"}, d2 = {"Llu/die/foza/SuperAPI/FozaInnerAppInstaller;", C0019.f56, "<init>", "()V", "convertResult", C0019.f56, "iResultCode", C0019.f56, "(Ljava/lang/Integer;)Ljava/lang/String;", "installSplitApkSync", "strSplitPath", "installSync", "strApkOrSplitPath", "installLocalPackage", "appPackage", "copySource", C0019.f56, "Companion", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaInnerAppInstaller.class */
public final class FozaInnerAppInstaller {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final FozaInnerAppInstaller f1100 = new FozaInnerAppInstaller();

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0007"}, d2 = {"Llu/die/foza/SuperAPI/FozaInnerAppInstaller$Companion;", C0019.f56, "<init>", "()V", "sInstance", "Llu/die/foza/SuperAPI/FozaInnerAppInstaller;", "getInstance", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaInnerAppInstaller$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FozaInnerAppInstaller getInstance() {
            return FozaInnerAppInstaller.f1100;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    @NotNull
    public static final FozaInnerAppInstaller getInstance() {
        return Companion.getInstance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    @NotNull
    public final String convertResult(@Nullable Integer num) {
        String str;
        ?? r0 = num;
        if (r0 != 0) {
            try {
                if (num.intValue() == -2) {
                    str = "Path Error";
                    return str;
                }
            } catch (Exception unused) {
                r0.printStackTrace();
                return "Unknown Error";
            }
        }
        if (num != null && num.intValue() == -6) {
            str = "Internal Data Transact Error";
        } else if (num != null && num.intValue() == -1) {
            str = "Unknown Internal Error";
        } else if (num != null && num.intValue() == 1) {
            str = "Success";
        } else if (num != null && num.intValue() == -5) {
            str = "Parse Application Node Error";
        } else if (num != null && num.intValue() == -3) {
            str = "Empty Info Error";
        } else {
            if (num != null) {
                r0 = num.intValue();
                if (r0 == -4) {
                    str = "Parse Package File Error";
                }
            }
            str = "Unknown Error";
        }
        return str;
    }

    public final int installSplitApkSync(@Nullable String str) {
        if (str == null) {
            return -2;
        }
        try {
            C0245.f512.getClass();
            return C0245.f513.m1427(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final int installSync(@Nullable String str) {
        if (str == null) {
            return -2;
        }
        try {
            C0245.f512.getClass();
            return C0245.f513.m1428(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final int installLocalPackage(@Nullable String str, boolean z) {
        try {
            C0245.f512.getClass();
            return C0245.f513.m1429(str, z);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
