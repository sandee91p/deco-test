package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ށ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ށ.class */
public final class C0150 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ށ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ށ$Ϳ.class */
    public static final class C0151 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, ComponentName.class);
                if (m722 >= 0) {
                    C0276.f576.getClass();
                    String str = C0276.f583;
                    Object obj = objArr[m722];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.ComponentName");
                    objArr[m722] = new ComponentName(str, ((ComponentName) obj).getClassName());
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            this.f168 = new C0151();
            m643("appwidget");
        } catch (Exception unused) {
        }
    }
}
