package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.k;
import io.flutter.view.p;
import java.util.Iterator;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f537a;

    public b(j jVar) {
        this.f537a = jVar;
    }

    public final void a() {
        Iterator it = this.f537a.f573f.iterator();
        while (it.hasNext()) {
            p unused = ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }
}
