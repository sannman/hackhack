package j0;

import V.i;
import io.flutter.plugin.platform.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.o;

public abstract class C extends D implements C0064w {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f813g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f814h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f815i;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    static {
        Class<C> cls = C.class;
        Class<Object> cls2 = Object.class;
        f813g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f814h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f815i = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    public final void c(i iVar, Runnable runnable) {
        n(runnable);
    }

    public void m() {
        a0.f843a.set((Object) null);
        f815i.set(this, 1);
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f813g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            c cVar = C0061t.f872b;
            if (obj != null) {
                if (!(obj instanceof o)) {
                    if (obj != cVar) {
                        o oVar = new o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            break loop0;
        }
        do {
        } while (p() <= 0);
        System.nanoTime();
        B b2 = (B) f814h.get(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r6 = j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (java.lang.Thread.currentThread() == r6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[LOOP:2: B:15:0x0038->B:18:0x0043, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.lang.Runnable r6) {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f813g
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f815i
            int r2 = r2.get(r5)
            if (r2 == 0) goto L_0x000f
            goto L_0x004a
        L_0x000f:
            if (r1 != 0) goto L_0x0020
        L_0x0011:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L_0x0019
            goto L_0x0066
        L_0x0019:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L_0x0011
            goto L_0x0000
        L_0x0020:
            boolean r2 = r1 instanceof o0.o
            r3 = 1
            if (r2 == 0) goto L_0x0046
            r2 = r1
            o0.o r2 = (o0.o) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0034
            r0 = 2
            if (r4 == r0) goto L_0x004a
            goto L_0x0000
        L_0x0034:
            o0.o r2 = r2.c()
        L_0x0038:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L_0x0038
            goto L_0x0000
        L_0x0046:
            io.flutter.plugin.platform.c r2 = j0.C0061t.f872b
            if (r1 != r2) goto L_0x0050
        L_0x004a:
            j0.u r0 = j0.C0062u.f880j
            r0.n(r6)
            return
        L_0x0050:
            o0.o r2 = new o0.o
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L_0x0060:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L_0x0074
        L_0x0066:
            java.lang.Thread r6 = r5.j()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L_0x0073
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x0073:
            return
        L_0x0074:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L_0x0060
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C.n(java.lang.Runnable):void");
    }

    public final boolean o() {
        boolean z2;
        U.c cVar = this.f818f;
        if (cVar != null) {
            z2 = cVar.isEmpty();
        } else {
            z2 = true;
        }
        if (z2) {
            B b2 = (B) f814h.get(this);
            Object obj = f813g.get(this);
            if (obj != null) {
                if (obj instanceof o) {
                    long j2 = o.f1083f.get((o) obj);
                    if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (obj == C0061t.f872b) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[LOOP:1: B:11:0x0033->B:14:0x003e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long p() {
        /*
            r9 = this;
            boolean r0 = r9.l()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            goto L_0x0099
        L_0x000a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f814h
            java.lang.Object r0 = r0.get(r9)
            j0.B r0 = (j0.B) r0
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f813g
            java.lang.Object r3 = r0.get(r9)
            r4 = 0
            if (r3 != 0) goto L_0x001c
            goto L_0x004f
        L_0x001c:
            boolean r5 = r3 instanceof o0.o
            if (r5 == 0) goto L_0x0041
            r4 = r3
            o0.o r4 = (o0.o) r4
            java.lang.Object r5 = r4.d()
            io.flutter.plugin.platform.c r6 = o0.o.f1084g
            if (r5 == r6) goto L_0x002f
            r4 = r5
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x004f
        L_0x002f:
            o0.o r5 = r4.c()
        L_0x0033:
            boolean r4 = r0.compareAndSet(r9, r3, r5)
            if (r4 == 0) goto L_0x003a
            goto L_0x0012
        L_0x003a:
            java.lang.Object r4 = r0.get(r9)
            if (r4 == r3) goto L_0x0033
            goto L_0x0012
        L_0x0041:
            io.flutter.plugin.platform.c r5 = j0.C0061t.f872b
            if (r3 != r5) goto L_0x0046
            goto L_0x004f
        L_0x0046:
            boolean r5 = r0.compareAndSet(r9, r3, r4)
            if (r5 == 0) goto L_0x00a3
            r4 = r3
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x004f:
            if (r4 == 0) goto L_0x0055
            r4.run()
            return r1
        L_0x0055:
            U.c r0 = r9.f818f
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x0060
        L_0x005e:
            r5 = r3
            goto L_0x0068
        L_0x0060:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0067
            goto L_0x005e
        L_0x0067:
            r5 = r1
        L_0x0068:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            goto L_0x0099
        L_0x006d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f813g
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L_0x009a
            boolean r5 = r0 instanceof o0.o
            if (r5 == 0) goto L_0x0094
            o0.o r0 = (o0.o) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = o0.o.f1083f
            long r5 = r5.get(r0)
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r5
            int r0 = (int) r7
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r7
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
            if (r0 != r5) goto L_0x0093
            goto L_0x009a
        L_0x0093:
            return r1
        L_0x0094:
            io.flutter.plugin.platform.c r5 = j0.C0061t.f872b
            if (r0 != r5) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            return r1
        L_0x009a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f814h
            java.lang.Object r0 = r0.get(r9)
            j0.B r0 = (j0.B) r0
        L_0x00a2:
            return r3
        L_0x00a3:
            java.lang.Object r5 = r0.get(r9)
            if (r5 == r3) goto L_0x0046
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C.p():long");
    }
}
