package U;

import d0.a;
import d0.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class b implements Collection {

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f357b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f358c;

    public b(Object[] objArr, boolean z2) {
        this.f357b = objArr;
        this.f358c = z2;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        int i2;
        Object[] objArr = this.f357b;
        h.e(objArr, "<this>");
        if (obj != null) {
            int length = objArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (obj.equals(objArr[i3])) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            int length2 = objArr.length;
            i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (objArr[i2] == null) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        h.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f357b.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new a(this.f357b);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f357b.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f357b;
        Class<Object[]> cls = Object[].class;
        if (this.f358c && objArr.getClass().equals(cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        return h.h(this, objArr);
    }
}
