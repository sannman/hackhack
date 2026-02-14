package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public final class q implements WindowManager {

    /* renamed from: a  reason: collision with root package name */
    public final WindowManager f686a;

    /* renamed from: b  reason: collision with root package name */
    public final k f687b;

    public q(WindowManager windowManager, k kVar) {
        this.f686a = windowManager;
        this.f687b = kVar;
    }

    public final void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f686a.addCrossWindowBlurEnabledListener(consumer);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k kVar = this.f687b;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            kVar.addView(view, layoutParams);
        }
    }

    public final WindowMetrics getCurrentWindowMetrics() {
        return this.f686a.getCurrentWindowMetrics();
    }

    public final Display getDefaultDisplay() {
        return this.f686a.getDefaultDisplay();
    }

    public final WindowMetrics getMaximumWindowMetrics() {
        return this.f686a.getMaximumWindowMetrics();
    }

    public final boolean isCrossWindowBlurEnabled() {
        return this.f686a.isCrossWindowBlurEnabled();
    }

    public final void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f686a.removeCrossWindowBlurEnabledListener(consumer);
    }

    public final void removeView(View view) {
        k kVar = this.f687b;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            kVar.removeView(view);
        }
    }

    public final void removeViewImmediate(View view) {
        k kVar = this.f687b;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        kVar.removeView(view);
    }

    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        k kVar = this.f687b;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            kVar.updateViewLayout(view, layoutParams);
        }
    }

    public final void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f686a.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
