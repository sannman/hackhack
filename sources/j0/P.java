package j0;

import T.g;

public final class P extends O {

    /* renamed from: f  reason: collision with root package name */
    public final T f827f;

    /* renamed from: g  reason: collision with root package name */
    public final Q f828g;

    /* renamed from: h  reason: collision with root package name */
    public final C0051i f829h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f830i;

    public P(T t2, Q q2, C0051i iVar, Object obj) {
        this.f827f = t2;
        this.f828g = q2;
        this.f829h = iVar;
        this.f830i = obj;
    }

    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return g.f356a;
    }

    public final void o(Throwable th) {
        C0051i iVar = this.f829h;
        T t2 = this.f827f;
        t2.getClass();
        C0051i D2 = T.D(iVar);
        Q q2 = this.f828g;
        Object obj = this.f830i;
        if (D2 != null) {
            while (C0061t.d(D2.f855f, new P(t2, q2, D2, obj), 1) == V.f841b) {
                D2 = T.D(D2);
                if (D2 == null) {
                }
            }
            return;
        }
        t2.m(t2.u(q2, obj));
    }
}
