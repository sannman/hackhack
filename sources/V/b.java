package V;

import c0.p;
import d0.h;

public final /* synthetic */ class b implements p {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f368b;

    public /* synthetic */ b(int i2) {
        this.f368b = i2;
    }

    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f368b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                h.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                h.e(iVar, "acc");
                i f2 = iVar.f(gVar2.getKey());
                j jVar = j.f372b;
                if (f2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f371b;
                f fVar = (f) f2.g(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, f2);
                } else {
                    i f3 = f2.f(eVar);
                    if (f3 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, f3));
                }
                return cVar;
        }
    }
}
