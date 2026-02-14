package D;

import H.c;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;

public final class w implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f112b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f113c;

    public w(x xVar, j jVar, c cVar) {
        this.f113c = xVar;
        this.f111a = jVar;
        this.f112b = cVar;
    }

    public final void a() {
        C0012m mVar;
        this.f111a.c(this);
        this.f112b.run();
        x xVar = this.f113c;
        if (!(xVar.f117d instanceof C0012m) && (mVar = xVar.f116c) != null) {
            mVar.d();
            C0012m mVar2 = xVar.f116c;
            if (mVar2 != null) {
                mVar2.f89a.close();
                xVar.removeView(xVar.f116c);
                xVar.f116c = null;
            }
        }
    }

    public final void b() {
    }
}
