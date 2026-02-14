package k0;

import V.i;
import android.os.Handler;
import android.os.Looper;
import d0.h;
import j0.C0058p;
import j0.C0059q;
import j0.C0064w;
import j0.C0066y;
import j0.K;
import java.util.concurrent.CancellationException;
import o0.p;
import p0.d;

public final class c extends C0058p implements C0064w {
    private volatile c _immediate;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f886d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f887e;

    /* renamed from: f  reason: collision with root package name */
    public final c f888f;

    public c(Handler handler, boolean z2) {
        c cVar;
        this.f886d = handler;
        this.f887e = z2;
        if (z2) {
            cVar = this;
        } else {
            cVar = null;
        }
        this._immediate = cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, true);
            this._immediate = cVar2;
        }
        this.f888f = cVar2;
    }

    public final void c(i iVar, Runnable runnable) {
        if (!this.f886d.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            K k2 = (K) iVar.g(C0059q.f870c);
            if (k2 != null) {
                k2.a(cancellationException);
            }
            C0066y.f885b.c(iVar, runnable);
        }
    }

    public final boolean e() {
        if (!this.f887e || !h.a(Looper.myLooper(), this.f886d.getLooper())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c) || ((c) obj).f886d != this.f886d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f886d);
    }

    public final String toString() {
        String str;
        c cVar;
        d dVar = C0066y.f884a;
        c cVar2 = p.f1089a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f888f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String handler = this.f886d.toString();
        if (!this.f887e) {
            return handler;
        }
        return handler + ".immediate";
    }
}
