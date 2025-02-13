package lu.die.foza.SleepyFox;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.die.lu.FozaAccountAuthenticatorResponse;
import android.die.lu.FozaServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AtomicFile;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lu.die.foza.SleepyFox.AbstractC0392;
import lu.die.foza.SleepyFox.C0255;
/* renamed from: lu.die.foza.SleepyFox.ࠨ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ.class */
public class BinderC0231 extends AbstractC0392.AbstractBinderC0394 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: ޠ  reason: contains not printable characters */
    public static final BinderC0231 f444 = new BinderC0231();

    /* renamed from: ޡ  reason: contains not printable characters */
    public static final Account[] f445 = new Account[0];

    /* renamed from: ޢ  reason: contains not printable characters */
    public static final int f446 = 3;

    /* renamed from: ޚ  reason: contains not printable characters */
    public final Map<Integer, C0261> f447 = new HashMap();

    /* renamed from: ޛ  reason: contains not printable characters */
    public final C0240 f448 = new C0240(null);

    /* renamed from: ޜ  reason: contains not printable characters */
    public final LinkedList<C0012> f449 = new LinkedList<>();

    /* renamed from: ޝ  reason: contains not printable characters */
    public final LinkedHashMap<String, AbstractServiceConnectionC0244> f450 = new LinkedHashMap<>();

    /* renamed from: ޞ  reason: contains not printable characters */
    public final Handler f451 = new Handler(Looper.getMainLooper());

    /* renamed from: ޟ  reason: contains not printable characters */
    public final Context f452 = C0276.m1701();

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$Ϳ.class */
    public class C0232 extends IAccountManagerResponse.Stub {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f453;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public final /* synthetic */ int f454;

        public C0232(IBinder iBinder, int i) {
            this.f453 = iBinder;
            this.f454 = i;
        }

        public void onResult(Bundle bundle) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("accounts");
            Account[] accountArr = new Account[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                accountArr[i] = (Account) parcelableArray[i];
            }
            BinderC0231.this.m1338(IAccountManagerResponse.Stub.asInterface(this.f453), accountArr, this.f454);
        }

        public void onError(int i, String str) {
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$Ԩ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$Ԩ.class */
    public class C0233 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ Account f456;

        /* renamed from: ވ  reason: contains not printable characters */
        public final /* synthetic */ IBinder f457;

        /* renamed from: މ  reason: contains not printable characters */
        public final /* synthetic */ C0261 f458;

        /* renamed from: ފ  reason: contains not printable characters */
        public final /* synthetic */ int f459;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0233(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, Account account, IBinder iBinder, C0261 c02612, int i) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, str, z, z2, str2, z3);
            this.f456 = account;
            this.f457 = iBinder;
            this.f458 = c02612;
            this.f459 = i;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ  reason: contains not printable characters */
        public String mo1404(long j) {
            return super.mo1404(j) + ", getAccountCredentialsForClone, " + this.f456.type;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ  reason: contains not printable characters */
        public void mo1405() throws RemoteException {
            this.f508.getAccountCredentialsForCloning(this, this.f456);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.getBoolean("booleanResult", false)) {
                BinderC0231.this.m1331(IAccountManagerResponse.Stub.asInterface(this.f457), bundle, this.f456, this.f458, this.f459);
            }
            super.onResult(bundle);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$Ԫ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$Ԫ.class */
    public class C0234 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ Bundle f461;

        /* renamed from: ވ  reason: contains not printable characters */
        public final /* synthetic */ Account f462;

        /* renamed from: މ  reason: contains not printable characters */
        public final /* synthetic */ String f463;

        /* renamed from: ފ  reason: contains not printable characters */
        public final /* synthetic */ boolean f464;

        /* renamed from: ދ  reason: contains not printable characters */
        public final /* synthetic */ boolean f465;

        /* renamed from: ތ  reason: contains not printable characters */
        public final /* synthetic */ String f466;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0234(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, Bundle bundle, Account account, String str3, boolean z4, boolean z5, String str4) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, str, z, z2, str2, z3);
            this.f461 = bundle;
            this.f462 = account;
            this.f463 = str3;
            this.f464 = z4;
            this.f465 = z5;
            this.f466 = str4;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            this.f461.keySet();
            return super.mo1404(j) + ", getAuthToken, " + this.f462 + ", authTokenType " + this.f463 + ", loginOptions " + this.f461 + ", notifyOnAuthFailure " + this.f464;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f508.getAuthToken(this, this.f462, this.f463, this.f461);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            String string;
            if (bundle != null && (string = bundle.getString("authtoken")) != null) {
                String string2 = bundle.getString("authAccount");
                String string3 = bundle.getString("accountType");
                if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string2)) {
                    onError(5, "the type and name should not be empty");
                    return;
                }
                Account account = new Account(string2, string3);
                if (!this.f465) {
                    BinderC0231.this.m1389(this.f510, account, this.f463, string);
                }
                long j = bundle.getLong("android.accounts.expiry", 0L);
                if (this.f465 && j > System.currentTimeMillis()) {
                    BinderC0231.this.m1388(this.f510, this.f462, this.f466, this.f463, string, j);
                }
            }
            super.onResult(bundle);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$Ԭ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$Ԭ.class */
    public class C0235 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ String f468;

        /* renamed from: ވ  reason: contains not printable characters */
        public final /* synthetic */ String[] f469;

        /* renamed from: މ  reason: contains not printable characters */
        public final /* synthetic */ Bundle f470;

        /* renamed from: ފ  reason: contains not printable characters */
        public final /* synthetic */ String f471;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0235(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3, String[] strArr, Bundle bundle, String str4) {
            super(c0261, iAccountManagerResponse, str, z, z2, str2, z3, z4);
            this.f468 = str3;
            this.f469 = strArr;
            this.f470 = bundle;
            this.f471 = str4;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f508.addAccount(this, this.f499, this.f468, this.f469, this.f470);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            return super.mo1404(j) + ", addAccount, accountType " + this.f471 + ", requiredFeatures " + Arrays.toString(this.f469);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$Ԯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$Ԯ.class */
    public class C0236 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ Account f473;

        /* renamed from: ވ  reason: contains not printable characters */
        public final /* synthetic */ String f474;

        /* renamed from: މ  reason: contains not printable characters */
        public final /* synthetic */ Bundle f475;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0236(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, Account account, String str3, Bundle bundle) {
            super(c0261, iAccountManagerResponse, str, z, z2, str2, z3, z4);
            this.f473 = account;
            this.f474 = str3;
            this.f475 = bundle;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f508.updateCredentials(this, this.f473, this.f474, this.f475);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            Bundle bundle = this.f475;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.mo1404(j) + ", updateCredentials, " + this.f473 + ", authTokenType " + this.f474 + ", loginOptions " + this.f475;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ՠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ՠ.class */
    public class C0237 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ String f477;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0237(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, String str3) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, str, z, z2, str2, z3);
            this.f477 = str3;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f508.editProperties(this, this.f499);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            return super.mo1404(j) + ", editProperties, accountType " + this.f477;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ֈ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ֈ.class */
    public class C0238 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ String f479;

        /* renamed from: ވ  reason: contains not printable characters */
        public final /* synthetic */ String f480;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0238(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, String str3, String str4) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, str, z, z2, str2, z3);
            this.f479 = str3;
            this.f480 = str4;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            return super.mo1404(j) + ", getAuthTokenLabel, " + this.f479 + ", authTokenType " + this.f480;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f508.getAuthTokenLabel(this, this.f480);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("authTokenLabelKey");
                Bundle bundle2 = new Bundle();
                bundle2.putString("authTokenLabelKey", string);
                super.onResult(bundle2);
            }
            super.onResult(null);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$֏  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$֏.class */
    public class C0239 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final /* synthetic */ Account f482;

        /* renamed from: ވ  reason: contains not printable characters */
        public final /* synthetic */ int f483;

        /* renamed from: މ  reason: contains not printable characters */
        public final /* synthetic */ Bundle f484;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0239(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, Account account, int i, Bundle bundle) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, str, z, z2, str2, z3);
            this.f482 = account;
            this.f483 = i;
            this.f484 = bundle;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            return super.mo1404(j) + ", getAccountCredentialsForClone, " + this.f482.type;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            BinderC0231 binderC0231 = BinderC0231.this;
            for (Account account : binderC0231.m1392(this.f483, binderC0231.f452.getPackageName())) {
                if (account.equals(this.f482)) {
                    this.f508.addAccountFromCredentials(this, this.f482, this.f484);
                    return;
                }
            }
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            super.onResult(bundle);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onError(int i, String str) {
            super.onError(i, str);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ׯ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ׯ.class */
    public static final class C0240 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Map<String, C0241> f486;

        public C0240() {
            this.f486 = new C0154();
        }

        public /* synthetic */ C0240(C0232 c0232) {
            this();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ؠ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ؠ.class */
    public static final class C0241 {

        /* renamed from: Ϳ  reason: contains not printable characters */
        public final AuthenticatorDescription f487;

        /* renamed from: Ԩ  reason: contains not printable characters */
        public final ServiceInfo f488;

        public C0241(AuthenticatorDescription authenticatorDescription, ServiceInfo serviceInfo) {
            this.f487 = authenticatorDescription;
            this.f488 = serviceInfo;
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ހ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ހ.class */
    public class C0242 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final String[] f489;

        /* renamed from: ވ  reason: contains not printable characters */
        public volatile Account[] f490 = null;

        /* renamed from: މ  reason: contains not printable characters */
        public volatile ArrayList<Account> f491 = null;

        /* renamed from: ފ  reason: contains not printable characters */
        public volatile int f492 = 0;

        /* renamed from: ދ  reason: contains not printable characters */
        public final boolean f493;

        public C0242(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i, boolean z) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, str, false, true, null, false);
            this.f489 = strArr;
            this.f493 = z;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f490 = BinderC0231.this.m1399(this.f510, this.f499, this.f493);
            this.f491 = new ArrayList<>(this.f490.length);
            this.f492 = 0;
            m1406();
        }

        /* renamed from: ރ  reason: contains not printable characters */
        public void m1406() {
            if (this.f492 >= this.f490.length) {
                m1407();
                return;
            }
            IAccountAuthenticator iAccountAuthenticator = this.f508;
            if (iAccountAuthenticator == null) {
                return;
            }
            try {
                iAccountAuthenticator.hasFeatures(this, this.f490[this.f492], this.f489);
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            this.f505++;
            if (bundle == null) {
                onError(5, "null bundle");
                return;
            }
            if (bundle.getBoolean("booleanResult", false)) {
                this.f491.add(this.f490[this.f492]);
            }
            this.f492++;
            m1406();
        }

        /* renamed from: ބ  reason: contains not printable characters */
        public void m1407() {
            IAccountManagerResponse m1408 = m1408();
            if (m1408 != null) {
                try {
                    int size = this.f491.size();
                    Account[] accountArr = new Account[size];
                    for (int i = 0; i < size; i++) {
                        accountArr[i] = this.f491.get(i);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("accounts", accountArr);
                    m1408.onResult(bundle);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            StringBuilder append = new StringBuilder().append(super.mo1404(j)).append(", getAccountsByTypeAndFeatures, ");
            String[] strArr = this.f489;
            return append.append(strArr != null ? TextUtils.join(",", strArr) : null).toString();
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ށ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ށ.class */
    public class C0243 extends AbstractServiceConnectionC0244 {

        /* renamed from: އ  reason: contains not printable characters */
        public final Account f495;

        public C0243(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
            super(BinderC0231.this, c0261, iAccountManagerResponse, account.type, z, true, account.name, false);
            this.f495 = account;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: Ԩ */
        public String mo1404(long j) {
            return super.mo1404(j) + ", removeAccount, account " + this.f495;
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244
        /* renamed from: ހ */
        public void mo1405() throws RemoteException {
            this.f508.getAccountRemovalAllowed(this, this.f495);
        }

        @Override // lu.die.foza.SleepyFox.BinderC0231.AbstractServiceConnectionC0244, android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
                if (bundle.getBoolean("booleanResult")) {
                    BinderC0231.this.m1342(this.f510, this.f495);
                }
                IAccountManagerResponse m1408 = m1408();
                if (m1408 != null) {
                    try {
                        m1408 = m1408;
                        m1408.onResult(bundle);
                    } catch (RemoteException unused) {
                        m1408.toString();
                    }
                }
            }
            super.onResult(bundle);
        }
    }

    /* renamed from: lu.die.foza.SleepyFox.ࠨ$ނ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ࠨ$ނ.class */
    public abstract class AbstractServiceConnectionC0244 extends FozaAccountAuthenticatorResponse implements IBinder.DeathRecipient, ServiceConnection {

        /* renamed from: ԭ  reason: contains not printable characters */
        public final FozaServiceConnection f497;

        /* renamed from: Ԯ  reason: contains not printable characters */
        public IAccountManagerResponse f498;

        /* renamed from: ԯ  reason: contains not printable characters */
        public final String f499;

        /* renamed from: ՠ  reason: contains not printable characters */
        public final boolean f500;

        /* renamed from: ֈ  reason: contains not printable characters */
        public final long f501;

        /* renamed from: ֏  reason: contains not printable characters */
        public final String f502;

        /* renamed from: ׯ  reason: contains not printable characters */
        public final boolean f503;

        /* renamed from: ؠ  reason: contains not printable characters */
        public final boolean f504;

        /* renamed from: ހ  reason: contains not printable characters */
        public int f505;

        /* renamed from: ށ  reason: contains not printable characters */
        public int f506;

        /* renamed from: ނ  reason: contains not printable characters */
        public int f507;

        /* renamed from: ރ  reason: contains not printable characters */
        public IAccountAuthenticator f508;

        /* renamed from: ބ  reason: contains not printable characters */
        public final boolean f509;

        /* renamed from: ޅ  reason: contains not printable characters */
        public final C0261 f510;

        public AbstractServiceConnectionC0244(BinderC0231 binderC0231, C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3) {
            this(c0261, iAccountManagerResponse, str, z, z2, str2, z3, false);
        }

        /* renamed from: ؠ  reason: contains not printable characters */
        public IAccountManagerResponse m1408() {
            IAccountManagerResponse iAccountManagerResponse = this.f498;
            if (iAccountManagerResponse == null) {
                return null;
            }
            m1413();
            return iAccountManagerResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [long] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.content.pm.ActivityInfo] */
        /* renamed from: Ϳ  reason: contains not printable characters */
        public boolean m1409(int i, Intent intent) {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
            ?? clearCallingIdentity = Binder.clearCallingIdentity();
            clearCallingIdentity = C0325.f765.m2004(intent);
            boolean z = clearCallingIdentity != 0;
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return z;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f498 = null;
            m1413();
        }

        /* renamed from: ށ  reason: contains not printable characters */
        public String m1410() {
            return mo1404(SystemClock.elapsedRealtime());
        }

        /* renamed from: Ԩ */
        public String mo1404(long j) {
            return "Session: expectLaunch " + this.f500 + ", connected " + (this.f508 != null) + ", stats (" + this.f505 + "/" + this.f506 + "/" + this.f507 + "), lifetime " + ((j - this.f501) / 1000.0d);
        }

        /* renamed from: ֈ  reason: contains not printable characters */
        public void m1411() {
            if (!m1415(this.f499)) {
                onError(1, "bind failure");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f508 = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                mo1405();
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f508 = null;
            IAccountManagerResponse m1408 = m1408();
            if (m1408 != null) {
                try {
                    m1408.onError(1, "disconnected");
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: ހ */
        public abstract void mo1405() throws RemoteException;

        @Override // android.die.lu.FozaAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            this.f505++;
            Intent intent = null;
            if (bundle != null) {
                boolean z = this.f504 && (bundle.getBoolean("booleanResult", false) || (bundle.containsKey("authAccount") && bundle.containsKey("accountType")));
                if (z || this.f503) {
                    boolean z2 = z;
                    boolean m1341 = BinderC0231.this.m1341(this.f502, this.f499, this.f510.f546);
                    if (z2 && m1341) {
                        BinderC0231.this.m1346(this.f510, new Account(this.f502, this.f499));
                    }
                    if (this.f503) {
                        long j = -1;
                        if (m1341) {
                            j = this.f510.m1632(new Account(this.f502, this.f499));
                        }
                        bundle.putLong("lastAuthenticatedTime", j);
                    }
                }
            }
            if (bundle != null) {
                Intent intent2 = (Intent) bundle.getParcelable("intent");
                intent = intent2;
                if (intent2 != null && !m1409(Binder.getCallingUid(), intent)) {
                    onError(5, "invalid intent in bundle returned");
                    return;
                }
            }
            IAccountManagerResponse m1408 = (!this.f500 || bundle == null || !bundle.containsKey("intent")) ? m1408() : this.f498;
            if (m1408 != null) {
                try {
                    if (bundle == null) {
                        m1408.onError(5, "null bundle returned");
                        return;
                    }
                    if (this.f509) {
                        bundle.remove("authtoken");
                    }
                    if (bundle.getInt("errorCode", -1) <= 0 || intent != null) {
                        m1408.onResult(bundle);
                    } else {
                        m1408.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.die.lu.FozaAccountAuthenticatorResponse
        public void onRequestContinued() {
            this.f506++;
        }

        @Override // android.die.lu.FozaAccountAuthenticatorResponse
        public void onError(int i, String str) {
            this.f507++;
            IAccountManagerResponse m1408 = m1408();
            if (m1408 != null) {
                try {
                    m1408.onError(i, str);
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: ׯ  reason: contains not printable characters */
        public final void m1413() {
            synchronized (BinderC0231.this.f450) {
                if (BinderC0231.this.f450.remove(toString()) == null) {
                    return;
                }
                IAccountManagerResponse iAccountManagerResponse = this.f498;
                if (iAccountManagerResponse != null) {
                    iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                    this.f498 = null;
                }
                m1412();
                m1414();
            }
        }

        /* renamed from: ނ  reason: contains not printable characters */
        public final void m1414() {
            if (this.f508 != null) {
                this.f508 = null;
                C0265.f550.m1678((IBinder) this.f497);
            }
        }

        /* renamed from: ֏  reason: contains not printable characters */
        public final boolean m1415(String str) {
            C0241 c0241 = BinderC0231.this.f448.f486.get(str);
            if (c0241 == null) {
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = c0241.f488;
            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            intent.setComponent(componentName);
            if (C0265.f550.m1670(intent, c0241.f488, (IBinder) this.f497, "0") != -1) {
                return true;
            }
            componentName.toString();
            return false;
        }

        public AbstractServiceConnectionC0244(C0261 c0261, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
            this.f505 = 0;
            this.f506 = 0;
            this.f507 = 0;
            this.f508 = null;
            if (str != null) {
                this.f510 = c0261;
                this.f509 = z2;
                this.f498 = iAccountManagerResponse;
                this.f499 = str;
                this.f500 = z;
                this.f501 = SystemClock.elapsedRealtime();
                this.f502 = str2;
                this.f503 = z3;
                this.f504 = z4;
                synchronized (BinderC0231.this.f450) {
                    BinderC0231.this.f450.put(toString(), this);
                }
                this.f497 = new FozaServiceConnection(this);
                if (iAccountManagerResponse == null) {
                    return;
                }
                try {
                    iAccountManagerResponse.asBinder().linkToDeath(this, 0);
                    return;
                } catch (RemoteException unused) {
                    this.f498 = null;
                    binderDied();
                    return;
                }
            }
            throw new IllegalArgumentException("accountType is null");
        }

        /* renamed from: ֏  reason: contains not printable characters */
        public void m1412() {
            BinderC0231.this.f451.removeMessages(3, this);
        }
    }

    public BinderC0231() {
        C0276 c0276 = C0276.f576;
    }

    /* renamed from: ֈ  reason: contains not printable characters */
    public final File m1325() {
        return new File(this.f452.getDir("loginData", 0), "login.bin");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008d -> B:21:0x0081). Please submit an issue!!! */
    /* renamed from: ؠ  reason: contains not printable characters */
    public final void m1330() {
        FileOutputStream fileOutputStream;
        synchronized (this.f447) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(m1325());
            FileOutputStream fileOutputStream2 = null;
            obtain.writeInt(this.f447.size());
            for (Map.Entry<Integer, C0261> entry : this.f447.entrySet()) {
                obtain.writeInt(entry.getKey().intValue());
                entry.getValue().writeToParcel(obtain, 0);
            }
            try {
                fileOutputStream = atomicFile.startWrite();
                fileOutputStream2 = fileOutputStream;
                fileOutputStream2.write(obtain.marshall());
                atomicFile.finishWrite(fileOutputStream2);
            } catch (IOException e) {
                fileOutputStream = fileOutputStream2;
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream2);
            }
            m1326(fileOutputStream);
            obtain.recycle();
        }
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public void m1358(String str) {
        m1402(str);
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public void m1359() {
        Parcel obtain = Parcel.obtain();
        FileInputStream fileInputStream = null;
        try {
            if (!m1325().exists()) {
                obtain.recycle();
                m1326((Closeable) null);
                return;
            }
            FileInputStream fileInputStream2 = new FileInputStream(m1325());
            try {
                byte[] m1328 = m1328((InputStream) fileInputStream2);
                obtain.unmarshall(m1328, 0, m1328.length);
                obtain.setDataPosition(0);
                int readInt = obtain.readInt();
                this.f447.clear();
                for (int i = 0; i < readInt; i++) {
                    int readInt2 = obtain.readInt();
                    Map<Integer, C0261> map = this.f447;
                    Integer valueOf = Integer.valueOf(readInt2);
                    try {
                        C0261.CREATOR.getClass();
                        map.put(valueOf, new C0261(obtain));
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        obtain.recycle();
                        m1326((Closeable) fileInputStream);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        Throwable th2 = th;
                        obtain.recycle();
                        m1326((Closeable) fileInputStream);
                        throw th2;
                    }
                }
                obtain.recycle();
                m1326((Closeable) fileInputStream2);
            } catch (Exception unused2) {
                fileInputStream = fileInputStream2;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
            }
        } catch (Exception unused3) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԭ  reason: contains not printable characters */
    public AuthenticatorDescription[] mo1362(int i) {
        ?? m1401 = m1401(i);
        ArrayList arrayList = new ArrayList();
        synchronized (m1401.f545) {
            for (C0352 c0352 : m1401.f547) {
                C0241 c0241 = this.f448.f486.get(c0352.f831.type);
                if (c0241 != null) {
                    arrayList.add(c0241.f487);
                }
            }
            m1401 = arrayList;
        }
        return (AuthenticatorDescription[]) m1401.toArray(new AuthenticatorDescription[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lu.die.foza.SleepyFox.ࠨ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* renamed from: Ԯ  reason: contains not printable characters */
    public C0261 m1401(int i) {
        C0261 c0261 = this;
        synchronized (c0261.f447) {
            if (c0261.f447.get(Integer.valueOf(i)) == null) {
                this.f447.put(Integer.valueOf(i), new C0261());
            }
            c0261 = this.f447.get(Integer.valueOf(i));
        }
        return c0261;
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final boolean m1341(String str, String str2, int i) {
        C0261 m1401 = m1401(i);
        return (m1401 == null || m1401.m1625(new Account(str, str2)) == null) ? false : true;
    }

    /* renamed from: ׯ  reason: contains not printable characters */
    public void m1357() {
        m1402(null);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԫ  reason: contains not printable characters */
    public boolean mo1385(Account account, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        C0261 m1401 = m1401(i);
        if (m1401 == null) {
            return false;
        }
        return m1346(m1401, account);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԭ  reason: contains not printable characters */
    public HashMap<?, ?> mo1403(Account account, int i) {
        return new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map<android.accounts.Account, java.lang.Integer>] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: ԩ  reason: contains not printable characters */
    public Map<Account, Integer> mo1396(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        ?? m1401 = m1401(i);
        synchronized (m1401.f545) {
            for (C0352 c0352 : m1401.f547) {
                Account account = c0352.f831;
                if (account != null && (str2 == null || account.type.equals(str2))) {
                    Integer num = m1401.m1627(c0352.f831).get(str);
                    if (num != null) {
                        hashMap.put(c0352.f831, num);
                    }
                }
            }
            m1401 = hashMap;
        }
        return m1401;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: ԩ  reason: contains not printable characters */
    public String mo1360(Account account, int i) {
        if (account != null) {
            return m1400(m1401(i), account);
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo1381(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԫ  reason: contains not printable characters */
    public int mo1395(Account account, String str, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        C0261 m1401 = m1401(i);
        if ("android:accounts:key_legacy_visible".equals(str)) {
            int m1336 = m1336(account, str, m1401);
            if (m1336 == 0) {
                return 2;
            }
            return m1336;
        } else if (!"android:accounts:key_legacy_not_visible".equals(str)) {
            return m1335(account, str, m1401).intValue();
        } else {
            int m13362 = m1336(account, str, m1401);
            if (m13362 == 0) {
                return 4;
            }
            return m13362;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԫ  reason: contains not printable characters */
    public Account[] mo1365(String str, int i) {
        ?? m1401 = m1401(i);
        ArrayList arrayList = new ArrayList();
        synchronized (m1401.f545) {
            for (C0352 c0352 : m1401.f547) {
                Account account = c0352.f831;
                if (account != null && (str == null || account.type.equals(str))) {
                    arrayList.add(account);
                }
            }
            m1401 = arrayList;
        }
        return (Account[]) m1401.toArray(new Account[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: ԩ  reason: contains not printable characters */
    public String mo1373(Account account, String str, int i) {
        Objects.requireNonNull(account, "Account cannot be null");
        Objects.requireNonNull(str, "AuthTokenType cannot be null");
        C0261 m1401 = m1401(i);
        if (m1401 == null) {
            return null;
        }
        String str2 = m1401;
        synchronized (m1401.f545) {
            str2 = str2.m1629(account).get(str);
        }
        return str2;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo1376(Account account, int i) {
        mo1375(account, (String) null, i);
    }

    /* renamed from: ֏  reason: contains not printable characters */
    public void m1402(String str) {
        Intent intent = new Intent("android.accounts.AccountAuthenticator");
        if (str != null) {
            intent.setPackage(str);
        } else {
            this.f448.f486.clear();
        }
        m1344(C0325.f765.m1983(intent, null, C0255.C0256.f530), this.f448.f486);
    }

    /* renamed from: ԩ  reason: contains not printable characters */
    public final boolean m1346(C0261 c0261, Account account) {
        c0261.m1631(account);
        return true;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo1366(IBinder iBinder, String str, String[] strArr, int i) {
        if (iBinder != null) {
            if (str == null) {
                throw new IllegalArgumentException("accountType is null");
            }
            C0261 m1401 = m1401(i);
            if (!C0166.m923((Object[]) strArr)) {
                new C0242(m1401, new C0232(iBinder, i), str, strArr, i, true).m1411();
                return;
            }
            m1338(IAccountManagerResponse.Stub.asInterface(iBinder), m1399(m1401, str, true), i);
            return;
        }
        throw new IllegalArgumentException("response is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public Account[] mo1364(String str, String str2, int i) {
        ?? m1401 = m1401(i);
        ArrayList arrayList = new ArrayList();
        synchronized (m1401.f545) {
            for (C0352 c0352 : m1401.f547) {
                if (c0352.f831.type.equals(str)) {
                    Integer num = c0352.f834.get(str2);
                    if (num != null && num.intValue() == 1) {
                        arrayList.add(c0352.f831);
                    }
                }
            }
            m1401 = arrayList;
        }
        return (Account[]) m1401.toArray(new Account[0]);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1380(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
        if (iBinder != null) {
            if (str == null) {
                throw new IllegalArgumentException("accountType is null");
            }
            if (bundle == null) {
                bundle = r0;
                Bundle bundle2 = new Bundle();
            }
            new C0235(m1401(i), IAccountManagerResponse.Stub.asInterface(iBinder), str, z, true, null, false, true, str2, strArr, bundle, str).m1411();
            return;
        }
        throw new IllegalArgumentException("response is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final String m1340(C0261 c0261, Account account, String str) {
        if (c0261 == null) {
            return null;
        }
        String str2 = c0261;
        synchronized (c0261.f545) {
            str2 = str2.m1628(account).get(str);
        }
        return str2;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean mo1368(Account account, String str, Bundle bundle, int i) {
        return mo1393(account, str, bundle, (Map) null, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public final boolean m1342(C0261 c0261, Account account) {
        ?? r0 = c0261;
        synchronized (r0.f545) {
            boolean m1626 = r0.m1626(account);
            if (m1626) {
                m1330();
            }
            r0 = m1626;
        }
        return r0;
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean mo1393(Account account, String str, Bundle bundle, Map map, int i) {
        return m1332(m1401(i), account, str, bundle, map);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1332(C0261 c0261, Account account, String str, Bundle bundle, Map<String, Integer> map) {
        if (c0261 == null) {
            c0261 = r0;
            C0261 c02612 = new C0261();
        }
        C0261 c02613 = c0261;
        synchronized (c0261.f545) {
            if (c02613.m1625(account) != null) {
                Objects.toString(account);
                return false;
            }
            C0352 m1624 = c0261.m1624(account);
            m1624.f832 = str;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    m1624.f833.put(str2, bundle.getString(str2));
                }
            }
            if (map != null) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    m1333(account, entry.getKey(), entry.getValue().intValue(), c0261);
                }
            }
            m1330();
            return true;
        }
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public final Integer m1335(Account account, String str, C0261 c0261) {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.lang.Object] */
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void m1389(C0261 c0261, Account account, String str, String str2) {
        if (c0261 == null) {
            return;
        }
        synchronized (c0261.f545) {
            c0261.m1629(account).put(str, str2);
            m1330();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m1326(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.Object] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo1374(Account account, String str, String str2, int i) {
        Objects.requireNonNull(account, "Account cannot be null");
        Objects.requireNonNull(str, "AuthTokenType cannot be null");
        C0261 m1401 = m1401(i);
        if (m1401 == null) {
            return;
        }
        synchronized (m1401.f545) {
            m1401.m1629(account).put(str, str2);
            m1330();
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1331(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, Account account, C0261 c0261, int i) {
        new C0239(c0261, iAccountManagerResponse, account.type, false, false, account.name, false, account, i, bundle).m1411();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, lu.die.foza.SleepyFox.ࠨ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo1375(Account account, String str, int i) {
        Objects.requireNonNull(account, "Account cannot be null");
        C0261 m1401 = m1401(i);
        if (m1401 == null) {
            return;
        }
        ?? r0 = this;
        synchronized (m1401.f545) {
            C0352 m1625 = m1401.m1625(account);
            m1625.f832 = str;
            m1625.f835.clear();
            m1330();
        }
        LinkedList<C0012> linkedList = r0.f449;
        synchronized (linkedList) {
            Iterator<C0012> it = r0.f449.iterator();
            while (it.hasNext()) {
                C0012 next = it.next();
                if (next.f47.equals(account) && next.f46 == i) {
                    it.remove();
                }
            }
            r0 = linkedList;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1384(IBinder iBinder, Account account, Bundle bundle, boolean z, int i) {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ԩ  reason: contains not printable characters */
    public void mo1398(String[] strArr, String str, int i) {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1371(IBinder iBinder, Account account, int i, int i2) {
        C0261 m1401 = m1401(i);
        C0261 m14012 = m1401(i2);
        if (m1401 != null && m14012 != null) {
            account.toString();
            new C0233(m1401, IAccountManagerResponse.Stub.asInterface(iBinder), account.type, false, false, account.name, false, account, iBinder, m14012, i).m1411();
        } else if (iBinder == null) {
        } else {
            IBinder iBinder2 = iBinder;
            Bundle bundle = new Bundle();
            bundle.putBoolean("booleanResult", false);
            try {
                iBinder2 = IAccountManagerResponse.Stub.asInterface(iBinder2);
                iBinder2.onResult(bundle);
            } catch (RemoteException unused) {
                iBinder2.toString();
            }
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1383(IBinder iBinder, String str, boolean z, int i) {
        if (iBinder != null) {
            if (str == null) {
                throw new IllegalArgumentException("accountType is null");
            }
            new C0237(m1401(i), IAccountManagerResponse.Stub.asInterface(iBinder), str, z, true, null, false, str).m1411();
            return;
        }
        throw new IllegalArgumentException("response is null");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Account[] m1334(C0261 c0261, Account[] accountArr, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Account account : accountArr) {
            int intValue = m1335(account, (String) null, c0261).intValue();
            if (intValue == 1 || intValue == 2 || (z && intValue == 4)) {
                linkedHashMap.put(account, Integer.valueOf(intValue));
            }
        }
        return (Account[]) linkedHashMap.keySet().toArray(new Account[0]);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1344(List<ResolveInfo> list, Map<String, C0241> map) {
        if (list == null) {
            return;
        }
        for (ResolveInfo resolveInfo : list) {
            try {
                XmlResourceParser loadXmlMetaData = resolveInfo.serviceInfo.loadXmlMetaData(this.f452.getPackageManager(), "android.accounts.AccountAuthenticator");
                if (loadXmlMetaData != null) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(loadXmlMetaData);
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 == 1 || i2 == 2) {
                            break;
                        }
                        i = loadXmlMetaData.next();
                    }
                    if ("account-authenticator".equals(loadXmlMetaData.getName())) {
                        AuthenticatorDescription m1343 = m1343(this.f452.getPackageManager().getResourcesForApplication(resolveInfo.serviceInfo.applicationInfo), resolveInfo.serviceInfo.packageName, asAttributeSet);
                        if (m1343 != null) {
                            map.put(m1343.type, new C0241(m1343, resolveInfo.serviceInfo));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lu.die.foza.SleepyFox.ࠨ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final int m1336(Account account, String str, C0261 c0261) {
        ?? r0 = this;
        synchronized (c0261.f545) {
            Integer num = r0.m1337(account, c0261).get(str);
            r0 = num != null ? num.intValue() : 0;
        }
        return r0;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public Account[] m1392(int i, String str) {
        return (Account[]) m1401(i).f547.toArray(new Account[0]);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1367(IBinder iBinder, String str, String[] strArr, int i) {
        if (iBinder != null) {
            if (str == null) {
                throw new IllegalArgumentException("accountType is null");
            }
            C0261 m1401 = m1401(i);
            if (strArr != null && strArr.length != 0) {
                new C0242(m1401, IAccountManagerResponse.Stub.asInterface(iBinder), str, strArr, i, false).m1411();
                return;
            }
            Account[] m1399 = m1399(m1401, str, false);
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("accounts", m1399);
            m1345(IAccountManagerResponse.Stub.asInterface(iBinder), bundle);
            return;
        }
        throw new IllegalArgumentException("response is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public Account[] mo1363(String str, int i, int i2) {
        ?? m1401 = m1401(i2);
        ArrayList arrayList = new ArrayList();
        synchronized (m1401.f545) {
            for (C0352 c0352 : m1401.f547) {
                Integer num = c0352.f834.get(str);
                if (num != null && num.intValue() == 1) {
                    arrayList.add(c0352.f831);
                }
            }
            m1401 = arrayList;
        }
        return (Account[]) m1401.toArray(new Account[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public Account[] m1399(C0261 c0261, String str, boolean z) {
        Account[] m1630;
        if (str != null) {
            synchronized (c0261.f545) {
                m1630 = c0261.m1630(str);
            }
            return m1334(c0261, (Account[]) Arrays.copyOf(m1630, m1630.length), z);
        }
        int i = 0;
        synchronized (this.f447) {
            for (C0261 c02612 : this.f447.values()) {
                i += c02612.m1623().length;
            }
            if (i == 0) {
                return f445;
            }
            Account[] accountArr = new Account[i];
            int i2 = 0;
            for (C0261 c02613 : this.f447.values()) {
                int i3 = i2;
                Account[] m1623 = c02613.m1623();
                System.arraycopy(m1623, 0, accountArr, i2, m1623.length);
                i2 = i3 + m1623.length;
            }
            return m1334(c0261, accountArr, z);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1379(IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle, int i) {
        String m1390;
        String m1391;
        IAccountManagerResponse asInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
        try {
            if (account == null) {
                asInterface.onError(7, "account is null");
            } else if (str == null) {
                asInterface.onError(7, "authTokenType is null");
            } else {
                C0261 m1401 = m1401(i);
                C0241 c0241 = this.f448.f486.get(account.type);
                boolean z3 = c0241 != null && c0241.f487.customTokens;
                String string = bundle.getString("androidPackageName");
                bundle.putInt("callerUid", Binder.getCallingUid());
                bundle.putInt("callerPid", Binder.getCallingPid());
                if (z) {
                    bundle.putBoolean("notifyOnAuthFailure", true);
                }
                if (!z3 && (m1391 = m1391(m1401, account, str)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("authtoken", m1391);
                    bundle2.putString("authAccount", account.name);
                    bundle2.putString("accountType", account.type);
                    m1345(asInterface, bundle2);
                } else if (!z3 || (m1390 = m1390(m1401, account, str, string)) == null) {
                    new C0234(m1401, asInterface, account.type, z2, false, account.name, false, bundle, account, str, z, z3, string).m1411();
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("authtoken", m1390);
                    bundle3.putString("authAccount", account.name);
                    bundle3.putString("accountType", account.type);
                    m1345(asInterface, bundle3);
                }
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1386(IBinder iBinder, String str, String str2, int i) {
        new C0238(m1401(i), IAccountManagerResponse.Stub.asInterface(iBinder), str, false, false, null, false, str, str2).m1411();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final Map<String, Integer> m1337(Account account, C0261 c0261) {
        return c0261.m1627(account);
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public String mo1361(Account account, String str, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "key cannot be null");
        return m1340(m1401(i), account, str);
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1338(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr, int i) {
        if (m1339(accountArr, i)) {
            return;
        }
        if (accountArr.length != 1) {
            m1345(iAccountManagerResponse, new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        m1345(iAccountManagerResponse, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [lu.die.foza.SleepyFox.ࠨ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1372(String str, String str2, int i) {
        ?? m1401 = m1401(i);
        synchronized (m1401.f545) {
            boolean z = false;
            for (C0352 c0352 : m1401.f547) {
                Account account = c0352.f831;
                if (account != null && (str == null || account.type.equals(str))) {
                    c0352.f833.values().remove(str2);
                    z = true;
                }
            }
            if (z) {
                m1330();
            }
            m1401 = this;
        }
        LinkedList<C0012> linkedList = m1401.f449;
        synchronized (linkedList) {
            Iterator<C0012> it = m1401.f449.iterator();
            while (it.hasNext()) {
                C0012 next = it.next();
                if (next.f47.type.equals(str) && next.f46 == i && next.f50.equals(str2)) {
                    it.remove();
                }
            }
            m1401 = linkedList;
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1339(Account[] accountArr, int i) {
        if (accountArr.length < 1) {
            return false;
        }
        return accountArr.length > 1 || m1335(accountArr[0], (String) null, m1401(i)).intValue() == 4;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m1345(IAccountManagerResponse iAccountManagerResponse, Bundle bundle) {
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.accounts.AuthenticatorDescription] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static AuthenticatorDescription m1343(Resources resources, String str, AttributeSet attributeSet) {
        ?? r0;
        th = resources.obtainAttributes(attributeSet, (int[]) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator"));
        try {
            String string = th.getString(((Integer) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator_accountType")).intValue());
            int resourceId = th.getResourceId(((Integer) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator_label")).intValue(), 0);
            int resourceId2 = th.getResourceId(((Integer) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator_icon")).intValue(), 0);
            int resourceId3 = th.getResourceId(((Integer) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator_smallIcon")).intValue(), 0);
            int resourceId4 = th.getResourceId(((Integer) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator_accountPreferences")).intValue(), 0);
            boolean z = th.getBoolean(((Integer) C0047.m455("com.android.internal.R$styleable", "AccountAuthenticator_customTokens")).intValue(), true);
            if (TextUtils.isEmpty(string)) {
                th.recycle();
                return null;
            }
            r0 = new AuthenticatorDescription(string, str, resourceId, resourceId2, resourceId3, resourceId4, z);
            return r0;
        } finally {
            th.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu.die.foza.SleepyFox.ࢠ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public String m1391(C0261 c0261, Account account, String str) {
        if (c0261 == null) {
            return null;
        }
        String str2 = c0261;
        synchronized (c0261.f545) {
            str2 = str2.m1629(account).get(str);
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public String m1390(C0261 c0261, Account account, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f449) {
            Iterator<C0012> it = this.f449.iterator();
            while (it.hasNext()) {
                C0012 next = it.next();
                if (next.f46 == c0261.f546 && next.f47.equals(account) && next.f49.equals(str) && next.f48.equals(str2)) {
                    if (next.f51 > currentTimeMillis) {
                        return next.f50;
                    }
                    it.remove();
                }
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public String m1400(C0261 c0261, Account account) {
        if (c0261 == 0) {
            return null;
        }
        synchronized (c0261.f545) {
            C0352 m1625 = c0261.m1625(account);
            if (m1625 == null) {
                return null;
            }
            return m1625.f832;
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1397(String[] strArr, String str, int i) throws RemoteException {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1369(IBinder iBinder, Account account, boolean z, int i) {
        new C0243(m1401(i), IAccountManagerResponse.Stub.asInterface(iBinder), account, z).m1411();
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean mo1370(Account account, int i) {
        if (account == null) {
            return false;
        }
        return m1342(m1401(i), account);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, java.util.LinkedList<lu.die.foza.SleepyFox.ʲ>] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void m1388(C0261 c0261, Account account, String str, String str2, String str3, long j) {
        if (account == null || str2 == null || str == null) {
            return;
        }
        C0012 c0012 = new C0012(c0261.f546, account, str, str2, str3, j);
        synchronized (this.f449) {
            this.f449.add(c0012);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public boolean mo1394(Account account, String str, int i, int i2) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        C0261 m1401 = m1401(i2);
        if (m1401 == null) {
            return false;
        }
        return m1333(account, str, i, m1401);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public final boolean m1333(Account account, String str, int i, C0261 c0261) {
        synchronized (c0261.f545) {
            C0352 m1625 = c0261.m1625(account);
            if (m1625 == null) {
                return false;
            }
            m1625.f834.put(str, Integer.valueOf(i));
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, java.lang.Object] */
    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1377(Account account, String str, String str2, int i) {
        if (str != null) {
            if (account == null) {
                throw new IllegalArgumentException("account is null");
            }
            C0261 m1401 = m1401(i);
            if (m1401 == null) {
                return;
            }
            synchronized (m1401.f545) {
                m1401.m1628(account).put(str, str2);
                m1330();
            }
            return;
        }
        throw new IllegalArgumentException("key is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte[]] */
    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m1327(File file) throws IOException {
        ?? r0;
        th = new FileInputStream(file);
        try {
            r0 = m1328((InputStream) th);
            return r0;
        } finally {
            m1326(th);
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static byte[] m1328(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1378(Account account, String str, int i, boolean z) {
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0392
    /* renamed from: Ϳ  reason: contains not printable characters */
    public void mo1382(IBinder iBinder, Account account, String str, boolean z, Bundle bundle, int i) {
        if (iBinder != null) {
            if (account == null) {
                throw new IllegalArgumentException("account is null");
            }
            new C0236(m1401(i), IAccountManagerResponse.Stub.asInterface(iBinder), account.type, z, true, account.name, false, true, account, str, bundle).m1411();
            return;
        }
        throw new IllegalArgumentException("response is null");
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static void m1329(Parcel parcel, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write(parcel.marshall());
    }
}
