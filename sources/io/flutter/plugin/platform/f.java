package io.flutter.plugin.platform;

import B.a;
import D.C0005f;
import android.os.Build;
import android.view.Window;
import l.C0082o;
import l.C0084q;
import n.d;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final C0005f f642a;

    /* renamed from: b  reason: collision with root package name */
    public final a f643b;

    /* renamed from: c  reason: collision with root package name */
    public final C0005f f644c;

    /* renamed from: d  reason: collision with root package name */
    public L.f f645d;

    /* renamed from: e  reason: collision with root package name */
    public int f646e = 1280;

    public f(C0005f fVar, a aVar, C0005f fVar2) {
        c cVar = new c(0, this);
        this.f642a = fVar;
        this.f643b = aVar;
        aVar.f4d = cVar;
        this.f644c = fVar2;
    }

    public final void a(L.f fVar) {
        a.a aVar;
        Window window = this.f642a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            aVar = new C0084q(window);
        } else if (i2 >= 26) {
            aVar = new C0082o(window);
        } else {
            aVar = new C0082o(window);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = fVar.f256b;
        if (i4 != 0) {
            int a2 = d.a(i4);
            if (a2 == 0) {
                aVar.y(false);
            } else if (a2 == 1) {
                aVar.y(true);
            }
        }
        Integer num = fVar.f255a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = fVar.f257c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = fVar.f259e;
            if (i5 != 0) {
                int a3 = d.a(i5);
                if (a3 == 0) {
                    aVar.x(false);
                } else if (a3 == 1) {
                    aVar.x(true);
                }
            }
            Integer num2 = fVar.f258d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = fVar.f260f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = fVar.f261g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f645d = fVar;
    }

    public final void b() {
        this.f642a.getWindow().getDecorView().setSystemUiVisibility(this.f646e);
        L.f fVar = this.f645d;
        if (fVar != null) {
            a(fVar);
        }
    }
}
