package lu.die.foza.SleepyFox;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lu.die.foza.SleepyFox.AbstractC0402;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ޢ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޢ.class */
public final class C0214 extends AbstractC0069<AbstractC0402> {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0214 f312 = new C0214();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String f313 = BinderC0029.class.getName();

    /* renamed from: lu.die.foza.SleepyFox.ޢ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޢ$Ϳ.class */
    public /* synthetic */ class C0215 extends FunctionReferenceImpl implements Function1<IBinder, AbstractC0402> {
        public static final C0215 INSTANCE = new C0215();

        public C0215() {
            super(1, AbstractC0402.AbstractBinderC0404.class, "asInterface", "asInterface(Landroid/os/IBinder;)Llu/die/fozalib/IScaleContentObserver;", 0);
        }

        public final AbstractC0402 invoke(IBinder iBinder) {
            return AbstractC0402.AbstractBinderC0404.m2289(iBinder);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    @NotNull
    /* renamed from: Ϳ */
    public String mo650() {
        return f313;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1197(@NotNull Uri[] uriArr, @NotNull IContentObserver iContentObserver, boolean z) {
        try {
            m656().mo364(uriArr, iContentObserver.asBinder(), z);
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1195(@Nullable Uri uri, boolean z, @NotNull IContentObserver iContentObserver) {
        try {
            m656().mo363(uri, z, iContentObserver.asBinder());
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    /* renamed from: Ϳ */
    public void mo651(@NotNull IBinder iBinder) {
        AbstractC0069.m649(this, iBinder, C0215.INSTANCE, null, 4, null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1196(@NotNull IContentObserver iContentObserver) {
        try {
            m656().mo362(iContentObserver.asBinder());
        } catch (Exception unused) {
            C0321.f756.m1895();
        }
    }
}
