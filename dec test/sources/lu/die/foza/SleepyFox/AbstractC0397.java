package lu.die.foza.SleepyFox;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
import lu.die.foza.SleepyFox.AbstractC0382;
import lu.die.foza.SleepyFox.AbstractC0387;
/* renamed from: lu.die.foza.SleepyFox.ຨ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຨ.class */
public interface AbstractC0397 extends IInterface {

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final String f945 = "lu.die.fozalib.IScaleActivityManager";

    /* renamed from: lu.die.foza.SleepyFox.ຨ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຨ$Ϳ.class */
    public static class C0398 implements AbstractC0397 {
        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ԩ */
        public Intent mo1301(Intent intent, String str) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: ԭ */
        public AbstractC0387 mo1302() throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public int mo1307(Intent intent, ServiceInfo serviceInfo, IBinder iBinder, String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: ՠ */
        public void mo1310() throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: ԩ */
        public void mo1317(IBinder iBinder) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ԫ */
        public void mo1322() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ԩ */
        public ComponentName mo1305(Intent intent, ServiceInfo serviceInfo, String str) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public int mo1315(Intent intent, String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ԫ */
        public String mo1319(int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: ԩ */
        public List<ActivityManager.RunningAppProcessInfo> mo1324(int i) throws RemoteException {
            return null;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: ԩ */
        public void mo1303(String str, String str2) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public int mo1304(ProviderInfo providerInfo, String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ԫ */
        public boolean mo1313(String str, String str2, int i) throws RemoteException {
            return false;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: ԩ */
        public void mo1309(Intent intent, String str) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public void mo1311(String str, String str2) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ԫ */
        public void mo1318(Intent intent) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public void mo1312(String str, String str2, boolean z) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public void mo1320(long j) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public void mo1316(IntentFilter intentFilter, IBinder iBinder, String str, AbstractC0382 abstractC0382) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public void mo1323(C0355 c0355, AbstractC0382 abstractC0382) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public void mo1321(long j, Notification notification, int i) throws RemoteException {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public int mo1306(Intent intent, ServiceInfo serviceInfo, String str) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public int mo1308(IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0397
        /* renamed from: Ϳ */
        public Intent mo1314(Intent intent, int i) throws RemoteException {
            return null;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຨ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຨ$Ԩ.class */
    public static abstract class AbstractBinderC0399 extends Binder implements AbstractC0397 {

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final int f946 = 1;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public static final int f947 = 2;

        /* renamed from: ԯ  reason: contains not printable characters */
        public static final int f948 = 3;

        /* renamed from: ՠ  reason: contains not printable characters */
        public static final int f949 = 4;

        /* renamed from: ֈ  reason: contains not printable characters */
        public static final int f950 = 5;

        /* renamed from: ֏  reason: contains not printable characters */
        public static final int f951 = 6;

        /* renamed from: ׯ  reason: contains not printable characters */
        public static final int f952 = 7;

        /* renamed from: ؠ  reason: contains not printable characters */
        public static final int f953 = 8;

        /* renamed from: ހ  reason: contains not printable characters */
        public static final int f954 = 9;

        /* renamed from: ށ  reason: contains not printable characters */
        public static final int f955 = 10;

        /* renamed from: ނ  reason: contains not printable characters */
        public static final int f956 = 11;

        /* renamed from: ރ  reason: contains not printable characters */
        public static final int f957 = 12;

        /* renamed from: ބ  reason: contains not printable characters */
        public static final int f958 = 13;

        /* renamed from: ޅ  reason: contains not printable characters */
        public static final int f959 = 14;

        /* renamed from: ކ  reason: contains not printable characters */
        public static final int f960 = 15;

        /* renamed from: އ  reason: contains not printable characters */
        public static final int f961 = 16;

        /* renamed from: ވ  reason: contains not printable characters */
        public static final int f962 = 17;

        /* renamed from: މ  reason: contains not printable characters */
        public static final int f963 = 18;

        /* renamed from: ފ  reason: contains not printable characters */
        public static final int f964 = 19;

        /* renamed from: ދ  reason: contains not printable characters */
        public static final int f965 = 20;

        /* renamed from: ތ  reason: contains not printable characters */
        public static final int f966 = 21;

        /* renamed from: ލ  reason: contains not printable characters */
        public static final int f967 = 22;

        /* renamed from: ގ  reason: contains not printable characters */
        public static final int f968 = 23;

        /* renamed from: ޏ  reason: contains not printable characters */
        public static final int f969 = 24;

        /* renamed from: lu.die.foza.SleepyFox.ຨ$Ԩ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຨ$Ԩ$Ϳ.class */
        public static class C0400 implements AbstractC0397 {

            /* renamed from: ԭ  reason: contains not printable characters */
            public IBinder f970;

            public C0400(IBinder iBinder) {
                this.f970 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f970;
            }

            /* renamed from: ֈ  reason: contains not printable characters */
            public String m2284() {
                return AbstractC0397.f945;
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ԩ */
            public Intent mo1301(Intent intent, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    obtain.writeString(str);
                    this.f970.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) C0401.m2285(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v4, types: [lu.die.foza.SleepyFox.ຘ] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: ԭ */
            public AbstractC0387 mo1302() throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0397.f945);
                    this.f970.transact(2, th, obtain, 0);
                    obtain.readException();
                    obtain = AbstractC0387.AbstractBinderC0389.m2271(obtain.readStrongBinder());
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public int mo1307(Intent intent, ServiceInfo serviceInfo, IBinder iBinder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    C0401.m2286(obtain, serviceInfo, 0);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f970.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: ՠ */
            public void mo1310() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    this.f970.transact(10, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: ԩ */
            public void mo1317(IBinder iBinder) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    obtain.writeStrongBinder(iBinder);
                    this.f970.transact(17, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ԫ */
            public void mo1322() throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    this.f970.transact(22, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ԫ */
            public String mo1319(int i) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0397.f945);
                    th.writeInt(i);
                    this.f970.transact(19, th, obtain, 0);
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
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<android.app.ActivityManager$RunningAppProcessInfo>, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: ԩ */
            public List<ActivityManager.RunningAppProcessInfo> mo1324(int i) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0397.f945);
                    th.writeInt(i);
                    this.f970.transact(24, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: ԩ */
            public void mo1303(String str, String str2) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f970.transact(3, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ԫ */
            public boolean mo1313(String str, String str2, int i) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0397.f945);
                    th.writeString(str);
                    th.writeString(str2);
                    th.writeInt(i);
                    this.f970.transact(13, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain != 0;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: ԩ */
            public void mo1309(Intent intent, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    obtain.writeString(str);
                    this.f970.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public int mo1315(Intent intent, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    obtain.writeString(str);
                    this.f970.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ԫ */
            public void mo1318(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    this.f970.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ԩ */
            public ComponentName mo1305(Intent intent, ServiceInfo serviceInfo, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    C0401.m2286(obtain, serviceInfo, 0);
                    obtain.writeString(str);
                    this.f970.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ComponentName) C0401.m2285(obtain2, ComponentName.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public int mo1304(ProviderInfo providerInfo, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, providerInfo, 0);
                    obtain.writeString(str);
                    this.f970.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public void mo1311(String str, String str2) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f970.transact(11, obtain, obtain2, 0);
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
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public void mo1312(String str, String str2, boolean z) throws RemoteException {
                ?? r0 = z;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    int i = r0 != 0 ? 1 : 0;
                    r0 = obtain;
                    obtain.writeInt(i);
                    this.f970.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    r0.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw r0;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, android.os.Parcel] */
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public void mo1320(long j) throws RemoteException {
                ?? obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    obtain.writeLong(j);
                    this.f970.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    th.recycle();
                    throw obtain;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public void mo1316(IntentFilter intentFilter, IBinder iBinder, String str, AbstractC0382 abstractC0382) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intentFilter, 0);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(abstractC0382);
                    this.f970.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public void mo1323(C0355 c0355, AbstractC0382 abstractC0382) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, c0355, 0);
                    obtain.writeStrongInterface(abstractC0382);
                    this.f970.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public void mo1321(long j, Notification notification, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    obtain.writeLong(j);
                    C0401.m2286(obtain, notification, 0);
                    obtain.writeInt(i);
                    this.f970.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public int mo1306(Intent intent, ServiceInfo serviceInfo, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    C0401.m2286(obtain, serviceInfo, 0);
                    obtain.writeString(str);
                    this.f970.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
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
            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public int mo1308(IBinder iBinder) throws RemoteException {
                th = Parcel.obtain();
                ?? obtain = Parcel.obtain();
                try {
                    th.writeInterfaceToken(AbstractC0397.f945);
                    th.writeStrongBinder(iBinder);
                    this.f970.transact(8, th, obtain, 0);
                    obtain.readException();
                    obtain = obtain.readInt();
                    return obtain;
                } finally {
                    obtain.recycle();
                    th.recycle();
                }
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0397
            /* renamed from: Ϳ */
            public Intent mo1314(Intent intent, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC0397.f945);
                    C0401.m2286(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.f970.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) C0401.m2285(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0399() {
            attachInterface(this, AbstractC0397.f945);
        }

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static AbstractC0397 m2283(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(AbstractC0397.f945);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC0397)) ? new C0400(iBinder) : (AbstractC0397) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Intent mo1301;
            int i3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AbstractC0397.f945);
            }
            if (i == 1598968902) {
                parcel2.writeString(AbstractC0397.f945);
                return true;
            }
            switch (i) {
                case 1:
                    mo1301 = mo1301((Intent) C0401.m2285(parcel, Intent.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    i3 = 1;
                    C0401.m2286(parcel2, mo1301, i3);
                    return true;
                case 2:
                    AbstractC0387 mo1302 = mo1302();
                    parcel2.writeNoException();
                    parcel2.writeStrongInterface(mo1302);
                    return true;
                case 3:
                    mo1303(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int mo1304 = mo1304((ProviderInfo) C0401.m2285(parcel, ProviderInfo.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1304);
                    return true;
                case 5:
                    ComponentName mo1305 = mo1305((Intent) C0401.m2285(parcel, Intent.CREATOR), (ServiceInfo) C0401.m2285(parcel, ServiceInfo.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    C0401.m2286(parcel2, mo1305, 1);
                    return true;
                case 6:
                    int mo1306 = mo1306((Intent) C0401.m2285(parcel, Intent.CREATOR), (ServiceInfo) C0401.m2285(parcel, ServiceInfo.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1306);
                    return true;
                case 7:
                    int mo1307 = mo1307((Intent) C0401.m2285(parcel, Intent.CREATOR), (ServiceInfo) C0401.m2285(parcel, ServiceInfo.CREATOR), parcel.readStrongBinder(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1307);
                    return true;
                case 8:
                    int mo1308 = mo1308(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1308);
                    return true;
                case 9:
                    mo1309((Intent) C0401.m2285(parcel, Intent.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    mo1310();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    mo1311(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    mo1312(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean mo1313 = mo1313(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1313 ? 1 : 0);
                    return true;
                case 14:
                    mo1301 = mo1314((Intent) C0401.m2285(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    i3 = 1;
                    C0401.m2286(parcel2, mo1301, i3);
                    return true;
                case 15:
                    int mo1315 = mo1315((Intent) C0401.m2285(parcel, Intent.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo1315);
                    return true;
                case 16:
                    mo1316((IntentFilter) C0401.m2285(parcel, IntentFilter.CREATOR), parcel.readStrongBinder(), parcel.readString(), AbstractC0382.AbstractBinderC0384.m2265(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    mo1317(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    mo1318((Intent) C0401.m2285(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    String mo1319 = mo1319(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(mo1319);
                    return true;
                case 20:
                    mo1320(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    mo1321(parcel.readLong(), (Notification) C0401.m2285(parcel, Notification.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    mo1322();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    mo1323((C0355) C0401.m2285(parcel, C0355.CREATOR), AbstractC0382.AbstractBinderC0384.m2265(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    List<ActivityManager.RunningAppProcessInfo> mo1324 = mo1324(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo1324);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຨ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຨ$Ԫ.class */
    public static class C0401 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T> T m2285(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static <T extends Parcelable> void m2286(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    /* renamed from: Ԩ */
    Intent mo1301(Intent intent, String str) throws RemoteException;

    /* renamed from: ԭ */
    AbstractC0387 mo1302() throws RemoteException;

    /* renamed from: ԩ */
    void mo1303(String str, String str2) throws RemoteException;

    /* renamed from: Ϳ */
    int mo1304(ProviderInfo providerInfo, String str) throws RemoteException;

    /* renamed from: Ԩ */
    ComponentName mo1305(Intent intent, ServiceInfo serviceInfo, String str) throws RemoteException;

    /* renamed from: Ϳ */
    int mo1306(Intent intent, ServiceInfo serviceInfo, String str) throws RemoteException;

    /* renamed from: Ϳ */
    int mo1307(Intent intent, ServiceInfo serviceInfo, IBinder iBinder, String str) throws RemoteException;

    /* renamed from: Ϳ */
    int mo1308(IBinder iBinder) throws RemoteException;

    /* renamed from: ԩ */
    void mo1309(Intent intent, String str) throws RemoteException;

    /* renamed from: ՠ */
    void mo1310() throws RemoteException;

    /* renamed from: Ϳ */
    void mo1311(String str, String str2) throws RemoteException;

    /* renamed from: Ϳ */
    void mo1312(String str, String str2, boolean z) throws RemoteException;

    /* renamed from: Ԫ */
    boolean mo1313(String str, String str2, int i) throws RemoteException;

    /* renamed from: Ϳ */
    Intent mo1314(Intent intent, int i) throws RemoteException;

    /* renamed from: Ϳ */
    int mo1315(Intent intent, String str) throws RemoteException;

    /* renamed from: Ϳ */
    void mo1316(IntentFilter intentFilter, IBinder iBinder, String str, AbstractC0382 abstractC0382) throws RemoteException;

    /* renamed from: ԩ */
    void mo1317(IBinder iBinder) throws RemoteException;

    /* renamed from: Ԫ */
    void mo1318(Intent intent) throws RemoteException;

    /* renamed from: Ԫ */
    String mo1319(int i) throws RemoteException;

    /* renamed from: Ϳ */
    void mo1320(long j) throws RemoteException;

    /* renamed from: Ϳ */
    void mo1321(long j, Notification notification, int i) throws RemoteException;

    /* renamed from: Ԫ */
    void mo1322() throws RemoteException;

    /* renamed from: Ϳ */
    void mo1323(C0355 c0355, AbstractC0382 abstractC0382) throws RemoteException;

    /* renamed from: ԩ */
    List<ActivityManager.RunningAppProcessInfo> mo1324(int i) throws RemoteException;
}
