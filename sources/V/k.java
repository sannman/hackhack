package v;

import U.a;
import U.e;
import java.util.Collection;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1215a;

    public k(List list) {
        this.f1215a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1215a.equals(((k) obj).f1215a);
    }

    public final int hashCode() {
        return this.f1215a.hashCode();
    }

    public final String toString() {
        return e.E((Collection) this.f1215a, "WindowLayoutInfo{ DisplayFeatures[", "] }", (a) null, 56);
    }
}
