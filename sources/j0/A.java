package j0;

public final class A implements H {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f812b;

    public A(boolean z2) {
        this.f812b = z2;
    }

    public final boolean b() {
        return this.f812b;
    }

    public final U c() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f812b) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
