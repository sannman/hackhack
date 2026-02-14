package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

public final class d extends BaseInputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f589a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, f fVar) {
        super(view, true);
        this.f589a = fVar;
    }

    public final Editable getEditable() {
        return this.f589a;
    }
}
