package androidx.lifecycle;

import android.app.Activity;
import d0.h;

public abstract class s {
    public static void a(Activity activity, f fVar) {
        n a2;
        h.e(fVar, "event");
        if ((activity instanceof l) && (a2 = ((l) activity).a()) != null) {
            a2.c(fVar);
        }
    }
}
