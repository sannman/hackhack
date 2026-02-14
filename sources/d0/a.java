package d0;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f465a;

    /* renamed from: b  reason: collision with root package name */
    public int f466b;

    public a(Object[] objArr) {
        this.f465a = objArr;
    }

    public final boolean hasNext() {
        if (this.f466b < this.f465a.length) {
            return true;
        }
        return false;
    }

    public final Object next() {
        try {
            Object[] objArr = this.f465a;
            int i2 = this.f466b;
            this.f466b = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f466b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
