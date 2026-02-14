package F;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f224a;

    public l() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            handler = new Handler(mainLooper);
        }
        this.f224a = handler;
    }

    public final void a(c cVar) {
        this.f224a.post(cVar);
    }
}
