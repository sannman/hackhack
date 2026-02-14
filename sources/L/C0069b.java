package l;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: l.b  reason: case insensitive filesystem */
public abstract class C0069b {
    public static C0081n a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0081n a2 = C0081n.a((View) null, rootWindowInsets);
        C0080m mVar = a2.f909a;
        mVar.k(a2);
        mVar.d(view.getRootView());
        return a2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
