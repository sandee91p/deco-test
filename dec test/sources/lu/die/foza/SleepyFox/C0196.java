package lu.die.foza.SleepyFox;

import android.content.ContentResolver;
import android.database.IContentObserver;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ޚ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޚ.class */
public final class C0196 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ޚ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޚ$Ϳ.class */
    public static final class C0197 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                if (C0175.f262) {
                    objArr[4] = 22;
                }
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                Object obj3 = objArr[2];
                if ((obj instanceof Uri) && (obj2 instanceof Boolean) && (obj3 instanceof IContentObserver)) {
                    C0214.f312.m1195((Uri) obj, ((Boolean) obj2).booleanValue(), (IContentObserver) obj3);
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ޚ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޚ$Ԩ.class */
    public static final class C0198 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object obj = c0253.f519[0];
                if (obj instanceof IContentObserver) {
                    C0214.f312.m1196((IContentObserver) obj);
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ޚ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޚ$Ԫ.class */
    public static final class C0199 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Uri[] uriArr;
            try {
                Object[] objArr = c0253.f519;
                if (objArr.length >= 6) {
                    objArr[5] = 22;
                }
                if (C0175.f270) {
                    Object obj = objArr[0];
                    uriArr = obj instanceof Uri[] ? (Uri[]) obj : null;
                } else {
                    uriArr = new Uri[1];
                    Object obj2 = objArr[0];
                    uriArr[0] = obj2 instanceof Uri ? (Uri) obj2 : null;
                }
                Object obj3 = objArr[1];
                IContentObserver iContentObserver = obj3 instanceof IContentObserver ? (IContentObserver) obj3 : null;
                IContentObserver iContentObserver2 = iContentObserver;
                Object obj4 = objArr[2];
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                if (iContentObserver2 != null && uriArr != null) {
                    C0214.f312.m1197(uriArr, iContentObserver, booleanValue);
                }
            } catch (Exception unused) {
            }
            C0301.f718.getClass();
            return C0301.f719.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("content");
            if (m643 == null) {
                return;
            }
            C0047.f129.m469(ContentResolver.class.getName(), "sContentService", m643.f100);
            m643.m374("registerContentObserver", new C0197());
            m643.m374("unregisterContentObserver", new C0198());
            m643.m374("notifyChange", new C0199());
        } catch (Exception unused) {
        }
    }
}
