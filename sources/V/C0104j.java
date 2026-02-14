package v;

import D.C0018t;
import T.g;
import V.d;
import W.a;
import X.f;
import android.app.Activity;
import c0.p;
import l0.j;
import l0.r;
import w.C0105a;

/* renamed from: v.j  reason: case insensitive filesystem */
public final class C0104j extends f implements p {

    /* renamed from: f  reason: collision with root package name */
    public int f1211f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f1212g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0096b f1213h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f1214i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0104j(C0096b bVar, Activity activity, d dVar) {
        super(dVar);
        this.f1213h = bVar;
        this.f1214i = activity;
    }

    public final d b(d dVar, Object obj) {
        C0104j jVar = new C0104j(this.f1213h, this.f1214i, dVar);
        jVar.f1212g = obj;
        return jVar;
    }

    public final Object d(Object obj, Object obj2) {
        return ((C0104j) b((d) obj2, (r) obj)).h(g.f356a);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [n.e, java.lang.Object] */
    public final Object h(Object obj) {
        Object obj2 = a.f373b;
        int i2 = this.f1211f;
        if (i2 == 0) {
            a.a.z(obj);
            r rVar = (r) this.f1212g;
            C0018t tVar = new C0018t(1, rVar);
            C0096b bVar = this.f1213h;
            ((C0105a) bVar.f1195c).a(this.f1214i, new Object(), tVar);
            C0103i iVar = new C0103i(bVar, tVar);
            this.f1211f = 1;
            if (j.a(rVar, iVar, this) == obj2) {
                return obj2;
            }
        } else if (i2 == 1) {
            a.a.z(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return g.f356a;
    }
}
