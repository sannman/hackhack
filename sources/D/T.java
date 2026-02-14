package D;

import android.os.Build;
import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.j;

public final class T implements SurfaceHolder.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    public final C0014o f55a;

    /* renamed from: b  reason: collision with root package name */
    public j f56b;

    /* renamed from: c  reason: collision with root package name */
    public final C0013n f57c;

    /* renamed from: d  reason: collision with root package name */
    public final C0006g f58d = new C0006g(2, this);

    /* renamed from: e  reason: collision with root package name */
    public final S f59e;

    public T(C0013n nVar, C0014o oVar, j jVar) {
        boolean z2;
        S s2;
        if (Build.VERSION.SDK_INT < 26) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            s2 = new S(this, 1);
        } else {
            s2 = new S(this, 0);
        }
        this.f59e = s2;
        this.f57c = nVar;
        this.f56b = jVar;
        this.f55a = oVar;
        if (z2) {
            oVar.setAlpha(0.0f);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        C0013n nVar = this.f57c;
        if (nVar != null) {
            nVar.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0013n nVar = this.f57c;
        if (nVar != null) {
            nVar.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0013n nVar = this.f57c;
        if (nVar != null) {
            nVar.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        j jVar = this.f56b;
        if (jVar != null) {
            jVar.a(new Q(this, runnable));
        }
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
