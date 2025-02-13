package lu.die.foza.SleepyFox;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ૹ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ૹ.class */
public final class C0343<T> {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String f816;
    @Nullable

    /* renamed from: Ԩ  reason: contains not printable characters */
    public Field f817;

    public C0343(@NotNull String str) {
        this.f816 = str;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Field m2101(@NotNull Class<?> cls) {
        Field declaredField = cls.getDeclaredField(this.f816);
        C0047.f129.getClass();
        declaredField.setAccessible(true);
        this.f817 = declaredField;
        return declaredField;
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final T m2103(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return (T) field2.get(obj);
    }

    @Nullable
    /* renamed from: ֏  reason: contains not printable characters */
    public final Unit m2106(@Nullable Object obj) {
        Field field = this.f817;
        if (field != null) {
            field.set(null, obj);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m2107(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getBoolean(obj);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final byte m2108(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getByte(obj);
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final char m2109(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getChar(obj);
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public final short m2110(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getShort(obj);
    }

    /* renamed from: ԯ  reason: contains not printable characters */
    public final int m2111(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getInt(obj);
    }

    /* renamed from: ՠ  reason: contains not printable characters */
    public final long m2112(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getLong(obj);
    }

    /* renamed from: Ԯ  reason: contains not printable characters */
    public final float m2113(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getFloat(obj);
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public final double m2114(@NotNull Object obj) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        return field2.getDouble(obj);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Field m2123(Object obj) {
        Field field = null;
        C0360 c0360 = new C0360(3);
        while (field == null && c0360.m2181()) {
            try {
                field = m2100(obj);
            } catch (Exception unused) {
                C0354.f837.m2166();
            }
        }
        Field field2 = field;
        Intrinsics.checkNotNull(field);
        this.f817 = field;
        return field2;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Field m2100(@NotNull Object obj) {
        try {
            C0047 c0047 = C0047.f129;
            Field m461 = c0047.m461(obj, this.f816);
            Field field = m461;
            if (m461 != null) {
                c0047.getClass();
                field.setAccessible(true);
            } else {
                field = null;
            }
            Field field2 = field;
            this.f817 = field;
            Intrinsics.checkNotNull(field2);
            return field2;
        } catch (Exception e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new RuntimeException(e);
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Field m2102(@NotNull String str) {
        return m2101(Class.forName(str));
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final T m2105() {
        Field field = this.f817;
        if (field != null) {
            return (T) field.get(null);
        }
        return null;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2104(@NotNull Object obj, @Nullable Object obj2) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.set(obj, obj2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2115(@NotNull Object obj, boolean z) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setBoolean(obj, z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2116(@NotNull Object obj, byte b) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setByte(obj, b);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2117(@NotNull Object obj, char c) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setChar(obj, c);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2122(@NotNull Object obj, double d) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setDouble(obj, d);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2121(@NotNull Object obj, float f) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setFloat(obj, f);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2119(@NotNull Object obj, int i) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setInt(obj, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2120(@NotNull Object obj, long j) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setLong(obj, j);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2118(@NotNull Object obj, short s) {
        Field field = this.f817;
        Field field2 = field;
        if (field == null) {
            field2 = m2123(obj);
        }
        field2.setShort(obj, s);
    }
}
