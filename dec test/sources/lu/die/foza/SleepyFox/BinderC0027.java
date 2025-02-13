package lu.die.foza.SleepyFox;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.List;
import lu.die.foza.SleepyFox.AbstractC0407;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ʻ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʻ.class */
public final class BinderC0027 extends AbstractC0407.AbstractBinderC0409 {
    @NotNull

    /* renamed from: ޜ  reason: contains not printable characters */
    public static final BinderC0027 f89 = new BinderC0027();

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public PackageInfo mo327(@Nullable String str, int i) {
        return C0325.f765.m1989(str, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: ԭ  reason: contains not printable characters */
    public int mo339(@Nullable String str) {
        return C0325.f765.m2002(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ԫ  reason: contains not printable characters */
    public void mo342(@NotNull String str, @NotNull String str2) {
        C0325.f765.m2000(str, str2);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @NotNull
    /* renamed from: ՠ  reason: contains not printable characters */
    public String mo343(@Nullable String str) {
        C0325.f765.m1994(str);
        return "OK.";
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: ֈ  reason: contains not printable characters */
    public int mo346(@NotNull String str) {
        return C0325.f765.m1993(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ԭ  reason: contains not printable characters */
    public void mo348(@Nullable String str) {
        C0325.f765.m1995(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo349() {
        C0325.f765.m1996();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: ԯ  reason: contains not printable characters */
    public ProviderInfo mo350(@Nullable String str) {
        return C0325.f765.m2006(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo354(@Nullable ComponentName componentName) {
        return C0325.f765.m2009(componentName) ? 1 : 0;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @NotNull
    /* renamed from: ԫ  reason: contains not printable characters */
    public String mo357(@NotNull String str, @NotNull String str2) {
        return C0325.f765.m2011(str, str2);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @NotNull
    /* renamed from: Ԯ  reason: contains not printable characters */
    public String[] mo358(@NotNull String str) {
        return C0325.f765.m2012(str);
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public final void m323() {
        C0325.f765.m1990();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public ServiceInfo mo328(@Nullable ComponentName componentName, int i) {
        return C0325.f765.m1984(componentName, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public ActivityInfo mo329(@Nullable ComponentName componentName, int i) {
        return C0325.f765.m1986(componentName, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public List<PackageInfo> mo338(int i) {
        return i != -1 ? C0325.f765.m1978(false, i) : C0325.m1938(C0325.f765, false, 0, 3, (Object) null);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: ԫ  reason: contains not printable characters */
    public int mo340(@Nullable String str) {
        return C0325.f765.m2003(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: ԯ  reason: contains not printable characters */
    public void mo347() {
        C0325.f765.m1975();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ԩ  reason: contains not printable characters */
    public boolean mo352(@Nullable String str) {
        return C0350.f826.m2149(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public List<ResolveInfo> mo333(@Nullable Intent intent, @Nullable String str, int i) {
        return C0325.f765.m1980(intent, str, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: ԩ  reason: contains not printable characters */
    public boolean mo345(@Nullable String str) {
        return C0325.f765.m1992(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public List<String> mo351(@Nullable String str, long j) {
        return str == null ? new ArrayList() : C0325.f765.m2007(str, (int) (j & 4294967295L), (int) ((j & (-4294967296L)) >> 32));
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: ԫ  reason: contains not printable characters */
    public void mo355(@Nullable ComponentName componentName, int i) {
        C0325.f765.m2008(componentName, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo359(@NotNull String str, @NotNull String str2) {
        C0325.f765.m2013(str, str2);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public ApplicationInfo mo330(@Nullable String str, int i) {
        return C0325.f765.m1988(str, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public ProviderInfo mo331(@Nullable ComponentName componentName, int i) {
        return C0325.f765.m1985(componentName, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public List<ResolveInfo> mo335(@Nullable Intent intent, @Nullable String str, int i) {
        return C0325.f765.m1982(intent, str, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public ActivityInfo mo332(@Nullable ComponentName componentName, int i) {
        return C0325.f765.m1987(componentName, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo341(@Nullable String str, boolean z) {
        return C0325.f765.m2001(str, z);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public List<ResolveInfo> mo334(@Nullable Intent intent, @Nullable String str, int i) {
        return C0325.f765.m1983(intent, str, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean mo344(@Nullable String str) {
        return C0325.f765.m1991(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo353(int i) {
        if (i == 0) {
            C0350.f826.m2148();
        } else if (i != 1) {
        } else {
            C0350.f826.getClass();
            C0350.f827.clear();
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public List<ProviderInfo> mo356(@Nullable String str, int i, @Nullable String str2) {
        return C0325.f765.m2010(str, i, str2);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public List<ResolveInfo> mo336(@Nullable Intent intent, @Nullable String str, int i) {
        return C0325.f765.m1981(intent, str, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public ActivityInfo mo324(@Nullable Intent intent) {
        return C0325.f765.m2004(intent);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public ProviderInfo mo337(@Nullable String str, int i) {
        return C0325.f765.m1979(str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public ServiceInfo mo325(@Nullable Intent intent) {
        return C0325.f765.m2005(intent);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0407
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo326() {
        C0325.f765.m1976();
    }
}
