package Q;

import D.C0005f;
import D.u;
import android.os.Build;
import android.view.View;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public C0005f f340a;

    /* renamed from: b  reason: collision with root package name */
    public final int f341b;

    /* renamed from: c  reason: collision with root package name */
    public final u f342c;

    public a(int i2, C0005f fVar, u uVar) {
        this.f340a = fVar;
        this.f341b = i2;
        this.f342c = uVar;
        uVar.f108c = this;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        C0005f fVar = this.f340a;
        int i2 = this.f341b;
        View findViewById = fVar.findViewById(i2);
        if (findViewById != null) {
            return findViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public final void b(int i2) {
        if (Build.VERSION.SDK_INT >= 35) {
            C0005f fVar = this.f340a;
            int i3 = this.f341b;
            View findViewById = fVar.findViewById(i3);
            if (findViewById == null) {
                throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
            } else if (findViewById.getContentSensitivity() != i2) {
                findViewById.setContentSensitivity(i2);
                findViewById.invalidate();
            }
        } else {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
    }
}
