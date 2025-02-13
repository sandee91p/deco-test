package lu.die.foza.SleepyFox;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0248;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࣃ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣃ.class */
public final class C0332 {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0333 f789 = new C0333();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0332 f790 = new C0332();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String f791 = "content://sms/";

    /* renamed from: lu.die.foza.SleepyFox.ࣃ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣃ$Ϳ.class */
    public static final class C0333 {
        public C0333() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0332 m2048() {
            return C0332.f790;
        }

        public /* synthetic */ C0333(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2047(@Nullable Uri uri, @Nullable Bundle bundle) {
        try {
            C0248.C0249 c0249 = C0248.f515;
            c0249.getClass();
            C0248.f516.getClass();
            if (uri == null) {
                return;
            }
            if (Intrinsics.areEqual(uri, ContactsContract.Contacts.CONTENT_URI)) {
                c0249.getClass();
                C0248 c0248 = C0248.f516;
                if (bundle != null) {
                    bundle.toString();
                }
                c0248.getClass();
            }
            if (!StringsKt.startsWith$default(uri.toString(), this.f791, false, 2, (Object) null)) {
                return;
            }
            c0249.getClass();
            C0248 c02482 = C0248.f516;
            if (bundle != null) {
                bundle.toString();
            }
            c02482.getClass();
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ void m2044(C0332 c0332, Uri uri, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        c0332.m2047(uri, bundle);
    }
}
