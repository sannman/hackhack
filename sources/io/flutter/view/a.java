package io.flutter.view;

import E.l;
import E.m;

public final class a implements l, m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f688a;

    public /* synthetic */ a(Object obj) {
        this.f688a = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: io.flutter.view.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.nio.ByteBuffer r18, java.lang.String[] r19, java.nio.ByteBuffer[] r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            int r2 = r1.length
            r4 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x0017
            r5 = r1[r4]
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            r5.order(r6)
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0017:
            r4 = r17
            java.lang.Object r2 = r4.f688a
            io.flutter.view.k r2 = (io.flutter.view.k) r2
            r2.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0025:
            boolean r6 = r0.hasRemaining()
            r7 = 16
            r8 = -1
            r9 = 1
            r10 = 14
            B.a r11 = r2.f776e
            r12 = 0
            if (r6 == 0) goto L_0x01f7
            int r6 = r0.getInt()
            io.flutter.view.g r6 = r2.b(r6)
            r6.f721C = r9
            java.lang.String r13 = r6.f759r
            r6.I = r13
            java.lang.String r13 = r6.f757p
            r6.f727J = r13
            long r13 = r6.f745c
            r6.f722D = r13
            int r13 = r6.f746d
            r6.f723E = r13
            int r13 = r6.f749g
            r6.f724F = r13
            int r13 = r6.f750h
            r6.f725G = r13
            float r13 = r6.f754l
            r6.f726H = r13
            long r13 = r0.getLong()
            r6.f745c = r13
            int r13 = r0.getInt()
            r6.f746d = r13
            int r13 = r0.getInt()
            r6.f747e = r13
            int r13 = r0.getInt()
            r6.f748f = r13
            int r13 = r0.getInt()
            r6.f749g = r13
            int r13 = r0.getInt()
            r6.f750h = r13
            int r13 = r0.getInt()
            r6.f751i = r13
            int r13 = r0.getInt()
            r6.f752j = r13
            int r13 = r0.getInt()
            r6.f753k = r13
            float r13 = r0.getFloat()
            r6.f754l = r13
            float r13 = r0.getFloat()
            r6.m = r13
            float r13 = r0.getFloat()
            r6.f755n = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x00aa
            r13 = r12
            goto L_0x00ac
        L_0x00aa:
            r13 = r19[r13]
        L_0x00ac:
            r6.f756o = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x00b6
            r13 = r12
            goto L_0x00b8
        L_0x00b6:
            r13 = r19[r13]
        L_0x00b8:
            r6.f757p = r13
            java.util.ArrayList r13 = io.flutter.view.g.g(r0, r1)
            r6.f758q = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x00c8
            r13 = r12
            goto L_0x00ca
        L_0x00c8:
            r13 = r19[r13]
        L_0x00ca:
            r6.f759r = r13
            java.util.ArrayList r13 = io.flutter.view.g.g(r0, r1)
            r6.f760s = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x00da
            r13 = r12
            goto L_0x00dc
        L_0x00da:
            r13 = r19[r13]
        L_0x00dc:
            r6.f761t = r13
            java.util.ArrayList r13 = io.flutter.view.g.g(r0, r1)
            r6.u = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x00ec
            r13 = r12
            goto L_0x00ee
        L_0x00ec:
            r13 = r19[r13]
        L_0x00ee:
            r6.f762v = r13
            java.util.ArrayList r13 = io.flutter.view.g.g(r0, r1)
            r6.f763w = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x00fe
            r13 = r12
            goto L_0x0100
        L_0x00fe:
            r13 = r19[r13]
        L_0x0100:
            r6.f764x = r13
            java.util.ArrayList r13 = io.flutter.view.g.g(r0, r1)
            r6.f765y = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x0110
            r13 = r12
            goto L_0x0112
        L_0x0110:
            r13 = r19[r13]
        L_0x0112:
            r6.f766z = r13
            int r13 = r0.getInt()
            if (r13 != r8) goto L_0x011c
            r13 = r12
            goto L_0x011e
        L_0x011c:
            r13 = r19[r13]
        L_0x011e:
            r6.A = r13
            r0.getInt()
            float r13 = r0.getFloat()
            r6.K = r13
            float r13 = r0.getFloat()
            r6.f728L = r13
            float r13 = r0.getFloat()
            r6.f729M = r13
            float r13 = r0.getFloat()
            r6.f730N = r13
            float[] r13 = r6.f731O
            if (r13 != 0) goto L_0x0143
            float[] r13 = new float[r7]
            r6.f731O = r13
        L_0x0143:
            r13 = 0
        L_0x0144:
            if (r13 >= r7) goto L_0x0151
            float[] r14 = r6.f731O
            float r15 = r0.getFloat()
            r14[r13] = r15
            int r13 = r13 + 1
            goto L_0x0144
        L_0x0151:
            r6.f738V = r9
            r6.f740X = r9
            int r7 = r0.getInt()
            java.util.ArrayList r13 = r6.f733Q
            r13.clear()
            java.util.ArrayList r14 = r6.f734R
            r14.clear()
            r15 = 0
            r16 = 0
        L_0x0166:
            io.flutter.view.k r3 = r6.f743a
            if (r15 >= r7) goto L_0x017b
            int r8 = r0.getInt()
            io.flutter.view.g r3 = r3.b(r8)
            r3.f732P = r6
            r13.add(r3)
            int r15 = r15 + 1
            r8 = -1
            goto L_0x0166
        L_0x017b:
            r8 = r16
        L_0x017d:
            if (r8 >= r7) goto L_0x018f
            int r13 = r0.getInt()
            io.flutter.view.g r13 = r3.b(r13)
            r13.f732P = r6
            r14.add(r13)
            int r8 = r8 + 1
            goto L_0x017d
        L_0x018f:
            int r7 = r0.getInt()
            if (r7 != 0) goto L_0x0198
            r6.f735S = r12
            goto L_0x01cd
        L_0x0198:
            java.util.ArrayList r8 = r6.f735S
            if (r8 != 0) goto L_0x01a4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r7)
            r6.f735S = r8
            goto L_0x01a7
        L_0x01a4:
            r8.clear()
        L_0x01a7:
            r8 = r16
        L_0x01a9:
            if (r8 >= r7) goto L_0x01cd
            int r12 = r0.getInt()
            io.flutter.view.e r12 = r3.a(r12)
            int r13 = r12.f716c
            if (r13 != r9) goto L_0x01ba
            r6.f736T = r12
            goto L_0x01c5
        L_0x01ba:
            r14 = 2
            if (r13 != r14) goto L_0x01c0
            r6.f737U = r12
            goto L_0x01c5
        L_0x01c0:
            java.util.ArrayList r13 = r6.f735S
            r13.add(r12)
        L_0x01c5:
            java.util.ArrayList r13 = r6.f735S
            r13.add(r12)
            int r8 = r8 + 1
            goto L_0x01a9
        L_0x01cd:
            boolean r3 = r6.h(r10)
            if (r3 == 0) goto L_0x01d5
            goto L_0x0025
        L_0x01d5:
            r3 = 6
            boolean r3 = r6.h(r3)
            if (r3 == 0) goto L_0x01de
            r2.f783l = r6
        L_0x01de:
            boolean r3 = r6.f721C
            if (r3 == 0) goto L_0x01e5
            r5.add(r6)
        L_0x01e5:
            int r3 = r6.f751i
            r7 = -1
            if (r3 == r7) goto L_0x0025
            boolean r3 = r11.k(r3)
            if (r3 != 0) goto L_0x0025
            int r3 = r6.f751i
            r11.j(r3)
            goto L_0x0025
        L_0x01f7:
            r16 = 0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = r2.f778g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            java.lang.Object r3 = r1.get(r3)
            io.flutter.view.g r3 = (io.flutter.view.g) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r3 == 0) goto L_0x021e
            float[] r8 = new float[r7]
            r13 = r16
            android.opengl.Matrix.setIdentityM(r8, r13)
            r3.l(r8, r0, r13)
            r3.c(r6)
        L_0x021e:
            java.util.Iterator r3 = r6.iterator()
            r8 = r12
        L_0x0223:
            boolean r13 = r3.hasNext()
            java.util.ArrayList r14 = r2.f785o
            if (r13 == 0) goto L_0x023f
            java.lang.Object r13 = r3.next()
            io.flutter.view.g r13 = (io.flutter.view.g) r13
            int r15 = r13.f744b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r14 = r14.contains(r15)
            if (r14 != 0) goto L_0x0223
            r8 = r13
            goto L_0x0223
        L_0x023f:
            if (r8 != 0) goto L_0x0253
            int r3 = r6.size()
            if (r3 <= 0) goto L_0x0253
            int r3 = r6.size()
            int r3 = r3 - r9
            java.lang.Object r3 = r6.get(r3)
            r8 = r3
            io.flutter.view.g r8 = (io.flutter.view.g) r8
        L_0x0253:
            if (r8 == 0) goto L_0x028f
            int r3 = r8.f744b
            int r13 = r2.f786p
            if (r3 != r13) goto L_0x0265
            int r3 = r6.size()
            int r13 = r14.size()
            if (r3 == r13) goto L_0x028f
        L_0x0265:
            int r3 = r8.f744b
            r2.f786p = r3
            java.lang.String r3 = r8.f()
            if (r3 != 0) goto L_0x0271
            java.lang.String r3 = " "
        L_0x0271:
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 28
            if (r13 < r15) goto L_0x027d
            android.view.View r8 = r2.f772a
            r8.setAccessibilityPaneTitle(r3)
            goto L_0x028f
        L_0x027d:
            int r8 = r8.f744b
            r13 = 32
            android.view.accessibility.AccessibilityEvent r8 = r2.c(r8, r13)
            java.util.List r13 = r8.getText()
            r13.add(r3)
            r2.g(r8)
        L_0x028f:
            r14.clear()
            java.util.Iterator r3 = r6.iterator()
        L_0x0296:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02ac
            java.lang.Object r6 = r3.next()
            io.flutter.view.g r6 = (io.flutter.view.g) r6
            int r6 = r6.f744b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x0296
        L_0x02ac:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02b4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x031a
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            io.flutter.view.g r3 = (io.flutter.view.g) r3
            boolean r6 = r0.contains(r3)
            if (r6 != 0) goto L_0x0318
            r3.f732P = r12
            int r6 = r3.f751i
            r8 = 65536(0x10000, float:9.18355E-41)
            r13 = -1
            if (r6 == r13) goto L_0x02f5
            java.lang.Integer r6 = r2.f781j
            if (r6 == 0) goto L_0x02f5
            io.flutter.view.AccessibilityViewEmbedder r13 = r2.f775d
            int r6 = r6.intValue()
            android.view.View r6 = r13.platformViewOfNode(r6)
            int r13 = r3.f751i
            r11.j(r13)
            if (r6 != 0) goto L_0x02f5
            java.lang.Integer r6 = r2.f781j
            int r6 = r6.intValue()
            r2.f(r6, r8)
            r2.f781j = r12
        L_0x02f5:
            int r6 = r3.f751i
            r13 = -1
            if (r6 == r13) goto L_0x02fd
            r11.j(r6)
        L_0x02fd:
            io.flutter.view.g r6 = r2.f780i
            if (r6 != r3) goto L_0x0308
            int r6 = r6.f744b
            r2.f(r6, r8)
            r2.f780i = r12
        L_0x0308:
            io.flutter.view.g r6 = r2.f783l
            if (r6 != r3) goto L_0x030e
            r2.f783l = r12
        L_0x030e:
            io.flutter.view.g r6 = r2.f784n
            if (r6 != r3) goto L_0x0314
            r2.f784n = r12
        L_0x0314:
            r1.remove()
            goto L_0x02b4
        L_0x0318:
            r13 = -1
            goto L_0x02b4
        L_0x031a:
            r0 = 2048(0x800, float:2.87E-42)
            r13 = 0
            android.view.accessibility.AccessibilityEvent r1 = r2.c(r13, r0)
            r1.setContentChangeTypes(r9)
            r2.g(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x032b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0536
            java.lang.Object r3 = r1.next()
            io.flutter.view.g r3 = (io.flutter.view.g) r3
            float r5 = r3.f754l
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x03db
            float r5 = r3.f726H
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x03db
            float r5 = r3.f726H
            float r6 = r3.f754l
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x03db
            int r5 = r3.f744b
            r6 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r5 = r2.c(r5, r6)
            float r6 = r3.f754l
            float r8 = r3.m
            boolean r11 = java.lang.Float.isInfinite(r8)
            r14 = 1203982336(0x47c35000, float:100000.0)
            if (r11 == 0) goto L_0x036d
            r8 = 1200142336(0x4788b800, float:70000.0)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x036c
            r6 = r8
        L_0x036c:
            r8 = r14
        L_0x036d:
            float r11 = r3.f755n
            boolean r11 = java.lang.Float.isInfinite(r11)
            if (r11 == 0) goto L_0x0380
            float r8 = r8 + r14
            r11 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x037e
            r6 = r11
        L_0x037e:
            float r6 = r6 + r14
            goto L_0x0384
        L_0x0380:
            float r11 = r3.f755n
            float r8 = r8 - r11
            float r6 = r6 - r11
        L_0x0384:
            int r11 = r3.f723E
            r14 = r11 & 16
            if (r14 == 0) goto L_0x038b
            goto L_0x038f
        L_0x038b:
            r14 = r11 & 32
            if (r14 == 0) goto L_0x0398
        L_0x038f:
            int r6 = (int) r6
            r5.setScrollY(r6)
            int r6 = (int) r8
            r5.setMaxScrollY(r6)
            goto L_0x03a9
        L_0x0398:
            r14 = r11 & 4
            if (r14 == 0) goto L_0x039d
            goto L_0x03a1
        L_0x039d:
            r11 = r11 & 8
            if (r11 == 0) goto L_0x03a9
        L_0x03a1:
            int r6 = (int) r6
            r5.setScrollX(r6)
            int r6 = (int) r8
            r5.setMaxScrollX(r6)
        L_0x03a9:
            int r6 = r3.f752j
            if (r6 <= 0) goto L_0x03d8
            r5.setItemCount(r6)
            int r6 = r3.f753k
            r5.setFromIndex(r6)
            java.util.ArrayList r6 = r3.f734R
            java.util.Iterator r6 = r6.iterator()
            r8 = r13
        L_0x03bc:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x03d1
            java.lang.Object r11 = r6.next()
            io.flutter.view.g r11 = (io.flutter.view.g) r11
            boolean r11 = r11.h(r10)
            if (r11 != 0) goto L_0x03bc
            int r8 = r8 + 1
            goto L_0x03bc
        L_0x03d1:
            int r6 = r3.f753k
            int r6 = r6 + r8
            int r6 = r6 - r9
            r5.setToIndex(r6)
        L_0x03d8:
            r2.g(r5)
        L_0x03db:
            boolean r5 = r3.h(r7)
            if (r5 == 0) goto L_0x0402
            java.lang.String r5 = r3.f757p
            if (r5 != 0) goto L_0x03ea
            java.lang.String r6 = r3.f727J
            if (r6 != 0) goto L_0x03ea
            goto L_0x0402
        L_0x03ea:
            if (r5 == 0) goto L_0x03f6
            java.lang.String r6 = r3.f727J
            if (r6 == 0) goto L_0x03f6
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0402
        L_0x03f6:
            int r5 = r3.f744b
            android.view.accessibility.AccessibilityEvent r5 = r2.c(r5, r0)
            r5.setContentChangeTypes(r9)
            r2.g(r5)
        L_0x0402:
            io.flutter.view.g r5 = r2.f780i
            r14 = 0
            if (r5 == 0) goto L_0x0438
            int r5 = r5.f744b
            int r6 = r3.f744b
            if (r5 != r6) goto L_0x0438
            long r5 = r3.f722D
            r8 = 3
            int r11 = D.C0009j.d(r8)
            r19 = r1
            long r0 = (long) r11
            long r0 = r0 & r5
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x041e
            goto L_0x043a
        L_0x041e:
            boolean r0 = r3.h(r8)
            if (r0 == 0) goto L_0x043a
            int r0 = r3.f744b
            r1 = 4
            android.view.accessibility.AccessibilityEvent r0 = r2.c(r0, r1)
            java.util.List r1 = r0.getText()
            java.lang.String r5 = r3.f757p
            r1.add(r5)
            r2.g(r0)
            goto L_0x043a
        L_0x0438:
            r19 = r1
        L_0x043a:
            io.flutter.view.g r0 = r2.f783l
            if (r0 == 0) goto L_0x0458
            int r1 = r0.f744b
            int r5 = r3.f744b
            if (r1 != r5) goto L_0x0458
            io.flutter.view.g r6 = r2.m
            if (r6 == 0) goto L_0x044c
            int r6 = r6.f744b
            if (r6 == r1) goto L_0x0458
        L_0x044c:
            r2.m = r0
            r0 = 8
            android.view.accessibility.AccessibilityEvent r0 = r2.c(r5, r0)
            r2.g(r0)
            goto L_0x045c
        L_0x0458:
            if (r0 != 0) goto L_0x045c
            r2.m = r12
        L_0x045c:
            io.flutter.view.g r0 = r2.f783l
            if (r0 == 0) goto L_0x052c
            int r0 = r0.f744b
            int r1 = r3.f744b
            if (r0 != r1) goto L_0x052c
            long r0 = r3.f722D
            r5 = 5
            int r6 = D.C0009j.d(r5)
            r8 = r9
            long r9 = (long) r6
            long r0 = r0 & r9
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x052d
            boolean r0 = r3.h(r5)
            if (r0 == 0) goto L_0x052d
            io.flutter.view.g r0 = r2.f780i
            if (r0 == 0) goto L_0x0486
            int r0 = r0.f744b
            io.flutter.view.g r1 = r2.f783l
            int r1 = r1.f744b
            if (r0 != r1) goto L_0x052d
        L_0x0486:
            java.lang.String r0 = r3.I
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x048d
            goto L_0x048e
        L_0x048d:
            r0 = r1
        L_0x048e:
            java.lang.String r5 = r3.f759r
            if (r5 == 0) goto L_0x0493
            r1 = r5
        L_0x0493:
            int r5 = r3.f744b
            android.view.accessibility.AccessibilityEvent r5 = r2.c(r5, r7)
            r5.setBeforeText(r0)
            java.util.List r6 = r5.getText()
            r6.add(r1)
            r6 = r13
        L_0x04a4:
            int r9 = r0.length()
            if (r6 >= r9) goto L_0x04be
            int r9 = r1.length()
            if (r6 >= r9) goto L_0x04be
            char r9 = r0.charAt(r6)
            char r10 = r1.charAt(r6)
            if (r9 == r10) goto L_0x04bb
            goto L_0x04be
        L_0x04bb:
            int r6 = r6 + 1
            goto L_0x04a4
        L_0x04be:
            int r9 = r0.length()
            if (r6 < r9) goto L_0x04cc
            int r9 = r1.length()
            if (r6 < r9) goto L_0x04cc
            r5 = r12
            goto L_0x04f7
        L_0x04cc:
            r5.setFromIndex(r6)
            int r9 = r0.length()
            int r9 = r9 - r8
            int r10 = r1.length()
            int r10 = r10 - r8
        L_0x04d9:
            if (r9 < r6) goto L_0x04ed
            if (r10 < r6) goto L_0x04ed
            char r14 = r0.charAt(r9)
            char r15 = r1.charAt(r10)
            if (r14 == r15) goto L_0x04e8
            goto L_0x04ed
        L_0x04e8:
            int r9 = r9 + -1
            int r10 = r10 + -1
            goto L_0x04d9
        L_0x04ed:
            int r9 = r9 - r6
            int r9 = r9 + r8
            r5.setRemovedCount(r9)
            int r10 = r10 - r6
            int r10 = r10 + r8
            r5.setAddedCount(r10)
        L_0x04f7:
            if (r5 == 0) goto L_0x04fc
            r2.g(r5)
        L_0x04fc:
            int r0 = r3.f724F
            int r5 = r3.f749g
            if (r0 != r5) goto L_0x0508
            int r0 = r3.f725G
            int r5 = r3.f750h
            if (r0 == r5) goto L_0x052d
        L_0x0508:
            int r0 = r3.f744b
            r5 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r0 = r2.c(r0, r5)
            java.util.List r5 = r0.getText()
            r5.add(r1)
            int r5 = r3.f749g
            r0.setFromIndex(r5)
            int r3 = r3.f750h
            r0.setToIndex(r3)
            int r1 = r1.length()
            r0.setItemCount(r1)
            r2.g(r0)
            goto L_0x052d
        L_0x052c:
            r8 = r9
        L_0x052d:
            r1 = r19
            r9 = r8
            r0 = 2048(0x800, float:2.87E-42)
            r10 = 14
            goto L_0x032b
        L_0x0536:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.a.a(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }
}
