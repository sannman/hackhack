package io.flutter.view;

import B.a;
import B.e;
import C.b;
import D.u;
import D.v;
import M.c;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k extends AccessibilityNodeProvider {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f771x = 0;

    /* renamed from: a  reason: collision with root package name */
    public final View f772a;

    /* renamed from: b  reason: collision with root package name */
    public final b f773b;

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f774c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f775d;

    /* renamed from: e  reason: collision with root package name */
    public final a f776e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f777f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f778g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f779h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public g f780i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f781j;

    /* renamed from: k  reason: collision with root package name */
    public int f782k = 0;

    /* renamed from: l  reason: collision with root package name */
    public g f783l;
    public g m;

    /* renamed from: n  reason: collision with root package name */
    public g f784n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f785o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public int f786p = 0;

    /* renamed from: q  reason: collision with root package name */
    public u f787q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f788r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f789s = false;

    /* renamed from: t  reason: collision with root package name */
    public final a f790t = new a(this);
    public final b u;

    /* renamed from: v  reason: collision with root package name */
    public final c f791v;

    /* renamed from: w  reason: collision with root package name */
    public final v f792w;

    public k(View view, b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, a aVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        b bVar2 = new b(this);
        this.u = bVar2;
        v vVar = new v(this, new Handler(), 1);
        this.f792w = vVar;
        this.f772a = view;
        this.f773b = bVar;
        this.f774c = accessibilityManager;
        this.f777f = contentResolver;
        this.f775d = accessibilityViewEmbedder;
        this.f776e = aVar;
        bVar2.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar2);
        c cVar = new c(this, accessibilityManager);
        this.f791v = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f782k |= 128;
        vVar.onChange(false, (Uri) null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, vVar);
        if (!(Build.VERSION.SDK_INT < 31 || view == null || view.getResources() == null)) {
            int a2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (a2 == Integer.MAX_VALUE || a2 < 300) {
                this.f782k &= -9;
            } else {
                this.f782k |= 8;
            }
            ((FlutterJNI) bVar.f14b).setAccessibilityFeatures(this.f782k);
        }
        ((j) aVar.f3c).f666h.f634a = this;
        ((i) aVar.f4d).f652f.f634a = this;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, io.flutter.view.e] */
    public final e a(int i2) {
        HashMap hashMap = this.f779h;
        e eVar = (e) hashMap.get(Integer.valueOf(i2));
        if (eVar != null) {
            return eVar;
        }
        ? obj = new Object();
        obj.f716c = -1;
        obj.f715b = i2;
        obj.f714a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), obj);
        return obj;
    }

    public final g b(int i2) {
        HashMap hashMap = this.f778g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f744b = i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    public final AccessibilityEvent c(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        View view = this.f772a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v113, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r19v9 */
    /* JADX WARNING: type inference failed for: r19v11 */
    /* JADX WARNING: type inference failed for: r19v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = 0
            r4 = 2
            r5 = 1
            r0.h(r5)
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r1 < r6) goto L_0x0015
            io.flutter.view.AccessibilityViewEmbedder r2 = r0.f775d
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.createAccessibilityNodeInfo(r1)
            return r1
        L_0x0015:
            java.util.HashMap r7 = r0.f778g
            r8 = -1
            android.view.View r9 = r0.f772a
            if (r1 != r8) goto L_0x0034
            android.view.accessibility.AccessibilityNodeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.obtain(r9)
            r9.onInitializeAccessibilityNodeInfo(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0030
            r1.addChild(r9, r3)
        L_0x0030:
            r1.setImportantForAccessibility(r3)
            return r1
        L_0x0034:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r7.get(r10)
            io.flutter.view.g r7 = (io.flutter.view.g) r7
            r10 = 0
            if (r7 != 0) goto L_0x0042
            return r10
        L_0x0042:
            int r11 = r7.f751i
            B.a r12 = r0.f776e
            if (r11 == r8) goto L_0x0054
            boolean r11 = r12.k(r11)
            if (r11 == 0) goto L_0x0054
            int r1 = r7.f751i
            r12.j(r1)
            return r10
        L_0x0054:
            android.view.accessibility.AccessibilityNodeInfo r11 = android.view.accessibility.AccessibilityNodeInfo.obtain(r9, r1)
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 12
            boolean r15 = r7.h(r14)
            if (r15 == 0) goto L_0x0064
        L_0x0062:
            r15 = r3
            goto L_0x0071
        L_0x0064:
            java.lang.CharSequence r15 = io.flutter.view.g.b(r7)
            if (r15 == 0) goto L_0x006c
        L_0x006a:
            r15 = r5
            goto L_0x0071
        L_0x006c:
            int r15 = r7.f746d
            if (r15 == 0) goto L_0x0062
            goto L_0x006a
        L_0x0071:
            r11.setImportantForAccessibility(r15)
            java.lang.String r15 = ""
            r11.setViewIdResourceName(r15)
            r16 = r10
            java.lang.String r10 = r7.f756o
            if (r10 == 0) goto L_0x0082
            r11.setViewIdResourceName(r10)
        L_0x0082:
            android.content.Context r10 = r9.getContext()
            java.lang.String r10 = r10.getPackageName()
            r11.setPackageName(r10)
            java.lang.String r10 = "android.view.View"
            r11.setClassName(r10)
            r11.setSource(r9, r1)
            boolean r10 = r7.j()
            r11.setFocusable(r10)
            io.flutter.view.g r10 = r0.f783l
            if (r10 == 0) goto L_0x00aa
            int r10 = r10.f744b
            if (r10 != r1) goto L_0x00a6
            r10 = r5
            goto L_0x00a7
        L_0x00a6:
            r10 = r3
        L_0x00a7:
            r11.setFocused(r10)
        L_0x00aa:
            io.flutter.view.g r10 = r0.f780i
            if (r10 == 0) goto L_0x00b8
            int r10 = r10.f744b
            if (r10 != r1) goto L_0x00b4
            r10 = r5
            goto L_0x00b5
        L_0x00b4:
            r10 = r3
        L_0x00b5:
            r11.setAccessibilityFocused(r10)
        L_0x00b8:
            r10 = 5
            boolean r17 = r7.h(r10)
            if (r17 == 0) goto L_0x0147
            r14 = 11
            boolean r14 = r7.h(r14)
            r11.setPassword(r14)
            r14 = 21
            boolean r18 = r7.h(r14)
            if (r18 != 0) goto L_0x00d5
            java.lang.String r2 = "android.widget.EditText"
            r11.setClassName(r2)
        L_0x00d5:
            boolean r2 = r7.h(r14)
            r2 = r2 ^ r5
            r11.setEditable(r2)
            int r2 = r7.f749g
            if (r2 == r8) goto L_0x00e8
            int r14 = r7.f750h
            if (r14 == r8) goto L_0x00e8
            r11.setTextSelection(r2, r14)
        L_0x00e8:
            io.flutter.view.g r2 = r0.f780i
            if (r2 == 0) goto L_0x00f3
            int r2 = r2.f744b
            if (r2 != r1) goto L_0x00f3
            r11.setLiveRegion(r5)
        L_0x00f3:
            io.flutter.view.d r2 = io.flutter.view.d.MOVE_CURSOR_FORWARD_BY_CHARACTER
            boolean r2 = io.flutter.view.g.a(r7, r2)
            r14 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0102
            r11.addAction(r14)
            r2 = r5
            goto L_0x0103
        L_0x0102:
            r2 = r3
        L_0x0103:
            io.flutter.view.d r10 = io.flutter.view.d.MOVE_CURSOR_BACKWARD_BY_CHARACTER
            boolean r10 = io.flutter.view.g.a(r7, r10)
            r19 = r3
            r3 = 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0113
            r11.addAction(r3)
            r2 = r5
        L_0x0113:
            io.flutter.view.d r10 = io.flutter.view.d.MOVE_CURSOR_FORWARD_BY_WORD
            boolean r10 = io.flutter.view.g.a(r7, r10)
            if (r10 == 0) goto L_0x011f
            r11.addAction(r14)
            r2 = r2 | r4
        L_0x011f:
            io.flutter.view.d r10 = io.flutter.view.d.MOVE_CURSOR_BACKWARD_BY_WORD
            boolean r10 = io.flutter.view.g.a(r7, r10)
            if (r10 == 0) goto L_0x012b
            r11.addAction(r3)
            r2 = r2 | r4
        L_0x012b:
            r11.setMovementGranularities(r2)
            int r2 = r7.f747e
            if (r2 < 0) goto L_0x0149
            java.lang.String r2 = r7.f759r
            if (r2 != 0) goto L_0x0139
            r2 = r19
            goto L_0x013d
        L_0x0139:
            int r2 = r2.length()
        L_0x013d:
            int r3 = r7.f748f
            int r10 = r7.f747e
            int r2 = r2 - r3
            int r2 = r2 + r10
            r11.setMaxTextLength(r2)
            goto L_0x0149
        L_0x0147:
            r19 = r3
        L_0x0149:
            io.flutter.view.d r2 = io.flutter.view.d.SET_SELECTION
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x0156
            r2 = 131072(0x20000, float:1.83671E-40)
            r11.addAction(r2)
        L_0x0156:
            io.flutter.view.d r2 = io.flutter.view.d.COPY
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x0163
            r2 = 16384(0x4000, float:2.2959E-41)
            r11.addAction(r2)
        L_0x0163:
            io.flutter.view.d r2 = io.flutter.view.d.CUT
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x016e
            r11.addAction(r6)
        L_0x016e:
            io.flutter.view.d r2 = io.flutter.view.d.PASTE
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x017c
            r2 = 32768(0x8000, float:4.5918E-41)
            r11.addAction(r2)
        L_0x017c:
            io.flutter.view.d r2 = io.flutter.view.d.SET_TEXT
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x0189
            r2 = 2097152(0x200000, float:2.938736E-39)
            r11.addAction(r2)
        L_0x0189:
            r2 = 4
            boolean r2 = r7.h(r2)
            if (r2 == 0) goto L_0x0195
            java.lang.String r2 = "android.widget.Button"
            r11.setClassName(r2)
        L_0x0195:
            r2 = 15
            boolean r2 = r7.h(r2)
            if (r2 == 0) goto L_0x01a2
            java.lang.String r2 = "android.widget.ImageView"
            r11.setClassName(r2)
        L_0x01a2:
            io.flutter.view.d r2 = io.flutter.view.d.DISMISS
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x01b2
            r11.setDismissable(r5)
            r2 = 1048576(0x100000, float:1.469368E-39)
            r11.addAction(r2)
        L_0x01b2:
            io.flutter.view.g r2 = r7.f732P
            if (r2 == 0) goto L_0x01bc
            int r2 = r2.f744b
            r11.setParent(r9, r2)
            goto L_0x01bf
        L_0x01bc:
            r11.setParent(r9)
        L_0x01bf:
            int r2 = r7.f720B
            if (r2 == r8) goto L_0x01c6
            r11.setTraversalAfter(r9, r2)
        L_0x01c6:
            android.graphics.Rect r2 = r7.f742Z
            io.flutter.view.g r3 = r7.f732P
            if (r3 == 0) goto L_0x01e0
            android.graphics.Rect r3 = r3.f742Z
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r2)
            int r10 = r3.left
            int r10 = -r10
            int r3 = r3.top
            int r3 = -r3
            r6.offset(r10, r3)
            r11.setBoundsInParent(r6)
            goto L_0x01e3
        L_0x01e0:
            r11.setBoundsInParent(r2)
        L_0x01e3:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r2)
            int[] r2 = new int[r4]
            r9.getLocationOnScreen(r2)
            r6 = r2[r19]
            r2 = r2[r5]
            r3.offset(r6, r2)
            r11.setBoundsInScreen(r3)
            r11.setVisibleToUser(r5)
            r2 = 7
            boolean r2 = r7.h(r2)
            if (r2 == 0) goto L_0x020d
            r2 = 8
            boolean r2 = r7.h(r2)
            if (r2 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            r2 = r19
            goto L_0x020e
        L_0x020d:
            r2 = r5
        L_0x020e:
            r11.setEnabled(r2)
            io.flutter.view.d r2 = io.flutter.view.d.TAP
            boolean r2 = io.flutter.view.g.a(r7, r2)
            r3 = 16
            if (r2 == 0) goto L_0x0236
            io.flutter.view.e r2 = r7.f736T
            if (r2 == 0) goto L_0x022f
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.e r6 = r7.f736T
            java.lang.String r6 = r6.f718e
            r2.<init>(r3, r6)
            r11.addAction(r2)
            r11.setClickable(r5)
            goto L_0x0244
        L_0x022f:
            r11.addAction(r3)
            r11.setClickable(r5)
            goto L_0x0244
        L_0x0236:
            r2 = 24
            boolean r2 = r7.h(r2)
            if (r2 == 0) goto L_0x0244
            r11.addAction(r3)
            r11.setClickable(r5)
        L_0x0244:
            io.flutter.view.d r2 = io.flutter.view.d.LONG_PRESS
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x0268
            io.flutter.view.e r2 = r7.f737U
            r6 = 32
            if (r2 == 0) goto L_0x0262
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.e r10 = r7.f737U
            java.lang.String r10 = r10.f718e
            r2.<init>(r6, r10)
            r11.addAction(r2)
            r11.setLongClickable(r5)
            goto L_0x0268
        L_0x0262:
            r11.addAction(r6)
            r11.setLongClickable(r5)
        L_0x0268:
            io.flutter.view.d r2 = io.flutter.view.d.SCROLL_LEFT
            boolean r6 = io.flutter.view.g.a(r7, r2)
            io.flutter.view.d r10 = io.flutter.view.d.SCROLL_DOWN
            io.flutter.view.d r14 = io.flutter.view.d.SCROLL_UP
            io.flutter.view.d r8 = io.flutter.view.d.SCROLL_RIGHT
            r4 = 8192(0x2000, float:1.14794E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x028c
            boolean r6 = io.flutter.view.g.a(r7, r14)
            if (r6 != 0) goto L_0x028c
            boolean r6 = io.flutter.view.g.a(r7, r8)
            if (r6 != 0) goto L_0x028c
            boolean r6 = io.flutter.view.g.a(r7, r10)
            if (r6 == 0) goto L_0x02f3
        L_0x028c:
            r11.setScrollable(r5)
            r6 = 19
            boolean r6 = r7.h(r6)
            if (r6 == 0) goto L_0x02d5
            boolean r6 = io.flutter.view.g.a(r7, r2)
            if (r6 != 0) goto L_0x02a3
            boolean r6 = io.flutter.view.g.a(r7, r8)
            if (r6 == 0) goto L_0x02a6
        L_0x02a3:
            r5 = r19
            goto L_0x02c0
        L_0x02a6:
            boolean r6 = r0.i(r7)
            if (r6 == 0) goto L_0x02b8
            int r6 = r7.f752j
            r5 = r19
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r6 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r6, r5, r5)
            r11.setCollectionInfo(r6)
            goto L_0x02d5
        L_0x02b8:
            r5 = r19
            java.lang.String r6 = "android.widget.ScrollView"
            r11.setClassName(r6)
            goto L_0x02d5
        L_0x02c0:
            boolean r6 = r0.i(r7)
            if (r6 == 0) goto L_0x02d0
            int r6 = r7.f752j
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r6 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r5, r6, r5)
            r11.setCollectionInfo(r6)
            goto L_0x02d5
        L_0x02d0:
            java.lang.String r5 = "android.widget.HorizontalScrollView"
            r11.setClassName(r5)
        L_0x02d5:
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 != 0) goto L_0x02e1
            boolean r2 = io.flutter.view.g.a(r7, r14)
            if (r2 == 0) goto L_0x02e4
        L_0x02e1:
            r11.addAction(r3)
        L_0x02e4:
            boolean r2 = io.flutter.view.g.a(r7, r8)
            if (r2 != 0) goto L_0x02f0
            boolean r2 = io.flutter.view.g.a(r7, r10)
            if (r2 == 0) goto L_0x02f3
        L_0x02f0:
            r11.addAction(r4)
        L_0x02f3:
            io.flutter.view.d r2 = io.flutter.view.d.INCREASE
            boolean r5 = io.flutter.view.g.a(r7, r2)
            io.flutter.view.d r6 = io.flutter.view.d.DECREASE
            if (r5 != 0) goto L_0x0307
            boolean r5 = io.flutter.view.g.a(r7, r6)
            if (r5 == 0) goto L_0x0304
            goto L_0x0307
        L_0x0304:
            r2 = 16
            goto L_0x031f
        L_0x0307:
            java.lang.String r5 = "android.widget.SeekBar"
            r11.setClassName(r5)
            boolean r2 = io.flutter.view.g.a(r7, r2)
            if (r2 == 0) goto L_0x0315
            r11.addAction(r3)
        L_0x0315:
            boolean r2 = io.flutter.view.g.a(r7, r6)
            if (r2 == 0) goto L_0x0304
            r11.addAction(r4)
            goto L_0x0304
        L_0x031f:
            boolean r2 = r7.h(r2)
            if (r2 == 0) goto L_0x0329
            r2 = 1
            r11.setLiveRegion(r2)
        L_0x0329:
            r2 = 5
            boolean r2 = r7.h(r2)
            r3 = 28
            if (r2 == 0) goto L_0x039b
            java.lang.String r2 = r7.f759r
            java.util.ArrayList r4 = r7.f760s
            android.text.SpannableString r2 = io.flutter.view.g.d(r2, r4)
            r11.setText(r2)
            if (r13 < r3) goto L_0x0398
            android.text.SpannableString r2 = r7.e()
            java.lang.String r4 = r7.f764x
            java.util.ArrayList r5 = r7.f765y
            android.text.SpannableString r4 = io.flutter.view.g.d(r4, r5)
            r5 = 2
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r5]
            r19 = 0
            r6[r19] = r2
            r21 = 1
            r6[r21] = r4
            r4 = r16
            r2 = 0
        L_0x0359:
            if (r2 >= r5) goto L_0x0392
            r5 = r6[r2]
            if (r5 == 0) goto L_0x038a
            int r8 = r5.length()
            if (r8 <= 0) goto L_0x038a
            if (r4 == 0) goto L_0x036d
            int r8 = r4.length()
            if (r8 != 0) goto L_0x0372
        L_0x036d:
            r19 = 0
            r21 = 1
            goto L_0x0388
        L_0x0372:
            r8 = 3
            java.lang.CharSequence[] r10 = new java.lang.CharSequence[r8]
            r19 = 0
            r10[r19] = r4
            java.lang.String r4 = ", "
            r21 = 1
            r10[r21] = r4
            r20 = 2
            r10[r20] = r5
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r10)
            goto L_0x038e
        L_0x0388:
            r4 = r5
            goto L_0x038e
        L_0x038a:
            r19 = 0
            r21 = 1
        L_0x038e:
            int r2 = r2 + 1
            r5 = 2
            goto L_0x0359
        L_0x0392:
            r19 = 0
            r11.setHintText(r4)
            goto L_0x03cd
        L_0x0398:
            r19 = 0
            goto L_0x03cd
        L_0x039b:
            r2 = 12
            r19 = 0
            boolean r2 = r7.h(r2)
            if (r2 != 0) goto L_0x03cd
            java.lang.CharSequence r2 = io.flutter.view.g.b(r7)
            if (r13 >= r3) goto L_0x03c8
            java.lang.String r4 = r7.f766z
            if (r4 == 0) goto L_0x03c8
            if (r2 == 0) goto L_0x03b2
            r15 = r2
        L_0x03b2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = "\n"
            r2.append(r4)
            java.lang.String r4 = r7.f766z
            r2.append(r4)
            java.lang.String r2 = r2.toString()
        L_0x03c8:
            if (r2 == 0) goto L_0x03cd
            r11.setContentDescription(r2)
        L_0x03cd:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x03e3
            java.lang.String r4 = r7.f766z
            if (r4 == 0) goto L_0x03e3
            r11.setTooltipText(r4)
            java.lang.CharSequence r4 = io.flutter.view.g.b(r7)
            if (r4 != 0) goto L_0x03e3
            java.lang.String r4 = r7.f766z
            r11.setContentDescription(r4)
        L_0x03e3:
            r4 = 1
            boolean r5 = r7.h(r4)
            r6 = 17
            boolean r6 = r7.h(r6)
            if (r5 != 0) goto L_0x03f5
            if (r6 == 0) goto L_0x03f3
            goto L_0x03f5
        L_0x03f3:
            r4 = r19
        L_0x03f5:
            r11.setCheckable(r4)
            if (r5 == 0) goto L_0x0417
            r5 = 2
            boolean r4 = r7.h(r5)
            r11.setChecked(r4)
            r4 = 9
            boolean r4 = r7.h(r4)
            if (r4 == 0) goto L_0x0411
            java.lang.String r4 = "android.widget.RadioButton"
            r11.setClassName(r4)
        L_0x040f:
            r8 = 3
            goto L_0x0428
        L_0x0411:
            java.lang.String r4 = "android.widget.CheckBox"
            r11.setClassName(r4)
            goto L_0x040f
        L_0x0417:
            if (r6 == 0) goto L_0x040f
            r4 = 18
            boolean r4 = r7.h(r4)
            r11.setChecked(r4)
            java.lang.String r4 = "android.widget.Switch"
            r11.setClassName(r4)
            goto L_0x040f
        L_0x0428:
            boolean r4 = r7.h(r8)
            r11.setSelected(r4)
            if (r2 < r3) goto L_0x043a
            r2 = 10
            boolean r2 = r7.h(r2)
            r11.setHeading(r2)
        L_0x043a:
            io.flutter.view.g r2 = r0.f780i
            if (r2 == 0) goto L_0x0448
            int r2 = r2.f744b
            if (r2 != r1) goto L_0x0448
            r1 = 128(0x80, float:1.794E-43)
            r11.addAction(r1)
            goto L_0x044d
        L_0x0448:
            r1 = 64
            r11.addAction(r1)
        L_0x044d:
            java.util.ArrayList r1 = r7.f735S
            if (r1 == 0) goto L_0x046e
            java.util.Iterator r1 = r1.iterator()
        L_0x0455:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x046e
            java.lang.Object r2 = r1.next()
            io.flutter.view.e r2 = (io.flutter.view.e) r2
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r3 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            int r4 = r2.f714a
            java.lang.String r2 = r2.f717d
            r3.<init>(r4, r2)
            r11.addAction(r3)
            goto L_0x0455
        L_0x046e:
            java.util.ArrayList r1 = r7.f733Q
            java.util.Iterator r1 = r1.iterator()
        L_0x0474:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04a1
            java.lang.Object r2 = r1.next()
            io.flutter.view.g r2 = (io.flutter.view.g) r2
            r3 = 14
            boolean r3 = r2.h(r3)
            if (r3 == 0) goto L_0x0489
            goto L_0x0474
        L_0x0489:
            int r3 = r2.f751i
            r4 = -1
            if (r3 == r4) goto L_0x049b
            r12.j(r3)
            int r3 = r2.f751i
            boolean r3 = r12.k(r3)
            if (r3 == 0) goto L_0x049a
            goto L_0x049b
        L_0x049a:
            throw r16
        L_0x049b:
            int r2 = r2.f744b
            r11.addChild(r9, r2)
            goto L_0x0474
        L_0x04a1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.k.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public final boolean d(MotionEvent motionEvent, boolean z2) {
        g i2;
        if (this.f774c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f778g;
            if (!hashMap.isEmpty()) {
                g i3 = ((g) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
                if (i3 == null || i3.f751i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i2 = ((g) hashMap.get(0)).i(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f784n) {
                            if (i2 != null) {
                                f(i2.f744b, 128);
                            }
                            g gVar = this.f784n;
                            if (gVar != null) {
                                f(gVar.f744b, 256);
                            }
                            this.f784n = i2;
                        }
                    } else if (motionEvent.getAction() == 10) {
                        g gVar2 = this.f784n;
                        if (gVar2 != null) {
                            f(gVar2.f744b, 256);
                            this.f784n = null;
                        }
                    } else {
                        motionEvent.toString();
                        return false;
                    }
                    return true;
                } else if (!z2) {
                    return this.f775d.onAccessibilityHoverEvent(i3.f744b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean e(g gVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        g gVar2 = gVar;
        int i4 = i2;
        Bundle bundle2 = bundle;
        int i5 = bundle2.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle2.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = gVar2.f749g;
        int i7 = gVar2.f750h;
        if (i7 >= 0 && i6 >= 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8 || i5 == 16) {
                            if (z2) {
                                gVar2.f750h = gVar2.f759r.length();
                            } else {
                                gVar2.f750h = 0;
                            }
                        }
                    } else if (z2 && i7 < gVar2.f759r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar2.f759r.substring(gVar2.f750h));
                        if (matcher.find()) {
                            gVar2.f750h += matcher.start(1);
                        } else {
                            gVar2.f750h = gVar2.f759r.length();
                        }
                    } else if (!z2 && gVar2.f750h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar2.f759r.substring(0, gVar2.f750h));
                        if (matcher2.find()) {
                            gVar2.f750h = matcher2.start(1);
                        } else {
                            gVar2.f750h = 0;
                        }
                    }
                } else if (z2 && i7 < gVar2.f759r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar2.f759r.substring(gVar2.f750h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar2.f750h += matcher3.start(1);
                    } else {
                        gVar2.f750h = gVar2.f759r.length();
                    }
                } else if (!z2 && gVar2.f750h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar2.f759r.substring(0, gVar2.f750h));
                    if (matcher4.find()) {
                        gVar2.f750h = matcher4.start(1);
                    }
                }
            } else if (z2 && i7 < gVar2.f759r.length()) {
                gVar2.f750h++;
            } else if (!z2 && (i3 = gVar2.f750h) > 0) {
                gVar2.f750h = i3 - 1;
            }
            if (!z3) {
                gVar2.f749g = gVar2.f750h;
            }
        }
        if (!(i6 == gVar2.f749g && i7 == gVar2.f750h)) {
            String str = gVar2.f759r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent c2 = c(gVar2.f744b, 8192);
            c2.getText().add(str);
            c2.setFromIndex(gVar2.f749g);
            c2.setToIndex(gVar2.f750h);
            c2.setItemCount(str.length());
            g(c2);
        }
        b bVar = this.f773b;
        if (i5 == 1) {
            if (z2) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.a(gVar2, dVar)) {
                    bVar.b(i4, dVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.a(gVar2, dVar2)) {
                    bVar.b(i4, dVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i5 == 2) {
            if (z2) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.a(gVar2, dVar3)) {
                    bVar.b(i4, dVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.a(gVar2, dVar4)) {
                    bVar.b(i4, dVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i5 == 4 || i5 == 8 || i5 == 16) {
            return true;
        }
        return false;
    }

    public final void f(int i2, int i3) {
        if (this.f774c.isEnabled()) {
            g(c(i2, i3));
        }
    }

    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            g gVar = this.f783l;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f744b);
            }
        } else if (i2 != 2) {
            return null;
        }
        g gVar2 = this.f780i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f744b);
        }
        Integer num = this.f781j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(AccessibilityEvent accessibilityEvent) {
        if (this.f774c.isEnabled()) {
            View view = this.f772a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void h(boolean z2) {
        if (this.f788r != z2) {
            this.f788r = z2;
            if (z2) {
                this.f782k |= 1;
            } else {
                this.f782k &= -2;
            }
            ((FlutterJNI) this.f773b.f14b).setAccessibilityFeatures(this.f782k);
        }
    }

    public final boolean i(g gVar) {
        if (gVar.f752j <= 0) {
            return false;
        }
        g gVar2 = this.f780i;
        g gVar3 = null;
        if (gVar2 != null) {
            g gVar4 = gVar2.f732P;
            while (true) {
                if (gVar4 == null) {
                    gVar4 = null;
                    break;
                } else if (gVar4 == gVar) {
                    break;
                } else {
                    gVar4 = gVar4.f732P;
                }
            }
            if (gVar4 != null) {
                return true;
            }
        }
        g gVar5 = this.f780i;
        if (gVar5 == null) {
            return true;
        }
        g gVar6 = gVar5.f732P;
        while (true) {
            if (gVar6 == null) {
                break;
            } else if (gVar6.h(19)) {
                gVar3 = gVar6;
                break;
            } else {
                gVar6 = gVar6.f732P;
            }
        }
        if (gVar3 != null) {
            return false;
        }
        return true;
    }

    public final boolean performAction(int i2, int i3, Bundle bundle) {
        String str;
        if (i2 >= 65536) {
            boolean performAction = this.f775d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f781j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f778g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar != null) {
            d dVar = d.INCREASE;
            d dVar2 = d.DECREASE;
            b bVar = this.f773b;
            switch (i3) {
                case 16:
                    bVar.a(i2, d.TAP);
                    return true;
                case 32:
                    bVar.a(i2, d.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f780i == null) {
                        this.f772a.invalidate();
                    }
                    this.f780i = gVar;
                    bVar.a(i2, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(gVar.f744b));
                    ((e) bVar.f13a).f(hashMap2, (c) null);
                    f(i2, 32768);
                    if (!g.a(gVar, dVar) && !g.a(gVar, dVar2)) {
                        return true;
                    }
                    f(i2, 4);
                    return true;
                case 128:
                    g gVar2 = this.f780i;
                    if (gVar2 != null && gVar2.f744b == i2) {
                        this.f780i = null;
                    }
                    Integer num = this.f781j;
                    if (num != null && num.intValue() == i2) {
                        this.f781j = null;
                    }
                    bVar.a(i2, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                    f(i2, 65536);
                    return true;
                case 256:
                    return e(gVar, i2, bundle, true);
                case 512:
                    return e(gVar, i2, bundle, false);
                case 4096:
                    d dVar3 = d.SCROLL_UP;
                    if (g.a(gVar, dVar3)) {
                        bVar.a(i2, dVar3);
                        return true;
                    }
                    d dVar4 = d.SCROLL_LEFT;
                    if (g.a(gVar, dVar4)) {
                        bVar.a(i2, dVar4);
                        return true;
                    } else if (g.a(gVar, dVar)) {
                        gVar.f759r = gVar.f761t;
                        gVar.f760s = gVar.u;
                        f(i2, 4);
                        bVar.a(i2, dVar);
                        return true;
                    }
                    break;
                case 8192:
                    d dVar5 = d.SCROLL_DOWN;
                    if (g.a(gVar, dVar5)) {
                        bVar.a(i2, dVar5);
                        return true;
                    }
                    d dVar6 = d.SCROLL_RIGHT;
                    if (g.a(gVar, dVar6)) {
                        bVar.a(i2, dVar6);
                        return true;
                    } else if (g.a(gVar, dVar2)) {
                        gVar.f759r = gVar.f762v;
                        gVar.f760s = gVar.f763w;
                        f(i2, 4);
                        bVar.a(i2, dVar2);
                        return true;
                    }
                    break;
                case 16384:
                    bVar.a(i2, d.COPY);
                    return true;
                case 32768:
                    bVar.a(i2, d.PASTE);
                    return true;
                case 65536:
                    bVar.a(i2, d.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") || !bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(gVar.f750h));
                        hashMap3.put("extent", Integer.valueOf(gVar.f750h));
                    } else {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    }
                    bVar.b(i2, d.SET_SELECTION, hashMap3);
                    g gVar3 = (g) hashMap.get(Integer.valueOf(i2));
                    gVar3.f749g = ((Integer) hashMap3.get("base")).intValue();
                    gVar3.f750h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 1048576:
                    bVar.a(i2, d.DISMISS);
                    return true;
                case 2097152:
                    if (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                        str = "";
                    } else {
                        str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    }
                    bVar.b(i2, d.SET_TEXT, str);
                    gVar.f759r = str;
                    gVar.f760s = null;
                    return true;
                case 16908342:
                    bVar.a(i2, d.SHOW_ON_SCREEN);
                    return true;
                default:
                    e eVar = (e) this.f779h.get(Integer.valueOf(i3 - 267386881));
                    if (eVar != null) {
                        bVar.b(i2, d.CUSTOM_ACTION, Integer.valueOf(eVar.f715b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
