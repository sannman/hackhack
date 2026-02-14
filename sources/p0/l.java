package p0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1141b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1142c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1143d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1144e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f1145a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<l> cls = l.class;
        f1141b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f1142c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f1143d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f1144e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1143d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f1142c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (hVar = (h) this.f1145a.getAndSet(i3, (Object) null)) != null) {
                if (hVar.f1130c.f34a == 1) {
                    f1144e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h b(int i2, boolean z2) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1145a;
        h hVar = (h) atomicReferenceArray.get(i3);
        if (hVar != null) {
            boolean z3 = true;
            if (hVar.f1130c.f34a != 1) {
                z3 = false;
            }
            if (z3 == z2) {
                while (!atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                    if (atomicReferenceArray.get(i3) != hVar) {
                    }
                }
                if (z2) {
                    f1144e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
