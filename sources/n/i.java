package n;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f1021c;

    public /* synthetic */ i(Context context, int i2) {
        this.f1020b = i2;
        this.f1021c = context;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void run() {
        switch (this.f1020b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i(this.f1021c, 1));
                return;
            default:
                g.s(this.f1021c, new Object(), g.f1008a, false);
                return;
        }
    }
}
