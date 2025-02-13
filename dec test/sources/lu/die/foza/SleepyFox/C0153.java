package lu.die.foza.SleepyFox;

import android.content.AttributionSource;
import androidx.annotation.RequiresApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0255;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nArgumentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArgumentUtils.kt\nlu/die/foza/FoxDev/ThirdParty/ArgumentUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n37#2,2:131\n1#3:133\n*S KotlinDebug\n*F\n+ 1 ArgumentUtils.kt\nlu/die/foza/FoxDev/ThirdParty/ArgumentUtils\n*L\n30#1:131,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ރ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ރ.class */
public final class C0153 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0153 f201 = new C0153();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m722(@NotNull Object[] objArr, @NotNull Class<?> cls) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (cls.isInstance(objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final int m724(@NotNull Object[] objArr, @NotNull Class<?> cls) {
        if (!(objArr.length == 0)) {
            for (int length = objArr.length - 1; -1 < length; length--) {
                if (cls.isInstance(objArr[length])) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m728(@NotNull Object[] objArr, int i) {
        try {
            Object obj = objArr[i];
            if (obj instanceof Integer) {
                objArr[i] = Integer.valueOf(((Number) obj).intValue() | C0255.C0256.f528);
            } else if (obj instanceof Long) {
                objArr[i] = Long.valueOf(((Number) obj).longValue() | 512);
            }
        } catch (Exception unused) {
        }
    }

    @RequiresApi(31)
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m727(@NotNull Object[] objArr) {
        try {
            int m722 = m722(objArr, AttributionSource.class);
            if (m722 < 0) {
                return;
            }
            Object obj = objArr[m722];
            if (!(obj instanceof AttributionSource)) {
                return;
            }
            objArr[m722] = m730((AttributionSource) obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m721(int i, int i2) {
        return (i & 4294967295L) | ((i2 << 32) & (-4294967296L));
    }

    @RequiresApi(31)
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final AttributionSource m730(AttributionSource attributionSource) {
        C0276.f576.getClass();
        AttributionSource.Builder builder = new AttributionSource.Builder(C0276.f584);
        builder.setPackageName(C0276.f583);
        builder.setAttributionTag(attributionSource.getAttributionTag());
        AttributionSource next = attributionSource.getNext();
        if (next != null) {
            builder.setNext(m730(next));
        }
        return builder.build();
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Class<?>[] m723(@NotNull Class<?> cls) {
        C0164<Class<?>> c0164 = new C0164<>(2, false);
        m729(cls, c0164);
        return (Class[]) c0164.toArray(new Class[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m729(Class<?> cls, C0164<Class<?>> c0164) {
        Class<?>[] interfaces = cls.getInterfaces();
        if (!(interfaces.length == 0)) {
            CollectionsKt.addAll(c0164, interfaces);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (!Intrinsics.areEqual(superclass, Object.class)) {
            f201.m729(superclass, c0164);
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final <T> T m726(@NotNull Object[] objArr, @NotNull Class<T> cls) {
        for (Object obj : objArr) {
            T t = (T) obj;
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m725(@NotNull Class<?>[] clsArr, @NotNull Class<?> cls) {
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(clsArr[i], cls)) {
                return i;
            }
        }
        return -1;
    }
}
