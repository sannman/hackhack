package n;

import android.view.Choreographer;

public final /* synthetic */ class j implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1022a;

    public /* synthetic */ j(Runnable runnable) {
        this.f1022a = runnable;
    }

    public final void doFrame(long j2) {
        this.f1022a.run();
    }
}
