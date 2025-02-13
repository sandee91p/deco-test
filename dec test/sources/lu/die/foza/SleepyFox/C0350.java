package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ഩ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ഩ.class */
public final class C0350 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0350 f826 = new C0350();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0154<String, C0351> f827 = new C0154<>();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0344<Context> f828 = new C0344("createApplicationContext", new Class[]{ApplicationInfo.class, Integer.TYPE}).m2125(Context.class);

    /* renamed from: lu.die.foza.SleepyFox.ഩ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ഩ$Ϳ.class */
    public static final class C0351 {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Drawable f829;
        @Nullable

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Triple<Drawable, Integer, Integer> f830;

        /* JADX WARN: Multi-variable type inference failed */
        public C0351(@NotNull Drawable drawable, @Nullable Triple<? extends Drawable, Integer, Integer> triple) {
            this.f829 = drawable;
            this.f830 = triple;
        }

        @NotNull
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Drawable m2153() {
            return this.f829;
        }

        @Nullable
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Triple<Drawable, Integer, Integer> m2154() {
            return this.f830;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final void m2145() {
        try {
            f827.clear();
            Context m1701 = C0276.m1701();
            C0325.f765.getClass();
            for (Map.Entry<String, C0311> entry : C0325.f768.m733().m768()) {
                boolean z = entry.getValue().f733;
                String key = entry.getKey();
                ApplicationInfo applicationInfo = !z ? entry.getValue().f732.applicationInfo : null;
                C0276.f576.m1722(() -> {
                    m2144(r1, r2, r3, r4);
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m2147() {
        f827.clear();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2149(@Nullable String str) {
        boolean z;
        try {
            z = f827.containsKey(str);
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2148() {
        C0276.f576.m1722(C0350::m2145);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2144(boolean z, Context context, String str, ApplicationInfo applicationInfo) {
        Context m2127;
        try {
            if (z) {
                m2127 = context.createPackageContext(str, 3);
            } else {
                C0344<Context> c0344 = f828;
                Object[] objArr = new Object[2];
                objArr[0] = applicationInfo;
                objArr[1] = 0;
                m2127 = c0344.m2127(context, objArr);
            }
            Context context2 = m2127;
            C0350 c0350 = f826;
            if (context2 == null) {
                return;
            }
            C0351 m2152 = c0350.m2152(context2, !z);
            if (m2152 == null) {
                return;
            }
            C0154<String, C0351> c0154 = f827;
            synchronized (c0154) {
                c0154.put(str, m2152);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0351 m2152(Context context, boolean z) {
        try {
            ActivityInfo m711 = C0140.f190.m711(context.getPackageName(), z);
            if (m711 == null) {
                return null;
            }
            int themeResource = m711.getThemeResource();
            if (themeResource == 0) {
                return null;
            }
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.applyStyle(themeResource, true);
            TypedValue typedValue = new TypedValue();
            if (newTheme.resolveAttribute(16842836, typedValue, true)) {
                int i = typedValue.resourceId;
                if (i != 0) {
                    int i2 = typedValue.type;
                    if (i2 < 28 || i2 > 31) {
                        Drawable drawable = newTheme.getDrawable(i);
                        if (drawable != null) {
                            return new C0351(drawable, null);
                        }
                    }
                }
            }
            if (!C0175.f272) {
                return null;
            }
            return m2151(newTheme, typedValue);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: Exception -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0098, blocks: (B:2:0x0000, B:4:0x000b, B:9:0x0016, B:13:0x0022, B:15:0x002d, B:18:0x003b, B:19:0x0041, B:21:0x004c, B:22:0x005b, B:24:0x0061, B:27:0x0080, B:29:0x0089, B:32:0x006d, B:34:0x0078), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* renamed from: Ϳ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lu.die.foza.SleepyFox.C0350.C0351 m2151(android.content.res.Resources.Theme r8, android.util.TypedValue r9) {
        /*
            r7 = this;
            r0 = r8
            r1 = 16844333(0x101062d, float:2.369799E-38)
            r2 = r9
            r3 = 1
            boolean r0 = r0.resolveAttribute(r1, r2, r3)     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L96
            r0 = r9
            int r0 = r0.resourceId     // Catch: java.lang.Exception -> L98
            r1 = r0
            r7 = r1
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r8
            r1 = r7
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch: java.lang.Exception -> L98
            r1 = r0
            r7 = r1
            if (r0 != 0) goto L22
            r0 = 0
            return r0
        L22:
            r0 = r8
            r1 = 16844335(0x101062f, float:2.3697995E-38)
            r2 = r9
            r3 = 1
            boolean r0 = r0.resolveAttribute(r1, r2, r3)     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L36
            r0 = r9
            int r0 = r0.resourceId     // Catch: java.lang.Exception -> L98
            r1 = r0
            r10 = r1
            if (r0 != 0) goto L3b
        L36:
            r0 = 0
            r10 = r0
            goto L41
        L3b:
            r0 = r8
            r1 = r10
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch: java.lang.Exception -> L98
            r10 = r0
        L41:
            r0 = r8
            r1 = 16844332(0x101062c, float:2.3697986E-38)
            r2 = r9
            r3 = 1
            boolean r0 = r0.resolveAttribute(r1, r2, r3)     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L58
            r0 = r9
            int r0 = r0.data     // Catch: java.lang.Exception -> L98
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L98
            r11 = r0
            goto L5b
        L58:
            r0 = 0
            r11 = r0
        L5b:
            boolean r0 = lu.die.foza.SleepyFox.C0175.f262     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L6d
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.AdaptiveIconDrawable     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L6d
        L68:
            r0 = 0
            r8 = r0
            goto L80
        L6d:
            r0 = r8
            r1 = 16844336(0x1010630, float:2.3697997E-38)
            r2 = r9
            r3 = 1
            boolean r0 = r0.resolveAttribute(r1, r2, r3)     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L68
            r0 = r9
            int r0 = r0.data     // Catch: java.lang.Exception -> L98
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L98
            r8 = r0
        L80:
            lu.die.foza.SleepyFox.ഩ$Ϳ r0 = new lu.die.foza.SleepyFox.ഩ$Ϳ     // Catch: java.lang.Exception -> L98
            r1 = r0
            kotlin.Triple r2 = new kotlin.Triple     // Catch: java.lang.Exception -> L98
            r3 = r2
            r9 = r3
            r3 = r10
            r4 = r11
            r5 = r8
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Exception -> L98
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L98
            return r0
        L96:
            r0 = 0
            return r0
        L98:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0350.m2151(android.content.res.Resources$Theme, android.util.TypedValue):lu.die.foza.SleepyFox.ഩ$Ϳ");
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0351 m2150(@NotNull String str) {
        C0351 c0351;
        try {
            c0351 = f827.get(str);
        } catch (Exception unused) {
            c0351 = null;
        }
        return c0351;
    }
}
