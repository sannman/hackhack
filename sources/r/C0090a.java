package r;

import c0.a;
import d0.h;
import d0.i;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* renamed from: r.a  reason: case insensitive filesystem */
public final class C0090a extends i implements a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1157c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1158d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0090a(int i2, Object obj) {
        super(0);
        this.f1157c = i2;
        this.f1158d = obj;
    }

    public final Object a() {
        switch (this.f1157c) {
            case 0:
                C0091b bVar = (C0091b) this.f1158d;
                Class<?> loadClass = bVar.f1159a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z2 = false;
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class<?> loadClass2 = bVar.f1159a.loadClass("androidx.window.extensions.WindowExtensions");
                h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                h.d(declaredMethod, "getWindowExtensionsMethod");
                if (declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                s.h hVar = (s.h) this.f1158d;
                return BigInteger.valueOf((long) hVar.f1178b).shiftLeft(32).or(BigInteger.valueOf((long) hVar.f1179c)).shiftLeft(32).or(BigInteger.valueOf((long) hVar.f1180d));
        }
    }
}
