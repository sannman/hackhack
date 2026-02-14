package j0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: j0.f  reason: case insensitive filesystem */
public final class C0048f extends C0053k {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f853c = AtomicIntegerFieldUpdater.newUpdater(C0048f.class, "_resumed");
    private volatile int _resumed = 0;

    public C0048f(C0047e eVar, Throwable th, boolean z2) {
        super(th, z2);
    }
}
