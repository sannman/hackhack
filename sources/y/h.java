package y;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final i f1240a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f1241b;

    public h(i iVar, Activity activity) {
        d0.h.e(iVar, "sidecarCompat");
        this.f1240a = iVar;
        this.f1241b = new WeakReference(activity);
    }

    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        d0.h.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f1241b.get();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            iBinder = null;
        } else {
            iBinder = attributes.token;
        }
        if (activity != null && iBinder != null) {
            this.f1240a.c(iBinder, activity);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        d0.h.e(view, "view");
    }
}
