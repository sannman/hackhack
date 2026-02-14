package o0;

import V.j;
import j0.C0061t;
import p0.k;

public final class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public Runnable f1069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f1070c;

    public i(j jVar, Runnable runnable) {
        this.f1070c = jVar;
        this.f1069b = runnable;
    }

    public final void run() {
        j jVar;
        int i2 = 0;
        do {
            try {
                this.f1069b.run();
            } catch (Throwable th) {
                C0061t.c(j.f372b, th);
            }
            jVar = this.f1070c;
            Runnable i3 = jVar.i();
            if (i3 != null) {
                this.f1069b = i3;
                i2++;
            } else {
                return;
            }
        } while (i2 < 16);
        k kVar = jVar.f1072d;
        kVar.getClass();
        kVar.c(jVar, this);
    }
}
