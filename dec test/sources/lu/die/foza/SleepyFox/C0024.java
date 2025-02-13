package lu.die.foza.SleepyFox;

import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0154;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ʹ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʹ.class */
public final class C0024<E> {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0025 f85 = new C0025();
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public int[] f86;
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public Object[] f87;

    /* renamed from: ԩ  reason: contains not printable characters */
    public int f88;

    /* renamed from: lu.die.foza.SleepyFox.ʹ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʹ$Ϳ.class */
    public static final class C0025 {
        public C0025() {
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final int m321(int i) {
            if (i <= 4) {
                return 8;
            }
            return i * 2;
        }

        public /* synthetic */ C0025(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final int[] m320(@NotNull int[] iArr, int i, int i2, int i3) {
            if (i + 1 <= iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
                iArr[i2] = i3;
                return iArr;
            }
            int[] iArr2 = new int[m321(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr2[i2] = i3;
            System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
            return iArr2;
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Object[] m319(@NotNull Object[] objArr, int i, int i2, @Nullable Object obj) {
            if (i + 1 <= objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i - i2);
                objArr[i2] = obj;
                return objArr;
            }
            Object[] objArr2 = new Object[m321(i)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            objArr2[i2] = obj;
            System.arraycopy(objArr, i2, objArr2, i2 + 1, objArr.length - i2);
            return objArr2;
        }
    }

    @JvmOverloads
    public C0024() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m308(@NotNull Pair<Integer, ? extends E>... pairArr) {
        this.f87 = new Object[pairArr.length];
        this.f86 = new int[pairArr.length];
        for (Pair<Integer, ? extends E> pair : pairArr) {
            m309(((Number) pair.getFirst()).intValue(), pair.getSecond());
        }
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final int m311(int i) {
        return this.f86[i];
    }

    @Nullable
    /* renamed from: ԫ  reason: contains not printable characters */
    public final E m312(int i) {
        return (E) this.f87[i];
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final int m314(int i) {
        return C0154.C0156.m759(this.f86, this.f88, i);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final E m318(int i) {
        return (E) m302(this, i, null, 2, null);
    }

    @JvmOverloads
    public C0024(int i) {
        if (i == 0) {
            this.f86 = C0154.C0157.f208;
            this.f87 = C0154.C0157.f210;
        } else {
            this.f87 = new Object[i];
            this.f86 = new int[i];
        }
        this.f88 = 0;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final void m307(int i, E e) {
        m309(i, e);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final void m313(int i, E e) {
        this.f87[i] = e;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m316(@Nullable E e) {
        int i = this.f88;
        for (int i2 = 0; i2 < i; i2++) {
            if (e == null) {
                if (this.f87[i2] == null) {
                    return i2;
                }
            } else if (Intrinsics.areEqual(e, this.f87[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m317() {
        this.f86 = C0154.C0157.f208;
        this.f87 = C0154.C0157.f210;
        this.f88 = 0;
    }

    public /* synthetic */ C0024(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m305(int i) {
        return m314(i) >= 0;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m309(int i, E e) {
        int m759 = C0154.C0156.m759(this.f86, this.f88, i);
        if (m759 >= 0) {
            this.f87[m759] = e;
            return;
        }
        int i2 = m759 ^ (-1);
        C0025 c0025 = f85;
        this.f86 = c0025.m320(this.f86, this.f88, i2, i);
        this.f87 = c0025.m319(this.f87, this.f88, i2, e);
        this.f88++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @JvmOverloads
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final E m306(int i, @Nullable E e) {
        int m759 = C0154.C0156.m759(this.f86, this.f88, i);
        if (m759 >= 0) {
            e = this.f87[m759];
        }
        return e;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m310() {
        return this.f88;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ Object m302(C0024 c0024, int i, Object obj, int i2, Object obj2) {
        E e = obj;
        if ((i2 & 2) != 0) {
            e = null;
        }
        return c0024.m306(i, e);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m315(E e) {
        int i = this.f88;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f87[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final int[] m303(@NotNull int[] iArr, int i, int i2, int i3) {
        return f85.m320(iArr, i, i2, i3);
    }
}
