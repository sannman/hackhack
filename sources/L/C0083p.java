package l;

import android.view.View;
import android.view.Window;

/* renamed from: l.p  reason: case insensitive filesystem */
public final class C0083p extends C0082o {
    public final void x(boolean z2) {
        Window window = this.f910e;
        if (z2) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
    }
}
