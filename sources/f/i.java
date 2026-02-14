package F;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f211a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f212b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f213c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f211a = executorService;
    }

    public final void a(c cVar) {
        this.f212b.add(cVar);
        this.f211a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f211a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f212b;
        AtomicBoolean atomicBoolean = this.f213c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new h(this, 1));
                }
            }
        }
    }
}
