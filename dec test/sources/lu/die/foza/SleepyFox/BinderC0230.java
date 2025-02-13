package lu.die.foza.SleepyFox;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;
import lu.die.foza.SleepyFox.AbstractC0397;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࠤ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠤ.class */
public final class BinderC0230 extends AbstractC0397.AbstractBinderC0399 {
    @NotNull

    /* renamed from: ސ  reason: contains not printable characters */
    public static final BinderC0230 f443 = new BinderC0230();

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public Intent mo1301(@Nullable Intent intent, @Nullable String str) {
        C0265 c0265 = C0265.f550;
        if (intent == null) {
            return null;
        }
        if (str == null) {
            str = C0281.C0289.m1746();
        }
        return c0265.m1673(intent, str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    @NotNull
    /* renamed from: ԭ  reason: contains not printable characters */
    public AbstractC0387 mo1302() {
        return BinderC0331.f784;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo1307(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable IBinder iBinder, @Nullable String str) {
        if (serviceInfo == null || str == null) {
            return -1;
        }
        try {
            return C0265.f550.m1670(intent, serviceInfo, iBinder, str);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: ՠ  reason: contains not printable characters */
    public void mo1310() {
        C0265.f550.m1666();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: ԩ  reason: contains not printable characters */
    public void mo1317(@Nullable IBinder iBinder) {
        C0313.f737.m1867(iBinder);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ԫ  reason: contains not printable characters */
    public void mo1322() {
        C0265.f550.m1686();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    @Nullable
    /* renamed from: Ԩ  reason: contains not printable characters */
    public ComponentName mo1305(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable String str) {
        if (serviceInfo == null || str == null) {
            return null;
        }
        try {
            if (C0265.m1647(C0265.f550, intent, serviceInfo, str, false, 8, null) == null) {
                return null;
            }
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo1315(@Nullable Intent intent, @Nullable String str) {
        return C0265.f550.m1682(intent, str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    @Nullable
    /* renamed from: Ԫ  reason: contains not printable characters */
    public String mo1319(int i) {
        return C0265.f550.m1683(i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    @NotNull
    /* renamed from: ԩ  reason: contains not printable characters */
    public List<ActivityManager.RunningAppProcessInfo> mo1324(int i) {
        return C0265.f550.m1687(i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: ԩ  reason: contains not printable characters */
    public void mo1303(@NotNull String str, @NotNull String str2) {
        C0265.f550.m1667(str, str2);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo1304(@Nullable ProviderInfo providerInfo, @Nullable String str) {
        if (providerInfo == null || str == null) {
            return -1;
        }
        try {
            return C0265.f550.m1677(providerInfo, str);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ԫ  reason: contains not printable characters */
    public boolean mo1313(@Nullable String str, @Nullable String str2, int i) {
        if (str == null || str2 == null) {
            return false;
        }
        return C0265.f550.m1674(str, str2, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: ԩ  reason: contains not printable characters */
    public void mo1309(@Nullable Intent intent, @Nullable String str) {
        C0265 c0265 = C0265.f550;
        if (intent == null) {
            return;
        }
        if (str == null) {
            str = C0281.C0289.m1746();
        }
        c0265.m1668(intent, str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1311(@Nullable String str, @Nullable String str2) {
        C0265.f550.m1676(str, str2);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ԫ  reason: contains not printable characters */
    public void mo1318(@Nullable Intent intent) {
        C0313.f737.m1865(intent);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1312(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null || str2 == null) {
            return;
        }
        C0265.m1652(C0265.f550, str, str2, z, null, null, 24, null);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1320(long j) {
        C0265.f550.m1684((int) (j & 4294967295L), (int) ((j & (-4294967296L)) >> 32));
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1316(@NotNull IntentFilter intentFilter, @NotNull IBinder iBinder, @Nullable String str, @NotNull AbstractC0382 abstractC0382) {
        C0313.f737.m1864(intentFilter, iBinder, str, abstractC0382);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1323(@Nullable C0355 c0355, @Nullable AbstractC0382 abstractC0382) {
        C0265.f550.getClass();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1321(long j, @Nullable Notification notification, int i) {
        C0265.f550.m1685((int) (j & 4294967295L), (int) ((j & (-4294967296L)) >> 32), notification, i);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo1306(@Nullable Intent intent, @Nullable ServiceInfo serviceInfo, @Nullable String str) {
        if (intent == null || serviceInfo == null || str == null) {
            return -1;
        }
        return C0265.f550.m1671(intent, serviceInfo, str);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    /* renamed from: Ϳ  reason: contains not printable characters */
    public int mo1308(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return -1;
        }
        return C0265.f550.m1678(iBinder);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0397
    @Nullable
    /* renamed from: Ϳ  reason: contains not printable characters */
    public Intent mo1314(@Nullable Intent intent, int i) {
        C0265 c0265 = C0265.f550;
        if (intent == null) {
            return null;
        }
        return c0265.m1681(intent, i);
    }
}
