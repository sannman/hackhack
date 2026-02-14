package j0;

import T.g;
import V.d;
import d0.h;
import io.flutter.plugin.platform.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.C0087a;

/* renamed from: j0.g  reason: case insensitive filesystem */
public final class C0049g extends M {

    /* renamed from: f  reason: collision with root package name */
    public final C0047e f854f;

    public C0049g(C0047e eVar) {
        this.f854f = eVar;
    }

    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return g.f356a;
    }

    public final void o(Throwable th) {
        T n2 = n();
        C0047e eVar = this.f854f;
        eVar.getClass();
        CancellationException v2 = n2.v();
        if (eVar.s()) {
            d dVar = eVar.f851e;
            h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            o0.h hVar = (o0.h) dVar;
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o0.h.f1064i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                c cVar = C0087a.f1054d;
                if (!h.a(obj, cVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, v2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != cVar) {
                    }
                }
                return;
            }
        }
        eVar.m(v2);
        if (!eVar.s()) {
            eVar.n();
        }
    }
}
