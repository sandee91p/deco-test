package lu.die.foza.SleepyFox;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", C0019.f56, "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubReceiver.class */
public final class FozaStubReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        try {
            Intent intent2 = (Intent) intent.getParcelableExtra(C0281.C0282.f611);
            if (intent2 == null) {
                return;
            }
            String stringExtra = intent.getStringExtra(C0281.C0282.f615);
            String str = stringExtra;
            if (stringExtra == null) {
                str = C0281.C0289.m1746();
            }
            C0265.f550.m1682(intent2, str);
        } catch (Exception unused) {
        }
    }
}
