package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࣁ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣁ.class */
public final class C0329 implements Parcelable {
    @NotNull
    public static final C0330 CREATOR = new C0330();
    @Nullable

    /* renamed from: Ϳ  reason: contains not printable characters */
    public String f780;
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public String f781;
    @Nullable

    /* renamed from: ԩ  reason: contains not printable characters */
    public String f782;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public long f783;

    /* renamed from: lu.die.foza.SleepyFox.ࣁ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣁ$Ϳ.class */
    public static final class C0330 implements Parcelable.Creator<C0329> {
        public C0330() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0329 m2034(@NotNull Parcel parcel) {
            return new C0329(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0329 createFromParcel(Parcel parcel) {
            return new C0329(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0329[] newArray(int i) {
            return new C0329[i];
        }

        public /* synthetic */ C0330(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0329[] m2035(int i) {
            return new C0329[i];
        }
    }

    public C0329() {
        this.f780 = C0019.f56;
        this.f781 = C0019.f56;
        this.f782 = C0019.f56;
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final String m2026() {
        return this.f780;
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final String m2028() {
        return this.f781;
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String m2030() {
        return this.f782;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m2032() {
        return this.f783;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.f780);
        parcel.writeString(this.f781);
        parcel.writeString(this.f782);
        parcel.writeLong(this.f783);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0329(@NotNull Parcel parcel) {
        this();
        this.f780 = parcel.readString();
        this.f781 = parcel.readString();
        this.f782 = parcel.readString();
        this.f783 = parcel.readLong();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m2027(@Nullable String str) {
        this.f780 = str;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2029(@Nullable String str) {
        this.f781 = str;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2033(long j) {
        this.f783 = j;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2031(@Nullable String str) {
        this.f782 = str;
    }
}
