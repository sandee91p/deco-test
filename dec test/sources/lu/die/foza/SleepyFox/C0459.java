package lu.die.foza.SleepyFox;

import android.die.lu.ZetaBinder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.FileDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ၵ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၵ.class */
public final class C0459 extends ZetaBinder {
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final C0460 f1070 = new C0460();
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public static final C0344<IBinder> f1071;
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public final IBinder f1072;
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public final C0033 f1073;

    /* renamed from: lu.die.foza.SleepyFox.ၵ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၵ$Ϳ.class */
    public static final class C0460 {
        public C0460() {
        }

        public /* synthetic */ C0460(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0459(@NotNull IBinder iBinder, @NotNull C0033 c0033) {
        this.f1072 = iBinder;
        this.f1073 = c0033;
    }

    static {
        C0344<IBinder> c0344 = new C0344<>("getExtension", null, 2, null);
        if (C0175.f270) {
            c0344.m2125(IBinder.class);
        }
        f1071 = c0344;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m2393() {
        return this.f1073;
    }

    @Override // android.os.IBinder
    @Nullable
    public String getInterfaceDescriptor() {
        return this.f1072.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.f1072.pingBinder();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.f1072.isBinderAlive();
    }

    @Override // android.os.IBinder
    @NotNull
    public IInterface queryLocalInterface(@NotNull String str) {
        Object obj = this.f1073.f100;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.IInterface");
        return (IInterface) obj;
    }

    @Override // android.os.IBinder
    public void dump(@NotNull FileDescriptor fileDescriptor, @Nullable String[] strArr) {
        this.f1072.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(@NotNull FileDescriptor fileDescriptor, @Nullable String[] strArr) {
        this.f1072.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public boolean transact(int i, @NotNull Parcel parcel, @Nullable Parcel parcel2, int i2) {
        return this.f1072.transact(i, parcel, parcel2, i2);
    }

    @Override // android.os.IBinder
    public void linkToDeath(@NotNull IBinder.DeathRecipient deathRecipient, int i) {
        this.f1072.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(@NotNull IBinder.DeathRecipient deathRecipient, int i) {
        return this.f1072.unlinkToDeath(deathRecipient, i);
    }

    @Override // android.die.lu.ZetaBinder
    @Nullable
    public IBinder getExtension() {
        return f1071.m2127(this.f1072, new Object[0]);
    }
}
