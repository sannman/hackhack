package D;

import E.c;
import L.b;
import L.k;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: D.e  reason: case insensitive filesystem */
public final class C0004e implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0005f f67a;

    public C0004e(C0005f fVar) {
        this.f67a = fVar;
    }

    public final void onBackCancelled() {
        C0005f fVar = this.f67a;
        if (fVar.k("cancelBackGesture")) {
            C0008i iVar = fVar.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                cVar.f148j.f247a.e("cancelBackGesture", (Object) null, (k) null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        C0005f fVar = this.f67a;
        if (fVar.k("commitBackGesture")) {
            C0008i iVar = fVar.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                cVar.f148j.f247a.e("commitBackGesture", (Object) null, (k) null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        C0005f fVar = this.f67a;
        if (fVar.k("updateBackGestureProgress")) {
            C0008i iVar = fVar.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                b bVar = cVar.f148j;
                bVar.getClass();
                bVar.f247a.e("updateBackGestureProgress", b.a(backEvent), (k) null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        C0005f fVar = this.f67a;
        if (fVar.k("startBackGesture")) {
            C0008i iVar = fVar.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                b bVar = cVar.f148j;
                bVar.getClass();
                bVar.f247a.e("startBackGesture", b.a(backEvent), (k) null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
}
