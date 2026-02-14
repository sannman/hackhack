package D;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    public boolean f35a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f36b;

    public G(H h2) {
        this.f36b = h2;
    }

    public final void a(boolean z2) {
        if (!this.f35a) {
            this.f35a = true;
            H h2 = this.f36b;
            int i2 = h2.f38b - 1;
            h2.f38b = i2;
            boolean z3 = z2 | h2.f39c;
            h2.f39c = z3;
            if (i2 == 0 && !z3) {
                h2.f40d.f(h2.f37a);
                return;
            }
            return;
        }
        throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
    }
}
