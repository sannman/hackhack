package p0;

import V.i;
import V.j;
import j0.C0058p;
import j0.E;
import java.util.concurrent.Executor;

public final class c extends E implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public static final c f1124d = new C0058p();

    /* renamed from: e  reason: collision with root package name */
    public static final C0058p f1125e;

    /* JADX WARNING: type inference failed for: r0v0, types: [p0.c, j0.p] */
    /* JADX WARNING: type inference failed for: r2v3, types: [o0.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            p0.c r0 = new p0.c
            r0.<init>()
            f1124d = r0
            p0.k r0 = p0.k.f1140d
            int r1 = o0.x.f1095a
            r2 = 64
            if (r2 >= r1) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = o0.C0087a.i(r3, r1, r2)
            r0.getClass()
            java.lang.String r2 = "Expected positive parallelism level, but got "
            r3 = 1
            if (r1 < r3) goto L_0x0047
            int r4 = p0.j.f1135d
            if (r1 < r4) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            if (r1 < r3) goto L_0x0031
            o0.j r2 = new o0.j
            r2.<init>(r0, r1)
            r0 = r2
        L_0x002e:
            f1125e = r0
            return
        L_0x0031:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0047:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.<clinit>():void");
    }

    public final void c(i iVar, Runnable runnable) {
        f1125e.c(iVar, runnable);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public final void execute(Runnable runnable) {
        c(j.f372b, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
