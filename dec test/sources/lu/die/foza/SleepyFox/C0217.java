package lu.die.foza.SleepyFox;

import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nDiscoveryLocalMemoryModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryLocalMemoryModifier.kt\nlu/die/foza/Framework/Discover/DiscoveryLocalMemoryModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ޤ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޤ.class */
public final class C0217 implements Closeable {
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0219 f316 = new C0219();
    @Nullable

    /* renamed from: Ϳ  reason: contains not printable characters */
    public FileDescriptor f317;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public long f318;

    /* renamed from: lu.die.foza.SleepyFox.ޤ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޤ$Ϳ.class */
    public static final class C0218 extends Lambda implements Function1<BufferedReader, Unit> {

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final /* synthetic */ String f320;

        /* renamed from: ԩ  reason: contains not printable characters */
        public final /* synthetic */ boolean f321;

        /* renamed from: Ԫ  reason: contains not printable characters */
        public final /* synthetic */ String f322;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0218(String str, boolean z, String str2) {
            super(1);
            this.f320 = str;
            this.f321 = z;
            this.f322 = str2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(BufferedReader bufferedReader) {
            C0217 c0217 = C0217.this;
            c0217.f318 = c0217.m1213(bufferedReader, this.f320, this.f321);
            C0217.this.f317 = Os.open("/proc/" + this.f322 + "/mem", OsConstants.O_RDWR, 0);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ޤ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ޤ$Ԩ.class */
    public static final class C0219 {
        public C0219() {
        }

        @JvmStatic
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final int m1215(@NotNull String[] strArr) {
            File[] listFiles = new File("/proc").listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File file : listFiles) {
                boolean z = true;
                String name = file.getName();
                int i = 0;
                int length = name.length();
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!Character.isDigit(name.charAt(i))) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    FileReader fileReader = new FileReader("/proc/" + name + "/cmdline");
                    try {
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String readLine = bufferedReader.readLine();
                        String str = readLine;
                        if (readLine == null) {
                            str = C0019.f56;
                        }
                        String str2 = str;
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileReader, (Throwable) null);
                        if (str2.length() == 0) {
                            continue;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            int length2 = str.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                char charAt = str.charAt(i2);
                                if (!Character.isLetterOrDigit(charAt) && charAt != '.' && charAt != ':') {
                                    break;
                                }
                                sb.append(charAt);
                            }
                            if (ArraysKt.contains(strArr, sb.toString())) {
                                return Integer.parseInt(name);
                            }
                        }
                    } finally {
                    }
                }
            }
            return 0;
        }

        public /* synthetic */ C0219(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0217(@NotNull String str, boolean z, @NotNull String str2) {
        try {
            if (str.length() == 0) {
                this.f317 = Os.open("/proc/" + str2 + "/mem", OsConstants.O_RDWR, 0);
            } else {
                m1214(new C0218(str, z, str2), str2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileDescriptor fileDescriptor = this.f317;
            if (fileDescriptor == null) {
                return;
            }
            Os.close(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m1213(BufferedReader bufferedReader, String str, boolean z) {
        String str2;
        ArrayList<String> m1211 = m1211(str, bufferedReader, z);
        if (m1211.isEmpty()) {
            return 0L;
        }
        if (z) {
            String str3 = (String) CollectionsKt.last(m1211);
            str2 = str3;
            String substring = str3.substring(StringsKt.lastIndexOf$default(str3, ' ', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (StringsKt.indexOf$default(substring, "[anon:.bss]", 0, false, 6, (Object) null) == -1) {
                str2 = C0019.f56;
            }
        } else {
            str2 = m1211.get(0);
        }
        return m1212(str2);
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final int m1204(@NotNull String[] strArr) {
        return f316.m1215(strArr);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ArrayList<String> m1211(String str, BufferedReader bufferedReader, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        boolean z2 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            int lastIndexOf$default = StringsKt.lastIndexOf$default(readLine, ' ', 0, false, 6, (Object) null);
            if (lastIndexOf$default != -1) {
                String substring = readLine.substring(lastIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (StringsKt.indexOf$default(substring, str, 0, false, 6, (Object) null) != -1) {
                    arrayList.add(readLine);
                    z2 = true;
                    if (!z) {
                        return arrayList;
                    }
                } else if (z2) {
                    arrayList.add(readLine);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ ArrayList m1203(C0217 c0217, String str, BufferedReader bufferedReader, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c0217.m1211(str, bufferedReader, z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.io.Closeable, java.io.FileReader, java.io.Reader] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1214(Function1<? super BufferedReader, Unit> function1, String str) {
        try {
            ?? fileReader = new FileReader(new File("/proc/" + str + "/maps"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                function1.invoke(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally((Closeable) fileReader, (Throwable) null);
            } catch (Throwable th) {
                try {
                    throw fileReader;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(th2, th);
                    throw fileReader;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final long m1212(String str) {
        int indexOf$default = StringsKt.indexOf$default(str, '-', 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            String substring = str.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return Long.parseLong(substring, 16);
        }
        return 0L;
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final byte[] m1210(long j, int i) {
        byte[] bArr = new byte[i];
        try {
            FileDescriptor fileDescriptor = this.f317;
            if (fileDescriptor != null) {
                Os.pread(fileDescriptor, bArr, 0, i, this.f318 + j);
            }
        } catch (Exception unused) {
        }
        return bArr;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1209(long j, @NotNull byte[] bArr) {
        try {
            FileDescriptor fileDescriptor = this.f317;
            if (fileDescriptor == null) {
                return;
            }
            Os.pwrite(fileDescriptor, bArr, 0, bArr.length, this.f318 + j);
        } catch (Exception unused) {
        }
    }
}
