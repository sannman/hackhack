package x;

import D.C0018t;
import T.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import n.e;
import w.C0105a;

/* renamed from: x.d  reason: case insensitive filesystem */
public final class C0109d implements C0105a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f1226a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f1227b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f1228c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f1229d = new LinkedHashMap();

    public C0109d(WindowLayoutComponent windowLayoutComponent) {
        this.f1226a = windowLayoutComponent;
    }

    public final void a(Context context, e eVar, C0018t tVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1227b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1228c;
        try {
            C0111f fVar = (C0111f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1229d;
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
                this.f1226a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(C0018t tVar) {
        ReentrantLock reentrantLock = this.f1227b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1229d;
        try {
            Context context = (Context) linkedHashMap.get(tVar);
            if (context != null) {
                LinkedHashMap linkedHashMap2 = this.f1228c;
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
                    this.f1226a.removeWindowLayoutInfoListener(fVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }
}
