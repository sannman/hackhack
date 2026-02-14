package p0;

import D.F;
import java.util.concurrent.TimeUnit;
import o0.C0087a;
import o0.x;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1132a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f1133b = C0087a.h("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1134c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f1135d = C0087a.i("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);

    /* renamed from: e  reason: collision with root package name */
    public static final long f1136e = TimeUnit.SECONDS.toNanos(C0087a.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f  reason: collision with root package name */
    public static final f f1137f = f.f1127a;

    /* renamed from: g  reason: collision with root package name */
    public static final F f1138g = new F(0);

    /* renamed from: h  reason: collision with root package name */
    public static final F f1139h = new F(1);

    static {
        String str;
        int i2 = x.f1095a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1132a = str;
        int i3 = x.f1095a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1134c = C0087a.i("kotlinx.coroutines.scheduler.core.pool.size", i3, 8);
    }
}
