package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.b;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import d.C0022a;
import d.C0024c;
import d0.h;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f568a;

    /* renamed from: b  reason: collision with root package name */
    public Surface f569b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f570c = false;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f571d = new Handler();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f572e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f573f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a f574g;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, androidx.lifecycle.m] */
    public j(FlutterJNI flutterJNI) {
        m mVar;
        l lVar;
        f fVar;
        new AtomicLong(0);
        boolean z2 = false;
        a aVar = new a(this);
        this.f574g = aVar;
        this.f568a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        n nVar = r.f429i.f435f;
        b bVar = new b(this);
        nVar.getClass();
        nVar.b("addObserver");
        g gVar = nVar.f421c;
        g gVar2 = g.f410b;
        gVar2 = gVar != gVar2 ? g.f411c : gVar2;
        ? obj = new Object();
        int i2 = o.f428a;
        obj.f418b = new b(bVar, (b) null);
        obj.f417a = gVar2;
        C0022a aVar2 = nVar.f420b;
        HashMap hashMap = aVar2.f454f;
        C0024c cVar = (C0024c) hashMap.get(bVar);
        if (cVar != null) {
            mVar = cVar.f459b;
        } else {
            C0024c cVar2 = new C0024c(bVar, obj);
            aVar2.f453e++;
            C0024c cVar3 = aVar2.f451c;
            if (cVar3 == null) {
                aVar2.f450b = cVar2;
                aVar2.f451c = cVar2;
            } else {
                cVar3.f460c = cVar2;
                cVar2.f461d = cVar3;
                aVar2.f451c = cVar2;
            }
            hashMap.put(bVar, cVar2);
            mVar = null;
        }
        if (mVar == null && (lVar = (l) nVar.f422d.get()) != null) {
            z2 = (nVar.f423e != 0 || nVar.f424f) ? true : z2;
            g a2 = nVar.a(bVar);
            nVar.f423e++;
            while (obj.f417a.compareTo(a2) < 0 && nVar.f420b.f454f.containsKey(bVar)) {
                nVar.f426h.add(obj.f417a);
                d dVar = f.Companion;
                g gVar3 = obj.f417a;
                dVar.getClass();
                h.e(gVar3, "state");
                int ordinal = gVar3.ordinal();
                if (ordinal == 1) {
                    fVar = f.ON_CREATE;
                } else if (ordinal == 2) {
                    fVar = f.ON_START;
                } else if (ordinal != 3) {
                    fVar = null;
                } else {
                    fVar = f.ON_RESUME;
                }
                if (fVar != null) {
                    obj.a(lVar, fVar);
                    ArrayList arrayList = nVar.f426h;
                    arrayList.remove(arrayList.size() - 1);
                    a2 = nVar.a(bVar);
                } else {
                    throw new IllegalStateException("no event up from " + obj.f417a);
                }
            }
            if (!z2) {
                nVar.d();
            }
            nVar.f423e--;
        }
    }

    public final void a(k kVar) {
        this.f568a.addIsDisplayingFlutterUiListener(kVar);
        if (this.f570c) {
            kVar.a();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f572e.iterator();
        while (it.hasNext()) {
            io.flutter.view.o oVar = (io.flutter.view.o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(k kVar) {
        this.f568a.removeIsDisplayingFlutterUiListener(kVar);
    }

    public final void d() {
        if (this.f569b != null) {
            this.f568a.onSurfaceDestroyed();
            if (this.f570c) {
                this.f574g.b();
            }
            this.f570c = false;
            this.f569b = null;
        }
    }
}
