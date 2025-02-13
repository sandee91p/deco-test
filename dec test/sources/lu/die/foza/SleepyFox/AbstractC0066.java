package lu.die.foza.SleepyFox;

import android.os.IInterface;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nAbsServiceInterrupter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsServiceInterrupter.kt\nlu/die/foza/HookEntity/BaseEntity/AbsServiceInterrupter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,85:1\n13309#2,2:86\n*S KotlinDebug\n*F\n+ 1 AbsServiceInterrupter.kt\nlu/die/foza/HookEntity/BaseEntity/AbsServiceInterrupter\n*L\n69#1:86,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.Ϳ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ϳ.class */
public abstract class AbstractC0066 {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0067 f166 = new C0067();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String f167 = "$Proxy";
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public AbstractC0412 f168 = new C0202();

    /* renamed from: lu.die.foza.SleepyFox.Ϳ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ϳ$Ϳ.class */
    public static final class C0067 {

        @SourceDebugExtension({"SMAP\nAbsServiceInterrupter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsServiceInterrupter.kt\nlu/die/foza/HookEntity/BaseEntity/AbsServiceInterrupter$Companion$addOnObserverExternal$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
        /* renamed from: lu.die.foza.SleepyFox.Ϳ$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/Ϳ$Ϳ$Ϳ.class */
        public static final class C0068 implements AbstractC0412 {

            /* renamed from: Ϳ  reason: contains not printable characters */
            public final /* synthetic */ AbstractC0413 f169;

            /* renamed from: Ԩ  reason: contains not printable characters */
            public final /* synthetic */ AbstractC0412 f170;

            public C0068(AbstractC0413 abstractC0413, AbstractC0412 abstractC0412) {
                this.f169 = abstractC0413;
                this.f170 = abstractC0412;
            }

            @Override // lu.die.foza.SleepyFox.AbstractC0412
            /* renamed from: Ϳ */
            public Object mo85(C0253 c0253) {
                this.f169.mo2307(c0253);
                if (this.f169.mo2301()) {
                    return this.f169.mo2303();
                }
                try {
                    this.f169.mo2304(this.f170.mo85(c0253));
                } catch (Throwable th) {
                    this.f169.mo2306(th);
                }
                this.f169.mo2308(c0253);
                Throwable mo2305 = this.f169.mo2305();
                if (mo2305 != null) {
                    throw mo2305;
                }
                return this.f169.mo2303();
            }
        }

        public C0067() {
        }

        @JvmStatic
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m648(@NotNull String str, @NotNull String str2, @NotNull AbstractC0413 abstractC0413) {
            try {
                C0459 m2092 = C0342.f813.m2092(str);
                if (m2092 == null) {
                    return;
                }
                C0033 c0033 = m2092.f1073;
                if (c0033 == null) {
                    return;
                }
                AbstractC0412 m373 = c0033.m373(str2);
                C0202 c0202 = m373;
                if (m373 == null) {
                    C0202.f299.getClass();
                    c0202 = C0202.f300;
                }
                c0033.m374(str2, new C0068(abstractC0413, c0202));
            } catch (Exception unused) {
            }
        }

        public /* synthetic */ C0067(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m638(@NotNull String str, @NotNull String str2, @NotNull AbstractC0413 abstractC0413) {
        f166.m648(str, str2, abstractC0413);
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final AbstractC0412 m640() {
        return this.f168;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean mo645() {
        return false;
    }

    /* renamed from: Ԫ */
    public abstract void mo86();

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m642(@NotNull String str, @NotNull String str2) {
        return C0342.f813.m2095(str, this.f168, str2);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m643(@NotNull String str) {
        return C0342.f813.m2095(str, this.f168, (String) null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m647() {
        if (mo645()) {
            C0115.f182.getClass();
            if (C0115.f183) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m644(@NotNull String... strArr) {
        for (String str : strArr) {
            m643(str);
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0033 m646(@NotNull String str, @NotNull IInterface iInterface) {
        return C0342.f813.m2094(str, this.f168, iInterface);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m641(@NotNull AbstractC0412 abstractC0412) {
        this.f168 = abstractC0412;
    }
}
