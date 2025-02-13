package lu.die.foza.FoxDev.ThirdParty;

import androidx.annotation.Keep;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodType;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.C0019;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper.class */
public final class FozaReflectionEnjoyHelper {

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\b\u0016\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083D¢\u0006\u0002\n��¨\u0006\u0006"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$AccessibleObject;", C0019.f56, "<init>", "()V", "override", C0019.f56, "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$AccessibleObject.class */
    public static class AccessibleObject {
        @Keep
        private final boolean override;
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\n\n\u0002\b\u0002\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0016\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002X\u0083\u0004¢\u0006\u0002\n��R\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0010\u0010\u0011\u001a\u00020\u00128\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0013\u001a\u00020\u00128\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0014\u001a\u00020\u00128\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0015\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0017\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0018\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0019\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u001a\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u001b\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u001c\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u001d\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u001e\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u001f\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010 \u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010!\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\"\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010#\u001a\u00020$8\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010%\u001a\u00020$8\u0002X\u0083D¢\u0006\u0002\n��¨\u0006&"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$Class;", C0019.f56, "<init>", "()V", "classLoader", "Ljava/lang/ClassLoader;", "componentType", "Ljava/lang/Class;", "dexCache", "extData", "ifTable", C0019.f56, "[Ljava/lang/Object;", "name", C0019.f56, "superClass", "vtable", "iFields", C0019.f56, "methods", "sFields", "accessFlags", C0019.f56, "classFlags", "classSize", "clinitThreadId", "dexClassDefIndex", "dexTypeIndex", "numReferenceInstanceFields", "numReferenceStaticFields", "objectSize", "objectSizeAllocFastPath", "primitiveType", "referenceInstanceOffsets", "status", "copiedMethodsOffset", C0019.f56, "virtualMethodsOffset", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$Class.class */
    public static final class Class {
        @Keep
        @Nullable
        private final transient ClassLoader classLoader;
        @Keep
        @Nullable
        private final transient java.lang.Class<?> componentType;
        @Keep
        @Nullable
        private final transient Object dexCache;
        @Keep
        @Nullable
        private final transient Object extData;
        @Keep
        @Nullable
        private final transient Object[] ifTable;
        @Keep
        @Nullable
        private final transient String name;
        @Keep
        @Nullable
        private final transient java.lang.Class<?> superClass;
        @Keep
        @Nullable
        private final transient Object vtable;
        @Keep
        private final transient long iFields;
        @Keep
        private final transient long methods;
        @Keep
        private final transient long sFields;
        @Keep
        private final transient int accessFlags;
        @Keep
        private final transient int classFlags;
        @Keep
        private final transient int classSize;
        @Keep
        private final transient int clinitThreadId;
        @Keep
        private final transient int dexClassDefIndex;
        @Keep
        private final transient int dexTypeIndex;
        @Keep
        private final transient int numReferenceInstanceFields;
        @Keep
        private final transient int numReferenceStaticFields;
        @Keep
        private final transient int objectSize;
        @Keep
        private final transient int objectSizeAllocFastPath;
        @Keep
        private final transient int primitiveType;
        @Keep
        private final transient int referenceInstanceOffsets;
        @Keep
        private final transient int status;
        @Keep
        private final transient short copiedMethodsOffset;
        @Keep
        private final transient short virtualMethodsOffset;
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010\b\n��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0083D¢\u0006\u0002\n��¨\u0006\u000f"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$Executable;", "Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$AccessibleObject;", "<init>", "()V", "declaringClass", "Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$Class;", "declaringClassOfOverriddenMethod", "parameters", C0019.f56, C0019.f56, "[Ljava/lang/Object;", "artMethod", C0019.f56, "accessFlags", C0019.f56, "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$Executable.class */
    public static final class Executable extends AccessibleObject {
        @Keep
        @Nullable
        private final Class declaringClass;
        @Keep
        @Nullable
        private final Class declaringClassOfOverriddenMethod;
        @Keep
        @Nullable
        private final Object[] parameters;
        @Keep
        private final long artMethod;
        @Keep
        private final int accessFlags;
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n��¨\u0006\b"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$HandleInfo;", C0019.f56, "<init>", "()V", "member", "Ljava/lang/reflect/Member;", "handle", "Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$MethodHandle;", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$HandleInfo.class */
    public static final class HandleInfo {
        @Keep
        @Nullable
        private final Member member;
        @Keep
        @Nullable
        private final MethodHandle handle;
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018�� \u00062\u00020\u0001:\u0001\u0006B\u001d\b\u0002\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$InvokeStub;", C0019.f56, "args", C0019.f56, "<init>", "([Ljava/lang/Object;)V", "Companion", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$InvokeStub.class */
    public static final class InvokeStub {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final Companion f0 = new Companion();

        @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0083\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$InvokeStub$Companion;", C0019.f56, "<init>", "()V", "invoke", "args", C0019.f56, "([Ljava/lang/Object;)Ljava/lang/Object;", "foza_release"})
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$InvokeStub$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            @JvmStatic
            @Keep
            public final Object invoke(Object... objArr) {
                throw new IllegalStateException("Failed to invoke the method");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public InvokeStub(Object... objArr) {
            throw new IllegalStateException("Failed to new a instance");
        }

        @JvmStatic
        @Keep
        private static final Object invoke(Object... objArr) {
            return f0.invoke(objArr);
        }
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��$\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0012\u0010\u0007\u001a\u0004\u0018\u00010��8\u0002X\u0083\u0004¢\u0006\u0002\n��R\u0016\u0010\b\u001a\u00020\t8\u0004X\u0085D¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\r8\u0004X\u0085D¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$MethodHandle;", C0019.f56, "<init>", "()V", "type", "Ljava/lang/invoke/MethodType;", "nominalType", "cachedSpreadInvoker", "handleKind", C0019.f56, "getHandleKind", "()I", "artFieldOrMethod", C0019.f56, "getArtFieldOrMethod", "()J", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$MethodHandle.class */
    public static class MethodHandle {
        @Keep
        @Nullable
        private final MethodType type;
        @Keep
        @Nullable
        private final MethodType nominalType;
        @Keep
        @Nullable
        private final MethodHandle cachedSpreadInvoker;
        @Keep
        private final int handleKind;
        @Keep
        private final long artFieldOrMethod;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final int m2() {
            return this.handleKind;
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final long m3() {
            return this.artFieldOrMethod;
        }
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n��¨\u0006\u0006"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$MethodHandleImpl;", "Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$MethodHandle;", "<init>", "()V", "info", "Ljava/lang/invoke/MethodHandleInfo;", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$MethodHandleImpl.class */
    public static final class MethodHandleImpl extends MethodHandle {
        @Keep
        @Nullable
        private final MethodHandleInfo info;
    }

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018�� \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083D¢\u0006\u0002\n��R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083D¢\u0006\u0002\n��¨\u0006\b"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$NeverCall;", C0019.f56, "<init>", "()V", "i", C0019.f56, "j", "Companion", "foza_release"})
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$NeverCall.class */
    public static final class NeverCall {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final Companion f1 = new Companion();
        @Keep
        @JvmField
        public static int s;
        @Keep
        @JvmField
        public static int t;
        @Keep
        private final int i;
        @Keep
        private final int j;

        @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\u001c\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0003R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n��R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n��¨\u0006\n"}, d2 = {"Llu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$NeverCall$Companion;", C0019.f56, "<init>", "()V", "a", C0019.f56, "b", "s", C0019.f56, "t", "foza_release"})
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/FoxDev/ThirdParty/FozaReflectionEnjoyHelper$NeverCall$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            @JvmStatic
            @Keep
            public final void a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            @JvmStatic
            @Keep
            public final void b() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @JvmStatic
        @Keep
        private static final void a() {
            f1.a();
        }

        @JvmStatic
        @Keep
        private static final void b() {
            f1.b();
        }
    }
}
