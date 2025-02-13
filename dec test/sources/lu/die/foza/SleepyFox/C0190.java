package lu.die.foza.SleepyFox;

import android.content.ClipData;
import android.content.IClipboardManagerExt;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0248;
import org.jetbrains.annotations.NotNull;
import system.ext.loader.core.ExtCreator;
import system.ext.loader.core.ExtRegistry;
/* renamed from: lu.die.foza.SleepyFox.ޕ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޕ.class */
public final class C0190 extends AbstractC0066 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0191 f296 = new C0191();

    /* renamed from: lu.die.foza.SleepyFox.ޕ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޕ$Ϳ.class */
    public static final class C0191 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            C0248 c0248;
            C0301.f718.getClass();
            Object mo85 = C0301.f719.mo85(c0253);
            C0248.C0249 c0249 = C0248.f515;
            c0249.getClass();
            C0248.f516.getClass();
            if (mo85 instanceof ClipData) {
                c0249.getClass();
                c0248 = C0248.f516;
                ((ClipData) mo85).toString();
            } else {
                ClipData clipData = (ClipData) C0153.f201.m726(c0253.f519, ClipData.class);
                if (clipData != null) {
                    c0249.getClass();
                    c0248 = C0248.f516;
                    clipData.toString();
                }
                return mo85;
            }
            c0248.getClass();
            return mo85;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Object m1099(Object obj, Method method, Object[] objArr) {
        return new IClipboardManagerExtC0477();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        if (C0175.f264) {
            m1101();
            return;
        }
        BinderC0293.f705.getClass();
        BinderC0293.f708.post(this::m1101);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final void m1100() {
        if (C0175.f273) {
            Object newProxyInstance = Proxy.newProxyInstance(IClipboardManagerExt.class.getClassLoader(), new Class[]{ExtCreator.class}, C0190::m1099);
            Intrinsics.checkNotNull(newProxyInstance, "null cannot be cast to non-null type system.ext.loader.core.ExtCreator<android.content.IClipboardManagerExt>");
            ExtRegistry.registerExt(IClipboardManagerExt.class, (ExtCreator) newProxyInstance);
        } else if (!C0175.f272) {
        } else {
            C0047 c0047 = C0047.f129;
            Object m455 = C0047.m455("android.content.ClipboardManagerExtPlugin", "constructor");
            Intrinsics.checkNotNull(m455);
            c0047.m464(m455, "ctor", IClipboardManagerExtC0477.class.getConstructor(new Class[0]));
        }
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final void m1101() {
        try {
            if (C0175.f269) {
                try {
                    m1100();
                } catch (Throwable unused) {
                }
            }
            this.f168 = this.f296;
            m643("clipboard");
        } catch (Exception unused2) {
        }
    }
}
