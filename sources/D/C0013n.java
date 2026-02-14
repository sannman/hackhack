package D;

import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.j;

/* renamed from: D.n  reason: case insensitive filesystem */
public final class C0013n implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0014o f95a;

    public C0013n(C0014o oVar) {
        this.f95a = oVar;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        C0014o oVar = this.f95a;
        j jVar = oVar.f98c;
        if (jVar != null && !oVar.f97b) {
            if (jVar != null) {
                jVar.f568a.onSurfaceChanged(i3, i4);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0014o oVar = this.f95a;
        boolean z2 = true;
        oVar.f96a = true;
        if (oVar.f98c == null || oVar.f97b) {
            z2 = false;
        }
        if (z2) {
            oVar.e();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0014o oVar = this.f95a;
        boolean z2 = false;
        oVar.f96a = false;
        j jVar = oVar.f98c;
        if (jVar != null && !oVar.f97b) {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        if (jVar != null) {
            jVar.d();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }
}
