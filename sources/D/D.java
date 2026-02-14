package D;

import android.view.KeyEvent;

public final /* synthetic */ class D implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f26c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L f27d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f28e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f29f;

    public /* synthetic */ D(E e2, L l2, long j2, KeyEvent keyEvent, int i2) {
        this.f25b = i2;
        this.f26c = e2;
        this.f27d = l2;
        this.f28e = j2;
        this.f29f = keyEvent;
    }

    public final void run() {
        switch (this.f25b) {
            case 0:
                E e2 = this.f26c;
                e2.getClass();
                e2.c(false, Long.valueOf(this.f27d.f42b), Long.valueOf(this.f28e), this.f29f.getEventTime());
                return;
            default:
                E e3 = this.f26c;
                e3.getClass();
                e3.c(false, Long.valueOf(this.f27d.f42b), Long.valueOf(this.f28e), this.f29f.getEventTime());
                return;
        }
    }
}
