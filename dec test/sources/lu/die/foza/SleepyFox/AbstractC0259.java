package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFoxIntentBaseResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoxIntentBaseResolver.kt\nlu/die/foza/HookEntity/SampleHookEntity/FoxIntentBaseResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࡩ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡩ.class */
public abstract class AbstractC0259 extends C0202 {
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public abstract ResolveInfo mo1608(@NotNull Intent intent, @Nullable String str, int i);

    @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public final Object mo85(@NotNull C0253 c0253) {
        try {
            Object[] objArr = c0253.f519;
            if (objArr.length < 3) {
                return null;
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            if (obj instanceof Intent) {
                ResolveInfo mo1608 = mo1608((Intent) obj, obj2 != null ? obj2.toString() : null, obj3 instanceof Number ? ((Number) obj3).intValue() : 0);
                if (mo1608 != null) {
                    return mo1608;
                }
            }
            C0153.f201.m728(c0253.f519, 2);
            return c0253.m1485();
        } catch (Exception unused) {
            return null;
        }
    }
}
