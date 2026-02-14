package d0;

import g0.a;
import java.io.Serializable;

public abstract class c implements a, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public transient a f468b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f469c;

    /* renamed from: d  reason: collision with root package name */
    public final Class f470d;

    /* renamed from: e  reason: collision with root package name */
    public final String f471e;

    /* renamed from: f  reason: collision with root package name */
    public final String f472f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f473g;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f469c = obj;
        this.f470d = cls;
        this.f471e = str;
        this.f472f = str2;
        this.f473g = z2;
    }

    public final d b() {
        Class cls = this.f470d;
        if (!this.f473g) {
            return l.a(cls);
        }
        l.f484a.getClass();
        return new j(cls);
    }
}
