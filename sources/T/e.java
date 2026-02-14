package T;

import c0.a;
import d0.h;
import d0.i;
import java.io.Serializable;

public final class e implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public i f352b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f353c = f.f355a;

    /* renamed from: d  reason: collision with root package name */
    public final Object f354d = this;

    public e(a aVar) {
        this.f352b = (i) aVar;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [d0.i, java.lang.Object, c0.a] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f353c;
        Object obj3 = f.f355a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this.f354d) {
            obj = this.f353c;
            if (obj == obj3) {
                ? r1 = this.f352b;
                h.b(r1);
                obj = r1.a();
                this.f353c = obj;
                this.f352b = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f353c != f.f355a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
