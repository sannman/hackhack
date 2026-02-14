package io.flutter.plugin.platform;

import android.view.View;

public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f641b;

    public e(f fVar, View view) {
        this.f641b = fVar;
        this.f640a = view;
    }

    public final void onSystemUiVisibilityChange(int i2) {
        this.f640a.post(new d(this, i2));
    }
}
