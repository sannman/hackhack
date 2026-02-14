package f;

import a.a;

/* renamed from: f.e  reason: case insensitive filesystem */
public final class C0036e extends a {
    public final boolean c(C0038g gVar, C0034c cVar) {
        C0034c cVar2 = C0034c.f512b;
        synchronized (gVar) {
            try {
                if (gVar.f527b != cVar) {
                    return false;
                }
                gVar.f527b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(C0038g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f526a != obj) {
                    return false;
                }
                gVar.f526a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(C0038g gVar, C0037f fVar, C0037f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f528c != fVar) {
                    return false;
                }
                gVar.f528c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(C0037f fVar, C0037f fVar2) {
        fVar.f521b = fVar2;
    }

    public final void u(C0037f fVar, Thread thread) {
        fVar.f520a = thread;
    }
}
