package j0;

import T.g;
import c0.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class J extends M {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f822g = AtomicIntegerFieldUpdater.newUpdater(J.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f  reason: collision with root package name */
    public final l f823f;

    public J(l lVar) {
        this.f823f = lVar;
    }

    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return g.f356a;
    }

    public final void o(Throwable th) {
        if (f822g.compareAndSet(this, 0, 1)) {
            this.f823f.g(th);
        }
    }
}
