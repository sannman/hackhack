package l;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: l.a  reason: case insensitive filesystem */
public final class C0068a {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f889a;

    public C0068a(DisplayCutout displayCutout) {
        this.f889a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0068a.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f889a, ((C0068a) obj).f889a);
    }

    public final int hashCode() {
        return this.f889a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f889a + "}";
    }
}
