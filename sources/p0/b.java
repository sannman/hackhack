package p0;

import D.F;
import d0.h;
import io.flutter.plugin.platform.c;
import j0.C0061t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import n.d;
import o0.m;
import o0.t;

public final class b implements Executor, Closeable {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1113i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1114j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1115k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f1116l = new c(4, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: b  reason: collision with root package name */
    public final int f1117b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1118c;
    private volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final long f1119d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1120e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1121f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1122g;

    /* renamed from: h  reason: collision with root package name */
    public final t f1123h;
    private volatile long parkedWorkersStack;

    static {
        Class<b> cls = b.class;
        f1113i = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f1114j = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f1115k = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [o0.m, p0.e] */
    /* JADX WARNING: type inference failed for: r4v12, types: [o0.m, p0.e] */
    public b(int i2, int i3, long j2, String str) {
        this.f1117b = i2;
        this.f1118c = i3;
        this.f1119d = j2;
        this.f1120e = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        } else if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j2 > 0) {
            this.f1121f = new m();
            this.f1122g = new m();
            this.f1123h = new t((i2 + 1) * 2);
            this.controlState = ((long) i2) << 42;
            this._isTerminated = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
    }

    public final int a() {
        boolean z2;
        synchronized (this.f1123h) {
            try {
                if (f1115k.get(this) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1114j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1117b) {
                    return 0;
                }
                if (i2 >= this.f1118c) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1123h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f1123h.c(i4, aVar);
                if (i4 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i5 = i3 + 1;
                    aVar.start();
                    return i5;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, F f2) {
        h hVar;
        boolean z2;
        long j2;
        a aVar;
        boolean z3;
        int i2;
        AtomicReferenceArray atomicReferenceArray;
        j.f1137f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            hVar = (h) runnable;
            hVar.f1129b = nanoTime;
            hVar.f1130c = f2;
        } else {
            hVar = new i(runnable, nanoTime, f2);
        }
        if (hVar.f1130c.f34a == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1114j;
        if (z2) {
            j2 = atomicLongFieldUpdater.addAndGet(this, 2097152);
        } else {
            j2 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !h.a(aVar.f1112i, this)) {
            aVar = null;
        }
        if (!(aVar == null || (i2 = aVar.f1107d) == 5 || (hVar.f1130c.f34a == 0 && i2 == 2))) {
            aVar.f1111h = true;
            l lVar = aVar.f1105b;
            lVar.getClass();
            hVar = (h) l.f1141b.getAndSet(lVar, hVar);
            if (hVar == null) {
                hVar = null;
            } else {
                lVar.getClass();
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l.f1142c;
                if (atomicIntegerFieldUpdater.get(lVar) - l.f1143d.get(lVar) != 127) {
                    if (hVar.f1130c.f34a == 1) {
                        l.f1144e.incrementAndGet(lVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(lVar) & 127;
                    while (true) {
                        atomicReferenceArray = lVar.f1145a;
                        if (atomicReferenceArray.get(i3) == null) {
                            break;
                        }
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, hVar);
                    atomicIntegerFieldUpdater.incrementAndGet(lVar);
                    hVar = null;
                }
            }
        }
        if (hVar != null) {
            if (hVar.f1130c.f34a == 1) {
                z3 = this.f1122g.a(hVar);
            } else {
                z3 = this.f1121f.a(hVar);
            }
            if (!z3) {
                throw new RejectedExecutionException(this.f1120e + " was terminated");
            }
        }
        if (z2) {
            if (!e() && !d(j2)) {
                e();
            }
        } else if (!e() && !d(atomicLongFieldUpdater.get(this))) {
            e();
        }
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f1113i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f1116l) {
                            i4 = -1;
                            break;
                        } else if (c2 == null) {
                            i4 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c2;
                            int b2 = aVar2.b();
                            if (b2 != 0) {
                                i4 = b2;
                                break;
                            }
                            c2 = aVar2.c();
                        }
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f1113i.compareAndSet(this, j2, ((long) i4) | j3)) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f1115k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p0.a
            r3 = 0
            if (r1 == 0) goto L_0x0017
            p0.a r0 = (p0.a) r0
            goto L_0x0018
        L_0x0017:
            r0 = r3
        L_0x0018:
            if (r0 == 0) goto L_0x0023
            p0.b r1 = r0.f1112i
            boolean r1 = d0.h.a(r1, r8)
            if (r1 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            o0.t r1 = r8.f1123h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f1114j     // Catch:{ all -> 0x00c0 }
            long r4 = r4.get(r8)     // Catch:{ all -> 0x00c0 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L_0x0076
            r1 = r2
        L_0x0036:
            o0.t r5 = r8.f1123h
            java.lang.Object r5 = r5.b(r1)
            d0.h.b(r5)
            p0.a r5 = (p0.a) r5
            if (r5 == r0) goto L_0x0071
        L_0x0043:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x0052
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x0043
        L_0x0052:
            p0.l r5 = r5.f1105b
            p0.e r6 = r8.f1122g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p0.l.f1141b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            p0.h r7 = (p0.h) r7
            if (r7 == 0) goto L_0x0066
            r6.a(r7)
        L_0x0066:
            p0.h r7 = r5.a()
            if (r7 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r6.a(r7)
            goto L_0x0066
        L_0x0071:
            if (r1 == r4) goto L_0x0076
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0076:
            p0.e r1 = r8.f1122g
            r1.b()
            p0.e r1 = r8.f1121f
            r1.b()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            p0.h r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00af
        L_0x0088:
            p0.e r1 = r8.f1121f
            java.lang.Object r1 = r1.d()
            p0.h r1 = (p0.h) r1
            if (r1 != 0) goto L_0x00af
            p0.e r1 = r8.f1122g
            java.lang.Object r1 = r1.d()
            p0.h r1 = (p0.h) r1
            if (r1 != 0) goto L_0x00af
            if (r0 == 0) goto L_0x00a2
            r1 = 5
            r0.h(r1)
        L_0x00a2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1113i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1114j
            r0.set(r8, r1)
            return
        L_0x00af:
            r1.run()     // Catch:{ all -> 0x00b3 }
            goto L_0x0080
        L_0x00b3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0080
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.close():void");
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1117b;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        c cVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1113i;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1123h.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & -2097152;
                Object c2 = aVar.c();
                while (true) {
                    cVar = f1116l;
                    if (c2 == cVar) {
                        i2 = -1;
                        break;
                    } else if (c2 == null) {
                        i2 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c2;
                        i2 = aVar2.b();
                        if (i2 != 0) {
                            break;
                        }
                        c2 = aVar2.c();
                    }
                }
                if (i2 >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j2, j3 | ((long) i2))) {
                        aVar.g(cVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1104j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final void execute(Runnable runnable) {
        b(runnable, j.f1138g);
    }

    public final String toString() {
        int i2;
        ArrayList arrayList = new ArrayList();
        t tVar = this.f1123h;
        int a2 = tVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a2; i8++) {
            a aVar = (a) tVar.b(i8);
            if (aVar != null) {
                l lVar = aVar.f1105b;
                lVar.getClass();
                if (l.f1141b.get(lVar) != null) {
                    i2 = (l.f1142c.get(lVar) - l.f1143d.get(lVar)) + 1;
                } else {
                    i2 = l.f1142c.get(lVar) - l.f1143d.get(lVar);
                }
                int a3 = d.a(aVar.f1107d);
                if (a3 == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (a3 == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (a3 == 2) {
                    i5++;
                } else if (a3 == 3) {
                    i6++;
                    if (i2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (a3 == 4) {
                    i7++;
                }
            }
        }
        long j2 = f1114j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1120e);
        sb4.append('@');
        sb4.append(C0061t.a(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f1117b;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f1118c);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1121f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1122g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
