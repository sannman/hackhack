package L;

import M.h;
import M.n;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C.b f247a;

    public b(F.b bVar, int i2) {
        switch (i2) {
            case 1:
                B.b bVar2 = new B.b(8);
                C.b bVar3 = new C.b(bVar, "flutter/navigation", h.f327b);
                this.f247a = bVar3;
                bVar3.h(bVar2);
                return;
            default:
                B.b bVar4 = new B.b(6);
                C.b bVar5 = new C.b(bVar, "flutter/backgesture", n.f331a);
                this.f247a = bVar5;
                bVar5.h(bVar4);
                return;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        List list;
        HashMap hashMap = new HashMap(3);
        float a2 = backEvent.getTouchX();
        float d2 = backEvent.getTouchY();
        if (Float.isNaN(a2) || Float.isNaN(d2)) {
            list = null;
        } else {
            list = Arrays.asList(new Float[]{Float.valueOf(a2), Float.valueOf(d2)});
        }
        hashMap.put("touchOffset", list);
        hashMap.put("progress", Float.valueOf(backEvent.getProgress()));
        hashMap.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return hashMap;
    }
}
