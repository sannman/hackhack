package j0;

import V.a;
import V.e;
import V.f;
import V.g;
import V.h;
import V.i;

/* renamed from: j0.p  reason: case insensitive filesystem */
public abstract class C0058p extends a implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final C0057o f868c = new C0057o(e.f371b, C0056n.f865c);

    public C0058p() {
        super(e.f371b);
    }

    public abstract void c(i iVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof b0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = (j0.C0057o) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V.i f(V.h r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            d0.h.e(r4, r0)
            boolean r0 = r4 instanceof j0.C0057o
            V.j r1 = V.j.f372b
            if (r0 == 0) goto L_0x001e
            j0.o r4 = (j0.C0057o) r4
            V.h r0 = r3.f367b
            if (r0 == r4) goto L_0x0017
            V.h r2 = r4.f867c
            if (r2 != r0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            return r3
        L_0x0017:
            V.g r4 = r4.a(r3)
            if (r4 == 0) goto L_0x0023
            goto L_0x0022
        L_0x001e:
            V.e r0 = V.e.f371b
            if (r0 != r4) goto L_0x0023
        L_0x0022:
            return r1
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0058p.f(V.h):V.i");
    }

    public final g g(h hVar) {
        g a2;
        d0.h.e(hVar, "key");
        if (hVar instanceof C0057o) {
            C0057o oVar = (C0057o) hVar;
            h hVar2 = this.f367b;
            if ((hVar2 == oVar || oVar.f867c == hVar2) && (a2 = oVar.a(this)) != null) {
                return a2;
            }
            return null;
        } else if (e.f371b == hVar) {
            return this;
        } else {
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C0061t.a(this);
    }
}
