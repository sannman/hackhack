package D;

import android.window.OnBackInvokedCallback;

/* renamed from: D.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0003d implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0005f f66a;

    public /* synthetic */ C0003d(C0005f fVar) {
        this.f66a = fVar;
    }

    public final void onBackInvoked() {
        this.f66a.onBackPressed();
    }
}
