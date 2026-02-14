package androidx.lifecycle;

public enum f {
    ;
    
    public static final d Companion = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r4v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r5v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r6v2, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.lifecycle.d, java.lang.Object] */
    static {
        Companion = new Object();
    }

    public final g a() {
        switch (e.f409a[ordinal()]) {
            case 1:
            case 2:
                return g.f412d;
            case 3:
            case 4:
                return g.f413e;
            case 5:
                return g.f414f;
            case 6:
                return g.f410b;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
