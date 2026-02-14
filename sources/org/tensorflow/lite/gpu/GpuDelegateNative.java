package org.tensorflow.lite.gpu;

abstract class GpuDelegateNative {

    /* renamed from: a  reason: collision with root package name */
    public static final UnsatisfiedLinkError f1102a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f1103b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_gpu_jni");
            e = null;
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
        }
        f1102a = e;
    }

    public static void a() {
        if (!f1103b) {
            try {
                nativeDoNothing();
                f1103b = true;
            } catch (UnsatisfiedLinkError e2) {
                UnsatisfiedLinkError unsatisfiedLinkError = f1102a;
                if (unsatisfiedLinkError == null) {
                    unsatisfiedLinkError = e2;
                }
                UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native GpuDelegate methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
                unsatisfiedLinkError2.initCause(e2);
                unsatisfiedLinkError2.addSuppressed(unsatisfiedLinkError);
                throw unsatisfiedLinkError2;
            }
        }
    }

    private static native void nativeDoNothing();
}
