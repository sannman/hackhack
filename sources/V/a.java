package V;

import c0.p;
import d0.h;

public abstract class a implements g {

    /* renamed from: b  reason: collision with root package name */
    public final h f367b;

    public a(h hVar) {
        this.f367b = hVar;
    }

    public final Object d(Object obj, p pVar) {
        return pVar.d(obj, this);
    }

    public i f(h hVar) {
        return a.a.p(this, hVar);
    }

    public g g(h hVar) {
        h.e(hVar, "key");
        if (h.a(getKey(), hVar)) {
            return this;
        }
        return null;
    }

    public final h getKey() {
        return this.f367b;
    }

    public final i h(i iVar) {
        return a.a.r(this, iVar);
    }
}
