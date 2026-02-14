package d;

import a.a;
import java.util.Iterator;

/* renamed from: d.b  reason: case insensitive filesystem */
public final class C0023b extends a implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public final C0024c f455e;

    /* renamed from: f  reason: collision with root package name */
    public C0024c f456f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f457g;

    public C0023b(C0024c cVar, C0024c cVar2, int i2) {
        this.f457g = i2;
        this.f455e = cVar2;
        this.f456f = cVar;
    }

    public final boolean hasNext() {
        if (this.f456f != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        C0024c cVar;
        C0024c cVar2 = this.f456f;
        C0024c cVar3 = this.f455e;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (this.f457g) {
                case 0:
                    cVar = cVar2.f460c;
                    break;
                default:
                    cVar = cVar2.f461d;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f456f = cVar;
        return cVar2;
    }
}
