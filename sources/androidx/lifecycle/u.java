package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import d0.h;

public class u extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f438b = 0;

    /* renamed from: a  reason: collision with root package name */
    public D.u f439a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final t Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            h.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            h.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            h.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            h.e(activity, "activity");
            int i2 = u.f438b;
            s.a(activity, f.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            h.e(activity, "activity");
            int i2 = u.f438b;
            s.a(activity, f.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            h.e(activity, "activity");
            int i2 = u.f438b;
            s.a(activity, f.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            h.e(activity, "activity");
            int i2 = u.f438b;
            s.a(activity, f.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            h.e(activity, "activity");
            int i2 = u.f438b;
            s.a(activity, f.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            h.e(activity, "activity");
            int i2 = u.f438b;
            s.a(activity, f.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            h.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            h.e(activity, "activity");
            h.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            h.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            h.e(activity, "activity");
        }
    }

    public final void a(f fVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            h.d(activity, "activity");
            s.a(activity, fVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(f.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(f.ON_DESTROY);
        this.f439a = null;
    }

    public final void onPause() {
        super.onPause();
        a(f.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        D.u uVar = this.f439a;
        if (uVar != null) {
            ((r) uVar.f108c).b();
        }
        a(f.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        D.u uVar = this.f439a;
        if (uVar != null) {
            r rVar = (r) uVar.f108c;
            int i2 = rVar.f430a + 1;
            rVar.f430a = i2;
            if (i2 == 1 && rVar.f433d) {
                rVar.f435f.c(f.ON_START);
                rVar.f433d = false;
            }
        }
        a(f.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(f.ON_STOP);
    }
}
