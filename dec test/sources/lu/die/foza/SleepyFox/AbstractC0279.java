package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢨ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢨ.class */
public abstract class AbstractC0279 extends C0202 {
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public abstract List<ResolveInfo> mo1734(@NotNull Intent intent, @Nullable String str, int i);

    @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public final Object mo85(@NotNull C0253 c0253) {
        Object emptyList;
        try {
            List<ResolveInfo> m1735 = m1735(c0253);
            if (!(m1735 == null || m1735.isEmpty())) {
                return C0495.f1089.m2457(m1735, c0253.f518);
            }
            C0153.f201.m728(c0253.f519, 2);
            return c0253.m1485();
        } catch (Exception unused) {
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

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final List<ResolveInfo> m1735(C0253 c0253) {
        try {
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            if (!(obj instanceof Intent)) {
                return null;
            }
            return mo1734((Intent) obj, obj2 != null ? obj2.toString() : null, obj3 instanceof Number ? ((Number) obj3).intValue() : 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
