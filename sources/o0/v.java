package o0;

import V.i;
import j0.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l0.e;
import l0.k;

public abstract class v extends d implements W {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1092d = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f1093c;
    private volatile int cleanedAndPointers;

    public v(long j2, k kVar, int i2) {
        super(kVar);
        this.f1093c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    public final boolean c() {
        if (f1092d.get(this) != f() || b() == null) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (f1092d.addAndGet(this, -65536) != f() || b() == null) {
            return false;
        }
        return true;
    }

    public abstract int f();

    public abstract void g(int i2, i iVar);

    public final void h() {
        if (f1092d.incrementAndGet(this) == e.f928b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1092d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
