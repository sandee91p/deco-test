package lu.die.foza.SleepyFox;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.os.PersistableBundle;
import kotlin.jvm.internal.SourceDebugExtension;
import lu.die.foza.SleepyFox.C0281;
import lu.die.foza.SleepyFox.FozaStubJobService;
import org.jetbrains.annotations.NotNull;
/* renamed from: lu.die.foza.SleepyFox.ၜ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၜ.class */
public final class C0435 extends AbstractC0066 {
    @NotNull

    /* renamed from: Ԫ  reason: contains not printable characters */
    public final C0343<Object> f1050 = new C0343<>("extras");
    @NotNull

    /* renamed from: ԫ  reason: contains not printable characters */
    public final C0343<Object> f1051 = new C0343<>(C0281.C0283.f621);

    @SourceDebugExtension({"SMAP\nJobSchedulerImplObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSchedulerImplObserver.kt\nlu/die/foza/HookEntity/ServiceHookDefs/JobSchedulerImplObserver$observeOn$jobProcessor$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    /* renamed from: lu.die.foza.SleepyFox.ၜ$Ϳ  reason: contains not printable characters */
    /* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၜ$Ϳ.class */
    public static final class C0436 extends C0301 {
        public C0436() {
        }

        @Override // lu.die.foza.SleepyFox.C0301, lu.die.foza.SleepyFox.C0277, lu.die.foza.SleepyFox.C0202, lu.die.foza.SleepyFox.AbstractC0412
        /* renamed from: Ϳ */
        public Object mo85(C0253 c0253) {
            try {
                JobInfo jobInfo = (JobInfo) C0153.f201.m726(c0253.f519, JobInfo.class);
                if (jobInfo != null) {
                    C0435.this.m2361(jobInfo);
                }
            } catch (Exception unused) {
            }
            return super.mo85(c0253);
        }
    }

    @Override // lu.die.foza.SleepyFox.AbstractC0066
    /* renamed from: Ԫ */
    public void mo86() {
        try {
            C0301.f718.getClass();
            this.f168 = C0301.f719;
            C0033 m643 = m643("jobscheduler");
            if (m643 == null) {
                return;
            }
            C0436 c0436 = new C0436();
            String[] strArr = new String[3];
            strArr[0] = "schedule";
            strArr[1] = "enqueue";
            strArr[2] = "scheduleAsPackage";
            m643.m377(c0436, strArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ԫ  reason: contains not printable characters */
    public final String m2360() {
        C0276.f576.getClass();
        return C0276.f583;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public final void m2361(JobInfo jobInfo) {
        ComponentName service = jobInfo.getService();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putPersistableBundle(C0281.C0282.f601, jobInfo.getExtras());
        persistableBundle.putString(C0281.C0282.f602, service.flattenToString());
        this.f1050.m2104(jobInfo, persistableBundle);
        String m2360 = m2360();
        StringBuilder append = new StringBuilder().append(FozaStubJobService.Companion.FozaStubJobServiceDang.class.getName());
        C0276.f576.getClass();
        this.f1051.m2104(jobInfo, new ComponentName(m2360, append.append(C0276.f577).toString()));
    }
}
