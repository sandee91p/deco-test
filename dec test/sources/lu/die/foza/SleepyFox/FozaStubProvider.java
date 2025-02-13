package lu.die.foza.SleepyFox;

import android.app.ActivityThread;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.FozaAnkingProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018�� [2\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016JO\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0010JY\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J=\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017J$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0017J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010'\u001a\u00020\tH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010'\u001a\u00020\tH\u0016J&\u0010)\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J%\u0010*\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u000bH\u0016¢\u0006\u0002\u0010+J\u001a\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\fH\u0017J$\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0017J\u001a\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\fH\u0017J$\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0017J%\u00102\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u00103\u001a\u00020\fH\u0016¢\u0006\u0002\u00104J$\u00105\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u00103\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0015H\u0017J.\u00105\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\t2\u0006\u00103\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0017JK\u00107\u001a\u00020-\"\n\b��\u00108*\u0004\u0018\u0001092\u0006\u0010\b\u001a\u00020\t2\u0006\u0010:\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u0010;\u001a\u0004\u0018\u0001H82\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H80=H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020\u0005H\u0014J\u001c\u0010@\u001a\u00020\u001f2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J5\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u000b2\u0006\u0010G\u001a\u00020\f2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020J0Kj\b\u0012\u0004\u0012\u00020J`IH\u0016¢\u0006\u0002\u0010LJ-\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u000b2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020J0Kj\b\u0012\u0004\u0012\u00020J`IH\u0016¢\u0006\u0002\u0010MJ.\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010Q\u001a\u00020\u001fH\u0016J3\u0010R\u001a\u00020\u001f2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010V2\u0010\u0010;\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J1\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010YJ;\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010Z¨\u0006\\"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", C0019.f56, "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", C0019.f56, C0019.f56, "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "queryArgs", "Landroid/os/Bundle;", "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "insert", "values", "Landroid/content/ContentValues;", "extras", "delete", C0019.f56, "update", "onConfigurationChanged", C0019.f56, "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "onCallingPackageChanged", "canonicalize", "url", "uncanonicalize", "refresh", "bulkInsert", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "signal", "openAssetFile", "Landroid/content/res/AssetFileDescriptor;", "getStreamTypes", "mimeTypeFilter", "(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;", "openTypedAssetFile", "opts", "openPipeHelper", "T", C0019.f56, "mimeType", "args", "func", "Landroid/content/ContentProvider$PipeDataWriter;", "(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;Landroid/content/ContentProvider$PipeDataWriter;)Landroid/os/ParcelFileDescriptor;", "isTemporary", "attachInfo", "context", "Landroid/content/Context;", "info", "Landroid/content/pm/ProviderInfo;", "applyBatch", "Landroid/content/ContentProviderResult;", "authority", "operations", "Lkotlin/collections/ArrayList;", "Landroid/content/ContentProviderOperation;", "Ljava/util/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "call", "method", "arg", "shutdown", "dump", "fd", "Ljava/io/FileDescriptor;", "writer", "Ljava/io/PrintWriter;", "(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "getType", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "foza_release"})
@SourceDebugExtension({"SMAP\nFozaStubProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaStubProvider.kt\nlu/die/foza/SleepyFox/FozaStubProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1#2:519\n*E\n"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubProvider.class */
public class FozaStubProvider extends ContentProvider {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0006 f33 = new C0006();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Constructor<?> f34;
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0343<ContentProvider> f35;
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final String f36;
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public static final String f37 = "content://";
    @NotNull

    /* renamed from: Ԭ  reason: contains not printable characters */
    public static final String f38 = "content:/";
    @NotNull

    /* renamed from: ԭ  reason: contains not printable characters */
    public static final String f39 = "file://";
    @NotNull

    /* renamed from: Ԯ  reason: contains not printable characters */
    public static final String f40 = "file:/";
    @NotNull

    /* renamed from: ԯ  reason: contains not printable characters */
    public static final String f41;

    @SourceDebugExtension({"SMAP\nFozaStubProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaStubProvider.kt\nlu/die/foza/SleepyFox/FozaStubProvider$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1#2:519\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.FozaStubProvider$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubProvider$Ϳ.class */
    public static final class C0006 {
        public C0006() {
        }

        @Nullable
        /* renamed from: ԩ  reason: contains not printable characters */
        public final Object m74(@NotNull String str) {
            try {
                C0222.f333.getClass();
                Map<? extends Object, ? extends Object> map = C0222.f336;
                return TypeIntrinsics.asMutableMap(map).remove(m80(str));
            } catch (Exception unused) {
                return null;
            }
        }

        @Nullable
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final ContentProvider m75(@NotNull Uri uri) {
            try {
                C0222.f333.getClass();
                Map<? extends Object, ? extends Object> map = C0222.f336;
                String authority = uri.getAuthority();
                Object obj = map.get(authority != null ? FozaStubProvider.f33.m80(authority) : null);
                return obj != null ? (ContentProvider) FozaStubProvider.f35.m2103(obj) : null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Object m80(String str) {
            try {
                Constructor constructor = FozaStubProvider.f34;
                Object[] objArr = new Object[2];
                objArr[0] = str;
                C0276.f576.getClass();
                objArr[1] = Integer.valueOf(C0276.f585);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ C0006(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final ContentProvider m73(@NotNull String str) {
            try {
                C0222.f333.getClass();
                Object obj = C0222.f336.get(m80(str));
                return obj != null ? (ContentProvider) FozaStubProvider.f35.m2103(obj) : null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Nullable
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Uri m78(@Nullable Uri uri) {
            C0276.f576.getClass();
            return m79(uri, C0276.f577);
        }

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final boolean m76(int i) {
            return i == 103772132 || i == 320699453 || i == 1312704747 || i == 1434631203 || i == 1734583286 || i == 596745902 || i == 2106921569;
        }

        @Nullable
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final Uri m77(@Nullable Uri uri, int i) {
            String scheme;
            if (uri != null) {
                try {
                    scheme = uri.getScheme();
                } catch (Exception unused) {
                    return uri;
                }
            } else {
                scheme = null;
            }
            if (!Intrinsics.areEqual(scheme, "content")) {
                Objects.toString(uri);
                return uri;
            }
            String authority = uri.getAuthority();
            if (m76(authority != null ? authority.hashCode() : 0)) {
                uri.toString();
                return uri;
            }
            String authority2 = uri.getAuthority();
            return authority2 != null && StringsKt.startsWith$default(authority2, FozaStubProvider.f41, false, 2, (Object) null) ? uri : FozaAnkingProvider.C0001.f20.m34(Uri.parse("content://" + FozaStubProvider.f41 + i + '/' + uri));
        }

        @Nullable
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Uri m79(@Nullable Uri uri, int i) {
            if (uri == null) {
                return null;
            }
            try {
                String substring = uri.toString().substring(FozaStubProvider.f41.length() + 10 + String.valueOf(i).length() + 1);
                String str = substring;
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (substring.length() == 0) {
                    return null;
                }
                if (StringsKt.startsWith$default(str, "content:/", false, 2, (Object) null) && !StringsKt.startsWith$default(str, "content://", false, 2, (Object) null)) {
                    StringBuilder sb = new StringBuilder("content://");
                    String substring2 = str.substring(9);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    str = sb.append(substring2).toString();
                }
                return Uri.parse(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        Constructor<?> constructor;
        C0360 c0360 = new C0360(3);
        while (true) {
            Object m2181 = c0360.m2181();
            if (m2181 == 0) {
                constructor = Object.class.getConstructor(new Class[0]);
                break;
            }
            try {
                Class<?> cls = Class.forName(ActivityThread.class.getName() + "$ProviderKey");
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = String.class;
                clsArr[1] = Integer.TYPE;
                m2181 = cls.getDeclaredConstructor(clsArr);
                constructor = m2181;
                m2181.setAccessible(true);
                break;
            } catch (Throwable unused) {
                C0354.f837.m2166();
                m2181.toString();
            }
        }
        f34 = constructor;
        f35 = new C0343<>("mLocalProvider");
        f36 = C0281.C0289.f678;
        StringBuilder sb = new StringBuilder();
        C0276.f576.getClass();
        f41 = sb.append(C0276.f583).append(C0281.C0289.f678).toString();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(26)
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.query(m78, strArr, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(30)
    public int delete(@NotNull Uri uri, @Nullable Bundle bundle) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        Integer valueOf = (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : Integer.valueOf(m75.delete(m78, bundle));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(30)
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable Bundle bundle) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        Integer valueOf = (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : Integer.valueOf(m75.update(m78, contentValues, bundle));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // android.content.ContentProvider
    public void onCallingPackageChanged() {
        super.onCallingPackageChanged();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri canonicalize(@NotNull Uri uri) {
        return super.canonicalize(uri);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri uncanonicalize(@NotNull Uri uri) {
        return super.uncanonicalize(uri);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(26)
    public boolean refresh(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        Boolean valueOf = (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : Boolean.valueOf(m75.refresh(m78, bundle, cancellationSignal));
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(@NotNull Uri uri, @NotNull ContentValues[] contentValuesArr) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        Integer valueOf = (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : Integer.valueOf(m75.bulkInsert(m78, contentValuesArr));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.openFile(m78, str, null);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String str) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.openAssetFile(m78, str, null);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String[] getStreamTypes(@NotNull Uri uri, @NotNull String str) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.getStreamTypes(m78, str);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.openTypedAssetFile(m78, str, bundle, null);
    }

    @Override // android.content.ContentProvider
    @NotNull
    public <T> ParcelFileDescriptor openPipeHelper(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle, @Nullable T t, @NotNull ContentProvider.PipeDataWriter<T> pipeDataWriter) {
        return super.openPipeHelper(uri, str, bundle, t, pipeDataWriter);
    }

    @Override // android.content.ContentProvider
    public boolean isTemporary() {
        return super.isTemporary();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@Nullable Context context, @Nullable ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    @NotNull
    public ContentProviderResult[] applyBatch(@NotNull String str, @NotNull ArrayList<ContentProviderOperation> arrayList) {
        return super.applyBatch(str, arrayList);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        return call(C0019.f56, str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        super.shutdown();
    }

    @Override // android.content.ContentProvider
    public void dump(@Nullable FileDescriptor fileDescriptor, @Nullable PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.getType(m78);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.insert(m78, contentValues);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.query(m78, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(30)
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable Bundle bundle) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.insert(m78, contentValues, bundle);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.openFile(m78, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.openAssetFile(m78, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.openTypedAssetFile(m78, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    @NotNull
    public ContentProviderResult[] applyBatch(@NotNull ArrayList<ContentProviderOperation> arrayList) {
        return super.applyBatch(arrayList);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        if (Intrinsics.areEqual(str2, C0281.C0283.f628)) {
            if (bundle != null) {
                C0321.f756.m1896(bundle);
            }
            Bundle bundle2 = new Bundle();
            BinderC0293 binderC0293 = BinderC0293.f705;
            binderC0293.getClass();
            bundle2.putBinder(C0281.C0282.f616, binderC0293);
            return bundle2;
        }
        return Bundle.EMPTY;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        if (m78 != null) {
            ContentProvider m75 = c0006.m75(m78);
            Integer valueOf = m75 != null ? Integer.valueOf(m75.delete(m78, str, strArr)) : null;
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        if (m78 != null) {
            ContentProvider m75 = c0006.m75(m78);
            Integer valueOf = m75 != null ? Integer.valueOf(m75.update(m78, contentValues, str, strArr)) : null;
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider m75;
        C0006 c0006 = f33;
        Uri m78 = c0006.m78(uri);
        return (m78 == null || (m75 = c0006.m75(m78)) == null) ? null : m75.query(m78, strArr, str, strArr2, str2, cancellationSignal);
    }
}
