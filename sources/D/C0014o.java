package D;

import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.l;

/* renamed from: D.o  reason: case insensitive filesystem */
public final class C0014o extends SurfaceView implements l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f96a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f97b = false;

    /* renamed from: c  reason: collision with root package name */
    public j f98c;

    /* renamed from: d  reason: collision with root package name */
    public final T f99d;

    public C0014o(C0005f fVar, boolean z2) {
        super(fVar, (AttributeSet) null);
        T t2 = new T(new C0013n(this), this, this.f98c);
        this.f99d = t2;
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(t2);
    }

    public final void a(j jVar) {
        j jVar2 = this.f98c;
        if (jVar2 != null) {
            jVar2.d();
        }
        this.f98c = jVar;
        S s2 = this.f99d.f59e;
        switch (s2.f53a) {
            case 0:
                s2.f54b.f56b = jVar;
                break;
            default:
                T t2 = s2.f54b;
                j jVar3 = t2.f56b;
                if (jVar3 != null) {
                    jVar3.c(t2.f58d);
                }
                t2.f56b = jVar;
                break;
        }
        b();
    }

    public final void b() {
        if (this.f98c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        S s2 = this.f99d.f59e;
        switch (s2.f53a) {
            case 0:
                break;
            default:
                T t2 = s2.f54b;
                j jVar = t2.f56b;
                if (jVar != null) {
                    jVar.a(t2.f58d);
                    break;
                }
                break;
        }
        if (this.f96a) {
            e();
        }
        this.f97b = false;
    }

    public final void c() {
        if (this.f98c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f97b = true;
        }
    }

    public final void d() {
        if (this.f98c != null) {
            if (getWindowToken() != null) {
                j jVar = this.f98c;
                if (jVar != null) {
                    jVar.d();
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            S s2 = this.f99d.f59e;
            switch (s2.f53a) {
                case 0:
                    s2.f54b.f56b = null;
                    break;
                default:
                    T t2 = s2.f54b;
                    t2.f55a.setAlpha(0.0f);
                    j jVar2 = t2.f56b;
                    if (jVar2 != null) {
                        jVar2.c(t2.f58d);
                    }
                    t2.f56b = null;
                    break;
            }
            this.f98c = null;
            return;
        }
        Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public final void e() {
        if (this.f98c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        j jVar = this.f98c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f97b;
        if (!z2) {
            jVar.d();
        }
        jVar.f569b = surface;
        FlutterJNI flutterJNI = jVar.f568a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        Region region2 = region;
        region2.op(i2, iArr[1], (getRight() + i2) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public j getAttachedRenderer() {
        return this.f98c;
    }
}
