package D;

import android.view.ViewTreeObserver;

/* renamed from: D.h  reason: case insensitive filesystem */
public final class C0007h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f75a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0008i f76b;

    public C0007h(C0008i iVar, x xVar) {
        this.f76b = iVar;
        this.f75a = xVar;
    }

    public final boolean onPreDraw() {
        C0008i iVar = this.f76b;
        if (iVar.f84h && iVar.f82f != null) {
            this.f75a.getViewTreeObserver().removeOnPreDrawListener(this);
            iVar.f82f = null;
        }
        return iVar.f84h;
    }
}
