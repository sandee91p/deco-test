package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.app.ActivityThread;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.internal.content.NativeLibraryHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lu.die.foza.Platform.EmbeddedMachineCompat;
import lu.die.foza.SleepyFox.C0255;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.C0296;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaPackageObserverStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaPackageObserverStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaPackageObserverStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1990:1\n1#2:1991\n215#3,2:1992\n215#3,2:1994\n215#3,2:1996\n215#3,2:1998\n1855#4,2:2000\n1855#4,2:2002\n1855#4,2:2006\n1855#4,2:2010\n1855#4:2014\n1855#4,2:2015\n1856#4:2017\n1855#4,2:2024\n1855#4,2:2028\n37#5,2:2004\n37#5,2:2008\n37#5,2:2012\n37#5,2:2018\n37#5,2:2020\n37#5,2:2022\n37#5,2:2026\n37#5,2:2030\n37#5,2:2032\n37#5,2:2036\n37#5,2:2038\n37#5,2:2040\n37#5,2:2044\n13309#6,2:2034\n13309#6,2:2042\n*S KotlinDebug\n*F\n+ 1 FozaPackageObserverStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaPackageObserverStore\n*L\n220#1:1992,2\n274#1:1994,2\n328#1:1996,2\n382#1:1998,2\n594#1:2000,2\n822#1:2002,2\n834#1:2006,2\n846#1:2010,2\n858#1:2014\n864#1:2015,2\n858#1:2017\n921#1:2024,2\n931#1:2028,2\n829#1:2004,2\n841#1:2008,2\n853#1:2012,2\n874#1:2018,2\n910#1:2020,2\n916#1:2022,2\n926#1:2026,2\n936#1:2030,2\n940#1:2032,2\n1597#1:2036,2\n1599#1:2038,2\n1776#1:2040,2\n1957#1:2044,2\n1014#1:2034,2\n1807#1:2042,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢽ */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢽ.class */
public final class C0325 {
    @NotNull

    /* renamed from: Ϳ */
    public static final C0325 f765 = new C0325();
    @NotNull

    /* renamed from: Ԩ */
    public static final C0344<Object> f766 = new C0344("getService", new Class[]{String.class}).m2124("android.os.ServiceManager");
    @NotNull

    /* renamed from: ԩ */
    public static final C0343<Object> f767 = new C0343<>("mPM");
    @NotNull

    /* renamed from: Ԫ */
    public static final C0154<String, C0311> f768 = new C0154<>();
    @NotNull

    /* renamed from: ԫ */
    public static final ConcurrentHashMap<String, ProviderInfo> f769 = new ConcurrentHashMap<>();
    @NotNull

    /* renamed from: Ԭ */
    public static final C0164<ComponentName> f770 = new C0164<>();
    @NotNull

    /* renamed from: ԭ */
    public static final ConditionVariable f771 = new ConditionVariable();

    /* renamed from: Ϳ */
    public final <T> T m1937(T t) {
        Context m1701 = C0276.m1701();
        C0476 c0476 = C0476.f1083;
        Object[] objArr = {m1701, m1936(this, m1701, (Object) null, 2, (Object) null), m1701.getPackageCodePath(), t};
        c0476.getClass();
        return (T) EmbeddedMachineCompat.nativeIoctl(3112, objArr);
    }

