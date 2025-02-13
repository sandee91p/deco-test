package lu.die.foza.SleepyFox;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* renamed from: lu.die.foza.SleepyFox.ဢ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဢ.class */
public abstract class AbstractC0418<F extends IntentFilter> {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final C0024<F[]> f1019 = new C0024<>();

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final C0024<F[]> f1020 = new C0024<>();

    /* renamed from: ԩ  reason: contains not printable characters */
    public final C0024<F[]> f1021 = new C0024<>();

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0024<F[]> f1022 = new C0024<>();

    /* renamed from: ԫ  reason: contains not printable characters */
    public final C0024<F[]> f1023 = new C0024<>();

    /* renamed from: Ԭ  reason: contains not printable characters */
    public final C0024<F[]> f1024 = new C0024<>();

    /* renamed from: lu.die.foza.SleepyFox.ဢ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဢ$Ϳ.class */
    public class C0419 extends AbstractSet<String> {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final String[] f1025;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final int f1026;

        /* renamed from: ԩ  reason: contains not printable characters */
        public final /* synthetic */ String[] f1027;

        /* renamed from: lu.die.foza.SleepyFox.ဢ$Ϳ$Ϳ  reason: contains not printable characters */
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ဢ$Ϳ$Ϳ.class */
        public final class C0420 implements Iterator<String> {

            /* renamed from: Ϳ  reason: contains not printable characters */
            public int f1028 = 0;

            public C0420() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1028 < C0419.this.f1026;
            }

            @Override // java.util.Iterator
            /* renamed from: Ϳ  reason: contains not printable characters */
            public String next() {
                String[] strArr = C0419.this.f1025;
                int i = this.f1028;
                this.f1028 = i + 1;
                return strArr[i];
            }
        }

        public C0419(String[] strArr) {
            this.f1027 = strArr;
            this.f1025 = strArr;
            this.f1026 = strArr.length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<String> iterator() {
            C0420 c0420 = new C0420();
            c0420.f1028 = 0;
            return c0420;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1026;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2333(F f) {
        int m2338 = m2338((AbstractC0418<F>) f, f.schemesIterator(), (C0024<AbstractC0418<F>[]>) this.f1022);
        int m2337 = m2337(f);
        if (m2338 == 0 && m2337 == 0) {
            m2338((AbstractC0418<F>) f, f.actionsIterator(), (C0024<AbstractC0418<F>[]>) this.f1023);
        }
        if (m2337 != 0) {
            m2338((AbstractC0418<F>) f, f.actionsIterator(), (C0024<AbstractC0418<F>[]>) this.f1024);
        }
    }

    /* renamed from: Ϳ */
    public abstract F[] mo1806(int i);

    /* renamed from: Ϳ */
    public abstract void mo1807(F f, int i, int i2, List<ResolveInfo> list, C0065 c0065);

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final int m2337(F f) {
        String str;
        Iterator<String> typesIterator = f.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            String str2 = next;
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str = str2.substring(0, indexOf).intern();
            } else {
                str = str2;
                str2 = str2.concat("/*");
            }
            m2336((C0024<String[]>) this.f1019, str2, (String) f);
            if (indexOf > 0) {
                m2336((C0024<String[]>) this.f1020, str, (String) f);
            } else {
                m2336((C0024<String[]>) this.f1021, str, (String) f);
            }
        }
        return i;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2336(C0024<F[]> c0024, String str, F f) {
        int hashCode = str.hashCode();
        F[] m318 = c0024.m318(hashCode);
        if (m318 == null) {
            F[] mo1806 = mo1806(2);
            c0024.m309(hashCode, mo1806);
            mo1806[0] = f;
            return;
        }
        int length = m318.length;
        int i = length;
        while (i > 0 && m318[i - 1] == null) {
            i--;
        }
        if (i < length) {
            m318[i] = f;
            return;
        }
        F[] mo18062 = mo1806((length * 3) / 2);
        System.arraycopy(m318, 0, mo18062, 0, length);
        mo18062[length] = f;
        c0024.m309(hashCode, mo18062);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2339(Intent intent, Set<String> set, boolean z, String str, String str2, F[] fArr, List<ResolveInfo> list, C0065 c0065, int i) {
        F f;
        String action = intent.getAction();
        Uri data = intent.getData();
        int length = fArr != null ? fArr.length : 0;
        for (int i2 = 0; i2 < length && (f = fArr[i2]) != null; i2++) {
            int match = f.match(action, (str == null || str.isEmpty()) ? null : str, str2, data, set, "Neko");
            if (match >= 0 && (!z || f.hasCategory("android.intent.category.DEFAULT"))) {
                mo1807(f, match, i, list, c0065);
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static Set<String> m2332(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new C0419((String[]) categories.toArray(new String[0]));
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<ResolveInfo> m2334(Intent intent, String str, int i) {
        return m2335(intent, str, (i & 65536) != 0, i);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final List<ResolveInfo> m2335(Intent intent, String str, boolean z, int i) {
        int indexOf;
        String scheme = intent.getScheme();
        ArrayList arrayList = new ArrayList();
        C0065 c0065 = new C0065(10);
        F[] fArr = null;
        F[] fArr2 = null;
        F[] fArr3 = null;
        F[] fArr4 = null;
        if (str != null && !str.isEmpty() && (indexOf = str.indexOf(47)) > 0) {
            String substring = str.substring(0, indexOf);
            if (!substring.equals("*")) {
                fArr = (str.length() == indexOf + 2 && str.charAt(indexOf + 1) == '*') ? this.f1020.m318(substring.hashCode()) : this.f1019.m318(str.hashCode());
                fArr2 = this.f1021.m318(substring.hashCode());
                fArr3 = this.f1021.m318(42);
            } else if (intent.getAction() != null) {
                fArr = this.f1024.m318(intent.getAction().hashCode());
            }
        }
        if (scheme != null) {
            fArr4 = this.f1022.m318(scheme.hashCode());
        }
        if ((str == null || str.isEmpty()) && ((scheme == null || scheme.isEmpty()) && intent.getAction() != null)) {
            fArr = this.f1023.m318(intent.getAction().hashCode());
        }
        F[] fArr5 = fArr;
        Set<String> m2332 = m2332(intent);
        if (fArr5 != null) {
            m2339(intent, m2332, z, str, scheme, fArr, arrayList, c0065, i);
        }
        if (fArr2 != null) {
            m2339(intent, m2332, z, str, scheme, fArr2, arrayList, c0065, i);
        }
        if (fArr3 != null) {
            m2339(intent, m2332, z, str, scheme, fArr3, arrayList, c0065, i);
        }
        if (fArr4 != null) {
            m2339(intent, m2332, z, str, scheme, fArr4, arrayList, c0065, i);
        }
        return arrayList;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m2338(F f, Iterator<String> it, C0024<F[]> c0024) {
        if (it == null) {
            return 0;
        }
        int i = 0;
        while (it.hasNext()) {
            i++;
            m2336((C0024<String[]>) c0024, it.next(), (String) f);
        }
        return i;
    }
}
