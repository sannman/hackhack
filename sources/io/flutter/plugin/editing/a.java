package io.flutter.plugin.editing;

import android.view.View;
import android.view.WindowInsets;

public final class a implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImeSyncDeferringInsetsCallback f575a;

    public a(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        this.f575a = imeSyncDeferringInsetsCallback;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f575a;
        View unused = imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            WindowInsets unused2 = imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            boolean unused3 = imeSyncDeferringInsetsCallback.needsSave = false;
        }
        if (imeSyncDeferringInsetsCallback.animating) {
            return WindowInsets.CONSUMED;
        }
        return view.onApplyWindowInsets(windowInsets);
    }
}
