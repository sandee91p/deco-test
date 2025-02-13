package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Service;
import android.content.ContentProvider;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.FozaStubJobService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\b\u0007\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Llu/die/foza/SleepyFox/FozaAppComponentFactory;", "Landroid/app/AppComponentFactory;", "<init>", "()V", "instantiateActivity", "Landroid/app/Activity;", "cl", "Ljava/lang/ClassLoader;", "className", C0019.f56, "intent", "Landroid/content/Intent;", "instantiateService", "Landroid/app/Service;", "instantiateProvider", "Landroid/content/ContentProvider;", "foza_release"})
@SuppressLint({"NewApi"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAppComponentFactory.class */
public final class FozaAppComponentFactory extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    @NotNull
    public Activity instantiateActivity(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Intent intent) {
        FozaStubActivityGroup fozaStubActivityGroup;
        try {
            fozaStubActivityGroup = super.instantiateActivity(classLoader, str, intent);
        } catch (ClassNotFoundException unused) {
            fozaStubActivityGroup = r0;
            FozaStubActivityGroup fozaStubActivityGroup2 = new FozaStubActivityGroup();
        }
        return fozaStubActivityGroup;
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public Service instantiateService(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Intent intent) {
        FozaStubJobService.Companion.FozaStubJobServiceDang fozaStubJobServiceDang;
        try {
            fozaStubJobServiceDang = super.instantiateService(classLoader, str, intent);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaStubJobService$Companion$FozaStubJobServiceDang", false, 2, (Object) null)) {
                fozaStubJobServiceDang = r0;
                FozaStubJobService.Companion.FozaStubJobServiceDang fozaStubJobServiceDang2 = new FozaStubJobService.Companion.FozaStubJobServiceDang();
            } else {
                fozaStubJobServiceDang = r0;
                FozaStubProcessGroup fozaStubProcessGroup = new FozaStubProcessGroup();
            }
        }
        return fozaStubJobServiceDang;
    }

    @Override // android.app.AppComponentFactory
    @NotNull
    public ContentProvider instantiateProvider(@NotNull ClassLoader classLoader, @NotNull String str) {
        FozaAnkingProvider fozaAnkingProvider;
        try {
            fozaAnkingProvider = super.instantiateProvider(classLoader, str);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaAnkingProvider", false, 2, (Object) null)) {
                fozaAnkingProvider = r0;
                FozaAnkingProvider fozaAnkingProvider2 = new FozaAnkingProvider();
            } else {
                fozaAnkingProvider = r0;
                FozaStubProvider fozaStubProvider = new FozaStubProvider();
            }
        }
        return fozaAnkingProvider;
    }
}
