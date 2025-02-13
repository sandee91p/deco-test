package lu.die.foza.SleepyFox;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢳ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢳ.class */
public final class C0309 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0309 f727 = new C0309();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static boolean f728;

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m1843(@NotNull String str) {
        return SetsKt.hashSetOf(new String[]{"com.google.android.gsf", "com.google.android.gms", "com.android.vending", "com.google.android.play.games", "com.google.android.wearable.app", "com.google.android.wearable.app.cn", "com.google.android.gsf.login", "com.google.android.backuptransport", "com.google.android.backup", "com.google.android.configupdater", "com.google.android.syncadapters.contacts", "com.google.android.feedback", "com.google.android.onetimeinitializer", "com.google.android.partnersetup", "com.google.android.setupwizard", "com.google.android.syncadapters.calendar"}).contains(str);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m1845(@Nullable String str) {
        return Intrinsics.areEqual(str, "com.android.vending.licensing.ILicensingService") || Intrinsics.areEqual(str, "com.android.vending.billing.InAppBillingService.BIND");
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1846(@Nullable String str) {
        int hashCode;
        return str != null && ((hashCode = str.hashCode()) == -1046965711 ? str.equals("com.android.vending") : hashCode == 325967270 ? str.equals("com.google.android.gms") : hashCode == 325967443 && str.equals("com.google.android.gsf"));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1847(@NotNull String str) {
        return f728 || !m1846(str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1844() {
        return f728;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1842(boolean z) {
        f728 = z;
    }
}
