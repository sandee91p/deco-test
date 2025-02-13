package lu.die.foza.SleepyFox;

import android.os.Build;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ތ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ތ.class */
public final class C0175 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0175 f257 = new C0175();
    @JvmField

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final boolean f258;
    @JvmField

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final boolean f259;
    @JvmField

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final boolean f260;
    @JvmField

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final boolean f261;
    @JvmField

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final boolean f262;
    @JvmField

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final boolean f263;
    @JvmField

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final boolean f264;
    @JvmField

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final boolean f265;
    @JvmField

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final boolean f266;
    @JvmField

    /* renamed from: ֈ  reason: contains not printable characters */
    public static final boolean f267;
    @JvmField

    /* renamed from: ֏  reason: contains not printable characters */
    public static final boolean f268;
    @JvmField

    /* renamed from: ׯ  reason: contains not printable characters */
    public static final boolean f269;
    @JvmField

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final boolean f270;
    @JvmField

    /* renamed from: ހ  reason: contains not printable characters */
    public static final boolean f271;
    @JvmField

    /* renamed from: ށ  reason: contains not printable characters */
    public static final boolean f272;
    @JvmField

    /* renamed from: ނ  reason: contains not printable characters */
    public static final boolean f273;
    @JvmField

    /* renamed from: ރ  reason: contains not printable characters */
    public static final boolean f274;

    /* renamed from: lu.die.foza.SleepyFox.ތ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ތ$Ϳ.class */
    public static final class C0176 {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final C0176 f275 = new C0176();
        @NotNull

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static final C0344<String> f276 = new C0344("get", new Class[]{String.class, String.class}).m2124("android.os.SystemProperties");

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final String m1013(@Nullable String str) {
            String str2;
            try {
                C0344<String> c0344 = f276;
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = C0019.f56;
                str2 = String.valueOf(c0344.m2127(null, objArr));
            } catch (Exception unused) {
                str2 = C0019.f56;
            }
            return str2;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final boolean m1014(@Nullable String str) {
            return f275.m1013(str).length() > 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    static {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0175.m1010clinit():void");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1011() {
        int i;
        if (f260) {
            try {
                i = Build.VERSION.PREVIEW_SDK_INT;
            } catch (Throwable unused) {
            }
            return i;
        }
        i = 0;
        return i;
    }
}
