package l0;

import T.g;
import V.d;
import a.a;
import c0.l;
import d0.h;
import d0.n;
import j0.C0046d;
import j0.C0047e;
import j0.d0;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.C0087a;
import o0.q;
import o0.v;

public class c implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f916c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f917d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f918e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f919f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f920g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f921h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f922i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f923j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f924k;
    private volatile Object _closeCause;

    /* renamed from: b  reason: collision with root package name */
    public final int f925b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    static {
        Class<c> cls = c.class;
        f916c = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        f917d = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        f918e = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        f919f = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        f920g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        f921h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        f922i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        f923j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        f924k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public c(int i2) {
        long j2;
        this.f925b = i2;
        if (i2 >= 0) {
            k kVar = e.f927a;
            if (i2 == 0) {
                j2 = 0;
            } else if (i2 != Integer.MAX_VALUE) {
                j2 = (long) i2;
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.bufferEnd = j2;
            this.completedExpandBuffersAndPauseFlag = f918e.get(this);
            k kVar2 = new k(0, (k) null, this, 3);
            this.sendSegment = kVar2;
            this.receiveSegment = kVar2;
            if (r()) {
                kVar2 = e.f927a;
                h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = kVar2;
            this._closeCause = e.f944s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
    }

    public static final k b(c cVar, long j2, k kVar) {
        Object a2;
        c cVar2;
        cVar.getClass();
        k kVar2 = e.f927a;
        d dVar = d.f926j;
        loop0:
        while (true) {
            a2 = C0087a.a(j2, kVar);
            if (C0087a.d(a2)) {
                break;
            }
            v b2 = C0087a.b(a2);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f920g;
                v vVar = (v) atomicReferenceFieldUpdater.get(cVar);
                if (vVar.f1093c >= b2.f1093c) {
                    break loop0;
                } else if (b2.i()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            }
        }
        boolean d2 = C0087a.d(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f917d;
        if (d2) {
            cVar.p();
            if (kVar.f1093c * ((long) e.f928b) < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) C0087a.b(a2);
            long j3 = kVar3.f1093c;
            if (j3 <= j2) {
                return kVar3;
            }
            long j4 = ((long) e.f928b) * j3;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f916c;
                long j5 = atomicLongFieldUpdater2.get(cVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (atomicLongFieldUpdater2.compareAndSet(cVar2, j5, j6 + (((long) ((int) (j5 >> 60))) << 60))) {
                    break;
                }
                cVar = cVar2;
            }
            if (j3 * ((long) e.f928b) < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final int c(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        cVar.getClass();
        kVar.m(i2, obj);
        if (z2) {
            return cVar.x(kVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.d(j2)) {
                if (kVar.j(i2, (Object) null, e.f930d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kVar.j(i2, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof d0) {
            kVar.m(i2, (Object) null);
            if (cVar.u(k2, obj)) {
                kVar.n(i2, e.f935i);
                return 0;
            }
            io.flutter.plugin.platform.c cVar2 = e.f937k;
            if (kVar.f951f.getAndSet((i2 * 2) + 1, cVar2) == cVar2) {
                return 5;
            }
            kVar.l(i2, true);
            return 5;
        }
        return cVar.x(kVar, i2, obj, j2, obj2, z2);
    }

    public static void n(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f919f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean v(Object obj) {
        if (obj instanceof C0046d) {
            h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((C0046d) obj, g.f356a, (q) null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean d(long j2) {
        if (j2 < f918e.get(this) || j2 < f917d.get(this) + ((long) this.f925b)) {
            return true;
        }
        return false;
    }

    public final boolean e(Throwable th, boolean z2) {
        c cVar;
        boolean z3;
        Object obj;
        io.flutter.plugin.platform.c cVar2;
        long j2;
        long j3;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f916c;
        if (z2) {
            while (true) {
                long j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f927a;
                cVar = this;
                if (atomicLongFieldUpdater.compareAndSet(cVar, j6, (j6 & 1152921504606846975L) + (((long) 1) << 60))) {
                    break;
                }
            }
        }
        cVar = this;
        io.flutter.plugin.platform.c cVar3 = e.f944s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f923j;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, cVar3, th)) {
                if (atomicReferenceFieldUpdater.get(this) != cVar3) {
                    z3 = false;
                    break;
                }
            } else {
                z3 = true;
                break;
            }
        }
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = (long) 2;
                } else if (i2 != 1) {
                    break;
                } else {
                    j3 = j2 & 1152921504606846975L;
                    j4 = (long) 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j2, (j4 << 60) + j3));
        }
        p();
        if (z3) {
            loop4:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f924k;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    cVar2 = e.f942q;
                } else {
                    cVar2 = e.f943r;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, cVar2)) {
                        break loop4;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
            }
            if (obj != null) {
                n.a(1, obj);
                ((l) obj).g(k());
                return z3;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r1 = (l0.k) ((o0.d) o0.d.f1060b.get(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l0.k f(long r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f922i
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f920g
            java.lang.Object r1 = r1.get(r12)
            l0.k r1 = (l0.k) r1
            long r2 = r1.f1093c
            r4 = r0
            l0.k r4 = (l0.k) r4
            long r4 = r4.f1093c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f921h
            java.lang.Object r1 = r1.get(r12)
            l0.k r1 = (l0.k) r1
            long r2 = r1.f1093c
            r4 = r0
            l0.k r4 = (l0.k) r4
            long r4 = r4.f1093c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            o0.d r0 = (o0.d) r0
        L_0x0030:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o0.d.f1059a
            java.lang.Object r1 = r1.get(r0)
            io.flutter.plugin.platform.c r2 = o0.C0087a.f1052b
            r3 = 0
            if (r1 != r2) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            o0.d r1 = (o0.d) r1
            if (r1 != 0) goto L_0x0131
        L_0x0043:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o0.d.f1059a
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L_0x0129
        L_0x004b:
            l0.k r0 = (l0.k) r0
            boolean r1 = r12.q()
            r2 = -1
            r4 = 1
            if (r1 == 0) goto L_0x00a3
            r1 = r0
        L_0x0056:
            int r5 = l0.e.f928b
            int r5 = r5 - r4
        L_0x0059:
            r6 = -1
            if (r2 >= r5) goto L_0x008f
            int r8 = l0.e.f928b
            long r8 = (long) r8
            long r10 = r1.f1093c
            long r10 = r10 * r8
            long r8 = (long) r5
            long r10 = r10 + r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f917d
            long r8 = r8.get(r12)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0071
        L_0x006f:
            r10 = r6
            goto L_0x009c
        L_0x0071:
            java.lang.Object r8 = r1.k(r5)
            if (r8 == 0) goto L_0x0081
            io.flutter.plugin.platform.c r9 = l0.e.f931e
            if (r8 != r9) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            io.flutter.plugin.platform.c r9 = l0.e.f930d
            if (r8 != r9) goto L_0x008c
            goto L_0x009c
        L_0x0081:
            io.flutter.plugin.platform.c r9 = l0.e.f938l
            boolean r8 = r1.j(r5, r8, r9)
            if (r8 == 0) goto L_0x0071
            r1.h()
        L_0x008c:
            int r5 = r5 + -1
            goto L_0x0059
        L_0x008f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o0.d.f1060b
            java.lang.Object r1 = r5.get(r1)
            o0.d r1 = (o0.d) r1
            l0.k r1 = (l0.k) r1
            if (r1 != 0) goto L_0x0056
            goto L_0x006f
        L_0x009c:
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a3
            r12.g(r10)
        L_0x00a3:
            r1 = r0
        L_0x00a4:
            if (r1 == 0) goto L_0x0107
            int r5 = l0.e.f928b
            int r5 = r5 - r4
        L_0x00a9:
            if (r2 >= r5) goto L_0x00fc
            int r6 = l0.e.f928b
            long r6 = (long) r6
            long r8 = r1.f1093c
            long r8 = r8 * r6
            long r6 = (long) r5
            long r8 = r8 + r6
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0107
        L_0x00b7:
            java.lang.Object r6 = r1.k(r5)
            if (r6 == 0) goto L_0x00ee
            io.flutter.plugin.platform.c r7 = l0.e.f931e
            if (r6 != r7) goto L_0x00c2
            goto L_0x00ee
        L_0x00c2:
            boolean r7 = r6 instanceof l0.u
            if (r7 == 0) goto L_0x00da
            io.flutter.plugin.platform.c r7 = l0.e.f938l
            boolean r7 = r1.j(r5, r6, r7)
            if (r7 == 0) goto L_0x00b7
            l0.u r6 = (l0.u) r6
            j0.d0 r6 = r6.f958a
            java.lang.Object r3 = o0.C0087a.e(r3, r6)
            r1.l(r5, r4)
            goto L_0x00f9
        L_0x00da:
            boolean r7 = r6 instanceof j0.d0
            if (r7 == 0) goto L_0x00f9
            io.flutter.plugin.platform.c r7 = l0.e.f938l
            boolean r7 = r1.j(r5, r6, r7)
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r3 = o0.C0087a.e(r3, r6)
            r1.l(r5, r4)
            goto L_0x00f9
        L_0x00ee:
            io.flutter.plugin.platform.c r7 = l0.e.f938l
            boolean r6 = r1.j(r5, r6, r7)
            if (r6 == 0) goto L_0x00b7
            r1.h()
        L_0x00f9:
            int r5 = r5 + -1
            goto L_0x00a9
        L_0x00fc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o0.d.f1060b
            java.lang.Object r1 = r5.get(r1)
            o0.d r1 = (o0.d) r1
            l0.k r1 = (l0.k) r1
            goto L_0x00a4
        L_0x0107:
            if (r3 == 0) goto L_0x0128
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x0113
            j0.d0 r3 = (j0.d0) r3
            r12.t(r3, r4)
            return r0
        L_0x0113:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r4
        L_0x011a:
            if (r2 >= r13) goto L_0x0128
            java.lang.Object r14 = r3.get(r13)
            j0.d0 r14 = (j0.d0) r14
            r12.t(r14, r4)
            int r13 = r13 + -1
            goto L_0x011a
        L_0x0128:
            return r0
        L_0x0129:
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0043
            goto L_0x0030
        L_0x0131:
            r0 = r1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.f(long):l0.k");
    }

    public final void g(long j2) {
        k kVar = (k) f921h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f917d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 >= Math.max(((long) this.f925b) + j3, f918e.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                    long j4 = (long) e.f928b;
                    long j5 = j3 / j4;
                    int i2 = (int) (j3 % j4);
                    if (kVar.f1093c != j5) {
                        k i3 = i(j5, kVar);
                        if (i3 != null) {
                            kVar = i3;
                        }
                    }
                    long j6 = j3;
                    k kVar2 = kVar;
                    if (w(kVar2, i2, j6, (a) null) != e.f940o) {
                        kVar2.a();
                    } else if (j6 < m()) {
                        kVar2.a();
                    }
                    kVar = kVar2;
                }
            } else {
                return;
            }
        }
    }

    public final void h() {
        Object a2;
        if (!r()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922i;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            loop0:
            while (true) {
                long andIncrement = f918e.getAndIncrement(this);
                long j2 = andIncrement / ((long) e.f928b);
                if (m() <= andIncrement) {
                    if (kVar.f1093c < j2 && kVar.b() != null) {
                        s(j2, kVar);
                    }
                    n(this);
                    return;
                }
                if (kVar.f1093c != j2) {
                    d dVar = d.f926j;
                    while (true) {
                        a2 = C0087a.a(j2, kVar);
                        if (C0087a.d(a2)) {
                            break;
                        }
                        v b2 = C0087a.b(a2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f1093c >= b2.f1093c) {
                                break;
                            } else if (b2.i()) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                                    if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                        if (b2.e()) {
                                            b2.d();
                                        }
                                    }
                                }
                                if (vVar.e()) {
                                    vVar.d();
                                }
                            }
                        }
                    }
                    k kVar2 = null;
                    if (C0087a.d(a2)) {
                        p();
                        s(j2, kVar);
                        n(this);
                    } else {
                        k kVar3 = (k) C0087a.b(a2);
                        long j3 = kVar3.f1093c;
                        if (j3 > j2) {
                            long j4 = j3 * ((long) e.f928b);
                            if (f918e.compareAndSet(this, 1 + andIncrement, j4)) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater = f919f;
                                if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                    do {
                                    } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                                }
                            } else {
                                n(this);
                            }
                        } else {
                            kVar2 = kVar3;
                        }
                    }
                    if (kVar2 == null) {
                        continue;
                    } else {
                        kVar = kVar2;
                    }
                }
                int i2 = (int) (andIncrement % ((long) e.f928b));
                Object k2 = kVar.k(i2);
                boolean z2 = k2 instanceof d0;
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f917d;
                if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f933g)) {
                    while (true) {
                        Object k3 = kVar.k(i2);
                        if (!(k3 instanceof d0)) {
                            if (k3 != e.f936j) {
                                if (k3 != null) {
                                    if (k3 == e.f930d || k3 == e.f934h || k3 == e.f935i || k3 == e.f937k || k3 == e.f938l) {
                                        break loop0;
                                    } else if (k3 != e.f932f) {
                                        throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                    }
                                } else if (kVar.j(i2, k3, e.f931e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.j(i2, k3, new u((d0) k3))) {
                                break loop0;
                            }
                        } else if (kVar.j(i2, k3, e.f933g)) {
                            if (v(k3)) {
                                kVar.n(i2, e.f930d);
                                break;
                            } else {
                                kVar.n(i2, e.f936j);
                                kVar.h();
                            }
                        }
                    }
                } else if (v(k2)) {
                    kVar.n(i2, e.f930d);
                    break;
                } else {
                    kVar.n(i2, e.f936j);
                    kVar.h();
                }
                n(this);
            }
            n(this);
        }
    }

    public final k i(long j2, k kVar) {
        Object a2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        k kVar2 = e.f927a;
        d dVar = d.f926j;
        loop0:
        while (true) {
            a2 = C0087a.a(j2, kVar);
            if (C0087a.d(a2)) {
                break;
            }
            v b2 = C0087a.b(a2);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f921h;
                v vVar = (v) atomicReferenceFieldUpdater.get(this);
                if (vVar.f1093c >= b2.f1093c) {
                    break loop0;
                } else if (b2.i()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            }
        }
        if (C0087a.d(a2)) {
            p();
            if (kVar.f1093c * ((long) e.f928b) < m()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) C0087a.b(a2);
            boolean r2 = r();
            long j4 = kVar3.f1093c;
            if (!r2 && j2 <= f918e.get(this) / ((long) e.f928b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f922i;
                    v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                    if (vVar2.f1093c >= j4 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (vVar2.e()) {
                        vVar2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return kVar3;
            }
            long j5 = j4 * ((long) e.f928b);
            do {
                atomicLongFieldUpdater = f917d;
                j3 = atomicLongFieldUpdater.get(this);
                if (j3 >= j5 || atomicLongFieldUpdater.compareAndSet(this, j3, j5)) {
                }
                atomicLongFieldUpdater = f917d;
                j3 = atomicLongFieldUpdater.get(this);
                break;
            } while (atomicLongFieldUpdater.compareAndSet(this, j3, j5));
            if (j4 * ((long) e.f928b) < m()) {
                kVar3.a();
            }
        }
        return null;
    }

    public Object j(Object obj) {
        boolean z2;
        d0 d0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f916c;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z3 = false;
        long j3 = 1152921504606846975L;
        if (o(j2, false)) {
            z2 = false;
        } else {
            z2 = !d(j2 & 1152921504606846975L);
        }
        i iVar = j.f949a;
        if (z2) {
            return iVar;
        }
        io.flutter.plugin.platform.c cVar = e.f936j;
        k kVar = (k) f920g.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean o2 = o(andIncrement, z3);
            int i2 = e.f928b;
            long j5 = (long) i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (kVar.f1093c != j6) {
                k b2 = b(this, j6, kVar);
                if (b2 != null) {
                    kVar = b2;
                } else if (o2) {
                    return new h(l());
                } else {
                    z3 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int c2 = c(this, kVar, i3, obj, j4, cVar, o2);
            g gVar = g.f356a;
            if (c2 == 0) {
                kVar.a();
                return gVar;
            } else if (c2 == 1) {
                return gVar;
            } else {
                if (c2 != 2) {
                    if (c2 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (c2 != 4) {
                        if (c2 == 5) {
                            kVar.a();
                        }
                        z3 = false;
                        j3 = 1152921504606846975L;
                    } else {
                        if (j4 < f917d.get(this)) {
                            kVar.a();
                        }
                        return new h(l());
                    }
                } else if (o2) {
                    kVar.h();
                    return new h(l());
                } else {
                    if (cVar instanceof d0) {
                        d0Var = (d0) cVar;
                    } else {
                        d0Var = null;
                    }
                    if (d0Var != null) {
                        d0Var.a(kVar, i3 + i2);
                    }
                    kVar.h();
                    return iVar;
                }
            }
        }
    }

    public final Throwable k() {
        return (Throwable) f923j.get(this);
    }

    public final Throwable l() {
        Throwable k2 = k();
        if (k2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return k2;
    }

    public final long m() {
        return f916c.get(this) & 1152921504606846975L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        r0 = (l0.k) ((o0.d) o0.d.f1060b.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(long r15, boolean r17) {
        /*
            r14 = this;
            r0 = 60
            long r0 = r15 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 == 0) goto L_0x0177
            r2 = 1
            if (r0 == r2) goto L_0x0177
            r3 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f917d
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r3) goto L_0x00e8
            r3 = 3
            if (r0 != r3) goto L_0x00d0
            long r5 = r5 & r15
            l0.k r0 = r14.f(r5)
            r3 = 0
            r5 = r3
        L_0x001f:
            int r6 = l0.e.f928b
            int r6 = r6 - r2
        L_0x0022:
            r7 = -1
            if (r7 >= r6) goto L_0x00a2
            int r8 = l0.e.f928b
            long r8 = (long) r8
            long r10 = r0.f1093c
            long r10 = r10 * r8
            long r8 = (long) r6
            long r10 = r10 + r8
        L_0x002d:
            java.lang.Object r8 = r0.k(r6)
            io.flutter.plugin.platform.c r9 = l0.e.f935i
            if (r8 == r9) goto L_0x00ae
            io.flutter.plugin.platform.c r9 = l0.e.f930d
            if (r8 != r9) goto L_0x0050
            long r12 = r4.get(r14)
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x00ae
            io.flutter.plugin.platform.c r9 = l0.e.f938l
            boolean r8 = r0.j(r6, r8, r9)
            if (r8 == 0) goto L_0x002d
            r0.m(r6, r3)
            r0.h()
            goto L_0x009f
        L_0x0050:
            io.flutter.plugin.platform.c r9 = l0.e.f931e
            if (r8 == r9) goto L_0x0094
            if (r8 != 0) goto L_0x0057
            goto L_0x0094
        L_0x0057:
            boolean r9 = r8 instanceof j0.d0
            if (r9 != 0) goto L_0x006c
            boolean r9 = r8 instanceof l0.u
            if (r9 == 0) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            io.flutter.plugin.platform.c r9 = l0.e.f933g
            if (r8 == r9) goto L_0x00ae
            io.flutter.plugin.platform.c r12 = l0.e.f932f
            if (r8 != r12) goto L_0x0069
            goto L_0x00ae
        L_0x0069:
            if (r8 == r9) goto L_0x002d
            goto L_0x009f
        L_0x006c:
            long r12 = r4.get(r14)
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x00ae
            boolean r9 = r8 instanceof l0.u
            if (r9 == 0) goto L_0x007e
            r9 = r8
            l0.u r9 = (l0.u) r9
            j0.d0 r9 = r9.f958a
            goto L_0x0081
        L_0x007e:
            r9 = r8
            j0.d0 r9 = (j0.d0) r9
        L_0x0081:
            io.flutter.plugin.platform.c r12 = l0.e.f938l
            boolean r8 = r0.j(r6, r8, r12)
            if (r8 == 0) goto L_0x002d
            java.lang.Object r5 = o0.C0087a.e(r5, r9)
            r0.m(r6, r3)
            r0.h()
            goto L_0x009f
        L_0x0094:
            io.flutter.plugin.platform.c r9 = l0.e.f938l
            boolean r8 = r0.j(r6, r8, r9)
            if (r8 == 0) goto L_0x002d
            r0.h()
        L_0x009f:
            int r6 = r6 + -1
            goto L_0x0022
        L_0x00a2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = o0.d.f1060b
            java.lang.Object r0 = r6.get(r0)
            o0.d r0 = (o0.d) r0
            l0.k r0 = (l0.k) r0
            if (r0 != 0) goto L_0x001f
        L_0x00ae:
            if (r5 == 0) goto L_0x0176
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x00bb
            j0.d0 r5 = (j0.d0) r5
            r14.t(r5, r1)
            goto L_0x0176
        L_0x00bb:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            int r0 = r0 - r2
        L_0x00c2:
            if (r7 >= r0) goto L_0x0176
            java.lang.Object r3 = r5.get(r0)
            j0.d0 r3 = (j0.d0) r3
            r14.t(r3, r1)
            int r0 = r0 + -1
            goto L_0x00c2
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unexpected close status: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00e8:
            long r5 = r5 & r15
            r14.f(r5)
            if (r17 == 0) goto L_0x0176
        L_0x00ee:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f921h
            java.lang.Object r3 = r0.get(r14)
            l0.k r3 = (l0.k) r3
            long r7 = r4.get(r14)
            long r5 = r14.m()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0104
            goto L_0x0176
        L_0x0104:
            int r5 = l0.e.f928b
            long r5 = (long) r5
            long r9 = r7 / r5
            long r11 = r3.f1093c
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0122
            l0.k r3 = r14.i(r9, r3)
            if (r3 != 0) goto L_0x0122
            java.lang.Object r0 = r0.get(r14)
            l0.k r0 = (l0.k) r0
            long r5 = r0.f1093c
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ee
            goto L_0x0176
        L_0x0122:
            r3.a()
            long r5 = r7 % r5
            int r0 = (int) r5
        L_0x0128:
            java.lang.Object r5 = r3.k(r0)
            if (r5 == 0) goto L_0x015f
            io.flutter.plugin.platform.c r6 = l0.e.f931e
            if (r5 != r6) goto L_0x0133
            goto L_0x015f
        L_0x0133:
            io.flutter.plugin.platform.c r0 = l0.e.f930d
            if (r5 != r0) goto L_0x0138
            goto L_0x0177
        L_0x0138:
            io.flutter.plugin.platform.c r0 = l0.e.f936j
            if (r5 != r0) goto L_0x013d
            goto L_0x016a
        L_0x013d:
            io.flutter.plugin.platform.c r0 = l0.e.f938l
            if (r5 != r0) goto L_0x0142
            goto L_0x016a
        L_0x0142:
            io.flutter.plugin.platform.c r0 = l0.e.f935i
            if (r5 != r0) goto L_0x0147
            goto L_0x016a
        L_0x0147:
            io.flutter.plugin.platform.c r0 = l0.e.f934h
            if (r5 != r0) goto L_0x014c
            goto L_0x016a
        L_0x014c:
            io.flutter.plugin.platform.c r0 = l0.e.f933g
            if (r5 != r0) goto L_0x0151
            goto L_0x0177
        L_0x0151:
            io.flutter.plugin.platform.c r0 = l0.e.f932f
            if (r5 != r0) goto L_0x0156
            goto L_0x016a
        L_0x0156:
            long r5 = r4.get(r14)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x016a
            goto L_0x0177
        L_0x015f:
            io.flutter.plugin.platform.c r6 = l0.e.f934h
            boolean r5 = r3.j(r0, r5, r6)
            if (r5 == 0) goto L_0x0128
            r14.h()
        L_0x016a:
            r5 = 1
            long r9 = r7 + r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = f917d
            r6 = r14
            r5.compareAndSet(r6, r7, r9)
            goto L_0x00ee
        L_0x0176:
            return r2
        L_0x0177:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.o(long, boolean):boolean");
    }

    public final boolean p() {
        return o(f916c.get(this), false);
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f918e.get(this);
        if (j2 == 0 || j2 == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final void s(long j2, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f1093c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922i;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1093c < kVar.f1093c) {
                        if (!kVar.i()) {
                            continue;
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, kVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                if (kVar.e()) {
                                    kVar.d();
                                }
                            }
                        }
                        if (vVar.e()) {
                            vVar.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final void t(d0 d0Var, boolean z2) {
        Throwable th;
        if (d0Var instanceof C0046d) {
            d dVar = (d) d0Var;
            if (z2) {
                th = k();
                if (th == null) {
                    th = new NoSuchElementException("Channel was closed");
                }
            } else {
                th = l();
            }
            dVar.c(a.g(th));
        } else if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            C0047e eVar = aVar.f914c;
            h.b(eVar);
            aVar.f914c = null;
            aVar.f913b = e.f938l;
            Throwable k2 = aVar.f915d.k();
            if (k2 == null) {
                eVar.c(Boolean.FALSE);
            } else {
                eVar.c(a.g(k2));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + d0Var).toString());
        }
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [o0.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01af, code lost:
        r16 = r7;
        r3 = r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b8, code lost:
        if (r3 != null) goto L_0x01eb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f916c
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 2
            r4 = 3
            if (r2 == r3) goto L_0x001e
            if (r2 == r4) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.f925b
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            l0.k[] r2 = new l0.k[r4]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f921h
            java.lang.Object r4 = r4.get(r0)
            r6 = 0
            r2[r6] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f920g
            java.lang.Object r4 = r4.get(r0)
            r7 = 1
            r2[r7] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f922i
            java.lang.Object r4 = r4.get(r0)
            r2[r3] = r4
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r3 = "asList(...)"
            d0.h.d(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r2.next()
            r8 = r4
            l0.k r8 = (l0.k) r8
            l0.k r9 = l0.e.f927a
            if (r8 == r9) goto L_0x006e
            r3.add(r4)
            goto L_0x006e
        L_0x0083:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f0
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0098
            goto L_0x00b2
        L_0x0098:
            r4 = r3
            l0.k r4 = (l0.k) r4
            long r8 = r4.f1093c
        L_0x009d:
            java.lang.Object r4 = r2.next()
            r10 = r4
            l0.k r10 = (l0.k) r10
            long r10 = r10.f1093c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ac
            r3 = r4
            r8 = r10
        L_0x00ac:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009d
        L_0x00b2:
            l0.k r3 = (l0.k) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f917d
            long r10 = r2.get(r0)
            long r12 = r0.m()
        L_0x00be:
            int r2 = l0.e.f928b
            r4 = r6
        L_0x00c1:
            if (r4 >= r2) goto L_0x01af
            long r8 = r3.f1093c
            int r14 = l0.e.f928b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d8
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            r16 = r7
            goto L_0x01ba
        L_0x00d8:
            java.lang.Object r15 = r3.k(r4)
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r3.f951f
            r16 = r7
            int r7 = r4 * 2
            java.lang.Object r6 = r6.get(r7)
            boolean r7 = r15 instanceof j0.C0046d
            if (r7 == 0) goto L_0x0100
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f4
            if (r14 < 0) goto L_0x00f4
            java.lang.String r7 = "receive"
            goto L_0x0177
        L_0x00f4:
            if (r14 >= 0) goto L_0x00fc
            if (r7 < 0) goto L_0x00fc
            java.lang.String r7 = "send"
            goto L_0x0177
        L_0x00fc:
            java.lang.String r7 = "cont"
            goto L_0x0177
        L_0x0100:
            boolean r7 = r15 instanceof l0.u
            if (r7 == 0) goto L_0x0119
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r7.<init>(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0177
        L_0x0119:
            io.flutter.plugin.platform.c r7 = l0.e.f932f
            boolean r7 = d0.h.a(r15, r7)
            if (r7 == 0) goto L_0x0124
            r7 = r16
            goto L_0x012a
        L_0x0124:
            io.flutter.plugin.platform.c r7 = l0.e.f933g
            boolean r7 = d0.h.a(r15, r7)
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            java.lang.String r7 = "resuming_sender"
            goto L_0x0177
        L_0x012f:
            if (r15 != 0) goto L_0x0134
            r7 = r16
            goto L_0x013a
        L_0x0134:
            io.flutter.plugin.platform.c r7 = l0.e.f931e
            boolean r7 = r15.equals(r7)
        L_0x013a:
            if (r7 == 0) goto L_0x013f
            r7 = r16
            goto L_0x0145
        L_0x013f:
            io.flutter.plugin.platform.c r7 = l0.e.f935i
            boolean r7 = d0.h.a(r15, r7)
        L_0x0145:
            if (r7 == 0) goto L_0x014a
            r7 = r16
            goto L_0x0150
        L_0x014a:
            io.flutter.plugin.platform.c r7 = l0.e.f934h
            boolean r7 = d0.h.a(r15, r7)
        L_0x0150:
            if (r7 == 0) goto L_0x0155
            r7 = r16
            goto L_0x015b
        L_0x0155:
            io.flutter.plugin.platform.c r7 = l0.e.f937k
            boolean r7 = d0.h.a(r15, r7)
        L_0x015b:
            if (r7 == 0) goto L_0x0160
            r7 = r16
            goto L_0x0166
        L_0x0160:
            io.flutter.plugin.platform.c r7 = l0.e.f936j
            boolean r7 = d0.h.a(r15, r7)
        L_0x0166:
            if (r7 == 0) goto L_0x016b
            r7 = r16
            goto L_0x0171
        L_0x016b:
            io.flutter.plugin.platform.c r7 = l0.e.f938l
            boolean r7 = d0.h.a(r15, r7)
        L_0x0171:
            if (r7 != 0) goto L_0x01a8
            java.lang.String r7 = r15.toString()
        L_0x0177:
            if (r6 == 0) goto L_0x0196
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01a8
        L_0x0196:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01a8:
            int r4 = r4 + 1
            r7 = r16
            r6 = 0
            goto L_0x00c1
        L_0x01af:
            r16 = r7
            o0.d r2 = r3.b()
            r3 = r2
            l0.k r3 = (l0.k) r3
            if (r3 != 0) goto L_0x01eb
        L_0x01ba:
            int r2 = r1.length()
            if (r2 == 0) goto L_0x01e3
            int r2 = i0.g.E(r1)
            char r2 = r1.charAt(r2)
            if (r2 != r5) goto L_0x01d9
            int r2 = r1.length()
            int r2 = r2 + -1
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            d0.h.d(r2, r3)
        L_0x01d9:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x01e3:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Char sequence is empty."
            r1.<init>(r2)
            throw r1
        L_0x01eb:
            r7 = r16
            r6 = 0
            goto L_0x00be
        L_0x01f0:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.toString():java.lang.String");
    }

    public final boolean u(Object obj, Object obj2) {
        if (obj instanceof a) {
            h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            a aVar = (a) obj;
            C0047e eVar = aVar.f914c;
            h.b(eVar);
            aVar.f914c = null;
            aVar.f913b = obj2;
            Boolean bool = Boolean.TRUE;
            aVar.f915d.getClass();
            return e.a(eVar, bool, (q) null);
        } else if (obj instanceof C0046d) {
            h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return e.a((C0046d) obj, obj2, (q) null);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final Object w(k kVar, int i2, long j2, a aVar) {
        Object k2 = kVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = kVar.f951f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f916c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return e.f939n;
                }
                if (kVar.j(i2, k2, aVar)) {
                    h();
                    return e.m;
                }
            }
        } else if (k2 == e.f930d && kVar.j(i2, k2, e.f935i)) {
            h();
            Object obj = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, (Object) null);
            return obj;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f931e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f934h)) {
                        h();
                        return e.f940o;
                    }
                } else if (aVar == null) {
                    return e.f939n;
                } else {
                    if (kVar.j(i2, k3, aVar)) {
                        h();
                        return e.m;
                    }
                }
            } else if (k3 != e.f930d) {
                io.flutter.plugin.platform.c cVar = e.f936j;
                if (k3 == cVar) {
                    return e.f940o;
                }
                if (k3 == e.f934h) {
                    return e.f940o;
                }
                if (k3 == e.f938l) {
                    h();
                    return e.f940o;
                } else if (k3 != e.f933g && kVar.j(i2, k3, e.f932f)) {
                    boolean z2 = k3 instanceof u;
                    if (z2) {
                        k3 = ((u) k3).f958a;
                    }
                    if (v(k3)) {
                        kVar.n(i2, e.f935i);
                        h();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, (Object) null);
                        return obj2;
                    }
                    kVar.n(i2, cVar);
                    kVar.h();
                    if (z2) {
                        h();
                    }
                    return e.f940o;
                }
            } else if (kVar.j(i2, k3, e.f935i)) {
                h();
                Object obj3 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, (Object) null);
                return obj3;
            }
        }
    }

    public final int x(k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = kVar.k(i2);
            if (k2 == null) {
                if (!d(j2) || z2) {
                    if (z2) {
                        if (kVar.j(i2, (Object) null, e.f936j)) {
                            kVar.h();
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (kVar.j(i2, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i2, (Object) null, e.f930d)) {
                    break;
                }
            } else if (k2 != e.f931e) {
                io.flutter.plugin.platform.c cVar = e.f937k;
                if (k2 == cVar) {
                    kVar.m(i2, (Object) null);
                    return 5;
                } else if (k2 == e.f934h) {
                    kVar.m(i2, (Object) null);
                    return 5;
                } else if (k2 == e.f938l) {
                    kVar.m(i2, (Object) null);
                    p();
                    return 4;
                } else {
                    kVar.m(i2, (Object) null);
                    if (k2 instanceof u) {
                        k2 = ((u) k2).f958a;
                    }
                    if (u(k2, obj)) {
                        kVar.n(i2, e.f935i);
                        return 0;
                    }
                    if (kVar.f951f.getAndSet((i2 * 2) + 1, cVar) != cVar) {
                        kVar.l(i2, true);
                    }
                    return 5;
                }
            } else if (kVar.j(i2, k2, e.f930d)) {
                break;
            }
        }
        return 1;
    }
}
