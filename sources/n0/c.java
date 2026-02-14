package n0;

import T.g;
import W.a;
import X.f;
import c0.p;
import j0.C0061t;
import j0.r;
import l0.n;
import l0.q;
import m0.b;
import m0.d;
import m0.h;

public final class c extends f implements p {

    /* renamed from: f  reason: collision with root package name */
    public int f1036f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f1037g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f1038h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f1039i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, b bVar, V.d dVar2) {
        super(dVar2);
        this.f1038h = dVar;
        this.f1039i = bVar;
    }

    public final V.d b(V.d dVar, Object obj) {
        c cVar = new c(this.f1038h, this.f1039i, dVar);
        cVar.f1037g = obj;
        return cVar;
    }

    public final Object d(Object obj, Object obj2) {
        return ((c) b((V.d) obj2, (r) obj)).h(g.f356a);
    }

    public final Object h(Object obj) {
        l0.c cVar;
        a aVar = a.f373b;
        int i2 = this.f1036f;
        g gVar = g.f356a;
        if (i2 == 0) {
            a.a.z(obj);
            r rVar = (r) this.f1037g;
            b bVar = this.f1039i;
            int i3 = bVar.f964c;
            if (i3 == -3) {
                i3 = -2;
            }
            d dVar = new d(bVar, (V.d) null);
            int i4 = bVar.f965d;
            if (i3 != -2) {
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == Integer.MAX_VALUE) {
                            cVar = new l0.c(Integer.MAX_VALUE);
                        } else if (i4 == 1) {
                            cVar = new l0.c(i3);
                        } else {
                            cVar = new n(i3, i4);
                        }
                    } else if (i4 == 1) {
                        cVar = new l0.c(0);
                    } else {
                        cVar = new n(1, i4);
                    }
                } else if (i4 == 1) {
                    cVar = new n(1, 2);
                } else {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                }
            } else if (i4 == 1) {
                l0.g.f947a.getClass();
                cVar = new l0.c(l0.f.f946b);
            } else {
                cVar = new n(1, i4);
            }
            q qVar = new q(C0061t.e(rVar, bVar.f963b), cVar);
            qVar.M(3, qVar, dVar);
            this.f1036f = 1;
            Object a2 = h.a(this.f1038h, qVar, true, this);
            if (a2 != aVar) {
                a2 = gVar;
            }
            if (a2 == aVar) {
                return aVar;
            }
            return gVar;
        } else if (i2 == 1) {
            a.a.z(obj);
            return gVar;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
