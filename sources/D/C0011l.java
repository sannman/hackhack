package D;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* renamed from: D.l  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0011l {
    public static /* synthetic */ ActivityManager.TaskDescription b(String str, int i2) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout h(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
