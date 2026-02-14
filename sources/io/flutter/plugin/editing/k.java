package io.flutter.plugin.editing;

import B.a;
import B.e;
import C.b;
import D.C0000a;
import D.u;
import L.o;
import L.q;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final View f619a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f620b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f621c;

    /* renamed from: d  reason: collision with root package name */
    public final a f622d;

    /* renamed from: e  reason: collision with root package name */
    public j f623e = new j(1, 0);

    /* renamed from: f  reason: collision with root package name */
    public o f624f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray f625g;

    /* renamed from: h  reason: collision with root package name */
    public f f626h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f627i;

    /* renamed from: j  reason: collision with root package name */
    public c f628j;

    /* renamed from: k  reason: collision with root package name */
    public final j f629k;

    /* renamed from: l  reason: collision with root package name */
    public final i f630l;
    public Rect m;

    /* renamed from: n  reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f631n;

    /* renamed from: o  reason: collision with root package name */
    public q f632o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f633p;

    public k(View view, a aVar, u uVar, j jVar, i iVar) {
        this.f619a = view;
        this.f626h = new f((q) null, view);
        this.f620b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f621c = C0000a.d(view.getContext().getSystemService(C0000a.j()));
        } else {
            this.f621c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f631n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f622d = aVar;
        aVar.f4d = new u(29, (Object) this);
        ((b) aVar.f3c).e("TextInputClient.requestExistingInputState", (Object) null, (L.k) null);
        this.f629k = jVar;
        jVar.f664f = this;
        this.f630l = iVar;
        iVar.getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        if (r10 == r0.f320e) goto L_0x0186;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            r4 = 2
            if (r19 == 0) goto L_0x002e
            io.flutter.plugin.editing.f r0 = r1.f626h
            java.lang.String r0 = r0.toString()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L_0x002e
            android.view.autofill.AutofillManager r5 = r1.f621c
            if (r5 == 0) goto L_0x002e
            android.util.SparseArray r6 = r1.f625g
            if (r6 == 0) goto L_0x002e
            L.o r6 = r1.f624f
            B.e r6 = r6.f310j
            java.lang.Object r6 = r6.f7a
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.hashCode()
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forText(r0)
            android.view.View r7 = r1.f619a
            r5.notifyValueChanged(r7, r6, r0)
        L_0x002e:
            io.flutter.plugin.editing.f r0 = r1.f626h
            r0.getClass()
            int r7 = android.text.Selection.getSelectionStart(r0)
            io.flutter.plugin.editing.f r0 = r1.f626h
            r0.getClass()
            int r8 = android.text.Selection.getSelectionEnd(r0)
            io.flutter.plugin.editing.f r0 = r1.f626h
            r0.getClass()
            int r9 = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(r0)
            io.flutter.plugin.editing.f r0 = r1.f626h
            r0.getClass()
            int r10 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(r0)
            io.flutter.plugin.editing.f r0 = r1.f626h
            r0.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r0 = r0.f594e
            r5.<init>(r0)
            r0.clear()
            L.q r0 = r1.f632o
            if (r0 == 0) goto L_0x0186
            io.flutter.plugin.editing.f r0 = r1.f626h
            java.lang.String r0 = r0.toString()
            L.q r6 = r1.f632o
            java.lang.String r6 = r6.f316a
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0089
            L.q r0 = r1.f632o
            int r6 = r0.f317b
            if (r7 != r6) goto L_0x0089
            int r6 = r0.f318c
            if (r8 != r6) goto L_0x0089
            int r6 = r0.f319d
            if (r9 != r6) goto L_0x0089
            int r0 = r0.f320e
            if (r10 != r0) goto L_0x0089
            goto L_0x0186
        L_0x0089:
            io.flutter.plugin.editing.f r0 = r1.f626h
            r0.toString()
            L.o r0 = r1.f624f
            boolean r0 = r0.f305e
            r6 = 0
            B.a r11 = r1.f622d
            if (r0 == 0) goto L_0x014c
            io.flutter.plugin.editing.j r0 = r1.f623e
            int r12 = r0.f618b
            r11.getClass()
            r5.size()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            org.json.JSONArray r14 = new org.json.JSONArray
            r14.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00af:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r5.next()
            io.flutter.plugin.editing.h r0 = (io.flutter.plugin.editing.h) r0
            r0.getClass()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            r16 = 1
            java.lang.String r2 = "oldText"
            r17 = 0
            java.lang.String r3 = r0.f606a     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "deltaText"
            java.lang.String r3 = r0.f607b     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "deltaStart"
            int r3 = r0.f608c     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "deltaEnd"
            int r3 = r0.f609d     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "selectionBase"
            int r3 = r0.f610e     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "selectionExtent"
            int r3 = r0.f611f     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "composingBase"
            int r3 = r0.f612g     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r3)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r2 = "composingExtent"
            int r0 = r0.f613h     // Catch:{ JSONException -> 0x0108 }
            r15.put(r2, r0)     // Catch:{ JSONException -> 0x0108 }
            goto L_0x0120
        L_0x0108:
            r0 = move-exception
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            r17 = 0
        L_0x010d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "unable to create JSONObject: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "TextEditingDelta"
            android.util.Log.e(r2, r0)
        L_0x0120:
            r14.put(r15)
            goto L_0x00af
        L_0x0124:
            r16 = 1
            r17 = 0
            java.lang.String r0 = "deltas"
            r13.put(r0, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.io.Serializable[] r2 = new java.io.Serializable[r4]
            r2[r17] = r0
            r2[r16] = r13
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.lang.Object r2 = r11.f3c
            C.b r2 = (C.b) r2
            java.lang.String r3 = "TextInputClient.updateEditingStateWithDeltas"
            r2.e(r3, r0, r6)
            io.flutter.plugin.editing.f r0 = r1.f626h
            java.util.ArrayList r0 = r0.f594e
            r0.clear()
            goto L_0x0178
        L_0x014c:
            r16 = 1
            r17 = 0
            io.flutter.plugin.editing.j r0 = r1.f623e
            int r0 = r0.f618b
            io.flutter.plugin.editing.f r2 = r1.f626h
            java.lang.String r2 = r2.toString()
            r11.getClass()
            java.util.HashMap r2 = B.a.i(r2, r7, r8, r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.Serializable[] r3 = new java.io.Serializable[r4]
            r3[r17] = r0
            r3[r16] = r2
            java.util.List r0 = java.util.Arrays.asList(r3)
            java.lang.Object r2 = r11.f3c
            C.b r2 = (C.b) r2
            java.lang.String r3 = "TextInputClient.updateEditingState"
            r2.e(r3, r0, r6)
        L_0x0178:
            L.q r5 = new L.q
            io.flutter.plugin.editing.f r0 = r1.f626h
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f632o = r5
            return
        L_0x0186:
            io.flutter.plugin.editing.f r0 = r1.f626h
            java.util.ArrayList r0 = r0.f594e
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.k.a(boolean):void");
    }

    public final void b() {
        this.f629k.f664f = null;
        this.f630l.getClass();
        this.f622d.f4d = null;
        c();
        this.f626h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f631n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        o oVar;
        e eVar;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f621c) != null && (oVar = this.f624f) != null && (eVar = oVar.f310j) != null && this.f625g != null) {
            autofillManager.notifyViewExited(this.f619a, ((String) eVar.f7a).hashCode());
        }
    }

    public final void d(o oVar) {
        e eVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (oVar == null || (eVar = oVar.f310j) == null) {
                this.f625g = null;
                return;
            }
            SparseArray sparseArray = new SparseArray();
            this.f625g = sparseArray;
            o[] oVarArr = oVar.f312l;
            if (oVarArr == null) {
                sparseArray.put(((String) eVar.f7a).hashCode(), oVar);
                return;
            }
            for (o oVar2 : oVarArr) {
                e eVar2 = oVar2.f310j;
                if (eVar2 != null) {
                    SparseArray sparseArray2 = this.f625g;
                    String str = (String) eVar2.f7a;
                    sparseArray2.put(str.hashCode(), oVar2);
                    this.f621c.notifyValueChanged(this.f619a, str.hashCode(), AutofillValue.forText(((q) eVar2.f9c).f316a));
                }
            }
        }
    }
}
