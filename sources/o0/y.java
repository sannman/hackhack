package o0;

import D.C0009j;
import V.g;
import c0.p;
import d0.i;

public final class y extends i implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final y f1096d = new y(2, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final y f1097e = new y(2, 1);

    /* renamed from: f  reason: collision with root package name */
    public static final y f1098f = new y(2, 2);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1099c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f1099c = i3;
    }

    public final Object d(Object obj, Object obj2) {
        switch (this.f1099c) {
            case 0:
                g gVar = (g) obj2;
                return obj;
            case 1:
                C0009j.e(obj);
                g gVar2 = (g) obj2;
                return null;
            default:
                g gVar3 = (g) obj2;
                return (A) obj;
        }
    }
}
