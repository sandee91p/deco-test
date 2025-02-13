package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\r\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Llu/die/foza/SleepyFox/FozaProxyActivity;", "Landroid/app/Activity;", "<init>", "()V", "scheduleActivityProxy", C0019.f56, "oneIntent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onPause", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaProxyActivity.class */
public final class FozaProxyActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m53(this, null, 1, null);
    }

    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        m54(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        finish();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m54(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            Intent intent2 = (Intent) intent.getParcelableExtra(C0281.C0282.f592);
            if (intent2 == null) {
                return;
            }
            String stringExtra = intent.getStringExtra(C0281.C0282.f600);
            String str = stringExtra;
            if (stringExtra == null) {
                str = C0281.C0289.m1746();
            }
            String stringExtra2 = intent.getStringExtra(C0281.C0282.f612);
            intent2.toString();
            C0209.f304.getClass();
            Intent m1158 = C0209.f305.m1158(intent2, str);
            if (m1158 == null) {
                intent2.toString();
                return;
            }
            if (!C0417.f1015.m2324(268435456, intent)) {
                m1158.addFlags(33554432);
            }
            m1158.putExtra(C0281.C0282.f612, stringExtra2);
            m1158.toString();
            startActivity(m1158);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ void m53(FozaProxyActivity fozaProxyActivity, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = fozaProxyActivity.getIntent();
        }
        fozaProxyActivity.m54(intent);
    }
}
