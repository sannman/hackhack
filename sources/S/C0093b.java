package s;

import android.graphics.Rect;
import d0.h;

/* renamed from: s.b  reason: case insensitive filesystem */
public final class C0093b {

    /* renamed from: a  reason: collision with root package name */
    public final int f1161a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1162b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1163c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1164d;

    public C0093b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1161a = i2;
        this.f1162b = i3;
        this.f1163c = i4;
        this.f1164d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        } else if (i3 > i5) {
            throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f1161a, this.f1162b, this.f1163c, this.f1164d);
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
        if (!C0093b.class.equals(cls)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0093b bVar = (C0093b) obj;
        if (this.f1161a == bVar.f1161a && this.f1162b == bVar.f1162b && this.f1163c == bVar.f1163c && this.f1164d == bVar.f1164d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1161a * 31) + this.f1162b) * 31) + this.f1163c) * 31) + this.f1164d;
    }

    public final String toString() {
        return C0093b.class.getSimpleName() + " { [" + this.f1161a + ',' + this.f1162b + ',' + this.f1163c + ',' + this.f1164d + "] }";
    }
}
