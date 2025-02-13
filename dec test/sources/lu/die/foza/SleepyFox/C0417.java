package lu.die.foza.SleepyFox;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0255;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nIntentConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentConvertor.kt\nlu/die/foza/Data/Convertor/IntentConvertor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,543:1\n1#2:544\n13330#3,2:545\n*S KotlinDebug\n*F\n+ 1 IntentConvertor.kt\nlu/die/foza/Data/Convertor/IntentConvertor\n*L\n467#1:545,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ྌ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ྌ.class */
public final class C0417 {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final String f1016 = "package:";

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static final int f1018;
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0417 f1015 = new C0417();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final ComponentName f1017 = new ComponentName("com.android.systemui", "com.android.systemui.media.MediaProjectionPermissionActivity");

    @JvmStatic
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final boolean m2310(@NotNull ActivityInfo activityInfo) {
        return activityInfo.launchMode == 1;
    }

    @JvmStatic
    /* renamed from: ԩ  reason: contains not printable characters */
    public static final boolean m2311(@NotNull ActivityInfo activityInfo) {
        int i = activityInfo.launchMode;
        return i == 2 || i == 3 || i == 4;
    }

    static {
        int i = 0;
        int[] iArr = {33554432, 65536, 32768, 268435456, 8388608, 524288, 1, 64, C0255.C0256.f530, 2, 134217728, 16384, 1073741824, 2097152};
        for (int i2 = 0; i2 < 14; i2++) {
            i |= iArr[i2];
        }
        f1018 = i;
    }

