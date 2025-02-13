package lu.die.foza.SleepyFox;

import android.content.pm.UserInfo;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import lu.die.foza.SleepyFox.C0202;
/* renamed from: lu.die.foza.SleepyFox.ʶ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʶ.class */
public final class C0022 extends AbstractC0066 {
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("user");
            if (m643 == null) {
                return;
            }
            C0202.C0203 c0203 = C0202.f299;
            c0203.getClass();
            m643.m374("getUserName", new C0167("Fox"));
            UserInfo m263 = m263();
            ArrayList arrayListOf = CollectionsKt.arrayListOf(new UserInfo[]{m263});
            c0203.getClass();
            m643.m374("getUsers", new C0167(arrayListOf));
            c0203.getClass();
            C0167 c0167 = new C0167(m263);
            String[] strArr = new String[2];
            strArr[0] = "getProfileParent";
            strArr[1] = "getUserInfo";
            m643.m377(c0167, strArr);
            c0203.getClass();
            m643.m374("getMainUserId", new C0167(0));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final UserInfo m263() {
        UserInfo userInfo;
        if (C0175.f270) {
            userInfo = r0;
            UserInfo userInfo2 = new UserInfo(0, "Fox", (String) null, 3, "android.os.usertype.profile.MANAGED");
        } else {
            userInfo = r0;
            UserInfo userInfo3 = new UserInfo(0, "Fox", (String) null, 3);
        }
        return userInfo;
    }
}
