package org.tensorflow.lite.gpu;

import java.io.Closeable;
import q0.a;

public class GpuDelegate implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public long f1101b;

    public GpuDelegate(a aVar) {
        GpuDelegateNative.a();
        aVar.getClass();
        this.f1101b = createDelegate(true, true, 0, (String) null, (String) null, 0);
    }

    private static native long createDelegate(boolean z2, boolean z3, int i2, String str, String str2, int i3);

    private static native void deleteDelegate(long j2);

    public final void close() {
        long j2 = this.f1101b;
        if (j2 != 0) {
            deleteDelegate(j2);
            this.f1101b = 0;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [q0.a, java.lang.Object] */
    public GpuDelegate() {
        this(new Object());
    }
}
