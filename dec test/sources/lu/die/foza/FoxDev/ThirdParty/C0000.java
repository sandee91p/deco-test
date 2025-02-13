package lu.die.foza.FoxDev.ThirdParty;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.FoxDev.ThirdParty.FozaReflectionEnjoyHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Unsafe;
@RequiresApi(api = 26)
@SuppressLint({"DiscouragedPrivateApi"})
@SourceDebugExtension({"SMAP\nFozaReflectionTaunt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaReflectionTaunt.kt\nlu/die/foza/FoxDev/ThirdParty/FozaReflectionTaunt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
/* renamed from: lu.die.foza.FoxDev.ThirdParty.Ϳ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/Ϳ.class */
public final class C0000 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0000 f2 = new C0000();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Unsafe f3;

    /* renamed from: ԩ  reason: contains not printable characters */
    public static long f4;

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static long f5;

    /* renamed from: ԫ  reason: contains not printable characters */
    public static long f6;

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static long f7;

    /* renamed from: ԭ  reason: contains not printable characters */
    public static long f8;

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static long f9;

    /* renamed from: ԯ  reason: contains not printable characters */
    public static long f10;

    /* renamed from: ՠ  reason: contains not printable characters */
    public static long f11;

    /* renamed from: ֈ  reason: contains not printable characters */
    public static long f12;

    /* renamed from: ֏  reason: contains not printable characters */
    public static long f13;

    /* renamed from: ׯ  reason: contains not printable characters */
    public static long f14;

    /* renamed from: ؠ  reason: contains not printable characters */
    public static long f15;
    @Nullable

    /* renamed from: ހ  reason: contains not printable characters */
    public static Method f16;

    /* renamed from: ށ  reason: contains not printable characters */
    public static Object f17;

    static {
        Object invoke = Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type sun.misc.Unsafe");
        Unsafe unsafe = (Unsafe) invoke;
        f4 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.Executable.class.getDeclaredField("artMethod"));
        f5 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.Executable.class.getDeclaredField("declaringClass"));
        f6 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.MethodHandle.class.getDeclaredField("artFieldOrMethod"));
        f7 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.MethodHandleImpl.class.getDeclaredField("info"));
        f8 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.Class.class.getDeclaredField("methods"));
        f9 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.Class.class.getDeclaredField("iFields"));
        f10 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.Class.class.getDeclaredField("sFields"));
        f11 = unsafe.objectFieldOffset(FozaReflectionEnjoyHelper.HandleInfo.class.getDeclaredField("member"));
        Method declaredMethod = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredMethod("a", new Class[0]);
        Method declaredMethod2 = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredMethod("b", new Class[0]);
        declaredMethod.setAccessible(true);
        declaredMethod2.setAccessible(true);
        MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
        MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
        long j = unsafe.getLong(unreflect, f6);
        long j2 = unsafe.getLong(unreflect2, f6);
        long j3 = unsafe.getLong(FozaReflectionEnjoyHelper.NeverCall.class, f8);
        long j4 = j2 - j;
        f12 = j4;
        f13 = (j - j3) - j4;
        Field declaredField = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredField("i");
        Field declaredField2 = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredField("j");
        declaredField.setAccessible(true);
        declaredField2.setAccessible(true);
        MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
        MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
        long j5 = unsafe.getLong(unreflectGetter, f6);
        long j6 = unsafe.getLong(unreflectGetter2, f6);
        long j7 = unsafe.getLong(FozaReflectionEnjoyHelper.NeverCall.class, f9);
        f14 = j6 - j5;
        f15 = j5 - j7;
        f3 = unsafe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List<java.lang.reflect.Field>] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final List<Field> m12(@NotNull Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (cls.isPrimitive() || cls.isArray()) {
            return arrayList;
        }
        ?? r0 = this;
        synchronized (r0) {
            try {
                Field declaredField = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredField("i");
                declaredField.setAccessible(true);
                MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f3;
                long j = unsafe.getLong(cls, f9);
                if (j == 0) {
                    return arrayList;
                }
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    long j2 = (i2 * f14) + j + f15;
                    Unsafe unsafe2 = f3;
                    unsafe2.putLong(unreflectGetter, f6, j2);
                    unsafe2.putObject(unreflectGetter, f7, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f3;
                    Object object = unsafe3.getObject(unreflectGetter, f7);
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.lang.invoke.MethodHandleInfo");
                    Object object2 = unsafe3.getObject((MethodHandleInfo) object, f11);
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.lang.reflect.Field");
                    arrayList.add((Field) object2);
                }
                r0 = arrayList;
                Unit unit = Unit.INSTANCE;
                return r0;
            } catch (IllegalAccessException unused2) {
                return arrayList;
            } catch (NoSuchFieldException unused3) {
                return arrayList;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List<java.lang.reflect.Field>] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final List<Field> m13(@NotNull Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (cls.isPrimitive() || cls.isArray()) {
            return arrayList;
        }
        ?? r0 = this;
        synchronized (r0) {
            try {
                Field declaredField = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredField("s");
                declaredField.setAccessible(true);
                MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f3;
                long j = unsafe.getLong(cls, f10);
                if (j == 0) {
                    return arrayList;
                }
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    long j2 = (i2 * f14) + j + f15;
                    Unsafe unsafe2 = f3;
                    unsafe2.putLong(unreflectGetter, f6, j2);
                    unsafe2.putObject(unreflectGetter, f7, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f3;
                    Object object = unsafe3.getObject(unreflectGetter, f7);
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.lang.invoke.MethodHandleInfo");
                    Object object2 = unsafe3.getObject((MethodHandleInfo) object, f11);
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.lang.reflect.Field");
                    arrayList.add((Field) object2);
                }
                r0 = arrayList;
                Unit unit = Unit.INSTANCE;
                return r0;
            } catch (IllegalAccessException unused2) {
                return arrayList;
            } catch (NoSuchFieldException unused3) {
                return arrayList;
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m14(@NotNull String... strArr) {
        return m18((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m15(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            if (!clsArr[i].isPrimitive()) {
                Object obj = objArr[i];
                if (obj != null && !clsArr[i].isInstance(obj)) {
                    return false;
                }
            } else if (Intrinsics.areEqual(clsArr[i], Integer.TYPE) && !(objArr[i] instanceof Integer)) {
                return false;
            } else {
                if (Intrinsics.areEqual(clsArr[i], Byte.TYPE) && !(objArr[i] instanceof Byte)) {
                    return false;
                }
                if (Intrinsics.areEqual(clsArr[i], Character.TYPE) && !(objArr[i] instanceof Character)) {
                    return false;
                }
                if (Intrinsics.areEqual(clsArr[i], Boolean.TYPE) && !(objArr[i] instanceof Boolean)) {
                    return false;
                }
                if (Intrinsics.areEqual(clsArr[i], Double.TYPE) && !(objArr[i] instanceof Double)) {
                    return false;
                }
                if (Intrinsics.areEqual(clsArr[i], Float.TYPE) && !(objArr[i] instanceof Float)) {
                    return false;
                }
                if (Intrinsics.areEqual(clsArr[i], Long.TYPE) && !(objArr[i] instanceof Long)) {
                    return false;
                }
                if (Intrinsics.areEqual(clsArr[i], Short.TYPE) && !(objArr[i] instanceof Short)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0072: RETURN  (r0 I:boolean), block:B:26:0x0072 */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m18(String... strArr) {
        boolean z;
        try {
            Method method = f16;
            if (method != null) {
                try {
                    Object obj = f17;
                    Unit unit = obj;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("localRuntime");
                        unit = Unit.INSTANCE;
                    }
                    Object obj2 = unit;
                    Object[] objArr = new Object[1];
                    Intrinsics.checkNotNull(strArr, "null cannot be cast to non-null type kotlin.Any");
                    objArr[0] = strArr;
                    method.invoke(obj2, objArr);
                    return true;
                } catch (Exception unused) {
                }
            }
            Object m9 = m9(VMRuntime.class, null, "getRuntime", new Object[0]);
            Intrinsics.checkNotNull(m9);
            Object[] objArr2 = new Object[1];
            Intrinsics.checkNotNull(strArr, "null cannot be cast to non-null type kotlin.Any");
            objArr2[0] = strArr;
            m9(VMRuntime.class, m9, "setHiddenApiExemptions", objArr2);
            m17(m9);
            return true;
        } catch (Throwable unused2) {
            return z;
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Constructor<?> m11(@NotNull Class<?> cls, @NotNull Class<?>... clsArr) {
        for (Executable executable : m16(cls)) {
            if (executable instanceof Constructor) {
                Constructor<?> constructor = (Constructor) executable;
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    int length = clsArr.length;
                    for (int i = 0; i < length; i++) {
                        if (Intrinsics.areEqual(clsArr[i], parameterTypes[i])) {
                        }
                    }
                    return constructor;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Method m10(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) {
        for (Executable executable : m16(cls)) {
            if (Intrinsics.areEqual(executable.getName(), str) && (executable instanceof Method)) {
                Method method = (Method) executable;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    int length = clsArr.length;
                    for (int i = 0; i < length; i++) {
                        if (Intrinsics.areEqual(clsArr[i], parameterTypes[i])) {
                        }
                    }
                    return method;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List<java.lang.reflect.Executable>] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<Executable> m16(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (cls.isPrimitive() || cls.isArray()) {
            return arrayList;
        }
        ?? r0 = this;
        synchronized (r0) {
            try {
                Method declaredMethod = FozaReflectionEnjoyHelper.NeverCall.class.getDeclaredMethod("a", new Class[0]);
                declaredMethod.setAccessible(true);
                MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
                Unsafe unsafe = f3;
                long j = unsafe.getLong(cls, f8);
                if (j == 0) {
                    return arrayList;
                }
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    long j2 = (i2 * f12) + j + f13;
                    Unsafe unsafe2 = f3;
                    unsafe2.putLong(unreflect, f6, j2);
                    unsafe2.putObject(unreflect, f7, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflect);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f3;
                    Object object = unsafe3.getObject(unreflect, f7);
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.lang.invoke.MethodHandleInfo");
                    Object object2 = unsafe3.getObject((MethodHandleInfo) object, f11);
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.lang.reflect.Executable");
                    arrayList.add((Executable) object2);
                }
                r0 = arrayList;
                Unit unit = Unit.INSTANCE;
                return r0;
            } catch (IllegalAccessException unused2) {
                return arrayList;
            } catch (NoSuchMethodException unused3) {
                return arrayList;
            }
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m9(@NotNull Class<?> cls, @Nullable Object obj, @NotNull String str, @NotNull Object... objArr) {
        if (obj == null || cls.isInstance(obj)) {
            synchronized (this) {
                Class[] clsArr = new Class[1];
                clsArr[0] = Object[].class;
                Method declaredMethod = FozaReflectionEnjoyHelper.InvokeStub.class.getDeclaredMethod("invoke", clsArr);
                declaredMethod.setAccessible(true);
                Unsafe unsafe = f3;
                long j = unsafe.getLong(cls, f8);
                if (j == 0) {
                    throw new NoSuchMethodException("Cannot find matching method");
                }
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    f3.putLong(declaredMethod, f4, (i2 * f12) + j + f13);
                    if (Intrinsics.areEqual(str, declaredMethod.getName())) {
                        if (f2.m15(declaredMethod.getParameterTypes(), objArr)) {
                            return declaredMethod.invoke(obj, objArr);
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                throw new NoSuchMethodException("Cannot find matching method");
            }
        }
        throw new IllegalArgumentException("this object is not an instance of the given class".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m8(@Nullable Class<?> cls, @NotNull Object... objArr) {
        synchronized (this) {
            Class[] clsArr = new Class[1];
            clsArr[0] = Object[].class;
            Method declaredMethod = FozaReflectionEnjoyHelper.InvokeStub.class.getDeclaredMethod("invoke", clsArr);
            Class[] clsArr2 = new Class[1];
            clsArr2[0] = Object[].class;
            Constructor declaredConstructor = FozaReflectionEnjoyHelper.InvokeStub.class.getDeclaredConstructor(clsArr2);
            declaredConstructor.setAccessible(true);
            Unsafe unsafe = f3;
            long j = unsafe.getLong(cls, f8);
            if (j != 0) {
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    long j2 = (i2 * f12) + j + f13;
                    Unsafe unsafe2 = f3;
                    unsafe2.putLong(declaredMethod, f4, j2);
                    if (Intrinsics.areEqual("<init>", declaredMethod.getName())) {
                        unsafe2.putLong(declaredConstructor, f4, j2);
                        unsafe2.putObject(declaredConstructor, f5, cls);
                        if (f2.m15(declaredConstructor.getParameterTypes(), objArr)) {
                            return declaredConstructor.newInstance(Arrays.copyOf(objArr, objArr.length));
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                throw new NoSuchMethodException("Cannot find matching constructor");
            }
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m17(Object obj) {
        try {
            Class[] clsArr = new Class[1];
            clsArr[0] = String[].class;
            Method declaredMethod = VMRuntime.class.getDeclaredMethod("setHiddenApiExemptions", clsArr);
            declaredMethod.setAccessible(true);
            f17 = obj;
            f16 = declaredMethod;
        } catch (Throwable unused) {
        }
    }
}
