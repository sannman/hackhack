package R;

import M.l;
import M.m;
import java.io.Serializable;
import java.nio.ByteBuffer;

public final class b extends m {

    /* renamed from: d  reason: collision with root package name */
    public static final b f345d = new Object();

    public final Serializable f(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.f(b2, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        if (e2 == null) {
            return null;
        }
        return c.values()[((Long) e2).intValue()];
    }

    public final void k(l lVar, Object obj) {
        Integer num;
        if (obj instanceof c) {
            lVar.write(129);
            if (obj == null) {
                num = null;
            } else {
                num = Integer.valueOf(((c) obj).f347b);
            }
            k(lVar, num);
            return;
        }
        super.k(lVar, obj);
    }
}
