package j0;

import V.i;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o0.c;

public final class F extends E implements C0064w {

    /* renamed from: d  reason: collision with root package name */
    public final Executor f819d;

    public F(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.f819d = executor;
        Method method = c.f1058a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = c.f1058a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void c(i iVar, Runnable runnable) {
        try {
            this.f819d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            K k2 = (K) iVar.g(C0059q.f870c);
            if (k2 != null) {
                k2.a(cancellationException);
            }
            C0066y.f885b.c(iVar, runnable);
        }
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f819d;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F) || ((F) obj).f819d != this.f819d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f819d);
    }

    public final String toString() {
        return this.f819d.toString();
    }
}
