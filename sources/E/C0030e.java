package e;

import B.e;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: e.e  reason: case insensitive filesystem */
public final class C0030e implements Iterator, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public int f502a;

    /* renamed from: b  reason: collision with root package name */
    public int f503b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f504c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f505d;

    public C0030e(e eVar) {
        this.f505d = eVar;
        this.f502a = ((C0026a) eVar.f10d).f491d - 1;
        this.f503b = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f504c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i2 = this.f503b;
            e eVar = this.f505d;
            Object a2 = eVar.a(i2, 0);
            if (key != a2 && (key == null || !key.equals(a2))) {
                return false;
            }
            Object value = entry.getValue();
            Object a3 = eVar.a(this.f503b, 1);
            if (value == a3 || (value != null && value.equals(a3))) {
                return true;
            }
            return false;
        }
    }

    public final Object getKey() {
        if (this.f504c) {
            return this.f505d.a(this.f503b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f504c) {
            return this.f505d.a(this.f503b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        if (this.f503b < this.f502a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        if (this.f504c) {
            int i3 = this.f503b;
            e eVar = this.f505d;
            int i4 = 0;
            Object a2 = eVar.a(i3, 0);
            Object a3 = eVar.a(this.f503b, 1);
            if (a2 == null) {
                i2 = 0;
            } else {
                i2 = a2.hashCode();
            }
            if (a3 != null) {
                i4 = a3.hashCode();
            }
            return i2 ^ i4;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.f503b++;
            this.f504c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f504c) {
            this.f505d.b(this.f503b);
            this.f503b--;
            this.f502a--;
            this.f504c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f504c) {
            int i2 = (this.f503b << 1) + 1;
            Object[] objArr = ((C0026a) this.f505d.f10d).f490c;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
