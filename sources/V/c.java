package V;

import a.a;
import c0.p;
import d0.h;
import java.io.Serializable;

public final class c implements i, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final i f369b;

    /* renamed from: c  reason: collision with root package name */
    public final g f370c;

    public c(g gVar, i iVar) {
        h.e(iVar, "left");
        this.f369b = iVar;
        this.f370c = gVar;
    }

    public final Object d(Object obj, p pVar) {
        return pVar.d(this.f369b.d(obj, pVar), this.f370c);
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f369b;
                if (iVar instanceof c) {
                    cVar2 = (c) iVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f369b;
                if (iVar2 instanceof c) {
                    cVar3 = (c) iVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 == i2) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f370c;
                    if (h.a(cVar.g(gVar.getKey()), gVar)) {
                        i iVar3 = cVar4.f369b;
                        if (!(iVar3 instanceof c)) {
                            h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            g gVar2 = (g) iVar3;
                            z2 = h.a(cVar.g(gVar2.getKey()), gVar2);
                            break;
                        }
                        cVar4 = (c) iVar3;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final i f(h hVar) {
        h.e(hVar, "key");
        g gVar = this.f370c;
        g g2 = gVar.g(hVar);
        i iVar = this.f369b;
        if (g2 != null) {
            return iVar;
        }
        i f2 = iVar.f(hVar);
        if (f2 == iVar) {
            return this;
        }
        if (f2 == j.f372b) {
            return gVar;
        }
        return new c(gVar, f2);
    }

    public final g g(h hVar) {
        h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g g2 = cVar.f370c.g(hVar);
            if (g2 != null) {
                return g2;
            }
            i iVar = cVar.f369b;
            if (!(iVar instanceof c)) {
                return iVar.g(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final i h(i iVar) {
        return a.s(this, iVar);
    }

    public final int hashCode() {
        return this.f370c.hashCode() + this.f369b.hashCode();
    }

    public final String toString() {
        return "[" + ((String) d("", new b(0))) + ']';
    }
}
