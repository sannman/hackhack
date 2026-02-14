package y;

import C.b;
import U.m;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.h;
import io.flutter.plugin.platform.c;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import k.a;
import v.k;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f1242a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1243b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f1244c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f1245d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public b f1246e;

    public i(Context context) {
        h.e(context, "context");
        SidecarInterface a2 = g.a(context);
        f fVar = new f();
        this.f1242a = a2;
        this.f1243b = fVar;
    }

    public final k a(Activity activity) {
        IBinder iBinder;
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
        if (window == null || (attributes = window.getAttributes()) == null) {
            iBinder = null;
        } else {
            iBinder = attributes.token;
        }
        if (iBinder == null) {
            return new k(m.f364b);
        }
        SidecarInterface sidecarInterface = this.f1242a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
        }
        SidecarInterface sidecarInterface2 = this.f1242a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f1243b.d(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void b(Activity activity) {
        IBinder iBinder;
        boolean z2;
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            iBinder = null;
        } else {
            iBinder = attributes.token;
        }
        if (iBinder != null) {
            SidecarInterface sidecarInterface2 = this.f1242a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
            }
            LinkedHashMap linkedHashMap = this.f1245d;
            if (((a) linkedHashMap.get(activity)) != null) {
                linkedHashMap.remove(activity);
            }
            b bVar = this.f1246e;
            if (bVar != null) {
                ReentrantLock reentrantLock = (ReentrantLock) bVar.f14b;
                reentrantLock.lock();
                try {
                    ((WeakHashMap) bVar.f15c).put(activity, (Object) null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            LinkedHashMap linkedHashMap2 = this.f1244c;
            if (linkedHashMap2.size() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            linkedHashMap2.remove(iBinder);
            if (z2 && (sidecarInterface = this.f1242a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void c(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f1244c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f1242a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f1242a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f1246e;
        if (bVar != null) {
            bVar.g(activity, a(activity));
        }
        this.f1245d.get(activity);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [C.b, java.lang.Object] */
    public final void d(c cVar) {
        ? obj = new Object();
        obj.f13a = cVar;
        obj.f14b = new ReentrantLock();
        obj.f15c = new WeakHashMap();
        this.f1246e = obj;
        SidecarInterface sidecarInterface = this.f1242a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f1243b, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:53|54|55|56|62|63|64|65|66|(2:69|70)|68|83) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x010d */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060 A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0149 A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017d A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r11 = this;
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r1 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            r4 = 0
            androidx.window.sidecar.SidecarInterface r5 = r11.f1242a     // Catch:{ all -> 0x01a1 }
            r6 = 0
            if (r5 == 0) goto L_0x0021
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x01a1 }
            if (r5 == 0) goto L_0x0021
            java.lang.String r7 = "setSidecarCallback"
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r8 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r8)     // Catch:{ all -> 0x01a1 }
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r5 == 0) goto L_0x0029
            java.lang.Class r5 = r5.getReturnType()     // Catch:{ all -> 0x01a1 }
            goto L_0x002a
        L_0x0029:
            r5 = r6
        L_0x002a:
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01a1 }
            boolean r8 = d0.h.a(r5, r7)     // Catch:{ all -> 0x01a1 }
            if (r8 == 0) goto L_0x018f
            androidx.window.sidecar.SidecarInterface r3 = r11.f1242a     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x0039
            r3.getDeviceState()     // Catch:{ all -> 0x01a1 }
        L_0x0039:
            androidx.window.sidecar.SidecarInterface r3 = r11.f1242a     // Catch:{ all -> 0x01a1 }
            r5 = 1
            if (r3 == 0) goto L_0x0041
            r3.onDeviceStateListenersChanged(r5)     // Catch:{ all -> 0x01a1 }
        L_0x0041:
            androidx.window.sidecar.SidecarInterface r3 = r11.f1242a     // Catch:{ all -> 0x01a1 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            if (r3 == 0) goto L_0x0058
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x0058
            java.lang.String r9 = "getWindowLayoutInfo"
            java.lang.Class[] r10 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r3 = r3.getMethod(r9, r10)     // Catch:{ all -> 0x01a1 }
            goto L_0x0059
        L_0x0058:
            r3 = r6
        L_0x0059:
            if (r3 == 0) goto L_0x0060
            java.lang.Class r3 = r3.getReturnType()     // Catch:{ all -> 0x01a1 }
            goto L_0x0061
        L_0x0060:
            r3 = r6
        L_0x0061:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r9 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r9 = d0.h.a(r3, r9)     // Catch:{ all -> 0x01a1 }
            if (r9 == 0) goto L_0x017d
            androidx.window.sidecar.SidecarInterface r2 = r11.f1242a     // Catch:{ all -> 0x01a1 }
            if (r2 == 0) goto L_0x007e
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x01a1 }
            if (r2 == 0) goto L_0x007e
            java.lang.String r3 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r9 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r9)     // Catch:{ all -> 0x01a1 }
            goto L_0x007f
        L_0x007e:
            r2 = r6
        L_0x007f:
            if (r2 == 0) goto L_0x0086
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x01a1 }
            goto L_0x0087
        L_0x0086:
            r2 = r6
        L_0x0087:
            boolean r3 = d0.h.a(r2, r7)     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x016b
            androidx.window.sidecar.SidecarInterface r1 = r11.f1242a     // Catch:{ all -> 0x01a1 }
            if (r1 == 0) goto L_0x00a2
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x01a1 }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r2 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r3 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ all -> 0x01a1 }
            goto L_0x00a3
        L_0x00a2:
            r1 = r6
        L_0x00a3:
            if (r1 == 0) goto L_0x00a9
            java.lang.Class r6 = r1.getReturnType()     // Catch:{ all -> 0x01a1 }
        L_0x00a9:
            boolean r1 = d0.h.a(r6, r7)     // Catch:{ all -> 0x01a1 }
            if (r1 == 0) goto L_0x0159
            androidx.window.sidecar.SidecarDeviceState r0 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x01a1 }
            r0.<init>()     // Catch:{ all -> 0x01a1 }
            r1 = 3
            r0.posture = r1     // Catch:{ NoSuchFieldError -> 0x00b8 }
            goto L_0x00ee
        L_0x00b8:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r2 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r3 = "setPosture"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01a1 }
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch:{ all -> 0x01a1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x01a1 }
            r2.invoke(r0, r3)     // Catch:{ all -> 0x01a1 }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r2 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r3 = "getPosture"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a1 }
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            d0.h.c(r0, r2)     // Catch:{ all -> 0x01a1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01a1 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01a1 }
            if (r0 != r1) goto L_0x0151
        L_0x00ee:
            androidx.window.sidecar.SidecarDisplayFeature r0 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x01a1 }
            r0.<init>()     // Catch:{ all -> 0x01a1 }
            android.graphics.Rect r1 = r0.getRect()     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "displayFeature.rect"
            d0.h.d(r1, r2)     // Catch:{ all -> 0x01a1 }
            r0.setRect(r1)     // Catch:{ all -> 0x01a1 }
            r0.getType()     // Catch:{ all -> 0x01a1 }
            r0.setType(r5)     // Catch:{ all -> 0x01a1 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r1 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x01a1 }
            r1.<init>()     // Catch:{ all -> 0x01a1 }
            java.util.List r0 = r1.displayFeatures     // Catch:{ NoSuchFieldError -> 0x010d }
            goto L_0x0147
        L_0x010d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01a1 }
            r2.<init>()     // Catch:{ all -> 0x01a1 }
            r2.add(r0)     // Catch:{ all -> 0x01a1 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r3 = "setDisplayFeatures"
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r6)     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x01a1 }
            r0.invoke(r1, r3)     // Catch:{ all -> 0x01a1 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r3 = "getDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x01a1 }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r6)     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a1 }
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            d0.h.c(r0, r1)     // Catch:{ all -> 0x01a1 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01a1 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0149
        L_0x0147:
            r4 = r5
            goto L_0x01a1
        L_0x0149:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "Invalid display feature getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0151:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "Invalid device posture getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0159:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r2.<init>(r0)     // Catch:{ all -> 0x01a1 }
            r2.append(r6)     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a1 }
            throw r1     // Catch:{ all -> 0x01a1 }
        L_0x016b:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r3.<init>(r1)     // Catch:{ all -> 0x01a1 }
            r3.append(r2)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x017d:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r1.<init>(r2)     // Catch:{ all -> 0x01a1 }
            r1.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x018f:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r1.<init>(r3)     // Catch:{ all -> 0x01a1 }
            r1.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x01a1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i.e():boolean");
    }
}
