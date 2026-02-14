package D;

import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;

public final class Q implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f51a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ T f52b;

    public Q(T t2, Runnable runnable) {
        this.f52b = t2;
        this.f51a = runnable;
    }

    public final void a() {
        this.f51a.run();
        j jVar = this.f52b.f56b;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public final void b() {
    }
}
