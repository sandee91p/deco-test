package lu.die.foza.SleepyFox;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* renamed from: lu.die.foza.SleepyFox.ࢷ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢷ.class */
public final class C0313 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0313 f737 = new C0313();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final ConcurrentHashMap<String, ConcurrentHashMap<IBinder, C0314>> f738 = new ConcurrentHashMap<>();

    /* renamed from: lu.die.foza.SleepyFox.ࢷ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢷ$Ϳ.class */
    public static final class C0314 {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final IntentFilter f739;
        @Nullable

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final String f740;
        @NotNull

        /* renamed from: ԩ  reason: contains not printable characters */
        public final AbstractC0382 f741;

        public C0314(@NotNull IntentFilter intentFilter, @Nullable String str, @NotNull AbstractC0382 abstractC0382) {
            this.f739 = intentFilter;
            this.f740 = str;
            this.f741 = abstractC0382;
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final IntentFilter m1870() {
            return this.f739;
        }

        @Nullable
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final String m1871() {
            return this.f740;
        }

        @NotNull
        /* renamed from: ԩ  reason: contains not printable characters */
        public final AbstractC0382 m1872() {
            return this.f741;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢷ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢷ$Ԩ.class */
    public static final class C0315 implements IBinder.DeathRecipient {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f742;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final /* synthetic */ LinkedList<String> f743;

        public C0315(IBinder iBinder, LinkedList<String> linkedList) {
            this.f742 = iBinder;
            this.f743 = linkedList;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            try {
                this.f742.unlinkToDeath(this, 0);
                Iterator<String> it = this.f743.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C0313.f738.get(next);
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(this.f742);
                        if (concurrentHashMap.isEmpty()) {
                            C0313.f738.remove(next);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final void m1865(@Nullable Intent intent) {
        String action;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception unused) {
                return;
            }
        } else {
            action = null;
        }
        if (action != null) {
            String str = intent.getPackage();
            if (str == null || str.length() == 0) {
                ConcurrentHashMap<IBinder, C0314> concurrentHashMap = f738.get(action);
                if (concurrentHashMap != null) {
                    try {
                        for (Map.Entry<IBinder, C0314> entry : concurrentHashMap.entrySet()) {
                            m1868(intent, entry.getKey());
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        C0265.m1657(C0265.f550, intent, (String) null, 2, (Object) null);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1867(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        try {
            Iterator<Map.Entry<String, ConcurrentHashMap<IBinder, C0314>>> it = f738.entrySet().iterator();
            while (it.hasNext()) {
                ConcurrentHashMap<IBinder, C0314> value = it.next().getValue();
                Iterator<Map.Entry<IBinder, C0314>> it2 = value.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual(it2.next(), iBinder)) {
                            it2.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (value.isEmpty()) {
                    it.remove();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1864(@NotNull IntentFilter intentFilter, @NotNull IBinder iBinder, @Nullable String str, @NotNull AbstractC0382 abstractC0382) {
        ConcurrentHashMap<IBinder, C0314> concurrentHashMap;
        try {
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            LinkedList linkedList = new LinkedList();
            while (true) {
                if (!(actionsIterator != null && actionsIterator.hasNext())) {
                    break;
                }
                linkedList.add(actionsIterator.next());
            }
            boolean z = false;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ConcurrentHashMap<String, ConcurrentHashMap<IBinder, C0314>> concurrentHashMap2 = f738;
                ConcurrentHashMap<IBinder, C0314> concurrentHashMap3 = concurrentHashMap2.get(str2);
                ConcurrentHashMap<IBinder, C0314> concurrentHashMap4 = concurrentHashMap3;
                if (concurrentHashMap3 == null) {
                    concurrentHashMap4 = concurrentHashMap;
                    concurrentHashMap = new ConcurrentHashMap<>();
                }
                if (concurrentHashMap4.size() < 1000) {
                    z = true;
                    concurrentHashMap4.put(iBinder, new C0314(intentFilter, str, abstractC0382));
                }
                concurrentHashMap2.put(str2, concurrentHashMap4);
            }
            if (!z) {
                return;
            }
            iBinder.linkToDeath(new C0315(iBinder, linkedList), 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1866(@NotNull Intent intent) {
        try {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            ConcurrentHashMap<IBinder, C0314> concurrentHashMap = f738.get(action);
            if (concurrentHashMap == null) {
                return;
            }
            String str = intent.getPackage();
            Set<String> categories = intent.getCategories();
            Uri data = intent.getData();
            String scheme = data != null ? data.getScheme() : null;
            String type = intent.getType();
            for (Map.Entry<IBinder, C0314> entry : concurrentHashMap.entrySet()) {
                try {
                    IntentFilter intentFilter = entry.getValue().f739;
                    if ((str == null || str.length() == 0) || Intrinsics.areEqual(str, entry.getValue().f740)) {
                        if (!(categories == null || categories.isEmpty())) {
                            for (String str2 : categories) {
                                intentFilter.hasCategory(str2);
                            }
                        }
                        if ((scheme == null || scheme.length() == 0) || intentFilter.hasDataScheme(scheme)) {
                            if ((type == null || type.length() == 0) || intentFilter.hasDataType(type)) {
                                if (C0175.f274) {
                                    m1869(intent, entry.getKey(), entry.getValue().f741);
                                } else {
                                    m1868(intent, entry.getKey());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1868(Intent intent, IBinder iBinder) {
        try {
            IIntentReceiver asInterface = IIntentReceiver.Stub.asInterface(iBinder);
            Bundle bundle = Bundle.EMPTY;
            C0276.f576.getClass();
            asInterface.performReceive(intent, -1, (String) null, bundle, false, false, C0276.f584);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1869(Intent intent, IBinder iBinder, AbstractC0382 abstractC0382) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBinder(C0281.C0282.f594, iBinder);
            bundle.putParcelable(C0281.C0282.f611, intent);
            Unit unit = Unit.INSTANCE;
            abstractC0382.mo1796(-478256555, bundle);
        } catch (Exception unused) {
        }
    }
}
