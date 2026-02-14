package o0;

import V.d;
import V.i;
import X.c;
import X.f;
import a.a;
import j0.C0043a;
import j0.C0053k;

public class u extends C0043a implements c {

    /* renamed from: e  reason: collision with root package name */
    public final f f1091e;

    public u(i iVar, f fVar) {
        super(iVar, true);
        this.f1091e = fVar;
    }

    public final c e() {
        f fVar = this.f1091e;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    public final void m(Object obj) {
        d m = a.m(this.f1091e);
        if (obj instanceof C0053k) {
            obj = a.g(((C0053k) obj).f861a);
        }
        C0087a.g(m, obj);
    }

    public final void n(Object obj) {
        f fVar = this.f1091e;
        if (obj instanceof C0053k) {
            obj = a.g(((C0053k) obj).f861a);
        }
        fVar.c(obj);
    }
}
