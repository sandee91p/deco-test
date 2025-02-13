package lu.die.foza.SleepyFox;

import android.app.Notification;
import android.content.ComponentName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ˀ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˀ.class */
public final class C0032 extends C0202 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0032 f97 = new C0032();

    @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        Object[] objArr = c0253.f519;
        C0153 c0153 = C0153.f201;
        ComponentName componentName = (ComponentName) c0153.m726(objArr, ComponentName.class);
        if (Intrinsics.areEqual(m1135(), componentName != null ? componentName.getPackageName() : null)) {
            return c0253.m1485();
        }
        try {
            if (objArr.length <= 2) {
                return null;
            }
            int i = 0;
            if (C0175.f271) {
                Object obj = objArr[objArr.length - 1];
                if (obj instanceof Number) {
                    i = ((Number) obj).intValue();
                }
            }
            C0220.f323.getClass();
            C0220 c0220 = C0220.f324;
            Notification notification = (Notification) c0153.m726(objArr, Notification.class);
            Notification m1223 = c0220.m1223(notification != null ? notification.clone() : null);
            Object obj2 = objArr[2];
            C0209.f304.getClass();
            C0209.f305.m1179(obj2 instanceof Number ? ((Number) obj2).intValue() : 12580, i, m1223);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
