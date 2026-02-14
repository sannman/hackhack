package n;

import java.io.Serializable;

/* renamed from: n.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0085a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f987b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f988c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Serializable f989d;

    public /* synthetic */ C0085a(b bVar, int i2, Serializable serializable) {
        this.f987b = bVar;
        this.f988c = i2;
        this.f989d = serializable;
    }

    public final void run() {
        this.f987b.f991b.a(this.f988c, this.f989d);
    }
}
