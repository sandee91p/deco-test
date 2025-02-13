package lu.die.foza.SleepyFox;

import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ၚ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၚ.class */
public final class C0432 extends C0301 {

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final int f1042 = 2;

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final int f1043 = 4;

    /* renamed from: ֏  reason: contains not printable characters */
    public static final int f1044 = 5;

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final int f1045 = 1;
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final C0433 f1041 = new C0433();
    @NotNull

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final C0432 f1046 = new C0432();

    /* renamed from: lu.die.foza.SleepyFox.ၚ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၚ$Ϳ.class */
    public static final class C0433 {
        public C0433() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0432 m2354() {
            return C0432.f1046;
        }

        public /* synthetic */ C0433(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2351(@NotNull C0033 c0033) {
        c0033.m374("getIntentSender", this);
        if (C0175.f271 && C0175.f265) {
            c0033.m374("getIntentSenderWithSourceToken", this);
        }
        if (C0175.f270) {
            c0033.m374("getIntentSenderWithFeature", this);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2353(int i, Intent intent) {
        return !((i & 536870912) != 0) && ((i & 33554432) != 0) && (intent.getComponent() == null && intent.getPackage() == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163 A[Catch: Exception -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0109, blocks: (B:2:0x0000, B:3:0x0009, B:5:0x000e, B:10:0x0022, B:15:0x0037, B:17:0x0043, B:20:0x004d, B:22:0x0054, B:24:0x005a, B:30:0x0079, B:33:0x0085, B:39:0x009d, B:41:0x00a5, B:42:0x00ac, B:52:0x00d0, B:53:0x015d, B:55:0x0163, B:57:0x0168, B:59:0x016b, B:61:0x0171, B:63:0x0181, B:65:0x0186, B:67:0x0193, B:71:0x00de, B:72:0x00ea, B:74:0x00f5, B:75:0x00fc, B:76:0x010d, B:77:0x0115, B:78:0x011a, B:79:0x011e, B:82:0x012c, B:83:0x0139, B:86:0x0145, B:90:0x0155), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @org.jetbrains.annotations.Nullable
    /* renamed from: Ϳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo85(@org.jetbrains.annotations.NotNull lu.die.foza.SleepyFox.C0253 r6) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0432.mo85(lu.die.foza.SleepyFox.ࡥ):java.lang.Object");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Intent m2352(Intent intent) {
        try {
            if (intent.getComponent() == null && intent.getPackage() == null) {
                return intent;
            }
            StringBuilder sb = new StringBuilder();
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            String str = C0276.f583;
            Intent intent2 = new Intent(sb.append(str).append(".st.receiver").toString());
            c0276.getClass();
            intent2.setPackage(str);
            intent2.putExtra(C0281.C0282.f611, intent);
            c0276.getClass();
            intent2.putExtra(C0281.C0282.f615, C0276.f579);
            return intent2;
        } catch (Exception unused) {
            return intent;
        }
    }
}
