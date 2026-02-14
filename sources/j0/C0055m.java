package j0;

import V.g;
import c0.p;
import d0.i;

/* renamed from: j0.m  reason: case insensitive filesystem */
public final class C0055m extends i implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final C0055m f862d = new C0055m(2, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final C0055m f863e = new C0055m(2, 1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f864c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0055m(int i2, int i3) {
        super(i2);
        this.f864c = i3;
    }

    public final Object d(Object obj, Object obj2) {
        switch (this.f864c) {
            case 0:
                return ((V.i) obj).h((g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g gVar = (g) obj2;
                return bool;
            default:
                return ((V.i) obj).h((g) obj2);
        }
    }
}
