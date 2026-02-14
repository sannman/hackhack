package l;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import h.C0041a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: l.d  reason: case insensitive filesystem */
public final class C0071d extends C0074g {

    /* renamed from: b  reason: collision with root package name */
    public static Field f891b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f892c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Constructor f893d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f894e = false;

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets f895a = c();

    private static WindowInsets c() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f892c) {
            try {
                f891b = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f892c = true;
        }
        Field field = f891b;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f894e) {
            try {
                f893d = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f894e = true;
        }
        Constructor constructor = f893d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    public C0081n b() {
        a();
        C0081n a2 = C0081n.a((View) null, this.f895a);
        C0080m mVar = a2.f909a;
        mVar.j((C0041a[]) null);
        mVar.l((C0041a) null);
        return a2;
    }
}
