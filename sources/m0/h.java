package m0;

import io.flutter.plugin.platform.c;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final c f984a = new c(4, "NONE");

    /* renamed from: b  reason: collision with root package name */
    public static final c f985b = new c(4, "PENDING");

    /* JADX WARNING: type inference failed for: r0v2, types: [X.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r2.b(r11, r0) == r1) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        if (r10 != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        if ((r8 instanceof java.util.concurrent.CancellationException) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bd, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        if (r3 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        r3 = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
        r3.initCause(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cc, code lost:
        r9.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cf, code lost:
        throw r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(m0.d r8, l0.q r9, boolean r10, X.b r11) {
        /*
            boolean r0 = r11 instanceof m0.e
            if (r0 == 0) goto L_0x0013
            r0 = r11
            m0.e r0 = (m0.e) r0
            int r1 = r0.f973j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f973j = r1
            goto L_0x0018
        L_0x0013:
            m0.e r0 = new m0.e
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f972i
            W.a r1 = W.a.f373b
            int r2 = r0.f973j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            boolean r10 = r0.f971h
            l0.a r8 = r0.f970g
            l0.s r9 = r0.f969f
            m0.d r2 = r0.f968e
            a.a.z(r11)     // Catch:{ all -> 0x0036 }
        L_0x0032:
            r7 = r2
            r2 = r8
            r8 = r7
            goto L_0x005a
        L_0x0036:
            r8 = move-exception
            goto L_0x00b5
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0041:
            boolean r10 = r0.f971h
            l0.a r8 = r0.f970g
            l0.s r9 = r0.f969f
            m0.d r2 = r0.f968e
            a.a.z(r11)     // Catch:{ all -> 0x0036 }
            goto L_0x006e
        L_0x004d:
            a.a.z(r11)
            l0.c r11 = r9.f957e     // Catch:{ all -> 0x0036 }
            r11.getClass()     // Catch:{ all -> 0x0036 }
            l0.a r2 = new l0.a     // Catch:{ all -> 0x0036 }
            r2.<init>(r11)     // Catch:{ all -> 0x0036 }
        L_0x005a:
            r0.f968e = r8     // Catch:{ all -> 0x0036 }
            r0.f969f = r9     // Catch:{ all -> 0x0036 }
            r0.f970g = r2     // Catch:{ all -> 0x0036 }
            r0.f971h = r10     // Catch:{ all -> 0x0036 }
            r0.f973j = r5     // Catch:{ all -> 0x0036 }
            java.lang.Object r11 = r2.b(r0)     // Catch:{ all -> 0x0036 }
            if (r11 != r1) goto L_0x006b
            goto L_0x0092
        L_0x006b:
            r7 = r2
            r2 = r8
            r8 = r7
        L_0x006e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0036 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r11 == 0) goto L_0x00ad
            java.lang.Object r11 = r8.f913b     // Catch:{ all -> 0x0036 }
            io.flutter.plugin.platform.c r6 = l0.e.f941p     // Catch:{ all -> 0x0036 }
            if (r11 == r6) goto L_0x00a5
            r8.f913b = r6     // Catch:{ all -> 0x0036 }
            io.flutter.plugin.platform.c r6 = l0.e.f938l     // Catch:{ all -> 0x0036 }
            if (r11 == r6) goto L_0x0093
            r0.f968e = r2     // Catch:{ all -> 0x0036 }
            r0.f969f = r9     // Catch:{ all -> 0x0036 }
            r0.f970g = r8     // Catch:{ all -> 0x0036 }
            r0.f971h = r10     // Catch:{ all -> 0x0036 }
            r0.f973j = r4     // Catch:{ all -> 0x0036 }
            java.lang.Object r11 = r2.b(r11, r0)     // Catch:{ all -> 0x0036 }
            if (r11 != r1) goto L_0x0032
        L_0x0092:
            return r1
        L_0x0093:
            l0.c r8 = r8.f915d     // Catch:{ all -> 0x0036 }
            java.lang.Throwable r8 = r8.k()     // Catch:{ all -> 0x0036 }
            if (r8 != 0) goto L_0x00a2
            l0.l r8 = new l0.l     // Catch:{ all -> 0x0036 }
            java.lang.String r11 = "Channel was closed"
            r8.<init>(r11)     // Catch:{ all -> 0x0036 }
        L_0x00a2:
            int r11 = o0.w.f1094a     // Catch:{ all -> 0x0036 }
            throw r8     // Catch:{ all -> 0x0036 }
        L_0x00a5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0036 }
            java.lang.String r11 = "`hasNext()` has not been invoked"
            r8.<init>(r11)     // Catch:{ all -> 0x0036 }
            throw r8     // Catch:{ all -> 0x0036 }
        L_0x00ad:
            if (r10 == 0) goto L_0x00b2
            r9.a(r3)
        L_0x00b2:
            T.g r8 = T.g.f356a
            return r8
        L_0x00b5:
            throw r8     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r11 = move-exception
            if (r10 == 0) goto L_0x00cf
            boolean r10 = r8 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L_0x00c0
            r3 = r8
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L_0x00c0:
            if (r3 != 0) goto L_0x00cc
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Channel was consumed, consumer had failed"
            r3.<init>(r10)
            r3.initCause(r8)
        L_0x00cc:
            r9.a(r3)
        L_0x00cf:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.h.a(m0.d, l0.q, boolean, X.b):java.lang.Object");
    }
}
