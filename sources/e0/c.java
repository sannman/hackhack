package e0;

import d0.h;
import java.util.Random;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public final b f507c = new ThreadLocal();

    public final Random a() {
        Object obj = this.f507c.get();
        h.d(obj, "get(...)");
        return (Random) obj;
    }
}
