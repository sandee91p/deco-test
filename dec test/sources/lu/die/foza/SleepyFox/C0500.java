package lu.die.foza.SleepyFox;

import android.content.UriPermission;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.FozaAnkingProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ჽ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჽ.class */
public final class C0500 implements AbstractC0412 {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0501 f1093 = new C0501();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0500 f1094 = new C0500();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0502 f1095 = new C0502();

    /* renamed from: lu.die.foza.SleepyFox.ჽ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჽ$Ϳ.class */
    public static final class C0501 {
        public C0501() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0500 m2468() {
            return C0500.f1094;
        }

        public /* synthetic */ C0501(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ჽ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ჽ$Ԩ.class */
    public static final class C0502 extends C0301 {
        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object emptyList;
            try {
                List<?> m2455 = C0495.f1089.m2455(super.mo85(c0253));
                if (m2455 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : m2455) {
                        if ((obj instanceof UriPermission) && !FozaAnkingProvider.C0001.f20.m37(((UriPermission) obj).getUri().getAuthority())) {
                            arrayList.add(obj);
                        }
                    }
                    return C0495.f1089.m2457(arrayList, c0253.f518);
                }
            } catch (Exception unused) {
            }
            C0495 c0495 = C0495.f1089;
            if (c0495.m2456(c0253.f518.getReturnType())) {
                c0495.getClass();
                emptyList = C0495.f1091;
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            return emptyList;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2467(@NotNull C0033 c0033) {
        c0033.m374("takePersistableUriPermission", this);
        c0033.m374("getUriPermissions", this.f1095);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        try {
            Object[] objArr = c0253.f519;
            int m722 = C0153.f201.m722(objArr, Uri.class);
            if (m722 >= 0) {
                Object obj = objArr[m722];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.net.Uri");
                Uri uri = (Uri) obj;
                if (FozaAnkingProvider.C0001.f20.m37(uri.getAuthority())) {
                    uri.toString();
                    return null;
                }
            }
        } catch (Exception unused) {
        }
        C0301.f718.getClass();
        return C0301.f719.mo85(c0253);
    }
}
