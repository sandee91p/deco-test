package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
/* renamed from: lu.die.foza.SleepyFox.ຬ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຬ.class */
public interface AbstractC0407 extends IInterface {

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final String f976 = "lu.die.fozalib.IScalePackageObserver";

    /* renamed from: lu.die.foza.SleepyFox.ຬ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຬ$Ϳ.class */
    public static class C0408 implements AbstractC0407 {
        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԩ */
        public PackageInfo mo327(String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԫ */
        public String mo357(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԯ */
        public String[] mo358(String str) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԭ */
        public int mo339(String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԫ */
        public void mo342(String str, String str2) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ՠ */
        public String mo343(String str) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ֈ */
        public int mo346(String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԯ */
        public ProviderInfo mo350(String str) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public int mo354(ComponentName componentName) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԭ */
        public void mo348(String str) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public void mo349() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԩ */
        public ServiceInfo mo328(ComponentName componentName, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԫ */
        public ActivityInfo mo329(ComponentName componentName, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public List<PackageInfo> mo338(int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԫ */
        public int mo340(String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public boolean mo352(String str) throws RemoteException {
            return false;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԯ */
        public void mo347() throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԫ */
        public List<ResolveInfo> mo333(Intent intent, String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public void mo359(String str, String str2) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԩ */
        public boolean mo345(String str) throws RemoteException {
            return false;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public List<String> mo351(String str, long j) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԫ */
        public void mo355(ComponentName componentName, int i) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public ApplicationInfo mo330(String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public ProviderInfo mo331(ComponentName componentName, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: ԩ */
        public List<ResolveInfo> mo335(Intent intent, String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public ActivityInfo mo332(ComponentName componentName, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public int mo341(String str, boolean z) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public List<ResolveInfo> mo334(Intent intent, String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public boolean mo344(String str) throws RemoteException {
            return false;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public List<ProviderInfo> mo356(String str, int i, String str2) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public void mo353(int i) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ԩ */
        public ActivityInfo mo324(Intent intent) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public List<ResolveInfo> mo336(Intent intent, String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public ProviderInfo mo337(String str, int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public ServiceInfo mo325(Intent intent) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0407
        /* renamed from: Ϳ */
        public void mo326() throws RemoteException {
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຬ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຬ$Ԩ.class */
    public static abstract class AbstractBinderC0409 extends Binder implements AbstractC0407 {

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final int f977 = 1;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public static final int f978 = 2;

        /* renamed from: ԯ  reason: contains not printable characters */
        public static final int f979 = 3;

        /* renamed from: ՠ  reason: contains not printable characters */
        public static final int f980 = 4;

        /* renamed from: ֈ  reason: contains not printable characters */
        public static final int f981 = 5;

        /* renamed from: ֏  reason: contains not printable characters */
        public static final int f982 = 6;

        /* renamed from: ׯ  reason: contains not printable characters */
        public static final int f983 = 7;

        /* renamed from: ؠ  reason: contains not printable characters */
        public static final int f984 = 8;

        /* renamed from: ހ  reason: contains not printable characters */
        public static final int f985 = 9;

        /* renamed from: ށ  reason: contains not printable characters */
        public static final int f986 = 10;

        /* renamed from: ނ  reason: contains not printable characters */
        public static final int f987 = 11;

        /* renamed from: ރ  reason: contains not printable characters */
        public static final int f988 = 12;

        /* renamed from: ބ  reason: contains not printable characters */
        public static final int f989 = 13;

        /* renamed from: ޅ  reason: contains not printable characters */
        public static final int f990 = 14;

        /* renamed from: ކ  reason: contains not printable characters */
        public static final int f991 = 15;

        /* renamed from: އ  reason: contains not printable characters */
        public static final int f992 = 16;

        /* renamed from: ވ  reason: contains not printable characters */
        public static final int f993 = 17;

        /* renamed from: މ  reason: contains not printable characters */
        public static final int f994 = 18;

        /* renamed from: ފ  reason: contains not printable characters */
        public static final int f995 = 19;

        /* renamed from: ދ  reason: contains not printable characters */
        public static final int f996 = 20;

        /* renamed from: ތ  reason: contains not printable characters */
        public static final int f997 = 21;

        /* renamed from: ލ  reason: contains not printable characters */
        public static final int f998 = 22;

        /* renamed from: ގ  reason: contains not printable characters */
        public static final int f999 = 23;

        /* renamed from: ޏ  reason: contains not printable characters */
        public static final int f1000 = 24;

        /* renamed from: ސ  reason: contains not printable characters */
        public static final int f1001 = 25;

        /* renamed from: ޑ  reason: contains not printable characters */
        public static final int f1002 = 26;

        /* renamed from: ޒ  reason: contains not printable characters */
        public static final int f1003 = 27;

        /* renamed from: ޓ  reason: contains not printable characters */
        public static final int f1004 = 28;

        /* renamed from: ޔ  reason: contains not printable characters */
        public static final int f1005 = 29;

        /* renamed from: ޕ  reason: contains not printable characters */
        public static final int f1006 = 30;

        /* renamed from: ޖ  reason: contains not printable characters */
        public static final int f1007 = 31;

        /* renamed from: ޗ  reason: contains not printable characters */
        public static final int f1008 = 32;

        /* renamed from: ޘ  reason: contains not printable characters */
        public static final int f1009 = 33;

        /* renamed from: ޙ  reason: contains not printable characters */
        public static final int f1010 = 34;

        /* renamed from: ޚ  reason: contains not printable characters */
        public static final int f1011 = 35;

        /* renamed from: ޛ  reason: contains not printable characters */
        public static final int f1012 = 36;

        /* renamed from: lu.die.foza.SleepyFox.ຬ$Ԩ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຬ$Ԩ$Ϳ.class */
        public static class C0410 implements AbstractC0407 {

            /* renamed from: ԭ  reason: contains not printable characters */
            public IBinder f1013;

            public C0410(IBinder iBinder) {
                this.f1013 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1013;
            }

            /* renamed from: ֈ  reason: contains not printable characters */
            public String m2296() {
                return AbstractC0407.f976;
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԩ */
            public PackageInfo mo327(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PackageInfo) C0411.m2297(obtain2, PackageInfo.CREATOR);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԫ */
            public String mo357(String str, String str2) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    th.writeString(str2);
                    this.f1013.transact(15, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readString();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԯ */
            public String[] mo358(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(16, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.createStringArray();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԭ */
            public int mo339(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(20, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԫ */
            public void mo342(String str, String str2) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1013.transact(23, obtain, obtain2, 0);
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
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ՠ */
            public String mo343(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(24, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readString();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԯ */
            public ProviderInfo mo350(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    this.f1013.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) C0411.m2297(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public int mo354(ComponentName componentName) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, componentName, 0);
                    this.f1013.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԭ */
            public void mo348(String str) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    this.f1013.transact(35, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public void mo349() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    this.f1013.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԫ */
            public ActivityInfo mo329(ComponentName componentName, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, componentName, 0);
                    obtain.writeInt(i);
                    this.f1013.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) C0411.m2297(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԫ */
            public int mo340(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(21, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ֈ */
            public int mo346(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(27, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public boolean mo352(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(30, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain != 0;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԩ */
            public ServiceInfo mo328(ComponentName componentName, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, componentName, 0);
                    obtain.writeInt(i);
                    this.f1013.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ServiceInfo) C0411.m2297(obtain2, ServiceInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public void mo359(String str, String str2) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1013.transact(17, obtain, obtain2, 0);
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
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<android.content.pm.PackageInfo>, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public List<PackageInfo> mo338(int i) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeInt(i);
                    this.f1013.transact(19, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.createTypedArrayList(PackageInfo.CREATOR);
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԫ */
            public void mo355(ComponentName componentName, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, componentName, 0);
                    obtain.writeInt(i);
                    this.f1013.transact(33, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԯ */
            public void mo347() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    this.f1013.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public ApplicationInfo mo330(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ApplicationInfo) C0411.m2297(obtain2, ApplicationInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public List<String> mo351(String str, long j) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    th.writeLong(j);
                    this.f1013.transact(29, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.createStringArrayList();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public ProviderInfo mo331(ComponentName componentName, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, componentName, 0);
                    obtain.writeInt(i);
                    this.f1013.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) C0411.m2297(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public ActivityInfo mo332(ComponentName componentName, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, componentName, 0);
                    obtain.writeInt(i);
                    this.f1013.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) C0411.m2297(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԫ */
            public List<ResolveInfo> mo333(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԩ */
            public boolean mo345(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(26, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain != 0;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: ԩ */
            public List<ResolveInfo> mo335(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public int mo341(String str, boolean z) throws RemoteException {
                ?? r0 = z;
                th = Parcel.obtain();
                Parcel obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    th.writeInt(r0 != 0 ? 1 : 0);
                    this.f1013.transact(22, th, obtain, 0);
                    obtain.readException();
                    r0 = obtain.readInt();
                    return r0;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public List<ResolveInfo> mo334(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public boolean mo344(String str) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    this.f1013.transact(25, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain != 0;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<android.content.pm.ProviderInfo>] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public List<ProviderInfo> mo356(String str, int i, String str2) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0407.f976);
                    th.writeString(str);
                    th.writeInt(i);
                    th.writeString(str2);
                    this.f1013.transact(14, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.createTypedArrayList(ProviderInfo.CREATOR);
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public List<ResolveInfo> mo336(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public void mo353(int i) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeInt(i);
                    this.f1013.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ԩ */
            public ActivityInfo mo324(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, intent, 0);
                    this.f1013.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) C0411.m2297(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public ProviderInfo mo337(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1013.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) C0411.m2297(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public ServiceInfo mo325(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    C0411.m2298(obtain, intent, 0);
                    this.f1013.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ServiceInfo) C0411.m2297(obtain2, ServiceInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0407
            /* renamed from: Ϳ */
            public void mo326() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0407.f976);
                    this.f1013.transact(3, obtain, obtain2, 0);
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

        public AbstractBinderC0409() {
            attachInterface(this, AbstractC0407.f976);
        }

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static AbstractC0407 m2295(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AbstractC0407.f976);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0407)) ? new C0410(iBinder) : (AbstractC0407) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ActivityInfo mo324;
            int i3;
            ServiceInfo mo325;
            int i4;
            ProviderInfo mo331;
            int i5;
            boolean mo344;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AbstractC0407.f976);
            }
            if (i == 1598968902) {
                parcel2.writeString(AbstractC0407.f976);
                return true;
            }
            switch (i) {
                case 1:
                    mo324 = mo324((Intent) C0411.m2297(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    i3 = 1;
                    C0411.m2298(parcel2, mo324, i3);
                    return true;
                case 2:
                    mo325 = mo325((Intent) C0411.m2297(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    i4 = 1;
                    C0411.m2298(parcel2, mo325, i4);
                    return true;
                case 3:
                    mo326();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    PackageInfo mo327 = mo327(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    C0411.m2298(parcel2, mo327, 1);
                    return true;
                case 5:
                    mo325 = mo328((ComponentName) C0411.m2297(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    i4 = 1;
                    C0411.m2298(parcel2, mo325, i4);
                    return true;
                case 6:
                    mo324 = mo329((ComponentName) C0411.m2297(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    i3 = 1;
                    C0411.m2298(parcel2, mo324, i3);
                    return true;
                case 7:
                    ApplicationInfo mo330 = mo330(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    C0411.m2298(parcel2, mo330, 1);
                    return true;
                case 8:
                    mo331 = mo331((ComponentName) C0411.m2297(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    i5 = 1;
                    C0411.m2298(parcel2, mo331, i5);
                    return true;
                case 9:
                    mo324 = mo332((ComponentName) C0411.m2297(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    i3 = 1;
                    C0411.m2298(parcel2, mo324, i3);
                    return true;
                case 10:
                    List<ResolveInfo> mo333 = mo333((Intent) C0411.m2297(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo333);
                    return true;
                case 11:
                    List<ResolveInfo> mo334 = mo334((Intent) C0411.m2297(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo334);
                    return true;
                case 12:
                    List<ResolveInfo> mo335 = mo335((Intent) C0411.m2297(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo335);
                    return true;
                case 13:
                    List<ResolveInfo> mo336 = mo336((Intent) C0411.m2297(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo336);
                    return true;
                case 14:
                    List<ProviderInfo> mo356 = mo356(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo356);
                    return true;
                case 15:
                    String mo357 = mo357(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(mo357);
                    return true;
                case 16:
                    String[] mo358 = mo358(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(mo358);
                    return true;
                case 17:
                    mo359(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    mo331 = mo337(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    i5 = 1;
                    C0411.m2298(parcel2, mo331, i5);
                    return true;
                case 19:
                    List<PackageInfo> mo338 = mo338(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo338);
                    return true;
                case 20:
                    int mo339 = mo339(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo339);
                    return true;
                case 21:
                    int mo340 = mo340(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo340);
                    return true;
                case 22:
                    int mo341 = mo341(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo341);
                    return true;
                case 23:
                    mo342(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    String mo343 = mo343(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(mo343);
                    return true;
                case 25:
                    mo344 = mo344(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo344);
                    return true;
                case 26:
                    mo344 = mo345(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo344);
                    return true;
                case 27:
                    int mo346 = mo346(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo346);
                    return true;
                case 28:
                    mo331 = mo350(parcel.readString());
                    parcel2.writeNoException();
                    i5 = 1;
                    C0411.m2298(parcel2, mo331, i5);
                    return true;
                case 29:
                    List<String> mo351 = mo351(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeStringList(mo351);
                    return true;
                case 30:
                    mo344 = mo352(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo344);
                    return true;
                case 31:
                    mo353(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    int mo354 = mo354((ComponentName) C0411.m2297(parcel, ComponentName.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(mo354);
                    return true;
                case 33:
                    mo355((ComponentName) C0411.m2297(parcel, ComponentName.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    mo347();
                    parcel2.writeNoException();
                    return true;
                case f1011 /* 35 */:
                    mo348(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    mo349();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຬ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຬ$Ԫ.class */
    public static class C0411 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T> T m2297(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T extends Parcelable> void m2298(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    /* renamed from: Ԩ */
    ActivityInfo mo324(Intent intent) throws RemoteException;

    /* renamed from: Ϳ */
    ServiceInfo mo325(Intent intent) throws RemoteException;

    /* renamed from: Ϳ */
    void mo326() throws RemoteException;

    /* renamed from: ԩ */
    PackageInfo mo327(String str, int i) throws RemoteException;

    /* renamed from: ԩ */
    ServiceInfo mo328(ComponentName componentName, int i) throws RemoteException;

    /* renamed from: Ԫ */
    ActivityInfo mo329(ComponentName componentName, int i) throws RemoteException;

    /* renamed from: Ԩ */
    ApplicationInfo mo330(String str, int i) throws RemoteException;

    /* renamed from: Ϳ */
    ProviderInfo mo331(ComponentName componentName, int i) throws RemoteException;

    /* renamed from: Ԩ */
    ActivityInfo mo332(ComponentName componentName, int i) throws RemoteException;

    /* renamed from: Ԫ */
    List<ResolveInfo> mo333(Intent intent, String str, int i) throws RemoteException;

    /* renamed from: Ԩ */
    List<ResolveInfo> mo334(Intent intent, String str, int i) throws RemoteException;

    /* renamed from: ԩ */
    List<ResolveInfo> mo335(Intent intent, String str, int i) throws RemoteException;

    /* renamed from: Ϳ */
    List<ResolveInfo> mo336(Intent intent, String str, int i) throws RemoteException;

    /* renamed from: Ϳ */
    List<ProviderInfo> mo356(String str, int i, String str2) throws RemoteException;

    /* renamed from: ԫ */
    String mo357(String str, String str2) throws RemoteException;

    /* renamed from: Ԯ */
    String[] mo358(String str) throws RemoteException;

    /* renamed from: Ԩ */
    void mo359(String str, String str2) throws RemoteException;

    /* renamed from: Ϳ */
    ProviderInfo mo337(String str, int i) throws RemoteException;

    /* renamed from: Ϳ */
    List<PackageInfo> mo338(int i) throws RemoteException;

    /* renamed from: ԭ */
    int mo339(String str) throws RemoteException;

    /* renamed from: ԫ */
    int mo340(String str) throws RemoteException;

    /* renamed from: Ϳ */
    int mo341(String str, boolean z) throws RemoteException;

    /* renamed from: Ԫ */
    void mo342(String str, String str2) throws RemoteException;

    /* renamed from: ՠ */
    String mo343(String str) throws RemoteException;

    /* renamed from: Ϳ */
    boolean mo344(String str) throws RemoteException;

    /* renamed from: ԩ */
    boolean mo345(String str) throws RemoteException;

    /* renamed from: ֈ */
    int mo346(String str) throws RemoteException;

    /* renamed from: ԯ */
    ProviderInfo mo350(String str) throws RemoteException;

    /* renamed from: Ϳ */
    List<String> mo351(String str, long j) throws RemoteException;

    /* renamed from: Ԩ */
    boolean mo352(String str) throws RemoteException;

    /* renamed from: Ԩ */
    void mo353(int i) throws RemoteException;

    /* renamed from: Ϳ */
    int mo354(ComponentName componentName) throws RemoteException;

    /* renamed from: ԫ */
    void mo355(ComponentName componentName, int i) throws RemoteException;

    /* renamed from: ԯ */
    void mo347() throws RemoteException;

    /* renamed from: Ԭ */
    void mo348(String str) throws RemoteException;

    /* renamed from: Ԩ */
    void mo349() throws RemoteException;
}
