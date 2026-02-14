package androidx.lifecycle;

import D.u;
import H.c;
import android.os.Handler;
import d0.h;

public final class r implements l {

    /* renamed from: i  reason: collision with root package name */
    public static final r f429i = new r();

    /* renamed from: a  reason: collision with root package name */
    public int f430a;

    /* renamed from: b  reason: collision with root package name */
    public int f431b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f432c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f433d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f434e;

    /* renamed from: f  reason: collision with root package name */
    public final n f435f = new n(this);

    /* renamed from: g  reason: collision with root package name */
    public final c f436g = new c(1, this);

    /* renamed from: h  reason: collision with root package name */
    public final u f437h = new u(27, (Object) this);

    public final n a() {
        return this.f435f;
    }

    public final void b() {
        int i2 = this.f431b + 1;
        this.f431b = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f432c) {
            this.f435f.c(f.ON_RESUME);
            this.f432c = false;
            return;
        }
        Handler handler = this.f434e;
        h.b(handler);
        handler.removeCallbacks(this.f436g);
    }
}
