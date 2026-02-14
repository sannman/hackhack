package j;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: j.a  reason: case insensitive filesystem */
public final class C0042a implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public final Handler f811b;

    public C0042a(Handler handler) {
        this.f811b = handler;
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f811b;
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
