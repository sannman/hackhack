package L;

import B.a;
import C.b;
import F.g;
import android.util.Log;
import java.nio.ByteBuffer;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f287a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f288b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f289c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f287a = i2;
        this.f289c = obj;
        this.f288b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f287a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((g) this.f288b).a(((M.k) ((b) ((a) this.f289c).f4d).f15c).d(str, str2, obj));
                return;
        }
    }

    public void b() {
        ((g) this.f288b).a((ByteBuffer) null);
    }

    public final void c(Object obj) {
        switch (this.f287a) {
            case 0:
                ((l) this.f289c).f291b = (byte[]) this.f288b;
                return;
            default:
                ((g) this.f288b).a(((M.k) ((b) ((a) this.f289c).f4d).f15c).e(obj));
                return;
        }
    }
}
