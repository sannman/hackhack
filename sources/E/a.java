package E;

import android.util.SparseArray;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import java.util.Iterator;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f136a;

    public a(c cVar) {
        this.f136a = cVar;
    }

    public final void a() {
        c cVar = this.f136a;
        Iterator it = cVar.u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            j jVar = cVar.f156s;
            SparseArray sparseArray = jVar.f669k;
            if (sparseArray.size() <= 0) {
                break;
            }
            jVar.u.f(sparseArray.keyAt(0));
        }
        while (true) {
            i iVar = cVar.f157t;
            SparseArray sparseArray2 = iVar.f653g;
            if (sparseArray2.size() > 0) {
                iVar.m.f(sparseArray2.keyAt(0));
            } else {
                cVar.f149k.f291b = null;
                return;
            }
        }
    }

    public final void b() {
    }
}
