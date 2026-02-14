package v;

import U.b;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import d0.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import l.C0071d;
import l.C0072e;
import l.C0073f;
import l.C0074g;
import l.C0081n;
import s.C0093b;
import z.C0113a;

public final class n implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1219b = 0;

    static {
        new ArrayList(new b(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static l a(Activity activity) {
        Rect rect;
        C0081n nVar;
        C0074g gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            h.d(rect, "wm.currentWindowMetrics.bounds");
        } else {
            int i3 = 0;
            if (i2 >= 29) {
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                    h.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                    rect = new Rect((Rect) invoke);
                } catch (NoSuchFieldException e2) {
                    Log.w("n", e2);
                    rect = b(activity);
                } catch (NoSuchMethodException e3) {
                    Log.w("n", e3);
                    rect = b(activity);
                } catch (IllegalAccessException e4) {
                    Log.w("n", e4);
                    rect = b(activity);
                } catch (InvocationTargetException e5) {
                    Log.w("n", e5);
                    rect = b(activity);
                }
            } else if (i2 >= 28) {
                rect = b(activity);
            } else {
                rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i3 = resources.getDimensionPixelSize(identifier);
                    }
                    int i4 = rect.bottom + i3;
                    if (i4 == point.y) {
                        rect.bottom = i4;
                    } else {
                        int i5 = rect.right + i3;
                        if (i5 == point.x) {
                            rect.right = i5;
                        }
                    }
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30) {
            if (i6 >= 30) {
                gVar = new C0073f();
            } else if (i6 >= 29) {
                gVar = new C0072e();
            } else {
                gVar = new C0071d();
            }
            nVar = gVar.b();
            h.d(nVar, "{\n            WindowInse…ilder().build()\n        }");
        } else if (i6 >= 30) {
            nVar = C0113a.f1254a.a(activity);
        } else {
            throw new Exception("Incompatible SDK version");
        }
        return new l(new C0093b(rect), nVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect b(android.app.Activity r10) {
        /*
            java.lang.String r0 = "n"
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.content.res.Resources r2 = r10.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r3 = 0
            r4 = 1
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.String r6 = "windowConfiguration"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            r5.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            boolean r5 = r10.isInMultiWindowMode()     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.String r6 = "null cannot be cast to non-null type android.graphics.Rect"
            if (r5 == 0) goto L_0x004b
            java.lang.Class r5 = r2.getClass()     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.String r7 = "getBounds"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.Object r2 = r5.invoke(r2, r7)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            d0.h.c(r2, r6)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            r1.set(r2)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            goto L_0x00a1
        L_0x0043:
            r2 = move-exception
            goto L_0x0066
        L_0x0045:
            r2 = move-exception
            goto L_0x0075
        L_0x0047:
            r2 = move-exception
            goto L_0x0084
        L_0x0049:
            r2 = move-exception
            goto L_0x0093
        L_0x004b:
            java.lang.Class r5 = r2.getClass()     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.String r7 = "getAppBounds"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            java.lang.Object r2 = r5.invoke(r2, r7)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            d0.h.c(r2, r6)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            r1.set(r2)     // Catch:{ NoSuchFieldException -> 0x0049, NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043 }
            goto L_0x00a1
        L_0x0066:
            android.util.Log.w(r0, r2)
            android.view.WindowManager r2 = r10.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getRectSize(r1)
            goto L_0x00a1
        L_0x0075:
            android.util.Log.w(r0, r2)
            android.view.WindowManager r2 = r10.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getRectSize(r1)
            goto L_0x00a1
        L_0x0084:
            android.util.Log.w(r0, r2)
            android.view.WindowManager r2 = r10.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getRectSize(r1)
            goto L_0x00a1
        L_0x0093:
            android.util.Log.w(r0, r2)
            android.view.WindowManager r2 = r10.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getRectSize(r1)
        L_0x00a1:
            android.view.WindowManager r2 = r10.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            java.lang.String r6 = "currentDisplay"
            d0.h.d(r2, r6)
            r2.getRealSize(r5)
            boolean r6 = r10.isInMultiWindowMode()
            if (r6 != 0) goto L_0x00ec
            android.content.res.Resources r6 = r10.getResources()
            java.lang.String r7 = "navigation_bar_height"
            java.lang.String r8 = "dimen"
            java.lang.String r9 = "android"
            int r7 = r6.getIdentifier(r7, r8, r9)
            if (r7 <= 0) goto L_0x00d1
            int r6 = r6.getDimensionPixelSize(r7)
            goto L_0x00d2
        L_0x00d1:
            r6 = r3
        L_0x00d2:
            int r7 = r1.bottom
            int r7 = r7 + r6
            int r8 = r5.y
            if (r7 != r8) goto L_0x00dc
            r1.bottom = r7
            goto L_0x00ec
        L_0x00dc:
            int r7 = r1.right
            int r7 = r7 + r6
            int r8 = r5.x
            if (r7 != r8) goto L_0x00e6
            r1.right = r7
            goto L_0x00ec
        L_0x00e6:
            int r7 = r1.left
            if (r7 != r6) goto L_0x00ec
            r1.left = r3
        L_0x00ec:
            int r6 = r1.width()
            int r7 = r5.x
            if (r6 < r7) goto L_0x00fc
            int r6 = r1.height()
            int r7 = r5.y
            if (r6 >= r7) goto L_0x01b1
        L_0x00fc:
            boolean r10 = r10.isInMultiWindowMode()
            if (r10 != 0) goto L_0x01b1
            java.lang.String r10 = "android.view.DisplayInfo"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.reflect.Constructor r10 = r10.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            r10.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Object r10 = r10.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Class r6 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.String r7 = "getDisplayInfo"
            java.lang.Class r8 = r10.getClass()     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            r6.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Object[] r7 = new java.lang.Object[]{r10}     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            r6.invoke(r2, r7)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Class r2 = r10.getClass()     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.String r6 = "displayCutout"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r6)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            r2.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            java.lang.Object r10 = r2.get(r10)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            boolean r2 = D.C0011l.q(r10)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            if (r2 == 0) goto L_0x0172
            android.view.DisplayCutout r10 = D.C0011l.h(r10)     // Catch:{ ClassNotFoundException -> 0x0159, NoSuchMethodException -> 0x0157, NoSuchFieldException -> 0x0155, IllegalAccessException -> 0x0153, InvocationTargetException -> 0x0151, InstantiationException -> 0x014f }
            goto L_0x0173
        L_0x014f:
            r10 = move-exception
            goto L_0x015b
        L_0x0151:
            r10 = move-exception
            goto L_0x015f
        L_0x0153:
            r10 = move-exception
            goto L_0x0163
        L_0x0155:
            r10 = move-exception
            goto L_0x0167
        L_0x0157:
            r10 = move-exception
            goto L_0x016b
        L_0x0159:
            r10 = move-exception
            goto L_0x016f
        L_0x015b:
            android.util.Log.w(r0, r10)
            goto L_0x0172
        L_0x015f:
            android.util.Log.w(r0, r10)
            goto L_0x0172
        L_0x0163:
            android.util.Log.w(r0, r10)
            goto L_0x0172
        L_0x0167:
            android.util.Log.w(r0, r10)
            goto L_0x0172
        L_0x016b:
            android.util.Log.w(r0, r10)
            goto L_0x0172
        L_0x016f:
            android.util.Log.w(r0, r10)
        L_0x0172:
            r10 = 0
        L_0x0173:
            if (r10 == 0) goto L_0x01b1
            int r0 = r1.left
            int r2 = r10.getSafeInsetLeft()
            if (r0 != r2) goto L_0x017f
            r1.left = r3
        L_0x017f:
            int r0 = r5.x
            int r2 = r1.right
            int r0 = r0 - r2
            int r2 = r10.getSafeInsetRight()
            if (r0 != r2) goto L_0x0193
            int r0 = r1.right
            int r2 = r10.getSafeInsetRight()
            int r2 = r2 + r0
            r1.right = r2
        L_0x0193:
            int r0 = r1.top
            int r2 = r10.getSafeInsetTop()
            if (r0 != r2) goto L_0x019d
            r1.top = r3
        L_0x019d:
            int r0 = r5.y
            int r2 = r1.bottom
            int r0 = r0 - r2
            int r2 = r10.getSafeInsetBottom()
            if (r0 != r2) goto L_0x01b1
            int r0 = r1.bottom
            int r10 = r10.getSafeInsetBottom()
            int r10 = r10 + r0
            r1.bottom = r10
        L_0x01b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.b(android.app.Activity):android.graphics.Rect");
    }
}
