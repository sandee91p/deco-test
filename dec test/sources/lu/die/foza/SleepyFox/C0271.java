package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ࢣ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢣ.class */
public final class C0271 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0271 f567 = new C0271();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0343<ActivityInfo> f568;

    static {
        C0343<ActivityInfo> c0343 = new C0343<>("mActivityInfo");
        try {
            c0343.m2101(Activity.class);
        } catch (Exception unused) {
        }
        f568 = c0343;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Bitmap m1692(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable instanceof NinePatchDrawable) {
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
            bitmap = Bitmap.createBitmap(ninePatchDrawable.getIntrinsicWidth(), ninePatchDrawable.getIntrinsicHeight(), ninePatchDrawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmap);
            ninePatchDrawable.setBounds(0, 0, ninePatchDrawable.getIntrinsicWidth(), ninePatchDrawable.getIntrinsicHeight());
            ninePatchDrawable.draw(canvas);
        } else {
            bitmap = null;
        }
        return bitmap;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1691(@NotNull Activity activity) {
        try {
            ActivityInfo m2103 = f568.m2103(activity);
            Intrinsics.checkNotNull(m2103);
            ActivityInfo activityInfo = m2103;
            PackageManager packageManager = activity.getPackageManager();
            StringBuilder append = new StringBuilder().append((Object) activityInfo.loadLabel(packageManager)).append('<');
            C0276.f576.getClass();
            String sb = append.append(C0276.f579).append('>').toString();
            if (C0175.f273) {
                ActivityManager.TaskDescription.Builder builder = new ActivityManager.TaskDescription.Builder();
                builder.setIcon(activityInfo.getIconResource());
                builder.setLabel(sb);
                activity.setTaskDescription(builder.build());
            } else if (C0175.f264) {
                activity.setTaskDescription(new ActivityManager.TaskDescription(sb, activityInfo.getIconResource()));
            } else {
                activity.setTaskDescription(new ActivityManager.TaskDescription(sb, m1692(activityInfo.loadIcon(packageManager))));
            }
        } catch (Throwable unused) {
        }
    }
}
