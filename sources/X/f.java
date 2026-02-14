package X;

import V.d;
import d0.h;
import d0.l;

public abstract class f extends b implements d0.f {

    /* renamed from: e  reason: collision with root package name */
    public final int f381e = 2;

    public f(d dVar) {
        super(dVar);
    }

    public final int f() {
        return this.f381e;
    }

    public final String toString() {
        if (this.f376b != null) {
            return super.toString();
        }
        l.f484a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
