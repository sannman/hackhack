package d0;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f482a;

    public j(Class cls) {
        this.f482a = cls;
    }

    public final Class a() {
        return this.f482a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (h.a(this.f482a, ((j) obj).f482a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f482a.hashCode();
    }

    public final String toString() {
        return this.f482a + " (Kotlin reflection is not available)";
    }
}
