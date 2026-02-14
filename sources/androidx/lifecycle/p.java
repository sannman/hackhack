package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import d0.h;

public abstract class p {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        h.e(activity, "activity");
        h.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
