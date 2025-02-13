package lu.die.foza.SleepyFox;

import android.content.AttributionSource;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lu.die.foza.SleepyFox.C0154;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018��2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J1\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0017JY\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aJ=\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0002\u0010\u001dJ&\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J&\u0010\"\u001a\u00020#2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J%\u0010$\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\tH\u0016¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0016J$\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0016J$\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016J%\u0010,\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\nH\u0016¢\u0006\u0002\u0010.J$\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0016J.\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u001c2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016JE\u00101\u001a\u00020'\"\u0004\b��\u001022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00103\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u001c2\b\u00104\u001a\u0004\u0018\u0001H22\f\u00105\u001a\b\u0012\u0004\u0012\u0002H206H\u0016¢\u0006\u0002\u00107J.\u00108\u001a\u0004\u0018\u00010\u001c2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0017J&\u00108\u001a\u0004\u0018\u00010\u001c2\u0006\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016J5\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\t2\u0006\u00109\u001a\u00020\n2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020B0Cj\b\u0012\u0004\u0012\u00020B`AH\u0017¢\u0006\u0002\u0010DJ-\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\t2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020B0Cj\b\u0012\u0004\u0012\u00020B`AH\u0016¢\u0006\u0002\u0010ER\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070=X\u0082\u0004¢\u0006\u0002\n��¨\u0006G"}, d2 = {"Llu/die/foza/SleepyFox/FozaAnkingProvider;", "Llu/die/foza/SleepyFox/FozaStubProvider;", "<init>", "()V", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", C0019.f56, C0019.f56, "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", "values", "Landroid/content/ContentValues;", "delete", C0019.f56, "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "queryArgs", "Landroid/os/Bundle;", "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "extras", "canonicalize", "url", "uncanonicalize", "refresh", C0019.f56, "bulkInsert", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "signal", "openAssetFile", "Landroid/content/res/AssetFileDescriptor;", "getStreamTypes", "mimeTypeFilter", "(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;", "openTypedAssetFile", "opts", "openPipeHelper", "T", "mimeType", "args", "func", "Landroid/content/ContentProvider$PipeDataWriter;", "(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;Landroid/content/ContentProvider$PipeDataWriter;)Landroid/os/ParcelFileDescriptor;", "call", "authority", "method", "arg", "mUriField", "Llu/die/foza/HookEntity/Reflection/FozaReflectionField;", "applyBatch", "Landroid/content/ContentProviderResult;", "operations", "Lkotlin/collections/ArrayList;", "Landroid/content/ContentProviderOperation;", "Ljava/util/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;", "Manager", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAnkingProvider.class */
public class FozaAnkingProvider extends FozaStubProvider {
    @NotNull

    /* renamed from: ՠ  reason: contains not printable characters */
    public final C0343<Uri> f19 = new C0343<>("mUri");

    /* renamed from: lu.die.foza.SleepyFox.FozaAnkingProvider$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAnkingProvider$Ϳ.class */
    public static final class C0001 {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public static final C0005 f20;
        @NotNull

        /* renamed from: Ԩ  reason: contains not printable characters */
        public static final C0001 f21 = new C0001();
        @NotNull

        /* renamed from: ԩ  reason: contains not printable characters */
        public static final String f22 = "content://";
        @NotNull

        /* renamed from: Ԫ  reason: contains not printable characters */
        public static final String f23 = "content:/";
        @NotNull

        /* renamed from: ԫ  reason: contains not printable characters */
        public static final C0344<Object> f24;
        @NotNull

        /* renamed from: Ԭ  reason: contains not printable characters */
        public static final KFunction<Unit> f25;
        @NotNull

        /* renamed from: ԭ  reason: contains not printable characters */
        public static final String f26;

        /* renamed from: lu.die.foza.SleepyFox.FozaAnkingProvider$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAnkingProvider$Ϳ$Ϳ.class */
        public /* synthetic */ class C0002 extends FunctionReferenceImpl implements Function2<ContentProvider, String, Unit> {
            public C0002(Object obj) {
                super(2, obj, C0005.class, "setCallingSourceS", "setCallingSourceS(Landroid/content/ContentProvider;Ljava/lang/String;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ContentProvider) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(ContentProvider contentProvider, String str) {
                ((C0005) ((FunctionReferenceImpl) this).receiver).m38(contentProvider, str);
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.FozaAnkingProvider$Ϳ$Ԩ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAnkingProvider$Ϳ$Ԩ.class */
        public /* synthetic */ class C0003 extends FunctionReferenceImpl implements Function2<ContentProvider, String, Unit> {
            public C0003(Object obj) {
                super(2, obj, C0005.class, "setCallingSourceR", "setCallingSourceR(Landroid/content/ContentProvider;Ljava/lang/String;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ContentProvider) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(ContentProvider contentProvider, String str) {
                ((C0005) ((FunctionReferenceImpl) this).receiver).m39(contentProvider, str);
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.FozaAnkingProvider$Ϳ$Ԫ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAnkingProvider$Ϳ$Ԫ.class */
        public /* synthetic */ class C0004 extends FunctionReferenceImpl implements Function2<ContentProvider, String, Unit> {
            public C0004(Object obj) {
                super(2, obj, C0005.class, "setCallingSource", "setCallingSource(Landroid/content/ContentProvider;Ljava/lang/String;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ContentProvider) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(ContentProvider contentProvider, String str) {
                ((C0005) ((FunctionReferenceImpl) this).receiver).m40(contentProvider, str);
            }
        }

        /* renamed from: lu.die.foza.SleepyFox.FozaAnkingProvider$Ϳ$Ԭ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaAnkingProvider$Ϳ$Ԭ.class */
        public static final class C0005 {
            public C0005() {
            }

            public /* synthetic */ C0005(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* renamed from: Ϳ  reason: contains not printable characters */
            public final C0001 m30() {
                return C0001.f21;
            }

            @RequiresApi(31)
            /* renamed from: ԩ  reason: contains not printable characters */
            public final void m38(ContentProvider contentProvider, String str) {
                try {
                    C0344 c0344 = C0001.f24;
                    Object[] objArr = new Object[1];
                    objArr[0] = new AttributionSource.Builder(C0448.f1055.m2364()).setPackageName(str).build();
                    c0344.m2127(contentProvider, objArr);
                } catch (Exception unused) {
                }
            }

            /* renamed from: Ԩ  reason: contains not printable characters */
            public final void m39(ContentProvider contentProvider, String str) {
                try {
                    C0344 c0344 = C0001.f24;
                    Object[] objArr = new Object[1];
                    objArr[0] = new Pair(str, null);
                    c0344.m2127(contentProvider, objArr);
                } catch (Exception unused) {
                }
            }

            @Nullable
            /* renamed from: Ԩ  reason: contains not printable characters */
            public final Uri m34(@NotNull Uri uri) {
                if (!C0175.f261) {
                    return uri;
                }
                String encodedPath = uri.getEncodedPath();
                if (encodedPath != null && StringsKt.indexOf$default(encodedPath, "//", 0, false, 6, (Object) null) != -1) {
                    uri = uri.buildUpon().encodedPath(new Regex("//+").replace(encodedPath, "/")).build();
                }
                return uri;
            }

            /* renamed from: Ϳ  reason: contains not printable characters */
            public final boolean m37(@Nullable String str) {
                boolean startsWith$default;
                if (str != null) {
                    try {
                        startsWith$default = StringsKt.startsWith$default(str, C0001.f26, false, 2, (Object) null);
                    } catch (Exception unused) {
                        return false;
                    }
                } else {
                    startsWith$default = false;
                }
                return startsWith$default;
            }

            @NotNull
            /* renamed from: Ϳ  reason: contains not printable characters */
            public final Bundle m32(@NotNull String str, @Nullable Bundle bundle) {
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putBundle(C0281.C0282.f594, bundle);
                    bundle2.putString(C0281.C0282.f610, str);
                    bundle2.putString(C0281.C0282.f598, C0276.f576.m1713());
                } catch (Exception unused) {
                }
                return bundle2;
            }

            /* renamed from: Ϳ  reason: contains not printable characters */
            public final void m40(ContentProvider contentProvider, String str) {
                try {
                    C0344 c0344 = C0001.f24;
                    Object[] objArr = new Object[1];
                    objArr[0] = str;
                    c0344.m2127(contentProvider, objArr);
                } catch (Exception unused) {
                }
            }

            @Nullable
            /* renamed from: Ϳ  reason: contains not printable characters */
            public final kotlin.Pair<Uri, ContentProvider> m31(@Nullable Uri uri) {
                if (uri == null) {
                    return null;
                }
                try {
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments.size() < 1) {
                        return null;
                    }
                    String str = pathSegments.get(0);
                    int length = str.length() + 12;
                    String authority = uri.getAuthority();
                    String substring = uri.toString().substring(length + (authority != null ? authority.length() : 0));
                    String str2 = substring;
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (StringsKt.startsWith$default(substring, "content:/", false, 2, (Object) null) && !StringsKt.startsWith$default(str2, "content://", false, 2, (Object) null)) {
                        StringBuilder sb = new StringBuilder("content://");
                        String substring2 = str2.substring(9);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        str2 = sb.append(substring2).toString();
                    }
                    Uri parse = Uri.parse(str2);
                    ContentProvider m75 = FozaStubProvider.f33.m75(parse);
                    if (m75 == null) {
                        return null;
                    }
                    C0001.f25.invoke(m75, str);
                    return new kotlin.Pair<>(parse, m75);
                } catch (Exception unused) {
                    return null;
                }
            }

            @Nullable
            /* renamed from: Ϳ  reason: contains not printable characters */
            public final Triple<String, ContentProvider, Bundle> m33(@Nullable Bundle bundle) {
                Triple<String, ContentProvider, Bundle> triple;
                Triple<String, ContentProvider, Bundle> triple2;
                if (bundle != null) {
                    try {
                        String string = bundle.getString(C0281.C0282.f610);
                        String string2 = bundle.getString(C0281.C0282.f598);
                        Bundle bundle2 = bundle.getBundle(C0281.C0282.f594);
                        if (string == null) {
                            return null;
                        }
                        ContentProvider m73 = FozaStubProvider.f33.m73(string);
                        if (m73 != null) {
                            C0001.f25.invoke(m73, string2);
                            triple = triple2;
                            triple2 = new Triple<>(string, m73, bundle2);
                        } else {
                            triple = null;
                        }
                        return triple;
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return null;
            }

            @NotNull
            /* renamed from: Ϳ  reason: contains not printable characters */
            public final String m36(int i) {
                return C0001.f26 + i;
            }

            @Nullable
            /* renamed from: Ϳ  reason: contains not printable characters */
            public final Uri m35(@Nullable Uri uri, int i) {
                if (uri != null) {
                    try {
                        return m34(Uri.parse("content://" + m36(i) + '/' + C0276.f576.m1713() + '/' + uri));
                    } catch (Exception unused) {
                    }
                }
                return uri;
            }

            /* renamed from: Ϳ  reason: contains not printable characters */
            public static Uri m26(C0005 c0005, Uri uri, int i, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    C0276.f576.getClass();
                    i = C0276.f577;
                }
                return c0005.m35(uri, i);
            }
        }

        @JvmStatic
        @NotNull
        /* renamed from: ԫ  reason: contains not printable characters */
        public static final C0001 m20() {
            f20.getClass();
            return f21;
        }

        static {
            String str;
            Class[] clsArr;
            KFunction<Unit> kFunction;
            C0005 c0005 = new C0005();
            f20 = c0005;
            boolean z = C0175.f272;
            if (z) {
                str = "setCallingAttributionSource";
            } else {
                boolean z2 = C0175.f270;
                str = "setCallingPackage";
            }
            if (z) {
                clsArr = r0;
                Class[] clsArr2 = {AttributionSource.class};
            } else if (C0175.f270) {
                clsArr = r0;
                Class[] clsArr3 = {Pair.class};
            } else {
                clsArr = r0;
                Class[] clsArr4 = {String.class};
            }
            f24 = new C0344(str, clsArr).m2125(ContentProvider.class);
            if (z) {
                kFunction = r0;
                KFunction<Unit> c0002 = new C0002(c0005);
            } else if (C0175.f270) {
                kFunction = r0;
                KFunction<Unit> c0003 = new C0003(c0005);
            } else {
                kFunction = r0;
                KFunction<Unit> c0004 = new C0004(c0005);
            }
            f25 = kFunction;
            StringBuilder sb = new StringBuilder();
            C0276.f576.getClass();
            f26 = sb.append(C0276.f583).append(C0281.C0289.f676).toString();
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        String str;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    str = ((ContentProvider) m31.getSecond()).getType(uri2);
                    return str;
                }
            }
            str = null;
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Uri uri2;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri3 = (Uri) m31.getFirst();
                if (uri3 != null) {
                    uri2 = ((ContentProvider) m31.getSecond()).insert(uri3, contentValues);
                    return uri2;
                }
            }
            uri2 = null;
            return uri2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(26)
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        Cursor cursor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    cursor = ((ContentProvider) m31.getSecond()).query(uri2, strArr, bundle, cancellationSignal);
                    return cursor;
                }
            }
            cursor = null;
            return cursor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(30)
    public int delete(@NotNull Uri uri, @Nullable Bundle bundle) {
        int i;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    i = ((ContentProvider) m31.getSecond()).delete(uri2, bundle);
                    return i;
                }
            }
            i = 0;
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(30)
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable Bundle bundle) {
        int i;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    i = ((ContentProvider) m31.getSecond()).update(uri2, contentValues, bundle);
                    return i;
                }
            }
            i = 0;
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public Uri canonicalize(@NotNull Uri uri) {
        Uri uri2;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri3 = (Uri) m31.getFirst();
                if (uri3 != null) {
                    uri2 = ((ContentProvider) m31.getSecond()).canonicalize(uri3);
                    return uri2;
                }
            }
            uri2 = null;
            return uri2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public Uri uncanonicalize(@NotNull Uri uri) {
        Uri uri2;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri3 = (Uri) m31.getFirst();
                if (uri3 != null) {
                    uri2 = ((ContentProvider) m31.getSecond()).uncanonicalize(uri3);
                    return uri2;
                }
            }
            uri2 = null;
            return uri2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(26)
    public boolean refresh(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        boolean z;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    z = ((ContentProvider) m31.getSecond()).refresh(uri2, bundle, cancellationSignal);
                    return z;
                }
            }
            z = false;
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    public int bulkInsert(@NotNull Uri uri, @NotNull ContentValues[] contentValuesArr) {
        int i;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    i = ((ContentProvider) m31.getSecond()).bulkInsert(uri2, contentValuesArr);
                    return i;
                }
            }
            i = 0;
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    parcelFileDescriptor = ((ContentProvider) m31.getSecond()).openFile(uri2, str);
                    return parcelFileDescriptor;
                }
            }
            parcelFileDescriptor = null;
            return parcelFileDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String str) {
        AssetFileDescriptor assetFileDescriptor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    assetFileDescriptor = ((ContentProvider) m31.getSecond()).openAssetFile(uri2, str);
                    return assetFileDescriptor;
                }
            }
            assetFileDescriptor = null;
            return assetFileDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public String[] getStreamTypes(@NotNull Uri uri, @NotNull String str) {
        String[] strArr;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    strArr = ((ContentProvider) m31.getSecond()).getStreamTypes(uri2, str);
                    return strArr;
                }
            }
            strArr = null;
            return strArr;
        } catch (Exception unused) {
            return C0154.C0157.f211;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle) {
        AssetFileDescriptor assetFileDescriptor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    assetFileDescriptor = ((ContentProvider) m31.getSecond()).openTypedAssetFile(uri2, str, bundle);
                    return assetFileDescriptor;
                }
            }
            assetFileDescriptor = null;
            return assetFileDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r0 == null) goto L14;
     */
    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> android.os.ParcelFileDescriptor openPipeHelper(@org.jetbrains.annotations.NotNull android.net.Uri r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10, @org.jetbrains.annotations.Nullable T r11, @org.jetbrains.annotations.NotNull android.content.ContentProvider.PipeDataWriter<T> r12) {
        /*
            r7 = this;
            lu.die.foza.SleepyFox.FozaAnkingProvider$Ϳ$Ԭ r0 = lu.die.foza.SleepyFox.FozaAnkingProvider.C0001.f20     // Catch: java.lang.Exception -> L39
            r1 = r8
            kotlin.Pair r0 = r0.m31(r1)     // Catch: java.lang.Exception -> L39
            r1 = r0
            r7 = r1
            if (r0 == 0) goto L2e
            r0 = r7
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Exception -> L39
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Exception -> L39
            r1 = r0
            r8 = r1
            if (r0 == 0) goto L2e
            r0 = r7
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Exception -> L39
            android.content.ContentProvider r0 = (android.content.ContentProvider) r0     // Catch: java.lang.Exception -> L39
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.os.ParcelFileDescriptor r0 = r0.openPipeHelper(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L39
            r1 = r0
            r7 = r1
            if (r0 != 0) goto L37
        L2e:
            android.os.ParcelFileDescriptor r0 = new android.os.ParcelFileDescriptor     // Catch: java.lang.Exception -> L39
            r1 = r0
            r7 = r1
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Exception -> L39
        L37:
            r0 = r7
            return r0
        L39:
            android.os.ParcelFileDescriptor r0 = new android.os.ParcelFileDescriptor
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.die.foza.SleepyFox.FozaAnkingProvider.openPipeHelper(android.net.Uri, java.lang.String, android.os.Bundle, java.lang.Object, android.content.ContentProvider$PipeDataWriter):android.os.ParcelFileDescriptor");
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        try {
            Triple<String, ContentProvider, Bundle> m33 = C0001.f20.m33(bundle);
            if (m33 == null) {
                return null;
            }
            return ((ContentProvider) m33.getSecond()).call(str, str2, (Bundle) m33.getThird());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(29)
    @NotNull
    public ContentProviderResult[] applyBatch(@NotNull String str, @NotNull ArrayList<ContentProviderOperation> arrayList) {
        return applyBatch(arrayList);
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Cursor cursor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    cursor = ((ContentProvider) m31.getSecond()).query(uri2, strArr, str, strArr2, str2);
                    return cursor;
                }
            }
            cursor = null;
            return cursor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        int i;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    i = ((ContentProvider) m31.getSecond()).delete(uri2, str, strArr);
                    return i;
                }
            }
            i = 0;
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        int i;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    i = ((ContentProvider) m31.getSecond()).update(uri2, contentValues, str, strArr);
                    return i;
                }
            }
            i = 0;
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(30)
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable Bundle bundle) {
        Uri uri2;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri3 = (Uri) m31.getFirst();
                if (uri3 != null) {
                    uri2 = ((ContentProvider) m31.getSecond()).insert(uri3, contentValues, bundle);
                    return uri2;
                }
            }
            uri2 = null;
            return uri2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str, @Nullable CancellationSignal cancellationSignal) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    parcelFileDescriptor = ((ContentProvider) m31.getSecond()).openFile(uri2, str, cancellationSignal);
                    return parcelFileDescriptor;
                }
            }
            parcelFileDescriptor = null;
            return parcelFileDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable CancellationSignal cancellationSignal) {
        AssetFileDescriptor assetFileDescriptor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    assetFileDescriptor = ((ContentProvider) m31.getSecond()).openAssetFile(uri2, str, cancellationSignal);
                    return assetFileDescriptor;
                }
            }
            assetFileDescriptor = null;
            return assetFileDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        AssetFileDescriptor assetFileDescriptor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    assetFileDescriptor = ((ContentProvider) m31.getSecond()).openTypedAssetFile(uri2, str, bundle, cancellationSignal);
                    return assetFileDescriptor;
                }
            }
            assetFileDescriptor = null;
            return assetFileDescriptor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public Bundle call(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        try {
            Triple<String, ContentProvider, Bundle> m33 = C0001.f20.m33(bundle);
            if (m33 == null) {
                return null;
            }
            return ((ContentProvider) m33.getSecond()).call((String) m33.getFirst(), str2, str3, (Bundle) m33.getThird());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @NotNull
    public ContentProviderResult[] applyBatch(@NotNull ArrayList<ContentProviderOperation> arrayList) {
        try {
            ContentProviderResult[] contentProviderResultArr = new ContentProviderResult[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    ContentProviderOperation contentProviderOperation = arrayList.get(i);
                    kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(contentProviderOperation.getUri());
                    if (m31 != null) {
                        int i2 = i;
                        this.f19.m2104(contentProviderOperation, m31.getFirst());
                        Unit unit = Unit.INSTANCE;
                        contentProviderResultArr[i2] = contentProviderOperation.apply((ContentProvider) m31.getSecond(), contentProviderResultArr, i);
                    }
                } catch (Exception unused) {
                }
            }
            return contentProviderResultArr;
        } catch (Exception unused2) {
            return new ContentProviderResult[0];
        }
    }

    @Override // lu.die.foza.SleepyFox.FozaStubProvider, android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) {
        Cursor cursor;
        try {
            kotlin.Pair<Uri, ContentProvider> m31 = C0001.f20.m31(uri);
            if (m31 != null) {
                Uri uri2 = (Uri) m31.getFirst();
                if (uri2 != null) {
                    cursor = ((ContentProvider) m31.getSecond()).query(uri2, strArr, str, strArr2, str2, cancellationSignal);
                    return cursor;
                }
            }
            cursor = null;
            return cursor;
        } catch (Exception unused) {
            return null;
        }
    }
}
