package o0;

import android.os.Looper;
import d0.h;
import h0.e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import k0.a;
import k0.c;
import k0.d;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1089a;

    /* JADX WARNING: type inference failed for: r0v3, types: [k0.a, java.lang.Object] */
    static {
        String str;
        int i2 = x.f1095a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new a[]{new Object()}).iterator();
            h.e(it, "<this>");
            Iterator it2 = h0.c.E(new h0.a(new e(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((a) obj).getClass();
                    do {
                        ((a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f1089a = new c(d.a(mainLooper), false);
                    return;
                }
                throw new IllegalStateException("The main looper is not available");
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
