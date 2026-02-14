package B;

import C.b;
import D.A;
import D.C0009j;
import D.E;
import D.F;
import D.G;
import D.I;
import D.K;
import D.u;
import L.f;
import L.g;
import L.k;
import L.m;
import M.c;
import M.d;
import M.h;
import M.i;
import M.j;
import M.n;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;
import v.C0096b;
import v.C0102h;

public final class a implements I, j, c, d, C0102h {

    /* renamed from: e  reason: collision with root package name */
    public static a f0e;

    /* renamed from: f  reason: collision with root package name */
    public static K f1f;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4d;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f2b = i2;
        this.f3c = obj;
        this.f4d = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008c, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008d, code lost:
        return 9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(B.a r11, org.json.JSONArray r12) {
        /*
            r11.getClass()
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L_0x0007:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L_0x0073
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = n.d.b(r5)
            int r7 = r5.length
            r8 = r11
        L_0x001a:
            if (r8 >= r7) goto L_0x005f
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L_0x0035
            r10 = 2
            if (r9 == r10) goto L_0x0032
            r10 = 3
            if (r9 == r10) goto L_0x002f
            r10 = 4
            if (r9 != r10) goto L_0x002d
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L_0x0037
        L_0x002d:
            r11 = 0
            throw r11
        L_0x002f:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L_0x0037
        L_0x0032:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L_0x0037
        L_0x0035:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L_0x0037:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x005c
            int r3 = n.d.a(r9)
            if (r3 == 0) goto L_0x0054
            if (r3 == r6) goto L_0x0051
            if (r3 == r4) goto L_0x004e
            r4 = 3
            if (r3 == r4) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            r1 = r1 | 8
            goto L_0x0056
        L_0x004e:
            r1 = r1 | 2
            goto L_0x0056
        L_0x0051:
            r1 = r1 | 4
            goto L_0x0056
        L_0x0054:
            r1 = r1 | 1
        L_0x0056:
            if (r2 != 0) goto L_0x0059
            r2 = r1
        L_0x0059:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x005c:
            int r8 = r8 + 1
            goto L_0x001a
        L_0x005f:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "No such DeviceOrientation: "
            r12.<init>(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0073:
            if (r1 == 0) goto L_0x0090
            r12 = 8
            switch(r1) {
                case 2: goto L_0x008f;
                case 3: goto L_0x0085;
                case 4: goto L_0x008d;
                case 5: goto L_0x0082;
                case 6: goto L_0x0085;
                case 7: goto L_0x0085;
                case 8: goto L_0x008c;
                case 9: goto L_0x0085;
                case 10: goto L_0x007f;
                case 11: goto L_0x007e;
                case 12: goto L_0x0085;
                case 13: goto L_0x0085;
                case 14: goto L_0x0085;
                case 15: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x008b
        L_0x007b:
            r11 = 13
            return r11
        L_0x007e:
            return r4
        L_0x007f:
            r11 = 11
            return r11
        L_0x0082:
            r11 = 12
            return r11
        L_0x0085:
            if (r2 == r4) goto L_0x008f
            if (r2 == r5) goto L_0x008d
            if (r2 == r12) goto L_0x008c
        L_0x008b:
            return r6
        L_0x008c:
            return r12
        L_0x008d:
            r11 = 9
        L_0x008f:
            return r11
        L_0x0090:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B.a.e(B.a, org.json.JSONArray):int");
    }

    public static ArrayList f(a aVar, JSONArray jSONArray) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            String string = jSONArray.getString(i2);
            g[] values = g.values();
            int length = values.length;
            int i3 = 0;
            while (i3 < length) {
                g gVar = values[i3];
                if (gVar.f265b.equals(string)) {
                    int ordinal = gVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(g.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(g.BOTTOM_OVERLAYS);
                    }
                    i2++;
                } else {
                    i3++;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + string);
        }
        return arrayList;
    }

    public static int g(a aVar, String str) {
        String str2;
        aVar.getClass();
        for (int i2 : n.d.b(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else if (i2 == 4) {
                str2 = "SystemUiMode.edgeToEdge";
            } else {
                throw null;
            }
            if (str2.equals(str)) {
                int a2 = n.d.a(i2);
                if (a2 == 0) {
                    return 1;
                }
                if (a2 == 1) {
                    return 2;
                }
                if (a2 != 2) {
                    return 4;
                }
                return 3;
            }
        }
        throw new NoSuchFieldException("No such SystemUiMode: " + str);
    }

    public static f h(a aVar, JSONObject jSONObject) {
        Integer num;
        int i2;
        Boolean bool;
        Integer num2;
        Integer num3;
        aVar.getClass();
        Boolean bool2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            num = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            num = null;
        }
        int i3 = 0;
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            i2 = C0009j.a(jSONObject.getString("statusBarIconBrightness"));
        } else {
            i2 = 0;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            bool = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            num2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            num2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            i3 = C0009j.a(jSONObject.getString("systemNavigationBarIconBrightness"));
        }
        int i4 = i3;
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            num3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new f(num, i2, bool, num2, i4, num3, bool2);
    }

    public static HashMap i(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public void a(KeyEvent keyEvent, G g2) {
        String str;
        int action = keyEvent.getAction();
        boolean z2 = true;
        if (action == 0 || action == 1) {
            Character a2 = ((F) this.f4d).a(keyEvent.getUnicodeChar());
            if (action == 0) {
                z2 = false;
            }
            A a3 = new A(g2);
            L.c cVar = (L.c) this.f3c;
            HashMap hashMap = new HashMap();
            if (z2) {
                str = "keyup";
            } else {
                str = "keydown";
            }
            hashMap.put("type", str);
            hashMap.put("keymap", "android");
            hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
            hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
            hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
            hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
            hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
            hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
            hashMap.put("character", a2.toString());
            hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
            hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
            hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
            cVar.f248a.f(hashMap, new A(a3));
            return;
        }
        g2.a(false);
    }

    public void b(a aVar, k kVar) {
        u uVar = (u) this.f4d;
        if (((b) uVar.f108c) == null) {
            kVar.c((Map) this.f3c);
            return;
        }
        String str = (String) aVar.f3c;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            kVar.b();
            return;
        }
        try {
            this.f3c = Collections.unmodifiableMap(((E) ((I[]) ((b) uVar.f108c).f13a)[0]).f31c);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), (Object) null);
        }
        kVar.c((Map) this.f3c);
    }

    public void c(ByteBuffer byteBuffer, F.g gVar) {
        switch (this.f2b) {
            case 11:
                e eVar = (e) this.f4d;
                try {
                    ((M.b) this.f3c).g(((i) eVar.f9c).b(byteBuffer), new a(this, gVar, 10, false));
                    return;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f8b), "Failed to handle message", e2);
                    gVar.a((ByteBuffer) null);
                    return;
                }
            default:
                b bVar = (b) this.f4d;
                try {
                    ((j) this.f3c).b(((M.k) bVar.f15c).g(byteBuffer), new k(1, this, gVar));
                    return;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) bVar.f14b), "Failed to handle method call", e3);
                    gVar.a(((M.k) bVar.f15c).a(e3.getMessage(), Log.getStackTraceString(e3)));
                    return;
                }
        }
    }

    public void d(Object obj) {
        switch (this.f2b) {
            case 8:
                b bVar = (b) this.f4d;
                m mVar = (m) this.f3c;
                ((ConcurrentLinkedQueue) bVar.f13a).remove(mVar);
                if (!((ConcurrentLinkedQueue) bVar.f13a).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(mVar.f297a));
                    return;
                }
                return;
            default:
                ((F.g) this.f3c).a(((i) ((e) ((a) this.f4d).f4d).f9c).c(obj));
                return;
        }
    }

    public void j(int i2) {
        ((io.flutter.plugin.platform.i) this.f4d).b(i2);
        ((io.flutter.plugin.platform.j) this.f3c).d(i2);
    }

    public boolean k(int i2) {
        ((io.flutter.plugin.platform.i) this.f4d).b(i2);
        return ((io.flutter.plugin.platform.j) this.f3c).g(i2);
    }

    public /* synthetic */ a(int i2, boolean z2) {
        this.f2b = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z2) {
        this.f2b = i2;
        this.f4d = obj;
        this.f3c = obj2;
    }

    public a(O.a aVar, u uVar) {
        this.f2b = 14;
        this.f3c = aVar;
        this.f4d = uVar;
        uVar.f108c = new u(26, (Object) this);
    }

    public a(L.c cVar) {
        this.f2b = 1;
        this.f4d = new F();
        this.f3c = cVar;
    }

    public a(u uVar) {
        this.f2b = 4;
        this.f4d = uVar;
        this.f3c = new HashMap();
    }

    public a(View view, InputMethodManager inputMethodManager, u uVar) {
        this.f2b = 15;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f4d = view;
        this.f3c = inputMethodManager;
        uVar.f108c = this;
    }

    public a(C0096b bVar) {
        this.f2b = 18;
        a aVar = new a(17);
        this.f3c = bVar;
        this.f4d = aVar;
    }

    public a(int i2) {
        this.f2b = i2;
        switch (i2) {
            case 17:
                this.f3c = new ReentrantLock();
                this.f4d = new LinkedHashMap();
                return;
            default:
                this.f3c = new LongSparseArray();
                this.f4d = new PriorityQueue();
                return;
        }
    }

    public a(F.b bVar, int i2) {
        this.f2b = i2;
        switch (i2) {
            case 6:
                u uVar = new u(11, (Object) this);
                b bVar2 = new b(bVar, "flutter/platform", h.f327b);
                this.f3c = bVar2;
                bVar2.h(uVar);
                return;
            case 9:
                u uVar2 = new u(24, (Object) this);
                b bVar3 = new b(bVar, "flutter/textinput", h.f327b);
                this.f3c = bVar3;
                bVar3.h(uVar2);
                return;
            default:
                u uVar3 = new u(8, (Object) this);
                b bVar4 = new b(bVar, "flutter/localization", h.f327b);
                this.f3c = bVar4;
                bVar4.h(uVar3);
                return;
        }
    }

    public a(F.b bVar, PackageManager packageManager) {
        this.f2b = 7;
        u uVar = new u(16, (Object) this);
        this.f3c = packageManager;
        new b(bVar, "flutter/processtext", n.f331a).h(uVar);
    }
}
