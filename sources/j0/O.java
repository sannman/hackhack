package j0;

import d0.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.l;
import o0.s;

public abstract class O extends l implements C0067z, H, c0.l {

    /* renamed from: e  reason: collision with root package name */
    public T f826e;

    public final boolean b() {
        return true;
    }

    public final U c() {
        return null;
    }

    public final void e() {
        T n2 = n();
        while (true) {
            Object y2 = n2.y();
            if (y2 instanceof O) {
                if (y2 == this) {
                    A a2 = C0061t.f879i;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f839b;
                        if (!atomicReferenceFieldUpdater.compareAndSet(n2, y2, a2)) {
                            if (atomicReferenceFieldUpdater.get(n2) != y2) {
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if ((y2 instanceof H) && ((H) y2).c() != null) {
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof s) {
                        l lVar = ((s) k2).f1090a;
                        return;
                    } else if (k2 == this) {
                        l lVar2 = (l) k2;
                        return;
                    } else {
                        h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        l lVar3 = (l) k2;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f1079d;
                        s sVar = (s) atomicReferenceFieldUpdater2.get(lVar3);
                        if (sVar == null) {
                            sVar = new s(lVar3);
                            atomicReferenceFieldUpdater2.lazySet(lVar3, sVar);
                        }
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = l.f1077b;
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, k2, sVar)) {
                                lVar3.i();
                                return;
                            } else if (atomicReferenceFieldUpdater3.get(this) != k2) {
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public final T n() {
        T t2 = this.f826e;
        if (t2 != null) {
            return t2;
        }
        RuntimeException runtimeException = new RuntimeException("lateinit property job has not been initialized");
        h.f(runtimeException, h.class.getName());
        throw runtimeException;
    }

    public abstract void o(Throwable th);

    public final String toString() {
        return getClass().getSimpleName() + '@' + C0061t.a(this) + "[job@" + C0061t.a(n()) + ']';
    }
}
