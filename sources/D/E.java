package D;

import M.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

public final class E implements I {

    /* renamed from: b  reason: collision with root package name */
    public final f f30b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f31c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f32d;

    /* renamed from: e  reason: collision with root package name */
    public final F f33e;

    /* JADX WARNING: type inference failed for: r4v2, types: [D.N, java.lang.Object] */
    public E(f fVar) {
        HashMap hashMap = new HashMap();
        this.f32d = hashMap;
        this.f33e = new F();
        this.f30b = fVar;
        K k2 = O.f46a;
        ? obj = new Object();
        obj.f45a = false;
        N n2 = new N[]{obj}[0];
        n2.getClass();
        hashMap.put(4294967556L, n2);
    }

    /* JADX WARNING: type inference failed for: r1v26, types: [D.B, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.KeyEvent r32, D.G r33) {
        /*
            r31 = this;
            r0 = r31
            r7 = r33
            int r1 = r32.getScanCode()
            r9 = 0
            if (r1 != 0) goto L_0x0016
            int r1 = r32.getKeyCode()
            if (r1 != 0) goto L_0x0016
            r22 = r9
            goto L_0x02e5
        L_0x0016:
            int r1 = r32.getScanCode()
            long r1 = (long) r1
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            r4 = 73014444032(0x1100000000, double:3.60739284464E-313)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r3 != 0) goto L_0x0036
            int r1 = r32.getKeyCode()
            long r1 = (long) r1
            long r1 = r1 & r11
            long r1 = r1 | r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0034:
            r13 = r1
            goto L_0x0051
        L_0x0036:
            D.K r3 = D.O.f46a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0045
            goto L_0x0034
        L_0x0045:
            int r1 = r32.getScanCode()
            long r1 = (long) r1
            long r1 = r1 & r11
            long r1 = r1 | r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0034
        L_0x0051:
            D.K r1 = D.O.f47b
            int r2 = r32.getKeyCode()
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0066
        L_0x0064:
            r11 = r1
            goto L_0x0072
        L_0x0066:
            int r1 = r32.getKeyCode()
            long r1 = (long) r1
            long r1 = r1 & r11
            long r1 = r1 | r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0064
        L_0x0072:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            D.M[] r14 = D.O.f48c
            int r15 = r14.length
            r2 = 0
        L_0x007b:
            java.util.HashMap r3 = r0.f31c
            r5 = 2
            if (r2 >= r15) goto L_0x0203
            r6 = r14[r2]
            int r16 = r32.getMetaState()
            int r1 = r6.f43a
            r1 = r16 & r1
            if (r1 == 0) goto L_0x008f
            r16 = 1
            goto L_0x0091
        L_0x008f:
            r16 = 0
        L_0x0091:
            long r18 = r11.longValue()
            long r20 = r13.longValue()
            D.L[] r1 = r6.f44b
            boolean[] r6 = new boolean[r5]
            r22 = r9
            java.lang.Boolean[] r9 = new java.lang.Boolean[r5]
            r10 = 0
            r24 = 0
        L_0x00a4:
            if (r10 >= r5) goto L_0x0189
            r25 = r2
            r2 = r1[r10]
            long r4 = r2.f41a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r4 = r3.containsKey(r4)
            r6[r10] = r4
            r27 = r9
            long r8 = r2.f42b
            int r5 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x015f
            int r4 = r32.getRepeatCount()
            if (r4 <= 0) goto L_0x00c6
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            int r5 = r32.getAction()
            if (r5 == 0) goto L_0x00da
            r8 = 1
            if (r5 != r8) goto L_0x00d2
            r4 = 2
            goto L_0x00df
        L_0x00d2:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Unexpected event type"
            r1.<init>(r2)
            throw r1
        L_0x00da:
            if (r4 == 0) goto L_0x00de
            r4 = 3
            goto L_0x00df
        L_0x00de:
            r4 = 1
        L_0x00df:
            int r4 = n.d.a(r4)
            if (r4 == 0) goto L_0x013f
            r8 = 1
            if (r4 == r8) goto L_0x012b
            r5 = 2
            if (r4 == r5) goto L_0x00f6
            r9 = r3
            r8 = r5
            r3 = r20
            r17 = 0
            r20 = r1
            r21 = r6
            goto L_0x013d
        L_0x00f6:
            if (r16 != 0) goto L_0x0115
            D.D r0 = new D.D
            r4 = r6
            r6 = 1
            r17 = 0
            r9 = r3
            r8 = r5
            r5 = r32
            r28 = r1
            r1 = r31
            r29 = r20
            r20 = r28
            r21 = r4
            r3 = r29
            r0.<init>(r1, r2, r3, r5, r6)
            r12.add(r0)
            goto L_0x011f
        L_0x0115:
            r9 = r3
            r8 = r5
            r3 = r20
            r17 = 0
            r20 = r1
            r21 = r6
        L_0x011f:
            boolean r0 = r21[r10]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r27[r10] = r0
        L_0x0127:
            r0 = r3
        L_0x0128:
            r24 = 1
            goto L_0x0175
        L_0x012b:
            r9 = r3
            r3 = r20
            r8 = 2
            r17 = 0
            r20 = r1
            r21 = r6
            boolean r0 = r21[r10]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r27[r10] = r0
        L_0x013d:
            r0 = r3
            goto L_0x0175
        L_0x013f:
            r9 = r3
            r3 = r20
            r8 = 2
            r17 = 0
            r20 = r1
            r21 = r6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r27[r10] = r0
            if (r16 != 0) goto L_0x0127
            D.D r0 = new D.D
            r6 = 0
            r1 = r31
            r5 = r32
            r0.<init>(r1, r2, r3, r5, r6)
            r2 = r0
            r0 = r3
            r12.add(r2)
            goto L_0x0128
        L_0x015f:
            r8 = r20
            r20 = r1
            r0 = r8
            r9 = r3
            r21 = r6
            r8 = 2
            r17 = 0
            if (r24 != 0) goto L_0x0172
            if (r4 == 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            r2 = r17
            goto L_0x0173
        L_0x0172:
            r2 = 1
        L_0x0173:
            r24 = r2
        L_0x0175:
            int r10 = r10 + 1
            r5 = r8
            r3 = r9
            r6 = r21
            r2 = r25
            r9 = r27
            r28 = r0
            r0 = r31
            r1 = r20
            r20 = r28
            goto L_0x00a4
        L_0x0189:
            r20 = r1
            r25 = r2
            r8 = r5
            r21 = r6
            r27 = r9
            r17 = 0
            if (r16 == 0) goto L_0x01ba
            r1 = r17
        L_0x0198:
            if (r1 >= r8) goto L_0x01b3
            r0 = r27[r1]
            if (r0 == 0) goto L_0x019f
            goto L_0x01b0
        L_0x019f:
            if (r24 == 0) goto L_0x01aa
            boolean r0 = r21[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r27[r1] = r0
            goto L_0x01b0
        L_0x01aa:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r27[r1] = r0
            r24 = 1
        L_0x01b0:
            int r1 = r1 + 1
            goto L_0x0198
        L_0x01b3:
            if (r24 != 0) goto L_0x01ca
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r27[r17] = r0
            goto L_0x01ca
        L_0x01ba:
            r1 = r17
        L_0x01bc:
            if (r1 >= r8) goto L_0x01ca
            r0 = r27[r1]
            if (r0 == 0) goto L_0x01c3
            goto L_0x01c7
        L_0x01c3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r27[r1] = r0
        L_0x01c7:
            int r1 = r1 + 1
            goto L_0x01bc
        L_0x01ca:
            r6 = r17
        L_0x01cc:
            if (r6 >= r8) goto L_0x01fb
            boolean r0 = r21[r6]
            r1 = r27[r6]
            boolean r1 = r1.booleanValue()
            if (r0 == r1) goto L_0x01f6
            r0 = r20[r6]
            r1 = r27[r6]
            boolean r1 = r1.booleanValue()
            long r2 = r0.f42b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.f41a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r32.getEventTime()
            r0 = r31
            r0.c(r1, r2, r3, r4)
            goto L_0x01f8
        L_0x01f6:
            r0 = r31
        L_0x01f8:
            int r6 = r6 + 1
            goto L_0x01cc
        L_0x01fb:
            r0 = r31
            int r2 = r25 + 1
            r9 = r22
            goto L_0x007b
        L_0x0203:
            r8 = r5
            r22 = r9
            r17 = 0
            r9 = r3
            java.util.HashMap r6 = r0.f32d
            java.util.Collection r1 = r6.values()
            java.util.Iterator r10 = r1.iterator()
        L_0x0213:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0286
            java.lang.Object r1 = r10.next()
            r14 = r1
            D.N r14 = (D.N) r14
            int r1 = r32.getMetaState()
            r14.getClass()
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x022e
            r1 = 1
            goto L_0x0230
        L_0x022e:
            r1 = r17
        L_0x0230:
            long r2 = r11.longValue()
            r4 = 4294967556(0x100000104, double:2.1219959194E-314)
            r15 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            int r3 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0243
            goto L_0x0283
        L_0x0243:
            boolean r3 = r14.f45a
            if (r3 == r1) goto L_0x0283
            r15 = 458809(0x70039, double:2.26682E-318)
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            boolean r18 = r9.containsKey(r1)
            r1 = r18 ^ 1
            if (r18 != 0) goto L_0x025f
            boolean r3 = r14.f45a
            r26 = 1
            r3 = r3 ^ 1
            r14.f45a = r3
            goto L_0x0261
        L_0x025f:
            r26 = 1
        L_0x0261:
            java.lang.Long r3 = java.lang.Long.valueOf(r15)
            long r4 = r32.getEventTime()
            r0.c(r1, r2, r3, r4)
            if (r18 == 0) goto L_0x0274
            boolean r0 = r14.f45a
            r0 = r0 ^ 1
            r14.f45a = r0
        L_0x0274:
            java.lang.Long r3 = java.lang.Long.valueOf(r15)
            long r4 = r32.getEventTime()
            r0 = r31
            r1 = r18
            r0.c(r1, r2, r3, r4)
        L_0x0283:
            r0 = r31
            goto L_0x0213
        L_0x0286:
            int r0 = r32.getAction()
            if (r0 == 0) goto L_0x0295
            r1 = 1
            if (r0 == r1) goto L_0x0292
            r0 = r31
            goto L_0x02e5
        L_0x0292:
            r10 = r17
            goto L_0x0296
        L_0x0295:
            r10 = 1
        L_0x0296:
            java.lang.Object r0 = r9.get(r13)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r9 = 0
            if (r10 == 0) goto L_0x02e0
            if (r2 != 0) goto L_0x02a7
            r4 = 1
        L_0x02a3:
            r0 = r31
            r3 = r13
            goto L_0x02bb
        L_0x02a7:
            int r0 = r32.getRepeatCount()
            if (r0 <= 0) goto L_0x02af
            r4 = 3
            goto L_0x02a3
        L_0x02af:
            r1 = 0
            long r4 = r32.getEventTime()
            r0 = r31
            r3 = r13
            r0.c(r1, r2, r3, r4)
            r4 = 1
        L_0x02bb:
            D.F r1 = r0.f33e
            int r2 = r32.getUnicodeChar()
            java.lang.Character r1 = r1.a(r2)
            char r1 = r1.charValue()
            if (r1 == 0) goto L_0x02da
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = ""
            r2.<init>(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02db
        L_0x02da:
            r1 = r9
        L_0x02db:
            r2 = r1
            r5 = r4
        L_0x02dd:
            r1 = 1
            r4 = 3
            goto L_0x02fb
        L_0x02e0:
            r0 = r31
            r3 = r13
            if (r2 != 0) goto L_0x02f8
        L_0x02e5:
            java.lang.Long r2 = java.lang.Long.valueOf(r22)
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            r4 = 0
            r1 = 1
            r0.c(r1, r2, r3, r4)
            r1 = 1
            r7.a(r1)
            return
        L_0x02f8:
            r5 = r8
            r2 = r9
            goto L_0x02dd
        L_0x02fb:
            if (r5 == r4) goto L_0x0303
            if (r10 == 0) goto L_0x0300
            r9 = r11
        L_0x0300:
            r0.d(r3, r9)
        L_0x0303:
            if (r5 != r1) goto L_0x0312
            java.lang.Object r4 = r6.get(r11)
            D.N r4 = (D.N) r4
            if (r4 == 0) goto L_0x0312
            boolean r6 = r4.f45a
            r6 = r6 ^ r1
            r4.f45a = r6
        L_0x0312:
            D.B r1 = new D.B
            r1.<init>()
            int r4 = r32.getSource()
            r6 = 513(0x201, float:7.19E-43)
            if (r4 == r6) goto L_0x033d
            r6 = 1025(0x401, float:1.436E-42)
            if (r4 == r6) goto L_0x0339
            r6 = 16777232(0x1000010, float:2.3509932E-38)
            if (r4 == r6) goto L_0x0335
            r6 = 33554433(0x2000001, float:9.403956E-38)
            if (r4 == r6) goto L_0x0331
            r8 = 1
            r1.f22f = r8
            goto L_0x033f
        L_0x0331:
            r4 = 5
            r1.f22f = r4
            goto L_0x033f
        L_0x0335:
            r4 = 4
            r1.f22f = r4
            goto L_0x033f
        L_0x0339:
            r4 = 3
            r1.f22f = r4
            goto L_0x033f
        L_0x033d:
            r1.f22f = r8
        L_0x033f:
            long r8 = r32.getEventTime()
            r1.f17a = r8
            r1.f18b = r5
            long r4 = r11.longValue()
            r1.f20d = r4
            long r3 = r3.longValue()
            r1.f19c = r3
            r1.f23g = r2
            r2 = r17
            r1.f21e = r2
            r0.b(r1, r7)
            java.util.Iterator r1 = r12.iterator()
        L_0x0360:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0370
            java.lang.Object r2 = r1.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x0360
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.E.a(android.view.KeyEvent, D.G):void");
    }

    public final void b(B b2, G g2) {
        C c2;
        int i2;
        long j2;
        long j3;
        long j4;
        byte[] bArr = null;
        if (g2 == null) {
            c2 = null;
        } else {
            c2 = new C(g2);
        }
        try {
            String str = b2.f23g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            if (bArr == null) {
                i2 = 0;
            } else {
                i2 = bArr.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) i2);
            allocateDirect.putLong(b2.f17a);
            int i3 = b2.f18b;
            if (i3 == 1) {
                j2 = 0;
            } else if (i3 == 2) {
                j2 = 1;
            } else if (i3 == 3) {
                j2 = 2;
            } else {
                throw null;
            }
            allocateDirect.putLong(j2);
            allocateDirect.putLong(b2.f19c);
            allocateDirect.putLong(b2.f20d);
            if (b2.f21e) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            allocateDirect.putLong(j3);
            int i4 = b2.f22f;
            if (i4 == 1) {
                j4 = 0;
            } else if (i4 == 2) {
                j4 = 1;
            } else if (i4 == 3) {
                j4 = 2;
            } else if (i4 == 4) {
                j4 = 3;
            } else if (i4 == 5) {
                j4 = 4;
            } else {
                throw null;
            }
            allocateDirect.putLong(j4);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f30b.f("flutter/keydata", allocateDirect, c2);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [D.B, java.lang.Object] */
    public final void c(boolean z2, Long l2, Long l3, long j2) {
        int i2;
        ? obj = new Object();
        obj.f17a = j2;
        if (z2) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        obj.f18b = i2;
        obj.f20d = l2.longValue();
        obj.f19c = l3.longValue();
        obj.f23g = null;
        obj.f21e = true;
        obj.f22f = 1;
        if (!(l3.longValue() == 0 || l2.longValue() == 0)) {
            if (!z2) {
                l2 = null;
            }
            d(l3, l2);
        }
        b(obj, (G) null);
    }

    public final void d(Long l2, Long l3) {
        HashMap hashMap = this.f31c;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
