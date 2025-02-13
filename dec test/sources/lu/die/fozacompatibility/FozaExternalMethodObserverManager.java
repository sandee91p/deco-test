package lu.die.fozacompatibility;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import lu.die.foza.SleepyFox.AbstractC0066;
import lu.die.foza.SleepyFox.AbstractC0413;
import lu.die.foza.SleepyFox.C0253;
import lu.die.foza.SleepyFox.C0276;
import lu.die.foza.SleepyFox.C0327;
import lu.die.foza.SleepyFox.C0371;
import lu.die.foza.SleepyFox.C0505;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaExternalMethodObserverManager.class */
public class FozaExternalMethodObserverManager {

    /* renamed from: lu.die.fozacompatibility.FozaExternalMethodObserverManager$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaExternalMethodObserverManager$Ϳ.class */
    public class C0507 implements C0505.AbstractC0506 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ IProcessCallback f1104;

        public C0507(IProcessCallback iProcessCallback) {
            this.f1104 = iProcessCallback;
        }

        @Override // lu.die.foza.SleepyFox.C0505.AbstractC0506
        /* renamed from: Ϳ */
        public void mo2475() {
            this.f1104.onHostProcess();
        }

        @Override // lu.die.foza.SleepyFox.C0505.AbstractC0506
        /* renamed from: Ԩ */
        public void mo2476() {
            this.f1104.onStubProcess();
        }
    }

    @Deprecated
    public static void redirectPath(String str, String str2) {
        C0371.m2241(str, str2);
    }

    @Deprecated
    public static void whiteListPath(String str) {
        C0371.m2242(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, lu.die.foza.SleepyFox.ჿ$Ϳ, lu.die.fozacompatibility.FozaExternalMethodObserverManager$Ϳ] */
    public static void registerProcessTypeCallback(IProcessCallback iProcessCallback) {
        ?? c0507;
        try {
            c0507 = new C0507(iProcessCallback);
            C0505.m2469((C0505.AbstractC0506) c0507);
        } catch (Exception unused) {
            c0507.printStackTrace();
        }
    }

    public static void detectProcessTypeOnce(Context context) {
        C0505.m2470(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addOnObserver(String str, String str2, FozaMethodObserverEE fozaMethodObserverEE) {
        try {
            C0276.m1702();
            AbstractC0066.m638(str, str2, new C0508(fozaMethodObserverEE));
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    public static void registerFozaActivityCallback(@NonNull FozaActivityObserver fozaActivityObserver) {
        Objects.requireNonNull(fozaActivityObserver);
        C0327.m2014(this::afterApplicationCreate);
    }

    /* renamed from: lu.die.fozacompatibility.FozaExternalMethodObserverManager$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaExternalMethodObserverManager$Ԩ.class */
    public class C0508 implements AbstractC0413 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ FozaMethodObserverEE f1105;

        public C0508(FozaMethodObserverEE fozaMethodObserverEE) {
            this.f1105 = fozaMethodObserverEE;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        @Nullable
        /* renamed from: ԩ */
        public Throwable mo2305() {
            return this.f1105.throwable;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        /* renamed from: Ԩ */
        public void mo2307(@NonNull C0253 c0253) {
            this.f1105.beforeCallingMethod(c0253.f517, c0253.f518, c0253.f519);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        /* renamed from: Ϳ */
        public void mo2308(@NonNull C0253 c0253) {
            this.f1105.afterCallingMethod(c0253.f517, c0253.f518, c0253.f519);
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        /* renamed from: Ԩ */
        public boolean mo2301() {
            return this.f1105.returnEarly;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        @Nullable
        /* renamed from: Ϳ */
        public Object mo2303() {
            return this.f1105.result;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        /* renamed from: Ϳ */
        public void mo2304(@Nullable Object obj) {
            this.f1105.result = obj;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        /* renamed from: Ϳ */
        public void mo2306(@Nullable Throwable th) {
            this.f1105.throwable = th;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0413
        /* renamed from: Ϳ */
        public void mo2302(boolean z) {
            this.f1105.returnEarly = z;
        }
    }
}
