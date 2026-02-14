package D;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.l;
import java.nio.ByteBuffer;
import java.util.Locale;
import n.d;

/* renamed from: D.m  reason: case insensitive filesystem */
public class C0012m extends View implements l {

    /* renamed from: a  reason: collision with root package name */
    public ImageReader f89a;

    /* renamed from: b  reason: collision with root package name */
    public Image f90b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f91c;

    /* renamed from: d  reason: collision with root package name */
    public j f92d;

    /* renamed from: e  reason: collision with root package name */
    public final int f93e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f94f = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0012m(Context context, int i2, int i3, int i4) {
        super(context, (AttributeSet) null);
        ImageReader f2 = f(i2, i3);
        this.f89a = f2;
        this.f93e = i4;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i2, int i3) {
        if (i2 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i3 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i3 + ", set height=1");
            i3 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ImageReader.newInstance(i2, i3, 1, 3, 768);
        }
        return ImageReader.newInstance(i2, i3, 1, 3);
    }

    public final void a(j jVar) {
        if (d.a(this.f93e) == 0) {
            Surface surface = this.f89a.getSurface();
            jVar.f569b = surface;
            jVar.f568a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f92d = jVar;
        this.f94f = true;
    }

    public final void d() {
        if (this.f94f) {
            setAlpha(0.0f);
            e();
            this.f91c = null;
            Image image = this.f90b;
            if (image != null) {
                image.close();
                this.f90b = null;
            }
            invalidate();
            this.f94f = false;
        }
    }

    public final boolean e() {
        if (!this.f94f) {
            return false;
        }
        Image acquireLatestImage = this.f89a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f90b;
            if (image != null) {
                image.close();
                this.f90b = null;
            }
            this.f90b = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage != null) {
            return true;
        }
        return false;
    }

    public final void g(int i2, int i3) {
        if (this.f92d != null) {
            if (i2 != this.f89a.getWidth() || i3 != this.f89a.getHeight()) {
                Image image = this.f90b;
                if (image != null) {
                    image.close();
                    this.f90b = null;
                }
                this.f89a.close();
                this.f89a = f(i2, i3);
            }
        }
    }

    public j getAttachedRenderer() {
        return this.f92d;
    }

    public ImageReader getImageReader() {
        return this.f89a;
    }

    public Surface getSurface() {
        return this.f89a.getSurface();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f90b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer e2 = image.getHardwareBuffer();
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                this.f91c = Bitmap.wrapHardwareBuffer(e2, ColorSpace.get(ColorSpace.Named.SRGB));
                e2.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f90b.getHeight();
                    Bitmap bitmap = this.f91c;
                    if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f91c.getHeight() == height)) {
                        this.f91c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f91c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f91c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f89a.getWidth() && i3 == this.f89a.getHeight()) && this.f93e == 1 && this.f94f) {
            g(i2, i3);
            j jVar = this.f92d;
            Surface surface = this.f89a.getSurface();
            jVar.f569b = surface;
            jVar.f568a.onSurfaceWindowChanged(surface);
        }
    }

    public final void b() {
    }

    public final void c() {
    }
}
