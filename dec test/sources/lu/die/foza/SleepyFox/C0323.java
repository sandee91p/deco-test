package lu.die.foza.SleepyFox;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.SigningDetails;
import android.content.pm.SigningInfo;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lu.die.foza.SleepyFox.C0255;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SuppressLint({"WrongConstant, SdCardPath"})
/* renamed from: lu.die.foza.SleepyFox.ࢼ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢼ.class */
public final class C0323 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0323 f761 = new C0323();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final PackageManager f762 = C0276.m1701().getPackageManager();

    /* renamed from: lu.die.foza.SleepyFox.ࢼ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢼ$Ϳ.class */
    public static final class C0324 extends Lambda implements Function1<String, Unit> {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final /* synthetic */ ApplicationInfo f763;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final /* synthetic */ ApplicationInfo f764;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0324(ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
            super(1);
            this.f763 = applicationInfo;
            this.f764 = applicationInfo2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            C0047.f129.m475(this.f763, this.f764, str);
        }
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final PackageInfo m1918(@Nullable String str, int i) {
        if (str == null) {
            return null;
        }
        try {
            return f762.getPackageInfo(str, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final PermissionInfo m1919(@NotNull String str, int i) {
        try {
            return f762.getPermissionInfo(str, i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final ServiceInfo m1923(@NotNull ComponentName componentName, int i) {
        try {
            return f762.getServiceInfo(componentName, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ApplicationInfo m1925(@Nullable ApplicationInfo applicationInfo, @Nullable ApplicationInfo applicationInfo2) {
        if (applicationInfo == null || applicationInfo2 == null) {
            return applicationInfo2;
        }
        try {
            applicationInfo.uid = applicationInfo2.uid;
            applicationInfo.sourceDir = applicationInfo2.sourceDir;
            applicationInfo.publicSourceDir = applicationInfo2.publicSourceDir;
            String str = applicationInfo2.nativeLibraryDir;
            try {
                File file = new File(str);
                if (!file.exists()) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && parentFile.exists()) {
                        C0255.m1523(C0255.f522, parentFile.getCanonicalPath(), str, false, 4, null);
                    }
                }
            } catch (Exception unused) {
            }
            applicationInfo.nativeLibraryDir = str;
            applicationInfo.dataDir = applicationInfo2.dataDir;
            if (C0175.f262) {
                applicationInfo.splitNames = applicationInfo2.splitNames;
            }
            if (C0175.f261) {
                applicationInfo.deviceProtectedDataDir = applicationInfo2.deviceProtectedDataDir;
            }
            C0324 c0324 = new C0324(applicationInfo, applicationInfo2);
            c0324.invoke("primaryCpuAbi");
            c0324.invoke("scanSourceDir");
            c0324.invoke("scanPublicSourceDir");
            if (C0175.f264 && (applicationInfo.flags & 134217728) != 0) {
                C0047.f129.m464((Object) applicationInfo, "networkSecurityConfigRes", (Object) 0);
            }
            applicationInfo.splitSourceDirs = applicationInfo2.splitSourceDirs;
            applicationInfo.splitPublicSourceDirs = applicationInfo2.splitPublicSourceDirs;
            applicationInfo.sharedLibraryFiles = applicationInfo2.sharedLibraryFiles;
            String str2 = applicationInfo2.processName;
            applicationInfo.processName = str2 == null || str2.length() == 0 ? applicationInfo.packageName : applicationInfo2.processName;
            if (C0175.f271) {
                C0354.f837.m2164(applicationInfo);
            }
            return applicationInfo;
        } catch (Exception unused2) {
            return applicationInfo2;
        }
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final PackageInfo m1928(@NotNull PackageInfo packageInfo, int i) {
        PackageInfo packageInfo2 = new PackageInfo();
        if ((i & 1) != 0) {
            packageInfo2.activities = packageInfo.activities;
        }
        if ((i & 2) != 0) {
            packageInfo2.receivers = packageInfo.receivers;
        }
        if ((i & 8) != 0) {
            packageInfo2.providers = packageInfo.providers;
        }
        if ((i & 4) != 0) {
            packageInfo2.services = packageInfo.services;
        }
        if ((i & 4096) != 0) {
            packageInfo2.permissions = packageInfo.permissions;
            packageInfo2.requestedPermissions = packageInfo.requestedPermissions;
            String[] strArr = packageInfo.requestedPermissions;
            int length = strArr != null ? strArr.length : 0;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = 0;
            }
            packageInfo2.requestedPermissionsFlags = iArr;
        }
        if ((i & 16384) != 0) {
            packageInfo2.configPreferences = packageInfo.configPreferences;
        }
        if ((i & 16) != 0) {
            packageInfo2.instrumentation = packageInfo.instrumentation;
        }
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.splitNames = packageInfo.splitNames;
        if (C0175.f264) {
            packageInfo2.setLongVersionCode(packageInfo.getLongVersionCode());
            if ((i & 134217728) != 0) {
                if (C0309.f727.m1846(packageInfo.packageName)) {
                    m1909(packageInfo2);
                } else {
                    packageInfo2.signingInfo = packageInfo.signingInfo;
                }
            }
        } else {
            packageInfo2.versionCode = packageInfo.versionCode;
        }
        packageInfo2.versionName = packageInfo.versionName;
        if (C0175.f259) {
            packageInfo2.baseRevisionCode = packageInfo.baseRevisionCode;
            packageInfo2.splitRevisionCodes = packageInfo.splitRevisionCodes;
        }
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.applicationInfo = packageInfo.applicationInfo;
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        if ((i & C0255.C0256.f529) != 0) {
            int[] iArr2 = packageInfo.gids;
            int[] iArr3 = iArr2;
            if (iArr2 == null) {
                iArr3 = new int[0];
            }
            packageInfo2.gids = iArr3;
        }
        if ((i & 64) != 0) {
            if (C0309.f727.m1846(packageInfo.packageName)) {
                m1909(packageInfo2);
            } else {
                packageInfo2.signatures = packageInfo.signatures;
            }
        }
        packageInfo2.reqFeatures = packageInfo.reqFeatures;
        packageInfo2.featureGroups = packageInfo.featureGroups;
        if (C0175.f272) {
            packageInfo2.attributions = packageInfo.attributions;
        }
        packageInfo2.installLocation = packageInfo.installLocation;
        if (C0175.f271) {
            packageInfo2.isApex = packageInfo.isApex;
        }
        return packageInfo2;
    }

    @NotNull
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String[] m1917(@NotNull String str) {
        try {
            ApplicationInfo m1927 = m1927(str, 0);
            if (m1927 == null) {
                return new String[]{str};
            }
            String[] packagesForUid = f762.getPackagesForUid(m1927.uid);
            String[] strArr = packagesForUid;
            if (packagesForUid == null) {
                String[] strArr2 = new String[1];
                strArr = strArr2;
                strArr2[0] = str;
            }
            return strArr;
        } catch (Exception unused) {
            return new String[]{str};
        }
    }

    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final PackageInfo m1924(@NotNull String str) {
        Object newInstance;
        try {
            PackageParser.Package parsePackage = new PackageParser().parsePackage(new File(str), 0);
            PackageInfo packageInfo = new PackageInfo();
            packageInfo.packageName = parsePackage.packageName;
            ApplicationInfo applicationInfo = parsePackage.applicationInfo;
            if (applicationInfo != null) {
                packageInfo.applicationInfo = applicationInfo;
                applicationInfo.dataDir = "/data/user/0/" + applicationInfo.packageName;
            }
            packageInfo.versionName = parsePackage.mVersionName;
            packageInfo.versionCode = parsePackage.mVersionCode;
            if (C0175.f264) {
                try {
                    C0047.f129.m464(packageInfo, "versionCodeMajor", Integer.valueOf(parsePackage.mVersionCodeMajor));
                } catch (Exception unused) {
                    packageInfo.setLongVersionCode((parsePackage.mVersionCodeMajor << 32) & parsePackage.mVersionCode);
                }
            }
            packageInfo.splitNames = parsePackage.splitNames;
            packageInfo.sharedUserId = parsePackage.mSharedUserId;
            packageInfo.sharedUserLabel = parsePackage.mSharedUserLabel;
            if (C0175.f259) {
                packageInfo.baseRevisionCode = parsePackage.baseRevisionCode;
                packageInfo.splitRevisionCodes = parsePackage.splitRevisionCodes;
            }
            packageInfo.lastUpdateTime = System.currentTimeMillis();
            packageInfo.firstInstallTime = System.currentTimeMillis();
            packageInfo.installLocation = parsePackage.installLocation;
            packageInfo.gids = new int[0];
            PackageParser.SigningDetails signingDetails = parsePackage.mSigningDetails;
            if (signingDetails == null || Intrinsics.areEqual(signingDetails, PackageParser.SigningDetails.UNKNOWN) || C0309.f727.m1846(parsePackage.packageName)) {
                m1909(packageInfo);
            } else {
                try {
                    if (C0175.f264) {
                        if (C0175.f273) {
                            Class[] clsArr = new Class[1];
                            clsArr[0] = SigningDetails.class;
                            Constructor declaredConstructor = SigningInfo.class.getDeclaredConstructor(clsArr);
                            Object[] objArr = new Object[1];
                            PackageParser.SigningDetails signingDetails2 = parsePackage.mSigningDetails;
                            objArr[0] = new SigningDetails(signingDetails2.signatures, signingDetails2.signatureSchemeVersion);
                            newInstance = declaredConstructor.newInstance(objArr);
                        } else {
                            Class[] clsArr2 = new Class[1];
                            clsArr2[0] = PackageParser.SigningDetails.class;
                            Constructor declaredConstructor2 = SigningInfo.class.getDeclaredConstructor(clsArr2);
                            Object[] objArr2 = new Object[1];
                            objArr2[0] = parsePackage.mSigningDetails;
                            newInstance = declaredConstructor2.newInstance(objArr2);
                        }
                        packageInfo.signingInfo = (SigningInfo) newInstance;
                        packageInfo.signatures = parsePackage.mSigningDetails.signatures;
                    } else {
                        packageInfo.signatures = parsePackage.mSignatures;
                    }
                } catch (Exception unused2) {
                }
            }
            return packageInfo;
        } catch (Exception unused3) {
            return null;
        }
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final ProviderInfo m1926(@NotNull String str) {
        return f762.resolveContentProvider(str, 896);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ActivityInfo m1933(@NotNull ComponentName componentName) {
        return m1908(this, componentName, 0, 2, (Object) null);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ActivityInfo m1921(@NotNull ComponentName componentName, int i) {
        try {
            return f762.getActivityInfo(componentName, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final List<ResolveInfo> m1931(@NotNull Intent intent) {
        return m1906(this, intent, 0, 2, null);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public final List<ResolveInfo> m1915(@NotNull Intent intent, int i) {
        try {
            return f762.queryIntentServices(intent, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final ActivityInfo m1920(@NotNull ComponentName componentName, int i) {
        try {
            return f762.getReceiverInfo(componentName, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final ProviderInfo m1922(@NotNull ComponentName componentName, int i) {
        try {
            return f762.getProviderInfo(componentName, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ ActivityInfo m1908(C0323 c0323, ComponentName componentName, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c0323.m1921(componentName, i);
    }

    /* renamed from: Ԫ  reason: contains not printable characters */
    public static /* synthetic */ List m1906(C0323 c0323, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 131072;
        }
        return c0323.m1915(intent, i);
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final ApplicationInfo m1927(@NotNull String str, int i) {
        try {
            return f762.getApplicationInfo(str, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final List<ResolveInfo> m1930(@NotNull Intent intent) {
        return m1905(this, intent, 0, 2, null);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final List<ResolveInfo> m1932(@NotNull Intent intent) {
        return m1907(this, intent, 0, 2, null);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final List<ResolveInfo> m1914(@NotNull Intent intent, int i) {
        try {
            return f762.queryIntentActivities(intent, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmOverloads
    @Nullable
    /* renamed from: ԩ  reason: contains not printable characters */
    public final List<ResolveInfo> m1916(@NotNull Intent intent, int i) {
        try {
            return f762.queryIntentContentProviders(intent, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Intent m1912(@NotNull String str) {
        try {
            return f762.getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static /* synthetic */ List m1905(C0323 c0323, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 131072;
        }
        return c0323.m1914(intent, i);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public static /* synthetic */ List m1907(C0323 c0323, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 131072;
        }
        return c0323.m1916(intent, i);
    }

    @NotNull
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final PackageManager m1911() {
        return f762;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008e -> B:8:0x0097). Please submit an issue!!! */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1909(PackageInfo packageInfo) {
        Signature[] signatureArr = {new Signature(C0281.C0285.f639)};
        try {
            if (!C0175.f264) {
                packageInfo.signatures = signatureArr;
                return;
            }
            PackageParser.SigningDetails signingDetails = new PackageParser.SigningDetails(signatureArr, 2);
            if (C0175.f273) {
                packageInfo.signingInfo = (SigningInfo) SigningInfo.class.getDeclaredConstructor(SigningDetails.class).newInstance(new SigningDetails(signingDetails.signatures, signingDetails.signatureSchemeVersion));
            } else {
                packageInfo.signingInfo = (SigningInfo) SigningInfo.class.getDeclaredConstructor(PackageParser.SigningDetails.class).newInstance(signingDetails);
            }
            packageInfo.signatures = signingDetails.signatures;
        } catch (Exception unused) {
        }
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<ResolveInfo> m1929(@NotNull Intent intent) {
        return m1904(this, intent, 0, 2, (Object) null);
    }

    @JvmOverloads
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<ResolveInfo> m1913(@NotNull Intent intent, int i) {
        try {
            return f762.queryBroadcastReceivers(intent, i | C0255.C0256.f528);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static /* synthetic */ List m1904(C0323 c0323, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 131072;
        }
        return c0323.m1913(intent, i);
    }
}
