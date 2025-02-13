package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0202;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.Ԫ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ.class */
public final class C0072 extends AbstractC0066 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0109 f175 = new C0109();
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final C0108 f176 = new C0108();

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$Ϳ.class */
    public static abstract class AbstractC0073 extends C0202 {
        @Nullable
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Object m661(@NotNull C0253 c0253) {
            try {
                return C0153.f201.m726(c0253.f519, IAccountManagerResponse.class);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        @Nullable
        /* renamed from: Ϳ */
        public Object mo85(@NotNull C0253 c0253) {
            return null;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$Ԩ.class */
    public static final class C0074 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m662(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IAccountManagerResponse ? (IAccountManagerResponse) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object[] objArr = c0253.f519;
            Object obj2 = objArr[1];
            Account account = obj2 instanceof Account ? (Account) obj2 : null;
            Object obj3 = objArr[2];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            m656.mo1369(asBinder, account, ((Boolean) obj3).booleanValue(), 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m662(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$Ԫ.class */
    public static final class C0075 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Boolean mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            return Boolean.valueOf(m656.mo1370(obj instanceof Account ? (Account) obj : null, 0));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$Ԭ.class */
    public static final class C0076 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m664(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IAccountManagerResponse ? (IAccountManagerResponse) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object[] objArr = c0253.f519;
            Object obj2 = objArr[1];
            Account account = obj2 instanceof Account ? (Account) obj2 : null;
            Object obj3 = objArr[2];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            Object obj4 = c0253.f519[3];
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            m656.mo1371(asBinder, account, intValue, ((Integer) obj4).intValue());
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m664(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$Ԯ.class */
    public static final class C0077 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m665(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            String obj2 = obj != null ? obj.toString() : null;
            Object obj3 = c0253.f519[1];
            m656.mo1372(obj2, obj3 != null ? obj3.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m665(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ՠ.class */
    public static final class C0078 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public String mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            return m656.mo1373(account, obj2 != null ? obj2.toString() : null, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ֈ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ֈ.class */
    public static final class C0079 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m667(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            m656.mo1374(account, obj3, obj4 != null ? obj4.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m667(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$֏  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$֏.class */
    public static final class C0080 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m668(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            m656.mo1375(account, obj2 != null ? obj2.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m668(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ׯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ׯ.class */
    public static final class C0081 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m669(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            m656.mo1376(obj instanceof Account ? (Account) obj : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m669(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ؠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ؠ.class */
    public static final class C0082 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m670(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            m656.mo1377(account, obj3, obj4 != null ? obj4.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m670(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ހ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ހ.class */
    public static final class C0083 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m671(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj4).intValue();
            Object obj5 = c0253.f519[3];
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            m656.mo1378(account, obj3, intValue, ((Boolean) obj5).booleanValue());
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m671(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ށ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ށ.class */
    public static final class C0084 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            return C0207.f302.m656().mo1360((Account) c0253.f519[0], 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ނ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ނ.class */
    public static final class C0085 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m672(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object[] objArr = c0253.f519;
            Object obj2 = objArr[1];
            Account account = obj2 instanceof Account ? (Account) obj2 : null;
            Object obj3 = objArr[2];
            String obj4 = obj3 != null ? obj3.toString() : null;
            Object obj5 = c0253.f519[3];
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            Object obj6 = c0253.f519[4];
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
            Object obj7 = c0253.f519[5];
            m656.mo1379(asBinder, account, obj4, booleanValue, booleanValue2, obj7 instanceof Bundle ? (Bundle) obj7 : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m672(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ރ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ރ.class */
    public static final class C0086 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m673(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object obj2 = c0253.f519[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            String obj5 = obj4 != null ? obj4.toString() : null;
            Object[] objArr = c0253.f519;
            Object obj6 = objArr[3];
            String[] strArr = obj6 instanceof String[] ? (String[]) obj6 : null;
            Object obj7 = objArr[4];
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj7).booleanValue();
            Object obj8 = c0253.f519[5];
            m656.mo1380(asBinder, obj3, obj5, strArr, booleanValue, obj8 instanceof Bundle ? (Bundle) obj8 : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m673(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ބ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ބ.class */
    public static final class C0087 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m674(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object obj2 = c0253.f519[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            String obj5 = obj4 != null ? obj4.toString() : null;
            Object[] objArr = c0253.f519;
            Object obj6 = objArr[3];
            String[] strArr = obj6 instanceof String[] ? (String[]) obj6 : null;
            Object obj7 = objArr[4];
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj7).booleanValue();
            Object obj8 = c0253.f519[5];
            m656.mo1381(asBinder, obj3, obj5, strArr, booleanValue, obj8 instanceof Bundle ? (Bundle) obj8 : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m674(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޅ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޅ.class */
    public static final class C0088 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m675(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object[] objArr = c0253.f519;
            Object obj2 = objArr[1];
            Account account = obj2 instanceof Account ? (Account) obj2 : null;
            Object obj3 = objArr[2];
            String obj4 = obj3 != null ? obj3.toString() : null;
            Object obj5 = c0253.f519[3];
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            Object obj6 = c0253.f519[4];
            m656.mo1382(asBinder, account, obj4, booleanValue, obj6 instanceof Bundle ? (Bundle) obj6 : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m675(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ކ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ކ.class */
    public static final class C0089 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m676(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object obj2 = c0253.f519[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            m656.mo1383(asBinder, obj3, ((Boolean) obj4).booleanValue(), 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m676(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$އ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$އ.class */
    public static final class C0090 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m677(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object[] objArr = c0253.f519;
            Object obj2 = objArr[1];
            Account account = obj2 instanceof Account ? (Account) obj2 : null;
            Object obj3 = objArr[2];
            Bundle bundle = obj3 instanceof Bundle ? (Bundle) obj3 : null;
            Object obj4 = objArr[3];
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            m656.mo1384(asBinder, account, bundle, ((Boolean) obj4).booleanValue(), 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m677(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ވ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ވ.class */
    public static final class C0091 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Boolean mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            return Boolean.valueOf(m656.mo1385(obj instanceof Account ? (Account) obj : null, 0));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$މ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$މ.class */
    public static final class C0092 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m679(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object obj2 = c0253.f519[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            m656.mo1386(asBinder, obj3, obj4 != null ? obj4.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m679(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ފ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ފ.class */
    public static final class C0093 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Map mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            return m656.mo1403(obj instanceof Account ? (Account) obj : null, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ދ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ދ.class */
    public static final class C0094 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Boolean mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object[] objArr2 = c0253.f519;
            Object obj4 = objArr2[2];
            Bundle bundle = obj4 instanceof Bundle ? (Bundle) obj4 : null;
            Object obj5 = objArr2[3];
            return Boolean.valueOf(m656.mo1393(account, obj3, bundle, obj5 instanceof Map ? (Map) obj5 : null, 0));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ތ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ތ.class */
    public static final class C0095 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Account account = (Account) objArr[0];
            Object obj = objArr[1];
            return m656.mo1361(account, obj != null ? obj.toString() : null, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ލ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ލ.class */
    public static final class C0096 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Boolean mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            return Boolean.valueOf(m656.mo1394(account, obj3, ((Integer) obj4).intValue(), 0));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ގ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ގ.class */
    public static final class C0097 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Integer mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            return Integer.valueOf(m656.mo1395(account, obj2 != null ? obj2.toString() : null, 0));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޏ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޏ.class */
    public static final class C0098 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Map mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            String obj2 = obj != null ? obj.toString() : null;
            Object obj3 = c0253.f519[1];
            return m656.mo1396(obj2, obj3 != null ? obj3.toString() : null, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ސ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ސ.class */
    public static final class C0099 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m685(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            String[] strArr = obj instanceof String[] ? (String[]) obj : null;
            Object obj2 = objArr[1];
            m656.mo1397(strArr, obj2 != null ? obj2.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m685(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޑ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޑ.class */
    public static final class C0100 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m686(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            String[] strArr = obj instanceof String[] ? (String[]) obj : null;
            Object obj2 = objArr[1];
            m656.mo1398(strArr, obj2 != null ? obj2.toString() : null, 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m686(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޒ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޒ.class */
    public static final class C0101 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            return C0207.f302.m656().mo1362(0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޓ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޓ.class */
    public static final class C0102 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            return m656.mo1363(obj != null ? obj.toString() : null, 114514, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޔ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޔ.class */
    public static final class C0103 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            String obj2 = obj != null ? obj.toString() : null;
            Object obj3 = c0253.f519[1];
            return m656.mo1364(obj2, obj3 != null ? obj3.toString() : null, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޕ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޕ.class */
    public static final class C0104 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m687(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IAccountManagerResponse ? (IAccountManagerResponse) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object obj2 = c0253.f519[1];
            m656.mo1366(asBinder, obj2 != null ? obj2.toString() : null, (String[]) c0253.f519[2], 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m687(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޖ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޖ.class */
    public static final class C0105 implements AbstractC0412 {
        /* renamed from: Ԩ  reason: contains not printable characters */
        public void m688(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            IInterface iInterface = obj instanceof IAccountManagerResponse ? (IAccountManagerResponse) obj : null;
            IBinder asBinder = iInterface != null ? iInterface.asBinder() : null;
            Object obj2 = c0253.f519[1];
            m656.mo1367(asBinder, obj2 != null ? obj2.toString() : null, (String[]) c0253.f519[2], 0);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public /* bridge */ /* synthetic */ Object mo85(C0253 c0253) {
            m688(c0253);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޗ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޗ.class */
    public static final class C0106 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Account[] mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object obj = c0253.f519[0];
            return m656.mo1365(obj != null ? obj.toString() : null, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޘ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޘ.class */
    public static final class C0107 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ԩ  reason: contains not printable characters */
        public Boolean mo85(C0253 c0253) {
            AbstractC0392 m656 = C0207.f302.m656();
            Object[] objArr = c0253.f519;
            Object obj = objArr[0];
            Account account = obj instanceof Account ? (Account) obj : null;
            Object obj2 = objArr[1];
            String obj3 = obj2 != null ? obj2.toString() : null;
            Object obj4 = c0253.f519[2];
            return Boolean.valueOf(m656.mo1368(account, obj3, obj4 instanceof Bundle ? (Bundle) obj4 : null, 0));
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޙ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޙ.class */
    public static final class C0108 extends AbstractC0073 {
        @Override // lu.die.foza.SleepyFox.C0072.AbstractC0073, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object m661 = m661(c0253);
                if (!(m661 instanceof IAccountManagerResponse)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("authAccount", "62v.net");
                bundle.putString("accountType", C0276.f576.m1713());
                bundle.putString("accountAccessId", "62v.net");
                ((IAccountManagerResponse) m661).onResult(bundle);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԫ$ޚ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԫ$ޚ.class */
    public static final class C0109 extends AbstractC0073 {
        @Override // lu.die.foza.SleepyFox.C0072.AbstractC0073, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object m661 = m661(c0253);
                if (!(m661 instanceof IAccountManagerResponse)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("booleanResult", true);
                ((IAccountManagerResponse) m661).onResult(bundle);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("account");
            if (m643 == null) {
                return;
            }
            m643.m374("getPassword", new C0084());
            m643.m374("getUserData", new C0095());
            m643.m374("getAuthenticatorTypes", new C0101());
            m643.m374("getAccountsForPackage", new C0102());
            m643.m374("getAccountsByTypeForPackage", new C0103());
            m643.m374("getAccountByTypeAndFeatures", new C0104());
            m643.m374("getAccountsByFeatures", new C0105());
            m643.m374("getAccountsAsUser", new C0106());
            m643.m374("addAccountExplicitly", new C0107());
            m643.m374("removeAccountAsUser", new C0074());
            m643.m374("removeAccountExplicitly", new C0075());
            m643.m374("copyAccountToUser", new C0076());
            m643.m374("invalidateAuthToken", new C0077());
            m643.m374("peekAuthToken", new C0078());
            m643.m374("setAuthToken", new C0079());
            m643.m374("setPassword", new C0080());
            m643.m374("clearPassword", new C0081());
            m643.m374("setUserData", new C0082());
            m643.m374("updateAppPermission", new C0083());
            m643.m374("getAuthToken", new C0085());
            m643.m374("addAccount", new C0086());
            m643.m374("addAccountAsUser", new C0087());
            m643.m374("updateCredentials", new C0088());
            m643.m374("editProperties", new C0089());
            m643.m374("confirmCredentialsAsUser", new C0090());
            m643.m374("accountAuthenticated", new C0091());
            m643.m374("getAuthTokenLabel", new C0092());
            m643.m374("getPackagesAndVisibilityForAccount", new C0093());
            m643.m374("addAccountExplicitlyWithVisibility", new C0094());
            m643.m374("setAccountVisibility", new C0096());
            m643.m374("getAccountVisibility", new C0097());
            m643.m374("getAccountsAndVisibilityForPackage", new C0098());
            m643.m374("registerAccountListener", new C0099());
            m643.m374("unregisterAccountListener", new C0100());
            C0202.C0203 c0203 = C0202.f299;
            Boolean bool = Boolean.TRUE;
            c0203.getClass();
            C0167 c0167 = new C0167(bool);
            String[] strArr = new String[2];
            strArr[0] = "someUserHasAccount";
            strArr[1] = "hasAccountAccess";
            m643.m377(c0167, strArr);
            c0203.getClass();
            AbstractC0412 abstractC0412 = C0202.f301;
            String[] strArr2 = new String[2];
            strArr2[0] = "addSharedAccountsFromParentUser";
            strArr2[1] = "hasAccountAccess";
            m643.m377(abstractC0412, strArr2);
            c0203.getClass();
            m643.m374("getPreviousName", new C0167("62v.net"));
            m643.m374("hasFeatures", this.f175);
            m643.m374("renameAccount", this.f176);
        } catch (Exception unused) {
        }
    }
}
