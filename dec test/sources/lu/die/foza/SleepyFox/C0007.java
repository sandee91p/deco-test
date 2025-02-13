package lu.die.foza.SleepyFox;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.FozaAnkingProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ʰ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʰ.class */
public final class C0007 {
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0008 f42 = new C0008();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0007 f43 = new C0007();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0009 f44 = new C0009();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0010 f45 = new C0010();

    /* renamed from: lu.die.foza.SleepyFox.ʰ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʰ$Ϳ.class */
    public static final class C0008 {
        public C0008() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0007 m84() {
            return C0007.f43;
        }

        public /* synthetic */ C0008(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ʰ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʰ$Ԩ.class */
    public static final class C0009 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ  reason: contains not printable characters */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, Uri.class);
                if (m722 >= 0) {
                    FozaAnkingProvider.C0001.C0005 c0005 = FozaAnkingProvider.C0001.f20;
                    Object obj = objArr[m722];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.net.Uri");
                    objArr[m722] = FozaAnkingProvider.C0001.C0005.m26(c0005, (Uri) obj, 0, 2, null);
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ʰ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʰ$Ԫ.class */
    public static final class C0010 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, List.class);
                if (m722 >= 0) {
                    Object obj = objArr[m722];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof Uri) {
                            Uri m26 = FozaAnkingProvider.C0001.C0005.m26(FozaAnkingProvider.C0001.f20, (Uri) obj2, 0, 2, null);
                            if (m26 != null) {
                                arrayList.add(m26);
                            }
                        }
                    }
                    objArr[m722] = arrayList;
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m83(@Nullable C0033 c0033) {
        if (c0033 == null) {
            return;
        }
        try {
            C0009 c0009 = this.f44;
            String[] strArr = new String[3];
            strArr[0] = "revokeUriPermission";
            strArr[1] = "grantUriPermission";
            strArr[2] = "checkUriPermission";
            c0033.m377(c0009, strArr);
            c0033.m374("checkUriPermissions", this.f45);
            if (C0175.f264) {
                return;
            }
            C0500.f1093.getClass();
            C0500.f1094.m2467(c0033);
        } catch (Throwable unused) {
        }
    }
}
