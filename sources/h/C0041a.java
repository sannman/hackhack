package h;

/* renamed from: h.a  reason: case insensitive filesystem */
public final class C0041a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0041a f529e = new C0041a(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f530a;

    /* renamed from: b  reason: collision with root package name */
    public final int f531b;

    /* renamed from: c  reason: collision with root package name */
    public final int f532c;

    /* renamed from: d  reason: collision with root package name */
    public final int f533d;

    public C0041a(int i2, int i3, int i4, int i5) {
        this.f530a = i2;
        this.f531b = i3;
        this.f532c = i4;
        this.f533d = i5;
    }

    public static C0041a a(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return f529e;
        }
        return new C0041a(i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0041a.class != obj.getClass()) {
            return false;
        }
        C0041a aVar = (C0041a) obj;
        if (this.f533d == aVar.f533d && this.f530a == aVar.f530a && this.f532c == aVar.f532c && this.f531b == aVar.f531b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f530a * 31) + this.f531b) * 31) + this.f532c) * 31) + this.f533d;
    }

    public final String toString() {
        return "Insets{left=" + this.f530a + ", top=" + this.f531b + ", right=" + this.f532c + ", bottom=" + this.f533d + '}';
    }
}
