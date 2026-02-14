package j0;

import B.c;
import V.g;
import V.h;
import V.i;
import a.a;
import c0.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.l;
import o0.r;
import o0.u;

public class T implements K, X {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f839b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f840c;
    private volatile Object _parentHandle;
    private volatile Object _state;

    static {
        Class<T> cls = T.class;
        Class<Object> cls2 = Object.class;
        f839b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f840c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public T(boolean z2) {
        A a2;
        if (z2) {
            a2 = C0061t.f879i;
        } else {
            a2 = C0061t.f878h;
        }
        this._state = a2;
    }

    public static C0051i D(l lVar) {
        while (lVar.m()) {
            l i2 = lVar.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1078c;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = i2;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0051i) {
                    return (C0051i) lVar;
                }
                if (lVar instanceof U) {
                    return null;
                }
            }
        }
    }

    public static String I(Object obj) {
        if (obj instanceof Q) {
            Q q2 = (Q) obj;
            if (q2.e()) {
                return "Cancelling";
            }
            if (q2.f()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof H) {
            if (((H) obj).b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0053k) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[ADDED_TO_REGION, LOOP:0: B:5:0x000c->B:26:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[EDGE_INSN: B:30:0x0055->B:27:0x0055 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(j0.K r9) {
        /*
            r8 = this;
            j0.V r0 = j0.V.f841b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f840c
            if (r9 != 0) goto L_0x000a
            r1.set(r8, r0)
            return
        L_0x000a:
            j0.T r9 = (j0.T) r9
        L_0x000c:
            java.lang.Object r2 = r9.y()
            boolean r3 = r2 instanceof j0.A
            r4 = 0
            r5 = 1
            r6 = -1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f839b
            if (r3 == 0) goto L_0x0036
            r3 = r2
            j0.A r3 = (j0.A) r3
            boolean r3 = r3.f812b
            if (r3 == 0) goto L_0x0021
            goto L_0x0050
        L_0x0021:
            j0.A r3 = j0.C0061t.f879i
        L_0x0023:
            boolean r4 = r7.compareAndSet(r9, r2, r3)
            if (r4 == 0) goto L_0x002e
            r9.getClass()
        L_0x002c:
            r4 = r5
            goto L_0x0050
        L_0x002e:
            java.lang.Object r4 = r7.get(r9)
            if (r4 == r2) goto L_0x0023
        L_0x0034:
            r4 = r6
            goto L_0x0050
        L_0x0036:
            boolean r3 = r2 instanceof j0.G
            if (r3 == 0) goto L_0x0050
            r3 = r2
            j0.G r3 = (j0.G) r3
            j0.U r3 = r3.f820b
        L_0x003f:
            boolean r4 = r7.compareAndSet(r9, r2, r3)
            if (r4 == 0) goto L_0x0049
            r9.getClass()
            goto L_0x002c
        L_0x0049:
            java.lang.Object r4 = r7.get(r9)
            if (r4 == r2) goto L_0x003f
            goto L_0x0034
        L_0x0050:
            if (r4 == 0) goto L_0x0055
            if (r4 == r5) goto L_0x0055
            goto L_0x000c
        L_0x0055:
            j0.i r2 = new j0.i
            r2.<init>(r8)
            r3 = 2
            j0.z r9 = j0.C0061t.d(r9, r2, r3)
            j0.h r9 = (j0.C0050h) r9
            r1.set(r8, r9)
            java.lang.Object r2 = r8.y()
            boolean r2 = r2 instanceof j0.H
            if (r2 != 0) goto L_0x0072
            r9.e()
            r1.set(r8, r0)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.B(j0.K):void");
    }

    public final Object C(Object obj) {
        Object J2;
        C0053k kVar;
        do {
            J2 = J(y(), obj);
            if (J2 == C0061t.f873c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0053k) {
                    kVar = (C0053k) obj;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    th = kVar.f861a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (J2 == C0061t.f875e);
        return J2;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(j0.U r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.k()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            d0.h.c(r0, r1)
            o0.l r0 = (o0.l) r0
            r1 = 0
        L_0x000c:
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r0 instanceof j0.M
            if (r2 == 0) goto L_0x003f
            r2 = r0
            j0.O r2 = (j0.O) r2
            r2.o(r8)     // Catch:{ all -> 0x001d }
            goto L_0x003f
        L_0x001d:
            r3 = move-exception
            if (r1 == 0) goto L_0x0024
            a.a.a(r1, r3)
            goto L_0x003f
        L_0x0024:
            B.c r1 = new B.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
        L_0x003f:
            o0.l r0 = r0.l()
            goto L_0x000c
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r6.A(r1)
        L_0x0049:
            r6.q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.E(j0.U, java.lang.Throwable):void");
    }

    public final void H(O o2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l lVar = new l();
        o2.getClass();
        l.f1078c.lazySet(lVar, o2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f1077b;
        atomicReferenceFieldUpdater2.lazySet(lVar, o2);
        loop0:
        while (true) {
            if (o2.k() != o2) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(o2, o2, lVar)) {
                    lVar.j(o2);
                    break loop0;
                } else if (atomicReferenceFieldUpdater2.get(o2) != o2) {
                }
            }
        }
        l l2 = o2.l();
        do {
            atomicReferenceFieldUpdater = f839b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o2, l2) || atomicReferenceFieldUpdater.get(this) != o2) {
            }
            atomicReferenceFieldUpdater = f839b;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != o2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a2, code lost:
        if (r5 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a4, code lost:
        E(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00a9, code lost:
        if ((r7 instanceof j0.C0051i) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ab, code lost:
        r0 = (j0.C0051i) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b0, code lost:
        if (r0 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b2, code lost:
        r7 = r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b6, code lost:
        if (r7 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b8, code lost:
        r2 = D(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00bd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00be, code lost:
        if (r2 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cd, code lost:
        if (j0.C0061t.d(r2.f855f, new j0.P(r6, r1, r2, r8), 1) == j0.V.f841b) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d1, code lost:
        return j0.C0061t.f874d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d2, code lost:
        r2 = D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00d6, code lost:
        if (r2 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00dc, code lost:
        return u(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object J(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j0.H
            if (r0 != 0) goto L_0x0007
            io.flutter.plugin.platform.c r7 = j0.C0061t.f873c
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof j0.A
            if (r0 != 0) goto L_0x000f
            boolean r0 = r7 instanceof j0.O
            if (r0 == 0) goto L_0x0041
        L_0x000f:
            boolean r0 = r7 instanceof j0.C0051i
            if (r0 != 0) goto L_0x0041
            boolean r0 = r8 instanceof j0.C0053k
            if (r0 != 0) goto L_0x0041
            r0 = r7
            j0.H r0 = (j0.H) r0
            boolean r7 = r8 instanceof j0.H
            if (r7 == 0) goto L_0x0028
            j0.I r7 = new j0.I
            r1 = r8
            j0.H r1 = (j0.H) r1
            r7.<init>(r1)
            r1 = r7
            goto L_0x0029
        L_0x0028:
            r1 = r8
        L_0x0029:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f839b
            boolean r2 = r7.compareAndSet(r6, r0, r1)
            if (r2 == 0) goto L_0x0038
            r6.F(r8)
            r6.s(r0, r8)
            return r8
        L_0x0038:
            java.lang.Object r7 = r7.get(r6)
            if (r7 == r0) goto L_0x0029
            io.flutter.plugin.platform.c r7 = j0.C0061t.f875e
            return r7
        L_0x0041:
            j0.H r7 = (j0.H) r7
            j0.U r0 = r6.x(r7)
            if (r0 != 0) goto L_0x004c
            io.flutter.plugin.platform.c r7 = j0.C0061t.f875e
            return r7
        L_0x004c:
            boolean r1 = r7 instanceof j0.Q
            r2 = 0
            if (r1 == 0) goto L_0x0055
            r1 = r7
            j0.Q r1 = (j0.Q) r1
            goto L_0x0056
        L_0x0055:
            r1 = r2
        L_0x0056:
            if (r1 != 0) goto L_0x005d
            j0.Q r1 = new j0.Q
            r1.<init>(r0, r2)
        L_0x005d:
            monitor-enter(r1)
            boolean r3 = r1.f()     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0068
            io.flutter.plugin.platform.c r7 = j0.C0061t.f873c     // Catch:{ all -> 0x0083 }
            monitor-exit(r1)
            return r7
        L_0x0068:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = j0.Q.f831c     // Catch:{ all -> 0x0083 }
            r4 = 1
            r3.set(r1, r4)     // Catch:{ all -> 0x0083 }
            if (r1 == r7) goto L_0x0085
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f839b     // Catch:{ all -> 0x0083 }
        L_0x0072:
            boolean r5 = r3.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x0079
            goto L_0x0085
        L_0x0079:
            java.lang.Object r5 = r3.get(r6)     // Catch:{ all -> 0x0083 }
            if (r5 == r7) goto L_0x0072
            io.flutter.plugin.platform.c r7 = j0.C0061t.f875e     // Catch:{ all -> 0x0083 }
            monitor-exit(r1)
            return r7
        L_0x0083:
            r7 = move-exception
            goto L_0x00dd
        L_0x0085:
            boolean r3 = r1.e()     // Catch:{ all -> 0x0083 }
            boolean r5 = r8 instanceof j0.C0053k     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x0091
            r5 = r8
            j0.k r5 = (j0.C0053k) r5     // Catch:{ all -> 0x0083 }
            goto L_0x0092
        L_0x0091:
            r5 = r2
        L_0x0092:
            if (r5 == 0) goto L_0x0099
            java.lang.Throwable r5 = r5.f861a     // Catch:{ all -> 0x0083 }
            r1.a(r5)     // Catch:{ all -> 0x0083 }
        L_0x0099:
            java.lang.Throwable r5 = r1.d()     // Catch:{ all -> 0x0083 }
            if (r3 != 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r5 = r2
        L_0x00a1:
            monitor-exit(r1)
            if (r5 == 0) goto L_0x00a7
            r6.E(r0, r5)
        L_0x00a7:
            boolean r0 = r7 instanceof j0.C0051i
            if (r0 == 0) goto L_0x00af
            r0 = r7
            j0.i r0 = (j0.C0051i) r0
            goto L_0x00b0
        L_0x00af:
            r0 = r2
        L_0x00b0:
            if (r0 != 0) goto L_0x00bd
            j0.U r7 = r7.c()
            if (r7 == 0) goto L_0x00be
            j0.i r2 = D(r7)
            goto L_0x00be
        L_0x00bd:
            r2 = r0
        L_0x00be:
            if (r2 == 0) goto L_0x00d8
        L_0x00c0:
            j0.T r7 = r2.f855f
            j0.P r0 = new j0.P
            r0.<init>(r6, r1, r2, r8)
            j0.z r7 = j0.C0061t.d(r7, r0, r4)
            j0.V r0 = j0.V.f841b
            if (r7 == r0) goto L_0x00d2
            io.flutter.plugin.platform.c r7 = j0.C0061t.f874d
            return r7
        L_0x00d2:
            j0.i r2 = D(r2)
            if (r2 != 0) goto L_0x00c0
        L_0x00d8:
            java.lang.Object r7 = r6.u(r1, r8)
            return r7
        L_0x00dd:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.J(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new L(r(), (Throwable) null, this);
        }
        p(cancellationException);
    }

    public boolean b() {
        Object y2 = y();
        if (!(y2 instanceof H) || !((H) y2).b()) {
            return false;
        }
        return true;
    }

    public final Object d(Object obj, p pVar) {
        return pVar.d(obj, this);
    }

    public final i f(h hVar) {
        return a.p(this, hVar);
    }

    public final g g(h hVar) {
        d0.h.e(hVar, "key");
        if (d0.h.a(C0059q.f870c, hVar)) {
            return this;
        }
        return null;
    }

    public final h getKey() {
        return C0059q.f870c;
    }

    public final i h(i iVar) {
        return a.r(this, iVar);
    }

    public final boolean l(H h2, U u, O o2) {
        boolean z2;
        S s2 = new S(o2, this, h2);
        do {
            l i2 = u.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1078c;
                Object obj = atomicReferenceFieldUpdater.get(u);
                while (true) {
                    i2 = (l) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            l.f1078c.lazySet(o2, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f1077b;
            atomicReferenceFieldUpdater2.lazySet(o2, u);
            s2.f836c = u;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(i2, u, s2)) {
                    if (atomicReferenceFieldUpdater2.get(i2) != u) {
                        z2 = false;
                        break;
                    }
                } else if (s2.a(i2) == null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                return true;
            }
        } while (!z2);
        return false;
    }

    public void n(Object obj) {
        m(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r0 == j0.C0061t.f874d) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(java.lang.Object r10) {
        /*
            r9 = this;
            io.flutter.plugin.platform.c r0 = j0.C0061t.f873c
            boolean r1 = r9 instanceof j0.N
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
        L_0x0008:
            java.lang.Object r0 = r9.y()
            boolean r1 = r0 instanceof j0.H
            if (r1 == 0) goto L_0x0030
            boolean r1 = r0 instanceof j0.Q
            if (r1 == 0) goto L_0x001e
            r1 = r0
            j0.Q r1 = (j0.Q) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x001e
            goto L_0x0030
        L_0x001e:
            j0.k r1 = new j0.k
            java.lang.Throwable r4 = r9.t(r10)
            r1.<init>(r4, r3)
            java.lang.Object r0 = r9.J(r0, r1)
            io.flutter.plugin.platform.c r1 = j0.C0061t.f875e
            if (r0 == r1) goto L_0x0008
            goto L_0x0032
        L_0x0030:
            io.flutter.plugin.platform.c r0 = j0.C0061t.f873c
        L_0x0032:
            io.flutter.plugin.platform.c r1 = j0.C0061t.f874d
            if (r0 != r1) goto L_0x0038
            goto L_0x00fe
        L_0x0038:
            io.flutter.plugin.platform.c r1 = j0.C0061t.f873c
            if (r0 != r1) goto L_0x00f5
            r0 = 0
            r1 = r0
        L_0x003e:
            java.lang.Object r4 = r9.y()
            boolean r5 = r4 instanceof j0.Q
            if (r5 == 0) goto L_0x0091
            monitor-enter(r4)
            r5 = r4
            j0.Q r5 = (j0.Q) r5     // Catch:{ all -> 0x0070 }
            r5.getClass()     // Catch:{ all -> 0x0070 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = j0.Q.f833e     // Catch:{ all -> 0x0070 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0070 }
            io.flutter.plugin.platform.c r6 = j0.C0061t.f877g     // Catch:{ all -> 0x0070 }
            if (r5 != r6) goto L_0x0059
            r5 = r2
            goto L_0x005a
        L_0x0059:
            r5 = r3
        L_0x005a:
            if (r5 == 0) goto L_0x0062
            io.flutter.plugin.platform.c r10 = j0.C0061t.f876f     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)
        L_0x005f:
            r0 = r10
            goto L_0x00f5
        L_0x0062:
            r5 = r4
            j0.Q r5 = (j0.Q) r5     // Catch:{ all -> 0x0070 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x0072
            java.lang.Throwable r1 = r9.t(r10)     // Catch:{ all -> 0x0070 }
            goto L_0x0072
        L_0x0070:
            r10 = move-exception
            goto L_0x008f
        L_0x0072:
            r10 = r4
            j0.Q r10 = (j0.Q) r10     // Catch:{ all -> 0x0070 }
            r10.a(r1)     // Catch:{ all -> 0x0070 }
            r10 = r4
            j0.Q r10 = (j0.Q) r10     // Catch:{ all -> 0x0070 }
            java.lang.Throwable r10 = r10.d()     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0082
            r0 = r10
        L_0x0082:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x008c
            j0.Q r4 = (j0.Q) r4
            j0.U r10 = r4.f834b
            r9.E(r10, r0)
        L_0x008c:
            io.flutter.plugin.platform.c r10 = j0.C0061t.f873c
            goto L_0x005f
        L_0x008f:
            monitor-exit(r4)
            throw r10
        L_0x0091:
            boolean r5 = r4 instanceof j0.H
            if (r5 == 0) goto L_0x00f1
            if (r1 != 0) goto L_0x009b
            java.lang.Throwable r1 = r9.t(r10)
        L_0x009b:
            r5 = r4
            j0.H r5 = (j0.H) r5
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x00c6
            j0.U r6 = r9.x(r5)
            if (r6 != 0) goto L_0x00ab
            goto L_0x003e
        L_0x00ab:
            j0.Q r7 = new j0.Q
            r7.<init>(r6, r1)
        L_0x00b0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f839b
            boolean r8 = r4.compareAndSet(r9, r5, r7)
            if (r8 == 0) goto L_0x00be
            r9.E(r6, r1)
            io.flutter.plugin.platform.c r10 = j0.C0061t.f873c
            goto L_0x005f
        L_0x00be:
            java.lang.Object r4 = r4.get(r9)
            if (r4 == r5) goto L_0x00b0
            goto L_0x003e
        L_0x00c6:
            j0.k r5 = new j0.k
            r5.<init>(r1, r3)
            java.lang.Object r5 = r9.J(r4, r5)
            io.flutter.plugin.platform.c r6 = j0.C0061t.f873c
            if (r5 == r6) goto L_0x00d9
            io.flutter.plugin.platform.c r4 = j0.C0061t.f875e
            if (r5 == r4) goto L_0x003e
            r0 = r5
            goto L_0x00f5
        L_0x00d9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot happen in "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00f1:
            io.flutter.plugin.platform.c r10 = j0.C0061t.f876f
            goto L_0x005f
        L_0x00f5:
            io.flutter.plugin.platform.c r10 = j0.C0061t.f873c
            if (r0 != r10) goto L_0x00fa
            goto L_0x00fe
        L_0x00fa:
            io.flutter.plugin.platform.c r10 = j0.C0061t.f874d
            if (r0 != r10) goto L_0x00ff
        L_0x00fe:
            return r2
        L_0x00ff:
            io.flutter.plugin.platform.c r10 = j0.C0061t.f876f
            if (r0 != r10) goto L_0x0104
            return r3
        L_0x0104:
            r9.m(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.o(java.lang.Object):boolean");
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (this instanceof u) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        C0050h hVar = (C0050h) f840c.get(this);
        if (hVar == null || hVar == V.f841b) {
            return z2;
        }
        if (hVar.h(th) || z2) {
            return true;
        }
        return false;
    }

    public String r() {
        return "Job was cancelled";
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v8, types: [B.c, java.lang.RuntimeException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(j0.H r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f840c
            java.lang.Object r1 = r0.get(r7)
            j0.h r1 = (j0.C0050h) r1
            if (r1 == 0) goto L_0x0012
            r1.e()
            j0.V r1 = j0.V.f841b
            r0.set(r7, r1)
        L_0x0012:
            boolean r0 = r9 instanceof j0.C0053k
            r1 = 0
            if (r0 == 0) goto L_0x001a
            j0.k r9 = (j0.C0053k) r9
            goto L_0x001b
        L_0x001a:
            r9 = r1
        L_0x001b:
            if (r9 == 0) goto L_0x0020
            java.lang.Throwable r9 = r9.f861a
            goto L_0x0021
        L_0x0020:
            r9 = r1
        L_0x0021:
            boolean r0 = r8 instanceof j0.O
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L_0x004c
            r0 = r8
            j0.O r0 = (j0.O) r0     // Catch:{ all -> 0x0030 }
            r0.o(r9)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r9 = move-exception
            B.c r0 = new B.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r9)
            r7.A(r0)
            goto L_0x0096
        L_0x004c:
            j0.U r8 = r8.c()
            if (r8 == 0) goto L_0x0096
            java.lang.Object r0 = r8.k()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            d0.h.c(r0, r4)
            o0.l r0 = (o0.l) r0
        L_0x005d:
            boolean r4 = r0.equals(r8)
            if (r4 != 0) goto L_0x0091
            boolean r4 = r0 instanceof j0.O
            if (r4 == 0) goto L_0x008c
            r4 = r0
            j0.O r4 = (j0.O) r4
            r4.o(r9)     // Catch:{ all -> 0x006e }
            goto L_0x008c
        L_0x006e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0075
            a.a.a(r1, r5)
            goto L_0x008c
        L_0x0075:
            B.c r1 = new B.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            r6.append(r2)
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            r1.<init>(r4, r5)
        L_0x008c:
            o0.l r0 = r0.l()
            goto L_0x005d
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r7.A(r1)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.s(j0.H, java.lang.Object):void");
    }

    public final Throwable t(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        T t2 = (T) ((X) obj);
        Object y2 = t2.y();
        CancellationException cancellationException = null;
        if (y2 instanceof Q) {
            th = ((Q) y2).d();
        } else if (y2 instanceof C0053k) {
            th = ((C0053k) y2).f861a;
        } else if (!(y2 instanceof H)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + y2).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            return new L("Parent job is ".concat(I(y2)), th, t2);
        }
        return cancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + I(y()) + '}');
        sb.append('@');
        sb.append(C0061t.a(this));
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4 A[LOOP:2: B:54:0x00c4->B:57:0x00cf, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(j0.Q r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof j0.C0053k
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r10
            j0.k r0 = (j0.C0053k) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r0 = r0.f861a
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            monitor-enter(r9)
            r9.e()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r2 = r9.g(r0)     // Catch:{ all -> 0x00d5 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00d5 }
            r4 = 0
            if (r3 == 0) goto L_0x0030
            boolean r3 = r9.e()     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0051
            j0.L r3 = new j0.L     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r8.r()     // Catch:{ all -> 0x00d5 }
            r3.<init>(r5, r1, r8)     // Catch:{ all -> 0x00d5 }
            r1 = r3
            goto L_0x0051
        L_0x0030:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0034:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00d5 }
            r6 = r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00d5 }
            boolean r6 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00d5 }
            if (r6 != 0) goto L_0x0034
            r1 = r5
        L_0x0046:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            java.lang.Object r1 = r2.get(r4)     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00d5 }
        L_0x0051:
            r3 = 1
            if (r1 == 0) goto L_0x008a
            int r5 = r2.size()     // Catch:{ all -> 0x00d5 }
            if (r5 > r3) goto L_0x005b
            goto L_0x008a
        L_0x005b:
            int r5 = r2.size()     // Catch:{ all -> 0x00d5 }
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00d5 }
            r6.<init>(r5)     // Catch:{ all -> 0x00d5 }
            java.util.Set r5 = java.util.Collections.newSetFromMap(r6)     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x006c:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00d5 }
            if (r6 == r1) goto L_0x006c
            if (r6 == r1) goto L_0x006c
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00d5 }
            if (r7 != 0) goto L_0x006c
            boolean r7 = r5.add(r6)     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x006c
            a.a.a(r1, r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x006c
        L_0x008a:
            monitor-exit(r9)
            if (r1 != 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            if (r1 != r0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            j0.k r10 = new j0.k
            r10.<init>(r1, r4)
        L_0x0096:
            if (r1 == 0) goto L_0x00b1
            boolean r0 = r8.q(r1)
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r8.z(r1)
            if (r0 == 0) goto L_0x00b1
        L_0x00a4:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            d0.h.c(r10, r0)
            r0 = r10
            j0.k r0 = (j0.C0053k) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = j0.C0053k.f860b
            r1.compareAndSet(r0, r4, r3)
        L_0x00b1:
            r8.F(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f839b
            boolean r1 = r10 instanceof j0.H
            if (r1 == 0) goto L_0x00c3
            j0.I r1 = new j0.I
            r2 = r10
            j0.H r2 = (j0.H) r2
            r1.<init>(r2)
            goto L_0x00c4
        L_0x00c3:
            r1 = r10
        L_0x00c4:
            boolean r2 = r0.compareAndSet(r8, r9, r1)
            if (r2 == 0) goto L_0x00cb
            goto L_0x00d1
        L_0x00cb:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == r9) goto L_0x00c4
        L_0x00d1:
            r8.s(r9, r10)
            return r10
        L_0x00d5:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.u(j0.Q, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException v() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.y()
            boolean r1 = r0 instanceof j0.Q
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004c
            j0.Q r0 = (j0.Q) r0
            java.lang.Throwable r0 = r0.d()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0035
            j0.L r2 = new j0.L
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.r()
        L_0x0032:
            r2.<init>(r1, r0, r4)
        L_0x0035:
            return r2
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x004c:
            boolean r1 = r0 instanceof j0.H
            if (r1 != 0) goto L_0x0080
            boolean r1 = r0 instanceof j0.C0053k
            if (r1 == 0) goto L_0x006c
            j0.k r0 = (j0.C0053k) r0
            java.lang.Throwable r0 = r0.f861a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x005f
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x005f:
            if (r2 != 0) goto L_0x006b
            j0.L r1 = new j0.L
            java.lang.String r2 = r4.r()
            r1.<init>(r2, r0, r4)
            return r1
        L_0x006b:
            return r2
        L_0x006c:
            j0.L r0 = new j0.L
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0080:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.v():java.util.concurrent.CancellationException");
    }

    public boolean w() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [o0.l, j0.U] */
    public final U x(H h2) {
        U c2 = h2.c();
        if (c2 != null) {
            return c2;
        }
        if (h2 instanceof A) {
            return new l();
        }
        if (h2 instanceof O) {
            H((O) h2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + h2).toString());
    }

    public final Object y() {
        while (true) {
            Object obj = f839b.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public boolean z(Throwable th) {
        return false;
    }

    public void G() {
    }

    public void A(c cVar) {
        throw cVar;
    }

    public void F(Object obj) {
    }

    public void m(Object obj) {
    }
}
