package androidx.lifecycle;

import d0.h;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public g f417a;

    /* renamed from: b  reason: collision with root package name */
    public b f418b;

    public final void a(l lVar, f fVar) {
        g a2 = fVar.a();
        g gVar = this.f417a;
        h.e(gVar, "state1");
        if (a2.compareTo(gVar) < 0) {
            gVar = a2;
        }
        this.f417a = gVar;
        this.f418b.a(lVar, fVar);
        this.f417a = a2;
    }
}
