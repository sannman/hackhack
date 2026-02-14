package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

public final class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final long f549b;

    /* renamed from: c  reason: collision with root package name */
    public final FlutterJNI f550c;

    public h(long j2, FlutterJNI flutterJNI) {
        this.f549b = j2;
        this.f550c = flutterJNI;
    }

    public final void run() {
        FlutterJNI flutterJNI = this.f550c;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f549b);
        }
    }
}
