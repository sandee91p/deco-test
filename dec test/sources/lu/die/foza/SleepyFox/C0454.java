package lu.die.foza.SleepyFox;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lu.die.foza.SleepyFox.ၯ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၯ.class */
public final class C0454 extends AbstractC0066 {

    /* renamed from: lu.die.foza.SleepyFox.ၯ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၯ$Ϳ.class */
    public static final class C0455 extends C0301 {

        /* renamed from: lu.die.foza.SleepyFox.ၯ$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၯ$Ϳ$Ϳ.class */
        public static final class C0456 extends C0202 {

            /* renamed from: Ԫ  reason: contains not printable characters */
            public final /* synthetic */ C0454 f1064;

            public C0456(C0454 c0454) {
                this.f1064 = c0454;
            }

            @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
            /* renamed from: Ϳ */
            public Object mo85(C0253 c0253) {
                C0454 c0454 = this.f1064;
                Object m1485 = c0253.m1485();
                if (m1485 == null) {
                    return null;
                }
                return c0454.m2383(m1485);
            }
        }

        public C0455() {
        }

        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Object mo85 = super.mo85(c0253);
            try {
                C0033 m2098 = C0342.f813.m2098(mo85);
                if (m2098 == null) {
                    return mo85;
                }
                m2098.m374("getController", new C0456(C0454.this));
                return m2098.f100;
            } catch (Exception unused) {
                return mo85;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ၯ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၯ$Ԩ.class */
    public static final class C0457 implements Parcelable.Creator<Object> {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ Parcelable.Creator<?> f1065;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final /* synthetic */ Field f1066;

        /* renamed from: ԩ  reason: contains not printable characters */
        public final /* synthetic */ C0454 f1067;

        public C0457(Parcelable.Creator<?> creator, Field field, C0454 c0454) {
            this.f1065 = creator;
            this.f1066 = field;
            this.f1067 = c0454;
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            Object createFromParcel = this.f1065.createFromParcel(parcel);
            Object obj = createFromParcel;
            if (createFromParcel != null) {
                Field field = this.f1066;
                C0454 c0454 = this.f1067;
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        field.set(obj, c0454.m2383(obj2));
                    }
                } catch (Exception unused) {
                }
            } else {
                obj = null;
            }
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return this.f1065.newArray(i);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("media_session");
            if (m643 == null) {
                return;
            }
            m643.m374("createSession", new C0455());
            Class<?> cls = Class.forName(MediaSession.class.getName().concat("$Token"));
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mBinder");
            declaredField2.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj);
            declaredField.set(null, new C0457((Parcelable.Creator) obj, declaredField2, this));
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2383(Object obj) {
        C0342 c0342 = C0342.f813;
        C0301.f718.getClass();
        Object m2096 = c0342.m2096(obj, C0301.f719);
        if (m2096 != null) {
            obj = m2096;
        }
        return obj;
    }
}
