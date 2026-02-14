package androidx.window.layout.adapter.sidecar;

import C.b;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.h;
import java.util.Collection;
import v.k;
import y.f;
import y.i;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f446a;

    public SidecarCompat$TranslatingCallback(i iVar) {
        this.f446a = iVar;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        IBinder iBinder;
        SidecarInterface sidecarInterface;
        Window window;
        WindowManager.LayoutParams attributes;
        h.e(sidecarDeviceState, "newDeviceState");
        Collection<Activity> values = this.f446a.f1244c.values();
        i iVar = this.f446a;
        for (Activity activity : values) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                iBinder = null;
            } else {
                iBinder = attributes.token;
            }
            if (!(iBinder == null || (sidecarInterface = iVar.f1242a) == null)) {
                sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
            }
            b bVar = iVar.f1246e;
            if (bVar != null) {
                bVar.g(activity, iVar.f1243b.d(sidecarWindowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        h.e(iBinder, "windowToken");
        h.e(sidecarWindowLayoutInfo, "newLayout");
        Activity activity = (Activity) this.f446a.f1244c.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        i iVar = this.f446a;
        f fVar = iVar.f1243b;
        SidecarInterface sidecarInterface = iVar.f1242a;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        k d2 = fVar.d(sidecarWindowLayoutInfo, sidecarDeviceState);
        b bVar = this.f446a.f1246e;
        if (bVar != null) {
            bVar.g(activity, d2);
        }
    }
}
