package e;

import B.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: e.d  reason: case insensitive filesystem */
public final class C0029d implements Set {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f500b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f501c;

    public /* synthetic */ C0029d(e eVar, int i2) {
        this.f500b = i2;
        this.f501c = eVar;
    }

    public final boolean add(Object obj) {
        switch (this.f500b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.f500b) {
            case 0:
                e eVar = this.f501c;
                int i2 = ((C0026a) eVar.f10d).f491d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0026a) eVar.f10d).put(entry.getKey(), entry.getValue());
                }
                if (i2 != ((C0026a) eVar.f10d).f491d) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.f500b) {
            case 0:
                ((C0026a) this.f501c.f10d).clear();
                return;
            default:
                ((C0026a) this.f501c.f10d).clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.f500b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = this.f501c;
                int e2 = ((C0026a) eVar.f10d).e(key);
                if (e2 < 0) {
                    return false;
                }
                Object a2 = eVar.a(e2, 1);
                Object value = entry.getValue();
                if (a2 == value || (a2 != null && a2.equals(value))) {
                    return true;
                }
                return false;
            default:
                if (((C0026a) this.f501c.f10d).e(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    public final boolean containsAll(Collection collection) {
        switch (this.f500b) {
            case 0:
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            default:
                C0026a aVar = (C0026a) this.f501c.f10d;
                for (Object containsKey : collection) {
                    if (!aVar.containsKey(containsKey)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f500b) {
            case 0:
                return e.c(this, obj);
            default:
                return e.c(this, obj);
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        switch (this.f500b) {
            case 0:
                e eVar = this.f501c;
                int i5 = 0;
                for (int i6 = ((C0026a) eVar.f10d).f491d - 1; i6 >= 0; i6--) {
                    Object a2 = eVar.a(i6, 0);
                    Object a3 = eVar.a(i6, 1);
                    if (a2 == null) {
                        i2 = 0;
                    } else {
                        i2 = a2.hashCode();
                    }
                    if (a3 == null) {
                        i3 = 0;
                    } else {
                        i3 = a3.hashCode();
                    }
                    i5 += i2 ^ i3;
                }
                return i5;
            default:
                e eVar2 = this.f501c;
                int i7 = 0;
                for (int i8 = ((C0026a) eVar2.f10d).f491d - 1; i8 >= 0; i8--) {
                    Object a4 = eVar2.a(i8, 0);
                    if (a4 == null) {
                        i4 = 0;
                    } else {
                        i4 = a4.hashCode();
                    }
                    i7 += i4;
                }
                return i7;
        }
    }

    public final boolean isEmpty() {
        switch (this.f500b) {
            case 0:
                if (((C0026a) this.f501c.f10d).f491d == 0) {
                    return true;
                }
                return false;
            default:
                if (((C0026a) this.f501c.f10d).f491d == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Iterator iterator() {
        switch (this.f500b) {
            case 0:
                return new C0030e(this.f501c);
            default:
                return new C0028c(this.f501c, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.f500b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                e eVar = this.f501c;
                int e2 = ((C0026a) eVar.f10d).e(obj);
                if (e2 < 0) {
                    return false;
                }
                eVar.b(e2);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.f500b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0026a aVar = (C0026a) this.f501c.f10d;
                int size = aVar.size();
                for (Object remove : collection) {
                    aVar.remove(remove);
                }
                if (size != aVar.size()) {
                    return true;
                }
                return false;
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.f500b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0026a aVar = (C0026a) this.f501c.f10d;
                int size = aVar.size();
                Iterator it = aVar.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                if (size != aVar.size()) {
                    return true;
                }
                return false;
        }
    }

    public final int size() {
        switch (this.f500b) {
            case 0:
                return ((C0026a) this.f501c.f10d).f491d;
            default:
                return ((C0026a) this.f501c.f10d).f491d;
        }
    }

    public final Object[] toArray() {
        switch (this.f500b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                e eVar = this.f501c;
                int i2 = ((C0026a) eVar.f10d).f491d;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = eVar.a(i3, 0);
                }
                return objArr;
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.f500b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f501c.h(objArr, 0);
        }
    }
}
