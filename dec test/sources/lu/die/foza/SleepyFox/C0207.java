package lu.die.foza.SleepyFox;

import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lu.die.foza.SleepyFox.AbstractC0392;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ޟ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޟ.class */
public final class C0207 extends AbstractC0069<AbstractC0392> {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0207 f302 = new C0207();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String f303 = BinderC0231.class.getName();

    /* renamed from: lu.die.foza.SleepyFox.ޟ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޟ$Ϳ.class */
    public /* synthetic */ class C0208 extends FunctionReferenceImpl implements Function1<IBinder, AbstractC0392> {
        public static final C0208 INSTANCE = new C0208();

        public C0208() {
            super(1, AbstractC0392.AbstractBinderC0394.class, "asInterface", "asInterface(Landroid/os/IBinder;)Llu/die/fozalib/IScaleAccountObserver;", 0);
        }

        public final AbstractC0392 invoke(IBinder iBinder) {
            return AbstractC0392.AbstractBinderC0394.m2277(iBinder);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    @NotNull
    /* renamed from: Ϳ */
    public String mo650() {
        return f303;
    }

    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public final AbstractC0392 m1145() {
        return m656();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0069
    /* renamed from: Ϳ */
    public void mo651(@NotNull IBinder iBinder) {
        AbstractC0069.m649(this, iBinder, C0208.INSTANCE, null, 4, null);
    }
}
