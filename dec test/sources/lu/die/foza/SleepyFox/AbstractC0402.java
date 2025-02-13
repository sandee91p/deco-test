package lu.die.foza.SleepyFox;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: lu.die.foza.SleepyFox.ຩ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຩ.class */
public interface AbstractC0402 extends IInterface {

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final String f971 = "lu.die.fozalib.IScaleContentObserver";

    /* renamed from: lu.die.foza.SleepyFox.ຩ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຩ$Ϳ.class */
    public static class C0403 implements AbstractC0402 {
        @Override // lu.die.foza.SleepyFox.AbstractC0402
        /* renamed from: Ԩ */
        public void mo362(IBinder iBinder) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0402
        /* renamed from: Ϳ */
        public void mo364(Uri[] uriArr, IBinder iBinder, boolean z) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0402
        /* renamed from: Ϳ */
        public void mo363(Uri uri, boolean z, IBinder iBinder) throws RemoteException {
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຩ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຩ$Ԩ.class */
    public static abstract class AbstractBinderC0404 extends Binder implements AbstractC0402 {

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final int f972 = 1;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public static final int f973 = 2;

        /* renamed from: ԯ  reason: contains not printable characters */
        public static final int f974 = 3;

        /* renamed from: lu.die.foza.SleepyFox.ຩ$Ԩ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຩ$Ԩ$Ϳ.class */
        public static class C0405 implements AbstractC0402 {

            /* renamed from: ԭ  reason: contains not printable characters */
            public IBinder f975;

            public C0405(IBinder iBinder) {
                this.f975 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f975;
            }

            /* renamed from: ֈ  reason: contains not printable characters */
            public String m2290() {
                return AbstractC0402.f971;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0402
            /* renamed from: Ԩ */
            public void mo362(IBinder iBinder) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0402.f971);
                    obtain.writeStrongBinder(iBinder);
                    this.f975.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0402
            /* renamed from: Ϳ */
            public void mo364(Uri[] uriArr, IBinder iBinder, boolean z) throws RemoteException {
                ?? r0 = z;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0402.f971);
                    obtain.writeTypedArray(uriArr, 0);
                    obtain.writeStrongBinder(iBinder);
                    int i = r0 != 0 ? 1 : 0;
                    r0 = obtain;
                    obtain.writeInt(i);
                    this.f975.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    r0.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw r0;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0402
            /* renamed from: Ϳ */
            public void mo363(Uri uri, boolean z, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0402.f971);
                    C0406.m2292(obtain, uri, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(iBinder);
                    this.f975.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC0404() {
            attachInterface(this, AbstractC0402.f971);
        }

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static AbstractC0402 m2289(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AbstractC0402.f971);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0402)) ? new C0405(iBinder) : (AbstractC0402) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AbstractC0402.f971);
            }
            if (i == 1598968902) {
                parcel2.writeString(AbstractC0402.f971);
                return true;
            } else if (i == 1) {
                mo362(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                mo363((Uri) C0406.m2291(parcel, Uri.CREATOR), parcel.readInt() != 0, parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo364((Uri[]) parcel.createTypedArray(Uri.CREATOR), parcel.readStrongBinder(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຩ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຩ$Ԫ.class */
    public static class C0406 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T> T m2291(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T extends Parcelable> void m2292(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    /* renamed from: Ԩ */
    void mo362(IBinder iBinder) throws RemoteException;

    /* renamed from: Ϳ */
    void mo363(Uri uri, boolean z, IBinder iBinder) throws RemoteException;

    /* renamed from: Ϳ */
    void mo364(Uri[] uriArr, IBinder iBinder, boolean z) throws RemoteException;
}
