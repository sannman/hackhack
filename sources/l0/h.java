package l0;

public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f948a;

    public h(Throwable th) {
        this.f948a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (d0.h.a(this.f948a, ((h) obj).f948a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f948a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Closed(" + this.f948a + ')';
    }
}
