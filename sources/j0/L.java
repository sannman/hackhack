package j0;

import d0.h;
import java.util.concurrent.CancellationException;

public final class L extends CancellationException {

    /* renamed from: b  reason: collision with root package name */
    public final transient T f824b;

    public L(String str, Throwable th, T t2) {
        super(str);
        this.f824b = t2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        if (!h.a(l2.getMessage(), getMessage()) || !h.a(l2.f824b, this.f824b) || !h.a(l2.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i2;
        String message = getMessage();
        h.b(message);
        int hashCode = (this.f824b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i2 = cause.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f824b;
    }
}
