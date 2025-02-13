package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ޘ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޘ.class */
public abstract class AbstractC0194 extends C0202 {
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public abstract ComponentInfo mo1131(@NotNull ComponentName componentName, int i);

    @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public final Object mo85(@NotNull C0253 c0253) {
        try {
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            if (obj instanceof ComponentName) {
                String packageName = ((ComponentName) obj).getPackageName();
                if (!Intrinsics.areEqual(packageName, m1135())) {
                    if (!m1140() && m1139(packageName)) {
                        C0153.f201.m728(objArr, 1);
                        C0448 c0448 = C0448.f1055;
                        Object m1485 = c0253.m1485();
                        return c0448.m2365((C0448) (m1485 instanceof ComponentInfo ? (ComponentInfo) m1485 : null));
                    }
                    ComponentName componentName = (ComponentName) obj;
                    Object obj2 = objArr[1];
                    ComponentInfo mo1131 = mo1131(componentName, obj2 instanceof Number ? ((Number) obj2).intValue() : 0);
                    ComponentInfo componentInfo = mo1131;
                    if (mo1131 != null) {
                        if (m1139(packageName)) {
                            componentInfo = C0448.f1055.m2365((C0448) componentInfo);
                        }
                        return componentInfo;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return c0253.m1485();
    }
}
