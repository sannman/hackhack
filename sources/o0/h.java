package o0;

import V.d;
import V.i;
import X.b;
import X.c;
import j0.C0053k;
import j0.C0054l;
import j0.C0058p;
import j0.C0061t;
import j0.C0065x;
import j0.D;
import j0.a0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class h extends C0065x implements c, d {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1064i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e  reason: collision with root package name */
    public final C0058p f1065e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1066f;

    /* renamed from: g  reason: collision with root package name */
    public Object f1067g = C0087a.f1053c;

    /* renamed from: h  reason: collision with root package name */
    public final Object f1068h;

    public h(C0058p pVar, b bVar) {
        super(-1);
        this.f1065e = pVar;
        this.f1066f = bVar;
        i iVar = bVar.f377c;
        d0.h.b(iVar);
        this.f1068h = C0087a.j(iVar);
    }

    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0054l) {
            ((C0054l) obj).getClass();
            throw null;
        }
    }

    public final void c(Object obj) {
        Object obj2;
        i iVar;
        Object k2;
        b bVar = this.f1066f;
        i iVar2 = bVar.f377c;
        d0.h.b(iVar2);
        Throwable a2 = T.d.a(obj);
        if (a2 == null) {
            obj2 = obj;
        } else {
            obj2 = new C0053k(a2, false);
        }
        C0058p pVar = this.f1065e;
        if (pVar.e()) {
            this.f1067g = obj2;
            this.f883d = 0;
            pVar.c(iVar2, this);
            return;
        }
        D a3 = a0.a();
        if (a3.f816d >= 4294967296L) {
            this.f1067g = obj2;
            this.f883d = 0;
            U.c cVar = a3.f818f;
            if (cVar == null) {
                cVar = new U.c();
                a3.f818f = cVar;
            }
            cVar.addLast(this);
            return;
        }
        a3.k(true);
        try {
            iVar = bVar.f377c;
            d0.h.b(iVar);
            k2 = C0087a.k(iVar, this.f1068h);
            bVar.c(obj);
            C0087a.f(iVar, k2);
            do {
            } while (a3.l());
        } catch (Throwable th) {
            a3.i();
            throw th;
        }
        a3.i();
    }

    public final c e() {
        b bVar = this.f1066f;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final i i() {
        i iVar = this.f1066f.f377c;
        d0.h.b(iVar);
        return iVar;
    }

    public final Object j() {
        Object obj = this.f1067g;
        this.f1067g = C0087a.f1053c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1065e + ", " + C0061t.g(this.f1066f) + ']';
    }

    public final d d() {
        return this;
    }
}
