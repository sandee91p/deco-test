package lu.die.foza.SleepyFox;
/* renamed from: lu.die.foza.SleepyFox.ၛ  reason: contains not printable characters */
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SleepyFox/ၛ.class */
public enum EnumC0434 {
    JAVA_0_9(1.5f, "0.9"),
    JAVA_1_1(1.1f, "1.1"),
    JAVA_1_2(1.2f, "1.2"),
    JAVA_1_3(1.3f, "1.3"),
    JAVA_1_4(1.4f, "1.4"),
    JAVA_1_5(1.5f, "1.5"),
    JAVA_1_6(1.6f, "1.6"),
    JAVA_1_7(1.7f, "1.7"),
    JAVA_1_8(1.8f, "1.8");
    

    /* renamed from: Ϳ  reason: contains not printable characters */
    public float f1048;

    /* renamed from: Ԩ  reason: contains not printable characters */
    public String f1049;

    EnumC0434(float f, String str) {
        this.f1048 = f;
        this.f1049 = str;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    public static EnumC0434 m2355(String str) {
        return m2356(str);
    }

    public boolean atLeast(EnumC0434 enumC0434) {
        return this.f1048 >= enumC0434.f1048;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1049;
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    public static EnumC0434 m2356(String str) {
        if ("0.9".equals(str)) {
            return JAVA_0_9;
        }
        if ("1.1".equals(str)) {
            return JAVA_1_1;
        }
        if ("1.2".equals(str)) {
            return JAVA_1_2;
        }
        if ("1.3".equals(str)) {
            return JAVA_1_3;
        }
        if ("1.4".equals(str)) {
            return JAVA_1_4;
        }
        if ("1.5".equals(str)) {
            return JAVA_1_5;
        }
        if ("1.6".equals(str)) {
            return JAVA_1_6;
        }
        if ("1.7".equals(str)) {
            return JAVA_1_7;
        }
        if (!"1.8".equals(str)) {
            return null;
        }
        return JAVA_1_8;
    }
}
