package c;

import a.a;
import java.util.concurrent.Executors;

/* renamed from: c.a  reason: case insensitive filesystem */
public final class C0020a extends a {

    /* renamed from: f  reason: collision with root package name */
    public static volatile C0020a f447f;

    /* renamed from: e  reason: collision with root package name */
    public final Object f448e;

    public C0020a(int i2) {
        switch (i2) {
            case 1:
                this.f448e = new Object();
                Executors.newFixedThreadPool(4, new C0021b());
                return;
            default:
                this.f448e = new C0020a(1);
                return;
        }
    }
}
