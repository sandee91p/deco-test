package lu.die.foza.SleepyFox;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SourceDebugExtension({"SMAP\nFozaInternalContentObserverStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FozaInternalContentObserverStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaInternalContentObserverStore\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,190:1\n13309#2,2:191\n*S KotlinDebug\n*F\n+ 1 FozaInternalContentObserverStore.kt\nlu/die/foza/Framework/FoxWannaBeWealthy/FozaInternalContentObserverStore\n*L\n136#1:191,2\n*E\n"})
/* renamed from: lu.die.foza.SleepyFox.ࢸ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢸ.class */
public final class C0316 {
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final C0316 f744 = new C0316();
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final ConcurrentHashMap<String, ConcurrentSkipListSet<C0317>> f745 = new ConcurrentHashMap<>();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final ConcurrentSkipListSet<C0317> f746 = new ConcurrentSkipListSet<>();

    /* renamed from: lu.die.foza.SleepyFox.ࢸ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢸ$Ϳ.class */
    public static final class C0317 implements Comparable<C0317> {
        @NotNull

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final String f747;
        @NotNull

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final IContentObserver f748;
        @NotNull

        /* renamed from: ԩ  reason: contains not printable characters */
        public final IBinder f749;

        public C0317(@NotNull String str, @NotNull IContentObserver iContentObserver, @NotNull IBinder iBinder) {
            this.f747 = str;
            this.f748 = iContentObserver;
            this.f749 = iBinder;
        }

        @NotNull
        /* renamed from: ԩ  reason: contains not printable characters */
        public final String m1879() {
            return this.f747;
        }

        @NotNull
        /* renamed from: Ԩ  reason: contains not printable characters */
        public final IContentObserver m1880() {
            return this.f748;
        }

        @Override // java.lang.Comparable
        /* renamed from: Ϳ  reason: contains not printable characters */
        public int compareTo(@NotNull C0317 c0317) {
            int hashCode = c0317.hashCode();
            int hashCode2 = hashCode();
            if (hashCode > hashCode2) {
                return 1;
            }
            return hashCode == hashCode2 ? 0 : -1;
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final IBinder m1881() {
            return this.f749;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢸ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢸ$Ԩ.class */
    public static final class C0318 implements IBinder.DeathRecipient {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f750;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final /* synthetic */ C0317 f751;

        public C0318(IBinder iBinder, C0317 c0317) {
            this.f750 = iBinder;
            this.f751 = c0317;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            try {
                this.f750.unlinkToDeath(this, 0);
                C0316.f746.remove(this.f751);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࢸ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࢸ$Ԫ.class */
    public static final class C0319 implements IBinder.DeathRecipient {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f752;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final /* synthetic */ ConcurrentSkipListSet<C0317> f753;

        /* renamed from: ԯ  reason: contains not printable characters */
        public final /* synthetic */ C0317 f754;

        /* renamed from: ՠ  reason: contains not printable characters */
        public final /* synthetic */ String f755;

        public C0319(IBinder iBinder, ConcurrentSkipListSet<C0317> concurrentSkipListSet, C0317 c0317, String str) {
            this.f752 = iBinder;
            this.f753 = concurrentSkipListSet;
            this.f754 = c0317;
            this.f755 = str;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            try {
                this.f752.unlinkToDeath(this, 0);
                this.f753.remove(this.f754);
                if (!this.f753.isEmpty()) {
                    return;
                }
                C0316.f745.remove(this.f755);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1878(@Nullable Uri[] uriArr, @Nullable IBinder iBinder, boolean z) {
        if (uriArr == null) {
            return;
        }
        boolean z2 = false;
        try {
            for (Uri uri : uriArr) {
                if (uri != null) {
                    try {
                        String uri2 = uri.toString();
                        ConcurrentSkipListSet<C0317> concurrentSkipListSet = f745.get(uri2);
                        if (concurrentSkipListSet != null) {
                            z2 = true;
                            Iterator<C0317> it = concurrentSkipListSet.iterator();
                            while (it.hasNext()) {
                                try {
                                    IContentObserver iContentObserver = it.next().f748;
                                    C0276.f576.getClass();
                                    iContentObserver.onChange(z, uri, C0276.f585);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        Iterator<C0317> it2 = f746.iterator();
                        while (it2.hasNext()) {
                            C0317 next = it2.next();
                            try {
                                if (StringsKt.startsWith$default(uri2, next.f747, false, 2, (Object) null)) {
                                    z2 = true;
                                    IContentObserver iContentObserver2 = next.f748;
                                    C0276.f576.getClass();
                                    iContentObserver2.onChange(z, uri, C0276.f585);
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    if (iBinder != null && z2 && z) {
                        IContentObserver asInterface = IContentObserver.Stub.asInterface(iBinder);
                        if (asInterface != null) {
                            C0276.f576.getClass();
                            asInterface.onChange(true, uri, C0276.f585);
                        }
                        z2 = false;
                    }
                }
            }
        } catch (Exception unused4) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1877(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        try {
            Iterator<Map.Entry<String, ConcurrentSkipListSet<C0317>>> it = f745.entrySet().iterator();
            while (it.hasNext()) {
                ConcurrentSkipListSet<C0317> value = it.next().getValue();
                if (!value.isEmpty()) {
                    try {
                        Iterator<C0317> it2 = value.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(it2.next().f749, iBinder)) {
                                it2.remove();
                            }
                        }
                        if (value.isEmpty()) {
                            it.remove();
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    it.remove();
                }
            }
            Iterator<C0317> it3 = f746.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.areEqual(it3.next().f749, iBinder)) {
                    it3.remove();
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1876(@Nullable Uri uri, @Nullable IBinder iBinder, boolean z) {
        ConcurrentSkipListSet<C0317> concurrentSkipListSet;
        if (uri == null || iBinder == null) {
            return;
        }
        try {
            IContentObserver asInterface = IContentObserver.Stub.asInterface(iBinder);
            String uri2 = uri.toString();
            C0317 c0317 = new C0317(uri2, asInterface, iBinder);
            if (z) {
                f746.add(c0317);
                iBinder.linkToDeath(new C0318(iBinder, c0317), 0);
                return;
            }
            ConcurrentHashMap<String, ConcurrentSkipListSet<C0317>> concurrentHashMap = f745;
            ConcurrentSkipListSet<C0317> concurrentSkipListSet2 = concurrentHashMap.get(uri2);
            ConcurrentSkipListSet<C0317> concurrentSkipListSet3 = concurrentSkipListSet2;
            if (concurrentSkipListSet2 == null) {
                concurrentSkipListSet3 = concurrentSkipListSet;
                concurrentSkipListSet = new ConcurrentSkipListSet<>();
                concurrentHashMap.put(uri2, concurrentSkipListSet3);
            }
            concurrentSkipListSet3.add(c0317);
            iBinder.linkToDeath(new C0319(iBinder, concurrentSkipListSet3, c0317, uri2), 0);
        } catch (Exception unused) {
        }
    }
}
