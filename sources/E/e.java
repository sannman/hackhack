package E;

import B.a;
import D.C0005f;
import D.C0008i;
import D.u;
import F.b;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.n;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import java.util.HashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f166a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final c f167b;

    /* renamed from: c  reason: collision with root package name */
    public final a f168c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f169d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public C0008i f170e;

    /* renamed from: f  reason: collision with root package name */
    public d f171f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f172g = false;

    public e(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f167b = cVar;
        b bVar = cVar.f141c;
        i iVar = cVar.f156s.f659a;
        this.f168c = new a(3, (Object) context, (Object) bVar);
    }

    public final void a(J.a aVar) {
        S.a.b("FlutterEngineConnectionRegistry#add ".concat(aVar.getClass().getSimpleName()));
        try {
            Class<?> cls = aVar.getClass();
            HashMap hashMap = this.f166a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f167b + ").");
                Trace.endSection();
                return;
            }
            aVar.toString();
            hashMap.put(aVar.getClass(), aVar);
            aVar.a(this.f168c);
            if (aVar instanceof P.a) {
                P.a aVar2 = (P.a) aVar;
                this.f169d.put(aVar.getClass(), aVar2);
                if (f()) {
                    d dVar = this.f171f;
                    aVar2.f337b = dVar;
                    dVar.f162c.add(aVar2);
                }
            }
            Trace.endSection();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void b(C0005f fVar, n nVar) {
        this.f171f = new d(fVar, nVar);
        if (fVar.getIntent() != null) {
            fVar.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = this.f167b;
        j jVar = cVar.f156s;
        jVar.getClass();
        if (jVar.f660b == null) {
            jVar.f660b = fVar;
            jVar.f663e = cVar.f140b;
            b bVar = cVar.f141c;
            u uVar = new u(bVar, 15);
            jVar.f665g = uVar;
            uVar.f108c = jVar.u;
            i iVar = cVar.f157t;
            if (iVar.f648b == null) {
                iVar.f648b = fVar;
                u uVar2 = new u(bVar, 14);
                iVar.f651e = uVar2;
                uVar2.f108c = iVar.m;
                for (P.a aVar : this.f169d.values()) {
                    if (this.f172g) {
                        d dVar = this.f171f;
                        aVar.f337b = dVar;
                        dVar.f162c.add(aVar);
                    } else {
                        d dVar2 = this.f171f;
                        aVar.f337b = dVar2;
                        dVar2.f162c.add(aVar);
                    }
                }
                this.f172g = false;
                return;
            }
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public final void c() {
        if (f()) {
            S.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (P.a aVar : this.f169d.values()) {
                    aVar.f337b.f162c.remove(aVar);
                    aVar.f337b = null;
                }
                d();
                Trace.endSection();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        throw th;
    }

    public final void d() {
        c cVar = this.f167b;
        j jVar = cVar.f156s;
        u uVar = jVar.f665g;
        if (uVar != null) {
            uVar.f108c = null;
        }
        jVar.a();
        jVar.f665g = null;
        jVar.f660b = null;
        jVar.f663e = null;
        i iVar = cVar.f157t;
        u uVar2 = iVar.f651e;
        if (uVar2 != null) {
            uVar2.f108c = null;
        }
        Surface surface = iVar.f657k;
        if (surface != null) {
            surface.release();
            iVar.f657k = null;
            iVar.f658l = null;
        }
        iVar.f651e = null;
        iVar.f648b = null;
        this.f170e = null;
        this.f171f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        if (this.f170e != null) {
            return true;
        }
        return false;
    }
}
