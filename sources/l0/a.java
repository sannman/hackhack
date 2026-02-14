package l0;

import d0.h;
import io.flutter.plugin.platform.c;
import j0.C0047e;
import j0.C0061t;
import j0.d0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.e;
import o0.q;
import o0.w;

public final class a implements d0 {

    /* renamed from: b  reason: collision with root package name */
    public Object f913b = e.f941p;

    /* renamed from: c  reason: collision with root package name */
    public C0047e f914c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f915d;

    public a(c cVar) {
        this.f915d = cVar;
    }

    public final void a(k kVar, int i2) {
        C0047e eVar = this.f914c;
        if (eVar != null) {
            eVar.a(kVar, i2);
        }
    }

    public final Object b(e eVar) {
        k kVar;
        Boolean bool;
        int i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f921h;
        c cVar = this.f915d;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.o(c.f916c.get(cVar), true)) {
                this.f913b = e.f938l;
                Throwable k2 = cVar.k();
                if (k2 == null) {
                    return Boolean.FALSE;
                }
                int i3 = w.f1094a;
                throw k2;
            }
            long andIncrement = c.f917d.getAndIncrement(cVar);
            long j2 = (long) e.f928b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (kVar2.f1093c != j3) {
                kVar = cVar.i(j3, kVar2);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar2;
            }
            Object w2 = cVar.w(kVar, i4, andIncrement, (a) null);
            c cVar2 = e.m;
            if (w2 != cVar2) {
                c cVar3 = e.f940o;
                if (w2 == cVar3) {
                    if (andIncrement < cVar.m()) {
                        kVar.a();
                    }
                    kVar2 = kVar;
                } else if (w2 == e.f939n) {
                    c cVar4 = this.f915d;
                    C0047e b2 = C0061t.b(a.a.m(eVar));
                    try {
                        this.f914c = b2;
                        Object w3 = cVar4.w(kVar, i4, andIncrement, this);
                        if (w3 == cVar2) {
                            a(kVar, i4);
                        } else {
                            if (w3 == cVar3) {
                                if (andIncrement < cVar4.m()) {
                                    kVar.a();
                                }
                                k kVar3 = (k) c.f921h.get(cVar4);
                                while (true) {
                                    if (cVar4.o(c.f916c.get(cVar4), true)) {
                                        C0047e eVar2 = this.f914c;
                                        h.b(eVar2);
                                        this.f914c = null;
                                        this.f913b = e.f938l;
                                        Throwable k3 = cVar.k();
                                        if (k3 == null) {
                                            eVar2.c(Boolean.FALSE);
                                        } else {
                                            eVar2.c(a.a.g(k3));
                                        }
                                    } else {
                                        long andIncrement2 = c.f917d.getAndIncrement(cVar4);
                                        long j4 = (long) e.f928b;
                                        long j5 = andIncrement2 / j4;
                                        int i5 = (int) (andIncrement2 % j4);
                                        if (kVar3.f1093c != j5) {
                                            k i6 = cVar4.i(j5, kVar3);
                                            if (i6 != null) {
                                                kVar3 = i6;
                                            }
                                        }
                                        Object w4 = cVar4.w(kVar3, i5, andIncrement2, this);
                                        if (w4 == e.m) {
                                            a(kVar3, i5);
                                            break;
                                        } else if (w4 == e.f940o) {
                                            if (andIncrement2 < cVar4.m()) {
                                                kVar3.a();
                                            }
                                        } else if (w4 != e.f939n) {
                                            kVar3.a();
                                            this.f913b = w4;
                                            this.f914c = null;
                                            bool = Boolean.TRUE;
                                            i2 = b2.f883d;
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f913b = w3;
                                this.f914c = null;
                                bool = Boolean.TRUE;
                                i2 = b2.f883d;
                            }
                            b2.v(bool, i2, (q) null);
                        }
                        return b2.p();
                    } catch (Throwable th) {
                        b2.u();
                        throw th;
                    }
                } else {
                    kVar.a();
                    this.f913b = w2;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
    }
}
