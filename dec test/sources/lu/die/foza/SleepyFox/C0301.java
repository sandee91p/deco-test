package lu.die.foza.SleepyFox;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢯ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢯ.class */
public class C0301 extends C0277 {
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final C0302 f718;
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final C0301 f719 = new C0301();
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final C0024<Object> f720;

    @SourceDebugExtension({"SMAP\nFozaEnhancedAutoProcessObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaEnhancedAutoProcessObserver.kt\nlu/die/foza/HookEntity/BaseEntity/FozaEnhancedAutoProcessObserver$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n13309#2,2:87\n1#3:89\n*S KotlinDebug\n*F\n+ 1 FozaEnhancedAutoProcessObserver.kt\nlu/die/foza/HookEntity/BaseEntity/FozaEnhancedAutoProcessObserver$Companion\n*L\n17#1:87,2\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ࢯ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢯ$Ϳ.class */
    public static final class C0302 {
        public C0302() {
        }

        public /* synthetic */ C0302(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final C0301 m1823() {
            return C0301.f719;
        }

        @Nullable
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Object m1824(@NotNull Class<?> cls) {
            if (!Intrinsics.areEqual(cls, Void.TYPE)) {
                Object m302 = C0024.m302(C0301.f720, cls.hashCode(), null, 2, null);
                if (m302 != null) {
                    return m302;
                }
                if (!cls.isArray()) {
                    if (!List.class.isAssignableFrom(cls)) {
                        return null;
                    }
                    return CollectionsKt.emptyList();
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType == null) {
                    return null;
                }
                return Array.newInstance(componentType, 0);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final <K extends Class<?>, V> C0024<V> m1825(Pair<? extends K, ? extends V>... pairArr) {
            C0024<V> c0024 = (C0024<V>) new C0024(pairArr.length);
            for (Pair<? extends K, ? extends V> pair : pairArr) {
                c0024.m309(pair.getFirst().hashCode(), pair.getSecond());
            }
            return c0024;
        }
    }

    static {
        C0302 c0302 = new C0302();
        f718 = c0302;
        Boolean bool = Boolean.FALSE;
        C0495 c0495 = C0495.f1089;
        c0495.getClass();
        c0495.getClass();
        f720 = c0302.m1825(TuplesKt.to(Integer.class, 0), TuplesKt.to(Integer.TYPE, 0), TuplesKt.to(Boolean.class, bool), TuplesKt.to(Boolean.TYPE, bool), TuplesKt.to(Double.class, Double.valueOf(0.0d)), TuplesKt.to(Double.TYPE, Double.valueOf(0.0d)), TuplesKt.to(Float.class, Float.valueOf(0.0f)), TuplesKt.to(Float.TYPE, Float.valueOf(0.0f)), TuplesKt.to(Long.class, 0L), TuplesKt.to(Long.TYPE, 0L), TuplesKt.to(Byte.class, (byte) 0), TuplesKt.to(Byte.TYPE, (byte) 0), TuplesKt.to(Short.class, (short) 0), TuplesKt.to(Short.TYPE, (short) 0), TuplesKt.to(Character.class, '0'), TuplesKt.to(Character.TYPE, '0'), TuplesKt.to(String.class, "0"), TuplesKt.to(CharSequence.class, "0"), TuplesKt.to(ParceledListSlice.class, C0495.f1091));
    }

    @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
    @Nullable
    /* renamed from: Ϳ */
    public Object mo85(@NotNull C0253 c0253) {
        Object m1824;
        try {
            m1824 = super.mo85(c0253);
        } catch (Exception unused) {
            m1824 = f718.m1824(c0253.f518.getReturnType());
        }
        return m1824;
    }
}
