package io.flutter.view;

import D.u;
import D.x;
import android.view.accessibility.AccessibilityManager;

public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f690a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f691b;

    public c(k kVar, AccessibilityManager accessibilityManager) {
        this.f691b = kVar;
        this.f690a = accessibilityManager;
    }

    public final void onTouchExplorationStateChanged(boolean z2) {
        k kVar = this.f691b;
        if (!kVar.f789s) {
            boolean z3 = false;
            if (!z2) {
                kVar.h(false);
                g gVar = kVar.f784n;
                if (gVar != null) {
                    kVar.f(gVar.f744b, 256);
                    kVar.f784n = null;
                }
            }
            u uVar = kVar.f787q;
            if (uVar != null) {
                boolean isEnabled = this.f690a.isEnabled();
                x xVar = (x) uVar.f108c;
                if (!xVar.f121h.f140b.f568a.getIsSoftwareRenderingEnabled()) {
                    if (!isEnabled && !z2) {
                        z3 = true;
                    }
                    xVar.setWillNotDraw(z3);
                    return;
                }
                xVar.setWillNotDraw(false);
            }
        }
    }
}
