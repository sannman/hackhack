package D;

import B.e;
import C.b;
import E.c;
import E.l;
import L.o;
import L.q;
import M.f;
import O.a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import g.C0040a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.editing.k;
import io.flutter.plugin.platform.h;
import io.flutter.plugin.platform.j;
import j.C0042a;
import j0.C0043a;
import j0.C0059q;
import j0.C0061t;
import j0.C0066y;
import j0.F;
import j0.K;
import j0.N;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import n.d;
import o0.p;
import s.C0093b;
import t.C0094a;
import v.C0096b;
import v.C0097c;
import v.C0101g;
import v.C0102h;
import v.C0104j;

public final class x extends FrameLayout implements a, J {

    /* renamed from: a  reason: collision with root package name */
    public final C0014o f114a;

    /* renamed from: b  reason: collision with root package name */
    public final C0016q f115b;

    /* renamed from: c  reason: collision with root package name */
    public C0012m f116c;

    /* renamed from: d  reason: collision with root package name */
    public View f117d;

    /* renamed from: e  reason: collision with root package name */
    public View f118e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f119f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f120g;

    /* renamed from: h  reason: collision with root package name */
    public c f121h;

    /* renamed from: i  reason: collision with root package name */
    public final HashSet f122i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public B.a f123j;

    /* renamed from: k  reason: collision with root package name */
    public k f124k;

    /* renamed from: l  reason: collision with root package name */
    public g f125l;
    public N.a m;

    /* renamed from: n  reason: collision with root package name */
    public b f126n;

    /* renamed from: o  reason: collision with root package name */
    public C0001b f127o;

    /* renamed from: p  reason: collision with root package name */
    public io.flutter.view.k f128p;

    /* renamed from: q  reason: collision with root package name */
    public TextServicesManager f129q;

    /* renamed from: r  reason: collision with root package name */
    public u f130r;

    /* renamed from: s  reason: collision with root package name */
    public final i f131s = new i();

    /* renamed from: t  reason: collision with root package name */
    public final u f132t = new u(0, (Object) this);
    public final v u = new v(this, new Handler(Looper.getMainLooper()), 0);

    /* renamed from: v  reason: collision with root package name */
    public final C0006g f133v = new C0006g(1, this);

    /* renamed from: w  reason: collision with root package name */
    public C0018t f134w;

    /* renamed from: x  reason: collision with root package name */
    public z f135x = new Object();

