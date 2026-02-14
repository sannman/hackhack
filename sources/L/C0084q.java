package l;

import a.a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: l.q  reason: case insensitive filesystem */
public final class C0084q extends a {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsController f911e;

    /* renamed from: f  reason: collision with root package name */
    public final Window f912f;

    public C0084q(Window window) {
        this.f911e = window.getInsetsController();
        this.f912f = window;
    }

    public final void x(boolean z2) {
        Window window = this.f912f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f911e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f911e.setSystemBarsAppearance(0, 16);
    }

    public final void y(boolean z2) {
        Window window = this.f912f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f911e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f911e.setSystemBarsAppearance(0, 8);
    }
}
