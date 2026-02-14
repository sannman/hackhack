package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;

public final /* synthetic */ class f implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f544a;

    public /* synthetic */ f(g gVar) {
        this.f544a = gVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        g gVar = this.f544a;
        gVar.getClass();
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e2) {
            Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e2);
            image = null;
        }
        if (image != null) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = gVar.f548d;
            if (flutterRenderer$ImageReaderSurfaceProducer.released || gVar.f547c) {
                image.close();
            } else {
                flutterRenderer$ImageReaderSurfaceProducer.onImage(imageReader, image);
            }
        }
    }
}
