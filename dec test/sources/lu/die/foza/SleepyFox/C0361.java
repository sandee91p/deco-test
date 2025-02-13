package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import lu.die.foza.SleepyFox.C0154;
import lu.die.foza.SleepyFox.C0248;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ൟ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൟ.class */
public final class C0361 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0361 f848 = new C0361();
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static Object f849;
    @Nullable

    /* renamed from: ԩ  reason: contains not printable characters */
    public static Object f850;
    @Nullable

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static Object f851;
    @Nullable

    /* renamed from: ԫ  reason: contains not printable characters */
    public static Object f852;

    /* renamed from: lu.die.foza.SleepyFox.ൟ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ൟ$Ϳ.class */
    public static final class C0362 extends Lambda implements Function0<Object> {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ Method f853;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final /* synthetic */ Object[] f854;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0362(Method method, Object[] objArr) {
            super(0);
            this.f853 = method;
            this.f854 = objArr;
        }

        public final Object invoke() {
            Method method = this.f853;
            Object obj = C0361.f851;
            Object[] objArr = this.f854;
            Object[] objArr2 = objArr;
            if (objArr == null) {
                objArr2 = C0154.C0157.f210;
            }
            Object invoke = method.invoke(obj, objArr2);
            C0248.C0249 c0249 = C0248.f515;
            c0249.getClass();
            C0248.f516.getClass();
            if (invoke instanceof Object[]) {
                c0249.getClass();
                C0248 c0248 = C0248.f516;
                Intrinsics.checkNotNullExpressionValue(Arrays.toString((Object[]) invoke), "toString(...)");
                c0248.getClass();
            }
            return invoke;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2189() {
        String str = "sFactory";
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object m455 = C0047.m455("android.common.HwFrameworkFactory", str);
            objectRef.element = m455;
            if (m455 == null) {
                str = "obj";
                objectRef.element = C0047.m455("android.common.HwFrameworkFactory", str);
            }
            Object obj = objectRef.element;
            if (obj == null) {
                return;
            }
            C0047 c0047 = C0047.f129;
            String str2 = str;
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Class[] clsArr = new Class[1];
            clsArr[0] = Class.forName("android.common.HwFrameworkFactory$Factory");
            c0047.m469("android.common.HwFrameworkFactory", str2, Proxy.newProxyInstance(classLoader, clsArr, (v1, v2, v3) -> {
                return m2186(r4, v1, v2, v3);
            }));
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final Object m2190() {
        if (f850 == null) {
            f850 = Proxy.newProxyInstance(Class.forName("android.common.HwSettingsManager").getClassLoader(), new Class[]{Class.forName("android.common.HwSettingsManager")}, C0361::m2184);
        }
        return f850;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ԩ  reason: contains not printable characters */
    public final Object m2191() {
        if (f852 == null) {
            f852 = Proxy.newProxyInstance(Class.forName("android.common.IHwApiCacheManagerEx").getClassLoader(), new Class[]{Class.forName("android.common.IHwApiCacheManagerEx")}, C0361::m2185);
        }
        return f852;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Object m2184(Object obj, Method method, Object[] objArr) {
        Boolean invoke;
        if (Intrinsics.areEqual("checkPrimaryVolumeIsSD", method.getName())) {
            invoke = Boolean.FALSE;
        } else {
            Object obj2 = f849;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            invoke = method.invoke(obj2, objArr);
        }
        return invoke;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Object m2186(Ref.ObjectRef objectRef, Object obj, Method method, Object[] objArr) {
        Object invoke;
        String name = method.getName();
        if (Intrinsics.areEqual(name, "getHwSettingsManager")) {
            Object obj2 = objectRef.element;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            f849 = method.invoke(obj2, objArr);
            invoke = f848.m2190();
        } else if (Intrinsics.areEqual(name, "getHwApiCacheManagerEx")) {
            Object obj3 = objectRef.element;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            f851 = method.invoke(obj3, objArr);
            invoke = f848.m2191();
        } else {
            Object obj4 = objectRef.element;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            invoke = method.invoke(obj4, objArr);
        }
        return invoke;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Object m2185(Object obj, Method method, Object[] objArr) {
        Object invoke;
        if (!Intrinsics.areEqual("getVolumeList", method.getName())) {
            Object obj2 = f851;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            return method.invoke(obj2, objArr);
        }
        if (!C0276.f576.m1708()) {
            Object obj3 = f851;
            if (objArr == null) {
                objArr = C0154.C0157.f210;
            }
            invoke = method.invoke(obj3, objArr);
        } else {
            C0303.f721.getClass();
            invoke = C0303.f722.invoke(new C0362(method, objArr));
        }
        return invoke;
    }
}
