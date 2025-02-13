package android.die.lu;

import android.os.IBinder;
import android.os.ResultReceiver;
import android.os.ShellCallback;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0019;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0017JQ\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/die/lu/ZetaBinder;", "Landroid/os/IBinder;", "<init>", "()V", "getExtension", "shellCommand", C0019.f56, "in", "Ljava/io/FileDescriptor;", "out", "err", "args", C0019.f56, C0019.f56, "shellCallback", "Landroid/os/ShellCallback;", "resultReceiver", "Landroid/os/ResultReceiver;", "(Ljava/io/FileDescriptor;Ljava/io/FileDescriptor;Ljava/io/FileDescriptor;[Ljava/lang/String;Landroid/os/ShellCallback;Landroid/os/ResultReceiver;)V", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:android/die/lu/ZetaBinder.class */
public abstract class ZetaBinder implements IBinder {
    @Keep
    @Nullable
    public IBinder getExtension() {
        throw new IllegalStateException("Method is not implemented");
    }

    @Keep
    public void shellCommand(@Nullable FileDescriptor fileDescriptor, @Nullable FileDescriptor fileDescriptor2, @Nullable FileDescriptor fileDescriptor3, @Nullable String[] strArr, @Nullable ShellCallback shellCallback, @Nullable ResultReceiver resultReceiver) {
    }
}
