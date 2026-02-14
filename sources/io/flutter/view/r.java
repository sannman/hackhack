package io.flutter.view;

import android.view.Choreographer;

public final class r implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public long f803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f804b;

    public r(s sVar, long j2) {
        this.f804b = sVar;
        this.f803a = j2;
    }

    public final void doFrame(long j2) {
        long j3;
        long nanoTime = System.nanoTime() - j2;
        if (nanoTime < 0) {
            j3 = 0;
        } else {
            j3 = nanoTime;
        }
        s sVar = this.f804b;
        sVar.f808b.onVsync(j3, sVar.f807a, this.f803a);
        sVar.f809c = this;
    }
}
