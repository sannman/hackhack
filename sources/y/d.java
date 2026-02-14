package y;

import androidx.window.sidecar.SidecarDisplayFeature;
import c0.l;
import d0.h;
import d0.i;

public final class d extends i implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final d f1236c = new i(1);

    /* renamed from: b */
    public final Boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        h.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
