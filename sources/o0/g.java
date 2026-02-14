package o0;

import V.i;

public final class g extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    public final transient i f1063b;

    public g(i iVar) {
        this.f1063b = iVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f1063b.toString();
    }
}
