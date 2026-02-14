package D;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.l;

/* renamed from: D.q  reason: case insensitive filesystem */
public final class C0016q extends TextureView implements l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f101a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f102b;

    /* renamed from: c  reason: collision with root package name */
    public j f103c;

    /* renamed from: d  reason: collision with root package name */
    public Surface f104d;

    public final void a(j jVar) {
        j jVar2 = this.f103c;
        if (jVar2 != null) {
            jVar2.d();
        }
        this.f103c = jVar;
        b();
    }

    public final void b() {
        if (this.f103c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f101a) {
            e();
        }
        this.f102b = false;
    }

    public final void c() {
        if (this.f103c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f102b = true;
        }
    }

    public final void d() {
        if (this.f103c != null) {
            if (getWindowToken() != null) {
                j jVar = this.f103c;
                if (jVar != null) {
                    jVar.d();
                    Surface surface = this.f104d;
                    if (surface != null) {
                        surface.release();
                        this.f104d = null;
                    }
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            this.f103c = null;
            return;
        }
        Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public final void e() {
        if (this.f103c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f104d;
        if (surface != null) {
            surface.release();
            this.f104d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f104d = surface2;
        j jVar = this.f103c;
        boolean z2 = this.f102b;
        if (!z2) {
            jVar.d();
        }
        jVar.f569b = surface2;
        FlutterJNI flutterJNI = jVar.f568a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    public j getAttachedRenderer() {
        return this.f103c;
    }

    public void setRenderSurface(Surface surface) {
        this.f104d = surface;
    }
}
