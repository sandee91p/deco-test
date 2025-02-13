package lu.die.foza.SleepyFox;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0255;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
@SourceDebugExtension({"SMAP\nRemoteUserConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteUserConvertor.kt\nlu/die/foza/Data/Convertor/RemoteUserConvertor\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,195:1\n1313#2,2:196\n13309#3,2:198\n37#4,2:200\n*S KotlinDebug\n*F\n+ 1 RemoteUserConvertor.kt\nlu/die/foza/Data/Convertor/RemoteUserConvertor\n*L\n42#1:196,2\n68#1:198,2\n69#1:200,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ˉ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ˉ.class */
public final class C0045 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0045 f123 = new C0045();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final File f124 = C0276.m1701().getDir(C0281.C0286.f641, 0);

    @JvmStatic
    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String m421(@NotNull String str, @NotNull String str2) {
        return m422(str, str2, true);
    }

    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final File m428(@NotNull String str, @NotNull String str2) {
        return C0496.f1092.m2462(f124, str, str2);
    }

    @Deprecated(message = "Use server for enhance.")
    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m430(@NotNull String str, @NotNull String str2) {
        return C0496.f1092.m2462(f124, str, str2).exists();
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m431(@NotNull String str, @NotNull String str2) {
        try {
            C0496 c0496 = C0496.f1092;
            File m2462 = c0496.m2462(f124, str);
            if (!m2462.exists()) {
                return false;
            }
            String[] strArr = new String[1];
            strArr[0] = str2;
            File m24622 = c0496.m2462(m2462, strArr);
            if (m24622.exists()) {
                return true;
            }
            boolean mkdirs = m24622.mkdirs();
            if (mkdirs) {
                try {
                    C0255.f522.m1535(m24622, C0255.C0256.f538);
                } catch (Exception unused) {
                }
            }
            return mkdirs;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m433(@NotNull String str) {
        File m2462 = C0496.f1092.m2462(f124, str);
        if (m2462.exists()) {
            return true;
        }
        return m2462.mkdirs();
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m429(@NotNull String str) {
        return C0496.f1092.m2462(f124, str).exists();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m425() {
        try {
            File[] listFiles = f124.listFiles();
            if (listFiles == null) {
                return;
            }
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                C0255.f522.m1559((File) it.next());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final void m426(@NotNull String str) {
        try {
            File file = new File(f124, str);
            if (!file.exists()) {
                return;
            }
            for (File file2 : FilesKt.walkBottomUp(file)) {
                C0255.f522.m1535(file2, C0255.C0256.f538);
            }
            C0255.f522.m1559(file);
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String[] m427(@NotNull String str) {
        try {
            File m2462 = C0496.f1092.m2462(f124, str);
            if (!m2462.exists()) {
                return new String[0];
            }
            File[] listFiles = m2462.listFiles();
            ArrayList arrayList = new ArrayList();
            if (listFiles != null) {
                for (File file : listFiles) {
                    arrayList.add(file.getName());
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception unused) {
            return new String[0];
        }
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final File m424() {
        return f124;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m432(@NotNull String str, @NotNull String str2) {
        try {
            C0496 c0496 = C0496.f1092;
            File m2462 = c0496.m2462(f124, str);
            if (!m2462.exists()) {
                return false;
            }
            String[] strArr = new String[1];
            strArr[0] = str2;
            return C0255.f522.m1559(c0496.m2462(m2462, strArr));
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final String m422(@NotNull String str, @NotNull String str2, boolean z) {
        File m428 = f123.m428(str, str2);
        if (z && !m428.exists()) {
            m428.mkdirs();
            try {
                C0255.f522.m1535(m428, C0255.C0256.f538);
            } catch (Exception unused) {
            }
        }
        return m428.getAbsolutePath();
    }
}
