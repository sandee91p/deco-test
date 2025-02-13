package lu.die.foza.SleepyFox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubActivityGroup;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", C0019.f56, "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubActivityGroup.class */
public final class FozaStubActivityGroup extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(null);
        finishAndRemoveTask();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!C0276.f576.m1708() && C0175.f272) {
            C0189.f294.m1096();
        }
        Intent intent = getIntent();
        Intent m2316 = C0417.m2316(intent);
        if (m2316 == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(C0281.C0282.f615);
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            C0209.f304.getClass();
            C0209.f305.m1159(m2316, stringExtra);
            return;
        }
        C0209.f304.getClass();
        C0209.f305.m1159(m2316, C0281.C0289.m1746());
    }
}
