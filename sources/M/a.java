package M;

import B.e;
import C.b;
import L.k;
import android.util.Log;
import java.nio.ByteBuffer;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f321a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f322b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f323c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f321a = i2;
        this.f323c = obj;
        this.f322b = obj2;
    }

    public final void a(ByteBuffer byteBuffer) {
        switch (this.f321a) {
            case 0:
                e eVar = (e) this.f323c;
                try {
                    ((c) this.f322b).d(((i) eVar.f9c).b(byteBuffer));
                    return;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f8b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                b bVar = (b) this.f323c;
                k kVar = (k) this.f322b;
                if (byteBuffer == null) {
                    try {
                        kVar.getClass();
                        return;
                    } catch (RuntimeException e3) {
                        Log.e("MethodChannel#".concat((String) bVar.f14b), "Failed to handle method call result", e3);
                        return;
                    }
                } else {
                    try {
                        kVar.c(((k) bVar.f15c).h(byteBuffer));
                        return;
                    } catch (g e4) {
                        kVar.a(e4.f324b, e4.getMessage(), e4.f325c);
                        return;
                    }
                }
        }
    }
}
