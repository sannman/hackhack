package m0;

import T.g;
import U.e;
import V.d;
import V.i;
import V.j;
import W.a;
import X.f;
import d0.h;
import d0.n;
import j0.C0053k;
import j0.C0061t;
import j0.H;
import j0.I;
import java.util.ArrayList;
import n0.c;
import o0.u;
import v.C0104j;

public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    public final i f963b;

    /* renamed from: c  reason: collision with root package name */
    public final int f964c;

    /* renamed from: d  reason: collision with root package name */
    public final int f965d;

    /* renamed from: e  reason: collision with root package name */
    public final C0104j f966e;

    /* renamed from: f  reason: collision with root package name */
    public final C0104j f967f;

    public b(C0104j jVar, i iVar, int i2, int i3) {
        this.f963b = iVar;
        this.f964c = i2;
        this.f965d = i3;
        this.f966e = jVar;
        this.f967f = jVar;
    }

    public Object a(d dVar, d dVar2) {
        Object obj;
        Object obj2;
        H h2;
        I i2 = null;
        c cVar = new c(dVar, this, (d) null);
        i iVar = ((X.b) dVar2).f377c;
        h.b(iVar);
        u uVar = new u(iVar, (f) dVar2);
        try {
            n.a(2, cVar);
            obj = cVar.d(uVar, uVar);
        } catch (Throwable th) {
            obj = new C0053k(th, false);
        }
        a aVar = a.f373b;
        if (obj == aVar || (obj2 = uVar.C(obj)) == C0061t.f874d) {
            obj2 = aVar;
        } else if (!(obj2 instanceof C0053k)) {
            if (obj2 instanceof I) {
                i2 = obj2;
            }
            if (!(i2 == null || (h2 = i2.f821a) == null)) {
                obj2 = h2;
            }
        } else {
            throw ((C0053k) obj2).f861a;
        }
        if (obj2 == aVar) {
            return obj2;
        }
        return g.f356a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(l0.r r6, V.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            m0.a r0 = (m0.a) r0
            int r1 = r0.f962h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f962h = r1
            goto L_0x001a
        L_0x0013:
            m0.a r0 = new m0.a
            X.b r7 = (X.b) r7
            r0.<init>(r5, r7)
        L_0x001a:
            java.lang.Object r7 = r0.f960f
            W.a r1 = W.a.f373b
            int r2 = r0.f962h
            T.g r3 = T.g.f356a
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            l0.r r6 = r0.f959e
            a.a.z(r7)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            a.a.z(r7)
            r0.f959e = r6
            r0.f962h = r4
            v.j r7 = r5.f966e
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r7 = r3
        L_0x0046:
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            l0.q r6 = (l0.q) r6
            l0.c r6 = r6.f957e
            boolean r6 = r6.p()
            if (r6 == 0) goto L_0x0054
            return r3
        L_0x0054:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.b(l0.r, V.d):java.lang.Object");
    }

    public final String c() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        j jVar = j.f372b;
        i iVar = this.f963b;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f964c;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f965d;
        if (i3 != 1) {
            if (i3 == 1) {
                str = "SUSPEND";
            } else if (i3 == 2) {
                str = "DROP_OLDEST";
            } else if (i3 != 3) {
                str = "null";
            } else {
                str = "DROP_LATEST";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + e.E(arrayList, (String) null, (String) null, (U.a) null, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.f966e + "] -> " + c();
    }
}
