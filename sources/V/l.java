package v;

import d0.h;
import l.C0081n;
import s.C0093b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final C0093b f1216a;

    /* renamed from: b  reason: collision with root package name */
    public final C0081n f1217b;

    public l(C0093b bVar, C0081n nVar) {
        h.e(nVar, "_windowInsetsCompat");
        this.f1216a = bVar;
        this.f1217b = nVar;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.class.equals(cls)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        if (h.a(this.f1216a, lVar.f1216a) && h.a(this.f1217b, lVar.f1217b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1217b.hashCode() + (this.f1216a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1216a + ", windowInsetsCompat=" + this.f1217b + ')';
    }
}
