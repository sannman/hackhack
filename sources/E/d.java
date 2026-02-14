package E;

import D.C0005f;
import L.k;
import P.a;
import android.content.Intent;
import androidx.lifecycle.n;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final C0005f f160a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f161b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f162c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f163d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f164e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f165f;

    public d(C0005f fVar, n nVar) {
        new HashSet();
        this.f165f = new HashSet();
        this.f160a = fVar;
        new HiddenLifecycleReference(nVar);
    }

    public final boolean a(int i2, int i3, Intent intent) {
        String str;
        Iterator it = new HashSet(this.f162c).iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z2;
                }
                HashMap hashMap = ((a) it.next()).f339d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    if (i3 == -1) {
                        str = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
                    } else {
                        str = null;
                    }
                    ((k) hashMap.remove(Integer.valueOf(i2))).c(str);
                } else if (z2) {
                }
                z2 = true;
            }
        }
    }
}
