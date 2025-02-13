package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࣄ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣄ.class */
public final class C0334 implements Parcelable {
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final C0336 f792 = new C0336();
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final C0334 f793 = new C0334();
    @JvmField
    @NotNull
    public static final Parcelable.Creator<C0334> CREATOR = new C0335();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean f794;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean f795;

    /* renamed from: ԩ  reason: contains not printable characters */
    public boolean f796;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public boolean f797;

    /* renamed from: ԫ  reason: contains not printable characters */
    public boolean f798;
    @Nullable

    /* renamed from: Ԭ  reason: contains not printable characters */
    public String f799;

    /* renamed from: ԭ  reason: contains not printable characters */
    public boolean f800;

    /* renamed from: lu.die.foza.SleepyFox.ࣄ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣄ$Ϳ.class */
    public static final class C0335 implements Parcelable.Creator<C0334> {
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0334 m2065(Parcel parcel) {
            return new C0334(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0334 createFromParcel(Parcel parcel) {
            return new C0334(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0334[] newArray(int i) {
            return new C0334[i];
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0334[] m2066(int i) {
            return new C0334[i];
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࣄ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣄ$Ԩ.class */
    public static final class C0336 {
        public C0336() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0334 m2067() {
            return C0334.f793;
        }

        public /* synthetic */ C0336(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0334() {
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m2051() {
        return this.f794;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final boolean m2053() {
        return this.f795;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m2055() {
        return this.f796;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m2057() {
        return this.f797;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m2059() {
        return this.f798;
    }

    @Nullable
    /* renamed from: Ԯ  reason: contains not printable characters */
    public final String m2061() {
        return this.f799;
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public final boolean m2063() {
        return this.f800;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeByte(this.f794 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f795 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f796 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f797 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f798 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f800 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f799);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0334(@NotNull Parcel parcel) {
        this();
        this.f794 = parcel.readByte() != 0;
        this.f795 = parcel.readByte() != 0;
        this.f796 = parcel.readByte() != 0;
        this.f797 = parcel.readByte() != 0;
        this.f798 = parcel.readByte() != 0;
        this.f800 = parcel.readByte() != 0;
        this.f799 = parcel.readString();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m2052(boolean z) {
        this.f794 = z;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final void m2054(boolean z) {
        this.f795 = z;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final void m2056(boolean z) {
        this.f796 = z;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2058(boolean z) {
        this.f797 = z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2060(boolean z) {
        this.f798 = z;
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final void m2064(boolean z) {
        this.f800 = z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2062(@Nullable String str) {
        this.f799 = str;
    }
}
