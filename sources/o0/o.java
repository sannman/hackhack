package o0;

import io.flutter.plugin.platform.c;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1082e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1083f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f1084g = new c(4, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f1085a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1086b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1087c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f1088d;

    static {
        Class<o> cls = o.class;
        f1082e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f1083f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public o(int i2, boolean z2) {
        this.f1085a = i2;
        this.f1086b = z2;
        int i3 = i2 - 1;
        this.f1087c = i3;
        this.f1088d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1083f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) == 0) {
                int i2 = (int) (1073741823 & j2);
                int i3 = (int) ((1152921503533105152L & j2) >> 30);
                int i4 = this.f1087c;
                if (((i3 + 2) & i4) == (i2 & i4)) {
                    return 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f1088d;
                if (this.f1086b || atomicReferenceArray.get(i3 & i4) == null) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j2, (-1152921503533105153L & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                        atomicReferenceArray.set(i3 & i4, runnable);
                        o oVar = this;
                        while ((atomicLongFieldUpdater.get(oVar) & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = oVar.f1088d;
                            int i5 = oVar.f1087c & i3;
                            Object obj = atomicReferenceArray2.get(i5);
                            if (!(obj instanceof n) || ((n) obj).f1081a != i3) {
                                oVar = null;
                                continue;
                            } else {
                                atomicReferenceArray2.set(i5, runnable);
                                continue;
                            }
                            if (oVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i6 = this.f1085a;
                    if (i6 < 1024 || ((i3 - i2) & 1073741823) > (i6 >> 1)) {
                        return 1;
                    }
                }
            } else if ((2305843009213693952L & j2) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f1083f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068 A[LOOP:3: B:17:0x0068->B:20:0x0074, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o0.o c() {
        /*
            r11 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1083f
            long r2 = r0.get(r11)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0012
            r1 = r11
            goto L_0x001b
        L_0x0012:
            long r4 = r4 | r2
            r1 = r11
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L_0x0000
            r2 = r4
        L_0x001b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f1082e
            java.lang.Object r5 = r4.get(r11)
            o0.o r5 = (o0.o) r5
            if (r5 == 0) goto L_0x0026
            return r5
        L_0x0026:
            o0.o r5 = new o0.o
            int r6 = r1.f1085a
            int r6 = r6 * 2
            boolean r7 = r1.f1086b
            r5.<init>(r6, r7)
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r2
            int r6 = (int) r6
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
        L_0x0040:
            int r8 = r1.f1087c
            r9 = r6 & r8
            r8 = r8 & r7
            if (r9 == r8) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.f1088d
            java.lang.Object r8 = r8.get(r9)
            if (r8 != 0) goto L_0x0054
            o0.n r8 = new o0.n
            r8.<init>(r6)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r5.f1088d
            int r10 = r5.f1087c
            r10 = r10 & r6
            r9.set(r10, r8)
            int r6 = r6 + 1
            goto L_0x0040
        L_0x005f:
            r6 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r6 = r6 & r2
            r0.set(r5, r6)
        L_0x0068:
            r6 = 0
            boolean r6 = r4.compareAndSet(r11, r6, r5)
            if (r6 == 0) goto L_0x0070
            goto L_0x001b
        L_0x0070:
            java.lang.Object r6 = r4.get(r11)
            if (r6 == 0) goto L_0x0068
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.o.c():o0.o");
    }

    public final Object d() {
        o oVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1083f;
            long j2 = atomicLongFieldUpdater.get(oVar);
            if ((j2 & 1152921504606846976L) != 0) {
                return f1084g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = oVar.f1087c;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = oVar.f1088d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z2 = oVar.f1086b;
            if (obj == null) {
                if (z2) {
                    break;
                }
            } else if (obj instanceof n) {
                break;
            } else {
                long j3 = (long) ((i2 + 1) & 1073741823);
                boolean z3 = z2;
                if (atomicLongFieldUpdater.compareAndSet(oVar, j2, (j2 & -1073741824) | j3)) {
                    atomicReferenceArray.set(i5, (Object) null);
                    return obj;
                }
                oVar = this;
                if (z3) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1083f;
                        long j4 = atomicLongFieldUpdater2.get(oVar);
                        int i6 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                        } else {
                            o oVar2 = oVar;
                            oVar = oVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(oVar2, j4, (j4 & -1073741824) | j3)) {
                                oVar.f1088d.set(oVar.f1087c & i6, (Object) null);
                                oVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (oVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
