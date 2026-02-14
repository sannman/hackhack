package n;

import android.view.Choreographer;

public abstract class k {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new j(runnable));
    }
}
