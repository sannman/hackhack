package o0;

import c0.a;
import d0.c;
import d0.l;
import j0.C0061t;

public final /* synthetic */ class k extends c implements a, g0.a {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1076h = false;

    public k(l lVar) {
        super(lVar, C0061t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }

    public final Object a() {
        return this.f469c.getClass().getSimpleName();
    }

    public final g0.a c() {
        if (this.f1076h) {
            return this;
        }
        g0.a aVar = this.f468b;
        if (aVar != null) {
            return aVar;
        }
        l.f484a.getClass();
        this.f468b = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (!b().equals(kVar.b()) || !this.f471e.equals(kVar.f471e) || !this.f472f.equals(kVar.f472f) || !this.f469c.equals(kVar.f469c)) {
                return false;
            }
            return true;
        } else if (obj instanceof k) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int hashCode = this.f471e.hashCode();
        return this.f472f.hashCode() + ((hashCode + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        g0.a c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + this.f471e + " (Kotlin reflection is not available)";
    }
}
