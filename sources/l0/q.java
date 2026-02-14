package l0;

import T.g;
import V.i;
import io.flutter.plugin.platform.c;
import j0.C0043a;
import j0.C0053k;
import j0.C0061t;
import j0.L;
import j0.Q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class q extends C0043a implements r, g {

    /* renamed from: e  reason: collision with root package name */
    public final c f957e;

    public q(i iVar, c cVar) {
        super(iVar, true);
        this.f957e = cVar;
    }

    public final void K(Throwable th, boolean z2) {
        if (!this.f957e.e(th, false) && !z2) {
            C0061t.c(this.f842d, th);
        }
    }

    public final void L(Object obj) {
        g gVar = (g) obj;
        this.f957e.e((Throwable) null, false);
    }

    public final void N(p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f957e;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f924k;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, (Object) null, pVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            c cVar2 = e.f942q;
            if (obj == cVar2) {
                c cVar3 = e.f943r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, cVar2, cVar3)) {
                        pVar.g(cVar.k());
                        return;
                    } else if (atomicReferenceFieldUpdater.get(cVar) != cVar2) {
                    }
                }
            } else if (obj == e.f943r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    public final void a(CancellationException cancellationException) {
        Object y2 = y();
        if (y2 instanceof C0053k) {
            return;
        }
        if (!(y2 instanceof Q) || !((Q) y2).e()) {
            if (cancellationException == null) {
                cancellationException = new L(r(), (Throwable) null, this);
            }
            p(cancellationException);
        }
    }

    public final Object j(Object obj) {
        return this.f957e.j(obj);
    }

    public final void p(CancellationException cancellationException) {
        this.f957e.e(cancellationException, true);
        o(cancellationException);
    }
}
