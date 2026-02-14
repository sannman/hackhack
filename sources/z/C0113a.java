package z;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import d0.h;
import l.C0081n;

/* renamed from: z.a  reason: case insensitive filesystem */
public final class C0113a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0113a f1254a = new Object();

    public final C0081n a(Context context) {
        h.e(context, "context");
        WindowInsets g2 = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        h.d(g2, "context.getSystemService…indowMetrics.windowInsets");
        return C0081n.a((View) null, g2);
    }
}
