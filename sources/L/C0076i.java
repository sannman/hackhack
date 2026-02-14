package l;

import android.view.View;
import android.view.WindowInsets;
import h.C0041a;

/* renamed from: l.i  reason: case insensitive filesystem */
public class C0076i extends C0075h {

    /* renamed from: k  reason: collision with root package name */
    public C0041a f905k = null;

    public C0076i(C0081n nVar, WindowInsets windowInsets) {
        super(nVar, windowInsets);
    }

    public C0081n b() {
        return C0081n.a((View) null, this.f902c.consumeStableInsets());
    }

    public C0081n c() {
        return C0081n.a((View) null, this.f902c.consumeSystemWindowInsets());
    }

    public final C0041a f() {
        if (this.f905k == null) {
            WindowInsets windowInsets = this.f902c;
            this.f905k = C0041a.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f905k;
    }

    public boolean h() {
        return this.f902c.isConsumed();
    }

    public void l(C0041a aVar) {
        this.f905k = aVar;
    }
}
