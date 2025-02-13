package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ൔ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൔ.class */
public class C0355 implements Parcelable {
    @NotNull
    public static final C0356 CREATOR = new C0356();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int f838;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String f839;
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final String f840;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final String f841;

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean f842;

    /* renamed from: lu.die.foza.SleepyFox.ൔ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൔ$Ϳ.class */
    public static final class C0356 implements Parcelable.Creator<C0355> {
        public C0356() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0355 m2175(@NotNull Parcel parcel) {
            return new C0355(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0355 createFromParcel(Parcel parcel) {
            return new C0355(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0355[] newArray(int i) {
            return new C0355[i];
        }

        public /* synthetic */ C0356(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0355[] m2176(int i) {
            return new C0355[i];
        }
    }

    public C0355(@NotNull Parcel parcel) {
        this.f838 = parcel.readInt();
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        this.f839 = readString;
        String readString2 = parcel.readString();
        String str = readString2;
        Intrinsics.checkNotNull(readString2);
        this.f840 = readString2;
        String readString3 = parcel.readString();
        this.f841 = readString3 != null ? readString3 : str;
        this.f842 = parcel.readByte() != 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final int m2170() {
        return this.f838;
    }

    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public final String m2171() {
        return this.f839;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String m2172() {
        return this.f840;
    }

    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final String m2173() {
        return this.f841;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2174() {
        return this.f842;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeInt(this.f838);
        parcel.writeString(this.f839);
        parcel.writeString(this.f840);
        parcel.writeString(this.f841);
        parcel.writeByte(this.f842 ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0355(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        this.f840 = str;
        this.f839 = str3;
        this.f838 = i;
        this.f842 = z;
        this.f841 = str2;
    }
}
