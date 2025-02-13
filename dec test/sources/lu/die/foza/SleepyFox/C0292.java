package lu.die.foza.SleepyFox;

import android.telephony.SubscriptionInfo;
import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0255;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢬ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢬ.class */
public final class C0292 {

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final int f699 = 16;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final String f701;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final String[] f702;
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final String f703;
    @Nullable

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final Object f704;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0292 f698 = new C0292();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final SecureRandom f700 = new SecureRandom();

    static {
        ArrayList arrayList;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(f700.nextInt(36)));
        }
        f701 = stringBuffer.toString();
        String[] strArr = {"35133133", "86576905", "86811305", "86610306", "35619596", "86415006", "86992006", "86669706"};
        f702 = strArr;
        C0292 c0292 = f698;
        StringBuffer stringBuffer2 = new StringBuffer(strArr[f700.nextInt(strArr.length)]);
        for (int i2 = 0; i2 < 6; i2++) {
            stringBuffer2.append(f700.nextInt(10));
        }
        stringBuffer2.append(c0292.m1779(stringBuffer2.toString()));
        f703 = stringBuffer2.toString();
        if (C0175.f260) {
            Constructor constructor = null;
            Iterator it = ArrayIteratorKt.iterator(SubscriptionInfo.class.getConstructors());
            while (it.hasNext()) {
                Constructor constructor2 = constructor;
                Constructor constructor3 = (Constructor) it.next();
                if (constructor2 == null || (constructor.getParameterTypes().length > constructor3.getParameterTypes().length && constructor3.getParameterTypes().length != 1)) {
                    constructor = constructor3;
                }
            }
            if (constructor != null) {
                int length = constructor.getParameterTypes().length;
                Object[] objArr = new Object[length];
                for (int i3 = 0; i3 < length; i3++) {
                    objArr[i3] = null;
                }
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    objArr[i4] = C0301.f718.m1824(parameterTypes[i4]);
                }
                SubscriptionInfo[] subscriptionInfoArr = new SubscriptionInfo[1];
                Object newInstance = constructor.newInstance(Arrays.copyOf(objArr, length));
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type android.telephony.SubscriptionInfo");
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) newInstance;
                try {
                    C0047 c0047 = C0047.f129;
                    c0047.m464((Object) subscriptionInfo, "mDisplayName", (Object) "62V.NET");
                    c0047.m464((Object) subscriptionInfo, "mIccId", (Object) f701);
                    c0047.m464((Object) subscriptionInfo, "mCarrierName", (Object) "62V.NET");
                    c0047.m464((Object) subscriptionInfo, "mNumber", (Object) String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                }
                Unit unit = Unit.INSTANCE;
                subscriptionInfoArr[0] = subscriptionInfo;
                arrayList = CollectionsKt.arrayListOf(subscriptionInfoArr);
                f704 = arrayList;
            }
        }
        arrayList = null;
        f704 = arrayList;
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final String m1775() {
        return f701;
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final Object m1777() {
        return f704;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String m1778() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            String hexString = Integer.toHexString(f700.nextInt(C0255.C0256.f529));
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final char m1779(String str) {
        char c = 0;
        char c2 = 0;
        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) {
                c = (str.charAt(i) + c) - 48;
            } else {
                int charAt = (str.charAt(i) - '0') * 2;
                c2 = charAt < 10 ? c2 + charAt : ((c2 + 1) + charAt) - 10;
            }
        }
        int i2 = (c + c2) % 10;
        if (i2 == 0) {
            return '0';
        }
        return (char) ((10 - i2) + 48);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m1776() {
        return f703;
    }
}
