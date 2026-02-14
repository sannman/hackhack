package d0;

import java.io.Serializable;

public abstract class i implements f, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final int f481b;

    public i(int i2) {
        this.f481b = i2;
    }

    public final int f() {
        return this.f481b;
    }

    public final String toString() {
        l.f484a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
