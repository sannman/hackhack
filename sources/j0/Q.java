package j0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class Q implements H {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f831c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f832d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f833e;
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: b  reason: collision with root package name */
    public final U f834b;

    static {
        Class<Q> cls = Q.class;
        f831c = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
        Class<Object> cls2 = Object.class;
        f832d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
        f833e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
    }

    public Q(U u, Throwable th) {
        this.f834b = u;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable d2 = d();
        if (d2 == null) {
            f832d.set(this, th);
        } else if (th != d2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f833e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final boolean b() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public final U c() {
        return this.f834b;
    }

    public final Throwable d() {
        return (Throwable) f832d.get(this);
    }

    public final boolean e() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (f831c.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f833e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable d2 = d();
        if (d2 != null) {
            arrayList.add(0, d2);
        }
        if (th != null && !th.equals(d2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, C0061t.f877g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f833e.get(this) + ", list=" + this.f834b + ']';
    }
}
