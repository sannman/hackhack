package f;

import java.util.concurrent.CancellationException;

/* renamed from: f.a  reason: case insensitive filesystem */
public final class C0032a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0032a f509b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0032a f510c;

    /* renamed from: a  reason: collision with root package name */
    public final CancellationException f511a;

    static {
        if (C0038g.f522d) {
            f510c = null;
            f509b = null;
            return;
        }
        f510c = new C0032a(false, (CancellationException) null);
        f509b = new C0032a(true, (CancellationException) null);
    }

    public C0032a(boolean z2, CancellationException cancellationException) {
        this.f511a = cancellationException;
    }
}
