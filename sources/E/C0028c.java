package e;

import B.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.c  reason: case insensitive filesystem */
public final class C0028c implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f495a;

    /* renamed from: b  reason: collision with root package name */
    public int f496b;

    /* renamed from: c  reason: collision with root package name */
    public int f497c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f498d = false;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f499e;

    public C0028c(e eVar, int i2) {
        this.f499e = eVar;
        this.f495a = i2;
        this.f496b = ((C0026a) eVar.f10d).f491d;
    }

    public final boolean hasNext() {
        if (this.f497c < this.f496b) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            Object a2 = this.f499e.a(this.f497c, this.f495a);
            this.f497c++;
            this.f498d = true;
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f498d) {
            int i2 = this.f497c - 1;
            this.f497c = i2;
            this.f496b--;
            this.f498d = false;
            this.f499e.b(i2);
            return;
        }
        throw new IllegalStateException();
    }
}
