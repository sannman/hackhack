package io.flutter.view;

import android.util.Log;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f793a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f794b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f795c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f796d;

    /* renamed from: e  reason: collision with root package name */
    public final Field f797e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f798f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l() {
        /*
            r9 = this;
            java.lang.String r0 = "getSourceNodeId"
            java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r1 = android.view.accessibility.AccessibilityNodeInfo.class
            java.lang.String r2 = "AccessibilityBridge"
            r9.<init>()
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0012 }
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            java.lang.String r5 = "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
            android.util.Log.w(r2, r5)
            r5 = r4
        L_0x0018:
            java.lang.Class<android.view.accessibility.AccessibilityRecord> r6 = android.view.accessibility.AccessibilityRecord.class
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.reflect.Method r0 = r6.getMethod(r0, r7)     // Catch:{ NoSuchMethodException -> 0x0021 }
            goto L_0x0027
        L_0x0021:
            java.lang.String r0 = "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
            android.util.Log.w(r2, r0)
            r0 = r4
        L_0x0027:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            java.lang.Class r8 = java.lang.Integer.TYPE
            if (r6 > r7) goto L_0x0054
            java.lang.String r6 = "getParentNodeId"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.reflect.Method r3 = r1.getMethod(r6, r3)     // Catch:{ NoSuchMethodException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            java.lang.String r3 = "can't invoke getParentNodeId with reflection"
            android.util.Log.w(r2, r3)
            r3 = r4
        L_0x003e:
            java.lang.String r6 = "getChildId"
            java.lang.Class[] r7 = new java.lang.Class[]{r8}     // Catch:{ NoSuchMethodException -> 0x004c }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x004c }
            r2 = r4
        L_0x0049:
            r4 = r3
        L_0x004a:
            r3 = r2
            goto L_0x007a
        L_0x004c:
            java.lang.String r1 = "can't invoke getChildId with reflection"
            android.util.Log.w(r2, r1)
            r1 = r4
            r2 = r1
            goto L_0x0049
        L_0x0054:
            java.lang.String r3 = "mChildNodeIds"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0072 }
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0072 }
            java.lang.String r3 = "android.util.LongArray"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0072 }
            java.lang.String r6 = "get"
            java.lang.Class[] r7 = new java.lang.Class[]{r8}     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0072 }
            java.lang.reflect.Method r2 = r3.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0072 }
            r3 = r2
            r2 = r1
            r1 = r4
            goto L_0x007a
        L_0x0072:
            java.lang.String r1 = "can't access childNodeIdsField with reflection"
            android.util.Log.w(r2, r1)
            r1 = r4
            r2 = r1
            goto L_0x004a
        L_0x007a:
            r9.f793a = r5
            r9.f794b = r4
            r9.f795c = r0
            r9.f796d = r1
            r9.f797e = r2
            r9.f798f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.l.<init>():void");
    }

    public static Long a(l lVar, AccessibilityRecord accessibilityRecord) {
        Method method = lVar.f795c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e3);
            return null;
        }
    }

    public static boolean b(long j2, int i2) {
        return (j2 & (1 << i2)) != 0;
    }
}
