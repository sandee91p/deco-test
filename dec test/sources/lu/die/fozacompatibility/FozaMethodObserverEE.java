package lu.die.fozacompatibility;

import java.lang.reflect.Method;
/* loaded from: foza-release.apk:classes.jar:lu/die/fozacompatibility/FozaMethodObserverEE.class */
public abstract class FozaMethodObserverEE {
    public boolean returnEarly = false;
    public Object result = null;
    public Throwable throwable = null;

    public void beforeCallingMethod(Object obj, Method method, Object[] objArr) {
    }

    public Object getResult() {
        return this.result;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public boolean isReturnEarly() {
        return this.returnEarly;
    }

    public void setResult(Object obj) {
        this.result = obj;
        this.returnEarly = true;
    }

    public void afterCallingMethod(Object obj, Method method, Object[] objArr) {
    }
}
