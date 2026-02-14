package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static s f805e;

    /* renamed from: f  reason: collision with root package name */
    public static q f806f;

    /* renamed from: a  reason: collision with root package name */
    public long f807a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f808b;

    /* renamed from: c  reason: collision with root package name */
    public r f809c = new r(this, 0);

    /* renamed from: d  reason: collision with root package name */
    public final a f810d = new a(this);

    public s(FlutterJNI flutterJNI) {
        this.f808b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f805e == null) {
            f805e = new s(flutterJNI);
        }
        if (f806f == null) {
            s sVar = f805e;
            Objects.requireNonNull(sVar);
            q qVar = new q(sVar, displayManager);
            f806f = qVar;
            displayManager.registerDisplayListener(qVar, (Handler) null);
        }
        if (f805e.f807a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f805e.f807a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f805e;
    }
}
