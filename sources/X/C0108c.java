package x;

import D.C0018t;
import T.g;
import U.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import n.e;
import r.C0091b;
import s.d;
import w.C0105a;

/* renamed from: x.c  reason: case insensitive filesystem */
public final class C0108c implements C0105a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f1220a;

    /* renamed from: b  reason: collision with root package name */
    public final C0091b f1221b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f1222c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f1223d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f1224e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f1225f = new LinkedHashMap();

    public C0108c(WindowLayoutComponent windowLayoutComponent, C0091b bVar) {
        this.f1220a = windowLayoutComponent;
        this.f1221b = bVar;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d0.g, x.b] */
    public final void a(Context context, e eVar, C0018t tVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1222c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1223d;
        try {
            C0111f fVar = (C0111f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1224e;
            if (fVar != null) {
                fVar.b(tVar);
                linkedHashMap2.put(tVar, context);
                gVar = g.f356a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                C0111f fVar2 = new C0111f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(tVar, context);
                fVar2.b(tVar);
                if (context instanceof Activity) {
                    this.f1225f.put(fVar2, this.f1221b.a(this.f1220a, l.a(WindowLayoutInfo.class), (Activity) context, new d0.g(1, fVar2, C0111f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                } else {
                    fVar2.accept(new WindowLayoutInfo(m.f364b));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b(C0018t tVar) {
        ReentrantLock reentrantLock = this.f1222c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1224e;
        try {
            Context context = (Context) linkedHashMap.get(tVar);
            if (context != null) {
                LinkedHashMap linkedHashMap2 = this.f1223d;
                C0111f fVar = (C0111f) linkedHashMap2.get(context);
                if (fVar == null) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock = fVar.f1231b;
                reentrantLock.lock();
                LinkedHashSet linkedHashSet = fVar.f1233d;
                linkedHashSet.remove(tVar);
                reentrantLock.unlock();
                linkedHashMap.remove(tVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    d dVar = (d) this.f1225f.remove(fVar);
                    if (dVar != null) {
                        dVar.f1167a.invoke(dVar.f1168b, new Object[]{dVar.f1169c});
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }
}
