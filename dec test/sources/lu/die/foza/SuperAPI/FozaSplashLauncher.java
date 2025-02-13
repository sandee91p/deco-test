package lu.die.foza.SuperAPI;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0175;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.C0350;
import lu.die.fozacompatibility.FozaActivityManager;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u0010\u001a\u00020\bH\u0014¨\u0006\u0011"}, d2 = {"Llu/die/foza/SuperAPI/FozaSplashLauncher;", "Landroid/app/Activity;", "<init>", "()V", "dp2px", C0019.f56, "dp", "launchApp", C0019.f56, "callingIntent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onPause", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaSplashLauncher.class */
public final class FozaSplashLauncher extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m2486(getIntent());
    }

    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m2486(intent);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        finish();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m2485(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2486(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(C0281.C0282.f598);
            if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
                finish();
                return;
            }
            C0350.C0351 m2150 = C0350.f826.m2150(stringExtra);
            if (m2150 != null) {
                if (C0175.f264) {
                    getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
                Triple<Drawable, Integer, Integer> triple = m2150.f830;
                if (triple == null) {
                    getWindow().getDecorView().setBackground(m2150.f829);
                } else {
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Integer num = (Integer) triple.getSecond();
                    Integer num2 = (Integer) triple.getThird();
                    ImageView imageView = new ImageView(this);
                    int m2485 = m2485(288);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m2485, m2485);
                    layoutParams.gravity = 17;
                    imageView.setLayoutParams(layoutParams);
                    Drawable drawable = m2150.f829;
                    imageView.setImageDrawable(drawable);
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).start();
                    }
                    if (num2 != null && !Intrinsics.areEqual(num2, num) && num2.intValue() != 0) {
                        imageView.setBackgroundColor(num2.intValue());
                    }
                    frameLayout.addView(imageView);
                    Drawable drawable2 = (Drawable) triple.getFirst();
                    if (drawable2 != null) {
                        View view = new View(this);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m2485(200), m2485(80));
                        layoutParams2.gravity = 81;
                        layoutParams2.bottomMargin = m2485(60);
                        view.setLayoutParams(layoutParams2);
                        view.setBackground(drawable2);
                        if (C0175.f261) {
                            view.forceHasOverlappingRendering(false);
                        }
                        frameLayout.addView(view);
                    }
                    if (num != null) {
                        frameLayout.setBackgroundColor(num.intValue());
                    } else {
                        frameLayout.setBackground(getWindow().getDecorView().getBackground());
                    }
                    setContentView(frameLayout);
                }
            }
            String stringExtra2 = intent.getStringExtra(C0281.C0282.f600);
            getWindow().getDecorView().findViewById(16908290).post(() -> {
                m2484(r1, r2);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2484(String str, String str2) {
        if (str == null || StringsKt.isBlank(str)) {
            FozaActivityManager.get().launchActivityExistingAppProcess(str2);
        } else {
            FozaActivityManager.get().launchActivityExistingAppProcess(str2, str);
        }
    }
}
