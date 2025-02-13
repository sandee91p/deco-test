package lu.die.foza.SleepyFox;

import android.content.ContentProviderOperation;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.TypeIntrinsics;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.FozaAnkingProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ຑ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ.class */
public final class C0374 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0374 f879 = new C0374();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final C0375 f880 = new C0375();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0376 f881 = new C0376();
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final C0343<Object> f882 = new C0343<>("mUri");
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final C0343<Object> f883 = new C0343<>(C0281.C0283.f622);

    /* renamed from: lu.die.foza.SleepyFox.ຑ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ$Ϳ.class */
    public static final class C0375 extends C0277 {

        /* renamed from: Ԭ  reason: contains not printable characters */
        public final int f884;

        /* renamed from: ԭ  reason: contains not printable characters */
        public final String f885;

        public C0375() {
            this.f884 = C0175.f271 ? 2 : 1;
            this.f885 = m1135() + C0281.C0289.f677;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: Exception -> 0x0148, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0148, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0010, B:10:0x0019, B:12:0x0024, B:15:0x002a, B:17:0x0037, B:19:0x003e, B:20:0x0045, B:23:0x0052, B:27:0x0081, B:29:0x008c, B:30:0x0098, B:32:0x00a0, B:34:0x00a6, B:35:0x00aa, B:37:0x00b8, B:39:0x00c4, B:40:0x00ca, B:41:0x00ee, B:42:0x00f5, B:45:0x0105, B:46:0x010d, B:48:0x0113, B:50:0x00dc, B:53:0x005e, B:56:0x006b, B:57:0x0072, B:58:0x0130, B:60:0x013c), top: B:1:0x0000 }] */
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo85(lu.die.foza.SleepyFox.C0253 r6) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.C0374.C0375.mo85(lu.die.foza.SleepyFox.ࡥ):java.lang.Object");
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຑ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ$Ԩ.class */
    public static final class C0376 extends C0277 {
        @Override // lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                if (C0175.f272) {
                    C0153.f201.m727(c0253.f519);
                }
                return super.mo85(c0253);
            } catch (InvocationTargetException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                if (!(e instanceof SecurityException) && !(e instanceof IllegalArgumentException)) {
                    throw e;
                }
                return null;
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຑ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ$Ԫ.class */
    public static final class C0377 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ int f886;

        public C0377(int i) {
            this.f886 = i;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, Uri.class);
                if (m722 >= 0) {
                    objArr[m722] = FozaAnkingProvider.C0001.f20.m35((Uri) objArr[m722], this.f886);
                }
            } catch (Exception unused) {
            }
            return C0374.f881.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຑ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ$Ԭ.class */
    public static final class C0378 implements AbstractC0412 {
        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                C0153 c0153 = C0153.f201;
                Bundle bundle = (Bundle) c0153.m726(objArr, Bundle.class);
                Uri uri = (Uri) c0153.m726(objArr, Uri.class);
                if (bundle != null) {
                    C0291 c0291 = C0291.f697;
                    c0291.m1759(bundle);
                    if (uri != null) {
                        c0291.m1757(uri, bundle);
                    }
                    c0291.m1758(bundle);
                }
            } catch (Exception unused) {
            }
            return C0374.f881.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຑ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ$Ԯ.class */
    public static final class C0379 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ int f887;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final /* synthetic */ C0377 f888;

        public C0379(int i, C0377 c0377) {
            this.f887 = i;
            this.f888 = c0377;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                int m722 = C0153.f201.m722(objArr, ArrayList.class);
                if (m722 >= 0) {
                    List asMutableList = TypeIntrinsics.asMutableList(objArr[m722]);
                    if (!(asMutableList == null || asMutableList.isEmpty())) {
                        for (Object obj : asMutableList) {
                            if (obj instanceof ContentProviderOperation) {
                                C0374.f882.m2104(obj, FozaAnkingProvider.C0001.f20.m35(((ContentProviderOperation) obj).getUri(), this.f887));
                            }
                        }
                    }
                }
                if (C0175.f271 && objArr.length > 1 && (objArr[1] instanceof String)) {
                    objArr[1] = FozaAnkingProvider.C0001.f20.m36(this.f887);
                }
            } catch (Exception unused) {
            }
            return this.f888.mo85(c0253);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ຑ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ຑ$ՠ.class */
    public static final class C0380 implements AbstractC0412 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ String f889;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final /* synthetic */ int f890;

        /* renamed from: ԩ  reason: contains not printable characters */
        public final /* synthetic */ C0377 f891;

        public C0380(String str, int i, C0377 c0377) {
            this.f889 = str;
            this.f890 = i;
            this.f891 = c0377;
        }

        @Override // lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                Object[] objArr = c0253.f519;
                String str = this.f889;
                if (C0175.f271 && objArr.length > 4) {
                    char c = (!C0175.f270 || C0175.f272) ? (char) 1 : (char) 2;
                    Object obj = objArr[c];
                    if (obj instanceof String) {
                        str = (String) obj;
                        objArr[c] = FozaAnkingProvider.C0001.f20.m36(this.f890);
                    }
                }
                int m725 = C0153.f201.m725(c0253.f518.getParameterTypes(), Bundle.class);
                if (m725 >= 0) {
                    FozaAnkingProvider.C0001.C0005 c0005 = FozaAnkingProvider.C0001.f20;
                    Object obj2 = objArr[m725];
                    objArr[m725] = c0005.m32(str, obj2 instanceof Bundle ? (Bundle) obj2 : null);
                }
            } catch (Exception unused) {
            }
            return this.f891.mo85(c0253);
        }
    }

    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public final AbstractC0412 m2259() {
        return f880;
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0033 m2260(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        C0033 m2097 = C0342.f813.m2097(obj, f881);
        C0033 c0033 = m2097;
        if (m2097 == null) {
            c0033 = null;
        } else if (C0175.f270) {
            c0033.m374("query", new C0378());
        }
        return c0033;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0377 m2262(int i) {
        return new C0377(i);
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0033 m2263(Object obj, int i, String str) {
        if (obj == null) {
            return null;
        }
        try {
            C0377 c0377 = new C0377(i);
            C0033 m2097 = C0342.f813.m2097(obj, c0377);
            if (m2097 == null) {
                return null;
            }
            m2097.m374("applyBatch", new C0379(i, c0377));
            m2097.m374("call", new C0380(str, i, c0377));
            return m2097;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2261(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            C0343<Object> c0343 = f883;
            C0033 m2260 = m2260(c0343.m2103(obj));
            c0343.m2104(obj, m2260 != null ? m2260.f100 : null);
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Object m2264(Object obj, int i, String str) {
        if (obj == null) {
            return null;
        }
        try {
            C0343<Object> c0343 = f883;
            Object m2103 = c0343.m2103(obj);
            if (m2103 == null) {
                return obj;
            }
            C0033 m2263 = m2263(m2103, i, str);
            c0343.m2104(obj, m2263 != null ? m2263.f100 : null);
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }
}
