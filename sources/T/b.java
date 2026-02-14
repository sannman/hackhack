package T;

import d0.h;
import java.io.Serializable;

public final class b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f349b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializable f350c;

    public b(Serializable serializable, Serializable serializable2) {
        this.f349b = serializable;
        this.f350c = serializable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (h.a(this.f349b, bVar.f349b) && this.f350c.equals(bVar.f350c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        Serializable serializable = this.f349b;
        if (serializable == null) {
            i2 = 0;
        } else {
            i2 = serializable.hashCode();
        }
        return this.f350c.hashCode() + (i2 * 31);
    }

    public final String toString() {
        return "(" + this.f349b + ", " + this.f350c + ')';
    }
}
