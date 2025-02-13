package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.ActivityThread;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.FoxDev.ThirdParty.C0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SuppressLint({"StaticFieldLeak"})
/* renamed from: lu.die.foza.SleepyFox.ࢴ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢴ.class */
public final class C0310 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0310 f729 = new C0310();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean f730;
    @Nullable

    /* renamed from: ԩ  reason: contains not printable characters */
    public static Context f731;

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Context m1850() {
        Context context = f731;
        ContextWrapper contextWrapper = context;
        if (context == null) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    C0000 c0000 = C0000.f2;
                    String[] strArr = new String[1];
                    strArr[0] = "L";
                    c0000.m14(strArr);
                }
                contextWrapper = ActivityThread.currentApplication().getBaseContext();
                if (i < 28) {
                    C0280.f589.m1737(contextWrapper);
                }
                f730 = true;
                C0505.m2470(contextWrapper);
            } catch (Exception unused) {
                contextWrapper = r0;
                ContextWrapper contextWrapper2 = new ContextWrapper(null);
            }
        }
        return contextWrapper;
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m1848(@Nullable Context context) {
        try {
            Intrinsics.checkNotNull(context);
            f731 = context;
            if (f730) {
                return;
            }
            f730 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                C0000 c0000 = C0000.f2;
                String[] strArr = new String[1];
                strArr[0] = "L";
                c0000.m14(strArr);
            } else {
                C0280.f589.m1737(context);
            }
            C0505.m2470(context);
        } catch (Throwable unused) {
        }
    }
}
