package T;

import d0.h;
import java.io.Serializable;

public final class c implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f351b;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f351b = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (h.a(this.f351b, ((c) obj).f351b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f351b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f351b + ')';
    }
}
