package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import d0.h;

public abstract class c implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        h.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        h.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        h.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
        h.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        h.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        h.e(activity, "activity");
    }
}
