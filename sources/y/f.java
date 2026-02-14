package y;

import D.C0009j;
import U.m;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.C0092a;
import s.C0093b;
import s.g;
import v.C0096b;
import v.C0097c;
import v.k;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1238b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f1239a = 3;

    public f() {
        C0009j.f("verificationMode", 3);
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                if (a((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0097c e2 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public final k d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new k(m.f364b);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0112a.d(sidecarDeviceState2, C0112a.b(sidecarDeviceState));
        return new k(c(C0112a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final C0097c e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C0096b bVar;
        C0096b bVar2;
        h.e(sidecarDisplayFeature, "feature");
        C0092a aVar = C0092a.f1160a;
        int i2 = this.f1239a;
        C0009j.f("verificationMode", i2);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new g(sidecarDisplayFeature, i2, aVar).w("Type must be either TYPE_FOLD or TYPE_HINGE", b.f1234c).w("Feature bounds must not be 0", c.f1235c).w("TYPE_FOLD must have 0 area", d.f1236c).w("Feature be pinned to either left or top", e.f1237c).f();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = C0096b.f1192h;
        } else if (type != 2) {
            return null;
        } else {
            bVar = C0096b.f1193i;
        }
        int b2 = C0112a.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 != 2) {
            bVar2 = C0096b.f1190f;
            if (b2 != 3 && b2 == 4) {
                return null;
            }
        } else {
            bVar2 = C0096b.f1191g;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        h.d(rect, "feature.rect");
        return new C0097c(new C0093b(rect), bVar, bVar2);
    }
}
