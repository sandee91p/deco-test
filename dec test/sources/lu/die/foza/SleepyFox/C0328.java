package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import com.android.internal.content.ReferrerIntent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࣀ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣀ.class */
public final class C0328 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0328 f775 = new C0328();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0343<List<ReferrerIntent>> f776 = new C0343<>("mIntents");
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0343<Intent> f777;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0343<String> f778;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final C0343<ActivityInfo> f779;

    static {
        boolean z = C0175.f264;
        f777 = new C0343<>(z ? "mIntent" : "intent");
        f778 = new C0343<>(z ? "mReferrer" : "referrer");
        f779 = new C0343<>(z ? "mInfo" : "activityInfo");
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m2023(@NotNull Object obj, @NotNull IBinder iBinder) {
        try {
            C0343<List<ReferrerIntent>> c0343 = f776;
            List<ReferrerIntent> m2103 = c0343.m2103(obj);
            if (m2103 == null) {
                return false;
            }
            c0343.m2104(obj, m2022((List<? extends ReferrerIntent>) m2103, iBinder));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2024(@NotNull Object obj, @NotNull IBinder iBinder) {
        C0343<Intent> c0343 = f777;
        Intent m2103 = c0343.m2103(obj);
        if (m2103 == null) {
            return false;
        }
        Pair<Intent, String> m2021 = m2021(m2103, iBinder);
        if (m2021 == null) {
            m2103.toString();
            return true;
        }
        Intent intent = (Intent) m2021.getFirst();
        C0343<ActivityInfo> c03432 = f779;
        ActivityInfo m1201 = C0216.f314.m1201(intent);
        ActivityInfo activityInfo = m1201;
        if (m1201 == null) {
            if (!C0276.f576.m1708()) {
                return false;
            }
            C0448 c0448 = C0448.f1055;
            C0245.f512.getClass();
            activityInfo = (ActivityInfo) c0448.m2365((C0448) C0245.f513.m1425(intent));
        }
        c03432.m2104(obj, activityInfo);
        if (C0175.f259) {
            f778.m2104(obj, m2021.getSecond());
        }
        c0343.m2104(obj, intent);
        return true;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Pair<Intent, String> m2021(@NotNull Intent intent, @NotNull IBinder iBinder) {
        Intent m2316 = C0417.m2316(intent);
        if (m2316 == null) {
            return null;
        }
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(C0281.C0282.f613);
        if (componentName != null) {
            C0213.f309.m1190(iBinder, componentName);
        }
        String stringExtra = intent.getStringExtra(C0281.C0282.f612);
        C0213.f309.getClass();
        C0213.f310 = stringExtra;
        return new Pair<>(m2316, stringExtra);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<ReferrerIntent> m2022(@NotNull List<? extends ReferrerIntent> list, @NotNull IBinder iBinder) {
        ArrayList arrayList = new ArrayList();
        try {
            for (ReferrerIntent referrerIntent : list) {
                Pair<Intent, String> m2021 = m2021((Intent) referrerIntent, iBinder);
                if (m2021 == null) {
                    arrayList.add(referrerIntent);
                } else {
                    String str = (String) m2021.getSecond();
                    String str2 = str;
                    if (str == null) {
                        str2 = referrerIntent.mReferrer;
                    }
                    arrayList.add(new ReferrerIntent((Intent) m2021.getFirst(), str2));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
