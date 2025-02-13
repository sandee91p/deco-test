package lu.die.foza.SleepyFox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: lu.die.foza.SleepyFox.ຘ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຘ.class */
public interface AbstractC0387 extends IInterface {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final String f900 = "lu.die.fozalib.IFozaPrivacyObserver";

    /* renamed from: lu.die.foza.SleepyFox.ຘ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຘ$Ϳ.class */
    public static class C0388 implements AbstractC0387 {
        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: Ϳ */
        public boolean mo2037(String str, String str2, String str3) throws RemoteException {
            return false;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: ԭ */
        public void mo2038(int i) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: Ԭ */
        public void mo2039() throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: ԩ */
        public int mo2040() throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: ԫ */
        public C0329 mo2042(int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: Ԫ */
        public String mo2043(String str) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0387
        /* renamed from: ԫ */
        public void mo2041() throws RemoteException {
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຘ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຘ$Ԩ.class */
    public static abstract class AbstractBinderC0389 extends Binder implements AbstractC0387 {

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final int f901 = 1;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public static final int f902 = 2;

        /* renamed from: ԯ  reason: contains not printable characters */
        public static final int f903 = 3;

        /* renamed from: ՠ  reason: contains not printable characters */
        public static final int f904 = 4;

        /* renamed from: ֈ  reason: contains not printable characters */
        public static final int f905 = 5;

        /* renamed from: ֏  reason: contains not printable characters */
        public static final int f906 = 6;

        /* renamed from: ׯ  reason: contains not printable characters */
        public static final int f907 = 7;

        public AbstractBinderC0389() {
            attachInterface(this, AbstractC0387.f900);
        }

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static AbstractC0387 m2271(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AbstractC0387.f900);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0387)) ? new C0390(iBinder) : (AbstractC0387) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AbstractC0387.f900);
            }
            if (i == 1598968902) {
                parcel2.writeString(AbstractC0387.f900);
                return true;
            }
            switch (i) {
                case 1:
                    boolean mo2037 = mo2037(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo2037 ? 1 : 0);
                    return true;
                case 2:
                    mo2038(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    mo2039();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int mo2040 = mo2040();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo2040);
                    return true;
                case 5:
                    mo2041();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    C0329 mo2042 = mo2042(parcel.readInt());
                    parcel2.writeNoException();
                    C0391.m2274(parcel2, mo2042, 1);
                    return true;
                case 7:
                    String mo2043 = mo2043(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(mo2043);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.ຘ$Ԩ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຘ$Ԩ$Ϳ.class */
        public static class C0390 implements AbstractC0387 {

            /* renamed from: ԭ  reason: contains not printable characters */
            public IBinder f908;

            public C0390(IBinder iBinder) {
                this.f908 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f908;
            }

            /* renamed from: ֈ  reason: contains not printable characters */
            public String m2272() {
                return AbstractC0387.f900;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: Ϳ */
            public boolean mo2037(String str, String str2, String str3) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0387.f900);
                    th.writeString(str);
                    th.writeString(str2);
                    th.writeString(str3);
                    this.f908.transact(1, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain != 0;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: ԭ */
            public void mo2038(int i) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0387.f900);
                    obtain.writeInt(i);
                    this.f908.transact(2, obtain, obtain2, 0);
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
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: Ԭ */
            public void mo2039() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0387.f900);
                    this.f908.transact(3, obtain, obtain2, 0);
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
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: ԩ */
            public int mo2040() throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0387.f900);
                    this.f908.transact(4, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: ԫ */
            public C0329 mo2042(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0387.f900);
                    obtain.writeInt(i);
                    this.f908.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (C0329) C0391.m2273(obtain2, C0329.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: Ԫ */
            public String mo2043(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0387.f900);
                    th.writeString(str);
                    this.f908.transact(7, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readString();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0387
            /* renamed from: ԫ */
            public void mo2041() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0387.f900);
                    this.f908.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຘ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຘ$Ԫ.class */
    public static class C0391 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T> T m2273(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T extends Parcelable> void m2274(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    /* renamed from: Ϳ */
    boolean mo2037(String str, String str2, String str3) throws RemoteException;

    /* renamed from: ԭ */
    void mo2038(int i) throws RemoteException;

    /* renamed from: Ԭ */
    void mo2039() throws RemoteException;

    /* renamed from: ԩ */
    int mo2040() throws RemoteException;

    /* renamed from: ԫ */
    void mo2041() throws RemoteException;

    /* renamed from: ԫ */
    C0329 mo2042(int i) throws RemoteException;

    /* renamed from: Ԫ */
    String mo2043(String str) throws RemoteException;
}
