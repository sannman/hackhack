package io.flutter.view;

import android.hardware.display.DisplayManager;

public final class q implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f802b;

    public q(s sVar, DisplayManager displayManager) {
        this.f802b = sVar;
        this.f801a = displayManager;
    }

    public final void onDisplayAdded(int i2) {
    }

    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f801a.getDisplay(0).getRefreshRate();
            s sVar = this.f802b;
            sVar.f807a = (long) (1.0E9d / ((double) refreshRate));
            sVar.f808b.setRefreshRateFPS(refreshRate);
        }
    }

    public final void onDisplayRemoved(int i2) {
    }
}
