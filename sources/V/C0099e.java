package v;

import a.a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d0.h;
import r.C0090a;
import r.C0091b;
import s.e;

/* renamed from: v.e  reason: case insensitive filesystem */
public final class C0099e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f1201a;

    /* renamed from: b  reason: collision with root package name */
    public final C0091b f1202b;

    /* renamed from: c  reason: collision with root package name */
    public final C0091b f1203c;

    public C0099e(ClassLoader classLoader, C0091b bVar) {
        this.f1201a = classLoader;
        this.f1202b = bVar;
        this.f1203c = new C0091b(classLoader);
    }

    public final WindowLayoutComponent a() {
        C0091b bVar = this.f1203c;
        bVar.getClass();
        boolean z2 = false;
        try {
            h.d(bVar.f1159a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (a.B("WindowExtensionsProvider#getWindowExtensions is not valid", new C0090a(0, bVar)) && a.B("WindowExtensions#getWindowLayoutComponent is not valid", new C0098d(this, 3)) && a.B("FoldingFeature class is not valid", new C0098d(this, 0))) {
                int a2 = e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (a.B("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0098d(this, 2))) {
                        z2 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z2) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return a.B("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0098d(this, 1));
    }
}
