package d0;

import T.a;
import c0.l;
import c0.p;

public abstract class n {
    public static void a(int i2, Object obj) {
        if (obj != null && !b(i2, obj)) {
            String name = obj.getClass().getName();
            ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + ("kotlin.jvm.functions.Function" + i2));
            h.f(classCastException, n.class.getName());
            throw classCastException;
        }
    }

    public static boolean b(int i2, Object obj) {
        int i3;
        if (obj instanceof a) {
            if (obj instanceof f) {
                i3 = ((f) obj).f();
            } else if (obj instanceof c0.a) {
                i3 = 0;
            } else if (obj instanceof l) {
                i3 = 1;
            } else if (obj instanceof p) {
                i3 = 2;
            } else {
                i3 = -1;
            }
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}
