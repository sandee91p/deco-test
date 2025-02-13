package lu.die.foza.SleepyFox;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nAbsServiceRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsServiceRegistry.kt\nlu/die/foza/Framework/Discover/AbsServiceRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.Ԩ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԩ.class */
public abstract class AbstractC0069<T extends IInterface> {
    @Nullable

    /* renamed from: Ϳ  reason: contains not printable characters */
    public T f171;

    /* renamed from: lu.die.foza.SleepyFox.Ԩ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԩ$Ϳ.class */
    public static final class C0070 extends Lambda implements Function0<Unit> {
        public static final C0070 INSTANCE = new C0070();

        public C0070() {
            super(0);
        }

        /* renamed from: invoke  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m660invoke() {
            invoke();
            return Unit.INSTANCE;
        }

        public final void invoke() {
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.Ԩ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ԩ$Ԩ.class */
    public static final class C0071 implements IBinder.DeathRecipient {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f172;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final /* synthetic */ AbstractC0069<T> f173;

        /* renamed from: ԯ  reason: contains not printable characters */
        public final /* synthetic */ Function0<Unit> f174;

        public C0071(IBinder iBinder, AbstractC0069<T> abstractC0069, Function0<Unit> function0) {
            this.f172 = iBinder;
            this.f173 = abstractC0069;
            this.f174 = function0;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            try {
                this.f172.unlinkToDeath(this, 0);
                this.f173.m654(null);
                this.f174.invoke();
            } catch (Exception unused) {
            }
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public abstract String mo650();

    /* renamed from: Ϳ  reason: contains not printable characters */
    public abstract void mo651(@NotNull IBinder iBinder);

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m652(@NotNull Bundle bundle) {
        try {
            IBinder binder = bundle.getBinder(mo650());
            if (binder == null) {
                return;
            }
            mo651(binder);
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final T m653() {
        return this.f171;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final T m656() {
        T t = this.f171;
        if (t != null) {
            return t;
        }
        C0360 c0360 = new C0360();
        while (c0360.m2181()) {
            C0321.f756.m1897();
            T t2 = this.f171;
            if (t2 != null) {
                return t2;
            }
        }
        Intrinsics.checkNotNull((Object) null);
        throw new KotlinNothingValueException();
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final Object m658() {
        return C0321.f756.m1895();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m654(@Nullable T t) {
        this.f171 = t;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m655(@NotNull IBinder iBinder, @NotNull Function1<? super IBinder, ? extends T> function1, @NotNull Function0<Unit> function0) {
        T t;
        T t2 = this.f171;
        if ((t2 == null || !t2.asBinder().isBinderAlive()) && (t = (T) function1.invoke(iBinder)) != null) {
            iBinder.linkToDeath(new C0071(iBinder, this, function0), 0);
            this.f171 = t;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ void m649(AbstractC0069 abstractC0069, IBinder iBinder, Function1 function1, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function0 = C0070.INSTANCE;
            }
            abstractC0069.m655(iBinder, function1, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareManagerImpl");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m657(@NotNull T t) {
        this.f171 = t;
    }
}
