package lu.die.foza.SleepyFox;

import android.accounts.Account;
import java.util.Objects;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ʲ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʲ.class */
public final class C0012 {
    @JvmField

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int f46;
    @JvmField
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Account f47;
    @JvmField
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final String f48;
    @JvmField
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final String f49;
    @JvmField
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final String f50;
    @JvmField

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final long f51;

    public C0012(int i, @NotNull Account account, @NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        this.f46 = i;
        this.f47 = account;
        this.f48 = str;
        this.f49 = str2;
        this.f50 = str3;
        this.f51 = j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0012)) {
            return false;
        }
        C0012 c0012 = (C0012) obj;
        return this.f46 == c0012.f46 && this.f51 == c0012.f51 && Intrinsics.areEqual(this.f47, c0012.f47) && Intrinsics.areEqual(this.f50, c0012.f50) && Intrinsics.areEqual(this.f49, c0012.f49) && Intrinsics.areEqual(this.f48, c0012.f48);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46), this.f47, Long.valueOf(this.f51), this.f50, this.f49, this.f48);
    }
}
