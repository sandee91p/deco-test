package android.die.lu;

import android.accounts.IAccountAuthenticatorResponse;
import android.os.Bundle;
import androidx.annotation.Keep;
import kotlin.Metadata;
import lu.die.foza.SleepyFox.C0019;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b&\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010\b\u001a\u00020\u0005H\u0017J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017¨\u0006\u000e"}, d2 = {"Landroid/die/lu/FozaAccountAuthenticatorResponse;", "Landroid/accounts/IAccountAuthenticatorResponse$Stub;", "<init>", "()V", "onResult", C0019.f56, "value", "Landroid/os/Bundle;", "onRequestContinued", "onError", "errorCode", C0019.f56, "errorMessage", C0019.f56, "foza_release"})
/* loaded from: foza-release.apk:classes.jar:android/die/lu/FozaAccountAuthenticatorResponse.class */
public abstract class FozaAccountAuthenticatorResponse extends IAccountAuthenticatorResponse.Stub {
    @Keep
    public void onResult(@Nullable Bundle bundle) {
    }

    @Keep
    public void onRequestContinued() {
    }

    @Keep
    public void onError(int i, @Nullable String str) {
    }
}
