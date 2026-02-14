package io.flutter.embedding.engine.renderer;

import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ImageReader f545a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f546b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public boolean f547c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f548d;

    public g(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f548d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f545a = imageReader;
        imageReader.setOnImageAvailableListener(new f(this), new Handler(Looper.getMainLooper()));
    }
}
