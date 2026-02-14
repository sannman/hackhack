package io.flutter.embedding.engine.renderer;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f541b;

    public /* synthetic */ d(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer) {
        this.f541b = flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final void run() {
        this.f541b.lambda$dequeueImage$0();
    }
}
