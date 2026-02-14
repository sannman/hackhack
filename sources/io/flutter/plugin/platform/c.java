package io.flutter.plugin.platform;

import B.a;
import D.C0018t;
import D.P;
import L.h;
import L.i;
import L.j;
import T.g;
import X.b;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import io.flutter.plugin.editing.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import m0.d;
import n.f;

public final class c implements f, d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f636b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f637c;

    public /* synthetic */ c(int i2, Object obj) {
        this.f636b = i2;
        this.f637c = obj;
    }

    public void a(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f637c).setResultCode(i2);
    }

    public Object b(Object obj, b bVar) {
        ((C0018t) this.f637c).accept(obj);
        return g.f356a;
    }

    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void d(int i2) {
        j jVar = (j) this.f637c;
        if (jVar.g(i2)) {
            ((p) jVar.f667i.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
        } else if (jVar.f669k.get(i2) == null) {
            Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
        } else {
            throw new ClassCastException();
        }
    }

    public void e(h hVar) {
        j jVar = (j) this.f637c;
        jVar.getClass();
        int i2 = hVar.f266a;
        int i3 = hVar.f268c;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + i3 + "(view id: " + i2 + ")");
        } else if (jVar.f671n.get(i2) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
        } else if (jVar.f663e == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
        } else if (jVar.f661c != null) {
            HashMap hashMap = jVar.f659a.f184a;
            String str = hVar.f267b;
            if (hashMap.get(str) == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
            }
            throw new ClassCastException();
        } else {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
        }
    }

    public void f(int i2) {
        switch (this.f636b) {
            case 1:
                if (((j) this.f637c).f669k.get(i2) == null) {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                    return;
                }
                throw new ClassCastException();
            default:
                if (((i) this.f637c).f653g.get(i2) == null) {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                    return;
                }
                throw new ClassCastException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        android.util.Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        android.util.Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0029 }, ExcHandler: SecurityException (r9v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE, Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0029 }]), Splitter:B:2:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:2:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence g(L.e r9) {
        /*
            r8 = this;
            java.lang.String r0 = "PlatformPlugin"
            java.lang.String r1 = "Clipboard item contains a Uri with scheme '"
            java.lang.Object r2 = r8.f637c
            io.flutter.plugin.platform.f r2 = (io.flutter.plugin.platform.f) r2
            D.f r2 = r2.f642a
            java.lang.String r3 = "clipboard"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            boolean r4 = r3.hasPrimaryClip()
            r5 = 0
            if (r4 != 0) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            android.content.ClipData r3 = r3.getPrimaryClip()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0029 }
            if (r3 != 0) goto L_0x0021
            goto L_0x0028
        L_0x0021:
            if (r9 == 0) goto L_0x002d
            L.e r4 = L.e.f253b     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0029 }
            if (r9 != r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            return r5
        L_0x0029:
            r9 = move-exception
            goto L_0x0083
        L_0x002b:
            r9 = move-exception
            goto L_0x008f
        L_0x002d:
            r9 = 0
            android.content.ClipData$Item r9 = r3.getItemAt(r9)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0029 }
            java.lang.CharSequence r3 = r9.getText()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0029 }
            if (r3 != 0) goto L_0x0082
            android.net.Uri r4 = r9.getUri()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            if (r4 != 0) goto L_0x0048
            java.lang.String r9 = "Clipboard item contained no textual content nor a URI to retrieve it from."
            android.util.Log.w(r0, r9)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            return r5
        L_0x0044:
            r5 = r3
            goto L_0x0083
        L_0x0046:
            r9 = move-exception
            goto L_0x0044
        L_0x0048:
            java.lang.String r6 = r4.getScheme()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            java.lang.String r7 = "content"
            boolean r7 = r6.equals(r7)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            if (r7 != 0) goto L_0x0069
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            r9.<init>(r1)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            r9.append(r6)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            java.lang.String r1 = "'that is unhandled."
            r9.append(r1)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            java.lang.String r9 = r9.toString()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            android.util.Log.w(r0, r9)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            return r5
        L_0x0069:
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            java.lang.String r6 = "text/*"
            android.content.res.AssetFileDescriptor r1 = r1.openTypedAssetFileDescriptor(r4, r6, r5)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            java.lang.CharSequence r9 = r9.coerceToText(r2)     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x0046 }
            if (r1 == 0) goto L_0x0081
            r1.close()     // Catch:{ SecurityException -> 0x002b, FileNotFoundException -> 0x0089, IOException -> 0x007d }
            return r9
        L_0x007d:
            r1 = move-exception
            r5 = r9
            r9 = r1
            goto L_0x0083
        L_0x0081:
            return r9
        L_0x0082:
            return r3
        L_0x0083:
            java.lang.String r1 = "Failed to close AssetFileDescriptor while trying to read text from URI."
            android.util.Log.w(r0, r1, r9)
            goto L_0x0094
        L_0x0089:
            java.lang.String r9 = "Clipboard text was unable to be received from content URI."
            android.util.Log.w(r0, r9)
            goto L_0x0094
        L_0x008f:
            java.lang.String r1 = "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"
            android.util.Log.w(r0, r1, r9)
        L_0x0094:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.c.g(L.e):java.lang.CharSequence");
    }

    public void h(int i2, double d2, double d3) {
        j jVar = (j) this.f637c;
        if (!jVar.g(i2)) {
            h hVar = (h) jVar.f671n.get(i2);
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
        }
    }

    public void i(j jVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        j jVar2 = jVar;
        j jVar3 = (j) this.f637c;
        float f2 = jVar3.f660b.getResources().getDisplayMetrics().density;
        int i2 = jVar2.f272a;
        if (jVar3.g(i2)) {
            p pVar = (p) jVar3.f667i.get(Integer.valueOf(i2));
            P p2 = new P(jVar2.f286p);
            while (true) {
                a aVar = jVar3.f677t;
                priorityQueue = (PriorityQueue) aVar.f4d;
                boolean isEmpty = priorityQueue.isEmpty();
                longSparseArray = (LongSparseArray) aVar.f3c;
                j2 = p2.f50a;
                if (!isEmpty && ((Long) priorityQueue.peek()).longValue() < j2) {
                    longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
                }
            }
            if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
                priorityQueue.poll();
            }
            MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j2);
            longSparseArray.remove(j2);
            ArrayList arrayList = new ArrayList();
            for (List list : (List) jVar2.f278g) {
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
                pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
                pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
                double d2 = (double) f2;
                pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d2);
                pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d2);
                pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d2);
                pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d2);
                pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d2);
                pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d2);
                arrayList.add(pointerCoords);
            }
            int i3 = jVar2.f276e;
            MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
            ArrayList arrayList2 = new ArrayList();
            for (List list2 : (List) jVar2.f277f) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list2.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list2.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            long longValue = jVar2.f273b.longValue();
            long longValue2 = jVar2.f274c.longValue();
            int i4 = jVar2.f284n;
            int i5 = jVar2.f285o;
            int i6 = jVar2.f275d;
            int i7 = jVar2.f276e;
            int i8 = jVar2.f279h;
            int i9 = jVar2.f280i;
            float f3 = jVar2.f281j;
            float f4 = jVar2.f282k;
            int i10 = i8;
            int i11 = i9;
            float f5 = f3;
            float f6 = f4;
            MotionEvent.obtain(longValue, longValue2, i6, i7, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, i10, i11, f5, f6, jVar2.f283l, jVar2.m, i4, i5);
            pVar.getClass();
        } else if (jVar3.f669k.get(i2) == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
        } else {
            throw new ClassCastException();
        }
    }

    public void j(i iVar) {
        j jVar = (j) this.f637c;
        int f2 = jVar.f(iVar.f270b);
        int f3 = jVar.f(iVar.f271c);
        int i2 = iVar.f269a;
        if (jVar.g(i2)) {
            float f4 = jVar.f660b.getResources().getDisplayMetrics().density;
            p pVar = (p) jVar.f667i.get(Integer.valueOf(i2));
            k kVar = jVar.f664f;
            if (kVar != null) {
                if (kVar.f623e.f617a == 3) {
                    kVar.f633p = true;
                }
                pVar.getClass();
            }
            pVar.getClass();
            if (f2 == 0 && f3 == 0) {
                throw null;
            } else if (Build.VERSION.SDK_INT >= 31) {
                throw null;
            } else {
                throw null;
            }
        } else if (jVar.f669k.get(i2) == null) {
            h hVar = (h) jVar.f671n.get(i2);
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
        } else {
            throw new ClassCastException();
        }
    }

    public void k(int i2, int i3) {
        if (i3 == 0 || i3 == 1) {
            j jVar = (j) this.f637c;
            if (jVar.g(i2)) {
                ((p) jVar.f667i.get(Integer.valueOf(i2))).getClass();
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            } else if (jVar.f669k.get(i2) == null) {
                Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
            } else {
                throw new ClassCastException();
            }
        } else {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
    }

    public void l(ArrayList arrayList) {
        int i2;
        f fVar = (f) this.f637c;
        fVar.getClass();
        if (arrayList.size() == 0) {
            i2 = 5894;
        } else {
            i2 = 1798;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((L.g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        fVar.f646e = i2;
        fVar.b();
    }

    public void m(int i2) {
        View decorView = ((f) this.f637c).f642a.getWindow().getDecorView();
        int a2 = n.d.a(i2);
        if (a2 == 0) {
            decorView.performHapticFeedback(0);
        } else if (a2 == 1) {
            decorView.performHapticFeedback(1);
        } else if (a2 == 2) {
            decorView.performHapticFeedback(3);
        } else if (a2 == 3) {
            decorView.performHapticFeedback(6);
        } else if (a2 == 4) {
            decorView.performHapticFeedback(4);
        }
    }

    public String toString() {
        switch (this.f636b) {
            case 4:
                return "<" + ((String) this.f637c) + '>';
            default:
                return super.toString();
        }
    }
}
