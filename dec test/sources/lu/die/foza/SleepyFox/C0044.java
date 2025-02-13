package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.ConditionVariable;
import android.os.IBinder;
import java.util.HashSet;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ˈ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˈ.class */
public final class C0044 extends C0355 {

    /* renamed from: Ԭ  reason: contains not printable characters */
    public int f114;
    @Nullable

    /* renamed from: ԭ  reason: contains not printable characters */
    public AbstractC0382 f115;
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public final HashSet<IBinder> f116 = new HashSet<>();
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public final int[] f117;
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public final int[] f118;
    @Nullable

    /* renamed from: ֈ  reason: contains not printable characters */
    public Pair<? extends Intent, ? extends ActivityInfo> f119;

    /* renamed from: ֏  reason: contains not printable characters */
    public boolean f120;
    @NotNull

    /* renamed from: ׯ  reason: contains not printable characters */
    public final ConditionVariable f121;

    /* renamed from: ؠ  reason: contains not printable characters */
    public int f122;

    public C0044(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        super(str, str2, str3, i, z);
        int[] iArr = new int[5];
        for (int i2 = 0; i2 < 5; i2++) {
            iArr[i2] = 0;
        }
        this.f117 = iArr;
        int[] iArr2 = new int[5];
        for (int i3 = 0; i3 < 5; i3++) {
            iArr2[i3] = 0;
        }
        this.f118 = iArr2;
        this.f120 = true;
        this.f121 = new ConditionVariable(false);
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public final int m405() {
        return this.f114;
    }

    @Nullable
    /* renamed from: Ԭ  reason: contains not printable characters */
    public final AbstractC0382 m407() {
        return this.f115;
    }

    @NotNull
    /* renamed from: ԭ  reason: contains not printable characters */
    public final HashSet<IBinder> m409() {
        return this.f116;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m411(@NotNull int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    @NotNull
    /* renamed from: ׯ  reason: contains not printable characters */
    public final int[] m412() {
        return this.f117;
    }

    @NotNull
    /* renamed from: ؠ  reason: contains not printable characters */
    public final int[] m413() {
        return this.f118;
    }

    @Nullable
    /* renamed from: Ԯ  reason: contains not printable characters */
    public final Pair<Intent, ActivityInfo> m414() {
        return this.f119;
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public final boolean m416() {
        return this.f120;
    }

    @NotNull
    /* renamed from: ՠ  reason: contains not printable characters */
    public final ConditionVariable m418() {
        return this.f121;
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public final int m419() {
        return this.f122;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m420(int i) {
        this.f122 = i;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m410(int i, @NotNull int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m408(@Nullable AbstractC0382 abstractC0382) {
        this.f115 = abstractC0382;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m415(@Nullable Pair<? extends Intent, ? extends ActivityInfo> pair) {
        this.f119 = pair;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m406(int i) {
        this.f114 = i;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m417(boolean z) {
        this.f120 = z;
    }
}
