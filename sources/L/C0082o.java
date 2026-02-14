package l;

import a.a;
import android.view.View;
import android.view.Window;

/* renamed from: l.o  reason: case insensitive filesystem */
public class C0082o extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Window f910e;

    public C0082o(Window window) {
        this.f910e = window;
    }

    public final void y(boolean z2) {
        Window window = this.f910e;
        if (z2) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
    }
}
