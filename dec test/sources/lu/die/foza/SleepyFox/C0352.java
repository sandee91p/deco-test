package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ഺ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ഺ.class */
public final class C0352 implements Parcelable {
    @NotNull
    public static final C0353 CREATOR = new C0353();
    @JvmField
    @Nullable

    /* renamed from: Ϳ  reason: contains not printable characters */
    public Account f831;
    @JvmField
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public String f832;
    @JvmField
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final HashMap<String, String> f833;
    @JvmField
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final HashMap<String, Integer> f834;
    @JvmField
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final HashMap<String, String> f835;

    /* renamed from: Ԭ  reason: contains not printable characters */
    public long f836;

    /* renamed from: lu.die.foza.SleepyFox.ഺ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ഺ$Ϳ.class */
    public static final class C0353 implements Parcelable.Creator<C0352> {
        public C0353() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0352 m2160(@NotNull Parcel parcel) {
            return new C0352(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0352 createFromParcel(Parcel parcel) {
            return new C0352(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0352[] newArray(int i) {
            return new C0352[i];
        }

        public /* synthetic */ C0353(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0352[] m2161(int i) {
            return new C0352[i];
        }
    }

    public C0352() {
        this.f833 = new LinkedHashMap();
        this.f834 = new LinkedHashMap();
        this.f835 = new LinkedHashMap();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m2156() {
        return this.f836;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f831, i);
        parcel.writeString(this.f832);
        parcel.writeSerializable(this.f833);
        parcel.writeSerializable(this.f834);
        parcel.writeSerializable(this.f835);
        parcel.writeLong(this.f836);
    }

    public C0352(Parcel parcel) {
        this.f831 = (Account) parcel.readParcelable(Account.class.getClassLoader());
        this.f832 = parcel.readString();
        Serializable readSerializable = parcel.readSerializable();
        LinkedHashMap linkedHashMap = readSerializable instanceof HashMap ? (HashMap) readSerializable : null;
        if (linkedHashMap == null) {
            linkedHashMap = r0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        }
        this.f833 = linkedHashMap;
        Serializable readSerializable2 = parcel.readSerializable();
        LinkedHashMap linkedHashMap3 = readSerializable2 instanceof HashMap ? (HashMap) readSerializable2 : null;
        if (linkedHashMap3 == null) {
            linkedHashMap3 = r0;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        }
        this.f834 = linkedHashMap3;
        Serializable readSerializable3 = parcel.readSerializable();
        LinkedHashMap linkedHashMap5 = readSerializable3 instanceof HashMap ? (HashMap) readSerializable3 : null;
        if (linkedHashMap5 == null) {
            linkedHashMap5 = r0;
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        }
        this.f835 = linkedHashMap5;
        this.f836 = parcel.readLong();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2159(@NotNull String str, @NotNull String str2) {
        this.f833.put(str, str2);
    }

    public /* synthetic */ C0352(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2158(@Nullable Account account) {
        if (account == null) {
            return false;
        }
        return Intrinsics.areEqual(account, this.f831);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2157(long j) {
        this.f836 = j;
    }
}
