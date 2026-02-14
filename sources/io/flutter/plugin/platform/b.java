package io.flutter.plugin.platform;

import D.C0012m;
import android.view.MotionEvent;
import io.flutter.view.k;

public final class b extends C0012m {

    /* renamed from: g  reason: collision with root package name */
    public a f635g;

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z2;
        a aVar = this.f635g;
        if (aVar != null) {
            k kVar = aVar.f634a;
            if (kVar == null) {
                z2 = false;
            } else {
                z2 = kVar.d(motionEvent, true);
            }
            if (z2) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
