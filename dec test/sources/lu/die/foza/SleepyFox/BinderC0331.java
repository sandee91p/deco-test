package lu.die.foza.SleepyFox;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.AbstractC0387;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࣂ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࣂ.class */
public final class BinderC0331 extends AbstractC0387.AbstractBinderC0389 {
    @NotNull

    /* renamed from: ؠ  reason: contains not printable characters */
    public static final BinderC0331 f784 = new BinderC0331();
    @NotNull

    /* renamed from: ހ  reason: contains not printable characters */
    public static ConcurrentLinkedDeque<C0329> f785 = new ConcurrentLinkedDeque<>();

    /* renamed from: ށ  reason: contains not printable characters */
    public static int f786 = 100;
    @NotNull

    /* renamed from: ނ  reason: contains not printable characters */
    public static ArrayList<C0329> f787 = new ArrayList<>();
    @NotNull

    /* renamed from: ރ  reason: contains not printable characters */
    public static String f788 = C0019.f56;

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean mo2037(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        try {
            C0329 c0329 = new C0329();
            c0329.f780 = str2;
            c0329.f781 = str3;
            c0329.f782 = str;
            c0329.f783 = System.currentTimeMillis();
            ConcurrentLinkedDeque<C0329> concurrentLinkedDeque = f785;
            while (concurrentLinkedDeque.size() > f786) {
                concurrentLinkedDeque.removeFirst();
            }
            concurrentLinkedDeque.addLast(c0329);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    /* renamed from: ԭ  reason: contains not printable characters */
    public void mo2038(int i) {
        f786 = i;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    /* renamed from: Ԭ  reason: contains not printable characters */
    public void mo2039() {
        try {
            f785 = new ConcurrentLinkedDeque<>();
        } catch (Exception unused) {
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    /* renamed from: ԩ  reason: contains not printable characters */
    public int mo2040() {
        try {
            ArrayList<C0329> arrayList = new ArrayList<>(f785);
            int size = arrayList.size();
            f787 = arrayList;
            return size;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    @Nullable
    /* renamed from: ԫ  reason: contains not printable characters */
    public C0329 mo2042(int i) {
        try {
            return f787.get(i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public String mo2043(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return f788;
        }
        f788 = str;
        return C0019.f56;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0387
    /* renamed from: ԫ  reason: contains not printable characters */
    public void mo2041() {
        try {
            f787 = new ArrayList<>();
        } catch (Exception unused) {
        }
    }
}
