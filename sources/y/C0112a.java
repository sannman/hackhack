package y;

import U.m;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.h;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: y.a  reason: case insensitive filesystem */
public abstract class C0112a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        h.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        h.e(sidecarDeviceState, "sidecarDeviceState");
        int a2 = a(sidecarDeviceState);
        if (a2 < 0 || a2 > 4) {
            return 0;
        }
        return a2;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        m mVar = m.f364b;
        h.e(sidecarWindowLayoutInfo, "info");
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return mVar;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                h.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i2) {
        try {
            sidecarDeviceState.posture = i2;
        } catch (NoSuchFieldError unused) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i2)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }
}
