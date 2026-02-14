package D;

import B.a;
import L.k;
import L.q;
import M.b;
import M.d;
import M.e;
import M.f;
import M.h;
import M.j;
import M.n;
import M.o;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.platform.c;
import io.flutter.plugin.platform.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class u implements d, f, b, j {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f107b;

    /* renamed from: c  reason: collision with root package name */
    public Object f108c;

    public /* synthetic */ u() {
        this.f107b = 4;
    }

    public static int h(u uVar, int i2) {
        uVar.getClass();
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i2 + " not known to the SensitiveContentChannel.");
    }

    public static boolean k(int i2) {
        if ((48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:73|74) */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r14.a("error", "No such clipboard content format: ".concat(r13), (java.lang.Object) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0167 */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0179 A[Catch:{ JSONException -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0186 A[Catch:{ JSONException -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(B.a r13, L.k r14) {
        /*
            r12 = this;
            java.lang.String r0 = "error"
            java.lang.String r1 = "No such clipboard content format: "
            java.lang.Object r2 = r12.f108c
            B.a r2 = (B.a) r2
            java.lang.Object r3 = r2.f4d
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3
            if (r3 != 0) goto L_0x0010
            goto L_0x032b
        L_0x0010:
            java.lang.Object r3 = r13.f3c
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            int r5 = r3.hashCode()     // Catch:{ JSONException -> 0x002e }
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            switch(r5) {
                case -1501580720: goto L_0x00be;
                case -931781241: goto L_0x00b3;
                case -766342101: goto L_0x00a8;
                case -720677196: goto L_0x009d;
                case -577225884: goto L_0x0093;
                case -548468504: goto L_0x0089;
                case -247230243: goto L_0x007f;
                case -215273374: goto L_0x0075;
                case 241845679: goto L_0x006b;
                case 875995648: goto L_0x005f;
                case 1128339786: goto L_0x0054;
                case 1390477857: goto L_0x0048;
                case 1514180520: goto L_0x003c;
                case 1674312266: goto L_0x0031;
                case 2119655719: goto L_0x0023;
                default: goto L_0x0021;
            }     // Catch:{ JSONException -> 0x002e }
        L_0x0021:
            goto L_0x00c9
        L_0x0023:
            java.lang.String r5 = "SystemChrome.setPreferredOrientations"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = r8
            goto L_0x00ca
        L_0x002e:
            r13 = move-exception
            goto L_0x0316
        L_0x0031:
            java.lang.String r5 = "SystemChrome.setEnabledSystemUIOverlays"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = r7
            goto L_0x00ca
        L_0x003c:
            java.lang.String r5 = "Clipboard.getData"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 11
            goto L_0x00ca
        L_0x0048:
            java.lang.String r5 = "SystemChrome.setSystemUIOverlayStyle"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 8
            goto L_0x00ca
        L_0x0054:
            java.lang.String r5 = "SystemChrome.setEnabledSystemUIMode"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 5
            goto L_0x00ca
        L_0x005f:
            java.lang.String r5 = "Clipboard.hasStrings"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 13
            goto L_0x00ca
        L_0x006b:
            java.lang.String r5 = "SystemChrome.restoreSystemUIOverlays"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 7
            goto L_0x00ca
        L_0x0075:
            java.lang.String r5 = "SystemSound.play"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = r10
            goto L_0x00ca
        L_0x007f:
            java.lang.String r5 = "HapticFeedback.vibrate"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = r9
            goto L_0x00ca
        L_0x0089:
            java.lang.String r5 = "SystemChrome.setApplicationSwitcherDescription"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = r6
            goto L_0x00ca
        L_0x0093:
            java.lang.String r5 = "SystemChrome.setSystemUIChangeListener"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 6
            goto L_0x00ca
        L_0x009d:
            java.lang.String r5 = "Clipboard.setData"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 12
            goto L_0x00ca
        L_0x00a8:
            java.lang.String r5 = "SystemNavigator.pop"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 10
            goto L_0x00ca
        L_0x00b3:
            java.lang.String r5 = "Share.invoke"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 14
            goto L_0x00ca
        L_0x00be:
            java.lang.String r5 = "SystemNavigator.setFrameworkHandlesBack"
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x002e }
            if (r3 == 0) goto L_0x00c9
            r3 = 9
            goto L_0x00ca
        L_0x00c9:
            r3 = -1
        L_0x00ca:
            java.lang.String r5 = "text"
            java.lang.String r11 = "clipboard"
            java.lang.Object r13 = r13.f4d
            switch(r3) {
                case 0: goto L_0x02e8;
                case 1: goto L_0x02ce;
                case 2: goto L_0x02ac;
                case 3: goto L_0x0268;
                case 4: goto L_0x024a;
                case 5: goto L_0x020a;
                case 6: goto L_0x01eb;
                case 7: goto L_0x01db;
                case 8: goto L_0x01b9;
                case 9: goto L_0x019f;
                case 10: goto L_0x018b;
                case 11: goto L_0x015e;
                case 12: goto L_0x013a;
                case 13: goto L_0x0107;
                case 14: goto L_0x00d8;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            r14.b()     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x00d8:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r1.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x002e }
            r1.getClass()     // Catch:{ JSONException -> 0x002e }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ JSONException -> 0x002e }
            r2.<init>()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r3 = "android.intent.action.SEND"
            r2.setAction(r3)     // Catch:{ JSONException -> 0x002e }
            java.lang.String r3 = "text/plain"
            r2.setType(r3)     // Catch:{ JSONException -> 0x002e }
            java.lang.String r3 = "android.intent.extra.TEXT"
            r2.putExtra(r3, r13)     // Catch:{ JSONException -> 0x002e }
            android.content.Intent r13 = android.content.Intent.createChooser(r2, r4)     // Catch:{ JSONException -> 0x002e }
            D.f r1 = r1.f642a     // Catch:{ JSONException -> 0x002e }
            r1.startActivity(r13)     // Catch:{ JSONException -> 0x002e }
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x0107:
            java.lang.Object r13 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r13 = (io.flutter.plugin.platform.c) r13     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r13 = r13.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002e }
            D.f r13 = r13.f642a     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r13 = r13.getSystemService(r11)     // Catch:{ JSONException -> 0x002e }
            android.content.ClipboardManager r13 = (android.content.ClipboardManager) r13     // Catch:{ JSONException -> 0x002e }
            boolean r1 = r13.hasPrimaryClip()     // Catch:{ JSONException -> 0x002e }
            if (r1 != 0) goto L_0x011e
            goto L_0x012b
        L_0x011e:
            android.content.ClipDescription r13 = r13.getPrimaryClipDescription()     // Catch:{ JSONException -> 0x002e }
            if (r13 != 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            java.lang.String r1 = "text/*"
            boolean r10 = r13.hasMimeType(r1)     // Catch:{ JSONException -> 0x002e }
        L_0x012b:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            r13.<init>()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = "value"
            r13.put(r1, r10)     // Catch:{ JSONException -> 0x002e }
            r14.c(r13)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x013a:
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ JSONException -> 0x002e }
            java.lang.String r13 = r13.getString(r5)     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r1.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x002e }
            D.f r1 = r1.f642a     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r1.getSystemService(r11)     // Catch:{ JSONException -> 0x002e }
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1     // Catch:{ JSONException -> 0x002e }
            java.lang.String r2 = "text label?"
            android.content.ClipData r13 = android.content.ClipData.newPlainText(r2, r13)     // Catch:{ JSONException -> 0x002e }
            r1.setPrimaryClip(r13)     // Catch:{ JSONException -> 0x002e }
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x015e:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x002e }
            if (r13 == 0) goto L_0x016e
            L.e r13 = L.e.a(r13)     // Catch:{ NoSuchFieldException -> 0x0167 }
            goto L_0x016f
        L_0x0167:
            java.lang.String r13 = r1.concat(r13)     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
        L_0x016e:
            r13 = r4
        L_0x016f:
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x002e }
            java.lang.CharSequence r13 = r1.g(r13)     // Catch:{ JSONException -> 0x002e }
            if (r13 == 0) goto L_0x0186
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            r1.<init>()     // Catch:{ JSONException -> 0x002e }
            r1.put(r5, r13)     // Catch:{ JSONException -> 0x002e }
            r14.c(r1)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x0186:
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x018b:
            java.lang.Object r13 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r13 = (io.flutter.plugin.platform.c) r13     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r13 = r13.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002e }
            D.f r1 = r13.f644c     // Catch:{ JSONException -> 0x002e }
            D.f r13 = r13.f642a     // Catch:{ JSONException -> 0x002e }
            r13.finish()     // Catch:{ JSONException -> 0x002e }
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x019f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ JSONException -> 0x002e }
            boolean r13 = r13.booleanValue()     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r1 = r1.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x002e }
            D.f r1 = r1.f644c     // Catch:{ JSONException -> 0x002e }
            if (r1 == 0) goto L_0x01b4
            r1.h(r13)     // Catch:{ JSONException -> 0x002e }
        L_0x01b4:
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x01b9:
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            L.f r13 = B.a.h(r2, r13)     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            java.lang.Object r1 = r1.f637c     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            r1.a(r13)     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            r14.c(r4)     // Catch:{ JSONException -> 0x01d1, NoSuchFieldException -> 0x01cf }
            goto L_0x032b
        L_0x01cf:
            r13 = move-exception
            goto L_0x01d2
        L_0x01d1:
            r13 = move-exception
        L_0x01d2:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x01db:
            java.lang.Object r13 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r13 = (io.flutter.plugin.platform.c) r13     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r13 = r13.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002e }
            r13.b()     // Catch:{ JSONException -> 0x002e }
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x01eb:
            java.lang.Object r13 = r2.f4d     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.c r13 = (io.flutter.plugin.platform.c) r13     // Catch:{ JSONException -> 0x002e }
            java.lang.Object r13 = r13.f637c     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.f r13 = (io.flutter.plugin.platform.f) r13     // Catch:{ JSONException -> 0x002e }
            D.f r1 = r13.f642a     // Catch:{ JSONException -> 0x002e }
            android.view.Window r1 = r1.getWindow()     // Catch:{ JSONException -> 0x002e }
            android.view.View r1 = r1.getDecorView()     // Catch:{ JSONException -> 0x002e }
            io.flutter.plugin.platform.e r2 = new io.flutter.plugin.platform.e     // Catch:{ JSONException -> 0x002e }
            r2.<init>(r13, r1)     // Catch:{ JSONException -> 0x002e }
            r1.setOnSystemUiVisibilityChangeListener(r2)     // Catch:{ JSONException -> 0x002e }
            r14.c(r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x020a:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            int r13 = B.a.g(r2, r13)     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            java.lang.Object r1 = r1.f637c     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            r1.getClass()     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            if (r13 != r9) goto L_0x0220
            r13 = 1798(0x706, float:2.52E-42)
            goto L_0x0234
        L_0x0220:
            if (r13 != r8) goto L_0x0225
            r13 = 3846(0xf06, float:5.39E-42)
            goto L_0x0234
        L_0x0225:
            if (r13 != r6) goto L_0x022a
            r13 = 5894(0x1706, float:8.259E-42)
            goto L_0x0234
        L_0x022a:
            if (r13 != r7) goto L_0x0239
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            r2 = 29
            if (r13 < r2) goto L_0x0239
            r13 = 1792(0x700, float:2.511E-42)
        L_0x0234:
            r1.f646e = r13     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            r1.b()     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
        L_0x0239:
            r14.c(r4)     // Catch:{ JSONException -> 0x0240, NoSuchFieldException -> 0x023e }
            goto L_0x032b
        L_0x023e:
            r13 = move-exception
            goto L_0x0241
        L_0x0240:
            r13 = move-exception
        L_0x0241:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x024a:
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x025e, NoSuchFieldException -> 0x025c }
            java.util.ArrayList r13 = B.a.f(r2, r13)     // Catch:{ JSONException -> 0x025e, NoSuchFieldException -> 0x025c }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x025e, NoSuchFieldException -> 0x025c }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x025e, NoSuchFieldException -> 0x025c }
            r1.l(r13)     // Catch:{ JSONException -> 0x025e, NoSuchFieldException -> 0x025c }
            r14.c(r4)     // Catch:{ JSONException -> 0x025e, NoSuchFieldException -> 0x025c }
            goto L_0x032b
        L_0x025c:
            r13 = move-exception
            goto L_0x025f
        L_0x025e:
            r13 = move-exception
        L_0x025f:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x0268:
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ JSONException -> 0x02a2 }
            java.lang.String r1 = "primaryColor"
            int r1 = r13.getInt(r1)     // Catch:{ JSONException -> 0x02a2 }
            if (r1 == 0) goto L_0x0275
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r3
        L_0x0275:
            java.lang.String r3 = "label"
            java.lang.String r13 = r13.getString(r3)     // Catch:{ JSONException -> 0x02a2 }
            java.lang.Object r2 = r2.f4d     // Catch:{ JSONException -> 0x02a2 }
            io.flutter.plugin.platform.c r2 = (io.flutter.plugin.platform.c) r2     // Catch:{ JSONException -> 0x02a2 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x02a2 }
            java.lang.Object r2 = r2.f637c     // Catch:{ JSONException -> 0x02a2 }
            io.flutter.plugin.platform.f r2 = (io.flutter.plugin.platform.f) r2     // Catch:{ JSONException -> 0x02a2 }
            D.f r2 = r2.f642a     // Catch:{ JSONException -> 0x02a2 }
            r5 = 28
            if (r3 >= r5) goto L_0x0294
            android.app.ActivityManager$TaskDescription r3 = new android.app.ActivityManager$TaskDescription     // Catch:{ JSONException -> 0x02a2 }
            r3.<init>(r13, r4, r1)     // Catch:{ JSONException -> 0x02a2 }
            r2.setTaskDescription(r3)     // Catch:{ JSONException -> 0x02a2 }
            goto L_0x029d
        L_0x0294:
            android.app.ActivityManager$TaskDescription r3 = new android.app.ActivityManager$TaskDescription     // Catch:{ JSONException -> 0x02a2 }
            android.app.ActivityManager$TaskDescription r13 = D.C0011l.b(r13, r1)     // Catch:{ JSONException -> 0x02a2 }
            r2.setTaskDescription(r13)     // Catch:{ JSONException -> 0x02a2 }
        L_0x029d:
            r14.c(r4)     // Catch:{ JSONException -> 0x02a2 }
            goto L_0x032b
        L_0x02a2:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x02ac:
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            int r13 = B.a.e(r2, r13)     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            java.lang.Object r1 = r2.f4d     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            java.lang.Object r1 = r1.f637c     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            D.f r1 = r1.f642a     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            r1.setRequestedOrientation(r13)     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            r14.c(r4)     // Catch:{ JSONException -> 0x02c5, NoSuchFieldException -> 0x02c3 }
            goto L_0x032b
        L_0x02c3:
            r13 = move-exception
            goto L_0x02c6
        L_0x02c5:
            r13 = move-exception
        L_0x02c6:
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x02ce:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ NoSuchFieldException -> 0x02df }
            int r13 = D.C0009j.b(r13)     // Catch:{ NoSuchFieldException -> 0x02df }
            java.lang.Object r1 = r2.f4d     // Catch:{ NoSuchFieldException -> 0x02df }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ NoSuchFieldException -> 0x02df }
            r1.m(r13)     // Catch:{ NoSuchFieldException -> 0x02df }
            r14.c(r4)     // Catch:{ NoSuchFieldException -> 0x02df }
            goto L_0x032b
        L_0x02df:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x02e8:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ NoSuchFieldException -> 0x030d }
            int r13 = D.C0009j.c(r13)     // Catch:{ NoSuchFieldException -> 0x030d }
            java.lang.Object r1 = r2.f4d     // Catch:{ NoSuchFieldException -> 0x030d }
            io.flutter.plugin.platform.c r1 = (io.flutter.plugin.platform.c) r1     // Catch:{ NoSuchFieldException -> 0x030d }
            java.lang.Object r1 = r1.f637c     // Catch:{ NoSuchFieldException -> 0x030d }
            io.flutter.plugin.platform.f r1 = (io.flutter.plugin.platform.f) r1     // Catch:{ NoSuchFieldException -> 0x030d }
            if (r13 != r9) goto L_0x0306
            D.f r13 = r1.f642a     // Catch:{ NoSuchFieldException -> 0x030d }
            android.view.Window r13 = r13.getWindow()     // Catch:{ NoSuchFieldException -> 0x030d }
            android.view.View r13 = r13.getDecorView()     // Catch:{ NoSuchFieldException -> 0x030d }
            r13.playSoundEffect(r10)     // Catch:{ NoSuchFieldException -> 0x030d }
            goto L_0x0309
        L_0x0306:
            r1.getClass()     // Catch:{ NoSuchFieldException -> 0x030d }
        L_0x0309:
            r14.c(r4)     // Catch:{ NoSuchFieldException -> 0x030d }
            goto L_0x032b
        L_0x030d:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()     // Catch:{ JSONException -> 0x002e }
            r14.a(r0, r13, r4)     // Catch:{ JSONException -> 0x002e }
            goto L_0x032b
        L_0x0316:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON error: "
            r1.<init>(r2)
            java.lang.String r13 = r13.getMessage()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.a(r0, r13, r4)
        L_0x032b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.u.l(B.a, L.k):void");
    }

    private final void m(a aVar, k kVar) {
        a aVar2 = aVar;
        k kVar2 = kVar;
        boolean z2 = false;
        u uVar = (u) this.f108c;
        if (((c) uVar.f108c) != null) {
            String str = (String) aVar2.f3c;
            str.getClass();
            Object obj = aVar2.f4d;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 751366695:
                    if (str.equals("isSurfaceControlEnabled")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    Map map = (Map) obj;
                    if (map.containsKey("params")) {
                        ByteBuffer.wrap((byte[]) map.get("params"));
                    }
                    try {
                        ((Integer) map.get("id")).getClass();
                        String str2 = (String) map.get("viewType");
                        ((Integer) map.get("direction")).getClass();
                        if (((i) ((c) uVar.f108c).f637c).f647a.f184a.get(str2) == null) {
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                        }
                        throw new ClassCastException();
                    } catch (IllegalStateException e2) {
                        kVar2.a("error", Log.getStackTraceString(e2), (Object) null);
                        return;
                    }
                case 1:
                    int intValue = ((Integer) obj).intValue();
                    try {
                        if (((i) ((c) uVar.f108c).f637c).f653g.get(intValue) == null) {
                            Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                            kVar2.c((Object) null);
                            return;
                        }
                        throw new ClassCastException();
                    } catch (IllegalStateException e3) {
                        kVar2.a("error", Log.getStackTraceString(e3), (Object) null);
                        return;
                    }
                case 2:
                    List list = (List) obj;
                    int intValue2 = ((Integer) list.get(0)).intValue();
                    Number number = (Number) list.get(1);
                    Number number2 = (Number) list.get(2);
                    ((Integer) list.get(3)).getClass();
                    ((Integer) list.get(4)).getClass();
                    list.get(5);
                    list.get(6);
                    ((Integer) list.get(7)).getClass();
                    ((Integer) list.get(8)).getClass();
                    ((Double) list.get(9)).getClass();
                    ((Double) list.get(10)).getClass();
                    ((Integer) list.get(11)).getClass();
                    ((Integer) list.get(12)).getClass();
                    ((Integer) list.get(13)).getClass();
                    ((Integer) list.get(14)).getClass();
                    ((Number) list.get(15)).longValue();
                    try {
                        c cVar = (c) uVar.f108c;
                        cVar.getClass();
                        i iVar = (i) cVar.f637c;
                        float f2 = iVar.f648b.getResources().getDisplayMetrics().density;
                        if (iVar.f653g.get(intValue2) == null) {
                            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                            kVar2.c((Object) null);
                            return;
                        }
                        throw new ClassCastException();
                    } catch (IllegalStateException e4) {
                        kVar2.a("error", Log.getStackTraceString(e4), (Object) null);
                        return;
                    }
                case 3:
                    Map map2 = (Map) obj;
                    int intValue3 = ((Integer) map2.get("id")).intValue();
                    ((Integer) map2.get("direction")).getClass();
                    try {
                        if (((i) ((c) uVar.f108c).f637c).f653g.get(intValue3) == null) {
                            Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                            kVar2.c((Object) null);
                            return;
                        }
                        throw new ClassCastException();
                    } catch (IllegalStateException e5) {
                        kVar2.a("error", Log.getStackTraceString(e5), (Object) null);
                        return;
                    }
                case 4:
                    FlutterJNI flutterJNI = ((i) ((c) uVar.f108c).f637c).f650d;
                    if (flutterJNI != null) {
                        z2 = flutterJNI.IsSurfaceControlEnabled();
                    }
                    kVar2.c(Boolean.valueOf(z2));
                    return;
                case 5:
                    try {
                        ((c) uVar.f108c).f(((Integer) ((Map) obj).get("id")).intValue());
                        kVar2.c((Object) null);
                        return;
                    } catch (IllegalStateException e6) {
                        kVar2.a("error", Log.getStackTraceString(e6), (Object) null);
                        return;
                    }
                default:
                    kVar2.b();
                    return;
            }
        }
    }

    private final void n(a aVar, k kVar) {
        u uVar = (u) this.f108c;
        if (((g) uVar.f108c) != null) {
            String str = (String) aVar.f3c;
            Object obj = aVar.f4d;
            str.getClass();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                kVar.b();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                ((g) uVar.f108c).a((String) arrayList.get(0), (String) arrayList.get(1), kVar);
            } catch (IllegalStateException e2) {
                kVar.a("error", e2.getMessage(), (Object) null);
            }
        }
    }

    public void a(String str, d dVar) {
        ((F.j) this.f108c).e(str, dVar, (B.b) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v45, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v44 */
    /* JADX WARNING: type inference failed for: r6v46 */
    /* JADX WARNING: type inference failed for: r6v47, types: [int] */
    /* JADX WARNING: type inference failed for: r6v50 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x07ed A[Catch:{ IllegalStateException -> 0x0751 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0821 A[Catch:{ IllegalStateException -> 0x0751 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(B.a r42, L.k r43) {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            r2 = r43
            java.lang.String r4 = "height"
            java.lang.String r5 = "width"
            r13 = 3
            java.lang.String r14 = "error"
            r15 = 2
            r11 = 0
            r6 = 0
            r7 = 1
            int r8 = r1.f107b
            switch(r8) {
                case 6: goto L_0x0903;
                case 7: goto L_0x0016;
                case 8: goto L_0x08b7;
                case 9: goto L_0x084e;
                case 10: goto L_0x0016;
                case 11: goto L_0x084a;
                case 12: goto L_0x04b3;
                case 13: goto L_0x04af;
                case 14: goto L_0x0016;
                case 15: goto L_0x0016;
                case 16: goto L_0x0449;
                case 17: goto L_0x0408;
                case 18: goto L_0x0346;
                case 19: goto L_0x0016;
                case 20: goto L_0x02a3;
                case 21: goto L_0x0016;
                case 22: goto L_0x029f;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r8 = "data"
            java.lang.Object r9 = r1.f108c
            B.a r9 = (B.a) r9
            java.lang.Object r10 = r9.f4d
            D.u r10 = (D.u) r10
            if (r10 != 0) goto L_0x0024
            goto L_0x029e
        L_0x0024:
            java.lang.Object r10 = r0.f3c
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            r12 = 26
            java.lang.Object r0 = r0.f4d
            int r21 = r10.hashCode()
            switch(r21) {
                case -1779068172: goto L_0x00a8;
                case -1015421462: goto L_0x009c;
                case -37561188: goto L_0x0090;
                case 270476819: goto L_0x0084;
                case 270803918: goto L_0x0078;
                case 649192816: goto L_0x006c;
                case 1204752139: goto L_0x0060;
                case 1727570905: goto L_0x0054;
                case 1904427655: goto L_0x0047;
                case 2113369584: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            r16 = -1
            goto L_0x00b3
        L_0x003a:
            java.lang.String r3 = "TextInput.requestAutofill"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0043
            goto L_0x0036
        L_0x0043:
            r16 = 9
            goto L_0x00b3
        L_0x0047:
            java.lang.String r3 = "TextInput.clearClient"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0050
            goto L_0x0036
        L_0x0050:
            r16 = 8
            goto L_0x00b3
        L_0x0054:
            java.lang.String r3 = "TextInput.finishAutofillContext"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x005d
            goto L_0x0036
        L_0x005d:
            r16 = 7
            goto L_0x00b3
        L_0x0060:
            java.lang.String r3 = "TextInput.setEditableSizeAndTransform"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0069
            goto L_0x0036
        L_0x0069:
            r16 = 6
            goto L_0x00b3
        L_0x006c:
            java.lang.String r3 = "TextInput.sendAppPrivateCommand"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0075
            goto L_0x0036
        L_0x0075:
            r16 = 5
            goto L_0x00b3
        L_0x0078:
            java.lang.String r3 = "TextInput.show"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0081
            goto L_0x0036
        L_0x0081:
            r16 = 4
            goto L_0x00b3
        L_0x0084:
            java.lang.String r3 = "TextInput.hide"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x008d
            goto L_0x0036
        L_0x008d:
            r16 = r13
            goto L_0x00b3
        L_0x0090:
            java.lang.String r3 = "TextInput.setClient"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0099
            goto L_0x0036
        L_0x0099:
            r16 = r15
            goto L_0x00b3
        L_0x009c:
            java.lang.String r3 = "TextInput.setEditingState"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x00a5
            goto L_0x0036
        L_0x00a5:
            r16 = r7
            goto L_0x00b3
        L_0x00a8:
            java.lang.String r3 = "TextInput.setPlatformViewClient"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x00b1
            goto L_0x0036
        L_0x00b1:
            r16 = r6
        L_0x00b3:
            switch(r16) {
                case 0: goto L_0x0259;
                case 1: goto L_0x023f;
                case 2: goto L_0x021b;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01c6;
                case 5: goto L_0x0189;
                case 6: goto L_0x0151;
                case 7: goto L_0x0128;
                case 8: goto L_0x00fe;
                case 9: goto L_0x00bb;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r2.b()
            goto L_0x029e
        L_0x00bb:
            java.lang.Object r0 = r9.f4d
            D.u r0 = (D.u) r0
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r0.f108c
            io.flutter.plugin.editing.k r0 = (io.flutter.plugin.editing.k) r0
            if (r3 < r12) goto L_0x00f6
            android.view.autofill.AutofillManager r3 = r0.f621c
            if (r3 == 0) goto L_0x00f9
            android.util.SparseArray r3 = r0.f625g
            if (r3 == 0) goto L_0x00f9
            L.o r3 = r0.f624f
            B.e r3 = r3.f310j
            java.lang.Object r3 = r3.f7a
            java.lang.String r3 = (java.lang.String) r3
            int[] r4 = new int[r15]
            android.view.View r5 = r0.f619a
            r5.getLocationOnScreen(r4)
            android.graphics.Rect r8 = new android.graphics.Rect
            android.graphics.Rect r9 = r0.m
            r8.<init>(r9)
            r6 = r4[r6]
            r4 = r4[r7]
            r8.offset(r6, r4)
            android.view.autofill.AutofillManager r0 = r0.f621c
            int r3 = r3.hashCode()
            r0.notifyViewEntered(r5, r3, r8)
            goto L_0x00f9
        L_0x00f6:
            r0.getClass()
        L_0x00f9:
            r2.c(r11)
            goto L_0x029e
        L_0x00fe:
            java.lang.Object r0 = r9.f4d
            D.u r0 = (D.u) r0
            java.lang.Object r0 = r0.f108c
            io.flutter.plugin.editing.k r0 = (io.flutter.plugin.editing.k) r0
            io.flutter.plugin.editing.j r3 = r0.f623e
            int r3 = r3.f617a
            if (r3 != r13) goto L_0x010d
            goto L_0x0123
        L_0x010d:
            io.flutter.plugin.editing.f r3 = r0.f626h
            r3.e(r0)
            r0.c()
            r0.f624f = r11
            r0.d(r11)
            io.flutter.plugin.editing.j r3 = new io.flutter.plugin.editing.j
            r3.<init>(r7, r6)
            r0.f623e = r3
            r0.m = r11
        L_0x0123:
            r2.c(r11)
            goto L_0x029e
        L_0x0128:
            java.lang.Object r3 = r9.f4d
            D.u r3 = (D.u) r3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r12) goto L_0x0149
            java.lang.Object r3 = r3.f108c
            io.flutter.plugin.editing.k r3 = (io.flutter.plugin.editing.k) r3
            android.view.autofill.AutofillManager r3 = r3.f621c
            if (r3 != 0) goto L_0x013f
            goto L_0x014c
        L_0x013f:
            if (r0 == 0) goto L_0x0145
            r3.commit()
            goto L_0x014c
        L_0x0145:
            r3.cancel()
            goto L_0x014c
        L_0x0149:
            r3.getClass()
        L_0x014c:
            r2.c(r11)
            goto L_0x029e
        L_0x0151:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x016f }
            double r16 = r0.getDouble(r5)     // Catch:{ JSONException -> 0x016f }
            double r18 = r0.getDouble(r4)     // Catch:{ JSONException -> 0x016f }
            java.lang.String r3 = "transform"
            org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x016f }
            r3 = 16
            double[] r4 = new double[r3]     // Catch:{ JSONException -> 0x016f }
        L_0x0165:
            if (r6 >= r3) goto L_0x0171
            double r12 = r0.getDouble(r6)     // Catch:{ JSONException -> 0x016f }
            r4[r6] = r12     // Catch:{ JSONException -> 0x016f }
            int r6 = r6 + r7
            goto L_0x0165
        L_0x016f:
            r0 = move-exception
            goto L_0x0180
        L_0x0171:
            java.lang.Object r0 = r9.f4d     // Catch:{ JSONException -> 0x016f }
            r15 = r0
            D.u r15 = (D.u) r15     // Catch:{ JSONException -> 0x016f }
            r20 = r4
            r15.p(r16, r18, r20)     // Catch:{ JSONException -> 0x016f }
            r2.c(r11)     // Catch:{ JSONException -> 0x016f }
            goto L_0x029e
        L_0x0180:
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x029e
        L_0x0189:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r3 = "action"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r0 = r0.getString(r8)     // Catch:{ JSONException -> 0x01a6 }
            if (r0 == 0) goto L_0x01a8
            boolean r4 = r0.isEmpty()     // Catch:{ JSONException -> 0x01a6 }
            if (r4 != 0) goto L_0x01a8
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ JSONException -> 0x01a6 }
            r4.<init>()     // Catch:{ JSONException -> 0x01a6 }
            r4.putString(r8, r0)     // Catch:{ JSONException -> 0x01a6 }
            goto L_0x01a9
        L_0x01a6:
            r0 = move-exception
            goto L_0x01bd
        L_0x01a8:
            r4 = r11
        L_0x01a9:
            java.lang.Object r0 = r9.f4d     // Catch:{ JSONException -> 0x01a6 }
            D.u r0 = (D.u) r0     // Catch:{ JSONException -> 0x01a6 }
            java.lang.Object r0 = r0.f108c     // Catch:{ JSONException -> 0x01a6 }
            io.flutter.plugin.editing.k r0 = (io.flutter.plugin.editing.k) r0     // Catch:{ JSONException -> 0x01a6 }
            android.view.inputmethod.InputMethodManager r5 = r0.f620b     // Catch:{ JSONException -> 0x01a6 }
            android.view.View r0 = r0.f619a     // Catch:{ JSONException -> 0x01a6 }
            r5.sendAppPrivateCommand(r0, r3, r4)     // Catch:{ JSONException -> 0x01a6 }
            r2.c(r11)     // Catch:{ JSONException -> 0x01a6 }
            goto L_0x029e
        L_0x01bd:
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x029e
        L_0x01c6:
            java.lang.Object r0 = r9.f4d
            D.u r0 = (D.u) r0
            java.lang.Object r0 = r0.f108c
            io.flutter.plugin.editing.k r0 = (io.flutter.plugin.editing.k) r0
            android.view.View r3 = r0.f619a
            L.o r4 = r0.f624f
            android.view.inputmethod.InputMethodManager r5 = r0.f620b
            if (r4 == 0) goto L_0x01ea
            L.p r4 = r4.f307g
            int r4 = r4.f313a
            r7 = 11
            if (r4 == r7) goto L_0x01df
            goto L_0x01ea
        L_0x01df:
            r0.c()
            android.os.IBinder r0 = r3.getApplicationWindowToken()
            r5.hideSoftInputFromWindow(r0, r6)
            goto L_0x01f0
        L_0x01ea:
            r3.requestFocus()
            r5.showSoftInput(r3, r6)
        L_0x01f0:
            r2.c(r11)
            goto L_0x029e
        L_0x01f5:
            java.lang.Object r0 = r9.f4d
            D.u r0 = (D.u) r0
            java.lang.Object r0 = r0.f108c
            io.flutter.plugin.editing.k r0 = (io.flutter.plugin.editing.k) r0
            io.flutter.plugin.editing.j r3 = r0.f623e
            int r3 = r3.f617a
            r4 = 4
            if (r3 != r4) goto L_0x0208
            r0.c()
            goto L_0x0216
        L_0x0208:
            r0.c()
            android.view.View r3 = r0.f619a
            android.os.IBinder r3 = r3.getApplicationWindowToken()
            android.view.inputmethod.InputMethodManager r0 = r0.f620b
            r0.hideSoftInputFromWindow(r3, r6)
        L_0x0216:
            r2.c(r11)
            goto L_0x029e
        L_0x021b:
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            int r3 = r0.getInt(r6)     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            java.lang.Object r4 = r9.f4d     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            D.u r4 = (D.u) r4     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            L.o r0 = L.o.a(r0)     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            r4.o(r3, r0)     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            r2.c(r11)     // Catch:{ JSONException -> 0x0236, NoSuchFieldException -> 0x0234 }
            goto L_0x029e
        L_0x0234:
            r0 = move-exception
            goto L_0x0237
        L_0x0236:
            r0 = move-exception
        L_0x0237:
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x029e
        L_0x023f:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0250 }
            java.lang.Object r3 = r9.f4d     // Catch:{ JSONException -> 0x0250 }
            D.u r3 = (D.u) r3     // Catch:{ JSONException -> 0x0250 }
            L.q r0 = L.q.a(r0)     // Catch:{ JSONException -> 0x0250 }
            r3.q(r0)     // Catch:{ JSONException -> 0x0250 }
            r2.c(r11)     // Catch:{ JSONException -> 0x0250 }
            goto L_0x029e
        L_0x0250:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x029e
        L_0x0259:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0296 }
            java.lang.String r3 = "platformViewId"
            int r3 = r0.getInt(r3)     // Catch:{ JSONException -> 0x0296 }
            java.lang.String r4 = "usesVirtualDisplay"
            boolean r0 = r0.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x0296 }
            java.lang.Object r4 = r9.f4d     // Catch:{ JSONException -> 0x0296 }
            D.u r4 = (D.u) r4     // Catch:{ JSONException -> 0x0296 }
            java.lang.Object r4 = r4.f108c     // Catch:{ JSONException -> 0x0296 }
            io.flutter.plugin.editing.k r4 = (io.flutter.plugin.editing.k) r4     // Catch:{ JSONException -> 0x0296 }
            if (r0 == 0) goto L_0x0285
            android.view.View r0 = r4.f619a     // Catch:{ JSONException -> 0x0296 }
            r0.requestFocus()     // Catch:{ JSONException -> 0x0296 }
            io.flutter.plugin.editing.j r5 = new io.flutter.plugin.editing.j     // Catch:{ JSONException -> 0x0296 }
            r5.<init>(r13, r3)     // Catch:{ JSONException -> 0x0296 }
            r4.f623e = r5     // Catch:{ JSONException -> 0x0296 }
            android.view.inputmethod.InputMethodManager r3 = r4.f620b     // Catch:{ JSONException -> 0x0296 }
            r3.restartInput(r0)     // Catch:{ JSONException -> 0x0296 }
            r4.f627i = r6     // Catch:{ JSONException -> 0x0296 }
            goto L_0x0292
        L_0x0285:
            r4.getClass()     // Catch:{ JSONException -> 0x0296 }
            io.flutter.plugin.editing.j r0 = new io.flutter.plugin.editing.j     // Catch:{ JSONException -> 0x0296 }
            r5 = 4
            r0.<init>(r5, r3)     // Catch:{ JSONException -> 0x0296 }
            r4.f623e = r0     // Catch:{ JSONException -> 0x0296 }
            r4.f628j = r11     // Catch:{ JSONException -> 0x0296 }
        L_0x0292:
            r2.c(r11)     // Catch:{ JSONException -> 0x0296 }
            goto L_0x029e
        L_0x0296:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
        L_0x029e:
            return
        L_0x029f:
            r41.n(r42, r43)
            return
        L_0x02a3:
            java.lang.Object r3 = r1.f108c
            D.u r3 = (D.u) r3
            java.lang.Object r4 = r3.f108c
            Q.a r4 = (Q.a) r4
            if (r4 != 0) goto L_0x02af
            goto L_0x0345
        L_0x02af:
            java.lang.Object r4 = r0.f3c
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            int r5 = r4.hashCode()
            switch(r5) {
                case -1937987631: goto L_0x02d8;
                case 598223325: goto L_0x02cc;
                case 1615625817: goto L_0x02c0;
                default: goto L_0x02bd;
            }
        L_0x02bd:
            r16 = -1
            goto L_0x02e3
        L_0x02c0:
            java.lang.String r5 = "SensitiveContent.isSupported"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x02c9
            goto L_0x02bd
        L_0x02c9:
            r16 = r15
            goto L_0x02e3
        L_0x02cc:
            java.lang.String r5 = "SensitiveContent.setContentSensitivity"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x02d5
            goto L_0x02bd
        L_0x02d5:
            r16 = r7
            goto L_0x02e3
        L_0x02d8:
            java.lang.String r5 = "SensitiveContent.getContentSensitivity"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x02e1
            goto L_0x02bd
        L_0x02e1:
            r16 = r6
        L_0x02e3:
            switch(r16) {
                case 0: goto L_0x031f;
                case 1: goto L_0x0300;
                case 2: goto L_0x02ea;
                default: goto L_0x02e6;
            }
        L_0x02e6:
            r2.b()
            goto L_0x0345
        L_0x02ea:
            java.lang.Object r0 = r3.f108c
            Q.a r0 = (Q.a) r0
            r0.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r0 < r3) goto L_0x02f8
            r6 = r7
        L_0x02f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.c(r0)
            goto L_0x0345
        L_0x0300:
            java.lang.Object r0 = r0.f4d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r4 = r3.f108c     // Catch:{ IllegalStateException -> 0x0316, IllegalArgumentException -> 0x0314 }
            Q.a r4 = (Q.a) r4     // Catch:{ IllegalStateException -> 0x0316, IllegalArgumentException -> 0x0314 }
            int r0 = h(r3, r0)     // Catch:{ IllegalStateException -> 0x0316, IllegalArgumentException -> 0x0314 }
            r4.b(r0)     // Catch:{ IllegalStateException -> 0x0316, IllegalArgumentException -> 0x0314 }
            goto L_0x0345
        L_0x0314:
            r0 = move-exception
            goto L_0x0317
        L_0x0316:
            r0 = move-exception
        L_0x0317:
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x0345
        L_0x031f:
            java.lang.Object r0 = r3.f108c     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x033b }
            Q.a r0 = (Q.a) r0     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x033b }
            int r0 = r0.a()     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x033b }
            if (r0 == 0) goto L_0x0332
            if (r0 == r7) goto L_0x0330
            if (r0 == r15) goto L_0x032e
            goto L_0x0333
        L_0x032e:
            r13 = r15
            goto L_0x0333
        L_0x0330:
            r13 = r7
            goto L_0x0333
        L_0x0332:
            r13 = r6
        L_0x0333:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x033b }
            r2.c(r0)     // Catch:{ IllegalStateException -> 0x033d, IllegalArgumentException -> 0x033b }
            goto L_0x0345
        L_0x033b:
            r0 = move-exception
            goto L_0x033e
        L_0x033d:
            r0 = move-exception
        L_0x033e:
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
        L_0x0345:
            return
        L_0x0346:
            java.lang.Object r3 = r1.f108c
            D.u r3 = (D.u) r3
            java.lang.Object r4 = r3.f108c
            B.a r4 = (B.a) r4
            if (r4 != 0) goto L_0x0352
            goto L_0x0407
        L_0x0352:
            java.lang.Object r0 = r0.f3c
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r4 = 34
            int r5 = r0.hashCode()
            switch(r5) {
                case -705821951: goto L_0x037d;
                case 1759284829: goto L_0x0371;
                case 2119738044: goto L_0x0365;
                default: goto L_0x0362;
            }
        L_0x0362:
            r16 = -1
            goto L_0x0388
        L_0x0365:
            java.lang.String r5 = "Scribe.isStylusHandwritingAvailable"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x036e
            goto L_0x0362
        L_0x036e:
            r16 = r15
            goto L_0x0388
        L_0x0371:
            java.lang.String r5 = "Scribe.startStylusHandwriting"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x037a
            goto L_0x0362
        L_0x037a:
            r16 = r7
            goto L_0x0388
        L_0x037d:
            java.lang.String r5 = "Scribe.isFeatureAvailable"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0386
            goto L_0x0362
        L_0x0386:
            r16 = r6
        L_0x0388:
            switch(r16) {
                case 0: goto L_0x03e0;
                case 1: goto L_0x03b8;
                case 2: goto L_0x0390;
                default: goto L_0x038b;
            }
        L_0x038b:
            r2.b()
            goto L_0x0407
        L_0x0390:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r4) goto L_0x039b
            java.lang.String r0 = "Requires API level 34 or higher."
            r2.a(r14, r0, r11)
            goto L_0x0407
        L_0x039b:
            java.lang.Object r0 = r3.f108c     // Catch:{ IllegalStateException -> 0x03af }
            B.a r0 = (B.a) r0     // Catch:{ IllegalStateException -> 0x03af }
            java.lang.Object r0 = r0.f3c     // Catch:{ IllegalStateException -> 0x03af }
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ IllegalStateException -> 0x03af }
            boolean r0 = r0.isStylusHandwritingAvailable()     // Catch:{ IllegalStateException -> 0x03af }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x03af }
            r2.c(r0)     // Catch:{ IllegalStateException -> 0x03af }
            goto L_0x0407
        L_0x03af:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x0407
        L_0x03b8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r0 >= r4) goto L_0x03c4
            java.lang.String r0 = "Requires API level 33 or higher."
            r2.a(r14, r0, r11)
            goto L_0x0407
        L_0x03c4:
            java.lang.Object r0 = r3.f108c     // Catch:{ IllegalStateException -> 0x03d7 }
            B.a r0 = (B.a) r0     // Catch:{ IllegalStateException -> 0x03d7 }
            java.lang.Object r3 = r0.f3c     // Catch:{ IllegalStateException -> 0x03d7 }
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3     // Catch:{ IllegalStateException -> 0x03d7 }
            java.lang.Object r0 = r0.f4d     // Catch:{ IllegalStateException -> 0x03d7 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalStateException -> 0x03d7 }
            r3.startStylusHandwriting(r0)     // Catch:{ IllegalStateException -> 0x03d7 }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x03d7 }
            goto L_0x0407
        L_0x03d7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x0407
        L_0x03e0:
            java.lang.Object r0 = r3.f108c     // Catch:{ IllegalStateException -> 0x03ff }
            B.a r0 = (B.a) r0     // Catch:{ IllegalStateException -> 0x03ff }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x03ff }
            if (r3 < r4) goto L_0x03f4
            java.lang.Object r0 = r0.f3c     // Catch:{ IllegalStateException -> 0x03ff }
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ IllegalStateException -> 0x03ff }
            boolean r0 = r0.isStylusHandwritingAvailable()     // Catch:{ IllegalStateException -> 0x03ff }
            if (r0 == 0) goto L_0x03f7
            r6 = r7
            goto L_0x03f7
        L_0x03f4:
            r0.getClass()     // Catch:{ IllegalStateException -> 0x03ff }
        L_0x03f7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IllegalStateException -> 0x03ff }
            r2.c(r0)     // Catch:{ IllegalStateException -> 0x03ff }
            goto L_0x0407
        L_0x03ff:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
        L_0x0407:
            return
        L_0x0408:
            java.lang.Object r3 = r0.f3c
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.Object r4 = r1.f108c
            L.l r4 = (L.l) r4
            java.lang.String r5 = "get"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0431
            java.lang.String r5 = "put"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0427
            r2.b()
            goto L_0x0448
        L_0x0427:
            java.lang.Object r0 = r0.f4d
            byte[] r0 = (byte[]) r0
            r4.f291b = r0
            r2.c(r11)
            goto L_0x0448
        L_0x0431:
            r4.f295f = r7
            boolean r0 = r4.f294e
            if (r0 != 0) goto L_0x043f
            boolean r0 = r4.f290a
            if (r0 != 0) goto L_0x043c
            goto L_0x043f
        L_0x043c:
            r4.f293d = r2
            goto L_0x0448
        L_0x043f:
            byte[] r0 = r4.f291b
            java.util.HashMap r0 = L.l.a(r0)
            r2.c(r0)
        L_0x0448:
            return
        L_0x0449:
            java.lang.Object r3 = r1.f108c
            B.a r3 = (B.a) r3
            java.lang.Object r4 = r3.f4d
            P.a r4 = (P.a) r4
            if (r4 != 0) goto L_0x0454
            goto L_0x04ae
        L_0x0454:
            java.lang.Object r4 = r0.f3c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.f4d
            r4.getClass()
            java.lang.String r5 = "ProcessText.processTextAction"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0486
            java.lang.String r0 = "ProcessText.queryTextActions"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0471
            r2.b()
            goto L_0x04ae
        L_0x0471:
            java.lang.Object r0 = r3.f4d     // Catch:{ IllegalStateException -> 0x047d }
            P.a r0 = (P.a) r0     // Catch:{ IllegalStateException -> 0x047d }
            java.util.HashMap r0 = r0.d()     // Catch:{ IllegalStateException -> 0x047d }
            r2.c(r0)     // Catch:{ IllegalStateException -> 0x047d }
            goto L_0x04ae
        L_0x047d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
            goto L_0x04ae
        L_0x0486:
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.Object r4 = r0.get(r6)     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.Object r5 = r0.get(r7)     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IllegalStateException -> 0x04a6 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x04a6 }
            java.lang.Object r3 = r3.f4d     // Catch:{ IllegalStateException -> 0x04a6 }
            P.a r3 = (P.a) r3     // Catch:{ IllegalStateException -> 0x04a6 }
            r3.c(r4, r5, r0, r2)     // Catch:{ IllegalStateException -> 0x04a6 }
            goto L_0x04ae
        L_0x04a6:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
        L_0x04ae:
            return
        L_0x04af:
            r41.m(r42, r43)
            return
        L_0x04b3:
            java.lang.Object r3 = r1.f108c
            D.u r3 = (D.u) r3
            java.lang.Object r8 = r3.f108c
            io.flutter.plugin.platform.c r8 = (io.flutter.plugin.platform.c) r8
            if (r8 != 0) goto L_0x04bf
            goto L_0x0849
        L_0x04bf:
            java.lang.Object r8 = r0.f3c
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            java.lang.String r9 = "left"
            java.lang.String r10 = "top"
            java.lang.String r12 = "direction"
            java.lang.String r13 = "id"
            java.lang.Object r0 = r0.f4d
            int r22 = r8.hashCode()
            switch(r22) {
                case -1352294148: goto L_0x052f;
                case -1019779949: goto L_0x0523;
                case -934437708: goto L_0x0517;
                case -756050293: goto L_0x050b;
                case -308988850: goto L_0x04ff;
                case 110550847: goto L_0x04f3;
                case 576796989: goto L_0x04e7;
                case 1671767583: goto L_0x04db;
                default: goto L_0x04d7;
            }
        L_0x04d7:
            r16 = -1
            goto L_0x053a
        L_0x04db:
            java.lang.String r15 = "dispose"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x04e4
            goto L_0x04d7
        L_0x04e4:
            r16 = 7
            goto L_0x053a
        L_0x04e7:
            java.lang.String r15 = "setDirection"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x04f0
            goto L_0x04d7
        L_0x04f0:
            r16 = 6
            goto L_0x053a
        L_0x04f3:
            java.lang.String r15 = "touch"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x04fc
            goto L_0x04d7
        L_0x04fc:
            r16 = 5
            goto L_0x053a
        L_0x04ff:
            java.lang.String r15 = "synchronizeToNativeViewHierarchy"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0508
            goto L_0x04d7
        L_0x0508:
            r16 = 4
            goto L_0x053a
        L_0x050b:
            java.lang.String r15 = "clearFocus"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0514
            goto L_0x04d7
        L_0x0514:
            r16 = 3
            goto L_0x053a
        L_0x0517:
            java.lang.String r15 = "resize"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0520
            goto L_0x04d7
        L_0x0520:
            r16 = 2
            goto L_0x053a
        L_0x0523:
            java.lang.String r15 = "offset"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x052c
            goto L_0x04d7
        L_0x052c:
            r16 = r7
            goto L_0x053a
        L_0x052f:
            java.lang.String r15 = "create"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0538
            goto L_0x04d7
        L_0x0538:
            r16 = r6
        L_0x053a:
            switch(r16) {
                case 0: goto L_0x0705;
                case 1: goto L_0x06ce;
                case 2: goto L_0x0696;
                case 3: goto L_0x067a;
                case 4: goto L_0x065b;
                case 5: goto L_0x0590;
                case 6: goto L_0x0564;
                case 7: goto L_0x0542;
                default: goto L_0x053d;
            }
        L_0x053d:
            r2.b()
            goto L_0x0849
        L_0x0542:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x055a }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x055a }
            r3.f(r0)     // Catch:{ IllegalStateException -> 0x055a }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x055a }
            goto L_0x0849
        L_0x055a:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x0564:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r0.get(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x0586 }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x0586 }
            r3.k(r4, r0)     // Catch:{ IllegalStateException -> 0x0586 }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x0586 }
            goto L_0x0849
        L_0x0586:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x0590:
            java.util.List r0 = (java.util.List) r0
            L.j r23 = new L.j
            java.lang.Object r4 = r0.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r24 = r4.intValue()
            java.lang.Object r4 = r0.get(r7)
            r25 = r4
            java.lang.Number r25 = (java.lang.Number) r25
            r8 = 2
            java.lang.Object r4 = r0.get(r8)
            r26 = r4
            java.lang.Number r26 = (java.lang.Number) r26
            r4 = 3
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r27 = r4.intValue()
            r4 = 4
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r28 = r4.intValue()
            r4 = 5
            java.lang.Object r29 = r0.get(r4)
            r4 = 6
            java.lang.Object r30 = r0.get(r4)
            r4 = 7
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r31 = r4.intValue()
            r4 = 8
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r32 = r4.intValue()
            r4 = 9
            java.lang.Object r4 = r0.get(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            float r4 = (float) r4
            r5 = 10
            java.lang.Object r5 = r0.get(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            float r5 = (float) r5
            r7 = 11
            java.lang.Object r6 = r0.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r35 = r6.intValue()
            r6 = 12
            java.lang.Object r6 = r0.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r36 = r6.intValue()
            r6 = 13
            java.lang.Object r6 = r0.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r37 = r6.intValue()
            r6 = 14
            java.lang.Object r6 = r0.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r38 = r6.intValue()
            r6 = 15
            java.lang.Object r0 = r0.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            long r39 = r0.longValue()
            r33 = r4
            r34 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0 = r23
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x0651 }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x0651 }
            r3.i(r0)     // Catch:{ IllegalStateException -> 0x0651 }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x0651 }
            goto L_0x0849
        L_0x0651:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x065b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x0670 }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x0670 }
            java.lang.Object r3 = r3.f637c     // Catch:{ IllegalStateException -> 0x0670 }
            io.flutter.plugin.platform.j r3 = (io.flutter.plugin.platform.j) r3     // Catch:{ IllegalStateException -> 0x0670 }
            r3.f674q = r0     // Catch:{ IllegalStateException -> 0x0670 }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x0670 }
            goto L_0x0849
        L_0x0670:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x067a:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x068c }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x068c }
            r3.d(r0)     // Catch:{ IllegalStateException -> 0x068c }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x068c }
            goto L_0x0849
        L_0x068c:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x0696:
            java.util.Map r0 = (java.util.Map) r0
            L.i r15 = new L.i
            java.lang.Object r6 = r0.get(r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r16 = r6.intValue()
            java.lang.Object r5 = r0.get(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r17 = r5.doubleValue()
            java.lang.Object r0 = r0.get(r4)
            java.lang.Double r0 = (java.lang.Double) r0
            double r19 = r0.doubleValue()
            r15.<init>(r16, r17, r19)
            java.lang.Object r0 = r3.f108c     // Catch:{ IllegalStateException -> 0x06c4 }
            io.flutter.plugin.platform.c r0 = (io.flutter.plugin.platform.c) r0     // Catch:{ IllegalStateException -> 0x06c4 }
            r0.j(r15)     // Catch:{ IllegalStateException -> 0x06c4 }
            goto L_0x0849
        L_0x06c4:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x06ce:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x06fb }
            r15 = r3
            io.flutter.plugin.platform.c r15 = (io.flutter.plugin.platform.c) r15     // Catch:{ IllegalStateException -> 0x06fb }
            java.lang.Object r3 = r0.get(r13)     // Catch:{ IllegalStateException -> 0x06fb }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalStateException -> 0x06fb }
            int r16 = r3.intValue()     // Catch:{ IllegalStateException -> 0x06fb }
            java.lang.Object r3 = r0.get(r10)     // Catch:{ IllegalStateException -> 0x06fb }
            java.lang.Double r3 = (java.lang.Double) r3     // Catch:{ IllegalStateException -> 0x06fb }
            double r17 = r3.doubleValue()     // Catch:{ IllegalStateException -> 0x06fb }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IllegalStateException -> 0x06fb }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ IllegalStateException -> 0x06fb }
            double r19 = r0.doubleValue()     // Catch:{ IllegalStateException -> 0x06fb }
            r15.h(r16, r17, r19)     // Catch:{ IllegalStateException -> 0x06fb }
            r2.c(r11)     // Catch:{ IllegalStateException -> 0x06fb }
            goto L_0x0849
        L_0x06fb:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
            goto L_0x0849
        L_0x0705:
            r8 = 2
            java.lang.String r15 = "hybridFallback"
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r6 = "hybrid"
            boolean r17 = r0.containsKey(r6)
            if (r17 == 0) goto L_0x0720
            java.lang.Object r6 = r0.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0720
            r6 = r7
            goto L_0x0721
        L_0x0720:
            r6 = 0
        L_0x0721:
            java.lang.String r8 = "params"
            boolean r17 = r0.containsKey(r8)
            if (r17 == 0) goto L_0x0736
            java.lang.Object r8 = r0.get(r8)
            byte[] r8 = (byte[]) r8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            r36 = r8
            goto L_0x0738
        L_0x0736:
            r36 = r11
        L_0x0738:
            java.lang.String r8 = "viewType"
            if (r6 != 0) goto L_0x07be
            boolean r6 = r0.containsKey(r15)     // Catch:{ IllegalStateException -> 0x0751 }
            if (r6 == 0) goto L_0x0754
            java.lang.Object r6 = r0.get(r15)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ IllegalStateException -> 0x0751 }
            boolean r6 = r6.booleanValue()     // Catch:{ IllegalStateException -> 0x0751 }
            if (r6 == 0) goto L_0x0754
            r35 = 2
            goto L_0x0756
        L_0x0751:
            r0 = move-exception
            goto L_0x0842
        L_0x0754:
            r35 = r7
        L_0x0756:
            L.h r23 = new L.h     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r6 = r0.get(r13)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ IllegalStateException -> 0x0751 }
            int r24 = r6.intValue()     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r6 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x0751 }
            r25 = r6
            java.lang.String r25 = (java.lang.String) r25     // Catch:{ IllegalStateException -> 0x0751 }
            boolean r6 = r0.containsKey(r10)     // Catch:{ IllegalStateException -> 0x0751 }
            r7 = 0
            if (r6 == 0) goto L_0x077f
            java.lang.Object r6 = r0.get(r10)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ IllegalStateException -> 0x0751 }
            double r15 = r6.doubleValue()     // Catch:{ IllegalStateException -> 0x0751 }
            r26 = r15
            goto L_0x0781
        L_0x077f:
            r26 = r7
        L_0x0781:
            boolean r6 = r0.containsKey(r9)     // Catch:{ IllegalStateException -> 0x0751 }
            if (r6 == 0) goto L_0x0791
            java.lang.Object r6 = r0.get(r9)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ IllegalStateException -> 0x0751 }
            double r7 = r6.doubleValue()     // Catch:{ IllegalStateException -> 0x0751 }
        L_0x0791:
            r28 = r7
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Double r5 = (java.lang.Double) r5     // Catch:{ IllegalStateException -> 0x0751 }
            double r30 = r5.doubleValue()     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Double r4 = (java.lang.Double) r4     // Catch:{ IllegalStateException -> 0x0751 }
            double r32 = r4.doubleValue()     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x0751 }
            int r34 = r0.intValue()     // Catch:{ IllegalStateException -> 0x0751 }
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r35, r36)     // Catch:{ IllegalStateException -> 0x0751 }
            r0 = r23
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x0751 }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x0751 }
            r3.e(r0)     // Catch:{ IllegalStateException -> 0x0751 }
            throw r11     // Catch:{ IllegalStateException -> 0x0751 }
        L_0x07be:
            java.lang.Object r4 = r0.get(r13)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalStateException -> 0x0751 }
            int r4 = r4.intValue()     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r5 = r0.get(r8)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x0751 }
            int r0 = r0.intValue()     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r3 = r3.f108c     // Catch:{ IllegalStateException -> 0x0751 }
            io.flutter.plugin.platform.c r3 = (io.flutter.plugin.platform.c) r3     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r3 = r3.f637c     // Catch:{ IllegalStateException -> 0x0751 }
            io.flutter.plugin.platform.j r3 = (io.flutter.plugin.platform.j) r3     // Catch:{ IllegalStateException -> 0x0751 }
            r3.getClass()     // Catch:{ IllegalStateException -> 0x0751 }
            if (r0 == 0) goto L_0x07ea
            if (r0 != r7) goto L_0x07e8
            goto L_0x07ea
        L_0x07e8:
            r6 = 0
            goto L_0x07eb
        L_0x07ea:
            r6 = r7
        L_0x07eb:
            if (r6 == 0) goto L_0x0821
            io.flutter.embedding.engine.FlutterJNI r0 = r3.f662d     // Catch:{ IllegalStateException -> 0x0751 }
            boolean r0 = r0.IsSurfaceControlEnabled()     // Catch:{ IllegalStateException -> 0x0751 }
            if (r0 != 0) goto L_0x0819
            E.i r0 = r3.f659a     // Catch:{ IllegalStateException -> 0x0751 }
            java.util.HashMap r0 = r0.f184a     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ IllegalStateException -> 0x0751 }
            if (r0 != 0) goto L_0x0813
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r4 = "Trying to create a platform view of unregistered type: "
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x0751 }
            r3.append(r5)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalStateException -> 0x0751 }
            r0.<init>(r3)     // Catch:{ IllegalStateException -> 0x0751 }
            throw r0     // Catch:{ IllegalStateException -> 0x0751 }
        L_0x0813:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ IllegalStateException -> 0x0751 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0751 }
            throw r0     // Catch:{ IllegalStateException -> 0x0751 }
        L_0x0819:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r3 = "Trying to create a Hybrid Composition view with HC++ enabled."
            r0.<init>(r3)     // Catch:{ IllegalStateException -> 0x0751 }
            throw r0     // Catch:{ IllegalStateException -> 0x0751 }
        L_0x0821:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r6 = "Trying to create a view with unknown direction value: "
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0751 }
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r0 = "(view id: "
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0751 }
            r5.append(r4)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0751 }
            java.lang.String r0 = r5.toString()     // Catch:{ IllegalStateException -> 0x0751 }
            r3.<init>(r0)     // Catch:{ IllegalStateException -> 0x0751 }
            throw r3     // Catch:{ IllegalStateException -> 0x0751 }
        L_0x0842:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.a(r14, r0, r11)
        L_0x0849:
            return
        L_0x084a:
            r41.l(r42, r43)
            return
        L_0x084e:
            java.lang.String r3 = "Error when setting cursors: "
            java.lang.Object r4 = r1.f108c
            D.u r4 = (D.u) r4
            java.lang.Object r5 = r4.f108c
            D.u r5 = (D.u) r5
            if (r5 != 0) goto L_0x085b
            goto L_0x08b6
        L_0x085b:
            java.lang.Object r5 = r0.f3c
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.hashCode()     // Catch:{ Exception -> 0x088a }
            r7 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
            if (r6 == r7) goto L_0x0869
            goto L_0x08b6
        L_0x0869:
            java.lang.String r6 = "activateSystemCursor"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x088a }
            if (r5 == 0) goto L_0x08b6
            java.lang.Object r0 = r0.f4d     // Catch:{ Exception -> 0x088a }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x088a }
            java.lang.String r5 = "kind"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x088a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x088a }
            java.lang.Object r4 = r4.f108c     // Catch:{ Exception -> 0x088c }
            D.u r4 = (D.u) r4     // Catch:{ Exception -> 0x088c }
            r4.i(r0)     // Catch:{ Exception -> 0x088c }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x088a }
            r2.c(r0)     // Catch:{ Exception -> 0x088a }
            goto L_0x08b6
        L_0x088a:
            r0 = move-exception
            goto L_0x08a1
        L_0x088c:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x088a }
            r4.<init>(r3)     // Catch:{ Exception -> 0x088a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x088a }
            r4.append(r0)     // Catch:{ Exception -> 0x088a }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x088a }
            r2.a(r14, r0, r11)     // Catch:{ Exception -> 0x088a }
            goto L_0x08b6
        L_0x08a1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unhandled error: "
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.a(r14, r0, r11)
        L_0x08b6:
            return
        L_0x08b7:
            java.lang.String r3 = "locale"
            java.lang.Object r4 = r1.f108c
            B.a r4 = (B.a) r4
            java.lang.Object r5 = r4.f4d
            D.u r5 = (D.u) r5
            if (r5 != 0) goto L_0x08c4
            goto L_0x0902
        L_0x08c4:
            java.lang.Object r5 = r0.f3c
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r6 = "Localization.getStringResource"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x08d7
            r2.b()
            goto L_0x0902
        L_0x08d7:
            java.lang.Object r0 = r0.f4d
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r5 = "key"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x08ec }
            boolean r6 = r0.has(r3)     // Catch:{ JSONException -> 0x08ec }
            if (r6 == 0) goto L_0x08ee
            java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x08ec }
            goto L_0x08ef
        L_0x08ec:
            r0 = move-exception
            goto L_0x08fb
        L_0x08ee:
            r0 = r11
        L_0x08ef:
            java.lang.Object r3 = r4.f4d     // Catch:{ JSONException -> 0x08ec }
            D.u r3 = (D.u) r3     // Catch:{ JSONException -> 0x08ec }
            java.lang.String r0 = r3.j(r5, r0)     // Catch:{ JSONException -> 0x08ec }
            r2.c(r0)     // Catch:{ JSONException -> 0x08ec }
            goto L_0x0902
        L_0x08fb:
            java.lang.String r0 = r0.getMessage()
            r2.a(r14, r0, r11)
        L_0x0902:
            return
        L_0x0903:
            java.lang.Object r0 = r1.f108c
            B.b r0 = (B.b) r0
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.u.b(B.a, L.k):void");
    }

    public void c(ByteBuffer byteBuffer, F.g gVar) {
        o.f333b.getClass();
        o.a(byteBuffer);
        ((F.b) this.f108c).getClass();
    }

    public B.b d(h hVar) {
        return ((F.j) this.f108c).d(hVar);
    }

    public void e(String str, d dVar, B.b bVar) {
        ((F.j) this.f108c).e(str, dVar, bVar);
    }

    public void f(String str, ByteBuffer byteBuffer, e eVar) {
        ((F.j) this.f108c).f(str, byteBuffer, eVar);
    }

    public void g(Object obj, a aVar) {
        C.b bVar = (C.b) this.f108c;
        if (((io.flutter.view.a) bVar.f15c) == null) {
            aVar.d((Object) null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        HashMap hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals("tooltip")) {
                    c2 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals("announce")) {
                    c2 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals("tap")) {
                    c2 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c2 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals("longPress")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) bVar.f15c;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.k kVar = (io.flutter.view.k) aVar2.f688a;
                        AccessibilityEvent c3 = kVar.c(0, 32);
                        c3.getText().add(str2);
                        kVar.g(c3);
                        break;
                    } else {
                        aVar2.getClass();
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) bVar.f15c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar3.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.k) aVar3.f688a).f772a.announceForAccessibility(str3);
                    break;
                }
                break;
            case 2:
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((io.flutter.view.k) ((io.flutter.view.a) bVar.f15c).f688a).f(num.intValue(), 1);
                    break;
                }
                break;
            case 3:
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((io.flutter.view.k) ((io.flutter.view.a) bVar.f15c).f688a).f(num2.intValue(), 8);
                    break;
                }
                break;
            case 4:
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((io.flutter.view.k) ((io.flutter.view.a) bVar.f15c).f688a).f(num3.intValue(), 2);
                    break;
                }
                break;
        }
        aVar.d((Object) null);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [D.K, java.util.AbstractMap, java.util.HashMap] */
    public void i(String str) {
        a aVar = (a) this.f108c;
        O.a aVar2 = (O.a) aVar.f3c;
        if (a.f1f == null) {
            ? hashMap = new HashMap();
            hashMap.put("alias", 1010);
            hashMap.put("allScroll", 1013);
            hashMap.put("basic", 1000);
            hashMap.put("cell", 1006);
            hashMap.put("click", 1002);
            hashMap.put("contextMenu", 1001);
            hashMap.put("copy", 1011);
            hashMap.put("forbidden", 1012);
            hashMap.put("grab", 1020);
            hashMap.put("grabbing", 1021);
            hashMap.put("help", 1003);
            hashMap.put("move", 1013);
            hashMap.put("none", 0);
            hashMap.put("noDrop", 1012);
            hashMap.put("precise", 1007);
            hashMap.put("text", 1008);
            hashMap.put("resizeColumn", 1014);
            hashMap.put("resizeDown", 1015);
            hashMap.put("resizeUpLeft", 1016);
            hashMap.put("resizeDownRight", 1017);
            hashMap.put("resizeLeft", 1014);
            hashMap.put("resizeLeftRight", 1014);
            hashMap.put("resizeRight", 1014);
            hashMap.put("resizeRow", 1015);
            hashMap.put("resizeUp", 1015);
            hashMap.put("resizeUpDown", 1015);
            hashMap.put("resizeUpLeft", 1017);
            hashMap.put("resizeUpRight", 1016);
            hashMap.put("resizeUpLeftDownRight", 1017);
            hashMap.put("resizeUpRightDownLeft", 1016);
            hashMap.put("verticalText", 1009);
            hashMap.put("wait", 1004);
            hashMap.put("zoomIn", 1018);
            hashMap.put("zoomOut", 1019);
            a.f1f = hashMap;
        }
        aVar2.setPointerIcon(PointerIcon.getSystemIcon(((x) ((O.a) aVar.f3c)).getContext(), ((Integer) a.f1f.getOrDefault(str, 1000)).intValue()));
    }

    public String j(String str, String str2) {
        N.a aVar = (N.a) this.f108c;
        Context context = aVar.f335b;
        C0005f fVar = aVar.f335b;
        if (str2 != null) {
            Locale a2 = N.a.a(str2);
            Configuration configuration = new Configuration(fVar.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = fVar.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", fVar.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public void o(int i2, L.o oVar) {
        q qVar;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f108c;
        kVar.c();
        kVar.f624f = oVar;
        kVar.f623e = new io.flutter.plugin.editing.j(2, i2);
        kVar.f626h.e(kVar);
        B.e eVar = oVar.f310j;
        if (eVar != null) {
            qVar = (q) eVar.f9c;
        } else {
            qVar = null;
        }
        kVar.f626h = new io.flutter.plugin.editing.f(qVar, kVar.f619a);
        kVar.d(oVar);
        kVar.f627i = true;
        if (kVar.f623e.f617a == 3) {
            kVar.f633p = false;
        }
        kVar.m = null;
        kVar.f626h.a(kVar);
    }

    public void p(double d2, double d3, double[] dArr) {
        boolean z2;
        double d4 = d2;
        double d5 = d3;
        double[] dArr2 = dArr;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f108c;
        kVar.getClass();
        double[] dArr3 = new double[4];
        if (dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        double d6 = dArr2[12];
        double d7 = dArr2[15];
        double d8 = d6 / d7;
        dArr3[1] = d8;
        dArr3[0] = d8;
        double d9 = dArr2[13] / d7;
        dArr3[3] = d9;
        dArr3[2] = d9;
        io.flutter.plugin.editing.i iVar = new io.flutter.plugin.editing.i(z2, dArr2, dArr3);
        iVar.a(d4, 0.0d);
        iVar.a(d4, d5);
        iVar.a(0.0d, d5);
        double d10 = (double) kVar.f619a.getContext().getResources().getDisplayMetrics().density;
        kVar.m = new Rect((int) (dArr3[0] * d10), (int) (dArr3[2] * d10), (int) Math.ceil(dArr3[1] * d10), (int) Math.ceil(dArr3[3] * d10));
    }

    public void q(q qVar) {
        q qVar2;
        int i2;
        int i3;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f108c;
        View view = kVar.f619a;
        if (!kVar.f627i && (qVar2 = kVar.f632o) != null && (i2 = qVar2.f319d) >= 0 && (i3 = qVar2.f320e) > i2) {
            int i4 = i3 - i2;
            int i5 = qVar.f320e;
            int i6 = qVar.f319d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (qVar2.f316a.charAt(i7 + i2) != qVar.f316a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            kVar.f627i = z2;
        }
        kVar.f632o = qVar;
        kVar.f626h.f(qVar);
        if (kVar.f627i) {
            kVar.f620b.restartInput(view);
            kVar.f627i = false;
        }
    }

    public /* synthetic */ u(int i2, Object obj) {
        this.f107b = i2;
        this.f108c = obj;
    }

    public u(F.b bVar, int i2) {
        this.f107b = i2;
        switch (i2) {
            case 14:
                new C.b(bVar, "flutter/platform_views_2", n.f331a).h(new u(13, (Object) this));
                return;
            case 15:
                new C.b(bVar, "flutter/platform_views", n.f331a).h(new u(12, (Object) this));
                return;
            case 19:
                new C.b(bVar, "flutter/scribe", h.f327b).h(new u(18, (Object) this));
                return;
            case 21:
                new C.b(bVar, "flutter/sensitivecontent", n.f331a).h(new u(20, (Object) this));
                return;
            case 23:
                new C.b(bVar, "flutter/spellcheck", n.f331a).h(new u(22, (Object) this));
                return;
            default:
                new C.b(bVar, "flutter/mousecursor", n.f331a).h(new u(9, (Object) this));
                return;
        }
    }

    public u(f fVar) {
        this.f107b = 7;
        new C.b(fVar, "flutter/keyboard", n.f331a).h(new a(this));
    }
}
