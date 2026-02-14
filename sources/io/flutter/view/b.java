package io.flutter.view;

import D.u;
import D.x;
import E.l;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f689a;

    public b(k kVar) {
        this.f689a = kVar;
    }

    public final void onAccessibilityStateChanged(boolean z2) {
        k kVar = this.f689a;
        if (!kVar.f789s) {
            boolean z3 = false;
            C.b bVar = kVar.f773b;
            if (z2) {
                a aVar = kVar.f790t;
                bVar.f15c = aVar;
                ((FlutterJNI) bVar.f14b).setAccessibilityDelegate(aVar);
                ((FlutterJNI) bVar.f14b).setSemanticsEnabled(true);
            } else {
                kVar.h(false);
                bVar.f15c = null;
                ((FlutterJNI) bVar.f14b).setAccessibilityDelegate((l) null);
                ((FlutterJNI) bVar.f14b).setSemanticsEnabled(false);
            }
            u uVar = kVar.f787q;
            if (uVar != null) {
                boolean isTouchExplorationEnabled = kVar.f774c.isTouchExplorationEnabled();
                x xVar = (x) uVar.f108c;
                if (!xVar.f121h.f140b.f568a.getIsSoftwareRenderingEnabled()) {
                    if (!z2 && !isTouchExplorationEnabled) {
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
