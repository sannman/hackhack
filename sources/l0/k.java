package l0;

import V.i;
import d0.h;
import io.flutter.plugin.platform.c;
import j0.d0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o0.v;

public final class k extends v {

    /* renamed from: e  reason: collision with root package name */
    public final c f950e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceArray f951f = new AtomicReferenceArray(e.f928b * 2);

    public k(long j2, k kVar, c cVar, int i2) {
        super(j2, kVar, i2);
        this.f950e = cVar;
    }

    public final int f() {
        return e.f928b;
    }

    public final void g(int i2, i iVar) {
        boolean z2;
        c cVar;
        c cVar2;
        int i3 = e.f928b;
        if (i2 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 -= i3;
        }
        this.f951f.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof d0;
            cVar = this.f950e;
            if (z3 || (k2 instanceof u)) {
                if (z2) {
                    cVar2 = e.f936j;
                } else {
                    cVar2 = e.f937k;
                }
                if (j(i2, k2, cVar2)) {
                    m(i2, (Object) null);
                    l(i2, !z2);
                    if (z2) {
                        h.b(cVar);
                        return;
                    }
                    return;
                }
            } else if (k2 == e.f936j || k2 == e.f937k) {
                m(i2, (Object) null);
            } else if (!(k2 == e.f933g || k2 == e.f932f)) {
                if (k2 != e.f935i && k2 != e.f930d && k2 != e.f938l) {
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
                return;
            }
        }
        m(i2, (Object) null);
        if (z2) {
            h.b(cVar);
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f951f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f951f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        boolean z3;
        long j3;
        if (z2) {
            c cVar = this.f950e;
            h.b(cVar);
            long j4 = (this.f1093c * ((long) e.f928b)) + ((long) i2);
            if (!cVar.r()) {
                do {
                    atomicLongFieldUpdater = c.f918e;
                } while (atomicLongFieldUpdater.get(cVar) <= j4);
                int i3 = e.f929c;
                int i4 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = c.f919f;
                    if (i4 < i3) {
                        long j5 = atomicLongFieldUpdater.get(cVar);
                        if (j5 == (4611686018427387903L & atomicLongFieldUpdater3.get(cVar)) && j5 == atomicLongFieldUpdater.get(cVar)) {
                            break;
                        }
                        i4++;
                    } else {
                        AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                        do {
                            j2 = atomicLongFieldUpdater4.get(cVar);
                        } while (!atomicLongFieldUpdater4.compareAndSet(cVar, j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
                        while (true) {
                            long j6 = atomicLongFieldUpdater.get(cVar);
                            atomicLongFieldUpdater2 = c.f919f;
                            long j7 = j6;
                            long j8 = atomicLongFieldUpdater2.get(cVar);
                            long j9 = j8 & 4611686018427387903L;
                            if ((j8 & 4611686018427387904L) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (j7 == j9 && j7 == atomicLongFieldUpdater.get(cVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater2.compareAndSet(cVar, j8, 4611686018427387904L + j9);
                            }
                        }
                        do {
                            j3 = atomicLongFieldUpdater2.get(cVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(cVar, j3, j3 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f951f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, c cVar) {
        this.f951f.set((i2 * 2) + 1, cVar);
    }
}
