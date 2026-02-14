package io.flutter.plugin.platform;

import B.a;
import C.b;
import L.k;
import java.util.Arrays;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f639c;

    public /* synthetic */ d(e eVar, int i2) {
        this.f638b = eVar;
        this.f639c = i2;
    }

    public final void run() {
        int i2 = this.f639c & 4;
        f fVar = this.f638b.f641b;
        if (i2 == 0) {
            a aVar = fVar.f643b;
            aVar.getClass();
            ((b) aVar.f3c).e("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.TRUE}), (k) null);
            return;
        }
        a aVar2 = fVar.f643b;
        aVar2.getClass();
        ((b) aVar2.f3c).e("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.FALSE}), (k) null);
    }
}
