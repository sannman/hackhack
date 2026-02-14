package o0;

import d0.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1059a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1060b;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<d> cls = d.class;
        Class<Object> cls2 = Object.class;
        f1059a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f1060b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public d(v vVar) {
        this._prev = vVar;
    }

    public final void a() {
        f1060b.lazySet(this, (Object) null);
    }

    public final d b() {
        Object obj = f1059a.get(this);
        if (obj == C0087a.f1052b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b2;
        if (b() != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1060b;
                d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
                while (dVar2 != null && dVar2.c()) {
                    dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
                }
                d b3 = b();
                h.b(b3);
                while (b3.c() && (b2 = b3.b()) != null) {
                    b3 = b2;
                }
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(b3);
                    if (((d) obj) == null) {
                        dVar = null;
                    } else {
                        dVar = dVar2;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(b3, obj, dVar)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        }
                    }
                }
                if (dVar2 != null) {
                    f1059a.set(dVar2, b3);
                }
                if ((!b3.c() || b3.b() == null) && (dVar2 == null || !dVar2.c())) {
                    return;
                }
            }
        }
    }
}
