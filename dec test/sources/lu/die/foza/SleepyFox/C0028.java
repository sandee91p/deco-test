package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.ContentResolver;
import android.provider.Settings;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
@SourceDebugExtension({"SMAP\nStaticProviderObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticProviderObserver.kt\nlu/die/foza/HookEntity/SampleHookEntity/StaticProviderObserver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,162:1\n13309#2,2:163\n*S KotlinDebug\n*F\n+ 1 StaticProviderObserver.kt\nlu/die/foza/HookEntity/SampleHookEntity/StaticProviderObserver\n*L\n128#1:163,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ʼ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʼ.class */
public final class C0028 extends AbstractC0066 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0343<Set<String>> f90 = new C0343<>("mAllFields");
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final C0343<Map<String, Integer>> f91 = new C0343<>("mReadableFieldsWithMaxTargetSdk");

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00f8 -> B:20:0x0133). Please submit an issue!!! */
    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        Constructor<?> constructor;
        Class<?>[] declaredClasses;
        try {
            C0276.f576.getClass();
            ContentResolver contentResolver = C0321.m1885().getContentResolver();
            if (new C0360(3).m2181()) {
                Class<?> cls = Class.forName(ActivityThread.class.getName() + "$ProviderKey");
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = String.class;
                clsArr[1] = Integer.TYPE;
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
                constructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } else {
                constructor = Object.class.getConstructor(new Class[0]);
            }
            Settings.Global.getInt(contentResolver, "adb_enabled", 0);
            Settings.System.getInt(contentResolver, "screen_off_timeout", 0);
            Settings.Secure.getInt(contentResolver, "tts_default_rate", 0);
            if (C0175.f271) {
                try {
                    Class<?> cls2 = Class.forName(Settings.class.getName() + "$Config");
                    if (C0175.f274) {
                        C0047 c0047 = C0047.f129;
                        Object m467 = c0047.m467(cls2, "sNameValueCache");
                        if (m467 != null) {
                            Class<?>[] clsArr2 = new Class[3];
                            clsArr2[0] = ContentResolver.class;
                            clsArr2[1] = String.class;
                            clsArr2[2] = Integer.TYPE;
                            Object[] objArr = new Object[3];
                            objArr[0] = contentResolver;
                            objArr[1] = "fuck";
                            C0276.f576.getClass();
                            objArr[2] = Integer.valueOf(C0276.f585);
                            c0047.m462(m467, "getStringForUser", clsArr2, objArr);
                        }
                    } else {
                        Class<?>[] clsArr3 = new Class[2];
                        clsArr3[0] = ContentResolver.class;
                        clsArr3[1] = String.class;
                        Method declaredMethod = cls2.getDeclaredMethod("getString", clsArr3);
                        declaredMethod.setAccessible(true);
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = contentResolver;
                        objArr2[1] = "fuck";
                        declaredMethod.invoke(null, objArr2);
                    }
                } catch (Exception unused) {
                }
            }
            C0343 c0343 = new C0343("mContentProvider");
            for (Class<?> cls3 : Settings.class.getDeclaredClasses()) {
                try {
                    Object m4672 = C0047.f129.m467(cls3, "sProviderHolder");
                    if (m4672 != null) {
                        if (C0175.f272) {
                            m360(cls3);
                        }
                        C0033 m2260 = C0374.f879.m2260(c0343.m2103(m4672));
                        c0343.m2104(m4672, m2260 != null ? m2260.f100 : null);
                    }
                } catch (Exception unused2) {
                }
            }
            Constructor<?> constructor2 = constructor;
            C0222.f333.getClass();
            Map<? extends Object, ? extends Object> map = C0222.f336;
            Object[] objArr3 = new Object[2];
            objArr3[0] = "settings";
            C0276.f576.getClass();
            objArr3[1] = Integer.valueOf(C0276.f585);
            TypeIntrinsics.asMutableMap(map).remove(constructor2.newInstance(objArr3));
        } catch (Exception unused3) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m360(Class<?> cls) {
        try {
            Object m467 = C0047.f129.m467(cls, "sNameValueCache");
            if (m467 == null) {
                return;
            }
            Set<String> m2103 = this.f90.m2103(m467);
            if (m2103 != null) {
                m2103.clear();
            }
            Map<String, Integer> m21032 = this.f91.m2103(m467);
            if (m21032 == null) {
                return;
            }
            m21032.clear();
        } catch (Exception unused) {
        }
    }
}
