package D;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.j;

/* renamed from: D.p  reason: case insensitive filesystem */
public final class C0015p implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0016q f100a;

    public C0015p(C0016q qVar) {
        this.f100a = qVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0016q qVar = this.f100a;
        boolean z2 = true;
        qVar.f101a = true;
        if (qVar.f103c == null || qVar.f102b) {
            z2 = false;
        }
        if (z2) {
            qVar.e();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0016q qVar = this.f100a;
        boolean z2 = false;
        qVar.f101a = false;
        j jVar = qVar.f103c;
        if (jVar != null && !qVar.f102b) {
            z2 = true;
        }
        if (z2) {
            if (jVar != null) {
                jVar.d();
                Surface surface = qVar.f104d;
                if (surface != null) {
                    surface.release();
                    qVar.f104d = null;
                }
            } else {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
        }
        Surface surface2 = qVar.f104d;
        if (surface2 != null) {
            surface2.release();
            qVar.f104d = null;
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0016q qVar = this.f100a;
        j jVar = qVar.f103c;
        if (jVar != null && !qVar.f102b) {
            if (jVar != null) {
                jVar.f568a.onSurfaceChanged(i2, i3);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
