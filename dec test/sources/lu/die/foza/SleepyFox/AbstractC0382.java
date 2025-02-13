package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: lu.die.foza.SleepyFox.ຓ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຓ.class */
public interface AbstractC0382 extends IInterface {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final String f894 = "lu.die.fozalib.IFozaDispatcher";

    /* renamed from: lu.die.foza.SleepyFox.ຓ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຓ$Ϳ.class */
    public static class C0383 implements AbstractC0382 {
        @Override // lu.die.foza.SleepyFox.AbstractC0382
        /* renamed from: Ϳ */
        public void mo1793(C0355 c0355) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0382
        /* renamed from: Ԯ */
        public void mo1794() throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0382
        /* renamed from: ԩ */
        public Intent mo1795(Intent intent) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0382
        /* renamed from: Ϳ */
        public int mo1796(int i, Bundle bundle) throws RemoteException {
            return 0;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຓ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຓ$Ԩ.class */
    public static abstract class AbstractBinderC0384 extends Binder implements AbstractC0382 {

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final int f895 = 1;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public static final int f896 = 2;

        /* renamed from: ԯ  reason: contains not printable characters */
        public static final int f897 = 3;

        /* renamed from: ՠ  reason: contains not printable characters */
        public static final int f898 = 4;

        public AbstractBinderC0384() {
            attachInterface(this, AbstractC0382.f894);
        }

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static AbstractC0382 m2265(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AbstractC0382.f894);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0382)) ? new C0385(iBinder) : (AbstractC0382) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AbstractC0382.f894);
            }
            if (i == 1598968902) {
                parcel2.writeString(AbstractC0382.f894);
                return true;
            }
            switch (i) {
                case 1:
                    mo1793((C0355) C0386.m2267(parcel, C0355.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    mo1794();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Intent mo1795 = mo1795((Intent) C0386.m2267(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    C0386.m2268(parcel2, mo1795, 1);
                    return true;
                case 4:
                    int mo1796 = mo1796(parcel.readInt(), (Bundle) C0386.m2267(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1796);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.ຓ$Ԩ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຓ$Ԩ$Ϳ.class */
        public static class C0385 implements AbstractC0382 {

            /* renamed from: ԭ  reason: contains not printable characters */
            public IBinder f899;

            public C0385(IBinder iBinder) {
                this.f899 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f899;
            }

            /* renamed from: ֈ  reason: contains not printable characters */
            public String m2266() {
                return AbstractC0382.f894;
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0382
            /* renamed from: Ϳ */
            public void mo1793(C0355 c0355) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0382.f894);
                    C0386.m2268(obtain, c0355, 0);
                    this.f899.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0382
            /* renamed from: Ԯ */
            public void mo1794() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0382.f894);
                    this.f899.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0382
            /* renamed from: ԩ */
            public Intent mo1795(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0382.f894);
                    C0386.m2268(obtain, intent, 0);
                    this.f899.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) C0386.m2267(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0382
            /* renamed from: Ϳ */
            public int mo1796(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0382.f894);
                    obtain.writeInt(i);
                    C0386.m2268(obtain, bundle, 0);
                    this.f899.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຓ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຓ$Ԫ.class */
    public static class C0386 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T> T m2267(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T extends Parcelable> void m2268(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    /* renamed from: Ϳ */
    void mo1793(C0355 c0355) throws RemoteException;

    /* renamed from: Ԯ */
    void mo1794() throws RemoteException;

    /* renamed from: ԩ */
    Intent mo1795(Intent intent) throws RemoteException;

    /* renamed from: Ϳ */
    int mo1796(int i, Bundle bundle) throws RemoteException;
}
