package v;

import w.C0105a;

/* renamed from: v.b  reason: case insensitive filesystem */
public final class C0096b implements C0102h {

    /* renamed from: d  reason: collision with root package name */
    public static final C0096b f1188d = new C0096b("NONE", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final C0096b f1189e = new C0096b("FULL", 0);

    /* renamed from: f  reason: collision with root package name */
    public static final C0096b f1190f = new C0096b("FLAT", 1);

    /* renamed from: g  reason: collision with root package name */
    public static final C0096b f1191g = new C0096b("HALF_OPENED", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final C0096b f1192h = new C0096b("FOLD", 2);

    /* renamed from: i  reason: collision with root package name */
    public static final C0096b f1193i = new C0096b("HINGE", 2);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1194b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1195c;

    public /* synthetic */ C0096b(String str, int i2) {
        this.f1194b = i2;
        this.f1195c = str;
    }

    public String toString() {
        switch (this.f1194b) {
            case 0:
                return (String) this.f1195c;
            case 1:
                return (String) this.f1195c;
            case 2:
                return (String) this.f1195c;
            default:
                return super.toString();
        }
    }

    public C0096b(C0105a aVar) {
        this.f1194b = 3;
        int i2 = n.f1219b;
        this.f1195c = aVar;
    }
}
