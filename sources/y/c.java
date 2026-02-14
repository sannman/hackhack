package y;

import androidx.window.sidecar.SidecarDisplayFeature;
import c0.l;
import d0.h;
import d0.i;

public final class c extends i implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final c f1235c = new i(1);

    /* renamed from: b */
    public final Boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z2;
        h.e(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
