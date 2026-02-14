package l0;

import T.g;
import d0.l;
import io.flutter.plugin.platform.c;
import j0.d0;

public final class n extends c {

    /* renamed from: l  reason: collision with root package name */
    public final int f952l;

    public n(int i2, int i3) {
        super(i2);
        this.f952l = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + l.a(c.class).b() + " instead").toString());
        } else if (i2 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
    }

    public final Object j(Object obj) {
        d0 d0Var;
        g gVar = g.f356a;
        if (this.f952l == 3) {
            Object j2 = super.j(obj);
            if (!(j2 instanceof i) || (j2 instanceof h)) {
                return j2;
            }
            return gVar;
        }
        c cVar = e.f930d;
        k kVar = (k) c.f920g.get(this);
        while (true) {
            long andIncrement = c.f916c.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean o2 = o(andIncrement, false);
            int i2 = e.f928b;
            long j4 = (long) i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (kVar.f1093c != j5) {
                k b2 = c.b(this, j5, kVar);
                if (b2 != null) {
                    kVar = b2;
                } else if (o2) {
                    return new h(l());
                }
            }
            int i4 = i3;
            int c2 = c.c(this, kVar, i4, obj, j3, cVar, o2);
            if (c2 == 0) {
                kVar.a();
                return gVar;
            } else if (c2 == 1) {
                return gVar;
            } else {
                if (c2 != 2) {
                    if (c2 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (c2 == 4) {
                        if (j3 < c.f917d.get(this)) {
                            kVar.a();
                        }
                        return new h(l());
                    } else if (c2 == 5) {
                        kVar.a();
                    }
                } else if (o2) {
                    kVar.h();
                    return new h(l());
                } else {
                    if (cVar instanceof d0) {
                        d0Var = (d0) cVar;
                    } else {
                        d0Var = null;
                    }
                    if (d0Var != null) {
                        d0Var.a(kVar, i4 + i2);
                    }
                    g((kVar.f1093c * j4) + ((long) i4));
                    return gVar;
                }
            }
        }
    }

    public final boolean q() {
        if (this.f952l == 2) {
            return true;
        }
        return false;
    }
}
