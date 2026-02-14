package v;

import androidx.window.extensions.layout.WindowLayoutComponent;
import c0.a;
import d0.h;
import d0.i;
import r.C0091b;
import s.e;
import x.C0108c;
import x.C0109d;

/* renamed from: v.f  reason: case insensitive filesystem */
public final class C0100f extends i implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0100f f1204c = new i(0);

    public final Object a() {
        C0099e eVar;
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = C0102h.class.getClassLoader();
            if (classLoader != null) {
                eVar = new C0099e(classLoader, new C0091b(classLoader));
            } else {
                eVar = null;
            }
            if (!(eVar == null || (a2 = eVar.a()) == null)) {
                h.d(classLoader, "loader");
                C0091b bVar = new C0091b(classLoader);
                int a3 = e.a();
                if (a3 >= 2) {
                    return new C0109d(a2);
                }
                if (a3 == 1) {
                    return new C0108c(a2, bVar);
                }
                return new Object();
            }
        } catch (Throwable unused) {
            C0101g gVar = C0101g.f1205a;
        }
        return null;
    }
}
