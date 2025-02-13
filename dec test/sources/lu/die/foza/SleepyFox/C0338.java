package lu.die.foza.SleepyFox;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࣆ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣆ.class */
public final class C0338 {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0339 f809 = new C0339();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int f810;

    /* renamed from: lu.die.foza.SleepyFox.ࣆ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣆ$Ϳ.class */
    public static final class C0339 {
        public C0339() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0338 m2081(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            return new C0338(str, str2, str3);
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final int m2082(@NotNull C0355 c0355) {
            return m2083(c0355.m2172(), c0355.m2171());
        }

        public /* synthetic */ C0339(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0338 m2080(@NotNull C0355 c0355) {
            return new C0338(c0355.m2172(), c0355.m2173(), c0355.m2171());
        }

        @JvmStatic
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final int m2083(@NotNull String str, @NotNull String str2) {
            return (str2.hashCode() * 31) + (str.hashCode() * 31);
        }
    }

    public C0338(String str, String str2, String str3) {
        int hashCode = str2.hashCode() * 31;
        this.f810 = (str3.hashCode() * 31) + hashCode + (str.hashCode() * 31);
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final int m2078(@NotNull String str, @NotNull String str2) {
        return f809.m2083(str, str2);
    }

    public int hashCode() {
        return this.f810;
    }

    public boolean equals(@Nullable Object obj) {
        return this.f810 == (obj != null ? obj.hashCode() : 0);
    }

    public /* synthetic */ C0338(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }
}
