package p0;

import D.F;
import j0.C0061t;

public final class i extends h {

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f1131d;

    public i(Runnable runnable, long j2, F f2) {
        super(j2, f2);
        this.f1131d = runnable;
    }

    public final void run() {
        try {
            this.f1131d.run();
        } finally {
            this.f1130c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1131d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C0061t.a(runnable));
        sb.append(", ");
        sb.append(this.f1129b);
        sb.append(", ");
        sb.append(this.f1130c);
        sb.append(']');
        return sb.toString();
    }
}
