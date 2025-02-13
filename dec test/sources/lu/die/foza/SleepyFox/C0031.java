package lu.die.foza.SleepyFox;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ʿ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ʿ.class */
public final class C0031 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0031 f95 = new C0031();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final HashMap<String, String> f96 = MapsKt.hashMapOf(new Pair[]{TuplesKt.to(Void.class.getName(), "V"), TuplesKt.to(Boolean.TYPE.getName(), "Z"), TuplesKt.to(Byte.TYPE.getName(), "B"), TuplesKt.to(Character.TYPE.getName(), "C"), TuplesKt.to(Short.TYPE.getName(), "S"), TuplesKt.to(Integer.TYPE.getName(), "I"), TuplesKt.to(Long.TYPE.getName(), "J"), TuplesKt.to(Float.TYPE.getName(), "F"), TuplesKt.to(Double.TYPE.getName(), "D"), TuplesKt.to("void", "V"), TuplesKt.to("boolean", "Z"), TuplesKt.to("byte", "B"), TuplesKt.to("char", "C"), TuplesKt.to("short", "S"), TuplesKt.to("int", "I"), TuplesKt.to("long", "J"), TuplesKt.to("float", "F"), TuplesKt.to("double", "D")});

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m370(Class<?> cls) {
        String name;
        StringBuilder sb = new StringBuilder();
        if (cls.isArray()) {
            name = cls.getComponentType().getName();
            sb.append("[");
        } else {
            name = cls.getName();
        }
        if (cls.isPrimitive()) {
            HashMap<String, String> hashMap = f96;
            if (hashMap.containsKey(name)) {
                sb.append(hashMap.get(name));
                return sb.toString();
            }
        }
        sb.append("L").append(StringsKt.replace$default(name, ".", "/", false, 4, (Object) null)).append(";");
        return sb.toString();
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m369(@NotNull Class<?> cls, @NotNull Class<?>[] clsArr) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls2 : clsArr) {
            sb.append(m370(cls2));
        }
        sb.append(")");
        sb.append(m370(cls));
        return sb.toString();
    }
}
