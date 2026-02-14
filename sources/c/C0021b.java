package c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.b  reason: case insensitive filesystem */
public final class C0021b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f449a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f449a.getAndIncrement());
        return thread;
    }
}
