package j0;

import U.c;

public abstract class D extends C0058p {

    /* renamed from: d  reason: collision with root package name */
    public long f816d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f817e;

    /* renamed from: f  reason: collision with root package name */
    public c f818f;

    public final void i() {
        long j2 = this.f816d - 4294967296L;
        this.f816d = j2;
        if (j2 <= 0 && this.f817e) {
            m();
        }
    }

    public abstract Thread j();

    public final void k(boolean z2) {
        long j2;
        long j3 = this.f816d;
        if (z2) {
            j2 = 4294967296L;
        } else {
            j2 = 1;
        }
        this.f816d = j2 + j3;
        if (!z2) {
            this.f817e = true;
        }
    }

    public final boolean l() {
        Object obj;
        c cVar = this.f818f;
        if (cVar == null) {
            return false;
        }
        if (cVar.isEmpty()) {
            obj = null;
        } else {
            obj = cVar.removeFirst();
        }
        C0065x xVar = (C0065x) obj;
        if (xVar == null) {
            return false;
        }
        xVar.run();
        return true;
    }

    public abstract void m();
}
