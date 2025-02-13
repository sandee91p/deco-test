package lu.die.foza.SuperAPI;
/* loaded from: foza-release.apk:classes.jar:lu/die/foza/SuperAPI/FozaAppInstallerJ.class */
public class FozaAppInstallerJ {
    public static int cloneApp(String str) {
        return FozaInnerAppInstaller.getInstance().installLocalPackage(str, false);
    }

    public static int installAppByPath(String str) {
        return FozaInnerAppInstaller.getInstance().installSync(str);
    }

    public static String convertResultToString(int i) {
        return FozaInnerAppInstaller.getInstance().convertResult(Integer.valueOf(i));
    }
}
