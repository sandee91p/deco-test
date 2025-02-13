package lu.die.foza.SleepyFox;

import android.system.Os;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtils.kt\nlu/die/foza/FoxDev/ThirdParty/FileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1297:1\n1#2:1298\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࡧ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡧ.class */
public final class C0255 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0255 f522 = new C0255();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final String f523 = "~~";
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final String f524 = "-";

    /* renamed from: lu.die.foza.SleepyFox.ࡧ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࡧ$Ϳ.class */
    public static final class C0256 {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final C0256 f525 = new C0256();

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static final int f526 = 2048;

        /* renamed from: ԩ  reason: contains not printable characters */
        public static final int f527 = 1024;

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static final int f528 = 512;

        /* renamed from: ԫ  reason: contains not printable characters */
        public static final int f529 = 256;

        /* renamed from: Ԭ  reason: contains not printable characters */
        public static final int f530 = 128;

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final int f531 = 64;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public static final int f532 = 32;

        /* renamed from: ԯ  reason: contains not printable characters */
        public static final int f533 = 16;

        /* renamed from: ՠ  reason: contains not printable characters */
        public static final int f534 = 8;

        /* renamed from: ֈ  reason: contains not printable characters */
        public static final int f535 = 4;

        /* renamed from: ֏  reason: contains not printable characters */
        public static final int f536 = 2;

        /* renamed from: ׯ  reason: contains not printable characters */
        public static final int f537 = 1;

        /* renamed from: ؠ  reason: contains not printable characters */
        public static final int f538 = 493;

        /* renamed from: ހ  reason: contains not printable characters */
        public static final int f539 = 292;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1535(@NotNull File file, int i) {
        try {
            Os.chmod(file.getAbsolutePath(), i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public final boolean m1537(@Nullable File file) {
        return file != null && file.exists();
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public final boolean m1539(@Nullable File file) {
        if (m1537(file)) {
            Intrinsics.checkNotNull(file);
            if (file.isDirectory()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public final boolean m1541(@Nullable File file) {
        if (m1537(file)) {
            Intrinsics.checkNotNull(file);
            if (file.isFile()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m1545(@Nullable File file) {
        boolean createNewFile;
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (m1543(file.getParentFile())) {
            try {
                createNewFile = file.createNewFile();
            } catch (IOException unused) {
            }
            return createNewFile;
        }
        createNewFile = false;
        return createNewFile;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1552(@Nullable File file, @Nullable File file2) {
        return m1527(file, file2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[Catch: Exception -> 0x0010, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0010, blocks: (B:30:0x0004, B:7:0x001a, B:12:0x0028, B:15:0x002f, B:17:0x0035, B:19:0x003b, B:21:0x004e, B:22:0x0045), top: B:29:0x0004 }] */
    /* renamed from: Ԫ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1558(@org.jetbrains.annotations.Nullable java.io.File r4) {
        /*
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L14
            r0 = r4
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L10
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 1
            goto L15
        L10:
            goto L56
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L1a
            r0 = 0
            return r0
        L1a:
            r0 = r4
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Exception -> L10
            r1 = r0
            r4 = r1
            if (r0 != 0) goto L25
            r0 = 0
            return r0
        L25:
            r0 = r4
            r1 = 0
            r5 = r1
            int r0 = r0.length     // Catch: java.lang.Exception -> L10
            r6 = r0
        L2a:
            r0 = r5
            r1 = r6
            if (r0 >= r1) goto L54
            r0 = r4
            r1 = r5
            r0 = r0[r1]     // Catch: java.lang.Exception -> L10
            r1 = r0
            r7 = r1
            boolean r0 = r0.isFile()     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L45
            r0 = r3
            r1 = r7
            boolean r0 = r0.m1561(r1)     // Catch: java.lang.Exception -> L10
        L41:
            goto L4e
        L45:
            r0 = r3
            r1 = r7
            boolean r0 = r0.m1559(r1)     // Catch: java.lang.Exception -> L10
            goto L41
        L4e:
            int r5 = r5 + 1
            goto L2a
        L54:
            r0 = 1
            return r0
        L56:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0255.m1558(java.io.File):boolean");
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m1559(@Nullable File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists()) {
                return true;
            }
            if (!file.isDirectory()) {
                return false;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    Iterator it = ArrayIteratorKt.iterator(listFiles);
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        if (file2.isFile()) {
                            if (!m1561(file2)) {
                                file2.toString();
                                return false;
                            }
                        } else if (!file2.isDirectory()) {
                            file2.toString();
                            file2.delete();
                        } else if (!Intrinsics.areEqual(file2.getCanonicalPath(), file2.getAbsolutePath()) && !file2.delete() && !m1559(file2)) {
                            file2.toString();
                            return false;
                        } else if (!m1559(file2)) {
                            file2.toString();
                            return false;
                        }
                    }
                }
            }
            if (file.delete()) {
                return true;
            }
            file.deleteOnExit();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final boolean m1561(@Nullable File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    /* renamed from: ԭ  reason: contains not printable characters */
    public final boolean m1563(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return true;
        }
        Iterator it = ArrayIteratorKt.iterator(listFiles);
        while (it.hasNext()) {
            File file2 = (File) it.next();
            if (file2.isFile()) {
                if (!m1561(file2)) {
                    return false;
                }
            } else if (file2.isDirectory() && !m1559(file2)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: ނ  reason: contains not printable characters */
    public final List<File> m1567(@Nullable File file) {
        if (file == null || !m1539(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                File file2 = (File) it.next();
                arrayList.add(file2);
                if (file2.isDirectory() && Intrinsics.areEqual(file2.getCanonicalPath(), file2.getAbsolutePath())) {
                    List<File> m1567 = m1567(file2);
                    Intrinsics.checkNotNull(m1567);
                    arrayList.addAll(m1567);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[ORIG_RETURN, RETURN] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: ԯ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m1589(@org.jetbrains.annotations.Nullable java.io.File r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = 0
            r9 = r1
            r1 = 0
            r10 = r1
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4f
            r2 = r1
            r3 = r2
            r11 = r3
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4f
            r4 = r3
            r5 = r8
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4f
            int r1 = r1.read()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L39 java.lang.Throwable -> L40 java.io.IOException -> L4f
            r2 = 8
            int r1 = r1 << r2
            r2 = r11
            int r2 = r2.read()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L39
            int r1 = r1 + r2
            r9 = r1
            r1 = 1
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r2 = r1
            r3 = 0
            r4 = r11
            r2[r3] = r4
            r0.m1592(r1)
            goto L5e
        L33:
            r1 = move-exception
            r10 = r1
            goto L40
        L39:
            r1 = r11
            r10 = r1
            goto L50
        L40:
            r2 = move-exception
            r3 = 1
            java.io.Closeable[] r3 = new java.io.Closeable[r3]
            r4 = r3
            r7 = r4
            r4 = 0
            r5 = r10
            r3[r4] = r5
            r3 = r7
            r2.m1592(r3)
            throw r1
        L4f:
        L50:
            r1 = r7
            r2 = 1
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r3 = r2
            r7 = r3
            r3 = 0
            r4 = r10
            r2[r3] = r4
            r2 = r7
            r1.m1592(r2)
        L5e:
            r0 = r9
            r1 = 61371(0xefbb, float:8.5999E-41)
            if (r0 == r1) goto L85
            r0 = r9
            r1 = 65279(0xfeff, float:9.1475E-41)
            if (r0 == r1) goto L7f
            r0 = r9
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r0 == r1) goto L79
            java.lang.String r0 = "GBK"
            goto L88
        L79:
            java.lang.String r0 = "Unicode"
            goto L88
        L7f:
            java.lang.String r0 = "UTF-16BE"
            goto L88
        L85:
            java.lang.String r0 = "UTF-8"
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0255.m1589(java.io.File):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [lu.die.foza.SleepyFox.ࡧ] */
    /* renamed from: ֈ  reason: contains not printable characters */
    public final int m1591(@Nullable File file) {
        ?? th;
        BufferedInputStream bufferedInputStream;
        int i = 1;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            th = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(th);
        } catch (IOException unused) {
        } catch (Throwable c0255) {
        }
        try {
            byte[] bArr = new byte[C0256.f527];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, C0256.f527);
                if (read == -1) {
                    break;
                }
                for (int i2 = 0; i2 < read; i2++) {
                    if (bArr[i2] == 10) {
                        i++;
                    }
                }
            }
            m1592(bufferedInputStream);
        } catch (IOException unused2) {
            bufferedInputStream2 = bufferedInputStream;
            m1592(bufferedInputStream2);
            return i;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = th;
            c0255.m1592(bufferedInputStream2);
            throw th;
        }
        return i;
    }

    @Nullable
    /* renamed from: Ԯ  reason: contains not printable characters */
    public final String m1593(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return m1594(file.getPath());
    }

    @Nullable
    /* renamed from: ֏  reason: contains not printable characters */
    public final String m1595(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return m1596(file.getPath());
    }

    @Nullable
    /* renamed from: ׯ  reason: contains not printable characters */
    public final String m1597(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return m1598(file.getPath());
    }

    @Nullable
    /* renamed from: ՠ  reason: contains not printable characters */
    public final String m1599(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return m1600(file.getPath());
    }

    @Nullable
    /* renamed from: Ԯ  reason: contains not printable characters */
    public final File m1529(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return new File(str).getCanonicalFile();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1534(@Nullable String str, @Nullable Integer num) {
        if (str == null || num == null) {
            return;
        }
        try {
            Os.chmod(str, num.intValue());
        } catch (Exception unused) {
        }
    }

    /* renamed from: ށ  reason: contains not printable characters */
    public final boolean m1536(@Nullable String str) {
        return m1537(m1529(str));
    }

    /* renamed from: ؠ  reason: contains not printable characters */
    public final boolean m1538(@Nullable String str) {
        return m1539(m1529(str));
    }

    /* renamed from: ހ  reason: contains not printable characters */
    public final boolean m1540(@Nullable String str) {
        return m1541(m1529(str));
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m1544(@Nullable String str) {
        return m1545(m1529(str));
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1551(@Nullable String str, @Nullable String str2) {
        return m1527(m1529(str), m1529(str2), false);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m1557(@Nullable String str) {
        return m1559(m1529(str));
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m1560(@Nullable String str) {
        return m1561(m1529(str));
    }

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final boolean m1562(@Nullable String str) {
        return m1563(m1529(str));
    }

    @Nullable
    /* renamed from: ނ  reason: contains not printable characters */
    public final List<File> m1566(@Nullable String str) {
        return m1567(m1529(str));
    }

    @NotNull
    /* renamed from: ԯ  reason: contains not printable characters */
    public final String m1588(@Nullable String str) {
        return m1589(m1529(str));
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public final int m1590(@Nullable String str) {
        return m1591(m1529(str));
    }

    @NotNull
    /* renamed from: ԭ  reason: contains not printable characters */
    public final String m1594(@NotNull String str) {
        String str2;
        if (str.length() == 0) {
            return str;
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default(str, File.separator, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            str2 = C0019.f56;
        } else {
            String substring = str.substring(0, lastIndexOf$default + 1);
            str2 = substring;
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        return str2;
    }

    @NotNull
    /* renamed from: ֏  reason: contains not printable characters */
    public final String m1596(@NotNull String str) {
        if (str.length() == 0) {
            return str;
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default(str, File.separator, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            String substring = str.substring(lastIndexOf$default + 1);
            str = substring;
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        return str;
    }

    @NotNull
    /* renamed from: ׯ  reason: contains not printable characters */
    public final String m1598(@NotNull String str) {
        String str2;
        if (str.length() == 0) {
            return str;
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default(str, '.', 0, false, 6, (Object) null);
        int lastIndexOf$default2 = StringsKt.lastIndexOf$default(str, File.separator, 0, false, 6, (Object) null);
        if (lastIndexOf$default2 == -1) {
            if (lastIndexOf$default != -1) {
                String substring = str.substring(0, lastIndexOf$default);
                str = substring;
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            }
            return str;
        }
        if (lastIndexOf$default == -1 || lastIndexOf$default2 > lastIndexOf$default) {
            String substring2 = str.substring(lastIndexOf$default2 + 1);
            str2 = substring2;
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        } else {
            String substring3 = str.substring(lastIndexOf$default2 + 1, lastIndexOf$default);
            str2 = substring3;
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        }
        return str2;
    }

    @NotNull
    /* renamed from: ՠ  reason: contains not printable characters */
    public final String m1600(@NotNull String str) {
        String str2;
        if (str.length() == 0) {
            return str;
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default(str, '.', 0, false, 6, (Object) null);
        int lastIndexOf$default2 = StringsKt.lastIndexOf$default(str, File.separator, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1 || lastIndexOf$default2 >= lastIndexOf$default) {
            str2 = C0019.f56;
        } else {
            String substring = str.substring(lastIndexOf$default + 1);
            str2 = substring;
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (m1561(r6) != false) goto L30;
     */
    /* renamed from: Ԩ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1527(java.io.File r6, java.io.File r7, boolean r8) {
        /*
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L68
            r0 = r7
            if (r0 != 0) goto Lb
            goto L68
        Lb:
            r0 = r6
            boolean r0 = r0.exists()
            if (r0 == 0) goto L66
            r0 = r6
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L1c
            goto L66
        L1c:
            r0 = r7
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2c
            r0 = r7
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = r5
            r1 = r7
            java.io.File r1 = r1.getParentFile()
            boolean r0 = r0.m1543(r1)
            if (r0 != 0) goto L3c
        L37:
            r0 = 0
            r5 = r0
            goto L64
        L3c:
            r0 = r5
            r1 = r7
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L60
            r3 = r2
            r7 = r3
            r3 = r6
            r2.<init>(r3)     // Catch: java.io.FileNotFoundException -> L60
            r2 = r7
            r3 = 0
            boolean r0 = r0.m1579(r1, r2, r3)     // Catch: java.io.FileNotFoundException -> L60
            if (r0 == 0) goto L37
            r0 = r8
            if (r0 == 0) goto L5b
            r0 = r5
            r1 = r6
            boolean r0 = r0.m1561(r1)     // Catch: java.io.FileNotFoundException -> L60
            if (r0 == 0) goto L37
        L5b:
            r0 = 1
            r5 = r0
            goto L64
        L60:
            goto L37
        L64:
            r0 = r5
            return r0
        L66:
            r0 = 0
            return r0
        L68:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0255.m1527(java.io.File, java.io.File, boolean):boolean");
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final File m1533(@NotNull File file, @NotNull String str) {
        File file2;
        try {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            do {
                secureRandom.nextBytes(bArr);
                file2 = new File(file, f523 + Base64.encodeToString(bArr, 10));
                C0276.f576.getClass();
                if (C0276.f578) {
                    break;
                }
            } while (file2.exists());
            secureRandom.nextBytes(bArr);
            return new File(file2, str + '-' + Base64.encodeToString(bArr, 10));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m1555(@Nullable String str, @Nullable String str2) {
        return m1527(m1529(str), m1529(str2), true);
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final List<File> m1571(@Nullable File file, @NotNull String str) {
        if (file == null || !m1539(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                File file2 = (File) it.next();
                String upperCase = file2.getName().toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String upperCase2 = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (StringsKt.endsWith$default(upperCase, upperCase2, false, 2, (Object) null)) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory() && Intrinsics.areEqual(file2.getCanonicalPath(), file2.getAbsolutePath())) {
                    List<File> m1571 = m1571(file2, str);
                    Intrinsics.checkNotNull(m1571);
                    arrayList.addAll(m1571);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: Ԯ  reason: contains not printable characters */
    public final List<File> m1576(@Nullable String str, @NotNull String str2) {
        return m1577(m1529(str), str2);
    }

    @Nullable
    /* renamed from: Ԭ  reason: contains not printable characters */
    public final List<String> m1582(@Nullable String str, @Nullable String str2) {
        return m1583(m1529(str), str2);
    }

    @Nullable
    /* renamed from: ԭ  reason: contains not printable characters */
    public final String m1586(@Nullable String str, @Nullable String str2) {
        return m1587(m1529(str), str2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1592(@NotNull Closeable... closeableArr) {
        try {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    closeable.close();
                }
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1526(String str, String str2, boolean z) {
        return m1527(m1529(str), m1529(str2), z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1550(@Nullable File file, @Nullable File file2) {
        return m1525(file, file2, false);
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final List<File> m1568(@Nullable String str, @NotNull String str2, boolean z) {
        return m1569(m1529(str), str2, z);
    }

    @Nullable
    /* renamed from: ԭ  reason: contains not printable characters */
    public final List<File> m1577(@Nullable File file, @NotNull String str) {
        if (file == null || !m1539(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                File file2 = (File) it.next();
                String upperCase = file2.getName().toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String upperCase2 = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (Intrinsics.areEqual(upperCase, upperCase2)) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory() && Intrinsics.areEqual(file2.getCanonicalPath(), file2.getAbsolutePath())) {
                    List<File> m1577 = m1577(file2, str);
                    Intrinsics.checkNotNull(m1577);
                    arrayList.addAll(m1577);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: ԫ  reason: contains not printable characters */
    public final List<String> m1583(@Nullable File file, @Nullable String str) {
        return m1585(file, 0, Integer.MAX_VALUE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [lu.die.foza.SleepyFox.ࡧ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    @Nullable
    /* renamed from: Ԭ  reason: contains not printable characters */
    public final String m1587(@Nullable File file, @Nullable String str) {
        String str2;
        if (file == null) {
            return null;
        }
        ?? r0 = str;
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = r0 == 0 || str.length() == 0 ? new BufferedReader(new InputStreamReader(new FileInputStream(file))) : new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine).append("\r\n");
            }
            r0 = this;
            str2 = sb.delete(sb.length() - 2, sb.length()).toString();
            r0.m1592(bufferedReader);
        } catch (IOException unused) {
            str2 = null;
            this.m1592(bufferedReader);
        } catch (Throwable th) {
            th.m1592(bufferedReader);
            throw r0;
        }
        return str2;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1543(@Nullable File file) {
        if (file != null) {
            if (file.exists() ? file.isDirectory() : file.mkdirs()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* renamed from: ԩ  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1548(@org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L16
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto Le
            goto L16
        Le:
            r0 = 0
            goto L17
        L12:
            goto L46
        L16:
            r0 = 1
        L17:
            if (r0 != 0) goto L48
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r5
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L28
            goto L2c
        L28:
            r0 = 0
            goto L2d
        L2c:
            r0 = 1
        L2d:
            if (r0 == 0) goto L33
            goto L48
        L33:
            r0 = r6
            if (r0 == 0) goto L3f
            r0 = r4
            r1 = r5
            android.system.Os.symlink(r0, r1)     // Catch: java.lang.Exception -> L12
            goto L44
        L3f:
            r0 = r4
            r1 = r5
            android.system.Os.link(r0, r1)     // Catch: java.lang.Exception -> L12
        L44:
            r0 = 1
            return r0
        L46:
            r1 = 0
            return r1
        L48:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0255.m1548(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1549(@Nullable String str, @Nullable String str2) {
        return m1525(m1529(str), m1529(str2), false);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m1553(@Nullable String str, @Nullable String str2) {
        return m1525(m1529(str), m1529(str2), true);
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m1580(@Nullable String str, @Nullable String str2, boolean z) {
        return m1581(m1529(str), str2, z);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1525(File file, File file2, boolean z) {
        if (file == null || file2 == null) {
            return false;
        }
        StringBuilder append = new StringBuilder().append(file.getPath());
        String str = File.separator;
        String sb = append.append(str).toString();
        String str2 = file2.getPath() + str;
        if (StringsKt.contains$default(str2, sb, false, 2, (Object) null) || !file.exists() || !file.isDirectory() || !m1543(file2)) {
            return false;
        }
        Iterator it = ArrayIteratorKt.iterator(file.listFiles());
        while (it.hasNext()) {
            File file3 = (File) it.next();
            File file4 = new File(str2 + file3.getName());
            if (file3.isFile()) {
                if (!m1527(file3, file4, z)) {
                    return false;
                }
            } else if (file3.isDirectory() && !m1525(file3, file4, z)) {
                return false;
            }
        }
        return !z || m1559(file);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1542(@Nullable String str) {
        return m1543(m1529(str));
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final boolean m1556(@Nullable File file, @Nullable File file2) {
        return m1527(file, file2, true);
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final List<File> m1570(@Nullable String str, @NotNull String str2) {
        return m1571(m1529(str), str2);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1524(String str, String str2, boolean z) {
        return m1525(m1529(str), m1529(str2), z);
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final File m1532(@NotNull File file, @NotNull String str) {
        File file2;
        try {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            do {
                secureRandom.nextBytes(bArr);
                file2 = new File(file, str + '-' + Base64.encodeToString(bArr, 10));
                C0276.f576.getClass();
                if (C0276.f578) {
                    break;
                }
            } while (file2.exists());
            return file2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m1554(@Nullable File file, @Nullable File file2) {
        return m1525(file, file2, true);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1547(@Nullable File file) {
        boolean createNewFile;
        if (file == null) {
            return false;
        }
        if (file.exists() && file.isFile() && !file.delete()) {
            return false;
        }
        if (m1543(file.getParentFile())) {
            try {
                createNewFile = file.createNewFile();
            } catch (IOException unused) {
            }
            return createNewFile;
        }
        createNewFile = false;
        return createNewFile;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1546(@Nullable String str) {
        return m1547(m1529(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [lu.die.foza.SleepyFox.ࡧ] */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1581(@Nullable File file, @Nullable String str, boolean z) {
        boolean z2;
        if (file == null || str == null || !m1545(file)) {
            return false;
        }
        ?? th = 0;
        Closeable closeable = null;
        try {
            th = new FileWriter(file, z);
            try {
                th.write(str);
                z2 = true;
                m1592(new Closeable[]{th});
            } catch (IOException unused) {
                closeable = th;
                z2 = false;
                m1592(closeable);
                return z2;
            } catch (Throwable th2) {
                th = th2;
                closeable = th;
                r2.m1592(closeable);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable c0255) {
        }
        return z2;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final File m1530(@NotNull File file, @NotNull String str) {
        File file2;
        File file3;
        File file4;
        int i = 1;
        File file5 = null;
        while (true) {
            try {
                file3 = file5;
                file2 = file4;
                file4 = new File(file, str + '-' + i);
                i++;
                try {
                    C0276.f576.getClass();
                    if (C0276.f578) {
                        break;
                    }
                    if (!(file2.exists())) {
                        break;
                    }
                    file5 = file2;
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                file2 = file3;
            }
        }
        return file2;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final String m1531(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        String str4 = C0019.f56;
        int i = 1;
        if (str != null) {
            if (str3 != null) {
                try {
                    if (StringsKt.endsWith$default(str, str3, false, 2, (Object) null)) {
                        String substring = str.substring(0, str.length() - str3.length());
                        str = substring;
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    }
                } catch (Exception unused) {
                }
            }
            int lastIndexOf$default = StringsKt.lastIndexOf$default(str, str2, 0, false, 6, (Object) null);
            if (lastIndexOf$default != -1) {
                String substring2 = str.substring(lastIndexOf$default + str2.length());
                String str5 = substring2;
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                if (StringsKt.startsWith$default(substring2, f524, false, 2, (Object) null)) {
                    String substring3 = str5.substring(1);
                    str5 = substring3;
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                }
                try {
                    int parseInt = Integer.parseInt(str5);
                    i = parseInt <= 1 ? parseInt + 1 : parseInt - 1;
                } catch (NumberFormatException unused2) {
                }
            }
        }
        str4 = f524 + i;
        return str2 + str4;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ boolean m1523(C0255 c0255, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c0255.m1548(str, str2, z);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1565(@Nullable File file, boolean z) {
        if (z) {
            return m1567(file);
        }
        if (file == null || !m1539(file) || !Intrinsics.areEqual(file.getCanonicalPath(), file.getAbsolutePath())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            Collections.addAll(arrayList, Arrays.copyOf(listFiles, listFiles.length));
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1564(@Nullable String str, boolean z) {
        return m1565(m1529(str), z);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1575(@Nullable File file, @NotNull FilenameFilter filenameFilter) {
        if (file == null || !m1539(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                File file2 = (File) it.next();
                if (filenameFilter.accept(file2.getParentFile(), file2.getName())) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory() && Intrinsics.areEqual(file2.getCanonicalPath(), file2.getAbsolutePath())) {
                    List<File> m1575 = m1575(file2, filenameFilter);
                    Intrinsics.checkNotNull(m1575);
                    arrayList.addAll(m1575);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1573(@Nullable File file, @NotNull FilenameFilter filenameFilter, boolean z) {
        if (z) {
            return m1575(file, filenameFilter);
        }
        if (file == null || !m1539(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                File file2 = (File) it.next();
                if (filenameFilter.accept(file2.getParentFile(), file2.getName())) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1569(@Nullable File file, @NotNull String str, boolean z) {
        if (z) {
            return m1571(file, str);
        }
        if (file == null || !m1539(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(listFiles);
            while (it.hasNext()) {
                File file2 = (File) it.next();
                String upperCase = file2.getName().toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String upperCase2 = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (StringsKt.endsWith$default(upperCase, upperCase2, false, 2, (Object) null)) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1574(@Nullable String str, @NotNull FilenameFilter filenameFilter) {
        return m1575(m1529(str), filenameFilter);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<File> m1572(@Nullable String str, @NotNull FilenameFilter filenameFilter, boolean z) {
        return m1573(m1529(str), filenameFilter, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<String> m1585(@Nullable File file, int i, int i2, @Nullable String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (file != null && i <= i2) {
            ?? r0 = str;
            BufferedReader bufferedReader = null;
            int i3 = 1;
            try {
                arrayList = arrayList2;
                arrayList2 = new ArrayList();
                bufferedReader = r0 == 0 || str.length() == 0 ? new BufferedReader(new FileReader(file)) : new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
                while (true) {
                    r0 = bufferedReader.readLine();
                    if (r0 == 0 || i3 > i2) {
                        break;
                    }
                    if (i <= i3 && i3 <= i2) {
                        arrayList.add(r0);
                    }
                    i3++;
                }
                m1592(bufferedReader);
            } catch (IOException unused) {
                arrayList = null;
                m1592(bufferedReader);
            } catch (Throwable th) {
                th.m1592(bufferedReader);
                throw r0;
            }
            return arrayList;
        }
        return null;
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<String> m1584(@Nullable String str, int i, int i2, @Nullable String str2) {
        return m1585(m1529(str), i, i2, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [lu.die.foza.SleepyFox.ࡧ] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1579(@Nullable File file, @Nullable InputStream inputStream, boolean z) {
        boolean z2;
        BufferedOutputStream bufferedOutputStream;
        if (file == null || inputStream == null) {
            return false;
        }
        ?? th = file;
        if (!m1545(th)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            th = new FileOutputStream(file, z);
            bufferedOutputStream = new BufferedOutputStream(th);
        } catch (IOException unused) {
        } catch (Throwable c0255) {
        }
        try {
            byte[] bArr = new byte[C0256.f527];
            while (true) {
                int read = inputStream.read(bArr, 0, C0256.f527);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
            z2 = true;
            m1592(inputStream, bufferedOutputStream);
        } catch (IOException unused2) {
            bufferedOutputStream2 = bufferedOutputStream;
            z2 = false;
            m1592(inputStream, bufferedOutputStream2);
            return z2;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = th;
            c0255.m1592(inputStream, bufferedOutputStream2);
            throw th;
        }
        return z2;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1578(@Nullable String str, @Nullable InputStream inputStream, boolean z) {
        return m1579(m1529(str), inputStream, z);
    }
}
