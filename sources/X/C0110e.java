package x;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.h;
import java.util.ArrayList;
import java.util.List;
import l.C0071d;
import l.C0072e;
import l.C0073f;
import l.C0074g;
import l.C0081n;
import s.C0093b;
import v.C0096b;
import v.C0097c;
import v.k;
import v.l;
import v.n;

/* renamed from: x.e  reason: case insensitive filesystem */
public abstract class C0110e {
    public static C0097c a(l lVar, FoldingFeature foldingFeature) {
        C0096b bVar;
        C0096b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = C0096b.f1192h;
        } else if (type != 2) {
            return null;
        } else {
            bVar = C0096b.f1193i;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = C0096b.f1190f;
        } else if (state != 2) {
            return null;
        } else {
            bVar2 = C0096b.f1191g;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        } else if (i3 <= i5) {
            Rect a2 = lVar.f1216a.a();
            int i6 = i5 - i3;
            if (i6 == 0 && i4 - i2 == 0) {
                return null;
            }
            int i7 = i4 - i2;
            if (i7 != a2.width() && i6 != a2.height()) {
                return null;
            }
            if (i7 < a2.width() && i6 < a2.height()) {
                return null;
            }
            if (i7 == a2.width() && i6 == a2.height()) {
                return null;
            }
            Rect bounds2 = foldingFeature.getBounds();
            h.d(bounds2, "oemFeature.bounds");
            return new C0097c(new C0093b(bounds2), bVar, bVar2);
        } else {
            throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
        }
    }

    public static k b(Context context, WindowLayoutInfo windowLayoutInfo) {
        l lVar;
        C0074g gVar;
        h.e(windowLayoutInfo, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            int i3 = n.f1219b;
            if (i2 >= 30) {
                WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
                C0081n a2 = C0081n.a((View) null, windowManager.getCurrentWindowMetrics().getWindowInsets());
                Rect e2 = windowManager.getCurrentWindowMetrics().getBounds();
                h.d(e2, "wm.currentWindowMetrics.bounds");
                lVar = new l(new C0093b(e2), a2);
            } else {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    boolean z2 = context2 instanceof Activity;
                    if (!z2 && !(context2 instanceof InputMethodService)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() != null) {
                            context2 = contextWrapper.getBaseContext();
                            h.d(context2, "iterator.baseContext");
                        }
                    }
                    if (z2) {
                        lVar = n.a((Activity) context);
                    } else if (context2 instanceof InputMethodService) {
                        Object systemService = context.getSystemService("window");
                        h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                        h.d(defaultDisplay, "wm.defaultDisplay");
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 30) {
                            gVar = new C0073f();
                        } else if (i4 >= 29) {
                            gVar = new C0072e();
                        } else {
                            gVar = new C0071d();
                        }
                        C0081n b2 = gVar.b();
                        h.d(b2, "Builder().build()");
                        lVar = new l(new C0093b(rect), b2);
                    } else {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                }
                throw new IllegalArgumentException("Context " + context + " is not a UiContext");
            }
            return c(lVar, windowLayoutInfo);
        } else if (i2 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        } else {
            int i5 = n.f1219b;
            return c(n.a((Activity) context), windowLayoutInfo);
        }
    }

    public static k c(l lVar, WindowLayoutInfo windowLayoutInfo) {
        C0097c cVar;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                cVar = a(lVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }
}
