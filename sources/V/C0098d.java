package v;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import c0.a;
import d0.h;
import d0.i;
import d0.l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: v.d  reason: case insensitive filesystem */
public final class C0098d extends i implements a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1199c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0099e f1200d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098d(C0099e eVar, int i2) {
        super(0);
        this.f1199c = i2;
        this.f1200d = eVar;
    }

    public final Object a() {
        Class cls;
        boolean z2;
        boolean z3;
        switch (this.f1199c) {
            case 0:
                Class<?> loadClass = this.f1200d.f1201a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                boolean z4 = false;
                Method method = loadClass.getMethod("getBounds", new Class[0]);
                Method method2 = loadClass.getMethod("getType", new Class[0]);
                Method method3 = loadClass.getMethod("getState", new Class[0]);
                h.d(method, "getBoundsMethod");
                if (a.a.i(method, l.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (a.a.i(method2, l.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        h.d(method3, "getStateMethod");
                        if (a.a.i(method3, l.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z4 = true;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 1:
                C0099e eVar = this.f1200d;
                try {
                    cls = eVar.f1202b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f1201a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, cls});
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
                h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                Class<?> loadClass3 = this.f1200d.f1201a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Class<Consumer> cls3 = Consumer.class;
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", new Class[]{Context.class, cls3});
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", new Class[]{cls3});
                h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                C0099e eVar2 = this.f1200d;
                Class<?> loadClass4 = eVar2.f1203c.f1159a.loadClass("androidx.window.extensions.WindowExtensions");
                h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                boolean z5 = false;
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", new Class[0]);
                Class<?> loadClass5 = eVar2.f1201a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                h.d(method8, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5)) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
        }
    }
}
