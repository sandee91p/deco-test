package lu.die.foza.SuperAPI;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0245;
import lu.die.foza.SleepyFox.C0255;
import lu.die.foza.SleepyFox.C0281;
import lu.die.fozacompatibility.FozaPackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018�� \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J<\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0007J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¨\u0006\u001c"}, d2 = {"Llu/die/foza/SuperAPI/FozaShortcutManager;", C0019.f56, "<init>", "()V", "drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "installShortcutSingle", C0019.f56, "userId", C0019.f56, "packageName", C0019.f56, "customName", "customIcon", "installShortcut", C0019.f56, "context", "Landroid/content/Context;", "strPkg", "icon", "label", "sc", "Llu/die/foza/SuperAPI/IShortcutCallback;", "userName", "Companion", "ShortcutIntentReceiver", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaShortcutManager.class */
public final class FozaShortcutManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final FozaShortcutManager f1101 = new FozaShortcutManager();
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static IShortcutCallback f1102;

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llu/die/foza/SuperAPI/FozaShortcutManager$Companion;", C0019.f56, "<init>", "()V", "sInstance", "Llu/die/foza/SuperAPI/FozaShortcutManager;", "getInstance", "scRegion", "Llu/die/foza/SuperAPI/IShortcutCallback;", "getScRegion", "()Llu/die/foza/SuperAPI/IShortcutCallback;", "setScRegion", "(Llu/die/foza/SuperAPI/IShortcutCallback;)V", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaShortcutManager$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FozaShortcutManager getInstance() {
            return FozaShortcutManager.f1101;
        }

        @Nullable
        public final IShortcutCallback getScRegion() {
            return FozaShortcutManager.f1102;
        }

        public final void setScRegion(@Nullable IShortcutCallback iShortcutCallback) {
            FozaShortcutManager.f1102 = iShortcutCallback;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Llu/die/foza/SuperAPI/FozaShortcutManager$ShortcutIntentReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", C0019.f56, "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaShortcutManager$ShortcutIntentReceiver.class */
    public static final class ShortcutIntentReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            IShortcutCallback scRegion = FozaShortcutManager.Companion.getScRegion();
            if (scRegion != null) {
                scRegion.onShortcutInstallResult(context, intent);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final FozaShortcutManager getInstance() {
        return Companion.getInstance();
    }

    @Nullable
    public final Bitmap drawableToBitmap(@NotNull Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            createBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
        }
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean installShortcutSingle(int r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            r8 = this;
            android.content.Context r0 = lu.die.foza.SuperAPI.FozaCore.getHostContext()     // Catch: java.lang.Exception -> La0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            lu.die.fozacompatibility.FozaPackageManager r0 = lu.die.fozacompatibility.FozaPackageManager.get()     // Catch: java.lang.Throwable -> L9d
            r1 = r10
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1)     // Catch: java.lang.Throwable -> L9d
            r1 = r0
            r14 = r1
            r1 = r11
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L9d
            r15 = r1
            if (r0 == 0) goto L26
            r0 = r14
            r1 = r15
            java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch: java.lang.Throwable -> L9d
            r13 = r0
        L26:
            r0 = r13
            if (r0 == 0) goto L36
            r0 = r13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9d
            r1 = r0
            r13 = r1
            if (r0 != 0) goto L3a
        L36:
            java.lang.String r0 = "null"
            r13 = r0
        L3a:
            r0 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r2 = r1
            r3 = r13
            r4 = r2; r2 = r3; r3 = r4;      // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9d
            r13 = r1
            if (r0 == 0) goto L6c
            r0 = r8
            r1 = r14
            r2 = r15
            android.graphics.drawable.Drawable r1 = r1.loadIcon(r2)     // Catch: java.lang.Throwable -> L9d
            android.graphics.Bitmap r0 = r0.drawableToBitmap(r1)     // Catch: java.lang.Throwable -> L9d
            r12 = r0
        L6c:
            r0 = r12
            if (r0 != 0) goto L82
            r0 = r8
            r1 = r11
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L9d
            r2 = r11
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L9d
            android.graphics.drawable.Drawable r1 = r1.loadIcon(r2)     // Catch: java.lang.Throwable -> L9d
            android.graphics.Bitmap r0 = r0.drawableToBitmap(r1)     // Catch: java.lang.Throwable -> L9d
            r12 = r0
        L82:
            r0 = r8
            r1 = r9
            r2 = r12
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Exception -> La0
            r2 = 0
            r8 = r2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> La0
            r9 = r1
            r1 = r11
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r8
            r6 = r9
            r0.installShortcut(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> La0
            goto La1
        L9d:
            r0 = 0
            return r0
        La0:
        La1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SuperAPI.FozaShortcutManager.installShortcutSingle(int, java.lang.String):boolean");
    }

    public final void installShortcut(@NotNull Context context, @NotNull String str, @NotNull Bitmap bitmap, @NotNull String str2, @Nullable IShortcutCallback iShortcutCallback) {
        installShortcut(context, str, bitmap, str2, iShortcutCallback, C0019.f56);
    }

    public final boolean installShortcutSingle(int i, @NotNull String str, @Nullable String str2) {
        try {
            Context hostContext = FozaCore.getHostContext();
            Bitmap bitmap = null;
            try {
                ApplicationInfo applicationInfo = FozaPackageManager.get().getApplicationInfo(str);
                PackageManager packageManager = hostContext.getPackageManager();
                if (applicationInfo != null) {
                    bitmap = drawableToBitmap(applicationInfo.loadIcon(packageManager));
                }
                if (bitmap == null) {
                    bitmap = drawableToBitmap(hostContext.getApplicationInfo().loadIcon(hostContext.getPackageManager()));
                }
                return installShortcutSingle(i, str, str2, bitmap);
            } catch (Throwable unused) {
                return false;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    public final void installShortcut(@NotNull Context context, @NotNull String str, @NotNull Bitmap bitmap, @NotNull String str2, @Nullable IShortcutCallback iShortcutCallback, @Nullable String str3) {
        try {
            f1102 = iShortcutCallback;
            C0245.f512.getClass();
            boolean m1446 = C0245.f513.m1446(str);
            Intent intent = new Intent(context, FozaShortcutRouter.class);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(C0281.C0282.f598, str);
            intent.putExtra(C0281.C0282.f599, m1446);
            intent.putExtra(C0281.C0282.f600, str3);
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent2.putExtra("duplicate", false);
                intent2.putExtra("android.intent.extra.shortcut.ICON", Bitmap.createScaledBitmap(bitmap, C0255.C0256.f530, C0255.C0256.f530, true));
                intent2.putExtra("android.intent.extra.shortcut.NAME", str2);
                intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                context.sendOrderedBroadcast(intent2, null, new ShortcutIntentReceiver(), null, -1, null, null);
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(StringsKt.trim(str2).toString().hashCode());
            String format = String.format("%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            ShortcutInfo build = new ShortcutInfo.Builder(context, format).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str2).setIntent(intent).build();
            PendingIntent broadcast = i >= 31 ? PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutIntentReceiver.class), 167772160) : PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutIntentReceiver.class), 134217728);
            Object systemService = context.getSystemService("shortcut");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
            ShortcutManager shortcutManager = (ShortcutManager) systemService;
            if (!shortcutManager.isRequestPinShortcutSupported()) {
                return;
            }
            shortcutManager.requestPinShortcut(build, broadcast.getIntentSender());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean installShortcutSingle(int i, @NotNull String str, @Nullable String str2, @Nullable Bitmap bitmap) {
        try {
            Context hostContext = FozaCore.getHostContext();
            Intrinsics.checkNotNull(bitmap);
            if (str2 == null) {
                str2 = "UNKNOWN";
            }
            installShortcut(hostContext, str, bitmap, str2, null, String.valueOf(i));
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
