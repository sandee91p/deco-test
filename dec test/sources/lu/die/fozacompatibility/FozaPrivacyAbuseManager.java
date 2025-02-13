package lu.die.fozacompatibility;

import java.util.LinkedList;
import java.util.List;
import lu.die.foza.SleepyFox.C0019;
import lu.die.foza.SleepyFox.C0245;
import lu.die.foza.SleepyFox.C0248;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaPrivacyAbuseManager.class */
public class FozaPrivacyAbuseManager {

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static final FozaPrivacyAbuseManager f1108 = new FozaPrivacyAbuseManager();

    /* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaPrivacyAbuseManager$FozaPrivacyData.class */
    public static class FozaPrivacyData {
        public String applicationPackage = C0019.f56;
        public String privacyAbuseType = C0019.f56;
        public String privacyAbuseContent = C0019.f56;
        public long eventOccurredTime = 0;
    }

    public static FozaPrivacyAbuseManager get() {
        return f1108;
    }

    public List<FozaPrivacyData> getPrivacyRecordData() {
        LinkedList linkedList = new LinkedList();
        try {
            C0248.m1472().getClass();
        } catch (Exception unused) {
        }
        C0248.m1472().getClass();
        return linkedList;
    }

    public void setMaxPrivacyEventRecord(int i) {
        C0248.m1472().getClass();
    }

    public void clearPrivacyEvent() {
        C0248.m1472().getClass();
    }

    public void setPrivacyAbuseEnabled(boolean z) {
        C0245.m1421().getClass();
    }
}
