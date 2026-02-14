package j0;

import V.d;
import V.i;
import W.a;
import X.c;
import c0.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l0.k;
import o0.C0087a;
import o0.h;
import o0.q;
import o0.v;

/* renamed from: j0.e  reason: case insensitive filesystem */
public final class C0047e extends C0065x implements C0046d, c, d0 {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f848g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f849h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f850i;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = C0044b.f844a;

    /* renamed from: e  reason: collision with root package name */
    public final d f851e;

    /* renamed from: f  reason: collision with root package name */
    public final i f852f;

    static {
        Class<C0047e> cls = C0047e.class;
        f848g = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f849h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f850i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public C0047e(d dVar, int i2) {
        super(i2);
        this.f851e = dVar;
        this.f852f = dVar.i();
    }

    public static void t(v vVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + vVar + ", already has " + obj).toString());
    }

    public final void a(k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f848g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f849h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0044b) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    } else {
                        return;
                    }
                }
            } else {
                Throwable th = null;
                if (obj instanceof v) {
                    t(kVar, obj);
                    throw null;
                } else if (obj instanceof C0053k) {
                    C0053k kVar2 = (C0053k) obj;
                    kVar2.getClass();
                    if (!C0053k.f860b.compareAndSet(kVar2, 0, 1)) {
                        t(kVar, obj);
                        throw null;
                    } else if (obj instanceof C0048f) {
                        if (obj == null) {
                            kVar2 = null;
                        }
                        if (kVar2 != null) {
                            th = kVar2.f861a;
                        }
                        l(kVar, th);
                        return;
                    } else {
                        return;
                    }
                } else if (obj instanceof C0052j) {
                    ((C0052j) obj).getClass();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(Object obj, CancellationException cancellationException) {
        Throwable th;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f849h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C0053k)) {
                if (obj2 instanceof C0052j) {
                    C0052j jVar = (C0052j) obj2;
                    if (jVar.f859d == null) {
                        Object obj3 = jVar.f856a;
                        if (true && true) {
                            jVar.getClass();
                        }
                        l lVar = jVar.f857b;
                        Object obj4 = jVar.f858c;
                        if (true && true) {
                            th = jVar.f859d;
                        } else {
                            th = cancellationException;
                        }
                        jVar.getClass();
                        C0052j jVar2 = new C0052j(obj3, lVar, obj4, th);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            }
                        }
                        l lVar2 = jVar.f857b;
                        if (lVar2 != null) {
                            k(lVar2, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                C0052j jVar3 = new C0052j(obj2, (q) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final void c(Object obj) {
        Throwable a2 = T.d.a(obj);
        if (a2 != null) {
            obj = new C0053k(a2, false);
        }
        v(obj, this.f883d, (q) null);
    }

    public final d d() {
        return this.f851e;
    }

    public final c e() {
        d dVar = this.f851e;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    public final Object g(Object obj) {
        if (obj instanceof C0052j) {
            return ((C0052j) obj).f856a;
        }
        return obj;
    }

    public final i i() {
        return this.f852f;
    }

    public final Object j() {
        return f849h.get(this);
    }

    public final void k(l lVar, Throwable th) {
        try {
            lVar.g(th);
        } catch (Throwable th2) {
            C0061t.c(this.f852f, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(v vVar, Throwable th) {
        i iVar = this.f852f;
        int i2 = f848g.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                vVar.g(i2, iVar);
            } catch (Throwable th2) {
                C0061t.c(iVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public final void m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f849h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                C0048f fVar = new C0048f(this, th, obj instanceof v);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, fVar)) {
                        if (((W) obj) instanceof v) {
                            l((v) obj, th);
                        }
                        if (!s()) {
                            n();
                        }
                        o(this.f883d);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f850i;
        C0067z zVar = (C0067z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            zVar.e();
            atomicReferenceFieldUpdater.set(this, V.f841b);
        }
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean z2;
        boolean z3;
        do {
            atomicIntegerFieldUpdater = f848g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 1) {
                    boolean z4 = false;
                    if (i2 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    d dVar = this.f851e;
                    if (!z2 && (dVar instanceof h)) {
                        if (i2 == 1 || i2 == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i5 = this.f883d;
                        if (i5 == 1 || i5 == 2) {
                            z4 = true;
                        }
                        if (z3 == z4) {
                            C0058p pVar = ((h) dVar).f1065e;
                            i iVar = ((h) dVar).f1066f.f377c;
                            d0.h.b(iVar);
                            if (pVar.e()) {
                                pVar.c(iVar, this);
                                return;
                            }
                            D a2 = a0.a();
                            if (a2.f816d >= 4294967296L) {
                                U.c cVar = a2.f818f;
                                if (cVar == null) {
                                    cVar = new U.c();
                                    a2.f818f = cVar;
                                }
                                cVar.addLast(this);
                                return;
                            }
                            a2.k(true);
                            try {
                                C0061t.f(this, dVar, true);
                                do {
                                } while (a2.l());
                            } catch (Throwable th) {
                                a2.i();
                                throw th;
                            }
                            a2.i();
                            return;
                        }
                    }
                    C0061t.f(this, dVar, z2);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean s2 = s();
        do {
            atomicIntegerFieldUpdater = f848g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    if (s2) {
                        u();
                    }
                    Object obj = f849h.get(this);
                    if (!(obj instanceof C0053k)) {
                        int i4 = this.f883d;
                        if (i4 == 1 || i4 == 2) {
                            K k2 = (K) this.f852f.g(C0059q.f870c);
                            if (k2 != null && !k2.b()) {
                                CancellationException v2 = ((T) k2).v();
                                b(obj, v2);
                                throw v2;
                            }
                        }
                        return g(obj);
                    }
                    throw ((C0053k) obj).f861a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((C0067z) f850i.get(this)) == null) {
            r();
        }
        if (s2) {
            u();
        }
        return a.f373b;
    }

    public final void q() {
        C0067z r2 = r();
        if (r2 != null && !(f849h.get(this) instanceof W)) {
            r2.e();
            f850i.set(this, V.f841b);
        }
    }

    public final C0067z r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K k2 = (K) this.f852f.g(C0059q.f870c);
        if (k2 == null) {
            return null;
        }
        C0067z d2 = C0061t.d(k2, new C0049g(this), 2);
        do {
            atomicReferenceFieldUpdater = f850i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, d2) || atomicReferenceFieldUpdater.get(this) != null) {
                return d2;
            }
            atomicReferenceFieldUpdater = f850i;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return d2;
    }

    public final boolean s() {
        if (this.f883d != 2) {
            return false;
        }
        d dVar = this.f851e;
        d0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        if (h.f1064i.get((h) dVar) != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(C0061t.g(this.f851e));
        sb.append("){");
        Object obj = f849h.get(this);
        if (obj instanceof W) {
            str = "Active";
        } else if (obj instanceof C0048f) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C0061t.a(this));
        return sb.toString();
    }

    public final void u() {
        h hVar;
        d dVar = this.f851e;
        Throwable th = null;
        if (dVar instanceof h) {
            hVar = (h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1064i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.platform.c cVar = C0087a.f1054d;
                if (obj == cVar) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, this)) {
                            break loop0;
                        } else if (atomicReferenceFieldUpdater.get(hVar) != cVar) {
                        }
                    }
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                n();
                m(th);
            }
        }
    }

    public final void v(Object obj, int i2, q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f849h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                if (!(obj instanceof C0053k) && i2 != 1) {
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                        if (!s()) {
                            n();
                        }
                        o(i2);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                if (obj2 instanceof C0048f) {
                    C0048f fVar = (C0048f) obj2;
                    fVar.getClass();
                    if (C0048f.f853c.compareAndSet(fVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        }
    }
}
