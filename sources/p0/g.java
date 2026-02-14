package p0;

import V.i;
import j0.E;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public abstract class g extends E {

    /* renamed from: d  reason: collision with root package name */
    public b f1128d;

    public final void c(i iVar, Runnable runnable) {
        b bVar = this.f1128d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1113i;
        bVar.b(runnable, j.f1138g);
    }
}
