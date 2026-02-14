package E;

import C.b;
import D.C0005f;
import F.a;
import H.f;
import L.k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.j;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f181a = new ArrayList();

    public h(C0005f fVar, String[] strArr) {
        f fVar2 = (f) b.d().f13a;
        if (!fVar2.f240a) {
            fVar2.b(fVar.getApplicationContext());
            fVar2.a(fVar.getApplicationContext(), strArr);
        }
    }

    public final c a(g gVar) {
        c cVar;
        C0005f fVar = gVar.f175a;
        a aVar = gVar.f176b;
        String str = gVar.f177c;
        List list = gVar.f178d;
        j jVar = new j();
        boolean z2 = gVar.f179e;
        boolean z3 = gVar.f180f;
        if (aVar == null) {
            f fVar2 = (f) b.d().f13a;
            if (fVar2.f240a) {
                aVar = new a(fVar2.f243d.f230b, "main");
            } else {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
        }
        a aVar2 = aVar;
        ArrayList arrayList = this.f181a;
        if (arrayList.size() == 0) {
            cVar = new c(fVar, (FlutterJNI) null, jVar, z2, z3);
            if (str != null) {
                cVar.f147i.f247a.e("setInitialRoute", str, (k) null);
            }
            cVar.f141c.b(aVar2, list);
        } else {
            j jVar2 = jVar;
            boolean z4 = z2;
            boolean z5 = z3;
            c cVar2 = (c) arrayList.get(0);
            if (cVar2.f139a.isAttached()) {
                String str2 = str;
                long j2 = c.f137x;
                cVar = new c(fVar, cVar2.f139a.spawn(aVar2.f188c, aVar2.f187b, str2, list, j2), jVar2, z4, z5);
            } else {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
        }
        arrayList.add(cVar);
        cVar.u.add(new f(this, cVar));
        return cVar;
    }
}
