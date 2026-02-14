package j0;

import V.d;
import a.a;
import java.util.concurrent.CancellationException;
import p0.h;
import p0.j;

/* renamed from: j0.x  reason: case insensitive filesystem */
public abstract class C0065x extends h {

    /* renamed from: d  reason: collision with root package name */
    public int f883d;

    public C0065x(int i2) {
        super(0, j.f1138g);
        this.f883d = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract d d();

    public Throwable f(Object obj) {
        C0053k kVar;
        if (obj instanceof C0053k) {
            kVar = (C0053k) obj;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            return kVar.f861a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                a.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            d0.h.b(th);
            C0061t.c(d().i(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object j();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[Catch:{ all -> 0x0048, all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A[Catch:{ all -> 0x0048, all -> 0x0089 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            T.g r0 = T.g.f356a
            D.F r1 = r12.f1130c
            V.d r2 = r12.d()     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            d0.h.c(r2, r3)     // Catch:{ all -> 0x0089 }
            o0.h r2 = (o0.h) r2     // Catch:{ all -> 0x0089 }
            X.b r3 = r2.f1066f     // Catch:{ all -> 0x0089 }
            java.lang.Object r2 = r2.f1068h     // Catch:{ all -> 0x0089 }
            V.i r4 = r3.f377c     // Catch:{ all -> 0x0089 }
            d0.h.b(r4)     // Catch:{ all -> 0x0089 }
            java.lang.Object r2 = o0.C0087a.k(r4, r2)     // Catch:{ all -> 0x0089 }
            io.flutter.plugin.platform.c r5 = o0.C0087a.f1056f     // Catch:{ all -> 0x0089 }
            if (r2 == r5) goto L_0x0023
            j0.C0061t.h(r3, r4)     // Catch:{ all -> 0x0089 }
        L_0x0023:
            V.i r5 = r3.f377c     // Catch:{ all -> 0x0048 }
            d0.h.b(r5)     // Catch:{ all -> 0x0048 }
            java.lang.Object r6 = r12.j()     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r7 = r12.f(r6)     // Catch:{ all -> 0x0048 }
            r8 = 0
            if (r7 != 0) goto L_0x004a
            int r9 = r12.f883d     // Catch:{ all -> 0x0048 }
            r10 = 1
            if (r9 == r10) goto L_0x003d
            r11 = 2
            if (r9 != r11) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 == 0) goto L_0x004a
            j0.q r9 = j0.C0059q.f870c     // Catch:{ all -> 0x0048 }
            V.g r5 = r5.g(r9)     // Catch:{ all -> 0x0048 }
            j0.K r5 = (j0.K) r5     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0048:
            r3 = move-exception
            goto L_0x008b
        L_0x004a:
            r5 = r8
        L_0x004b:
            if (r5 == 0) goto L_0x0064
            boolean r9 = r5.b()     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x0064
            j0.T r5 = (j0.T) r5     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CancellationException r5 = r5.v()     // Catch:{ all -> 0x0048 }
            r12.b(r6, r5)     // Catch:{ all -> 0x0048 }
            T.c r5 = a.a.g(r5)     // Catch:{ all -> 0x0048 }
            r3.c(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0075
        L_0x0064:
            if (r7 == 0) goto L_0x006e
            T.c r5 = a.a.g(r7)     // Catch:{ all -> 0x0048 }
            r3.c(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0075
        L_0x006e:
            java.lang.Object r5 = r12.g(r6)     // Catch:{ all -> 0x0048 }
            r3.c(r5)     // Catch:{ all -> 0x0048 }
        L_0x0075:
            o0.C0087a.f(r4, r2)     // Catch:{ all -> 0x0089 }
            r1.getClass()     // Catch:{ all -> 0x007c }
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            T.c r0 = a.a.g(r0)
        L_0x0081:
            java.lang.Throwable r0 = T.d.a(r0)
            r12.h(r8, r0)
            goto L_0x009f
        L_0x0089:
            r2 = move-exception
            goto L_0x008f
        L_0x008b:
            o0.C0087a.f(r4, r2)     // Catch:{ all -> 0x0089 }
            throw r3     // Catch:{ all -> 0x0089 }
        L_0x008f:
            r1.getClass()     // Catch:{ all -> 0x0093 }
            goto L_0x0098
        L_0x0093:
            r0 = move-exception
            T.c r0 = a.a.g(r0)
        L_0x0098:
            java.lang.Throwable r0 = T.d.a(r0)
            r12.h(r2, r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0065x.run():void");
    }

    public Object g(Object obj) {
        return obj;
    }
}
