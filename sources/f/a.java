package F;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f186a;

    /* renamed from: b  reason: collision with root package name */
    public final String f187b;

    /* renamed from: c  reason: collision with root package name */
    public final String f188c;

    public a(String str, String str2) {
        this.f186a = str;
        this.f187b = null;
        this.f188c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f186a.equals(aVar.f186a)) {
            return false;
        }
        return this.f188c.equals(aVar.f188c);
    }

    public final int hashCode() {
        return this.f188c.hashCode() + (this.f186a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f186a + ", function: " + this.f188c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f186a = str;
        this.f187b = str2;
        this.f188c = str3;
    }
}
