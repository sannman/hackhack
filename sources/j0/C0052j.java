package j0;

import c0.l;
import d0.h;
import java.util.concurrent.CancellationException;
import o0.q;

/* renamed from: j0.j  reason: case insensitive filesystem */
public final class C0052j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f856a;

    /* renamed from: b  reason: collision with root package name */
    public final l f857b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f858c;

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f859d;

    public C0052j(Object obj, l lVar, Object obj2, Throwable th) {
        this.f856a = obj;
        this.f857b = lVar;
        this.f858c = obj2;
        this.f859d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0052j)) {
            return false;
        }
        C0052j jVar = (C0052j) obj;
        if (h.a(this.f856a, jVar.f856a) && h.a(this.f857b, jVar.f857b) && h.a(this.f858c, jVar.f858c) && h.a(this.f859d, jVar.f859d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        Object obj = this.f856a;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int i6 = i2 * 961;
        l lVar = this.f857b;
        if (lVar == null) {
            i3 = 0;
        } else {
            i3 = lVar.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        Object obj2 = this.f858c;
        if (obj2 == null) {
            i4 = 0;
        } else {
            i4 = obj2.hashCode();
        }
        int i8 = (i7 + i4) * 31;
        Throwable th = this.f859d;
        if (th != null) {
            i5 = th.hashCode();
        }
        return i8 + i5;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f856a + ", cancelHandler=null, onCancellation=" + this.f857b + ", idempotentResume=" + this.f858c + ", cancelCause=" + this.f859d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0052j(Object obj, q qVar, CancellationException cancellationException, int i2) {
        this(obj, (l) (i2 & 4) != 0 ? null : qVar, (Object) null, (Throwable) (i2 & 16) != 0 ? null : cancellationException);
    }
}
