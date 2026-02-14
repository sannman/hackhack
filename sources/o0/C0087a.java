package o0;

import D.C0009j;
import V.d;
import V.i;
import a.a;
import d0.h;
import io.flutter.plugin.platform.c;
import j0.C0053k;
import j0.C0058p;
import j0.C0059q;
import j0.C0061t;
import j0.D;
import j0.K;
import j0.T;
import j0.Z;
import j0.a0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k0.b;

/* renamed from: o0.a  reason: case insensitive filesystem */
public abstract class C0087a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1051a = new c(4, "NO_DECISION");

    /* renamed from: b  reason: collision with root package name */
    public static final c f1052b = new c(4, "CLOSED");

    /* renamed from: c  reason: collision with root package name */
    public static final c f1053c = new c(4, "UNDEFINED");

    /* renamed from: d  reason: collision with root package name */
    public static final c f1054d = new c(4, "REUSABLE_CLAIMED");

    /* renamed from: e  reason: collision with root package name */
    public static final c f1055e = new c(4, "CONDITION_FALSE");

    /* renamed from: f  reason: collision with root package name */
    public static final c f1056f = new c(4, "NO_THREAD_ELEMENTS");

    /* JADX WARNING: Incorrect type for immutable var: ssa=l0.k, code=o0.v, for r7v0, types: [l0.k] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(long r5, o0.v r7) {
        /*
            l0.d r0 = l0.d.f926j
        L_0x0002:
            long r1 = r7.f1093c
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0010
            boolean r3 = r7.c()
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            return r7
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = o0.d.f1059a
            java.lang.Object r3 = r3.get(r7)
            io.flutter.plugin.platform.c r4 = f1052b
            if (r3 != r4) goto L_0x001b
            return r4
        L_0x001b:
            o0.d r3 = (o0.d) r3
            o0.v r3 = (o0.v) r3
            if (r3 == 0) goto L_0x0023
            r7 = r3
            goto L_0x0002
        L_0x0023:
            r3 = 1
            long r1 = r1 + r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.d(r1, r7)
            o0.v r1 = (o0.v) r1
        L_0x0030:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = o0.d.f1059a
            r3 = 0
            boolean r3 = r2.compareAndSet(r7, r3, r1)
            if (r3 == 0) goto L_0x0044
            boolean r2 = r7.c()
            if (r2 == 0) goto L_0x0042
            r7.d()
        L_0x0042:
            r7 = r1
            goto L_0x0002
        L_0x0044:
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L_0x0030
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0087a.a(long, l0.k):java.lang.Object");
    }

    public static final v b(Object obj) {
        if (obj != f1052b) {
            h.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(i iVar, Throwable th) {
        Throwable th2;
        for (b c2 : f.f1062a) {
            try {
                c2.c(th);
            } catch (Throwable th3) {
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    a.a(th2, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        try {
            a.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        if (obj == f1052b) {
            return true;
        }
        return false;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(i iVar, Object obj) {
        if (obj != f1056f) {
            if (obj instanceof A) {
                A a2 = (A) obj;
                Z[] zArr = a2.f1050b;
                int length = zArr.length - 1;
                if (length >= 0) {
                    Z z2 = zArr[length];
                    h.b((Object) null);
                    Object obj2 = a2.f1049a[length];
                    throw null;
                }
                return;
            }
            h.c(iVar.d((Object) null, y.f1097e), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            throw new ClassCastException();
        }
    }

    public static final void g(d dVar, Object obj) {
        Object obj2;
        Object k2;
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            Throwable a2 = T.d.a(obj);
            if (a2 == null) {
                obj2 = obj;
            } else {
                obj2 = new C0053k(a2, false);
            }
            X.b bVar = hVar.f1066f;
            bVar.i();
            C0058p pVar = hVar.f1065e;
            boolean e2 = pVar.e();
            i iVar = bVar.f377c;
            if (e2) {
                hVar.f1067g = obj2;
                hVar.f883d = 1;
                h.b(iVar);
                pVar.c(iVar, hVar);
                return;
            }
            D a3 = a0.a();
            if (a3.f816d >= 4294967296L) {
                hVar.f1067g = obj2;
                hVar.f883d = 1;
                U.c cVar = a3.f818f;
                if (cVar == null) {
                    cVar = new U.c();
                    a3.f818f = cVar;
                }
                cVar.addLast(hVar);
                return;
            }
            a3.k(true);
            try {
                h.b(iVar);
                K k3 = (K) iVar.g(C0059q.f870c);
                if (k3 == null || k3.b()) {
                    Object obj3 = hVar.f1068h;
                    h.b(iVar);
                    k2 = k(iVar, obj3);
                    if (k2 != f1056f) {
                        C0061t.h(bVar, iVar);
                    }
                    bVar.c(obj);
                    f(iVar, k2);
                } else {
                    CancellationException v2 = ((T) k3).v();
                    hVar.b(obj2, v2);
                    hVar.c(a.g(v2));
                }
                do {
                } while (a3.l());
            } catch (Throwable th) {
                a3.i();
                throw th;
            }
            a3.i();
            return;
        }
        dVar.c(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long h(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            r5 = 1
            int r6 = o0.x.f1095a
            java.lang.String r7 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r7 = 0
        L_0x000f:
            if (r7 != 0) goto L_0x0012
            return r24
        L_0x0012:
            int r8 = r7.length()
            if (r8 != 0) goto L_0x001a
            goto L_0x007a
        L_0x001a:
            r9 = 0
            char r10 = r7.charAt(r9)
            r11 = 48
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 >= r11) goto L_0x0037
            if (r8 != r5) goto L_0x002b
            goto L_0x007a
        L_0x002b:
            r11 = 43
            if (r10 == r11) goto L_0x0039
            r9 = 45
            if (r10 == r9) goto L_0x0034
            goto L_0x007a
        L_0x0034:
            r12 = -9223372036854775808
            r9 = r5
        L_0x0037:
            r10 = r9
            goto L_0x003b
        L_0x0039:
            r10 = r9
            r9 = r5
        L_0x003b:
            r16 = 0
            r11 = r5
            r5 = r16
            r17 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L_0x0045:
            if (r9 >= r8) goto L_0x0084
            r24 = r11
            char r11 = r7.charAt(r9)
            r19 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r14 = 10
            int r11 = java.lang.Character.digit(r11, r14)
            if (r11 >= 0) goto L_0x005b
            goto L_0x007a
        L_0x005b:
            int r15 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x006e
            int r15 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x007a
            r25 = r8
            r15 = r9
            long r8 = (long) r14
            long r17 = r12 / r8
            int r8 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x0071
            goto L_0x007a
        L_0x006e:
            r25 = r8
            r15 = r9
        L_0x0071:
            long r8 = (long) r14
            long r5 = r5 * r8
            long r8 = (long) r11
            long r21 = r12 + r8
            int r11 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r11 >= 0) goto L_0x007c
        L_0x007a:
            r6 = 0
            goto L_0x008d
        L_0x007c:
            long r5 = r5 - r8
            int r9 = r15 + 1
            r11 = r24
            r8 = r25
            goto L_0x0045
        L_0x0084:
            if (r10 == 0) goto L_0x008b
        L_0x0086:
            java.lang.Long r6 = java.lang.Long.valueOf(r5)
            goto L_0x008d
        L_0x008b:
            long r5 = -r5
            goto L_0x0086
        L_0x008d:
            r5 = 39
            java.lang.String r8 = "System property '"
            if (r6 == 0) goto L_0x00d1
            long r6 = r6.longValue()
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00a0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00a0
            return r6
        L_0x00a0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r6)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00d1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0087a.h(java.lang.String, long, long, long):long");
    }

    public static int i(String str, int i2, int i3) {
        int i4;
        if ((i3 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = 2097150;
        }
        return (int) h(str, (long) i2, (long) 1, (long) i4);
    }

    public static final Object j(i iVar) {
        Object d2 = iVar.d(0, y.f1096d);
        h.b(d2);
        return d2;
    }

    public static final Object k(i iVar, Object obj) {
        if (obj == null) {
            obj = j(iVar);
        }
        if (obj == 0) {
            return f1056f;
        }
        if (obj instanceof Integer) {
            return iVar.d(new A(((Number) obj).intValue(), iVar), y.f1098f);
        }
        C0009j.e(obj);
        throw null;
    }
}
