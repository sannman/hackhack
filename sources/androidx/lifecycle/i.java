package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.u;
import d0.h;

public final class i extends c {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
        int i2 = u.f438b;
        if (Build.VERSION.SDK_INT >= 29) {
            u.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new u.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
