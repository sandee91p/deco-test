package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaAccountsRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaAccountsRegion.kt\nlu/die/foza/Framework/Impl/FozaAccountsRegion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n37#2,2:119\n37#2,2:121\n*S KotlinDebug\n*F\n+ 1 FozaAccountsRegion.kt\nlu/die/foza/Framework/Impl/FozaAccountsRegion\n*L\n20#1:119,2\n67#1:121,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢠ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢠ.class */
public final class C0261 implements Parcelable {
    @NotNull
    public static final C0262 CREATOR = new C0262();
    @JvmField
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object f545;
    @JvmField

    /* renamed from: Ԩ  reason: contains not printable characters */
    public int f546;
    @JvmField
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public final List<C0352> f547;

    /* renamed from: lu.die.foza.SleepyFox.ࢠ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢠ$Ϳ.class */
    public static final class C0262 implements Parcelable.Creator<C0261> {
        public C0262() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0261 m1633(@NotNull Parcel parcel) {
            return new C0261(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0261 createFromParcel(Parcel parcel) {
            return new C0261(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0261[] newArray(int i) {
            return new C0261[i];
        }

        public /* synthetic */ C0262(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0261[] m1634(int i) {
            return new C0261[i];
        }
    }

    public C0261() {
        this.f545 = new Object();
        this.f547 = new ArrayList();
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0352 m1624(@NotNull Account account) {
        C0352 c0352 = new C0352();
        c0352.f831 = account;
        this.f547.add(c0352);
        return c0352;
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0352 m1625(@NotNull Account account) {
        for (C0352 c0352 : this.f547) {
            if (c0352.m2158(account)) {
                return c0352;
            }
        }
        return null;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1626(@NotNull Account account) {
        return TypeIntrinsics.asMutableCollection(this.f547).remove(m1625(account));
    }

    @NotNull
    /* renamed from: ԭ  reason: contains not printable characters */
    public final Map<String, Integer> m1627(@NotNull Account account) {
        C0352 m1625 = m1625(account);
        return m1625 == null ? new HashMap() : m1625.f834;
    }

    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public final Map<String, String> m1628(@NotNull Account account) {
        C0352 m1625 = m1625(account);
        return m1625 == null ? new HashMap() : m1625.f833;
    }

    @NotNull
    /* renamed from: Ԭ  reason: contains not printable characters */
    public final Map<String, String> m1629(@NotNull Account account) {
        C0352 m1625 = m1625(account);
        return m1625 == null ? new HashMap() : m1625.f835;
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public final void m1631(@NotNull Account account) {
        C0352 m1625 = m1625(account);
        if (m1625 != null) {
            m1625.f836 = System.currentTimeMillis();
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final long m1632(@NotNull Account account) {
        C0352 m1625 = m1625(account);
        return m1625 != null ? m1625.f836 : -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeInt(this.f546);
        parcel.writeInt(this.f547.size());
        for (C0352 c0352 : this.f547) {
            c0352.writeToParcel(parcel, 0);
        }
    }

    public C0261(Parcel parcel) {
        this.f545 = new Object();
        this.f546 = parcel.readInt();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C0352.CREATOR.m2160(parcel));
        }
        this.f547 = arrayList;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Account[] m1630(@NotNull String str) {
        ArrayList arrayList = new ArrayList();
        for (C0352 c0352 : this.f547) {
            Account account = c0352.f831;
            if (Intrinsics.areEqual(account != null ? account.type : null, str)) {
                arrayList.add(account);
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public /* synthetic */ C0261(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Account[] m1623() {
        ArrayList arrayList = new ArrayList();
        for (C0352 c0352 : this.f547) {
            Account account = c0352.f831;
            if (account != null) {
                arrayList.add(account);
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }
}
