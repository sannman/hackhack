package m0;

import X.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.a;

public final class g extends a implements c, d {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f982f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e  reason: collision with root package name */
    public int f983e;

    public g(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014f, code lost:
        if (r5 != r3) goto L_0x0152;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6 A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0 A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2 A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0105 A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0119 A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011a A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013d A[Catch:{ all -> 0x0041, all -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.d r18, V.d r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof m0.f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            m0.f r2 = (m0.f) r2
            int r3 = r2.f981l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f981l = r3
            goto L_0x001e
        L_0x0017:
            m0.f r2 = new m0.f
            X.b r0 = (X.b) r0
            r2.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r2.f979j
            W.a r3 = W.a.f373b
            int r4 = r2.f981l
            r5 = 1
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 2
            if (r4 == 0) goto L_0x0065
            if (r4 == r5) goto L_0x005b
            if (r4 == r9) goto L_0x004c
            if (r4 != r6) goto L_0x0044
            java.lang.Object r4 = r2.f978i
            j0.K r10 = r2.f977h
            m0.i r11 = r2.f976g
            m0.d r12 = r2.f975f
            m0.g r13 = r2.f974e
            a.a.z(r0)     // Catch:{ all -> 0x0041 }
            r0 = r4
            goto L_0x0152
        L_0x0041:
            r0 = move-exception
            goto L_0x0157
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004c:
            java.lang.Object r4 = r2.f978i
            j0.K r10 = r2.f977h
            m0.i r11 = r2.f976g
            m0.d r12 = r2.f975f
            m0.g r13 = r2.f974e
            a.a.z(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0106
        L_0x005b:
            m0.i r11 = r2.f976g
            m0.d r4 = r2.f975f
            m0.g r13 = r2.f974e
            a.a.z(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x00be
        L_0x0065:
            a.a.z(r0)
            monitor-enter(r17)
            n0.b[] r0 = r1.f1033b     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0075
            m0.i[] r0 = new m0.i[r9]     // Catch:{ all -> 0x0072 }
            r1.f1033b = r0     // Catch:{ all -> 0x0072 }
            goto L_0x008c
        L_0x0072:
            r0 = move-exception
            goto L_0x0173
        L_0x0075:
            int r4 = r1.f1034c     // Catch:{ all -> 0x0072 }
            int r10 = r0.length     // Catch:{ all -> 0x0072 }
            if (r4 < r10) goto L_0x008c
            int r4 = r0.length     // Catch:{ all -> 0x0072 }
            int r4 = r4 * r9
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "copyOf(this, newSize)"
            d0.h.d(r0, r4)     // Catch:{ all -> 0x0072 }
            r4 = r0
            n0.b[] r4 = (n0.b[]) r4     // Catch:{ all -> 0x0072 }
            r1.f1033b = r4     // Catch:{ all -> 0x0072 }
            n0.b[] r0 = (n0.b[]) r0     // Catch:{ all -> 0x0072 }
        L_0x008c:
            int r4 = r1.f1035d     // Catch:{ all -> 0x0072 }
        L_0x008e:
            r10 = r0[r4]     // Catch:{ all -> 0x0072 }
            if (r10 != 0) goto L_0x0099
            m0.i r10 = new m0.i     // Catch:{ all -> 0x0072 }
            r10.<init>()     // Catch:{ all -> 0x0072 }
            r0[r4] = r10     // Catch:{ all -> 0x0072 }
        L_0x0099:
            int r4 = r4 + 1
            int r11 = r0.length     // Catch:{ all -> 0x0072 }
            if (r4 < r11) goto L_0x009f
            r4 = r8
        L_0x009f:
            r11 = r10
            m0.i r11 = (m0.i) r11     // Catch:{ all -> 0x0072 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = m0.i.f986a     // Catch:{ all -> 0x0072 }
            java.lang.Object r13 = r12.get(r11)     // Catch:{ all -> 0x0072 }
            if (r13 == 0) goto L_0x00ab
            goto L_0x008e
        L_0x00ab:
            io.flutter.plugin.platform.c r0 = m0.h.f984a     // Catch:{ all -> 0x0072 }
            r12.set(r11, r0)     // Catch:{ all -> 0x0072 }
            r1.f1035d = r4     // Catch:{ all -> 0x0072 }
            int r0 = r1.f1034c     // Catch:{ all -> 0x0072 }
            int r0 = r0 + r5
            r1.f1034c = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r17)
            m0.i r10 = (m0.i) r10
            r4 = r18
            r13 = r1
            r11 = r10
        L_0x00be:
            V.i r0 = r2.f377c     // Catch:{ all -> 0x0041 }
            d0.h.b(r0)     // Catch:{ all -> 0x0041 }
            j0.q r10 = j0.C0059q.f870c     // Catch:{ all -> 0x0041 }
            V.g r0 = r0.g(r10)     // Catch:{ all -> 0x0041 }
            j0.K r0 = (j0.K) r0     // Catch:{ all -> 0x0041 }
            r10 = r0
            r12 = r4
            r0 = r7
        L_0x00ce:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f982f     // Catch:{ all -> 0x0041 }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x0041 }
            if (r10 == 0) goto L_0x00e4
            boolean r14 = r10.b()     // Catch:{ all -> 0x0041 }
            if (r14 == 0) goto L_0x00dd
            goto L_0x00e4
        L_0x00dd:
            j0.T r10 = (j0.T) r10     // Catch:{ all -> 0x0041 }
            java.util.concurrent.CancellationException r0 = r10.v()     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x00e4:
            if (r0 == 0) goto L_0x00ec
            boolean r14 = r0.equals(r4)     // Catch:{ all -> 0x0041 }
            if (r14 != 0) goto L_0x0107
        L_0x00ec:
            io.flutter.plugin.platform.c r0 = n0.e.f1043a     // Catch:{ all -> 0x0041 }
            if (r4 != r0) goto L_0x00f2
            r0 = r7
            goto L_0x00f3
        L_0x00f2:
            r0 = r4
        L_0x00f3:
            r2.f974e = r13     // Catch:{ all -> 0x0041 }
            r2.f975f = r12     // Catch:{ all -> 0x0041 }
            r2.f976g = r11     // Catch:{ all -> 0x0041 }
            r2.f977h = r10     // Catch:{ all -> 0x0041 }
            r2.f978i = r4     // Catch:{ all -> 0x0041 }
            r2.f981l = r9     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r12.b(r0, r2)     // Catch:{ all -> 0x0041 }
            if (r0 != r3) goto L_0x0106
            goto L_0x0151
        L_0x0106:
            r0 = r4
        L_0x0107:
            r11.getClass()     // Catch:{ all -> 0x0041 }
            io.flutter.plugin.platform.c r4 = m0.h.f984a     // Catch:{ all -> 0x0041 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = m0.i.f986a     // Catch:{ all -> 0x0041 }
            java.lang.Object r14 = r14.getAndSet(r11, r4)     // Catch:{ all -> 0x0041 }
            d0.h.b(r14)     // Catch:{ all -> 0x0041 }
            io.flutter.plugin.platform.c r15 = m0.h.f985b     // Catch:{ all -> 0x0041 }
            if (r14 != r15) goto L_0x011a
            goto L_0x00ce
        L_0x011a:
            r2.f974e = r13     // Catch:{ all -> 0x0041 }
            r2.f975f = r12     // Catch:{ all -> 0x0041 }
            r2.f976g = r11     // Catch:{ all -> 0x0041 }
            r2.f977h = r10     // Catch:{ all -> 0x0041 }
            r2.f978i = r0     // Catch:{ all -> 0x0041 }
            r2.f981l = r6     // Catch:{ all -> 0x0041 }
            j0.e r14 = new j0.e     // Catch:{ all -> 0x0041 }
            V.d r15 = a.a.m(r2)     // Catch:{ all -> 0x0041 }
            r14.<init>(r15, r5)     // Catch:{ all -> 0x0041 }
            r14.q()     // Catch:{ all -> 0x0041 }
        L_0x0132:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = m0.i.f986a     // Catch:{ all -> 0x0041 }
            boolean r16 = r15.compareAndSet(r11, r4, r14)     // Catch:{ all -> 0x0041 }
            T.g r5 = T.g.f356a     // Catch:{ all -> 0x0041 }
            if (r16 == 0) goto L_0x013d
            goto L_0x0146
        L_0x013d:
            java.lang.Object r15 = r15.get(r11)     // Catch:{ all -> 0x0041 }
            if (r15 == r4) goto L_0x0155
            r14.c(r5)     // Catch:{ all -> 0x0041 }
        L_0x0146:
            java.lang.Object r4 = r14.p()     // Catch:{ all -> 0x0041 }
            W.a r14 = W.a.f373b     // Catch:{ all -> 0x0041 }
            if (r4 != r14) goto L_0x014f
            r5 = r4
        L_0x014f:
            if (r5 != r3) goto L_0x0152
        L_0x0151:
            return r3
        L_0x0152:
            r5 = 1
            goto L_0x00ce
        L_0x0155:
            r5 = 1
            goto L_0x0132
        L_0x0157:
            monitor-enter(r13)
            int r2 = r13.f1034c     // Catch:{ all -> 0x0163 }
            int r2 = r2 + -1
            r13.f1034c = r2     // Catch:{ all -> 0x0163 }
            if (r2 != 0) goto L_0x0165
            r13.f1035d = r8     // Catch:{ all -> 0x0163 }
            goto L_0x0165
        L_0x0163:
            r0 = move-exception
            goto L_0x0171
        L_0x0165:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            d0.h.c(r11, r2)     // Catch:{ all -> 0x0163 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = m0.i.f986a     // Catch:{ all -> 0x0163 }
            r2.set(r11, r7)     // Catch:{ all -> 0x0163 }
            monitor-exit(r13)
            throw r0
        L_0x0171:
            monitor-exit(r13)
            throw r0
        L_0x0173:
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g.a(m0.d, V.d):java.lang.Object");
    }

    public final Object b(Object obj, b bVar) {
        c(obj);
        return T.g.f356a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = (m0.i[]) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r0 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r1 = r0.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r2 >= r1) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r3 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        r4 = m0.i.f986a;
        r5 = r4.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r6 = m0.h.f985b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r5 != r6) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r7 = m0.h.f984a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r5 != r7) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r4.compareAndSet(r3, r5, r6) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r4.get(r3) == r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        if (r4.compareAndSet(r3, r5, r7) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        ((j0.C0047e) r5).c(T.g.f356a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        if (r4.get(r3) == r5) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = r9.f983e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        if (r0 != r10) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006c, code lost:
        r9.f983e = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r10 = r9.f1033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0076, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        r8 = r0;
        r0 = r10;
        r10 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0004
            io.flutter.plugin.platform.c r10 = n0.e.f1043a
        L_0x0004:
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f982f     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x007d }
            boolean r1 = d0.h.a(r1, r10)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0013
            monitor-exit(r9)
            return
        L_0x0013:
            r0.set(r9, r10)     // Catch:{ all -> 0x007d }
            int r10 = r9.f983e     // Catch:{ all -> 0x007d }
            r0 = r10 & 1
            if (r0 != 0) goto L_0x007f
            int r10 = r10 + 1
            r9.f983e = r10     // Catch:{ all -> 0x007d }
            n0.b[] r0 = r9.f1033b     // Catch:{ all -> 0x007d }
            monitor-exit(r9)
        L_0x0023:
            m0.i[] r0 = (m0.i[]) r0
            if (r0 == 0) goto L_0x0067
            int r1 = r0.length
            r2 = 0
        L_0x0029:
            if (r2 >= r1) goto L_0x0067
            r3 = r0[r2]
            if (r3 == 0) goto L_0x0064
        L_0x002f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m0.i.f986a
            java.lang.Object r5 = r4.get(r3)
            if (r5 != 0) goto L_0x0038
            goto L_0x0064
        L_0x0038:
            io.flutter.plugin.platform.c r6 = m0.h.f985b
            if (r5 != r6) goto L_0x003d
            goto L_0x0064
        L_0x003d:
            io.flutter.plugin.platform.c r7 = m0.h.f984a
            if (r5 != r7) goto L_0x004f
        L_0x0041:
            boolean r7 = r4.compareAndSet(r3, r5, r6)
            if (r7 == 0) goto L_0x0048
            goto L_0x0064
        L_0x0048:
            java.lang.Object r7 = r4.get(r3)
            if (r7 == r5) goto L_0x0041
            goto L_0x002f
        L_0x004f:
            boolean r6 = r4.compareAndSet(r3, r5, r7)
            if (r6 == 0) goto L_0x005d
            j0.e r5 = (j0.C0047e) r5
            T.g r3 = T.g.f356a
            r5.c(r3)
            goto L_0x0064
        L_0x005d:
            java.lang.Object r6 = r4.get(r3)
            if (r6 == r5) goto L_0x004f
            goto L_0x002f
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0067:
            monitor-enter(r9)
            int r0 = r9.f983e     // Catch:{ all -> 0x0072 }
            if (r0 != r10) goto L_0x0074
            int r10 = r10 + 1
            r9.f983e = r10     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            return
        L_0x0072:
            r10 = move-exception
            goto L_0x007b
        L_0x0074:
            n0.b[] r10 = r9.f1033b     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x0023
        L_0x007b:
            monitor-exit(r9)
            throw r10
        L_0x007d:
            r10 = move-exception
            goto L_0x0085
        L_0x007f:
            int r10 = r10 + 2
            r9.f983e = r10     // Catch:{ all -> 0x007d }
            monitor-exit(r9)
            return
        L_0x0085:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g.c(java.lang.Object):void");
    }
}
