package E;

import android.graphics.ImageDecoder;
import io.flutter.embedding.engine.FlutterJNI;

public final /* synthetic */ class k implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f185a;

    public /* synthetic */ k(long j2) {
        this.f185a = j2;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$1(this.f185a, imageDecoder, imageInfo, source);
    }
}