    /* renamed from: ֏ */
    public final void m1944(String str) {
        List<String> list;
        try {
            C0311 c0311 = f768.get(str);
            if (c0311 == null) {
                return;
            }
            ProviderInfo[] providerInfoArr = c0311.f732.providers;
            if (providerInfoArr == null) {
                return;
            }
            for (ProviderInfo providerInfo : providerInfoArr) {
                String str2 = providerInfo.authority;
                if (str2 != null) {
                    char[] cArr = new char[1];
                    cArr[0] = ';';
                    list = StringsKt.split$default(str2, cArr, false, 0, 6, (Object) null);
                } else {
                    list = null;
                }
                if (list != null) {
                    for (String str3 : list) {
                        if (str3.length() > 0) {
                            f769.remove(str3);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ނ */
    public final int m1956(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2;
            i = (str.charAt(i3) * 31) + (i3 * 31) + (i * 31);
        }
        return Math.abs(i);
    }

    /* renamed from: Ԩ */
    public static final void m1964(String str) {
        C0045.f123.m426(str);
    }

    /* renamed from: Ԫ */
    public static final void m1966(String str) {
        try {
            C0449.f1059.m2379(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԭ */
    public static final void m1967(String str) {
        f765.m1997(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[Catch: Exception -> 0x0014, TRY_ENTER, TryCatch #0 {Exception -> 0x0014, blocks: (B:13:0x0004, B:7:0x001e), top: B:12:0x0004 }] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: ށ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.pm.ProviderInfo m1979(@org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L18
            r0 = r4
            int r0 = r0.length()     // Catch: java.lang.Exception -> L14
            if (r0 != 0) goto L10
            goto L18
        L10:
            r0 = 0
            goto L19
        L14:
            goto L29
        L18:
            r0 = 1
        L19:
            if (r0 == 0) goto L1e
            r0 = 0
            return r0
        L1e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.ProviderInfo> r0 = lu.die.foza.SleepyFox.C0325.f769     // Catch: java.lang.Exception -> L14
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L14
            android.content.pm.ProviderInfo r0 = (android.content.pm.ProviderInfo) r0     // Catch: java.lang.Exception -> L14
            return r0
        L29:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0325.m1979(java.lang.String):android.content.pm.ProviderInfo");
    }

    /* renamed from: ؠ */
    public final boolean m1991(@Nullable String str) {
        try {
            return f768.containsKey(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ׯ */
    public final boolean m1992(@Nullable String str) {
        try {
            C0311 c0311 = f768.get(str);
            if (c0311 != null) {
                if (!c0311.f733) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ԯ */
    public final int m1993(@NotNull String str) {
        try {
            C0311 c0311 = f768.get(str);
            if (c0311 != null && !c0311.f733) {
                return c0311.f732.applicationInfo.uid;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[Catch: Exception -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:21:0x0004, B:7:0x0019, B:9:0x0026, B:12:0x0036, B:13:0x0044, B:14:0x0062), top: B:20:0x0004 }] */
    /* renamed from: ԩ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1994(@org.jetbrains.annotations.Nullable java.lang.String r12) {
        /*
            r11 = this;
            r0 = r12
            if (r0 == 0) goto L14
            r0 = r12
            int r0 = r0.length()     // Catch: java.lang.Exception -> L3e
            if (r0 != 0) goto L10
            goto L14
        L10:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L19
            return
        L19:
            lu.die.foza.SleepyFox.ࢢ r0 = lu.die.foza.SleepyFox.C0265.f550     // Catch: java.lang.Exception -> L3e
            r1 = r12
            r2 = 0
            r0.m1676(r1, r2)     // Catch: java.lang.Exception -> L3e
            lu.die.foza.SleepyFox.ބ<java.lang.String, lu.die.foza.SleepyFox.ࢶ> r0 = lu.die.foza.SleepyFox.C0325.f768     // Catch: java.lang.Exception -> L3e
            r1 = r0
            r13 = r1
            r1 = r11
            r2 = r12
            java.lang.Object r1 = r1.m1937(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3e
            lu.die.foza.SleepyFox.ࢶ r0 = (lu.die.foza.SleepyFox.C0311) r0     // Catch: java.lang.Exception -> L3e
            r1 = r0
            r14 = r1
            if (r0 == 0) goto L42
            r0 = r14
            android.content.pm.PackageInfo r0 = r0.f732     // Catch: java.lang.Exception -> L3e
            r14 = r0
            goto L44
        L3e:
            goto L6c
        L42:
            r0 = 0
            r14 = r0
        L44:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r12
            r4 = r11
            r5 = r14
            r6 = r11
            r7 = r12
            lu.die.foza.SleepyFox.ࢦ r8 = lu.die.foza.SleepyFox.C0276.f576     // Catch: java.lang.Exception -> L3e
            r9 = r12
            void r9 = () -> { // java.lang.Runnable.run():void
                m1966(r9);
            }     // Catch: java.lang.Exception -> L3e
            r8.m1722(r9)     // Catch: java.lang.Exception -> L3e
            r6.m1944(r7)     // Catch: java.lang.Exception -> L3e
            r4.m1947(r5)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Exception -> L3e
            r2 = 1
            r0.m1943(r1, r2)     // Catch: java.lang.Exception -> L3e
            lu.die.foza.SleepyFox.ࠨ r0 = lu.die.foza.SleepyFox.BinderC0231.f444     // Catch: java.lang.Exception -> L3e
            r0.m1357()     // Catch: java.lang.Exception -> L3e
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0325.m1994(java.lang.String):void");
    }

    /* renamed from: Ԭ */
    public final void m1995(@Nullable String str) {
        try {
            C0276.f576.m1722(() -> {
                m1967(r1);
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԫ */
    public final void m1997(@Nullable String str) {
        if (str == null) {
            return;
        }
        try {
            C0306.f724.getClass();
            File m1838 = C0306.f725.m1838(str);
            if (m1838 != null) {
                C0496 c0496 = C0496.f1092;
                String[] strArr = new String[4];
                strArr[0] = "Android";
                strArr[1] = "data";
                strArr[2] = str;
                strArr[3] = "cache";
                File m2462 = c0496.m2462(m1838, strArr);
                if (m2462.exists()) {
                    C0255.f522.m1559(m2462);
                }
            }
            for (String str2 : C0045.f123.m427(str)) {
                String m422 = C0045.m422(str, str2, false);
                C0496 c04962 = C0496.f1092;
                String[] strArr2 = new String[1];
                strArr2[0] = "cache";
                File file = new File(c04962.m2463(m422, strArr2));
                if (file.exists()) {
                    C0255.f522.m1559(file);
                }
                String[] strArr3 = new String[1];
                strArr3[0] = "code_cache";
                File file2 = new File(c04962.m2463(m422, strArr3));
                if (file2.exists()) {
                    C0255.f522.m1559(file2);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Throwable, java.lang.Object, java.io.File] */
    /* renamed from: ՠ */
    public final int m2002(@Nullable String str) {
        PackageParser.ApkLite apkLite;
        int i;
        PackageParser.ApkLite apkLite2;
        if (str == null) {
            try {
                File m2371 = C0449.f1059.m2371();
                if (m2371.exists()) {
                    C0255.f522.m1559(m2371);
                }
            } catch (Exception unused) {
            }
            return -3;
        }
        try {
            C0154 c0154 = new C0154();
            File file = new File(str);
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    try {
                        File m23712 = C0449.f1059.m2371();
                        if (m23712.exists()) {
                            C0255.f522.m1559(m23712);
                        }
                    } catch (Exception unused2) {
                    }
                    return -2;
                }
                for (File file2 : listFiles) {
                    if (StringsKt.endsWith$default(file2.getName(), ".apk", false, 2, (Object) null)) {
                        try {
                            apkLite2 = PackageParser.parseApkLite(file2, 0);
                        } catch (Exception unused3) {
                            apkLite2 = null;
                        }
                        if (apkLite2 != null) {
                            c0154.put(apkLite2.splitName, new Pair(file2, apkLite2));
                        }
                    }
                }
            } else {
                C0449 c0449 = C0449.f1059;
                File m23713 = c0449.m2371();
                if (m23713.exists()) {
                    C0255.f522.m1559(m23713);
                }
                if (!m23713.mkdirs()) {
                    try {
                        File m23714 = c0449.m2371();
                        if (m23714.exists()) {
                            C0255.f522.m1559(m23714);
                        }
                    } catch (Exception unused4) {
                    }
                    return -2;
                }
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    String name = nextElement.getName();
                    if (StringsKt.endsWith$default(name, ".apk", false, 2, (Object) null)) {
                        th = zipFile.getInputStream(nextElement);
                        if (th == null) {
                            continue;
                        } else {
                            ?? file3 = new File(m23713, name);
                            th = new FileOutputStream((File) file3);
                            th = null;
                            th = null;
                            try {
                                ByteStreamsKt.copyTo$default(th, th, 0, 2, (Object) null);
                                try {
                                    apkLite = PackageParser.parseApkLite((File) file3, 0);
                                } catch (Exception unused5) {
                                    apkLite = null;
                                }
                                if (apkLite != null) {
                                    c0154.put(apkLite.splitName, new Pair((Object) file3, apkLite));
                                }
                            } catch (Throwable th) {
                                try {
                                    throw file3;
                                } finally {
                                    CloseableKt.closeFinally(th, th);
                                }
                            }
                        }
                    }
                }
                try {
                    zipFile.close();
                } catch (Exception unused6) {
                }
            }
            Pair pair = (Pair) c0154.remove(null);
            if (pair == null) {
                try {
                    File m23715 = C0449.f1059.m2371();
                    if (m23715.exists()) {
                        C0255.f522.m1559(m23715);
                    }
                } catch (Exception unused7) {
                }
                return -5;
            }
            Triple<C0311, Integer, Boolean> m1958 = m1958((File) pair.getFirst());
            if (((Number) m1958.getSecond()).intValue() != 1) {
                int intValue = ((Number) m1958.getSecond()).intValue();
                try {
                    File m23716 = C0449.f1059.m2371();
                    if (m23716.exists()) {
                        C0255.f522.m1559(m23716);
                    }
                } catch (Exception unused8) {
                }
                return intValue;
            }
            C0311 c0311 = (C0311) m1958.getFirst();
            if (c0311 == null) {
                try {
                    File m23717 = C0449.f1059.m2371();
                    if (m23717.exists()) {
                        C0255.f522.m1559(m23717);
                    }
                } catch (Exception unused9) {
                }
                return -3;
            }
            PackageInfo packageInfo = c0311.f732;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : c0154.entrySet()) {
                Pair pair2 = (Pair) entry.getValue();
                File m2374 = C0449.f1059.m2374(packageInfo.packageName, "split_" + ((PackageParser.ApkLite) pair2.getSecond()).splitName + ".apk");
                arrayList.add(m2374.getAbsolutePath());
                C0255 c0255 = C0255.f522;
                c0255.m1527((File) pair2.getFirst(), m2374, false);
                if (C0175.f274) {
                    c0255.m1535(m2374, C0255.C0256.f539);
                }
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            File file4 = new File(applicationInfo.nativeLibraryDir);
            for (Map.Entry entry2 : c0154.entrySet()) {
                Pair pair3 = (Pair) entry2.getValue();
                if (!C0175.f260 || ((PackageParser.ApkLite) pair3.getSecond()).extractNativeLibs) {
                    m1954(this, (File) pair3.getFirst(), file4, false, 4, (Object) null);
                } else {
                    Objects.toString(pair3.getFirst());
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            applicationInfo.splitSourceDirs = strArr;
            applicationInfo.splitPublicSourceDirs = strArr;
            String[] strArr2 = (String[]) c0154.m733().m769().toArray(new String[0]);
            packageInfo.splitNames = strArr2;
            if (C0175.f262) {
                applicationInfo.splitNames = strArr2;
            }
            if (C0175.f259) {
                int length = strArr2.length;
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    Pair pair4 = (Pair) c0154.get(strArr2[i2]);
                    if (pair4 != null) {
                        PackageParser.ApkLite apkLite3 = (PackageParser.ApkLite) pair4.getSecond();
                        if (apkLite3 != null) {
                            i = apkLite3.revisionCode;
                            iArr[i2] = i;
                        }
                    }
                    i = 0;
                    iArr[i2] = i;
                }
                packageInfo.splitRevisionCodes = iArr;
            }
            m1959(c0311, ((Boolean) m1958.getThird()).booleanValue());
            try {
                File m23718 = C0449.f1059.m2371();
                if (m23718.exists()) {
                    C0255.f522.m1559(m23718);
                }
            } catch (Exception unused10) {
            }
            return 1;
        } catch (Throwable unused11) {
            try {
                File m23719 = C0449.f1059.m2371();
                if (!m23719.exists()) {
                    return -1;
                }
                C0255.f522.m1559(m23719);
                return -1;
            } catch (Exception unused12) {
                return -1;
            }
        }
    }

    /* renamed from: ֈ */
    public final int m2003(@Nullable String str) {
        if (str == null) {
            return -2;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return -2;
            }
            Triple<C0311, Integer, Boolean> m1958 = m1958(file);
            if (((Number) m1958.getSecond()).intValue() != 1) {
                return ((Number) m1958.getSecond()).intValue();
            }
            Object first = m1958.getFirst();
            Intrinsics.checkNotNull(first);
            m1959((C0311) first, ((Boolean) m1958.getThird()).booleanValue());
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    /* renamed from: Ԯ */
    public final ProviderInfo m2006(@Nullable String str) {
        ProviderInfo providerInfo;
        if (str != null) {
            try {
                providerInfo = f769.get(str);
            } catch (Exception unused) {
                return null;
            }
        } else {
            providerInfo = null;
        }
        return providerInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 != null) goto L11;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: ހ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] m2012(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            lu.die.foza.SleepyFox.ބ<java.lang.String, lu.die.foza.SleepyFox.ࢶ> r0 = lu.die.foza.SleepyFox.C0325.f768     // Catch: java.lang.Exception -> L3c
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3c
            lu.die.foza.SleepyFox.ࢶ r0 = (lu.die.foza.SleepyFox.C0311) r0     // Catch: java.lang.Exception -> L3c
            r1 = r0
            r5 = r1
            if (r0 == 0) goto L2d
            r0 = r5
            lu.die.foza.SleepyFox.ޅ<java.lang.String> r0 = r0.f736     // Catch: java.lang.Exception -> L3c
            r1 = r0
            r5 = r1
            if (r0 == 0) goto L2d
            r0 = r5
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Exception -> L3c
            r1 = r0
            r5 = r1
            if (r0 == 0) goto L2d
            goto L3a
        L2d:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L3c
            r1 = r0
            r5 = r1
            r1 = 0
            java.lang.String r2 = lu.die.foza.SleepyFox.C0281.C0289.m1746()     // Catch: java.lang.Exception -> L3c
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.Exception -> L3c
            r3 = r1; r1 = r2; r2 = r3;      // Catch: java.lang.Exception -> L3c
            r0[r1] = r2     // Catch: java.lang.Exception -> L3c
        L3a:
            r0 = r5
            return r0
        L3c:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            java.lang.String r2 = lu.die.foza.SleepyFox.C0281.C0289.m1746()
            r3 = 0
            r4 = r2; r2 = r3; r3 = r4; 
            r1[r2] = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0325.m2012(java.lang.String):java.lang.String[]");
    }

    /* renamed from: Ϳ */
    public final void m1948(ComponentInfo componentInfo, ApplicationInfo applicationInfo) {
        if (componentInfo.packageName == null) {
            componentInfo.packageName = applicationInfo.packageName;
        }
        String str = componentInfo.processName;
        if (str == null || str.length() == 0) {
            String str2 = applicationInfo.processName;
            if (!(str2 == null || str2.length() == 0)) {
                componentInfo.processName = str2;
            } else {
                componentInfo.processName = applicationInfo.packageName;
            }
        }
        componentInfo.applicationInfo = applicationInfo;
        String str3 = componentInfo.name;
        if (str3 == null || !StringsKt.startsWith$default(str3, '.', false, 2, (Object) null)) {
            return;
        }
        componentInfo.name = applicationInfo.packageName + componentInfo.name;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[Catch: Exception -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0075, blocks: (B:2:0x0000, B:3:0x0007, B:9:0x0016, B:12:0x001d, B:14:0x0023, B:15:0x0028, B:17:0x002e, B:20:0x0039, B:23:0x0048, B:26:0x0052, B:28:0x005d, B:29:0x0063, B:31:0x0079, B:34:0x0084, B:41:0x00a2, B:44:0x00ac, B:45:0x00b5, B:48:0x00cc), top: B:1:0x0000 }] */
    /* renamed from: ׯ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1951() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0325.m1951():void");
    }

    /* renamed from: ֈ */
    public static final void m1963() {
        try {
            f768.clear();
            f769.clear();
            f770.clear();
            f771.close();
            C0449.f1059.getClass();
            File[] listFiles = C0449.f1060.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                File m2378 = C0449.f1059.m2378(file);
                if (m2378.exists()) {
                    m2378.delete();
                }
            }
            f765.m1990();
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԭ */
    public static final void m1971() {
        C0276.m1702();
        f771.open();
        f765.m1961();
        C0346 c0346 = C0346.f821;
        c0346.getClass();
        try {
            c0346.m2136();
        } catch (Exception unused) {
        }
        BinderC0231 binderC0231 = BinderC0231.f444;
        binderC0231.m1357();
        binderC0231.m1359();
    }

    /* renamed from: ؠ */
    public final void m1976() {
        try {
            f771.block(C0281.C0289.f682);
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* renamed from: Ԯ */
    public final C0154<String, C0311> m1977() {
        return f768;
    }

    /* renamed from: ԭ */
    public final void m1990() {
        try {
            if (Debug.isDebuggerConnected()) {
                f771.open();
            } else {
                C0276.f576.m1722(this::m1952);
            }
        } catch (Exception unused) {
            f771.open();
        }
    }

    /* renamed from: Ԩ */
    public final void m1998() {
        try {
            for (String str : f768.m733().m769()) {
                m1997(str);
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* renamed from: Ԫ */
    public final String m2011(@NotNull String str, @NotNull String str2) {
        try {
            C0311 c0311 = f768.get(str);
            if (c0311 != null && c0311.f736.contains(str2)) {
                return str2;
            }
            return C0281.C0289.m1746();
        } catch (Exception unused) {
            return C0281.C0289.m1746();
        }
    }

    /* renamed from: Ϳ */
    public final void m1943(String str, boolean z) {
        try {
            C0276 c0276 = C0276.f576;
            c0276.m1722(() -> {
                m1964(r4);
            });
            c0276.m1722(() -> {
                m1965(r2);
            });
            if (z) {
                c0276.m1722(this::m1962);
            }
            if (!C0175.f262) {
                return;
            }
            C0220.f323.getClass();
            C0220.f324.m1224(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֏ */
    public final void m1960() {
        try {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeParcelableArray((Parcelable[]) f770.toArray(new ComponentName[0]), 0);
                byte[] marshall = obtain.marshall();
                FileOutputStream fileOutputStream = new FileOutputStream(C0449.f1059.m2372());
                fileOutputStream.write(marshall);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
            } catch (Exception unused) {
            }
            obtain.recycle();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: ԩ */
    public static final void m1972(String str, String str2) {
        C0164<String> c0164;
        C0045.f123.m432(str, str2);
        C0311 c0311 = f768.get(str);
        if (c0311 == null || (c0164 = c0311.f736) == null) {
            return;
        }
        c0164.remove(str2);
    }

    /* renamed from: ԫ */
    public final void m1999(@NotNull String str, @NotNull String str2) {
        try {
            C0154<String, C0311> c0154 = f768;
            C0311 c0311 = c0154.get(str);
            if (c0311 == null) {
                PackageInfo m1918 = C0323.f761.m1918(str, 0);
                if (m1918 == null) {
                    return;
                }
                C0311 c03112 = new C0311(m1918);
                c03112.f733 = true;
                c03112.f736.add(str2);
                c0154.put(str, c03112);
            } else {
                c0311.f736.add(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԯ */
    public final void m1962() {
        try {
            C0164 c0164 = new C0164(f768.m733().m769());
            Iterator<ComponentName> it = f770.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!c0164.contains(it.next().getPackageName())) {
                    it.remove();
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            m1960();
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* renamed from: Ԫ */
    public final ServiceInfo m1984(@Nullable ComponentName componentName, int i) {
        if (componentName == null) {
            return null;
        }
        try {
            C0311 c0311 = f768.get(componentName.getPackageName());
            if (c0311 == null) {
                return null;
            }
            if (c0311.f733) {
                return C0323.f761.m1923(componentName, i);
            }
            return (ServiceInfo) c0311.f735.m1603(componentName.getClassName());
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ԩ */
    public final Object m1934() {
        try {
            C0344<Object> c0344 = f766;
            Object[] objArr = new Object[1];
            objArr[0] = "package";
            Object m2127 = c0344.m2127(null, objArr);
            Class<?> cls = Class.forName("android.content.pm.IPackageManager$Stub$Proxy");
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = IBinder.class;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(m2127);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static final void m1965(String str) {
        C0346.f821.m2133(str);
    }

    /* renamed from: Ԩ */
    public final void m2000(@NotNull String str, @NotNull String str2) {
        try {
            C0276.f576.m1722(() -> {
                m1972(r1, r2);
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final int m1953(File file, File file2, boolean z) {
        try {
            NativeLibraryHelper.Handle create = NativeLibraryHelper.Handle.create(file);
            C0341 c0341 = C0341.f812;
            int findSupportedAbi = c0341.m2087() ? NativeLibraryHelper.findSupportedAbi(create, Build.SUPPORTED_64_BIT_ABIS) : NativeLibraryHelper.findSupportedAbi(create, Build.SUPPORTED_32_BIT_ABIS);
            if (findSupportedAbi >= 0 && !z) {
                NativeLibraryHelper.copyNativeBinaries(create, file2, c0341.m2087() ? Build.SUPPORTED_64_BIT_ABIS[findSupportedAbi] : Build.SUPPORTED_32_BIT_ABIS[findSupportedAbi]);
            }
            return findSupportedAbi;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    /* renamed from: ԩ */
    public final ActivityInfo m1987(@Nullable ComponentName componentName, int i) {
        if (componentName == null) {
            return null;
        }
        try {
            C0311 c0311 = f768.get(componentName.getPackageName());
            if (c0311 == null) {
                return null;
            }
            if (c0311.f733) {
                return C0323.f761.m1920(componentName, i);
            }
            return (ActivityInfo) c0311.f735.m1603(componentName.getClassName());
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final PackageInfo m1989(@Nullable String str, int i) {
        try {
            C0311 c0311 = f768.get(str);
            if (c0311 == null) {
                return null;
            }
            if (c0311.f733) {
                return C0323.f761.m1918(str, i);
            }
            return C0323.f761.m1928(c0311.f732, i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ int m1954(C0325 c0325, File file, File file2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c0325.m1953(file, file2, z);
    }

    /* renamed from: ՠ */
    public final void m1975() {
        C0276.f576.m1722(C0325::m1963);
    }

    /* renamed from: ԫ */
    public final void m1952() {
        C0276 c0276;
        Runnable runnable;
        try {
            C0449.f1059.getClass();
            File[] fileArr = (File[]) m1937((C0325) C0449.f1060.listFiles());
            boolean z = true;
            if (fileArr != null) {
                Iterator it = ArrayIteratorKt.iterator(fileArr);
                while (it.hasNext()) {
                    File file = (File) it.next();
                    try {
                        if (file.isDirectory()) {
                            File m2378 = C0449.f1059.m2378(file);
                            try {
                                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                if (m2378.exists()) {
                                    FileInputStream fileInputStream = new FileInputStream(m2378);
                                    byte[] readBytes = ByteStreamsKt.readBytes(fileInputStream);
                                    CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                                    Parcel obtain = Parcel.obtain();
                                    obtain.unmarshall(readBytes, 0, readBytes.length);
                                    obtain.setDataPosition(0);
                                    try {
                                        C0311.CREATOR.getClass();
                                        objectRef.element = new C0311(obtain);
                                    } catch (Throwable unused) {
                                    }
                                    obtain.recycle();
                                }
                                Object obj = objectRef.element;
                                if (obj == null) {
                                    z = false;
                                    c0276 = C0276.f576;
                                    runnable = () -> {
                                        m1969(r1);
                                    };
                                } else {
                                    String str = ((C0311) obj).f732.packageName;
                                    f768.put(str, obj);
                                    if (((C0311) objectRef.element).f733) {
                                        try {
                                            if (C0323.f761.m1918(str, 0) == null) {
                                                m1994(str);
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    } else {
                                        c0276 = C0276.f576;
                                        runnable = () -> {
                                            m1970(r1);
                                        };
                                    }
                                }
                                c0276.m1726(runnable);
                            } catch (Exception unused3) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                    } catch (Exception unused4) {
                    }
                }
            }
            if (z) {
                m1951();
            }
            new Thread(C0325::m1971).start();
        } catch (Exception unused5) {
            f771.open();
        }
    }

    /* renamed from: Ԫ */
    public final void m1961() {
        try {
            File m2372 = C0449.f1059.m2372();
            if (!m2372.exists()) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(m2372);
            byte[] readBytes = ByteStreamsKt.readBytes(fileInputStream);
            CloseableKt.closeFinally(fileInputStream, (Throwable) null);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(readBytes, 0, readBytes.length);
                obtain.setDataPosition(0);
                Parcelable[] readParcelableArray = obtain.readParcelableArray(ComponentName.class.getClassLoader());
                if (readParcelableArray != null) {
                    for (Parcelable parcelable : readParcelableArray) {
                        if (parcelable instanceof ComponentName) {
                            f770.add(parcelable);
                            C0311 c0311 = f768.get(((ComponentName) parcelable).getPackageName());
                            if (c0311 != null) {
                                ComponentInfo componentInfo = (ComponentInfo) c0311.f735.m1603(((ComponentName) parcelable).getClassName());
                                if (componentInfo != null) {
                                    componentInfo.enabled = true;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            obtain.recycle();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ϳ */
    public final void m2013(@NotNull String str, @NotNull String str2) {
        try {
            m1999(str, str2);
            C0045.f123.m431(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final void m1996() {
        try {
            C0276.f576.m1722(this::m1998);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ԫ */
    public final void m1945(PackageInfo packageInfo) {
        try {
            Intent intent = new Intent("android.intent.action.PACKAGE_REPLACED");
            intent.setData(Uri.parse(C0417.f1016 + packageInfo.packageName));
            C0265.m1657(C0265.f550, intent, (String) null, 2, (Object) null);
            C0313.f737.m1866(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԩ */
    public final void m1947(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.PACKAGE_REMOVED");
            intent.setData(Uri.parse(C0417.f1016 + packageInfo.packageName));
            C0265.m1657(C0265.f550, intent, (String) null, 2, (Object) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ */
    public final ApplicationInfo m1955(ApplicationInfo applicationInfo) {
        C0496 c0496 = C0496.f1092;
        String m2464 = c0496.m2464(applicationInfo.sourceDir);
        applicationInfo.sourceDir = m2464;
        applicationInfo.publicSourceDir = m2464;
        applicationInfo.nativeLibraryDir = c0496.m2464(applicationInfo.nativeLibraryDir);
        return applicationInfo;
    }

    @Nullable
    /* renamed from: Ԩ */
    public final ProviderInfo m1985(@Nullable ComponentName componentName, int i) {
        if (componentName == null) {
            return null;
        }
        try {
            C0311 c0311 = f768.get(componentName.getPackageName());
            if (c0311 == null) {
                return null;
            }
            if (c0311.f733) {
                return C0323.f761.m1922(componentName, i);
            }
            return (ProviderInfo) c0311.f735.m1603(componentName.getClassName());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0383, code lost:
        if (r0 != null) goto L142;
     */
    /* renamed from: Ϳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1949(lu.die.foza.SleepyFox.C0311 r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0325.m1949(lu.die.foza.SleepyFox.ࢶ, java.lang.Integer):void");
    }

    @Nullable
    /* renamed from: ԩ */
    public final List<ResolveInfo> m1981(@Nullable Intent intent, @Nullable String str, int i) {
        if (intent == null) {
            return null;
        }
        try {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                componentName = selector != null ? selector.getComponent() : null;
            }
            if (componentName != null) {
                C0311 c0311 = f768.get(componentName.getPackageName());
                if (c0311 == null || c0311.f733) {
                    return null;
                }
                ActivityInfo activityInfo = (ActivityInfo) c0311.f735.m1603(componentName.getClassName());
                ArrayList arrayList = new ArrayList();
                if (activityInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = activityInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                C0311 c03112 = f768.get(str2);
                if (c03112 == null) {
                    return null;
                }
                C0296.C0298 c0298 = c03112.f734;
                return c0298 != null ? c0298.f715.m2334(intent, str, i) : null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, C0311> entry : f768.entrySet()) {
                C0296.C0298 c02982 = entry.getValue().f734;
                if (c02982 != null) {
                    arrayList2.addAll(c02982.f715.m2334(intent, str, i));
                } else if (entry.getValue().f733) {
                    List<ResolveInfo> m1913 = C0323.f761.m1913(new Intent(intent).setPackage(entry.getKey()), i);
                    if (m1913 != null) {
                        arrayList2.addAll(m1913);
                    }
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԫ */
    public final List<ResolveInfo> m1983(@Nullable Intent intent, @Nullable String str, int i) {
        if (intent == null) {
            return null;
        }
        try {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                componentName = selector != null ? selector.getComponent() : null;
            }
            if (componentName != null) {
                C0311 c0311 = f768.get(componentName.getPackageName());
                if (c0311 == null || c0311.f733) {
                    return null;
                }
                ServiceInfo serviceInfo = (ServiceInfo) c0311.f735.m1603(componentName.getClassName());
                ArrayList arrayList = new ArrayList();
                if (serviceInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.serviceInfo = serviceInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                C0311 c03112 = f768.get(str2);
                if (c03112 == null) {
                    return null;
                }
                C0296.C0298 c0298 = c03112.f734;
                return c0298 != null ? c0298.f716.m2334(intent, str, i) : null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, C0311> entry : f768.entrySet()) {
                C0296.C0298 c02982 = entry.getValue().f734;
                if (c02982 != null) {
                    arrayList2.addAll(c02982.f716.m2334(intent, str, i));
                } else if (entry.getValue().f733) {
                    List<ResolveInfo> m1915 = C0323.f761.m1915(new Intent(intent).setPackage(entry.getKey()), i);
                    if (m1915 != null) {
                        arrayList2.addAll(m1915);
                    }
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ԩ */
    public final int m2001(@Nullable String str, boolean z) {
        if (str == null) {
            return -3;
        }
        try {
            PackageInfo m1918 = C0323.f761.m1918(str, 0);
            if (m1918 == null) {
                return -4;
            }
            if (z) {
                return m2003(m1918.applicationInfo.sourceDir);
            }
            C0265.f550.m1676(str, (String) null);
            C0311 c0311 = new C0311(m1918);
            c0311.f733 = true;
            C0449.f1059.m2379(m1918.packageName);
            C0311 put = f768.put(m1918.packageName, c0311);
            C0164<String> c0164 = put != null ? put.f736 : null;
            if (!(c0164 == null || c0164.isEmpty())) {
                c0311.f736.m784(c0164);
            } else {
                c0311.f736.add(C0281.C0289.m1746());
            }
            C0045.f123.m433(m1918.packageName);
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: ԫ */
    public final void m2008(@Nullable ComponentName componentName, int i) {
        if (componentName == null) {
            return;
        }
        try {
            if (i != 1) {
                C0164<ComponentName> c0164 = f770;
                if (!c0164.contains(componentName)) {
                    return;
                }
                c0164.remove(componentName);
                m1960();
                return;
            }
            C0164<ComponentName> c01642 = f770;
            if (c01642.contains(componentName)) {
                return;
            }
            c01642.add(componentName);
            C0311 c0311 = f768.get(componentName.getPackageName());
            if (c0311 != null && !c0311.f733) {
                ComponentInfo componentInfo = (ComponentInfo) c0311.f735.m1603(componentName.getClassName());
                if (componentInfo != null) {
                    componentInfo.enabled = true;
                }
            }
            m1960();
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԩ */
    public static /* synthetic */ List m1940(C0325 c0325, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0325.m1981(intent, str, i);
    }

    /* renamed from: Ԫ */
    public static /* synthetic */ List m1942(C0325 c0325, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0325.m1983(intent, str, i);
    }

    /* renamed from: Ԩ */
    public static final void m1969(File file) {
        try {
            String name = file.getName();
            C0449 c0449 = C0449.f1059;
            File m2375 = c0449.m2375(name);
            if (m2375.exists()) {
                File m2370 = c0449.m2370(name);
                FileInputStream fileInputStream = new FileInputStream(m2375);
                FileOutputStream fileOutputStream = new FileOutputStream(m2370);
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, fileOutputStream, 0, 2, (Object) null);
                    CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                    fileOutputStream.close();
                    C0325 c0325 = f765;
                    if (c0325.m2003(m2370.getAbsolutePath()) < 0) {
                        c0325.m1994(name);
                    }
                } catch (Exception unused) {
                }
                if (m2370.exists()) {
                    m2370.delete();
                }
            } else {
                C0325 c03252 = f765;
                if (c03252.m2001(name, false) < 0) {
                    c03252.m1994(name);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ԩ */
    public final void m1946(PackageInfo packageInfo) {
        try {
            Intent intent = new Intent("android.intent.action.PACKAGE_ADDED");
            intent.setData(Uri.parse(C0417.f1016 + packageInfo.packageName));
            C0265.m1657(C0265.f550, intent, (String) null, 2, (Object) null);
            C0313.f737.m1866(intent);
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final List<ResolveInfo> m1982(@Nullable Intent intent, @Nullable String str, int i) {
        if (intent == null) {
            return null;
        }
        try {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                componentName = selector != null ? selector.getComponent() : null;
            }
            if (componentName != null) {
                C0311 c0311 = f768.get(componentName.getPackageName());
                if (c0311 == null || c0311.f733) {
                    return null;
                }
                ProviderInfo providerInfo = (ProviderInfo) c0311.f735.m1603(componentName.getClassName());
                ArrayList arrayList = new ArrayList();
                if (providerInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.providerInfo = providerInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                C0311 c03112 = f768.get(str2);
                if (c03112 == null) {
                    return null;
                }
                C0296.C0298 c0298 = c03112.f734;
                return c0298 != null ? c0298.f717.m2334(intent, str, i) : null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, C0311> entry : f768.entrySet()) {
                C0296.C0298 c02982 = entry.getValue().f734;
                if (c02982 != null) {
                    arrayList2.addAll(c02982.f717.m2334(intent, str, i));
                } else if (entry.getValue().f733) {
                    List<ResolveInfo> m1916 = C0323.f761.m1916(new Intent(intent).setPackage(entry.getKey()), i);
                    if (m1916 != null) {
                        arrayList2.addAll(m1916);
                    }
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ void m1950(C0325 c0325, C0311 c0311, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        c0325.m1949(c0311, num);
    }

    /* renamed from: Ϳ */
    public static final void m1968(Integer num, PackageInfo packageInfo) {
        if (num != null && num.intValue() == 1) {
            f765.m1946(packageInfo);
        } else if (num == null || num.intValue() != 2) {
        } else {
            f765.m1945(packageInfo);
        }
    }

    /* renamed from: Ϳ */
    public final int m1957(PackageInfo packageInfo) {
        int m1956;
        if (C0309.f727.m1846(packageInfo.packageName)) {
            m1956 = m1956("com.google");
        } else {
            String str = packageInfo.sharedUserId;
            m1956 = !(str == null || str.length() == 0) ? m1956(packageInfo.sharedUserId) : m1956(packageInfo.packageName);
        }
        return (m1956 % 7000) + 13000;
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ActivityInfo m1986(@Nullable ComponentName componentName, int i) {
        if (componentName == null) {
            return null;
        }
        try {
            C0311 c0311 = f768.get(componentName.getPackageName());
            if (c0311 == null) {
                return null;
            }
            if (c0311.f733) {
                return C0323.f761.m1921(componentName, i);
            }
            return (ActivityInfo) c0311.f735.m1603(componentName.getClassName());
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ApplicationInfo m1988(@Nullable String str, int i) {
        if (str == null) {
            return null;
        }
        try {
            C0311 c0311 = f768.get(str);
            if (c0311 == null) {
                return null;
            }
            if (c0311.f733) {
                return C0323.f761.m1927(str, i);
            }
            return c0311.f732.applicationInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ԩ */
    public static /* synthetic */ List m1941(C0325 c0325, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0325.m1982(intent, str, i);
    }

    @Nullable
    /* renamed from: Ϳ */
    public final List<PackageInfo> m1978(boolean z, int i) {
        try {
            C0154<String, C0311> c0154 = f768;
            ArrayList arrayList = new ArrayList(c0154.f205);
            for (Map.Entry<String, C0311> entry : c0154.entrySet()) {
                C0311 value = entry.getValue();
                PackageInfo packageInfo = value.f732;
                if (z || !value.f733) {
                    try {
                        arrayList.add(C0323.f761.m1928(packageInfo, i));
                    } catch (Exception unused) {
                    }
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԩ */
    public final ServiceInfo m2005(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                componentName = selector != null ? selector.getComponent() : null;
            }
            if (componentName != null) {
                ServiceInfo m1984 = m1984(componentName, C0255.C0256.f530);
                return m1984 != null ? m1984 : C0323.f761.m1923(componentName, C0255.C0256.f530);
            }
            if (intent.getPackage() == null) {
                intent.toString();
            }
            try {
                List m1942 = m1942(this, intent, null, 0, 6, null);
                if (!(m1942 == null || m1942.isEmpty())) {
                    return ((ResolveInfo) m1942.get(0)).serviceInfo;
                }
            } catch (Exception unused) {
            }
            List<ResolveInfo> m1915 = C0323.f761.m1915(intent, 131072);
            if (m1915 == null || m1915.isEmpty()) {
                return null;
            }
            return m1915.get(0).serviceInfo;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: Ԩ */
    public static final void m1973(C0311 c0311, boolean z) {
        f765.m1949(c0311, Integer.valueOf(z ? 1 : 2));
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ List m1938(C0325 c0325, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c0325.m1978(z, i);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x00b5 -> B:36:0x00cc). Please submit an issue!!! */
    /* renamed from: Ϳ */
    public final Triple<C0311, Integer, Boolean> m1958(File file) {
        try {
            PackageManager packageManager = C0276.m1701().getPackageManager();
            Objects.toString(file);
            PackageInfo packageArchiveInfo = C0175.f264 ? packageManager.getPackageArchiveInfo(file.getAbsolutePath(), -2013245376) : packageManager.getPackageArchiveInfo(file.getAbsolutePath(), -2147463104);
            if (packageArchiveInfo == null) {
                packageArchiveInfo = C0323.f761.m1924(file.getAbsolutePath());
            }
            if (packageArchiveInfo == null) {
                return new Triple<>((Object) null, -4, Boolean.FALSE);
            }
            if (packageArchiveInfo.applicationInfo == null) {
                return new Triple<>((Object) null, -5, Boolean.FALSE);
            }
            C0265.f550.m1676(packageArchiveInfo.packageName, (String) null);
            boolean z = false;
            C0164<String> c0164 = null;
            try {
                C0311 c0311 = f768.get(packageArchiveInfo.packageName);
                long currentTimeMillis = System.currentTimeMillis();
                if (c0311 != null) {
                    packageArchiveInfo.firstInstallTime = c0311.f732.firstInstallTime;
                    c0164 = c0311.f736;
                } else {
                    z = true;
                    packageArchiveInfo.firstInstallTime = currentTimeMillis;
                }
                PackageInfo packageInfo = packageArchiveInfo;
                packageInfo.lastUpdateTime = currentTimeMillis;
                packageInfo.installLocation = 0;
            } catch (Exception unused) {
            }
            C0346 c0346 = C0346.f821;
            c0346.getClass();
            try {
                c0346.m2136();
            } catch (Exception unused2) {
            }
            PackageInfo packageInfo2 = packageArchiveInfo;
            C0449 c0449 = C0449.f1059;
            c0449.m2379(packageArchiveInfo.packageName);
            ApplicationInfo applicationInfo = new ApplicationInfo(packageInfo2.applicationInfo);
            C0276.f576.getClass();
            applicationInfo.uid = C0276.f584;
            boolean z2 = !C0175.f260 || (applicationInfo.flags & 268435456) != 0;
            PackageInfo packageInfo3 = packageArchiveInfo;
            File m2375 = c0449.m2375(packageArchiveInfo.packageName);
            applicationInfo.sourceDir = m2375.getAbsolutePath();
            C0311 c03112 = new C0311(packageArchiveInfo);
            packageInfo3.applicationInfo = applicationInfo;
            applicationInfo.publicSourceDir = applicationInfo.sourceDir;
            if (C0175.f270) {
                String[] strArr = new String[2];
                strArr[0] = "/system/framework/org.apache.http.legacy.jar";
                strArr[1] = "/system/framework/android.test.base.jar";
                applicationInfo.sharedLibraryFiles = strArr;
            } else if (C0175.f271) {
                String[] strArr2 = new String[1];
                strArr2[0] = "/system/framework/org.apache.http.legacy.jar";
                applicationInfo.sharedLibraryFiles = strArr2;
            } else if (C0175.f264) {
                String[] strArr3 = new String[1];
                strArr3[0] = "/system/framework/org.apache.http.legacy.boot.jar";
                applicationInfo.sharedLibraryFiles = strArr3;
            }
            File m2376 = c0449.m2376(packageArchiveInfo.packageName);
            applicationInfo.nativeLibraryDir = m2376.getAbsolutePath();
            String str = applicationInfo.processName;
            if (str == null || str.length() == 0) {
                applicationInfo.processName = packageArchiveInfo.packageName;
            }
            String m421 = C0045.m421(applicationInfo.packageName, C0281.C0289.m1746());
            applicationInfo.dataDir = m421;
            if (C0175.f261) {
                applicationInfo.deviceProtectedDataDir = m421;
                try {
                    C0047.f129.m464((Object) applicationInfo, "credentialProtectedDataDir", (Object) m421);
                } catch (Exception unused3) {
                }
            }
            try {
                C0047 c0047 = C0047.f129;
                String parent = m2375.getParent();
                String str2 = parent;
                if (parent == null) {
                    str2 = "/";
                }
                c0047.m464((Object) applicationInfo, "scanSourceDir", (Object) str2);
                String parent2 = m2375.getParent();
                String str3 = parent2;
                if (parent2 == null) {
                    str3 = "/";
                }
                c0047.m464((Object) applicationInfo, "scanPublicSourceDir", (Object) str3);
            } catch (Exception unused4) {
            }
            File m23752 = C0449.f1059.m2375(packageArchiveInfo.packageName);
            C0255 c0255 = C0255.f522;
            c0255.m1527(file, m23752, false);
            if (C0175.f274) {
                c0255.m1535(m23752, C0255.C0256.f539);
            }
            try {
                int m1954 = z2 ? m1954(this, file, m2376, false, 4, (Object) null) : m1953(file, m2376, true);
                if (m1954 < 0) {
                    m1954 = 0;
                }
                C0047.f129.m464((Object) applicationInfo, "primaryCpuAbi", (Object) (C0341.f812.m2087() ? Build.SUPPORTED_64_BIT_ABIS[m1954] : Build.SUPPORTED_32_BIT_ABIS[m1954]));
            } catch (Exception unused5) {
            }
            try {
                m1955(applicationInfo);
            } catch (Throwable unused6) {
            }
            C0164<String> c01642 = c0164;
            PackageInfo packageInfo4 = packageArchiveInfo;
            C0154<String, C0311> c0154 = f768;
            String str4 = packageInfo4.packageName;
            if (!(c01642 == null || c0164.isEmpty())) {
                c03112.f736.m784(c0164);
            } else {
                c03112.f736.add(C0281.C0289.f679);
            }
            c0154.put(str4, c03112);
            C0045.f123.m433(packageArchiveInfo.packageName);
            return new Triple<>(c03112, 1, Boolean.valueOf(z));
        } catch (Exception unused7) {
            return new Triple<>((Object) null, -1, Boolean.FALSE);
        }
    }

    /* renamed from: Ϳ */
    public final boolean m2009(@Nullable ComponentName componentName) {
        boolean contains;
        if (componentName != null) {
            try {
                contains = f770.contains(componentName);
            } catch (Exception unused) {
                return false;
            }
        } else {
            contains = false;
        }
        return contains;
    }

    /* renamed from: Ϳ */
    public static final void m1970(Ref.ObjectRef objectRef) {
        m1950(f765, (C0311) objectRef.element, (Integer) null, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0048 A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: Ϳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.content.pm.ProviderInfo> m2010(@org.jetbrains.annotations.Nullable java.lang.String r5, int r6, @org.jetbrains.annotations.Nullable java.lang.String r7) {
        /*
            r4 = this;
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le9
            r2 = r1
            r4 = r2
            r1.<init>()     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto L1c
            r0 = r5
            int r0 = r0.length()     // Catch: java.lang.Exception -> Le9
            if (r0 != 0) goto L18
            goto L1c
        L18:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L22
            r0 = r4
            return r0
        L22:
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r7
            int r0 = r0.length()     // Catch: java.lang.Exception -> Le9
            if (r0 != 0) goto L32
            goto L37
        L32:
            r0 = 0
            r6 = r0
            goto L39
        L37:
            r0 = 1
            r6 = r0
        L39:
            lu.die.foza.SleepyFox.ބ<java.lang.String, lu.die.foza.SleepyFox.ࢶ> r0 = lu.die.foza.SleepyFox.C0325.f768     // Catch: java.lang.Exception -> Le9
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> Le9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Le9
            r8 = r0
        L48:
            r0 = r8
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto Le7
            r0 = r8
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> Le9
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> Le9
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Le9
            lu.die.foza.SleepyFox.ࢶ r0 = (lu.die.foza.SleepyFox.C0311) r0     // Catch: java.lang.Exception -> Le9
            android.content.pm.PackageInfo r0 = r0.f732     // Catch: java.lang.Exception -> Le9
            android.content.pm.ProviderInfo[] r0 = r0.providers     // Catch: java.lang.Exception -> Le9
            r1 = r0
            r9 = r1
            if (r0 == 0) goto L85
            r0 = r9
            int r0 = r0.length     // Catch: java.lang.Exception -> Le9
            if (r0 != 0) goto L7a
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            if (r0 == 0) goto L81
            goto L85
        L81:
            r0 = 0
            goto L86
        L85:
            r0 = 1
        L86:
            if (r0 != 0) goto L48
            r0 = r9
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r0)     // Catch: java.lang.Exception -> Le9
            r9 = r0
        L90:
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto L48
            r0 = r9
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> Le9
            android.content.pm.ProviderInfo r0 = (android.content.pm.ProviderInfo) r0     // Catch: java.lang.Exception -> Le9
            r1 = r0
            r10 = r1
            java.lang.String r0 = r0.processName     // Catch: java.lang.Exception -> Le9
            r1 = r5
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto L90
            r0 = r6
            if (r0 != 0) goto Ld2
            r0 = r10
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> Le9
            r1 = r0
            r11 = r1
            if (r0 == 0) goto Lce
            r0 = r11
            r1 = r7
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Exception -> Le9
            r1 = 1
            if (r0 != r1) goto Lce
            r0 = 1
            goto Lcf
        Lce:
            r0 = 0
        Lcf:
            if (r0 == 0) goto L90
        Ld2:
            r0 = r4
            android.content.pm.ProviderInfo r1 = new android.content.pm.ProviderInfo     // Catch: java.lang.Exception -> Le9
            r2 = r1
            r11 = r2
            r2 = r10
            r1.<init>(r2)     // Catch: java.lang.Exception -> Le9
            r1 = r11
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> Le9
            goto L90
        Le7:
            r0 = r4
            return r0
        Le9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0325.m2010(java.lang.String, int, java.lang.String):java.util.List");
    }

    @Nullable
    /* renamed from: Ϳ */
    public final List<ResolveInfo> m1980(@Nullable Intent intent, @Nullable String str, int i) {
        if (intent == null) {
            return null;
        }
        try {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                componentName = selector != null ? selector.getComponent() : null;
            }
            if (componentName != null) {
                C0311 c0311 = f768.get(componentName.getPackageName());
                if (c0311 == null || c0311.f733) {
                    return null;
                }
                ActivityInfo activityInfo = (ActivityInfo) c0311.f735.m1603(componentName.getClassName());
                ArrayList arrayList = new ArrayList();
                if (activityInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = activityInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                C0311 c03112 = f768.get(str2);
                if (c03112 == null) {
                    return null;
                }
                C0296.C0298 c0298 = c03112.f734;
                return c0298 != null ? c0298.f714.m2334(intent, str, i) : null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, C0311> entry : f768.entrySet()) {
                C0296.C0298 c02982 = entry.getValue().f734;
                if (c02982 != null) {
                    arrayList2.addAll(c02982.f714.m2334(intent, str, i));
                } else if (entry.getValue().f733) {
                    List<ResolveInfo> m1914 = C0323.f761.m1914(new Intent(intent).setPackage(entry.getKey()), i);
                    if (m1914 != null) {
                        arrayList2.addAll(m1914);
                    }
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ List m1939(C0325 c0325, Intent intent, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 131072;
        }
        return c0325.m1980(intent, str, i);
    }

    @NotNull
    /* renamed from: Ϳ */
    public final List<String> m2007(@NotNull String str, int i, int i2) {
        try {
            C0164 c0164 = new C0164(1, false);
            C0276.f576.getClass();
            if (i == C0276.f584) {
                if (i2 >= 0) {
                    String m1683 = C0265.f550.m1683(i2);
                    if (m1683 != null) {
                        c0164.add(m1683);
                    }
                }
                int m1993 = m1993(str);
                i = m1993;
                if (m1993 < 0) {
                    CollectionsKt.addAll(c0164, C0323.f761.m1917(str));
                    return CollectionsKt.toList(c0164);
                }
            }
            for (C0311 c0311 : f768.m733().m770()) {
                if (!c0311.f733) {
                    PackageInfo packageInfo = c0311.f732;
                    if (packageInfo.applicationInfo.uid == i) {
                        c0164.add(packageInfo.packageName);
                    }
                }
            }
            return CollectionsKt.toList(c0164);
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: Ϳ */
    public final Object m1935(Context context, Object obj) {
        try {
            C0343<Object> c0343 = f767;
            Object m2103 = c0343.m2103(context.getPackageManager());
            C0047.f129.m468(ActivityThread.class, "sPackageManager", obj);
            c0343.m2104(context.getPackageManager(), obj);
            return m2103;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public static /* synthetic */ Object m1936(C0325 c0325, Context context, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = c0325.m1934();
        }
        return c0325.m1935(context, obj);
    }

    @Nullable
    /* renamed from: Ϳ */
    public final ActivityInfo m2004(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                componentName = selector != null ? selector.getComponent() : null;
            }
            if (componentName != null) {
                ActivityInfo m1986 = m1986(componentName, C0255.C0256.f530);
                return m1986 != null ? m1986 : C0323.f761.m1921(componentName, C0255.C0256.f530);
            }
            List m1939 = m1939(this, intent, (String) null, 0, 4, (Object) null);
            if (!(m1939 == null || m1939.isEmpty())) {
                return ((ResolveInfo) m1939.get(0)).activityInfo;
            }
            List m1905 = C0323.m1905(C0323.f761, intent, 0, 2, null);
            if (m1905 == null || m1905.isEmpty()) {
                return null;
            }
            return ((ResolveInfo) m1905.get(0)).activityInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ */
    public final void m1959(C0311 c0311, boolean z) {
        try {
            Parcel obtain = Parcel.obtain();
            c0311.writeToParcel(obtain, 0);
            byte[] bArr = (byte[]) m1937((C0325) obtain.marshall());
            obtain.recycle();
            FileOutputStream fileOutputStream = new FileOutputStream(C0449.f1059.m2377(c0311.f732.packageName));
            Intrinsics.checkNotNull(bArr);
            fileOutputStream.write(bArr);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
            C0276.f576.m1722(() -> {
                m1973(r1, r2);
            });
        } catch (Exception unused) {
        }
    }
}
