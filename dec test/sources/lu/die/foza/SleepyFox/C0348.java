package lu.die.foza.SleepyFox;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ഄ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ഄ.class */
public final class C0348 extends C0277 {
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final C0349 f823 = new C0349();
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final C0348 f824 = new C0348();
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final C0164<String> f825;

    /* renamed from: lu.die.foza.SleepyFox.ഄ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ഄ$Ϳ.class */
    public static final class C0349 {
        public C0349() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0348 m2143() {
            return C0348.f824;
        }

        public /* synthetic */ C0349(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0348() {
        C0164 c0164;
        try {
            String[] strArr = new String[9];
            strArr[0] = "android.permission.ACCOUNT_MANAGER";
            strArr[1] = "android.permission.INTERACT_ACROSS_USERS";
            strArr[2] = "android.permission.INTERACT_ACROSS_USERS_FULL";
            strArr[3] = "android.permission.BACKUP";
            strArr[4] = "android.permission.GET_APP_OPS_STATS";
            strArr[5] = "android.permission.READ_DEVICE_CONFIG";
            strArr[6] = "android.permission.SEND_SMS";
            strArr[7] = "android.permission.READ_SMS";
            strArr[8] = "android.permission.RECEIVE_SMS";
            ArrayList arrayListOf = CollectionsKt.arrayListOf(strArr);
            if (C0175.f261) {
                String[] strArr2 = new String[4];
                strArr2[0] = "android.permission.READ_EXTERNAL_STORAGE";
                strArr2[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
                strArr2[2] = "android.permission.READ_CONTACTS";
                strArr2[3] = "android.permission.WRITE_CONTACTS";
                CollectionsKt.addAll(arrayListOf, strArr2);
            }
            if (C0175.f271) {
                arrayListOf.add("android.permission.READ_PHONE_STATE");
            }
            if (C0175.f272) {
                arrayListOf.add("android.permission.BLUETOOTH");
            }
            if (C0175.f273) {
                String[] strArr3 = new String[3];
                strArr3[0] = "android.permission.READ_MEDIA_AUDIO";
                strArr3[1] = "android.permission.READ_MEDIA_VIDEO";
                strArr3[2] = "android.permission.READ_MEDIA_IMAGES";
                CollectionsKt.addAll(arrayListOf, strArr3);
            }
            c0164 = new C0164(arrayListOf.size());
            c0164.addAll(arrayListOf);
        } catch (Exception unused) {
            c0164 = r0;
            C0164 c01642 = new C0164(0);
        }
        this.f825 = c0164;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2141(@NotNull C0033 c0033) {
        c0033.m374("checkPermission", this);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m2142(String str) {
        return StringsKt.startsWith$default(str, "com.google.android.", false, 2, (Object) null) || this.f825.contains(str);
    }

    @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        try {
            String str = (String) C0153.f201.m726(c0253.f519, String.class);
            if (str != null) {
                if (m2142(str)) {
                    return 0;
                }
                String m1713 = C0276.f576.m1713();
                if (m1713 != null && StringsKt.startsWith$default(str, m1713, false, 2, (Object) null)) {
                    return 0;
                }
            }
            return super.mo85(c0253);
        } catch (Exception unused) {
            return -1;
        }
    }
}
