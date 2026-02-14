package s;

import D.C0009j;
import a.a;
import c0.l;
import d0.h;

public final class g extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Object f1174e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1175f;

    /* renamed from: g  reason: collision with root package name */
    public final C0092a f1176g;

    public g(Object obj, int i2, C0092a aVar) {
        h.e(obj, "value");
        C0009j.f("verificationMode", i2);
        this.f1174e = obj;
        this.f1175f = i2;
        this.f1176g = aVar;
    }

    public final Object f() {
        return this.f1174e;
    }

    public final a w(String str, l lVar) {
        Object obj = this.f1174e;
        if (((Boolean) lVar.g(obj)).booleanValue()) {
            return this;
        }
        return new f(obj, str, this.f1176g, this.f1175f);
    }
}
