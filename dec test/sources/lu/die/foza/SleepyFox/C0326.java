package lu.die.foza.SleepyFox;

import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.FozaStubJobService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢾ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢾ.class */
public final class C0326 extends ClassLoader {
    public C0326(@NotNull ClassLoader classLoader) {
        super(classLoader);
    }

    @Override // java.lang.ClassLoader
    @NotNull
    public Class<?> loadClass(@Nullable String str) {
        try {
            return super.loadClass(str);
        } catch (Exception unused) {
            if (str != null) {
                if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaAnkingProvider", false, 2, (Object) null)) {
                    return FozaAnkingProvider.class;
                }
                if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaStubProvider", false, 2, (Object) null)) {
                    return FozaStubProvider.class;
                }
                if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaStubJobService$Companion$FozaStubJobServiceDang", false, 2, (Object) null)) {
                    return FozaStubJobService.Companion.FozaStubJobServiceDang.class;
                }
                if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaStubProcessGroup", false, 2, (Object) null)) {
                    return FozaStubProcessGroup.class;
                }
                if (StringsKt.startsWith$default(str, "lu.die.foza.SleepyFox.FozaStubActivityGroup", false, 2, (Object) null)) {
                    return FozaStubActivityGroup.class;
                }
            }
            throw new ClassNotFoundException(str);
        }
    }
}
