package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.h;
import java.util.WeakHashMap;
import y.C0112a;
import y.f;

public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: a  reason: collision with root package name */
    public final Object f441a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f442b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f443c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final f f444d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f445e;

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f444d = fVar;
        this.f445e = sidecarCallback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (y.C0112a.b(r2) == y.C0112a.b(r4)) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r3.f441a
            monitor-enter(r0)
            y.f r1 = r3.f444d     // Catch:{ all -> 0x0023 }
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f442b     // Catch:{ all -> 0x0023 }
            r1.getClass()     // Catch:{ all -> 0x0023 }
            boolean r1 = d0.h.a(r2, r4)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0021
        L_0x0014:
            if (r2 != 0) goto L_0x0017
            goto L_0x0025
        L_0x0017:
            int r1 = y.C0112a.b(r2)     // Catch:{ all -> 0x0023 }
            int r2 = y.C0112a.b(r4)     // Catch:{ all -> 0x0023 }
            if (r1 != r2) goto L_0x0025
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r4 = move-exception
            goto L_0x002e
        L_0x0025:
            r3.f442b = r4     // Catch:{ all -> 0x0023 }
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.f445e     // Catch:{ all -> 0x0023 }
            r1.onDeviceStateChanged(r4)     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean z2;
        synchronized (this.f441a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f443c.get(iBinder);
                this.f444d.getClass();
                if (h.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    z2 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null) {
                        if (sidecarWindowLayoutInfo != null) {
                            z2 = f.b(C0112a.c(sidecarWindowLayoutInfo2), C0112a.c(sidecarWindowLayoutInfo));
                        }
                    }
                    z2 = false;
                }
                if (!z2) {
                    this.f443c.put(iBinder, sidecarWindowLayoutInfo);
                    this.f445e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
