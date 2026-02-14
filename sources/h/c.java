package H;

import androidx.lifecycle.f;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import d0.h;
import io.flutter.plugin.platform.j;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f234b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f235c;

    public /* synthetic */ c(int i2, Object obj) {
        this.f234b = i2;
        this.f235c = obj;
    }

    public final void run() {
        switch (this.f234b) {
            case 0:
                ((d) this.f235c).f237b.f244e.prefetchDefaultFontManager();
                return;
            case 1:
                r rVar = (r) this.f235c;
                h.e(rVar, "this$0");
                int i2 = rVar.f431b;
                n nVar = rVar.f435f;
                if (i2 == 0) {
                    rVar.f432c = true;
                    nVar.c(f.ON_PAUSE);
                }
                if (rVar.f430a == 0 && rVar.f432c) {
                    nVar.c(f.ON_STOP);
                    rVar.f433d = true;
                    return;
                }
                return;
            default:
                ((j) this.f235c).c(false);
                return;
        }
    }
}
