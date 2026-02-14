package v;

import d0.h;
import s.C0093b;

/* renamed from: v.c  reason: case insensitive filesystem */
public final class C0097c {

    /* renamed from: a  reason: collision with root package name */
    public final C0093b f1196a;

    /* renamed from: b  reason: collision with root package name */
    public final C0096b f1197b;

    /* renamed from: c  reason: collision with root package name */
    public final C0096b f1198c;

    public C0097c(C0093b bVar, C0096b bVar2, C0096b bVar3) {
        this.f1196a = bVar;
        this.f1197b = bVar2;
        this.f1198c = bVar3;
        int i2 = bVar.f1163c;
        int i3 = bVar.f1161a;
        int i4 = i2 - i3;
        int i5 = bVar.f1162b;
        if (i4 == 0 && bVar.f1164d - i5 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        } else if (i3 != 0 && i5 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
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
        if (!C0097c.class.equals(cls)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0097c cVar = (C0097c) obj;
        if (h.a(this.f1196a, cVar.f1196a) && h.a(this.f1197b, cVar.f1197b) && h.a(this.f1198c, cVar.f1198c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f1197b.hashCode();
        return this.f1198c.hashCode() + ((hashCode + (this.f1196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0097c.class.getSimpleName() + " { " + this.f1196a + ", type=" + this.f1197b + ", state=" + this.f1198c + " }";
    }
}
