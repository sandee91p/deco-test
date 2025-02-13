package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.android.internal.content.ReferrerIntent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ຉ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຉ.class */
public final class C0369 implements Handler.Callback {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final int f865 = 12580;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final int f866 = 100;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final int f867 = 112;

    /* renamed from: ԫ  reason: contains not printable characters */
    public static boolean f868;
    @Nullable

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static Handler.Callback f869;

    /* renamed from: ԭ  reason: contains not printable characters */
    public static int f870;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0369 f864 = new C0369();
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final C0343<List<Intent>> f871 = new C0343<>("intents");
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final C0343<IBinder> f872 = new C0343<>("token");
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final C0343<IBinder> f873 = new C0343<>("token");

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2203(@NotNull Handler.Callback callback) {
        try {
            Message message = new Message();
            message.what = 12580;
            message.obj = this;
            callback.handleMessage(message);
            boolean z = f870 == 12580;
            f870 = 0;
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message message) {
        ?? r0 = f868;
        if (r0 != 0) {
            return false;
        }
        try {
            f868 = true;
            f870 = message.what;
            r0 = m2207(message);
            f868 = false;
            return r0;
        } catch (Exception unused) {
            f868 = false;
            return false;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m2206(Message message) {
        List<ReferrerIntent> m2205;
        try {
            Object obj = message.obj;
            C0343<List<Intent>> c0343 = f871;
            if (C0175.f259) {
                C0328 c0328 = C0328.f775;
                List<Intent> m2103 = c0343.m2103(obj);
                List<Intent> list = m2103 instanceof List ? m2103 : null;
                if (list == null) {
                    return false;
                }
                IBinder m21032 = f873.m2103(obj);
                if (m21032 == null) {
                    return false;
                }
                m2205 = c0328.m2022((List<? extends ReferrerIntent>) list, m21032);
            } else {
                List<Intent> m21033 = c0343.m2103(obj);
                if (m21033 == null) {
                    return false;
                }
                IBinder m21034 = f873.m2103(obj);
                if (m21034 == null) {
                    return false;
                }
                m2205 = m2205(m21033, m21034);
            }
            c0343.m2104(obj, m2205);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Handler.Callback m2201() {
        return f869;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2202(@Nullable Handler.Callback callback) {
        f869 = callback;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2204(Object obj) {
        IBinder m2103;
        if (obj == null || (m2103 = f872.m2103(obj)) == null) {
            return false;
        }
        return C0328.f775.m2024(obj, m2103);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2207(Message message) {
        int i = message.what;
        if (i == 100) {
            m2204(message.obj);
        } else if (i == 112) {
            m2206(message);
        }
        Handler.Callback callback = f869;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<Intent> m2205(List<? extends Intent> list, IBinder iBinder) {
        ArrayList arrayList = new ArrayList(list.size());
        try {
            for (Intent intent : list) {
                Pair<Intent, String> m2021 = C0328.f775.m2021(intent, iBinder);
                if (m2021 != null) {
                    Intent intent2 = (Intent) m2021.getFirst();
                    if (intent2 != null) {
                        intent = intent2;
                    }
                }
                arrayList.add(intent);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
