package io.flutter.plugin.platform;

import B.a;
import D.u;
import D.x;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public E.i f647a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f648b;

    /* renamed from: c  reason: collision with root package name */
    public x f649c;

    /* renamed from: d  reason: collision with root package name */
    public FlutterJNI f650d = null;

    /* renamed from: e  reason: collision with root package name */
    public u f651e;

    /* renamed from: f  reason: collision with root package name */
    public final a f652f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray f653g = new SparseArray();

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray f654h = new SparseArray();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f655i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f656j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public Surface f657k = null;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceControl f658l = null;
    public final c m = new c(2, this);

    /* JADX WARNING: type inference failed for: r0v2, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public i() {
        if (a.f0e == null) {
            a.f0e = new a(2);
        }
    }

    public final void a() {
        this.f652f.f634a = null;
    }

    public final void b(int i2) {
        if (this.f653g.get(i2) != null) {
            throw new ClassCastException();
        }
    }
}
