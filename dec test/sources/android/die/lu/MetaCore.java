package android.die.lu;

import android.system.StructAddrinfo;
import androidx.annotation.Keep;
import java.net.InetAddress;
import kotlin.Metadata;
import libcore.io.ForwardingOs;
import libcore.io.Os;
import lu.die.foza.SleepyFox.C0019;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018��2\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/die/lu/MetaCore;", "Llibcore/io/ForwardingOs;", "os", "Llibcore/io/Os;", "<init>", "(Llibcore/io/Os;)V", "android_getaddrinfo", C0019.f56, "Ljava/net/InetAddress;", "node", C0019.f56, "hints", "Landroid/system/StructAddrinfo;", "netId", C0019.f56, "(Ljava/lang/String;Landroid/system/StructAddrinfo;I)[Ljava/net/InetAddress;", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:android/die/lu/MetaCore.class */
public class MetaCore extends ForwardingOs {
    public MetaCore(@Nullable Os os) {
        super(os);
    }

    @Keep
    @NotNull
    public InetAddress[] android_getaddrinfo(@Nullable String str, @Nullable StructAddrinfo structAddrinfo, int i) {
        return super.android_getaddrinfo(str, structAddrinfo, i);
    }
}
