package p0;

import d0.h;
import d0.k;
import e0.e;
import io.flutter.plugin.platform.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class a extends Thread {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1104j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: b  reason: collision with root package name */
    public final l f1105b = new l();

    /* renamed from: c  reason: collision with root package name */
    public final k f1106c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f1107d = 4;

    /* renamed from: e  reason: collision with root package name */
    public long f1108e;

    /* renamed from: f  reason: collision with root package name */
    public long f1109f;

    /* renamed from: g  reason: collision with root package name */
    public int f1110g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1111h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f1112i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker = b.f1116l;
    private volatile int workerCtl;

    /* JADX WARNING: type inference failed for: r1v3, types: [d0.k, java.lang.Object] */
    public a(b bVar, int i2) {
        this.f1112i = bVar;
        setDaemon(true);
        e0.a aVar = e.f508b;
        this.f1110g = e.f508b.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f1107d;
        boolean z3 = true;
        h hVar = null;
        l lVar = this.f1105b;
        b bVar2 = this.f1112i;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1114j;
            do {
                bVar = this.f1112i;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    lVar.getClass();
                    loop1:
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1141b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f1130c.f34a == 1) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, (Object) null)) {
                                    hVar = hVar2;
                                    break loop1;
                                } else if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                }
                            }
                        }
                    }
                    int i3 = l.f1143d.get(lVar);
                    int i4 = l.f1142c.get(lVar);
                    while (true) {
                        if (i3 != i4 && l.f1144e.get(lVar) != 0) {
                            i4--;
                            h b2 = lVar.b(i4, true);
                            if (b2 != null) {
                                hVar = b2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1122g.d();
                    if (hVar3 == null) {
                        return i(1);
                    }
                    return hVar3;
                }
            } while (!b.f1114j.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1107d = 1;
        }
        if (z2) {
            if (d(bVar2.f1117b * 2) != 0) {
                z3 = false;
            }
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            lVar.getClass();
            h hVar4 = (h) l.f1141b.getAndSet(lVar, (Object) null);
            if (hVar4 == null) {
                hVar4 = lVar.a();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f1110g;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1110g = i6;
        int i7 = i2 - 1;
        if ((i7 & i2) == 0) {
            return i6 & i7;
        }
        return (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f1112i;
        if (d2 == 0) {
            h hVar = (h) bVar.f1121f.d();
            if (hVar != null) {
                return hVar;
            }
            return (h) bVar.f1122g.d();
        }
        h hVar2 = (h) bVar.f1122g.d();
        if (hVar2 != null) {
            return hVar2;
        }
        return (h) bVar.f1121f.d();
    }

    public final void f(int i2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1112i.f1120e);
        sb.append("-worker-");
        if (i2 == 0) {
            str = "TERMINATED";
        } else {
            str = String.valueOf(i2);
        }
        sb.append(str);
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1107d;
        boolean z2 = true;
        if (i3 != 1) {
            z2 = false;
        }
        if (z2) {
            b.f1114j.addAndGet(this.f1112i, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1107d = i2;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        r7 = -2;
        r23 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p0.h i(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p0.b.f1114j
            p0.b r3 = r0.f1112i
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 2
            r5 = 0
            if (r2 >= r4) goto L_0x0016
            return r5
        L_0x0016:
            int r6 = r0.d(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0020:
            if (r10 >= r2) goto L_0x00f7
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L_0x0027
            r6 = r15
        L_0x0027:
            o0.t r4 = r3.f1123h
            java.lang.Object r4 = r4.b(r6)
            p0.a r4 = (p0.a) r4
            if (r4 == 0) goto L_0x00e8
            if (r4 == r0) goto L_0x00e8
            r7 = 3
            p0.l r4 = r4.f1105b
            if (r1 != r7) goto L_0x0044
            p0.h r7 = r4.a()
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            goto L_0x007a
        L_0x0044:
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = p0.l.f1143d
            int r7 = r7.get(r4)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = p0.l.f1142c
            int r8 = r8.get(r4)
            if (r1 != r15) goto L_0x005c
            r9 = r15
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            if (r7 == r8) goto L_0x0077
            r18 = 0
            if (r9 == 0) goto L_0x006d
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = p0.l.f1144e
            int r13 = r13.get(r4)
            if (r13 != 0) goto L_0x006d
        L_0x006b:
            r7 = r5
            goto L_0x007a
        L_0x006d:
            int r13 = r7 + 1
            p0.h r7 = r4.b(r7, r9)
            if (r7 != 0) goto L_0x007a
            r7 = r13
            goto L_0x005d
        L_0x0077:
            r18 = 0
            goto L_0x006b
        L_0x007a:
            d0.k r13 = r0.f1106c
            if (r7 == 0) goto L_0x0087
            r13.f483b = r7
            r23 = r6
            r7 = -1
            r20 = -1
            goto L_0x00ca
        L_0x0087:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p0.l.f1141b
            java.lang.Object r14 = r7.get(r4)
            p0.h r14 = (p0.h) r14
            if (r14 != 0) goto L_0x0094
            r20 = -1
            goto L_0x00a2
        L_0x0094:
            r20 = -1
            D.F r8 = r14.f1130c
            int r8 = r8.f34a
            if (r8 != r15) goto L_0x009e
            r8 = r15
            goto L_0x009f
        L_0x009e:
            r8 = 2
        L_0x009f:
            r8 = r8 & r1
            if (r8 != 0) goto L_0x00a7
        L_0x00a2:
            r7 = -2
            r23 = r6
            goto L_0x00ca
        L_0x00a7:
            p0.f r8 = p0.j.f1137f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r23 = r6
            long r5 = r14.f1129b
            long r8 = r8 - r5
            long r5 = p0.j.f1133b
            int r24 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r24 >= 0) goto L_0x00bf
            long r7 = r5 - r8
            r5 = 0
            goto L_0x00ca
        L_0x00bf:
            r5 = 0
            boolean r6 = r7.compareAndSet(r4, r14, r5)
            if (r6 == 0) goto L_0x00de
            r13.f483b = r14
            r7 = r20
        L_0x00ca:
            int r4 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x00d5
            java.lang.Object r1 = r13.f483b
            p0.h r1 = (p0.h) r1
            r13.f483b = r5
            return r1
        L_0x00d5:
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ef
            long r11 = java.lang.Math.min(r11, r7)
            goto L_0x00ef
        L_0x00de:
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto L_0x00bf
            r6 = r23
            r5 = 0
            goto L_0x0087
        L_0x00e8:
            r23 = r6
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00ef:
            int r10 = r10 + 1
            r6 = r23
            r4 = 2
            r5 = 0
            goto L_0x0020
        L_0x00f7:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r11 = r18
        L_0x0105:
            r0.f1109f = r11
            r22 = 0
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.i(int):p0.h");
    }

    public final void run() {
        boolean z2;
        long j2;
        boolean z3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        int i2;
        loop0:
        while (true) {
            boolean z4 = false;
            while (true) {
                b bVar = this.f1112i;
                bVar.getClass();
                if (b.f1115k.get(bVar) == 0 && this.f1107d != 5) {
                    h a2 = a(this.f1111h);
                    if (a2 == null) {
                        this.f1111h = false;
                        if (this.f1109f != 0) {
                            if (z4) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f1109f);
                                this.f1109f = 0;
                                break;
                            }
                            z4 = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            c cVar = b.f1116l;
                            if (obj != cVar) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            long j4 = 2097151;
                            if (z2) {
                                f1104j.set(this, -1);
                                while (this.nextParkedWorker != b.f1116l) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1104j;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    b bVar2 = this.f1112i;
                                    bVar2.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1115k;
                                    if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f1107d == 5) {
                                        break;
                                    }
                                    h(3);
                                    Thread.interrupted();
                                    if (this.f1108e == 0) {
                                        j2 = j4;
                                        this.f1108e = System.nanoTime() + this.f1112i.f1119d;
                                    } else {
                                        j2 = j4;
                                    }
                                    LockSupport.parkNanos(this.f1112i.f1119d);
                                    if (System.nanoTime() - this.f1108e >= 0) {
                                        this.f1108e = 0;
                                        b bVar3 = this.f1112i;
                                        synchronized (bVar3.f1123h) {
                                            try {
                                                if (atomicIntegerFieldUpdater2.get(bVar3) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (!z3) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1114j;
                                                    if (((int) (atomicLongFieldUpdater2.get(bVar3) & j2)) > bVar3.f1117b) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i3 = this.indexInArray;
                                                            f(0);
                                                            bVar3.c(this, i3, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & j2);
                                                            if (andDecrement != i3) {
                                                                Object b2 = bVar3.f1123h.b(andDecrement);
                                                                h.b(b2);
                                                                a aVar = (a) b2;
                                                                bVar3.f1123h.c(i3, aVar);
                                                                aVar.f(i3);
                                                                bVar3.c(aVar, andDecrement, i3);
                                                            }
                                                            bVar3.f1123h.c(andDecrement, (a) null);
                                                            this.f1107d = 5;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    j4 = j2;
                                }
                            } else {
                                b bVar4 = this.f1112i;
                                bVar4.getClass();
                                if (this.nextParkedWorker == cVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f1113i;
                                        j3 = atomicLongFieldUpdater.get(bVar4);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar4.f1123h.b((int) (j3 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j3, ((j3 + 2097152) & -2097152) | ((long) i2)));
                                }
                            }
                        }
                    } else {
                        this.f1109f = 0;
                        int i4 = a2.f1130c.f34a;
                        this.f1108e = 0;
                        if (this.f1107d == 3) {
                            this.f1107d = 2;
                        }
                        b bVar5 = this.f1112i;
                        if (i4 != 0 && h(2) && !bVar5.e() && !bVar5.d(b.f1114j.get(bVar5))) {
                            bVar5.e();
                        }
                        bVar5.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th2) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (i4 != 0) {
                            b.f1114j.addAndGet(bVar5, -2097152);
                            if (this.f1107d != 5) {
                                this.f1107d = 4;
                            }
                        }
                    }
                }
            }
        }
        h(5);
    }
}
