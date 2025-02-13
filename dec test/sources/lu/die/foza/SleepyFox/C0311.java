package lu.die.foza.SleepyFox;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.C0296;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢶ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢶ.class */
public final class C0311 implements Parcelable {
    @NotNull
    public static final C0312 CREATOR = new C0312();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final PackageInfo f732;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean f733;
    @Nullable

    /* renamed from: ԩ  reason: contains not printable characters */
    public C0296.C0298 f734;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public C0257 f735;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final C0164<String> f736;

    /* renamed from: lu.die.foza.SleepyFox.ࢶ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢶ$Ϳ.class */
    public static final class C0312 implements Parcelable.Creator<C0311> {
        public C0312() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0311 m1860(@NotNull Parcel parcel) {
            return new C0311(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0311 createFromParcel(Parcel parcel) {
            return new C0311(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0311[] newArray(int i) {
            return new C0311[i];
        }

        public /* synthetic */ C0312(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public C0311[] m1861(int i) {
            return new C0311[i];
        }
    }

    public C0311(@NotNull PackageInfo packageInfo) {
        this.f732 = packageInfo;
        this.f735 = C0257.f540;
        this.f736 = new C0164<>(1);
    }

    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final PackageInfo m1852() {
        return this.f732;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m1853() {
        return this.f733;
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0296.C0298 m1855() {
        return this.f734;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0257 m1857() {
        return this.f735;
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final C0164<String> m1859() {
        return this.f736;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f732, i);
        parcel.writeString(null);
        parcel.writeByte((byte) 0);
        parcel.writeByte(this.f733 ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0311(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            r0 = r8
            r1 = r0
            r2 = r1
            r3 = r7
            r4 = r8
            java.lang.Class<android.content.pm.PackageInfo> r5 = android.content.pm.PackageInfo.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            android.os.Parcelable r4 = r4.readParcelable(r5)
            r5 = r4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4
            r3.<init>(r4)
            java.lang.String r2 = r2.readString()
            byte r1 = r1.readByte()
            byte r0 = r0.readByte()
            if (r0 == 0) goto L2a
            r0 = 1
            r8 = r0
            goto L2c
        L2a:
            r0 = 0
            r8 = r0
        L2c:
            r0 = r7
            r1 = r8
            r0.f733 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0311.<init>(android.os.Parcel):void");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1858(@NotNull C0257 c0257) {
        this.f735 = c0257;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1856(@Nullable C0296.C0298 c0298) {
        this.f734 = c0298;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1854(boolean z) {
        this.f733 = z;
    }
}
