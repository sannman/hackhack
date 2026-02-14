package D;

import B.a;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import io.flutter.embedding.engine.renderer.j;
import java.util.HashMap;

/* renamed from: D.b  reason: case insensitive filesystem */
public final class C0001b {

    /* renamed from: f  reason: collision with root package name */
    public static final Matrix f60f = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final j f61a;

    /* renamed from: b  reason: collision with root package name */
    public final a f62b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f63c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f64d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f65e;

    public C0001b(j jVar, boolean z2) {
        this.f61a = jVar;
        if (a.f0e == null) {
            a.f0e = new a(2);
        }
        this.f62b = a.f0e;
        this.f63c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 != 1) {
            if (i2 == 5) {
                return 4;
            }
            if (i2 != 6) {
                if (i2 == 2) {
                    return 5;
                }
                if (i2 != 7) {
                    if (i2 == 3) {
                        return 0;
                    }
                    if (i2 == 8) {
                        return 3;
                    }
                    return -1;
                }
                return 3;
            }
        }
        return 6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r14 == -1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            r28 = this;
            r0 = r28
            r2 = r30
            r3 = r31
            r4 = r34
            r5 = r35
            r6 = 1
            r7 = 2
            r9 = -1
            if (r3 != r9) goto L_0x0012
        L_0x000f:
            r7 = r0
            goto L_0x0283
        L_0x0012:
            int r10 = r29.getPointerId(r30)
            r11 = 3
            int r10 = r10 << r11
            int r12 = r29.getToolType(r30)
            r13 = 7
            r12 = r12 & r13
            r10 = r10 | r12
            int r12 = r29.getToolType(r30)
            r14 = 5
            r15 = 4
            if (r12 == r6) goto L_0x0033
            if (r12 == r7) goto L_0x0031
            if (r12 == r11) goto L_0x002f
            if (r12 == r15) goto L_0x0034
            r11 = r14
            goto L_0x0034
        L_0x002f:
            r11 = r6
            goto L_0x0034
        L_0x0031:
            r11 = r7
            goto L_0x0034
        L_0x0033:
            r11 = 0
        L_0x0034:
            float r12 = r29.getX(r30)
            float r16 = r29.getY(r30)
            r17 = 0
            float[] r8 = new float[r7]
            r8[r17] = r12
            r8[r6] = r16
            r12 = r33
            r12.mapPoints(r8)
            java.util.HashMap r12 = r0.f64d
            r18 = r10
            if (r11 != r6) goto L_0x0073
            int r19 = r29.getButtonState()
            r13 = r19 & 31
            r20 = 0
            long r9 = (long) r13
            int r13 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r13 != 0) goto L_0x0070
            int r13 = r29.getSource()
            r19 = r6
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r13 != r6) goto L_0x0084
            if (r3 != r15) goto L_0x0084
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r12.put(r6, r8)
            goto L_0x0084
        L_0x0070:
            r19 = r6
            goto L_0x0084
        L_0x0073:
            r19 = r6
            r20 = 0
            if (r11 != r7) goto L_0x0082
            int r6 = r29.getButtonState()
            int r6 = r6 >> r15
            r6 = r6 & 15
            long r9 = (long) r6
            goto L_0x0084
        L_0x0082:
            r9 = r20
        L_0x0084:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            boolean r6 = r12.containsKey(r6)
            if (r6 == 0) goto L_0x00a7
            if (r3 != r15) goto L_0x0093
            r14 = 7
        L_0x0091:
            r15 = -1
            goto L_0x00a3
        L_0x0093:
            if (r3 != r14) goto L_0x0098
            r14 = 8
            goto L_0x0091
        L_0x0098:
            r14 = 6
            if (r3 == r14) goto L_0x00a0
            if (r3 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r14 = -1
            goto L_0x0091
        L_0x00a0:
            r14 = 9
            goto L_0x0091
        L_0x00a3:
            if (r14 != r15) goto L_0x00a9
            goto L_0x000f
        L_0x00a7:
            r15 = -1
            r14 = r15
        L_0x00a9:
            boolean r15 = r0.f63c
            if (r15 == 0) goto L_0x00d5
            B.a r15 = r0.f62b
            r15.getClass()
            java.util.concurrent.atomic.AtomicLong r16 = D.P.f49b
            r22 = r8
            long r7 = r16.incrementAndGet()
            D.P r16 = new D.P
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r29)
            r23 = r6
            java.lang.Object r6 = r15.f3c
            android.util.LongSparseArray r6 = (android.util.LongSparseArray) r6
            r6.put(r7, r13)
            java.lang.Object r6 = r15.f4d
            java.util.PriorityQueue r6 = (java.util.PriorityQueue) r6
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            r6.add(r13)
            goto L_0x00db
        L_0x00d5:
            r23 = r6
            r22 = r8
            r7 = r20
        L_0x00db:
            int r6 = r29.getActionMasked()
            r13 = 8
            if (r6 != r13) goto L_0x00e6
            r6 = r19
            goto L_0x00e8
        L_0x00e6:
            r6 = r17
        L_0x00e8:
            long r24 = r29.getEventTime()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r0 = r24 * r26
            r4.putLong(r7)
            r4.putLong(r0)
            if (r23 == 0) goto L_0x0102
            long r0 = (long) r14
            r4.putLong(r0)
            r0 = 4
            r4.putLong(r0)
            goto L_0x010a
        L_0x0102:
            long r0 = (long) r3
            r4.putLong(r0)
            long r0 = (long) r11
            r4.putLong(r0)
        L_0x010a:
            long r0 = (long) r6
            r4.putLong(r0)
            r0 = r18
            long r7 = (long) r0
            r4.putLong(r7)
            r7 = r20
            r4.putLong(r7)
            if (r23 == 0) goto L_0x0132
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r12.get(r1)
            float[] r1 = (float[]) r1
            r3 = r1[r17]
            double r7 = (double) r3
            r4.putDouble(r7)
            r1 = r1[r19]
            double r7 = (double) r1
            r4.putDouble(r7)
            goto L_0x013e
        L_0x0132:
            r1 = r22[r17]
            double r7 = (double) r1
            r4.putDouble(r7)
            r1 = r22[r19]
            double r7 = (double) r1
            r4.putDouble(r7)
        L_0x013e:
            r7 = 0
            r4.putDouble(r7)
            r4.putDouble(r7)
            r4.putLong(r9)
            r9 = 0
            r4.putLong(r9)
            r4.putLong(r9)
            float r1 = r29.getPressure(r30)
            double r9 = (double) r1
            r4.putDouble(r9)
            android.view.InputDevice r1 = r29.getDevice()
            if (r1 == 0) goto L_0x0175
            android.view.InputDevice r1 = r29.getDevice()
            r3 = 2
            android.view.InputDevice$MotionRange r1 = r1.getMotionRange(r3)
            if (r1 == 0) goto L_0x0175
            float r3 = r1.getMin()
            double r9 = (double) r3
            float r1 = r1.getMax()
            double r7 = (double) r1
            goto L_0x0179
        L_0x0175:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 0
        L_0x0179:
            r4.putDouble(r9)
            r4.putDouble(r7)
            r3 = 2
            if (r11 != r3) goto L_0x0194
            r1 = 24
            r3 = r29
            float r1 = r3.getAxisValue(r1, r2)
            double r7 = (double) r1
            r4.putDouble(r7)
            r7 = 0
            r4.putDouble(r7)
            goto L_0x019e
        L_0x0194:
            r3 = r29
            r7 = 0
            r4.putDouble(r7)
            r4.putDouble(r7)
        L_0x019e:
            float r1 = r29.getSize(r30)
            double r9 = (double) r1
            r4.putDouble(r9)
            float r1 = r29.getToolMajor(r30)
            double r9 = (double) r1
            r4.putDouble(r9)
            float r1 = r29.getToolMinor(r30)
            double r9 = (double) r1
            r4.putDouble(r9)
            r4.putDouble(r7)
            r4.putDouble(r7)
            r13 = 8
            float r1 = r3.getAxisValue(r13, r2)
            double r9 = (double) r1
            r4.putDouble(r9)
            r1 = 2
            if (r11 != r1) goto L_0x01d6
            r1 = 25
            float r1 = r3.getAxisValue(r1, r2)
            double r9 = (double) r1
            r4.putDouble(r9)
        L_0x01d3:
            r1 = r32
            goto L_0x01da
        L_0x01d6:
            r4.putDouble(r7)
            goto L_0x01d3
        L_0x01da:
            long r7 = (long) r1
            r4.putLong(r7)
            r1 = r19
            if (r6 != r1) goto L_0x022e
            if (r5 == 0) goto L_0x0210
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L_0x01f6
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r5)
            float r7 = r7.getScaledHorizontalScrollFactor()
            r8 = r7
            r7 = r28
            goto L_0x01fd
        L_0x01f6:
            r7 = r28
            int r8 = r7.c(r5)
            float r8 = (float) r8
        L_0x01fd:
            double r8 = (double) r8
            if (r1 < r6) goto L_0x0209
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r5)
            float r1 = r1.getScaledVerticalScrollFactor()
            goto L_0x020e
        L_0x0209:
            int r1 = r7.c(r5)
            float r1 = (float) r1
        L_0x020e:
            double r5 = (double) r1
            goto L_0x0215
        L_0x0210:
            r7 = r28
            r8 = 4631952216750555136(0x4048000000000000, double:48.0)
            r5 = r8
        L_0x0215:
            r1 = 10
            float r1 = r3.getAxisValue(r1, r2)
            float r1 = -r1
            double r10 = (double) r1
            double r8 = r8 * r10
            r1 = 9
            float r2 = r3.getAxisValue(r1, r2)
            float r1 = -r2
            double r1 = (double) r1
            double r5 = r5 * r1
            r4.putDouble(r8)
            r4.putDouble(r5)
            goto L_0x0238
        L_0x022e:
            r7 = r28
            r1 = 0
            r4.putDouble(r1)
            r4.putDouble(r1)
        L_0x0238:
            if (r23 == 0) goto L_0x025b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r12.get(r1)
            float[] r1 = (float[]) r1
            r2 = r22[r17]
            r3 = r1[r17]
            float r2 = r2 - r3
            double r2 = (double) r2
            r4.putDouble(r2)
            r19 = 1
            r2 = r22[r19]
            r1 = r1[r19]
            float r2 = r2 - r1
            double r1 = (double) r2
            r4.putDouble(r1)
            r1 = 0
            goto L_0x0263
        L_0x025b:
            r1 = 0
            r4.putDouble(r1)
            r4.putDouble(r1)
        L_0x0263:
            r4.putDouble(r1)
            r4.putDouble(r1)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.putDouble(r5)
            r4.putDouble(r1)
            r9 = 0
            r4.putLong(r9)
            if (r23 == 0) goto L_0x0283
            r1 = 9
            if (r14 != r1) goto L_0x0283
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.remove(r0)
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0001b.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f65e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.f65e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f65e;
    }
}
