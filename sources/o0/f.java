package o0;

import d0.h;
import h0.a;
import h0.c;
import h0.e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import k0.b;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final List f1062a;

    static {
        try {
            Iterator it = Arrays.asList(new b[]{new b()}).iterator();
            h.e(it, "<this>");
            f1062a = c.E(new a(new e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
