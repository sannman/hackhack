package io.flutter.plugin.platform;

import B.a;
import D.C0012m;
import D.u;
import D.x;
import E.c;
import E.i;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.k;
import java.util.HashMap;
import java.util.HashSet;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i f659a = new i(2);

    /* renamed from: b  reason: collision with root package name */
    public Activity f660b;

    /* renamed from: c  reason: collision with root package name */
    public x f661c;

    /* renamed from: d  reason: collision with root package name */
    public FlutterJNI f662d = null;

    /* renamed from: e  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f663e;

    /* renamed from: f  reason: collision with root package name */
    public k f664f;

    /* renamed from: g  reason: collision with root package name */
    public u f665g;

    /* renamed from: h  reason: collision with root package name */
    public final a f666h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f667i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f668j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray f669k = new SparseArray();

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray f670l = new SparseArray();
    public final SparseArray m = new SparseArray();

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray f671n = new SparseArray();

    /* renamed from: o  reason: collision with root package name */
    public int f672o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f673p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f674q = true;

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f675r = new HashSet();

    /* renamed from: s  reason: collision with root package name */
    public final HashSet f676s = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    public final a f677t;
    public final c u = new c(1, this);

    /* JADX WARNING: type inference failed for: r0v6, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public j() {
        if (a.f0e == null) {
            a.f0e = new a(2);
        }
        this.f677t = a.f0e;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.m;
            if (i2 < sparseArray.size()) {
                b bVar = (b) sparseArray.valueAt(i2);
                bVar.d();
                bVar.f89a.close();
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        this.f666h.f634a = null;
    }

    public final void c(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.m;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f675r.contains(Integer.valueOf(keyAt))) {
                c cVar = this.f661c.f121h;
                if (cVar != null) {
                    bVar.a(cVar.f140b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f673p) {
                    bVar.d();
                }
                bVar.setVisibility(8);
                this.f661c.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f670l;
            if (i3 < sparseArray2.size()) {
                int keyAt2 = sparseArray2.keyAt(i3);
                View view = (View) sparseArray2.get(keyAt2);
                if (!this.f676s.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f674q)) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void d(int i2) {
        if (g(i2)) {
            ((p) this.f667i.get(Integer.valueOf(i2))).getClass();
        } else if (this.f669k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void e() {
        if (this.f674q && !this.f673p) {
            x xVar = this.f661c;
            xVar.f117d.c();
            C0012m mVar = xVar.f116c;
            if (mVar == null) {
                C0012m mVar2 = new C0012m(xVar.getContext(), xVar.getWidth(), xVar.getHeight(), 1);
                xVar.f116c = mVar2;
                xVar.addView(mVar2);
            } else {
                mVar.g(xVar.getWidth(), xVar.getHeight());
            }
            xVar.f118e = xVar.f117d;
            C0012m mVar3 = xVar.f116c;
            xVar.f117d = mVar3;
            c cVar = xVar.f121h;
            if (cVar != null) {
                mVar3.a(cVar.f140b);
            }
            this.f673p = true;
        }
    }

    public final int f(double d2) {
        return (int) Math.round(d2 * ((double) this.f660b.getResources().getDisplayMetrics().density));
    }

    public final boolean g(int i2) {
        return this.f667i.containsKey(Integer.valueOf(i2));
    }
}
