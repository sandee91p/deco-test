package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014¨\u0006\u001a"}, d2 = {"Llu/die/foza/SleepyFox/FozaDelegateActivity;", "Landroid/app/Activity;", "<init>", "()V", "dealFinish", C0019.f56, "removeTask", C0019.f56, "targetIntent", "Landroid/content/Intent;", "dealOriginFinish", "isOriginPackageName", "processResultAndLaunch", "user", C0019.f56, "activityInfo", "Landroid/content/pm/ActivityInfo;", "callingPackageName", "dealWithDelegateIntent", "originIntent", "executeInternal", "onNewIntent", "intent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaDelegateActivity.class */
public final class FozaDelegateActivity extends Activity {
    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m52(intent);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m52(getIntent());
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m48(Intent intent) {
        m47(C0417.f1015.m2324(268435456, intent));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m52(Intent intent) {
        try {
            Intent intent2 = C0175.f273 ? (Intent) intent.getParcelableExtra(C0281.C0282.f611, Intent.class) : (Intent) intent.getParcelableExtra(C0281.C0282.f611);
            if (intent2 == null) {
                finishAndRemoveTask();
            } else {
                new Thread(() -> {
                    m46(r2, r3, r4);
                }).start();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m47(boolean z) {
        if (z) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m49(Intent intent, boolean z) {
        try {
            boolean m2324 = C0417.f1015.m2324(268435456, intent);
            if (!m2324) {
                intent.addFlags(33554432);
            }
            startActivity(intent);
            m47(m2324 && !z);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ void m41(FozaDelegateActivity fozaDelegateActivity, Intent intent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        fozaDelegateActivity.m49(intent, z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m51(Intent intent, Intent intent2) {
        C0065 c0065;
        intent.setComponent(null);
        String stringExtra = intent2.getStringExtra(C0281.C0282.f600);
        String str = stringExtra;
        if (stringExtra == null) {
            str = C0281.C0289.m1746();
        }
        String stringExtra2 = intent2.getStringExtra(C0281.C0282.f612);
        ArrayList arrayList = new ArrayList();
        C0245.f512.getClass();
        List<ResolveInfo> m1418 = C0245.m1418(C0245.f513, intent, (String) null, 0, 6, (Object) null);
        if (m1418 != null) {
            c0065 = r1;
            C0065 c00652 = new C0065(m1418.size());
            for (ResolveInfo resolveInfo : m1418) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                c0065.m634(new ComponentName(activityInfo.packageName, activityInfo.name).hashCode());
                arrayList.add(activityInfo);
            }
        } else {
            c0065 = null;
        }
        List<ResolveInfo> m1905 = C0323.m1905(C0323.f761, intent, 0, 2, null);
        if (m1905 != null) {
            for (ResolveInfo resolveInfo2 : m1905) {
                C0065 c00653 = c0065;
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                if (c00653 == null || !c0065.m635(new ComponentName(activityInfo2.packageName, activityInfo2.name).hashCode())) {
                    arrayList.add(activityInfo2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            m48(intent);
        } else if (arrayList.size() == 1) {
            ActivityInfo activityInfo3 = (ActivityInfo) arrayList.get(0);
            if (C0325.f765.m1991(activityInfo3.packageName)) {
                m50(intent, str, activityInfo3, stringExtra2);
                return;
            }
            Uri data = intent.getData();
            if (Intrinsics.areEqual(data != null ? data.getScheme() : null, "package")) {
                intent.setDataAndType(Uri.fromParts("package", getPackageName(), null), intent.getType());
            }
            m41(this, intent, false, 2, null);
        } else {
            PackageManager packageManager = getPackageManager();
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                ActivityInfo activityInfo4 = (ActivityInfo) arrayList.get(i);
                strArr[i] = ((Object) activityInfo4.loadLabel(packageManager)) + " (" + activityInfo4.packageName + ')';
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            String str2 = str;
            builder.setItems(strArr, (v5, v6) -> {
                m42(r9, r10, r11, r12, r13, v5, v6);
            });
            builder.setNegativeButton("X", (v2, v3) -> {
                m43(r6, r7, v2, v3);
            });
            builder.setOnDismissListener((v2) -> {
                m44(r3, r4, v2);
            });
            runOnUiThread(() -> {
                m45(r1);
            });
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m42(ArrayList arrayList, FozaDelegateActivity fozaDelegateActivity, Intent intent, String str, String str2, DialogInterface dialogInterface, int i) {
        try {
            ActivityInfo activityInfo = (ActivityInfo) arrayList.get(i);
            C0245.f512.getClass();
            if (!C0245.f513.m1444(activityInfo.packageName)) {
                fozaDelegateActivity.m50(intent, (String) null, activityInfo, (String) null);
            } else {
                fozaDelegateActivity.m50(intent, str, activityInfo, str2);
            }
        } catch (Exception unused) {
            fozaDelegateActivity.m48(intent);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m43(FozaDelegateActivity fozaDelegateActivity, Intent intent, DialogInterface dialogInterface, int i) {
        fozaDelegateActivity.m48(intent);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m44(FozaDelegateActivity fozaDelegateActivity, Intent intent, DialogInterface dialogInterface) {
        if (!fozaDelegateActivity.isFinishing()) {
            fozaDelegateActivity.m48(intent);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m45(AlertDialog.Builder builder) {
        builder.show();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m46(FozaDelegateActivity fozaDelegateActivity, Intent intent, Intent intent2) {
        try {
            fozaDelegateActivity.m51(intent, intent2);
        } catch (Exception unused) {
            fozaDelegateActivity.m48(intent);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m50(Intent intent, String str, ActivityInfo activityInfo, String str2) {
        Intent intent2;
        try {
            intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            if (str != null) {
                C0209.f304.getClass();
                intent2 = C0209.f305.m1158(intent, str);
            } else {
                intent2 = null;
            }
            if (intent2 == null) {
                m49(intent, Intrinsics.areEqual(activityInfo.packageName, getPackageName()));
                return;
            }
            Intent intent3 = intent2;
            intent3.putExtra(C0281.C0282.f612, str2);
            m41(this, intent3, false, 2, null);
        } catch (Exception unused) {
        }
    }
}
