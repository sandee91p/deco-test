package android.die.lu;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Keep;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\b\u0016\u0018��2\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u000e"}, d2 = {"Landroid/die/lu/FozaServiceConnection;", "Landroid/app/IServiceConnection$Stub;", "serviceConnection", "Landroid/content/ServiceConnection;", "<init>", "(Landroid/content/ServiceConnection;)V", "connected", C0019.f56, "name", "Landroid/content/ComponentName;", C0281.C0283.f621, "Landroid/os/IBinder;", "dead", C0019.f56, "foza_release"})
/* loaded from: foza-release.apk:classes.jar:android/die/lu/FozaServiceConnection.class */
public class FozaServiceConnection extends IServiceConnection.Stub {
    @Nullable
    private final ServiceConnection serviceConnection;

    public FozaServiceConnection(@Nullable ServiceConnection serviceConnection) {
        this.serviceConnection = serviceConnection;
    }

    @Keep
    public final void connected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
        ServiceConnection serviceConnection;
        if (iBinder == null || (serviceConnection = this.serviceConnection) == null) {
            return;
        }
        serviceConnection.onServiceConnected(componentName, iBinder);
    }

    @Keep
    public void connected(@Nullable ComponentName componentName, @Nullable IBinder iBinder, boolean z) {
        ServiceConnection serviceConnection;
        if (iBinder == null || (serviceConnection = this.serviceConnection) == null) {
            return;
        }
        serviceConnection.onServiceConnected(componentName, iBinder);
    }
}
