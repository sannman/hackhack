package j0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: j0.k  reason: case insensitive filesystem */
public class C0053k {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f860b = AtomicIntegerFieldUpdater.newUpdater(C0053k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f861a;

    public C0053k(Throwable th, boolean z2) {
        this.f861a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f861a + ']';
    }
}
