package lu.die.foza.SuperAPI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0281;
import lu.die.fozacompatibility.FozaActivityManager;
import lu.die.fozacompatibility.FozaPackageManager;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\r\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Llu/die/foza/SuperAPI/FozaShortcutRouter;", "Landroid/app/Activity;", "<init>", "()V", "launchApp", C0019.f56, "callingIntent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onPause", "foza_release"})
@SourceDebugExtension({"SMAP\nFozaShortcutRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaShortcutRouter.kt\nlu/die/foza/SuperAPI/FozaShortcutRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaShortcutRouter.class */
public final class FozaShortcutRouter extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FozaActivityManager.get().acquirePreloadNextProcess();
        Intent intent = getIntent();
        getWindow().getDecorView().findViewById(16908290).post(() -> {
            m2482(r1, r2);
        });
    }

    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m2483(intent);
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        finish();
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x009c: INVOKE  (r0 I:java.lang.Throwable) type: VIRTUAL call: java.lang.Throwable.printStackTrace():void, block:B:40:0x009c */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2483(Intent intent) {
        Throwable printStackTrace;
        Intent intent2;
        Thread thread;
        try {
            String stringExtra = intent.getStringExtra(C0281.C0282.f598);
            if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
                finishAndRemoveTask();
                return;
            }
            String stringExtra2 = intent.getStringExtra(C0281.C0282.f600);
            boolean booleanExtra = intent.getBooleanExtra(C0281.C0282.f599, false);
            if (stringExtra2 == null || StringsKt.isBlank(stringExtra2)) {
                if (booleanExtra) {
                    thread = new Thread(() -> {
                        m2480(r2, r3);
                    });
                    thread.start();
                }
                Intent obtainSplashLaunchIntent = FozaActivityManager.get().obtainSplashLaunchIntent(stringExtra, this);
                intent2 = obtainSplashLaunchIntent;
                if (obtainSplashLaunchIntent == null) {
                    return;
                }
                startActivity(intent2);
            } else if (booleanExtra) {
                thread = new Thread(() -> {
                    m2481(r2, r3, r4);
                });
                thread.start();
            } else {
                Intent obtainSplashLaunchIntent2 = FozaActivityManager.get().obtainSplashLaunchIntent(stringExtra2, stringExtra, this);
                intent2 = obtainSplashLaunchIntent2;
                if (obtainSplashLaunchIntent2 == null) {
                    return;
                }
                startActivity(intent2);
            }
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2480(String str, FozaShortcutRouter fozaShortcutRouter) {
        FozaPackageManager.get().waitForBackgroundScanner();
        Intent obtainSplashLaunchIntent = FozaActivityManager.get().obtainSplashLaunchIntent(str, fozaShortcutRouter);
        if (obtainSplashLaunchIntent != null) {
            fozaShortcutRouter.startActivity(obtainSplashLaunchIntent);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2481(String str, String str2, FozaShortcutRouter fozaShortcutRouter) {
        FozaPackageManager.get().waitForBackgroundScanner();
        Intent obtainSplashLaunchIntent = FozaActivityManager.get().obtainSplashLaunchIntent(str, str2, fozaShortcutRouter);
        if (obtainSplashLaunchIntent != null) {
            fozaShortcutRouter.startActivity(obtainSplashLaunchIntent);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m2482(FozaShortcutRouter fozaShortcutRouter, Intent intent) {
        fozaShortcutRouter.m2483(intent);
    }
}
