package j0;

import d0.h;
import io.flutter.plugin.platform.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.C0087a;
import o0.b;
import o0.l;

public final class S extends b {

    /* renamed from: b  reason: collision with root package name */
    public final O f835b;

    /* renamed from: c  reason: collision with root package name */
    public U f836c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ T f837d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ H f838e;

    public S(O o2, T t2, H h2) {
        this.f837d = t2;
        this.f838e = h2;
        this.f835b = o2;
    }

    public final void b(Object obj, Object obj2) {
        boolean z2;
        Object obj3;
        l lVar = (l) obj;
        if (obj2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        O o2 = this.f835b;
        if (z2) {
            obj3 = o2;
        } else {
            obj3 = this.f836c;
        }
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1077b;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                U u = this.f836c;
                h.b(u);
                o2.j(u);
            }
        }
    }

    public final c c(Object obj) {
        l lVar = (l) obj;
        if (this.f837d.y() == this.f838e) {
            return null;
        }
        return C0087a.f1055e;
    }
}
