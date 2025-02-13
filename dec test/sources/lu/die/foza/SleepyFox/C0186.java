package lu.die.foza.SleepyFox;

import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.ClientTransactionItem;
import android.app.servertransaction.LaunchActivityItem;
import android.app.servertransaction.NewIntentItem;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nClientTransactionCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientTransactionCreator.kt\nlu/die/foza/HookEntity/FozaCoreHooker/ClientTransactionCreator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ޓ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޓ.class */
public final class C0186 implements Parcelable.Creator<ClientTransaction> {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Parcelable.Creator<ClientTransaction> f291;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Function1<ClientTransaction, List<?>> f292;

    /* renamed from: lu.die.foza.SleepyFox.ޓ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޓ$Ϳ.class */
    public /* synthetic */ class C0187 extends FunctionReferenceImpl implements Function1<ClientTransaction, List<ClientTransactionItem>> {
        public static final C0187 INSTANCE = new C0187();

        public C0187() {
            super(1, ClientTransaction.class, "getCallbacks", "getCallbacks()Ljava/util/List;", 0);
        }

        public final List<ClientTransactionItem> invoke(ClientTransaction clientTransaction) {
            return clientTransaction.getCallbacks();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ޓ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޓ$Ԩ.class */
    public static final class C0188 implements Function1<ClientTransaction, List<?>> {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0344<List<?>> f293 = new C0344("getCallbacks", null, 2, null).m2125(ClientTransaction.class);

        /* renamed from: Ϳ  reason: contains not printable characters */
        public List<?> invoke(ClientTransaction clientTransaction) {
            return this.f293.m2127(clientTransaction, new Object[0]);
        }
    }

    public C0186(@NotNull Parcelable.Creator<ClientTransaction> creator) {
        FunctionReferenceImpl functionReferenceImpl;
        this.f291 = creator;
        if (C0175.f270) {
            functionReferenceImpl = C0187.INSTANCE;
        } else {
            functionReferenceImpl = r0;
            FunctionReferenceImpl c0188 = new C0188();
        }
        this.f292 = functionReferenceImpl;
    }

    @Override // android.os.Parcelable.Creator
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public ClientTransaction createFromParcel(@Nullable Parcel parcel) {
        ClientTransaction createFromParcel = this.f291.createFromParcel(parcel);
        ClientTransaction clientTransaction = createFromParcel;
        if (createFromParcel != null) {
            m1091(clientTransaction);
        } else {
            clientTransaction = null;
        }
        return clientTransaction;
    }

    @Override // android.os.Parcelable.Creator
    public ClientTransaction[] newArray(int i) {
        return new ClientTransaction[i];
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public ClientTransaction[] m1090(int i) {
        return new ClientTransaction[i];
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1091(ClientTransaction clientTransaction) {
        try {
            List list = (List) this.f292.invoke(clientTransaction);
            if (list == null || list.isEmpty()) {
                return;
            }
            Object obj = list.get(0);
            if (!(obj instanceof LaunchActivityItem)) {
                if (!(obj instanceof NewIntentItem)) {
                    return;
                }
                C0328.f775.m2023(obj, clientTransaction.getActivityToken());
                return;
            }
            C0328.f775.m2024(obj, clientTransaction.getActivityToken());
            if (!C0175.f272) {
                return;
            }
            C0189.f294.m1098(obj);
        } catch (Throwable unused) {
        }
    }
}
