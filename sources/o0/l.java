package o0;

import d0.h;
import j0.C0061t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class l {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1077b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1078c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1079d;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    static {
        Class<l> cls = l.class;
        Class<Object> cls2 = Object.class;
        f1077b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f1078c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f1079d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r6 = ((o0.s) r6).f1090a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r5.get(r4) == r3) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o0.l i() {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1078c
            java.lang.Object r1 = r0.get(r9)
            o0.l r1 = (o0.l) r1
            r2 = 0
            r3 = r1
        L_0x000a:
            r4 = r2
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f1077b
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L_0x0024
            if (r1 != r3) goto L_0x0016
            goto L_0x002d
        L_0x0016:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L_0x0016
            goto L_0x0000
        L_0x0024:
            boolean r7 = r9.m()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r6 != 0) goto L_0x002e
        L_0x002d:
            return r3
        L_0x002e:
            boolean r7 = r6 instanceof o0.r
            if (r7 == 0) goto L_0x0038
            o0.r r6 = (o0.r) r6
            r6.a(r3)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r6 instanceof o0.s
            if (r7 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0051
            o0.s r6 = (o0.s) r6
            o0.l r6 = r6.f1090a
        L_0x0042:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L_0x004a
            r3 = r4
            goto L_0x000a
        L_0x004a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L_0x0042
            goto L_0x0000
        L_0x0051:
            java.lang.Object r3 = r0.get(r3)
            o0.l r3 = (o0.l) r3
            goto L_0x000b
        L_0x0058:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            d0.h.c(r6, r4)
            r4 = r6
            o0.l r4 = (o0.l) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l.i():o0.l");
    }

    public final void j(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1078c;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() == lVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                        if (m()) {
                            lVar.i();
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f1077b.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l l() {
        s sVar;
        l lVar;
        Object k2 = k();
        if (k2 instanceof s) {
            sVar = (s) k2;
        } else {
            sVar = null;
        }
        if (sVar != null && (lVar = sVar.f1090a) != null) {
            return lVar;
        }
        h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (l) k2;
    }

    public boolean m() {
        return k() instanceof s;
    }

    public String toString() {
        return new k(this) + '@' + C0061t.a(this);
    }
}
