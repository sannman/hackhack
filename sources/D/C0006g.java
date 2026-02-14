package D;

import android.os.Build;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import java.util.Iterator;

/* renamed from: D.g  reason: case insensitive filesystem */
public final class C0006g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f73a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f74b;

    public /* synthetic */ C0006g(int i2, Object obj) {
        this.f73a = i2;
        this.f74b = obj;
    }

    public final void a() {
        switch (this.f73a) {
            case 0:
                C0008i iVar = (C0008i) this.f74b;
                C0005f fVar = iVar.f77a;
                if (Build.VERSION.SDK_INT >= 29) {
                    fVar.reportFullyDrawn();
                } else {
                    fVar.getClass();
                }
                iVar.f84h = true;
                iVar.f85i = true;
                return;
            case 1:
                x xVar = (x) this.f74b;
                xVar.f120g = true;
                Iterator it = xVar.f119f.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).a();
                }
                return;
            default:
                T t2 = (T) this.f74b;
                t2.f55a.setAlpha(1.0f);
                j jVar = t2.f56b;
                if (jVar != null) {
                    jVar.c(this);
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.f73a) {
            case 0:
                C0008i iVar = (C0008i) this.f74b;
                iVar.f77a.getClass();
                iVar.f84h = false;
                return;
            case 1:
                x xVar = (x) this.f74b;
                xVar.f120g = false;
                Iterator it = xVar.f119f.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).b();
                }
                return;
            default:
                return;
        }
    }

    private final void c() {
    }
}
