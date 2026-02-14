package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import d0.h;

public final class q extends c {
    final /* synthetic */ r this$0;

    public static final class a extends c {
        final /* synthetic */ r this$0;

        public a(r rVar) {
            this.this$0 = rVar;
        }

        public void onActivityPostResumed(Activity activity) {
            h.e(activity, "activity");
            this.this$0.b();
        }

        public void onActivityPostStarted(Activity activity) {
            h.e(activity, "activity");
            r rVar = this.this$0;
            int i2 = rVar.f430a + 1;
            rVar.f430a = i2;
            if (i2 == 1 && rVar.f433d) {
                rVar.f435f.c(f.ON_START);
                rVar.f433d = false;
            }
        }
    }

    public q(r rVar) {
        this.this$0 = rVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = u.f438b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((u) findFragmentByTag).f439a = this.this$0.f437h;
        }
    }

    public void onActivityPaused(Activity activity) {
        h.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f431b - 1;
        rVar.f431b = i2;
        if (i2 == 0) {
            Handler handler = rVar.f434e;
            h.b(handler);
            handler.postDelayed(rVar.f436g, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        h.e(activity, "activity");
        p.a(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        h.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f430a - 1;
        rVar.f430a = i2;
        if (i2 == 0 && rVar.f432c) {
            rVar.f435f.c(f.ON_STOP);
            rVar.f433d = true;
        }
    }
}
