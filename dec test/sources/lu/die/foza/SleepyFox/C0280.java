package lu.die.foza.SleepyFox;

import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ࢩ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢩ.class */
public final class C0280 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0280 f589 = new C0280();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1737(@NotNull Context context) {
        while (context instanceof ContextWrapper) {
            try {
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception unused) {
                return;
            }
        }
        C0047 c0047 = C0047.f129;
        Object m465 = c0047.m465(context, "mPackageInfo");
        if (m465 == null) {
            return;
        }
        Field m461 = c0047.m461(m465, "mClassLoader");
        if (m461 == null) {
            return;
        }
        m461.setAccessible(true);
        Object obj = m461.get(m465);
        if (obj == null) {
            return;
        }
        m461.set(m465, new C0326((ClassLoader) obj));
    }
}
