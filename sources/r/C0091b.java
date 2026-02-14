package r;

import android.app.Activity;
import d0.e;
import d0.h;
import java.lang.reflect.Proxy;
import s.c;
import s.d;
import x.C0107b;

/* renamed from: r.b  reason: case insensitive filesystem */
public final class C0091b {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f1159a;

    public /* synthetic */ C0091b(ClassLoader classLoader) {
        this.f1159a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, C0107b bVar) {
        c cVar = new c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.f1159a, new Class[]{b()}, cVar);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, b()}).invoke(obj, new Object[]{activity, newProxyInstance});
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", new Class[]{b()}), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f1159a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
