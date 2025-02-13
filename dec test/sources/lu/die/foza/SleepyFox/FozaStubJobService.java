package lu.die.foza.SleepyFox;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.die.lu.FozaServiceConnection;
import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.die.foza.SleepyFox.C0281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018�� \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0012"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "mServiceConnection", "Landroid/die/lu/FozaServiceConnection;", "onStartJob", C0019.f56, "params", "Landroid/app/job/JobParameters;", "onStopJob", "onStartCommand", C0019.f56, "intent", "Landroid/content/Intent;", "flags", "startId", "Companion", "foza_release"})
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubJobService.class */
public class FozaStubJobService extends JobService {
    @NotNull

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static final Companion f27 = new Companion();
    @NotNull

    /* renamed from: ԩ  reason: contains not printable characters */
    public static final C0343<Object> f28 = new C0343<>("extras");
    @NotNull

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final FozaServiceConnection f29 = new FozaServiceConnection(null);

    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubJobService$Companion.class */
    public static final class Companion {

        @Metadata(mv = {2, 0, 0}, k = 1, xi = 50, d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llu/die/foza/SleepyFox/FozaStubJobService$Companion$FozaStubJobServiceDang;", "Llu/die/foza/SleepyFox/FozaStubJobService;", "<init>", "()V", "foza_release"})
        /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/FozaStubJobService$Companion$FozaStubJobServiceDang.class */
        public static class FozaStubJobServiceDang extends FozaStubJobService {
        }

        public Companion() {
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Intent m57(int i) {
            Intent intent = new Intent();
            C0276.f576.getClass();
            return intent.setComponent(new ComponentName(C0276.f583, FozaStubJobServiceDang.class.getName() + i));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: Ϳ  reason: contains not printable characters */
        public final Intent m58(@NotNull Intent intent) {
            try {
                Intent intent2 = new Intent();
                C0276 c0276 = C0276.f576;
                c0276.getClass();
                String str = C0276.f583;
                StringBuilder append = new StringBuilder().append(FozaStubJobServiceDang.class.getName());
                c0276.getClass();
                intent2.setComponent(new ComponentName(str, append.append(C0276.f577).toString()));
                intent2.putExtra(C0281.C0282.f611, intent);
                return intent2;
            } catch (Exception unused) {
                return intent;
            }
        }
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final void m55(ComponentName componentName, JobParameters jobParameters) {
        try {
            Service m1273 = C0226.f423.m1273(componentName);
            if (!(m1273 instanceof JobService)) {
                return;
            }
            ((JobService) m1273).onStartJob(jobParameters);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@Nullable JobParameters jobParameters) {
        if (jobParameters != null) {
            try {
                PersistableBundle extras = jobParameters.getExtras();
                if (extras == null) {
                    return true;
                }
                PersistableBundle persistableBundle = extras.getPersistableBundle(C0281.C0282.f601);
                if (persistableBundle == null) {
                    return true;
                }
                f28.m2104(jobParameters, persistableBundle);
                ComponentName unflattenFromString = ComponentName.unflattenFromString(extras.getString(C0281.C0282.f602, C0019.f56));
                if (unflattenFromString == null) {
                    return true;
                }
                Intent intent = new Intent();
                intent.setComponent(unflattenFromString);
                C0226 c0226 = C0226.f423;
                Service m1273 = c0226.m1273(unflattenFromString);
                Service service = m1273;
                if (m1273 == null) {
                    C0226.m1263(c0226, intent, this.f29, (ServiceInfo) null, 4, (Object) null);
                    service = c0226.m1273(unflattenFromString);
                }
                if (!(service instanceof JobService)) {
                    BinderC0293.f705.getClass();
                    BinderC0293.f708.post(() -> {
                        m55(r1, r2);
                    });
                    return true;
                }
                Service service2 = service;
                ((JobService) service2).onBind(intent);
                return ((JobService) service2).onStartJob(jobParameters);
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@Nullable JobParameters jobParameters) {
        if (jobParameters != null) {
            try {
                PersistableBundle extras = jobParameters.getExtras();
                if (extras == null) {
                    return false;
                }
                PersistableBundle persistableBundle = extras.getPersistableBundle(C0281.C0282.f601);
                if (persistableBundle == null) {
                    return false;
                }
                f28.m2104(jobParameters, persistableBundle);
                ComponentName unflattenFromString = ComponentName.unflattenFromString(extras.getString(C0281.C0282.f602, C0019.f56));
                if (unflattenFromString == null) {
                    return true;
                }
                Service m1273 = C0226.f423.m1273(unflattenFromString);
                if (m1273 == null || !(m1273 instanceof JobService)) {
                    return false;
                }
                ((JobService) m1273).onBind(new Intent());
                return ((JobService) m1273).onStopJob(jobParameters);
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        Intent intent2;
        if (intent != null) {
            try {
                intent2 = (Intent) intent.getParcelableExtra(C0281.C0282.f611);
            } catch (Exception unused) {
                return 2;
            }
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            C0226.m1262(C0226.f423, intent2, false, (ServiceInfo) null, 6, (Object) null);
            return 2;
        }
        return 2;
    }
}
