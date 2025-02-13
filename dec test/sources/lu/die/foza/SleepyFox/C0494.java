package lu.die.foza.SleepyFox;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ႁ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ႁ.class */
public final class C0494 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0494 f1088 = new C0494();

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T> T m2449(@NotNull Parcelable parcelable) {
        Parcel parcel = null;
        try {
            Parcel obtain = Parcel.obtain();
            parcel = obtain;
            parcel.writeParcelable(parcelable, 0);
            parcel.setDataPosition(0);
            T t = (T) obtain.readParcelable(parcelable.getClass().getClassLoader());
            parcel.recycle();
            return t;
        } catch (Throwable th) {
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final byte[] m2451(@NotNull Parcelable parcelable) {
        byte[] bArr;
        Parcel parcel = null;
        try {
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(parcelable, 0);
            bArr = obtain.marshall();
            obtain.recycle();
        } catch (Exception unused) {
            if (0 != 0) {
                parcel.recycle();
            }
            bArr = null;
        } catch (Throwable th) {
            if (0 != 0) {
                parcel.recycle();
            }
            throw th;
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Parcelable] */
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T extends Parcelable> T m2453(@Nullable byte[] bArr, @NotNull Class<?> cls) {
        T t;
        if (bArr == null) {
            return null;
        }
        Parcel parcel = null;
        try {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            t = obtain.readParcelable(cls.getClassLoader());
            obtain.recycle();
        } catch (Exception unused) {
            if (0 != 0) {
                parcel.recycle();
            }
            t = null;
        } catch (Throwable th) {
            if (0 != 0) {
                parcel.recycle();
            }
            throw th;
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable] */
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T extends Parcelable> T m2452(@NotNull byte[] bArr, @NotNull Function1<? super Parcel, ? extends T> function1) {
        T t;
        Parcel parcel = null;
        try {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            t = (Parcelable) function1.invoke(obtain);
            obtain.recycle();
        } catch (Exception unused) {
            if (0 != 0) {
                parcel.recycle();
            }
            t = null;
        } catch (Throwable th) {
            if (0 != 0) {
                parcel.recycle();
            }
            throw th;
        }
        return t;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final byte[] m2450(@NotNull Function2<? super Parcel, ? super Integer, Unit> function2) {
        byte[] bArr;
        Parcel parcel = null;
        try {
            Parcel obtain = Parcel.obtain();
            function2.invoke(obtain, 0);
            bArr = obtain.marshall();
            obtain.recycle();
        } catch (Exception unused) {
            if (0 != 0) {
                parcel.recycle();
            }
            bArr = null;
        } catch (Throwable th) {
            if (0 != 0) {
                parcel.recycle();
            }
            throw th;
        }
        return bArr;
    }
}
