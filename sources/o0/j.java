package o0;

import j0.C0058p;
import j0.C0063v;
import j0.C0064w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p0.k;

public final class j extends C0058p implements C0064w {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1071h = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: d  reason: collision with root package name */
    public final k f1072d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1073e;

    /* renamed from: f  reason: collision with root package name */
    public final m f1074f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1075g;
    private volatile int runningWorkers;

    public j(k kVar, int i2) {
        C0064w wVar;
        this.f1072d = kVar;
        this.f1073e = i2;
        if (kVar instanceof C0064w) {
            wVar = (C0064w) kVar;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            int i3 = C0063v.f882a;
        }
        this.f1074f = new m();
        this.f1075g = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r3 = i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r3 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.f1072d.c(r2, new o0.i(r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(V.i r3, java.lang.Runnable r4) {
        /*
            r2 = this;
            o0.m r3 = r2.f1074f
            r3.a(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f1071h
            int r4 = r3.get(r2)
            int r0 = r2.f1073e
            if (r4 >= r0) goto L_0x0035
            java.lang.Object r4 = r2.f1075g
            monitor-enter(r4)
            int r0 = r3.get(r2)     // Catch:{ all -> 0x0032 }
            int r1 = r2.f1073e     // Catch:{ all -> 0x0032 }
            if (r0 < r1) goto L_0x001c
            monitor-exit(r4)
            return
        L_0x001c:
            r3.incrementAndGet(r2)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)
            java.lang.Runnable r3 = r2.i()
            if (r3 != 0) goto L_0x0027
            goto L_0x0035
        L_0x0027:
            o0.i r4 = new o0.i
            r4.<init>(r2, r3)
            p0.k r3 = r2.f1072d
            r3.c(r2, r4)
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.j.c(V.i, java.lang.Runnable):void");
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f1074f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1075g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1071h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1074f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
