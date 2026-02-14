package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: l.n  reason: case insensitive filesystem */
public final class C0081n {

    /* renamed from: a  reason: collision with root package name */
    public final C0080m f909a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = C0079l.f906l;
        } else {
            int i3 = C0080m.f907b;
        }
    }

    public C0081n(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f909a = new C0079l(this, windowInsets);
        } else if (i2 >= 29) {
            this.f909a = new C0078k(this, windowInsets);
        } else if (i2 >= 28) {
            this.f909a = new C0077j(this, windowInsets);
        } else {
            this.f909a = new C0076i(this, windowInsets);
        }
    }

    public static C0081n a(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0081n nVar = new C0081n(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = C0070c.f890a;
            C0081n a2 = C0069b.a(view);
            C0080m mVar = nVar.f909a;
            mVar.k(a2);
            mVar.d(view.getRootView());
        }
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0081n)) {
            return false;
        }
        return Objects.equals(this.f909a, ((C0081n) obj).f909a);
    }

    public final int hashCode() {
        C0080m mVar = this.f909a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public C0081n() {
        this.f909a = new C0080m(this);
    }
}
