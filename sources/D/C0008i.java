package D;

import C.b;
import E.c;
import E.e;
import E.g;
import F.k;
import L.d;
import Q.a;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: D.i  reason: case insensitive filesystem */
public final class C0008i {

    /* renamed from: a  reason: collision with root package name */
    public C0005f f77a;

    /* renamed from: b  reason: collision with root package name */
    public c f78b;

    /* renamed from: c  reason: collision with root package name */
    public x f79c;

    /* renamed from: d  reason: collision with root package name */
    public f f80d;

    /* renamed from: e  reason: collision with root package name */
    public a f81e;

    /* renamed from: f  reason: collision with root package name */
    public C0007h f82f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f83g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f84h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f85i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f86j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f87k;

    /* renamed from: l  reason: collision with root package name */
    public final C0006g f88l = new C0006g(0, this);

    public C0008i(C0005f fVar) {
        this.f77a = fVar;
        this.f85i = false;
    }

    public final void a(g gVar) {
        String b2 = this.f77a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((H.f) b.d().f13a).f243d.f230b;
        }
        F.a aVar = new F.a(b2, this.f77a.e());
        String f2 = this.f77a.f();
        if (f2 == null) {
            C0005f fVar = this.f77a;
            fVar.getClass();
            f2 = d(fVar.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        gVar.f176b = aVar;
        gVar.f177c = f2;
        gVar.f178d = (List) this.f77a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (!this.f77a.i()) {
            C0005f fVar = this.f77a;
            fVar.getClass();
            Log.w("FlutterActivity", "FlutterActivity " + fVar + " connection to the engine " + fVar.f70b.f78b + " evicted by another attaching activity");
            C0008i iVar = fVar.f70b;
            if (iVar != null) {
                iVar.e();
                fVar.f70b.f();
                return;
            }
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f77a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f77a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        C0005f fVar = this.f77a;
        fVar.getClass();
        try {
            Bundle g2 = fVar.g();
            if (g2 == null || !g2.containsKey("flutter_deeplinking_enabled")) {
                z2 = true;
            } else {
                z2 = g2.getBoolean("flutter_deeplinking_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f82f != null) {
            this.f79c.getViewTreeObserver().removeOnPreDrawListener(this.f82f);
            this.f82f = null;
        }
        x xVar = this.f79c;
        if (xVar != null) {
            xVar.a();
            x xVar2 = this.f79c;
            xVar2.f119f.remove(this.f88l);
        }
    }

    public final void f() {
        if (this.f86j) {
            c();
            this.f77a.getClass();
            this.f77a.getClass();
            C0005f fVar = this.f77a;
            fVar.getClass();
            if (fVar.isChangingConfigurations()) {
                e eVar = this.f78b.f142d;
                if (eVar.f()) {
                    S.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f172g = true;
                        for (P.a aVar : eVar.f169d.values()) {
                            aVar.f337b.f162c.remove(aVar);
                            aVar.f337b = null;
                        }
                        eVar.d();
                        Trace.endSection();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f78b.f142d.c();
            }
            f fVar2 = this.f80d;
            if (fVar2 != null) {
                fVar2.f643b.f4d = null;
                this.f80d = null;
            }
            a aVar2 = this.f81e;
            if (aVar2 != null) {
                aVar2.f342c.f108c = null;
                aVar2.f340a = null;
                this.f81e = null;
            }
            this.f77a.getClass();
            c cVar = this.f78b;
            if (cVar != null) {
                d dVar = cVar.f145g;
                dVar.a(1, dVar.f251c);
            }
            if (this.f77a.i()) {
                c cVar2 = this.f78b;
                Iterator it = cVar2.u.iterator();
                while (it.hasNext()) {
                    ((E.b) it.next()).b();
                }
                e eVar2 = cVar2.f142d;
                eVar2.e();
                HashMap hashMap = eVar2.f166a;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    J.a aVar3 = (J.a) hashMap.get(cls);
                    if (aVar3 != null) {
                        S.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (aVar3 instanceof P.a) {
                                if (eVar2.f()) {
                                    P.a aVar4 = (P.a) aVar3;
                                    aVar4.f337b.f162c.remove(aVar4);
                                    aVar4.f337b = null;
                                }
                                eVar2.f169d.remove(cls);
                            }
                            aVar3.b(eVar2.f168c);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    j jVar = cVar2.f156s;
                    SparseArray sparseArray = jVar.f669k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    jVar.u.f(sparseArray.keyAt(0));
                }
                while (true) {
                    i iVar = cVar2.f157t;
                    SparseArray sparseArray2 = iVar.f653g;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    iVar.m.f(sparseArray2.keyAt(0));
                }
                cVar2.f141c.f189b.setPlatformMessageHandler((k) null);
                FlutterJNI flutterJNI = cVar2.f139a;
                flutterJNI.removeEngineLifecycleListener(cVar2.f159w);
                flutterJNI.setDeferredComponentManager((G.a) null);
                flutterJNI.detachFromNativeAndReleaseResources();
                b.d().getClass();
                c.f138y.remove(Long.valueOf(cVar2.f158v));
                if (this.f77a.d() != null) {
                    if (E.i.f183c == null) {
                        E.i.f183c = new E.i(1);
                    }
                    E.i iVar2 = E.i.f183c;
                    iVar2.f184a.remove(this.f77a.d());
                }
                this.f78b = null;
            }
            this.f86j = false;
            return;
        }
        return;
        throw th;
        throw th;
    }
}
