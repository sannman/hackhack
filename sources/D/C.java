package D;

import M.e;
import android.util.Log;
import java.nio.ByteBuffer;

public final /* synthetic */ class C implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ G f24a;

    public /* synthetic */ C(G g2) {
        this.f24a = g2;
    }

    public final void a(ByteBuffer byteBuffer) {
        boolean z2;
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                if (byteBuffer.get() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool = Boolean.valueOf(z2);
            }
        } else {
            Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        this.f24a.a(bool.booleanValue());
    }
}
