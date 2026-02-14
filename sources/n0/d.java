package n0;

import T.g;
import W.a;
import X.f;
import c0.p;
import l0.r;
import m0.b;

public final class d extends f implements p {

    /* renamed from: f  reason: collision with root package name */
    public int f1040f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f1041g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f1042h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar, V.d dVar) {
        super(dVar);
        this.f1042h = bVar;
    }

    public final V.d b(V.d dVar, Object obj) {
        d dVar2 = new d(this.f1042h, dVar);
        dVar2.f1041g = obj;
        return dVar2;
    }

    public final Object d(Object obj, Object obj2) {
        return ((d) b((V.d) obj2, (r) obj)).h(g.f356a);
    }

    public final Object h(Object obj) {
        a aVar = a.f373b;
        int i2 = this.f1040f;
        if (i2 == 0) {
            a.a.z(obj);
            this.f1040f = 1;
            if (this.f1042h.b((r) this.f1041g, this) == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            a.a.z(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return g.f356a;
    }
}
