package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SuppressLint({"NewApi"})
/* renamed from: lu.die.foza.SleepyFox.ࢥ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢥ.class */
public final class AppComponentFactoryC0274 extends AppComponentFactory {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0275 f574 = new C0275();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final AppComponentFactory f575;

    /* renamed from: lu.die.foza.SleepyFox.ࢥ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢥ$Ϳ.class */
    public static final class C0275 {
        public C0275() {
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final void m1700() {
            try {
                C0226.f423.getClass();
                Object m2103 = C0226.f426.m2103(C0276.m1701());
                if (m2103 == null) {
                    return;
                }
                C0343 c0343 = new C0343("mAppComponentFactory");
                AppComponentFactory appComponentFactory = (AppComponentFactory) c0343.m2103(m2103);
                if (appComponentFactory == null || (appComponentFactory instanceof AppComponentFactoryC0274)) {
                    return;
                }
                Unit unit = Unit.INSTANCE;
                c0343.m2104(m2103, new AppComponentFactoryC0274(appComponentFactory));
            } catch (Exception unused) {
            }
        }

        public /* synthetic */ C0275(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppComponentFactoryC0274(@NotNull AppComponentFactory appComponentFactory) {
        this.f575 = appComponentFactory;
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public ClassLoader instantiateClassLoader(@NotNull ClassLoader classLoader, @NotNull ApplicationInfo applicationInfo) {
        return this.f575.instantiateClassLoader(classLoader, applicationInfo);
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public Application instantiateApplication(@NotNull ClassLoader classLoader, @NotNull String str) {
        return this.f575.instantiateApplication(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public Activity instantiateActivity(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Intent intent) {
        return this.f575.instantiateActivity(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public ContentProvider instantiateProvider(@NotNull ClassLoader classLoader, @NotNull String str) {
        return this.f575.instantiateProvider(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public BroadcastReceiver instantiateReceiver(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Intent intent) {
        try {
            return this.f575.instantiateReceiver(classLoader, str, intent);
        } catch (ClassNotFoundException unused) {
            return super.instantiateReceiver(ActivityThread.currentApplication().getClassLoader(), str, intent);
        }
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public Service instantiateService(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Intent intent) {
        try {
            return this.f575.instantiateService(classLoader, str, intent);
        } catch (ClassNotFoundException unused) {
            return super.instantiateService(ActivityThread.currentApplication().getClassLoader(), str, intent);
        }
    }
}
