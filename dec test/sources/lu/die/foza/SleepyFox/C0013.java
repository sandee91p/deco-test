package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import com.android.internal.infra.AndroidFuture;
import lu.die.foza.SleepyFox.C0202;
/* renamed from: lu.die.foza.SleepyFox.ʳ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʳ.class */
public final class C0013 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ʳ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʳ$Ϳ.class */
    public static final class C0014 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public Object f52;

        public C0014() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        @RequiresApi(26)
        @SuppressLint({"PrivateApi"})
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                if (!AndroidFuture.class.isAssignableFrom(c0253.f518.getReturnType())) {
                    C0301.f718.getClass();
                    return C0301.f719.mo85(c0253);
                }
                Object obj = this.f52;
                Object obj2 = obj;
                if (obj == null) {
                    Object m88 = C0013.this.m88((Object) null);
                    obj2 = m88;
                    this.f52 = m88;
                }
                return obj2;
            } catch (Exception unused) {
                C0202.f299.getClass();
                return C0202.f301.mo85(c0253);
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ʳ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʳ$Ԩ.class */
    public static final class C0015 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object m726 = C0153.f201.m726(c0253.f519, AndroidFuture.class);
                AndroidFuture androidFuture = m726 instanceof AndroidFuture ? (AndroidFuture) m726 : null;
                if (androidFuture == null) {
                    return null;
                }
                androidFuture.complete("true");
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ʳ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʳ$Ԫ.class */
    public static final class C0016 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object m726 = C0153.f201.m726(c0253.f519, AndroidFuture.class);
                AndroidFuture androidFuture = m726 instanceof AndroidFuture ? (AndroidFuture) m726 : null;
                if (androidFuture == null) {
                    return null;
                }
                AndroidFuture androidFuture2 = androidFuture;
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.addCategory("android.intent.category.DEFAULT");
                androidFuture2.complete(intent);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ʳ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʳ$Ԭ.class */
    public static final class C0017 implements AbstractC0412 {
        public C0017() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0013 c0013 = C0013.this;
            C0495.f1089.getClass();
            return c0013.m88(C0495.f1091);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ʳ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʳ$Ԯ.class */
    public static final class C0018 implements AbstractC0412 {
        public C0018() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            return C0013.this.m88(Boolean.FALSE);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    @RequiresApi(25)
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            boolean z = C0175.f272;
            if (z && !C0175.f273) {
                this.f168 = new C0014();
            } else {
                C0301.f718.getClass();
                this.f168 = C0301.f719;
            }
            C0033 m643 = m643("shortcut");
            if (m643 == null) {
                return;
            }
            if (!C0175.f273) {
                if (!z) {
                    return;
                }
                C0017 c0017 = new C0017();
                String[] strArr = new String[2];
                strArr[0] = "getShareTargets";
                strArr[1] = "getShortcuts";
                m643.m377(c0017, strArr);
                C0018 c0018 = new C0018();
                String[] strArr2 = new String[4];
                strArr2[0] = "setDynamicShortcuts";
                strArr2[1] = "addDynamicShortcuts";
                strArr2[2] = "updateShortcuts";
                strArr2[3] = "requestPinShortcut";
                m643.m377(c0018, strArr2);
                return;
            }
            m643.m374("requestPinShortcut", new C0015());
            m643.m374("createShortcutResultIntent", new C0016());
            C0202.C0203 c0203 = C0202.f299;
            Boolean bool = Boolean.FALSE;
            c0203.getClass();
            C0167 c0167 = new C0167(bool);
            String[] strArr3 = new String[3];
            strArr3[0] = "setDynamicShortcuts";
            strArr3[1] = "addDynamicShortcuts";
            strArr3[2] = "updateShortcuts";
            m643.m377(c0167, strArr3);
            C0495.f1089.getClass();
            Object obj = C0495.f1091;
            c0203.getClass();
            C0167 c01672 = new C0167(obj);
            String[] strArr4 = new String[2];
            strArr4[0] = "getShareTargets";
            strArr4[1] = "getShortcuts";
            m643.m377(c01672, strArr4);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m88(Object obj) {
        try {
            return AndroidFuture.completedFuture(obj);
        } catch (Throwable unused) {
            try {
                C0354.f837.m2166();
                try {
                    return AndroidFuture.completedFuture(obj);
                } catch (Throwable unused2) {
                    return null;
                }
            } catch (Exception unused3) {
                return null;
            }
        }
    }
}
