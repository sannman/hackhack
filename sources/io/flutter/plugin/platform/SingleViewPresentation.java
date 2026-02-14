package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private l rootView;
    private boolean startFocused = false;
    private final o state;
    private int viewId;

    /* JADX WARNING: type inference failed for: r2v1, types: [io.flutter.plugin.platform.o, java.lang.Object] */
    public SingleViewPresentation(Context context, Display display, g gVar, a aVar, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new m(context, (InputMethodManager) null), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new Object();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public o detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public g getView() {
        this.state.getClass();
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        o oVar = this.state;
        if (oVar.f685b == null) {
            oVar.f685b = new k(getContext());
        }
        if (this.state.f684a == null) {
            o oVar2 = this.state;
            oVar2.f684a = new q((WindowManager) getContext().getSystemService("window"), oVar2.f685b);
        }
        this.container = new FrameLayout(getContext());
        new n(getContext(), this.state.f684a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, o oVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new m(context, (InputMethodManager) null), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = oVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
