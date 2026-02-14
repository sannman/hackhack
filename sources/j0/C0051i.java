package j0;

import T.g;
import java.util.concurrent.CancellationException;

/* renamed from: j0.i  reason: case insensitive filesystem */
public final class C0051i extends M implements C0050h {

    /* renamed from: f  reason: collision with root package name */
    public final T f855f;

    public C0051i(T t2) {
        this.f855f = t2;
    }

    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return g.f356a;
    }

    public final boolean h(Throwable th) {
        T n2 = n();
        if (th instanceof CancellationException) {
            return true;
        }
        if (!n2.o(th) || !n2.w()) {
            return false;
        }
        return true;
    }

    public final void o(Throwable th) {
        this.f855f.o(n());
    }
}
