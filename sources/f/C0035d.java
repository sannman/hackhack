package f;

import a.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f.d  reason: case insensitive filesystem */
public final class C0035d extends a {

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f514e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f515f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f516g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f517h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f518i;

    public C0035d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f514e = atomicReferenceFieldUpdater;
        this.f515f = atomicReferenceFieldUpdater2;
        this.f516g = atomicReferenceFieldUpdater3;
        this.f517h = atomicReferenceFieldUpdater4;
        this.f518i = atomicReferenceFieldUpdater5;
    }

    public final boolean c(C0038g gVar, C0034c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0034c cVar2 = C0034c.f512b;
        do {
            atomicReferenceFieldUpdater = this.f517h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    public final boolean d(C0038g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f518i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    public final boolean e(C0038g gVar, C0037f fVar, C0037f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f516g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    public final void t(C0037f fVar, C0037f fVar2) {
        this.f515f.lazySet(fVar, fVar2);
    }

    public final void u(C0037f fVar, Thread thread) {
        this.f514e.lazySet(fVar, thread);
    }
}
