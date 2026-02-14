package t;

import D.C0018t;
import T.g;
import V.d;
import W.a;
import X.f;
import c0.p;
import j0.r;
import m0.c;

/* renamed from: t.a  reason: case insensitive filesystem */
public final class C0094a extends f implements p {

    /* renamed from: f  reason: collision with root package name */
    public int f1183f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f1184g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0018t f1185h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0094a(c cVar, C0018t tVar, d dVar) {
        super(dVar);
        this.f1184g = cVar;
        this.f1185h = tVar;
    }

    public final d b(d dVar, Object obj) {
        return new C0094a(this.f1184g, this.f1185h, dVar);
    }

    public final Object d(Object obj, Object obj2) {
        return ((C0094a) b((d) obj2, (r) obj)).h(g.f356a);
    }

    public final Object h(Object obj) {
        a aVar = a.f373b;
        int i2 = this.f1183f;
        if (i2 == 0) {
            a.a.z(obj);
            io.flutter.plugin.platform.c cVar = new io.flutter.plugin.platform.c(5, this.f1185h);
            this.f1183f = 1;
            if (this.f1184g.a(cVar, this) == aVar) {
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
