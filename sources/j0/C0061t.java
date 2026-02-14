package j0;

import V.d;
import V.e;
import V.i;
import V.j;
import a.a;
import io.flutter.plugin.platform.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.b;
import o0.C0087a;
import o0.h;
import o0.l;

/* renamed from: j0.t  reason: case insensitive filesystem */
public abstract class C0061t {

    /* renamed from: a  reason: collision with root package name */
    public static final c f871a = new c(4, "RESUME_TOKEN");

    /* renamed from: b  reason: collision with root package name */
    public static final c f872b = new c(4, "CLOSED_EMPTY");

    /* renamed from: c  reason: collision with root package name */
    public static final c f873c = new c(4, "COMPLETING_ALREADY");

    /* renamed from: d  reason: collision with root package name */
    public static final c f874d = new c(4, "COMPLETING_WAITING_CHILDREN");

    /* renamed from: e  reason: collision with root package name */
    public static final c f875e = new c(4, "COMPLETING_RETRY");

    /* renamed from: f  reason: collision with root package name */
    public static final c f876f = new c(4, "TOO_LATE_TO_CANCEL");

    /* renamed from: g  reason: collision with root package name */
    public static final c f877g = new c(4, "SEALED");

    /* renamed from: h  reason: collision with root package name */
    public static final A f878h = new A(false);

    /* renamed from: i  reason: collision with root package name */
    public static final A f879i = new A(true);

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0047e b(d dVar) {
        C0047e eVar;
        C0047e eVar2;
        if (!(dVar instanceof h)) {
            return new C0047e(dVar, 1);
        }
        h hVar = (h) dVar;
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1064i;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            c cVar = C0087a.f1054d;
            eVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, cVar);
                eVar2 = null;
                break;
            } else if (obj instanceof C0047e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, cVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                    }
                }
                eVar2 = (C0047e) obj;
                break loop0;
            } else if (obj != cVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (eVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0047e.f849h;
            Object obj2 = atomicReferenceFieldUpdater2.get(eVar2);
            if (!(obj2 instanceof C0052j) || ((C0052j) obj2).f858c == null) {
                C0047e.f848g.set(eVar2, 536870911);
                atomicReferenceFieldUpdater2.set(eVar2, C0044b.f844a);
                eVar = eVar2;
            } else {
                eVar2.n();
            }
            if (eVar != null) {
                return eVar;
            }
        }
        return new C0047e(dVar, 2);
    }

    public static final void c(i iVar, Throwable th) {
        try {
            b bVar = (b) iVar.g(C0059q.f869b);
            if (bVar != null) {
                bVar.c(th);
            } else {
                C0087a.c(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a.a(runtimeException, th);
                th = runtimeException;
            }
            C0087a.c(iVar, th);
        }
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [o0.l, j0.U] */
    public static C0067z d(K k2, O o2, int i2) {
        boolean z2;
        O o3;
        C0053k kVar;
        Throwable th;
        G g2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z3 = true;
        if ((i2 & 1) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i2 & 2) == 0) {
            z3 = false;
        }
        T t2 = (T) k2;
        t2.getClass();
        Throwable th2 = null;
        if (z2) {
            if (o2 instanceof M) {
                o3 = (M) o2;
            } else {
                o3 = null;
            }
            if (o3 == null) {
                o3 = new J(o2);
            }
        } else {
            o3 = o2;
        }
        o3.f826e = t2;
        loop0:
        while (true) {
            Object y2 = t2.y();
            if (y2 instanceof A) {
                A a2 = (A) y2;
                if (!a2.f812b) {
                    ? lVar = new l();
                    if (a2.f812b) {
                        g2 = lVar;
                    } else {
                        g2 = new G(lVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = T.f839b;
                        if (atomicReferenceFieldUpdater.compareAndSet(t2, a2, g2)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(t2) == a2);
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T.f839b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, y2, o3)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != y2) {
                        }
                    }
                    break loop0;
                }
            } else if (y2 instanceof H) {
                U c2 = ((H) y2).c();
                if (c2 == null) {
                    d0.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t2.H((O) y2);
                } else {
                    C0067z zVar = V.f841b;
                    if (!z2 || !(y2 instanceof Q)) {
                        th = null;
                    } else {
                        synchronized (y2) {
                            try {
                                th = ((Q) y2).d();
                                if (th != null) {
                                    if ((o2 instanceof C0051i) && !((Q) y2).f()) {
                                    }
                                }
                                if (t2.l((H) y2, c2, o3)) {
                                    if (th == null) {
                                        return o3;
                                    }
                                    zVar = o3;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (th != null) {
                        if (z3) {
                            o2.g(th);
                        }
                        return zVar;
                    } else if (t2.l((H) y2, c2, o3)) {
                        break;
                    }
                }
            } else {
                if (z3) {
                    if (y2 instanceof C0053k) {
                        kVar = (C0053k) y2;
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        th2 = kVar.f861a;
                    }
                    o2.g(th2);
                }
                return V.f841b;
            }
        }
        return o3;
    }

    public static final i e(r rVar, i iVar) {
        i iVar2;
        i k2 = rVar.k();
        Boolean bool = Boolean.FALSE;
        C0055m mVar = C0055m.f863e;
        boolean booleanValue = ((Boolean) k2.d(bool, mVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.d(bool, mVar)).booleanValue();
        if (booleanValue || booleanValue2) {
            j jVar = j.f372b;
            i iVar3 = (i) k2.d(jVar, new C0055m(2, 2));
            Object obj = iVar;
            if (booleanValue2) {
                obj = iVar.d(jVar, C0055m.f862d);
            }
            iVar2 = iVar3.h((i) obj);
        } else {
            iVar2 = k2.h(iVar);
        }
        p0.d dVar = C0066y.f884a;
        if (iVar2 == dVar || iVar2.g(e.f371b) != null) {
            return iVar2;
        }
        return iVar2.h(dVar);
    }

    public static final void f(C0047e eVar, d dVar, boolean z2) {
        Object obj;
        Object obj2 = C0047e.f849h.get(eVar);
        Throwable f2 = eVar.f(obj2);
        if (f2 != null) {
            obj = a.g(f2);
        } else {
            obj = eVar.g(obj2);
        }
        if (z2) {
            d0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            h hVar = (h) dVar;
            X.b bVar = hVar.f1066f;
            i iVar = bVar.f377c;
            d0.h.b(iVar);
            Object k2 = C0087a.k(iVar, hVar.f1068h);
            if (k2 != C0087a.f1056f) {
                h(bVar, iVar);
            }
            try {
                bVar.c(obj);
            } finally {
                C0087a.f(iVar, k2);
            }
        } else {
            dVar.c(obj);
        }
    }

    public static final String g(d dVar) {
        Object obj;
        if (dVar instanceof h) {
            return dVar.toString();
        }
        try {
            obj = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            obj = a.g(th);
        }
        if (T.d.a(obj) != null) {
            obj = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) obj;
    }

    public static final void h(X.b bVar, i iVar) {
        X.c e2;
        if (bVar != null) {
            X.c cVar = bVar;
            if (iVar.g(c0.f847b) != null) {
                do {
                    e2 = cVar.e();
                    cVar = e2;
                } while (e2 != null);
            }
        }
    }
}