    /* JADX WARNING: type inference failed for: r3v7, types: [D.z, java.lang.Object] */
    public x(C0005f fVar, C0014o oVar) {
        super(fVar, (AttributeSet) null);
        this.f114a = oVar;
        this.f117d = oVar;
        b();
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f121h);
        if (c()) {
            Iterator it = this.f122i.iterator();
            if (!it.hasNext()) {
                getContext().getContentResolver().unregisterContentObserver(this.u);
                j jVar = this.f121h.f156s;
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = jVar.f671n;
                    if (i2 >= sparseArray2.size()) {
                        break;
                    }
                    jVar.f661c.removeView((h) sparseArray2.valueAt(i2));
                    i2++;
                }
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray3 = jVar.f670l;
                    if (i3 >= sparseArray3.size()) {
                        jVar.a();
                        if (jVar.f661c == null) {
                            Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                        } else {
                            int i4 = 0;
                            while (true) {
                                sparseArray = jVar.m;
                                if (i4 >= sparseArray.size()) {
                                    break;
                                }
                                jVar.f661c.removeView((View) sparseArray.valueAt(i4));
                                i4++;
                            }
                            sparseArray.clear();
                        }
                        jVar.f661c = null;
                        jVar.f673p = false;
                        SparseArray sparseArray4 = jVar.f669k;
                        if (sparseArray4.size() <= 0) {
                            io.flutter.plugin.platform.i iVar = this.f121h.f157t;
                            int i5 = 0;
                            while (true) {
                                SparseArray sparseArray5 = iVar.f654h;
                                if (i5 >= sparseArray5.size()) {
                                    Surface surface = iVar.f657k;
                                    if (surface != null) {
                                        surface.release();
                                        iVar.f657k = null;
                                        iVar.f658l = null;
                                    }
                                    iVar.f649c = null;
                                    SparseArray sparseArray6 = iVar.f653g;
                                    if (sparseArray6.size() <= 0) {
                                        this.f121h.f156s.b();
                                        this.f121h.f157t.a();
                                        io.flutter.view.k kVar = this.f128p;
                                        kVar.f789s = true;
                                        B.a aVar = kVar.f776e;
                                        ((j) aVar.f3c).b();
                                        ((io.flutter.plugin.platform.i) aVar.f4d).a();
                                        kVar.f787q = null;
                                        AccessibilityManager accessibilityManager = kVar.f774c;
                                        accessibilityManager.removeAccessibilityStateChangeListener(kVar.u);
                                        accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f791v);
                                        kVar.f777f.unregisterContentObserver(kVar.f792w);
                                        b bVar = kVar.f773b;
                                        bVar.f15c = null;
                                        ((FlutterJNI) bVar.f14b).setAccessibilityDelegate((l) null);
                                        this.f128p = null;
                                        this.f124k.f620b.restartInput(this);
                                        this.f124k.b();
                                        int size = ((HashSet) this.f126n.f14b).size();
                                        if (size > 0) {
                                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
                                        }
                                        g gVar = this.f125l;
                                        if (gVar != null) {
                                            gVar.f602a.f108c = null;
                                            SpellCheckerSession spellCheckerSession = gVar.f604c;
                                            if (spellCheckerSession != null) {
                                                spellCheckerSession.close();
                                            }
                                        }
                                        B.a aVar2 = this.f123j;
                                        if (aVar2 != null) {
                                            ((u) aVar2.f4d).f108c = null;
                                        }
                                        io.flutter.embedding.engine.renderer.j jVar2 = this.f121h.f140b;
                                        this.f120g = false;
                                        jVar2.c(this.f133v);
                                        jVar2.d();
                                        jVar2.f568a.setSemanticsEnabled(false);
                                        View view = this.f118e;
                                        if (view != null && this.f117d == this.f116c) {
                                            this.f117d = view;
                                        }
                                        this.f117d.d();
                                        C0012m mVar = this.f116c;
                                        if (mVar != null) {
                                            mVar.f89a.close();
                                            removeView(this.f116c);
                                            this.f116c = null;
                                        }
                                        this.f118e = null;
                                        this.f121h = null;
                                        return;
                                    }
                                    sparseArray6.valueAt(0).getClass();
                                    throw new ClassCastException();
                                } else if (sparseArray5.valueAt(i5) == null) {
                                    iVar.f649c.removeView((View) null);
                                    i5++;
                                } else {
                                    throw new ClassCastException();
                                }
                            }
                        } else {
                            sparseArray4.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                    } else if (sparseArray3.valueAt(i3) == null) {
                        jVar.f661c.removeView((View) null);
                        i3++;
                    } else {
                        throw new ClassCastException();
                    }
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void autofill(SparseArray sparseArray) {
        e eVar;
        e eVar2;
        k kVar = this.f124k;
        if (Build.VERSION.SDK_INT < 26) {
            kVar.getClass();
            return;
        }
        o oVar = kVar.f624f;
        if (oVar != null && kVar.f625g != null && (eVar = oVar.f310j) != null) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                o oVar2 = (o) kVar.f625g.get(sparseArray.keyAt(i2));
                if (!(oVar2 == null || (eVar2 = oVar2.f310j) == null)) {
                    String charSequence = C0000a.f(sparseArray.valueAt(i2)).getTextValue().toString();
                    q qVar = new q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    String str = (String) eVar2.f7a;
                    if (str.equals((String) eVar.f7a)) {
                        kVar.f626h.f(qVar);
                    } else {
                        hashMap.put(str, qVar);
                    }
                }
            }
            int i3 = kVar.f623e.f618b;
            B.a aVar = kVar.f622d;
            aVar.getClass();
            String.valueOf(hashMap.size());
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                q qVar2 = (q) entry.getValue();
                hashMap2.put((String) entry.getKey(), B.a.i(qVar2.f316a, qVar2.f317b, qVar2.f318c, -1, -1));
            }
            ((b) aVar.f3c).e("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i3), hashMap2}), (L.k) null);
        }
    }

    public final void b() {
        C0014o oVar = this.f114a;
        if (oVar != null) {
            addView(oVar);
        } else {
            C0016q qVar = this.f115b;
            if (qVar != null) {
                addView(qVar);
            } else {
                addView(this.f116c);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final boolean c() {
        c cVar = this.f121h;
        if (cVar == null || cVar.f140b != this.f117d.getAttachedRenderer()) {
            return false;
        }
        return true;
    }

    public final boolean checkInputConnectionProxy(View view) {
        c cVar = this.f121h;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        j jVar = cVar.f156s;
        if (view == null) {
            jVar.getClass();
            return false;
        }
        HashMap hashMap = jVar.f668j;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r1 != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            r2 = 1
            if (r0 != r1) goto L_0x0013
            r0 = 2
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            android.view.textservice.TextServicesManager r1 = r9.f129q
            r3 = 0
            if (r1 == 0) goto L_0x004e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x004c
            java.util.List r1 = r1.getEnabledSpellCheckerInfos()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0027
            r1 = r2
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            android.view.textservice.TextServicesManager r4 = r9.f129q
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
        L_0x004c:
            r1 = r2
            goto L_0x004f
        L_0x004e:
            r1 = r3
        L_0x004f:
            E.c r4 = r9.f121h
            L.n r4 = r4.f152o
            B.e r4 = r4.f300a
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            android.content.res.Resources r6 = r9.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            float r6 = r6.fontScale
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.String r7 = "textScaleFactor"
            r5.put(r7, r6)
            android.content.res.Resources r6 = r9.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = "nativeSpellCheckServiceDefined"
            r5.put(r8, r1)
            android.content.Context r1 = r9.getContext()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r8 = "show_password"
            int r1 = android.provider.Settings.System.getInt(r1, r8, r2)
            if (r1 != r2) goto L_0x0090
            r1 = r2
            goto L_0x0091
        L_0x0090:
            r1 = r3
        L_0x0091:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = "brieflyShowPassword"
            r5.put(r8, r1)
            android.content.Context r1 = r9.getContext()
            boolean r1 = android.text.format.DateFormat.is24HourFormat(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r8 = "alwaysUse24HourFormat"
            r5.put(r8, r1)
            r1 = 1
            if (r0 == r1) goto L_0x00b6
            r1 = 2
            if (r0 != r1) goto L_0x00b4
            java.lang.String r0 = "dark"
            goto L_0x00b8
        L_0x00b4:
            r0 = 0
            throw r0
        L_0x00b6:
            java.lang.String r0 = "light"
        L_0x00b8:
            java.lang.String r1 = "platformBrightness"
            r5.put(r1, r0)
            java.lang.Object r0 = r5.get(r7)
            java.util.Objects.toString(r0)
            java.lang.Object r0 = r5.get(r8)
            java.util.Objects.toString(r0)
            java.lang.Object r0 = r5.get(r1)
            java.util.Objects.toString(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            r0 = 0
            if (r2 == 0) goto L_0x010e
            if (r6 != 0) goto L_0x00e0
            goto L_0x010e
        L_0x00e0:
            L.m r1 = new L.m
            r1.<init>(r6)
            C.b r2 = L.n.f299b
            java.lang.Object r3 = r2.f13a
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            r3.add(r1)
            java.lang.Object r3 = r2.f15c
            L.m r3 = (L.m) r3
            r2.f15c = r1
            if (r3 != 0) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            B.a r0 = new B.a
            r6 = 8
            r7 = 0
            r0.<init>(r2, r3, r6, r7)
        L_0x00ff:
            int r1 = r1.f297a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "configurationId"
            r5.put(r2, r1)
            r4.f(r5, r0)
            return
        L_0x010e:
            r4.f(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.x.d():void");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((!c() || !this.f126n.c(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        i iVar = this.f131s;
        iVar.f551a = f2;
        iVar.f565p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.j jVar = this.f121h.f140b;
        jVar.getClass();
        if (iVar.f552b > 0 && iVar.f553c > 0 && iVar.f551a > 0.0f) {
            ArrayList arrayList = iVar.f566q;
            arrayList.size();
            ArrayList arrayList2 = iVar.f567r;
            arrayList2.size();
            int size = arrayList2.size() + arrayList.size();
            int[] iArr = new int[(size * 4)];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i2);
                int i3 = i2 * 4;
                Rect rect = cVar.f538a;
                iArr[i3] = rect.left;
                iArr[i3 + 1] = rect.top;
                iArr[i3 + 2] = rect.right;
                iArr[i3 + 3] = rect.bottom;
                iArr2[i2] = d.a(cVar.f539b);
                iArr3[i2] = d.a(cVar.f540c);
            }
            int size2 = arrayList.size() * 4;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i4);
                int i5 = (i4 * 4) + size2;
                Rect rect2 = cVar2.f538a;
                iArr[i5] = rect2.left;
                iArr[i5 + 1] = rect2.top;
                iArr[i5 + 2] = rect2.right;
                iArr[i5 + 3] = rect2.bottom;
                iArr2[arrayList.size() + i4] = d.a(cVar2.f539b);
                iArr3[arrayList.size() + i4] = d.a(cVar2.f540c);
            }
            float f3 = iVar.f551a;
            int i6 = iVar.f552b;
            int i7 = iVar.f553c;
            int i8 = iVar.f554d;
            int i9 = iVar.f555e;
            int i10 = iVar.f556f;
            int i11 = iVar.f557g;
            int i12 = iVar.f558h;
            int i13 = iVar.f559i;
            int i14 = iVar.f560j;
            int i15 = iVar.f561k;
            int i16 = iVar.f562l;
            int i17 = iVar.m;
            int i18 = iVar.f563n;
            int i19 = iVar.f564o;
            int i20 = iVar.f565p;
            int[] iArr4 = iArr2;
            jVar.f568a.setViewportMetrics(f3, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, iArr, iArr4, iArr3);
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.k kVar = this.f128p;
        if (kVar == null || !kVar.f774c.isEnabled()) {
            return null;
        }
        return this.f128p;
    }

    public c getAttachedFlutterEngine() {
        return this.f121h;
    }

    public f getBinaryMessenger() {
        return this.f121h.f141c;
    }

    public C0012m getCurrentImageSurface() {
        return this.f116c;
    }

    public i getViewportMetrics() {
        return this.f131s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.view.WindowInsets r2 = super.onApplyWindowInsets(r18)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            io.flutter.embedding.engine.renderer.i r5 = r0.f131s
            if (r3 != r4) goto L_0x002c
            android.graphics.Insets r4 = r1.getSystemGestureInsets()
            int r6 = r4.top
            r5.f562l = r6
            int r6 = r4.right
            r5.m = r6
            int r6 = r4.bottom
            r5.f563n = r6
            int r4 = r4.left
            r5.f564o = r4
        L_0x002c:
            int r4 = r0.getWindowSystemUiVisibility()
            r6 = 4
            r4 = r4 & r6
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x0038
            r4 = r8
            goto L_0x0039
        L_0x0038:
            r4 = r7
        L_0x0039:
            int r9 = r0.getWindowSystemUiVisibility()
            r10 = 2
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0043
            r9 = r8
            goto L_0x0044
        L_0x0043:
            r9 = r7
        L_0x0044:
            r11 = 30
            if (r3 < r11) goto L_0x0104
            int r4 = android.view.WindowInsets.Type.systemBars()
            android.graphics.Insets r4 = r1.getInsets(r4)
            int r7 = r4.top
            r5.f554d = r7
            int r7 = r4.right
            r5.f555e = r7
            int r7 = r4.bottom
            r5.f556f = r7
            int r4 = r4.left
            r5.f557g = r4
            int r4 = android.view.WindowInsets.Type.ime()
            android.graphics.Insets r4 = r1.getInsets(r4)
            int r7 = r4.top
            r5.f558h = r7
            int r7 = r4.right
            r5.f559i = r7
            int r7 = r4.bottom
            r5.f560j = r7
            int r4 = r4.left
            r5.f561k = r4
            int r4 = android.view.WindowInsets.Type.systemGestures()
            android.graphics.Insets r4 = r1.getInsets(r4)
            int r7 = r4.top
            r5.f562l = r7
            int r7 = r4.right
            r5.m = r7
            int r7 = r4.bottom
            r5.f563n = r7
            int r4 = r4.left
            r5.f564o = r4
            android.view.DisplayCutout r4 = r1.getDisplayCutout()
            if (r4 == 0) goto L_0x01aa
            android.graphics.Insets r7 = r4.getWaterfallInsets()
            int r9 = r5.f554d
            int r10 = r7.top
            int r9 = java.lang.Math.max(r9, r10)
            int r10 = r4.getSafeInsetTop()
            int r9 = java.lang.Math.max(r9, r10)
            r5.f554d = r9
            int r9 = r5.f555e
            int r10 = r7.right
            int r9 = java.lang.Math.max(r9, r10)
            int r10 = r4.getSafeInsetRight()
            int r9 = java.lang.Math.max(r9, r10)
            r5.f555e = r9
            int r9 = r5.f556f
            int r10 = r7.bottom
            int r9 = java.lang.Math.max(r9, r10)
            int r10 = r4.getSafeInsetBottom()
            int r9 = java.lang.Math.max(r9, r10)
            r5.f556f = r9
            int r9 = r5.f557g
            int r7 = r7.left
            int r7 = java.lang.Math.max(r9, r7)
            int r4 = r4.getSafeInsetLeft()
            int r4 = java.lang.Math.max(r7, r4)
            r5.f557g = r4
            goto L_0x01aa
        L_0x0104:
            r11 = 3
            if (r9 != 0) goto L_0x0135
            android.content.Context r12 = r0.getContext()
            android.content.res.Resources r13 = r12.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            int r13 = r13.orientation
            if (r13 != r10) goto L_0x0135
            java.lang.String r13 = "display"
            java.lang.Object r12 = r12.getSystemService(r13)
            android.hardware.display.DisplayManager r12 = (android.hardware.display.DisplayManager) r12
            android.view.Display r12 = r12.getDisplay(r7)
            int r12 = r12.getRotation()
            if (r12 != r8) goto L_0x012b
            r12 = r11
            goto L_0x0136
        L_0x012b:
            if (r12 != r11) goto L_0x012f
            r12 = r10
            goto L_0x0136
        L_0x012f:
            if (r12 == 0) goto L_0x0133
            if (r12 != r10) goto L_0x0135
        L_0x0133:
            r12 = r6
            goto L_0x0136
        L_0x0135:
            r12 = r8
        L_0x0136:
            if (r4 == 0) goto L_0x013d
            int r4 = r1.getSystemWindowInsetTop()
            goto L_0x013e
        L_0x013d:
            r4 = r7
        L_0x013e:
            r5.f554d = r4
            if (r12 == r11) goto L_0x014a
            if (r12 != r6) goto L_0x0145
            goto L_0x014a
        L_0x0145:
            int r4 = r1.getSystemWindowInsetRight()
            goto L_0x014b
        L_0x014a:
            r4 = r7
        L_0x014b:
            r5.f555e = r4
            if (r9 == 0) goto L_0x0174
            android.view.View r4 = r0.getRootView()
            int r4 = r4.getHeight()
            int r9 = r1.getSystemWindowInsetBottom()
            r15 = 4595653203753948938(0x3fc70a3d70a3d70a, double:0.18)
            double r13 = (double) r9
            double r8 = (double) r4
            double r8 = r8 * r15
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0169
            r4 = r7
            goto L_0x016d
        L_0x0169:
            int r4 = r1.getSystemWindowInsetBottom()
        L_0x016d:
            if (r4 != 0) goto L_0x0179
            int r4 = r1.getSystemWindowInsetBottom()
            goto L_0x017a
        L_0x0174:
            r15 = 4595653203753948938(0x3fc70a3d70a3d70a, double:0.18)
        L_0x0179:
            r4 = r7
        L_0x017a:
            r5.f556f = r4
            if (r12 == r10) goto L_0x0186
            if (r12 != r6) goto L_0x0181
            goto L_0x0186
        L_0x0181:
            int r4 = r1.getSystemWindowInsetLeft()
            goto L_0x0187
        L_0x0186:
            r4 = r7
        L_0x0187:
            r5.f557g = r4
            r5.f558h = r7
            r5.f559i = r7
            android.view.View r4 = r0.getRootView()
            int r4 = r4.getHeight()
            int r8 = r1.getSystemWindowInsetBottom()
            double r8 = (double) r8
            double r12 = (double) r4
            double r12 = r12 * r15
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x01a2
            r4 = r7
            goto L_0x01a6
        L_0x01a2:
            int r4 = r1.getSystemWindowInsetBottom()
        L_0x01a6:
            r5.f560j = r4
            r5.f561k = r7
        L_0x01aa:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = 28
            if (r3 < r7) goto L_0x01da
            android.view.DisplayCutout r1 = r1.getDisplayCutout()
            if (r1 == 0) goto L_0x01da
            java.util.List r1 = r1.getBoundingRects()
            java.util.Iterator r1 = r1.iterator()
        L_0x01c1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01da
            java.lang.Object r3 = r1.next()
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r3.toString()
            io.flutter.embedding.engine.renderer.c r7 = new io.flutter.embedding.engine.renderer.c
            r11 = 1
            r7.<init>(r3, r6, r11)
            r4.add(r7)
            goto L_0x01c1
        L_0x01da:
            java.util.ArrayList r1 = r5.f567r
            r1.clear()
            r1.addAll(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r1 < r3) goto L_0x0230
            D.z r1 = r0.f135x
            android.content.Context r3 = r0.getContext()
            r1.getClass()
            android.app.Activity r1 = a.a.j(r3)
            r3 = 0
            if (r1 != 0) goto L_0x01f9
            goto L_0x0208
        L_0x01f9:
            android.view.Window r1 = r1.getWindow()
            if (r1 != 0) goto L_0x0200
            goto L_0x0208
        L_0x0200:
            android.view.View r1 = r1.getDecorView()
            android.view.WindowInsets r3 = r1.getRootWindowInsets()
        L_0x0208:
            if (r3 != 0) goto L_0x020d
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            goto L_0x0215
        L_0x020d:
            int r1 = android.view.WindowInsets.Type.captionBar()
            java.util.List r1 = r3.getBoundingRects(r1)
        L_0x0215:
            int r3 = r5.f554d
            java.util.Iterator r1 = r1.iterator()
        L_0x021b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x022e
            java.lang.Object r4 = r1.next()
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r4 = r4.bottom
            int r3 = java.lang.Math.max(r3, r4)
            goto L_0x021b
        L_0x022e:
            r5.f554d = r3
        L_0x0230:
            r0.e()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D.x.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public final void onAttachedToWindow() {
        u uVar;
        Executor executor;
        V.j jVar = V.j.f372b;
        super.onAttachedToWindow();
        try {
            C0101g gVar = C0102h.f1208a;
            Context context = getContext();
            gVar.getClass();
            uVar = new u(1, (Object) new B.a(C0101g.a(context)));
        } catch (NoClassDefFoundError unused) {
            uVar = null;
        }
        this.f130r = uVar;
        Activity j2 = a.a.j(getContext());
        u uVar2 = this.f130r;
        if (uVar2 != null && j2 != null) {
            this.f134w = new C0018t(0, this);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 28) {
                executor = C0040a.a(context2);
            } else {
                executor = new C0042a(new Handler(context2.getMainLooper()));
            }
            C0018t tVar = this.f134w;
            B.a aVar = (B.a) uVar2.f108c;
            d0.h.e(executor, "executor");
            d0.h.e(tVar, "consumer");
            C0096b bVar = (C0096b) aVar.f3c;
            bVar.getClass();
            m0.b bVar2 = new m0.b(new C0104j(bVar, j2, (V.d) null), jVar, -2, 1);
            p0.d dVar = C0066y.f884a;
            k0.c cVar = p.f1089a;
            if (cVar.g(C0059q.f870c) == null) {
                if (!cVar.equals(jVar)) {
                    V.i h2 = cVar.h(jVar);
                    if (!d0.h.a(h2, jVar)) {
                        bVar2 = new m0.b(bVar2.f967f, h2, -2, 1);
                    }
                }
                B.a aVar2 = (B.a) aVar.f4d;
                aVar2.getClass();
                ReentrantLock reentrantLock = (ReentrantLock) aVar2.f3c;
                reentrantLock.lock();
                LinkedHashMap linkedHashMap = (LinkedHashMap) aVar2.f4d;
                try {
                    if (linkedHashMap.get(tVar) == null) {
                        F f2 = new F(executor);
                        o0.e eVar = new o0.e(f2.g(C0059q.f870c) != null ? f2 : a.a.r(f2, new N()));
                        C0094a aVar3 = new C0094a(bVar2, tVar, (V.d) null);
                        C0043a aVar4 = new C0043a(C0061t.e(eVar, jVar), true);
                        aVar4.M(1, aVar4, aVar3);
                        linkedHashMap.put(tVar, aVar4);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f121h != null) {
            this.m.b(configuration);
            d();
            a.a.b(getContext(), this.f121h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r2.f315c != false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            r10 = this;
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x000b
            android.view.inputmethod.InputConnection r11 = super.onCreateInputConnection(r11)
            return r11
        L_0x000b:
            io.flutter.plugin.editing.k r0 = r10.f124k
            C.b r5 = r10.f126n
            io.flutter.plugin.editing.j r1 = r0.f623e
            int r2 = r1.f617a
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x001a
            r0.f628j = r4
            return r4
        L_0x001a:
            r6 = 4
            if (r2 != r6) goto L_0x001e
            return r4
        L_0x001e:
            r7 = 3
            if (r2 != r7) goto L_0x0030
            boolean r11 = r0.f633p
            if (r11 == 0) goto L_0x0028
            io.flutter.plugin.editing.c r11 = r0.f628j
            return r11
        L_0x0028:
            io.flutter.plugin.platform.j r11 = r0.f629k
            int r0 = r1.f618b
            r11.d(r0)
            throw r4
        L_0x0030:
            L.o r1 = r0.f624f
            L.p r2 = r1.f307g
            r4 = 2
            int r8 = r2.f313a
            if (r8 != r4) goto L_0x003b
            goto L_0x00b3
        L_0x003b:
            r9 = 5
            if (r8 != r9) goto L_0x004d
            boolean r6 = r2.f314b
            if (r6 == 0) goto L_0x0044
            r4 = 4098(0x1002, float:5.743E-42)
        L_0x0044:
            r6 = r4
            boolean r2 = r2.f315c
            if (r2 == 0) goto L_0x00b3
        L_0x0049:
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            goto L_0x00b3
        L_0x004d:
            r2 = 6
            if (r8 != r2) goto L_0x0053
            r6 = r7
            goto L_0x00b3
        L_0x0053:
            r2 = 11
            if (r8 != r2) goto L_0x005a
            r6 = 0
            goto L_0x00b3
        L_0x005a:
            r2 = 7
            if (r8 != r2) goto L_0x0061
            r2 = 131073(0x20001, float:1.83672E-40)
            goto L_0x008b
        L_0x0061:
            r2 = 8
            if (r8 == r2) goto L_0x0089
            r2 = 13
            if (r8 != r2) goto L_0x006a
            goto L_0x0089
        L_0x006a:
            r2 = 9
            if (r8 == r2) goto L_0x0086
            r2 = 12
            if (r8 != r2) goto L_0x0073
            goto L_0x0086
        L_0x0073:
            r2 = 10
            if (r8 != r2) goto L_0x007a
            r2 = 145(0x91, float:2.03E-43)
            goto L_0x008b
        L_0x007a:
            if (r8 != r7) goto L_0x007f
            r2 = 97
            goto L_0x008b
        L_0x007f:
            if (r8 != r6) goto L_0x0084
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x008b
        L_0x0084:
            r2 = r3
            goto L_0x008b
        L_0x0086:
            r2 = 17
            goto L_0x008b
        L_0x0089:
            r2 = 33
        L_0x008b:
            boolean r6 = r1.f301a
            if (r6 == 0) goto L_0x0095
            r6 = 524416(0x80080, float:7.34863E-40)
        L_0x0092:
            r2 = r2 | r6
        L_0x0093:
            r6 = r2
            goto L_0x00a5
        L_0x0095:
            boolean r6 = r1.f302b
            if (r6 == 0) goto L_0x009d
            r6 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r6
        L_0x009d:
            boolean r6 = r1.f303c
            if (r6 != 0) goto L_0x0093
            r6 = 524432(0x80090, float:7.34886E-40)
            goto L_0x0092
        L_0x00a5:
            int r2 = r1.f306f
            if (r2 != r3) goto L_0x00ac
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            goto L_0x00b3
        L_0x00ac:
            if (r2 != r4) goto L_0x00af
            goto L_0x0049
        L_0x00af:
            if (r2 != r7) goto L_0x00b3
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
        L_0x00b3:
            r11.inputType = r6
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r11.imeOptions = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 < r4) goto L_0x00c7
            boolean r4 = r1.f304d
            if (r4 != 0) goto L_0x00c7
            r4 = 50331648(0x3000000, float:3.761582E-37)
            r11.imeOptions = r4
        L_0x00c7:
            java.lang.Integer r1 = r1.f308h
            int r1 = r1.intValue()
            L.o r4 = r0.f624f
            java.lang.String r6 = r4.f309i
            if (r6 == 0) goto L_0x00d7
            r11.actionLabel = r6
            r11.actionId = r1
        L_0x00d7:
            int r6 = r11.imeOptions
            r1 = r1 | r6
            r11.imeOptions = r1
            java.util.Locale[] r1 = r4.m
            if (r1 == 0) goto L_0x00eb
            android.os.LocaleList r1 = new android.os.LocaleList
            L.o r4 = r0.f624f
            java.util.Locale[] r4 = r4.m
            r1.<init>(r4)
            r11.hintLocales = r1
        L_0x00eb:
            L.o r1 = r0.f624f
            java.lang.String[] r1 = r1.f311k
            if (r1 == 0) goto L_0x0112
            r4 = 25
            if (r2 < r4) goto L_0x00f9
            r11.contentMimeTypes = r1
            goto L_0x0112
        L_0x00f9:
            android.os.Bundle r4 = r11.extras
            if (r4 != 0) goto L_0x0104
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r11.extras = r4
        L_0x0104:
            android.os.Bundle r4 = r11.extras
            java.lang.String r6 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r4.putStringArray(r6, r1)
            android.os.Bundle r4 = r11.extras
            java.lang.String r6 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r4.putStringArray(r6, r1)
        L_0x0112:
            r1 = 34
            if (r2 < r1) goto L_0x0128
            android.os.Bundle r1 = r11.extras
            if (r1 != 0) goto L_0x0121
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r11.extras = r1
        L_0x0121:
            android.os.Bundle r1 = r11.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r1.putBoolean(r2, r3)
        L_0x0128:
            io.flutter.plugin.editing.c r1 = new io.flutter.plugin.editing.c
            io.flutter.plugin.editing.j r2 = r0.f623e
            int r3 = r2.f618b
            io.flutter.plugin.editing.f r6 = r0.f626h
            B.a r4 = r0.f622d
            r2 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.flutter.plugin.editing.f r11 = r0.f626h
            r11.getClass()
            int r11 = android.text.Selection.getSelectionStart(r11)
            r7.initialSelStart = r11
            io.flutter.plugin.editing.f r11 = r0.f626h
            r11.getClass()
            int r11 = android.text.Selection.getSelectionEnd(r11)
            r7.initialSelEnd = r11
            r0.f628j = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D.x.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onDetachedFromWindow() {
        C0018t tVar;
        u uVar = this.f130r;
        if (!(uVar == null || (tVar = this.f134w) == null)) {
            B.a aVar = (B.a) ((B.a) uVar.f108c).f4d;
            aVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) aVar.f3c;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f4d;
            try {
                K k2 = (K) linkedHashMap.get(tVar);
                if (k2 != null) {
                    k2.a((CancellationException) null);
                }
                K k3 = (K) linkedHashMap.remove(tVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f134w = null;
        this.f130r = null;
        super.onDetachedFromWindow();
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z2;
        if (c()) {
            C0001b bVar = this.f127o;
            Context context = getContext();
            bVar.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (isFromSource && z2) {
                int b2 = C0001b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                bVar.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0001b.f60f, allocateDirect, context);
                if (allocateDirect.position() % 288 == 0) {
                    bVar.f61a.f568a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                    return true;
                }
                throw new AssertionError("Packet position is not on field boundary.");
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f128p.d(motionEvent, false);
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        k kVar = this.f124k;
        if (Build.VERSION.SDK_INT < 26) {
            kVar.getClass();
        } else if (kVar.f625g != null) {
            String str = (String) kVar.f624f.f310j.f7a;
            AutofillId autofillId = viewStructure2.getAutofillId();
            for (int i3 = 0; i3 < kVar.f625g.size(); i3++) {
                int keyAt = kVar.f625g.keyAt(i3);
                e eVar = ((o) kVar.f625g.valueAt(i3)).f310j;
                if (eVar != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i3);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) eVar.f8b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) eVar.f10d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = kVar.m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((q) eVar.f9c).f316a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), kVar.m.height());
                        newChild.setAutofillValue(AutofillValue.forText(kVar.f626h));
                    }
                }
            }
        }
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        i iVar = this.f131s;
        iVar.f552b = i2;
        iVar.f553c = i3;
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r7 != 4) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.c()
            if (r0 != 0) goto L_0x000b
            boolean r12 = super.onTouchEvent(r12)
            return r12
        L_0x000b:
            r11.requestUnbufferedDispatch(r12)
            D.b r0 = r11.f127o
            android.graphics.Matrix r5 = D.C0001b.f60f
            r0.getClass()
            int r1 = r12.getActionMasked()
            int r2 = r12.getActionMasked()
            int r3 = D.C0001b.b(r2)
            r2 = 5
            r4 = 0
            r8 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 != r2) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = r4
            goto L_0x002c
        L_0x002b:
            r6 = r8
        L_0x002c:
            if (r6 != 0) goto L_0x0035
            if (r1 == r8) goto L_0x0033
            r7 = 6
            if (r1 != r7) goto L_0x0035
        L_0x0033:
            r1 = r8
            goto L_0x0036
        L_0x0035:
            r1 = r4
        L_0x0036:
            int r7 = r12.getActionIndex()
            int r7 = r12.getToolType(r7)
            if (r7 == r8) goto L_0x004e
            r9 = 2
            if (r7 == r9) goto L_0x004a
            r9 = 3
            if (r7 == r9) goto L_0x004c
            r10 = 4
            if (r7 == r10) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            r2 = r9
            goto L_0x004f
        L_0x004c:
            r2 = r8
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            if (r1 == 0) goto L_0x0055
            if (r2 != 0) goto L_0x0055
            r9 = r8
            goto L_0x0056
        L_0x0055:
            r9 = r4
        L_0x0056:
            int r10 = r12.getPointerCount()
            int r2 = r10 + r9
            int r2 = r2 * 288
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r7)
            if (r6 == 0) goto L_0x0075
            r6 = r2
            int r2 = r12.getActionIndex()
            r7 = 0
            r4 = 0
            r1 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00b6
        L_0x0075:
            r6 = r2
            r2 = r1
            r1 = r12
            r12 = r3
            if (r2 == 0) goto L_0x00aa
            r2 = r4
        L_0x007c:
            if (r2 >= r10) goto L_0x0093
            int r3 = r1.getActionIndex()
            if (r2 == r3) goto L_0x0090
            int r3 = r1.getToolType(r2)
            if (r3 != r8) goto L_0x0090
            r3 = 5
            r4 = 1
            r7 = 0
            r0.a(r1, r2, r3, r4, r5, r6, r7)
        L_0x0090:
            int r2 = r2 + 1
            goto L_0x007c
        L_0x0093:
            int r2 = r1.getActionIndex()
            r7 = 0
            r4 = 0
            r3 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L_0x00b6
            int r2 = r1.getActionIndex()
            r3 = 2
            r4 = 0
            r7 = 0
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00b6
        L_0x00aa:
            r3 = r12
            r2 = r4
        L_0x00ac:
            if (r2 >= r10) goto L_0x00b6
            r7 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00b6:
            int r12 = r6.position()
            int r12 = r12 % 288
            if (r12 != 0) goto L_0x00cb
            int r12 = r6.position()
            io.flutter.embedding.engine.renderer.j r0 = r0.f61a
            io.flutter.embedding.engine.FlutterJNI r0 = r0.f568a
            r0.dispatchPointerDataPacket(r6, r12)
            r12 = 1
            return r12
        L_0x00cb:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r0 = "Packet position is not on field boundary"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: D.x.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(z zVar) {
        this.f135x = zVar;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f117d;
        if (view instanceof C0014o) {
            ((C0014o) view).setVisibility(i2);
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public void setWindowInfoListenerDisplayFeatures(v.k kVar) {
        C0096b bVar;
        int i2;
        ? r8 = kVar.f1215a;
        ArrayList arrayList = new ArrayList();
        for (C0097c cVar : r8) {
            cVar.f1196a.a().toString();
            C0093b bVar2 = cVar.f1196a;
            int i3 = bVar2.f1163c - bVar2.f1161a;
            C0096b bVar3 = C0096b.f1189e;
            if (i3 == 0 || bVar2.f1164d - bVar2.f1162b == 0) {
                bVar = C0096b.f1188d;
            } else {
                bVar = bVar3;
            }
            int i4 = 2;
            if (bVar == bVar3) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            C0096b bVar4 = C0096b.f1190f;
            C0096b bVar5 = cVar.f1198c;
            if (bVar5 != bVar4) {
                if (bVar5 == C0096b.f1191g) {
                    i4 = 3;
                } else {
                    i4 = 1;
                }
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar2.a(), i2, i4));
        }
        ArrayList arrayList2 = this.f131s.f566q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [D.z, java.lang.Object] */
    public x(C0005f fVar, C0016q qVar) {
        super(fVar, (AttributeSet) null);
        this.f115b = qVar;
        this.f117d = qVar;
        b();
    }
}
