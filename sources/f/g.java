package F;

import M.e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f206a;

    /* renamed from: b  reason: collision with root package name */
    public final int f207b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f208c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f206a = flutterJNI;
        this.f207b = i2;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (!this.f208c.getAndSet(true)) {
            int i2 = this.f207b;
            FlutterJNI flutterJNI = this.f206a;
            if (byteBuffer == null) {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
            } else {
                flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
            }
        } else {
            throw new IllegalStateException("Reply already submitted");
        }
    }
}
