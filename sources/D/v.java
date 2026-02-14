package D;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.k;

public final class v extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f110b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Handler handler, int i2) {
        super(handler);
        this.f109a = i2;
        this.f110b = obj;
    }

    public boolean deliverSelfNotifications() {
        switch (this.f109a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public void onChange(boolean z2, Uri uri) {
        switch (this.f109a) {
            case 1:
                k kVar = (k) this.f110b;
                if (!kVar.f789s) {
                    if (Settings.Global.getFloat(kVar.f777f, "transition_animation_scale", 1.0f) == 0.0f) {
                        kVar.f782k |= 4;
                    } else {
                        kVar.f782k &= -5;
                    }
                    ((FlutterJNI) kVar.f773b.f14b).setAccessibilityFeatures(kVar.f782k);
                    return;
                }
                return;
            default:
                super.onChange(z2, uri);
                return;
        }
    }

    public final void onChange(boolean z2) {
        switch (this.f109a) {
            case 0:
                super.onChange(z2);
                x xVar = (x) this.f110b;
                if (xVar.f121h != null) {
                    xVar.d();
                    return;
                }
                return;
            default:
                onChange(z2, (Uri) null);
                return;
        }
    }
}
