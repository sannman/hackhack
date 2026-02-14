package s;

import androidx.window.extensions.WindowExtensionsProvider;
import d0.l;

public abstract class e {
    static {
        l.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
