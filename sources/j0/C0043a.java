package j0;

import B.c;
import T.g;
import V.d;
import V.i;
import X.b;
import a.a;
import c0.p;
import d0.n;
import o0.C0087a;

/* renamed from: j0.a  reason: case insensitive filesystem */
public abstract class C0043a extends T implements d, r {

    /* renamed from: d  reason: collision with root package name */
    public final i f842d;

    public C0043a(i iVar, boolean z2) {
        super(z2);
        B((K) iVar.g(C0059q.f870c));
        this.f842d = iVar.h(this);
    }

    public final void A(c cVar) {
        C0061t.c(this.f842d, cVar);
    }

    public final void F(Object obj) {
        boolean z2;
        if (obj instanceof C0053k) {
            C0053k kVar = (C0053k) obj;
            Throwable th = kVar.f861a;
            if (C0053k.f860b.get(kVar) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            K(th, z2);
            return;
        }
        L(obj);
    }

    public final void M(int i2, C0043a aVar, p pVar) {
        i iVar;
        Object k2;
        int a2 = n.d.a(i2);
        g gVar = g.f356a;
        if (a2 == 0) {
            try {
                C0087a.g(a.m(((b) pVar).b(this, aVar)), gVar);
            } catch (Throwable th) {
                c(a.g(th));
                throw th;
            }
        } else if (a2 == 1) {
        } else {
            if (a2 == 2) {
                a.m(((b) pVar).b(this, aVar)).c(gVar);
            } else if (a2 == 3) {
                try {
                    iVar = this.f842d;
                    k2 = C0087a.k(iVar, (Object) null);
                    n.a(2, pVar);
                    Object d2 = pVar.d(aVar, this);
                    C0087a.f(iVar, k2);
                    if (d2 != W.a.f373b) {
                        c(d2);
                    }
                } catch (Throwable th2) {
                    c(a.g(th2));
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    public final void c(Object obj) {
        Throwable a2 = T.d.a(obj);
        if (a2 != null) {
            obj = new C0053k(a2, false);
        }
        Object C2 = C(obj);
        if (C2 != C0061t.f874d) {
            n(C2);
        }
    }

    public final i i() {
        return this.f842d;
    }

    public final i k() {
        return this.f842d;
    }

    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void L(Object obj) {
    }

    public void K(Throwable th, boolean z2) {
    }
}
