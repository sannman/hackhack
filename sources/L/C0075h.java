package l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import h.C0041a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: l.h  reason: case insensitive filesystem */
public abstract class C0075h extends C0080m {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f897f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Method f898g;

    /* renamed from: h  reason: collision with root package name */
    public static Class f899h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f900i;

    /* renamed from: j  reason: collision with root package name */
    public static Field f901j;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f902c;

    /* renamed from: d  reason: collision with root package name */
    public C0041a f903d = null;

    /* renamed from: e  reason: collision with root package name */
    public C0041a f904e;

    public C0075h(C0081n nVar, WindowInsets windowInsets) {
        super(nVar);
        this.f902c = windowInsets;
    }

    private C0041a m(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f897f) {
                n();
            }
            Method method = f898g;
            if (!(method == null || f899h == null || f900i == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f900i.get(f901j.get(invoke));
                    if (rect != null) {
                        return C0041a.a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void n() {
        try {
            f898g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f899h = cls;
            f900i = cls.getDeclaredField("mVisibleInsets");
            f901j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f900i.setAccessible(true);
            f901j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f897f = true;
    }

    public void d(View view) {
        C0041a m = m(view);
        if (m == null) {
            m = C0041a.f529e;
        }
        o(m);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f904e, ((C0075h) obj).f904e);
    }

    public final C0041a g() {
        if (this.f903d == null) {
            WindowInsets windowInsets = this.f902c;
            this.f903d = C0041a.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f903d;
    }

    public boolean i() {
        return this.f902c.isRound();
    }

    public void o(C0041a aVar) {
        this.f904e = aVar;
    }

    public void j(C0041a[] aVarArr) {
    }

    public void k(C0081n nVar) {
    }
}
