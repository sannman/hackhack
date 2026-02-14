package o0;

import io.flutter.plugin.platform.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1057a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = C0087a.f1051a;

    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1057a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        c cVar = C0087a.f1051a;
        if (obj2 == cVar) {
            c c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == cVar) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != cVar) {
                            obj2 = atomicReferenceFieldUpdater.get(this);
                            break;
                        }
                    } else {
                        obj2 = c2;
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract c c(Object obj);
}
