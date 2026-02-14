package e;

import B.e;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: e.f  reason: case insensitive filesystem */
public final class C0031f implements Collection {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f506b;

    public C0031f(e eVar) {
        this.f506b = eVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        ((C0026a) this.f506b.f10d).clear();
    }

    public final boolean contains(Object obj) {
        if (((C0026a) this.f506b.f10d).g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (((C0026a) this.f506b.f10d).f491d == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C0028c(this.f506b, 1);
    }

    public final boolean remove(Object obj) {
        e eVar = this.f506b;
        int g2 = ((C0026a) eVar.f10d).g(obj);
        if (g2 < 0) {
            return false;
        }
        eVar.b(g2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        e eVar = this.f506b;
        int i2 = ((C0026a) eVar.f10d).f491d;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(eVar.a(i3, 1))) {
                eVar.b(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    public final boolean retainAll(Collection collection) {
        e eVar = this.f506b;
        int i2 = ((C0026a) eVar.f10d).f491d;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(eVar.a(i3, 1))) {
                eVar.b(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    public final int size() {
        return ((C0026a) this.f506b.f10d).f491d;
    }

    public final Object[] toArray() {
        e eVar = this.f506b;
        int i2 = ((C0026a) eVar.f10d).f491d;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = eVar.a(i3, 1);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f506b.h(objArr, 1);
    }
}