    @NotNull
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final Intent m2321(@NotNull Intent intent) {
        try {
            Intent intent2 = new Intent(C0276.m1701(), FozaProxyActivity.class);
            intent2.putExtra(C0281.C0282.f592, intent);
            intent2.setFlags(intent.getFlags());
            C0276 c0276 = C0276.f576;
            c0276.getClass();
            intent2.putExtra(C0281.C0282.f600, C0276.f579);
            intent2.putExtra(C0281.C0282.f612, c0276.m1713());
            return intent2;
        } catch (Exception unused) {
            return intent;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2327(int i, @Nullable Intent intent, @Nullable Intent intent2) {
        if (intent == null || intent2 == null) {
            return;
        }
        try {
            if (!m2324(i, intent)) {
                return;
            }
            intent2.addFlags(i);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Intent m2317(@NotNull Intent intent, @Nullable C0355 c0355) {
        Intent intent2;
        Uri parse;
        try {
            Objects.toString(intent);
            String type = intent.getType();
            Uri data = intent.getData();
            if (Intrinsics.areEqual(data != null ? data.getScheme() : null, "package")) {
                String m2172 = c0355 != null ? c0355.m2172() : null;
                if (m2172 == null || m2172.length() == 0) {
                    intent2 = intent;
                    StringBuilder sb = new StringBuilder(f1016);
                    C0276.f576.getClass();
                    parse = Uri.parse(sb.append(C0276.f583).toString());
                } else {
                    String substring = data.toString().substring(8);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (Intrinsics.areEqual(m2172, substring)) {
                        intent2 = intent;
                        StringBuilder sb2 = new StringBuilder(f1016);
                        C0276.f576.getClass();
                        parse = Uri.parse(sb2.append(C0276.f583).toString());
                    }
                }
                intent2.setDataAndType(parse, type);
            }
            if (c0355 != null) {
                f1015.m2331(intent, c0355);
            }
        } catch (Exception unused) {
        }
        return intent;
    }

    @JvmStatic
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public static final Intent m2318(@Nullable Intent intent) {
        C0276.f576.getClass();
        return m2319(intent, C0276.f577);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Intent m2323(@NotNull Intent intent, @NotNull Intent intent2) {
        return intent2.addFlags((intent.getFlags() & f1018) | 134217728);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Intent m2328(@NotNull String str, @NotNull String str2) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(270532608);
        intent.setClassName(str, str2);
        return intent;
    }

    @JvmStatic
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public static final Intent m2319(@Nullable Intent intent, int i) {
        Intent intent2;
        Intent intent3;
        if (intent == null) {
            return null;
        }
        try {
            intent2 = intent3;
            intent3 = new Intent(intent);
        } catch (Exception unused) {
            intent2 = null;
        }
        try {
            Intent intent4 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            if (intent4 != null) {
                intent.putExtra("android.intent.extra.INTENT", m2319(intent4, i));
            }
            Uri data = intent.getData();
            if (data != null) {
                intent.setDataAndType(FozaStubProvider.f33.m77(data, i), intent.getType());
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null && clipData.getItemCount() >= 0) {
                ClipData.Item itemAt = clipData.getItemAt(0);
                Uri uri = itemAt.getUri();
                if (uri != null) {
                    Uri m77 = FozaStubProvider.f33.m77(uri, i);
                    if (!Intrinsics.areEqual(m77, uri)) {
                        ClipData clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(itemAt.getText(), itemAt.getHtmlText(), itemAt.getIntent(), m77));
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 1; i2 < itemCount; i2++) {
                            ClipData.Item itemAt2 = clipData.getItemAt(i2);
                            Uri uri2 = itemAt2.getUri();
                            Uri uri3 = uri2;
                            if (uri2 != null) {
                                uri3 = FozaStubProvider.f33.m77(uri3, i);
                            }
                            clipData2.addItem(new ClipData.Item(itemAt2.getText(), itemAt2.getHtmlText(), itemAt2.getIntent(), uri3));
                        }
                        intent.setClipData(clipData2);
                    }
                }
            }
            if (intent.hasExtra("output")) {
                f1015.m2330(intent, "output", i);
            }
            if (intent.hasExtra("android.intent.extra.STREAM")) {
                f1015.m2330(intent, "android.intent.extra.STREAM", i);
            }
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
            if (parcelableArrayExtra != null) {
                Intent[] intentArr = new Intent[parcelableArrayExtra.length];
                int length = parcelableArrayExtra.length;
                for (int i3 = 0; i3 < length; i3++) {
                    Parcelable parcelable = parcelableArrayExtra[i3];
                    if (parcelable instanceof Intent) {
                        intentArr[i3] = m2319((Intent) parcelable, i);
                    }
                }
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            }
            return intent;
        } catch (Exception unused2) {
            if (intent2 != null) {
                intent = intent2;
            }
            return intent;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2324(int i, @NotNull Intent intent) {
        return (intent.getFlags() & i) != 0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2325(int i, @Nullable ActivityInfo activityInfo) {
        return (activityInfo == null || (activityInfo.flags & i) == 0) ? false : true;
    }

    @JvmStatic
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final boolean m2309(@NotNull ActivityInfo activityInfo) {
        int i = activityInfo.screenOrientation;
        return i == 0 || i == 6 || i == 8 || i == 11;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m2326(int i, @NotNull Intent intent) {
        intent.setFlags(intent.getFlags() & (i ^ (-1)));
    }

    @JvmStatic
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Intent m2316(@NotNull Intent intent) {
        try {
            return (Intent) intent.getParcelableExtra(C0281.C0282.f592);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m2329(@NotNull Intent intent, @Nullable String str) {
        if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.MAIN")) {
            ComponentName component = intent.getComponent();
            if ((Intrinsics.areEqual(component != null ? component.getPackageName() : null, str) || Intrinsics.areEqual(intent.getPackage(), str)) && ((intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory("android.intent.category.INFO")) && m2324(268435456, intent))) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Intent m2315(@NotNull Intent intent, int i) {
        try {
            Intent intent2 = new Intent();
            C0276.f576.getClass();
            Intent component = intent2.setComponent(new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivityH" + i));
            component.putExtra(C0281.C0282.f592, intent);
            return component;
        } catch (Exception unused) {
            return intent;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2331(Intent intent, C0355 c0355) {
        try {
            if (!C0175.f271 || !Intrinsics.areEqual(intent.getComponent(), f1017)) {
                return;
            }
            String m2172 = c0355.m2172();
            C0245.f512.getClass();
            ApplicationInfo m1433 = C0245.f513.m1433(m2172, 0);
            ApplicationInfo applicationInfo = m1433;
            if (m1433 == null) {
                PackageInfo m1918 = C0323.f761.m1918(m2172, 0);
                applicationInfo = m1918 != null ? m1918.applicationInfo : null;
            }
            if (applicationInfo == null || applicationInfo.targetSdkVersion >= 29) {
                return;
            }
            C0035.m382(C0035.f103, c0355, 32, null, 4, null);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Intent m2314(@NotNull Intent intent, int i, int i2, boolean z) {
        ComponentName componentName;
        ComponentName componentName2;
        try {
            Intent intent2 = new Intent();
            if (z) {
                componentName = componentName2;
                C0276.f576.getClass();
                componentName2 = new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivityS" + i + '_' + i2 + "XH");
            } else {
                C0276.f576.getClass();
                componentName = new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivityS" + i + '_' + i2 + 'X');
            }
            Intent component = intent2.setComponent(componentName);
            component.putExtra(C0281.C0282.f592, intent);
            return component;
        } catch (Exception unused) {
            return intent;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2330(Intent intent, String str, int i) {
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            Object obj = extras.get(str);
            if (obj instanceof Uri) {
                intent.putExtra(str, FozaStubProvider.f33.m77((Uri) obj, i));
            } else if (!(obj instanceof ArrayList)) {
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!(next instanceof Uri)) {
                        break;
                    }
                    Uri m77 = FozaStubProvider.f33.m77((Uri) next, i);
                    if (m77 != null) {
                        arrayList.add(m77);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return;
                }
                intent.putExtra(str, arrayList);
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Intent m2322(@NotNull Intent intent) {
        intent.addFlags(270532608);
        return intent;
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Intent m2312(@NotNull Intent intent, int i) {
        try {
            Intent intent2 = new Intent();
            C0276.f576.getClass();
            Intent component = intent2.setComponent(new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivity" + i));
            component.putExtra(C0281.C0282.f592, intent);
            return component;
        } catch (Exception unused) {
            return intent;
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final Intent m2313(@NotNull Intent intent, int i, int i2, boolean z) {
        ComponentName componentName;
        ComponentName componentName2;
        try {
            Intent intent2 = new Intent();
            if (z) {
                componentName = componentName2;
                C0276.f576.getClass();
                componentName2 = new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivityS" + i + '_' + i2 + 'H');
            } else {
                C0276.f576.getClass();
                componentName = new ComponentName(C0276.f583, "lu.die.foza.SleepyFox.FozaStubActivityGroup$Companion$FozaStubActivityS" + i + '_' + i2);
            }
            Intent component = intent2.setComponent(componentName);
            component.putExtra(C0281.C0282.f592, intent);
            if (f1015.m2324(67108864, intent)) {
                component.addFlags(67108864);
            }
            return component;
        } catch (Exception unused) {
            return intent;
        }
    }
}
