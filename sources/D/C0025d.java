package d;

import a.a;
import java.util.Iterator;

/* renamed from: d.d  reason: case insensitive filesystem */
public final class C0025d extends a implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public C0024c f462e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f463f = true;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0022a f464g;

    public C0025d(C0022a aVar) {
        this.f464g = aVar;
    }

    public final boolean hasNext() {
        if (!this.f463f) {
            C0024c cVar = this.f462e;
            if (cVar == null || cVar.f460c == null) {
                return false;
            }
            return true;
        } else if (this.f464g.f450b != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        C0024c cVar;
        if (this.f463f) {
            this.f463f = false;
            this.f462e = this.f464g.f450b;
        } else {
            C0024c cVar2 = this.f462e;
            if (cVar2 != null) {
                cVar = cVar2.f460c;
            } else {
                cVar = null;
            }
            this.f462e = cVar;
        }
        return this.f462e;
    }
}
