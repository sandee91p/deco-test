package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.TaskInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ׯ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ׯ.class */
public final class C0131 extends C0301 {
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final C0132 f185 = new C0132();
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final C0131 f186 = new C0131();

    /* renamed from: lu.die.foza.SleepyFox.ׯ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ׯ$Ϳ.class */
    public static final class C0132 {
        public C0132() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0131 m709() {
            return C0131.f186;
        }

        public /* synthetic */ C0132(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ׯ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ׯ$Ԩ.class */
    public static final class C0133 implements AbstractC0412 {
        public C0133() {
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0276 c0276 = C0276.f576;
            C0327 c0327 = C0327.f772;
            c0276.m1722(this::m2017);
            return C0131.this.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ׯ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ׯ$Ԫ.class */
    public static final class C0134 extends C0301 {
        public C0134() {
        }

        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            Intent[] intentArr;
            try {
                intentArr = (Intent[]) C0153.f201.m726(c0253.f519, Intent[].class);
            } catch (Exception unused) {
            }
            if (intentArr == null) {
                return super.mo85(c0253);
            }
            int length = intentArr.length;
            for (int i = 0; i < length; i++) {
                C0131.this.m708(intentArr, i, false);
            }
            return super.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ׯ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ׯ$Ԭ.class */
    public static final class C0135 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            String m1713;
            Object m1485 = c0253.m1485();
            List<?> m2455 = C0495.f1089.m2455(m1485);
            if (m2455 == null) {
                return null;
            }
            try {
                m1713 = C0276.f576.m1713();
            } catch (Exception unused) {
            }
            if (m1713 == null) {
                return m1485;
            }
            for (Object obj : m2455) {
                if (obj instanceof TaskInfo) {
                    ComponentName componentName = ((TaskInfo) obj).baseActivity;
                    if (componentName != null) {
                        ((TaskInfo) obj).baseActivity = new ComponentName(m1713, componentName.getClassName());
                    }
                    ComponentName componentName2 = ((TaskInfo) obj).topActivity;
                    if (componentName2 != null) {
                        ((TaskInfo) obj).topActivity = new ComponentName(m1713, componentName2.getClassName());
                    }
                }
            }
            return m1485;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ׯ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ׯ$Ԯ.class */
    public static final class C0136 extends C0202 {
        @Override // lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            String m1713;
            Object m1485 = c0253.m1485();
            List<?> m2455 = C0495.f1089.m2455(m1485);
            if (m2455 == null) {
                return null;
            }
            try {
                m1713 = C0276.f576.m1713();
            } catch (Exception unused) {
            }
            if (m1713 == null) {
                return m1485;
            }
            for (Object obj : m2455) {
                if (obj instanceof ActivityManager.RunningTaskInfo) {
                    ComponentName componentName = ((ActivityManager.RunningTaskInfo) obj).baseActivity;
                    if (componentName != null) {
                        ((ActivityManager.RunningTaskInfo) obj).baseActivity = new ComponentName(m1713, componentName.getClassName());
                    }
                    ComponentName componentName2 = ((ActivityManager.RunningTaskInfo) obj).topActivity;
                    if (componentName2 != null) {
                        ((ActivityManager.RunningTaskInfo) obj).topActivity = new ComponentName(m1713, componentName2.getClassName());
                    }
                } else if (C0175.f260 && (obj instanceof ActivityManager.RecentTaskInfo)) {
                    ComponentName componentName3 = ((ActivityManager.RecentTaskInfo) obj).baseActivity;
                    if (componentName3 != null) {
                        ((ActivityManager.RecentTaskInfo) obj).baseActivity = new ComponentName(m1713, componentName3.getClassName());
                    }
                    ComponentName componentName4 = ((ActivityManager.RecentTaskInfo) obj).topActivity;
                    if (componentName4 != null) {
                        ((ActivityManager.RecentTaskInfo) obj).topActivity = new ComponentName(m1713, componentName4.getClassName());
                    }
                }
            }
            return m1485;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m707(@NotNull C0033 c0033) {
        C0133 c0133;
        C0133 c01332;
        C0136 c0136;
        C0135 c0135;
        C0135 c01352;
        try {
            if (C0175.f264) {
                c01332 = this;
            } else {
                c01332 = c0133;
                c0133 = new C0133();
            }
            AbstractC0412 abstractC0412 = c01332;
            String[] strArr = new String[7];
            strArr[0] = "startActivity";
            strArr[1] = "startActivityAsCaller";
            strArr[2] = "startActivityAndWait";
            strArr[3] = "startActivityAsUser";
            strArr[4] = "startActivityWithConfig";
            strArr[5] = "startNextMatchingActivity";
            strArr[6] = "startVoiceActivity";
            c0033.m377(abstractC0412, strArr);
            c0033.m374("startActivities", new C0134());
            if (C0175.f271) {
                c0135 = c01352;
                c01352 = new C0135();
            } else {
                c0135 = c0136;
                c0136 = new C0136();
            }
            AbstractC0412 abstractC04122 = c0135;
            String[] strArr2 = new String[2];
            strArr2[0] = "getTasks";
            strArr2[1] = "getRecentTasks";
            c0033.m377(abstractC04122, strArr2);
            if (!C0175.f270) {
                return;
            }
            String[] strArr3 = new String[1];
            strArr3[0] = "startActivityAsUserWithFeature";
            c0033.m377(this, strArr3);
        } catch (Exception unused) {
        }
    }

    @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        try {
            Object[] objArr = c0253.f519;
            m708(objArr, C0153.f201.m722(objArr, Intent.class), true);
        } catch (Exception unused) {
        }
        return super.mo85(c0253);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m708(@NotNull Object[] objArr, int i, boolean z) {
        if (i < 0) {
            return true;
        }
        try {
            Object obj = objArr[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Intent");
            Intent intent = (Intent) obj;
            C0276 c0276 = C0276.f576;
            String m1713 = c0276.m1713();
            if (m1713 != null) {
                c0276.getClass();
                if (ArraysKt.contains(C0276.f586, m1713)) {
                    Uri data = intent.getData();
                    if (Intrinsics.areEqual(data != null ? data.getScheme() : null, "https")) {
                        intent.setPackage(null);
                    }
                }
            }
            C0209.f304.getClass();
            Intent m1172 = C0209.f305.m1172(intent);
            if (m1172 == null) {
                return false;
            }
            objArr[i] = m1172;
            if (Intrinsics.areEqual(intent.getComponent(), m1172.getComponent())) {
                return true;
            }
            m1172.putExtra(C0281.C0282.f612, m1713);
            if (!z) {
                return true;
            }
            Integer num = (Integer) C0153.f201.m726(objArr, Integer.class);
            if (num == null || num.compareTo((Integer) 0) < 0) {
                return true;
            }
            int i2 = 0;
            for (Object obj2 : objArr) {
                if (obj2 instanceof IBinder) {
                    int i3 = i2 + 1;
                    i2 = i3;
                    if (i3 == 2) {
                        BinderC0293.f705.getClass();
                        Activity activity = BinderC0293.f707.getActivity((IBinder) obj2);
                        ComponentName componentName = activity != null ? activity.getComponentName() : null;
                        if (componentName == null) {
                            return true;
                        }
                        m1172.putExtra(C0281.C0282.f613, componentName);
                        return true;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
