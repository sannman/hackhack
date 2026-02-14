package l;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: l.j  reason: case insensitive filesystem */
public class C0077j extends C0076i {
    public C0077j(C0081n nVar, WindowInsets windowInsets) {
        super(nVar, windowInsets);
    }

    public C0081n a() {
        return C0081n.a((View) null, this.f902c.consumeDisplayCutout());
    }

    public C0068a e() {
        DisplayCutout g2 = this.f902c.getDisplayCutout();
        if (g2 == null) {
            return null;
        }
        return new C0068a(g2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0077j)) {
            return false;
        }
        C0077j jVar = (C0077j) obj;
        if (!Objects.equals(this.f902c, jVar.f902c) || !Objects.equals(this.f904e, jVar.f904e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f902c.hashCode();
    }
}
