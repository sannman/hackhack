package M;

import B.a;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class n implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final n f331a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, M.n] */
    static {
        m mVar = m.f328a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, M.l] */
    public final ByteBuffer a(String str, String str2) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        m mVar = m.f328a;
        mVar.k(byteArrayOutputStream, "error");
        mVar.k(byteArrayOutputStream, str);
        byteArrayOutputStream.write(0);
        mVar.k(byteArrayOutputStream, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, M.l] */
    public final ByteBuffer d(String str, String str2, Object obj) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        m mVar = m.f328a;
        mVar.k(byteArrayOutputStream, str);
        mVar.k(byteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            mVar.k(byteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            mVar.k(byteArrayOutputStream, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, M.l] */
    public final ByteBuffer e(Object obj) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        m.f328a.k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, M.l] */
    public final ByteBuffer f(a aVar) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        m mVar = m.f328a;
        mVar.k(byteArrayOutputStream, (String) aVar.f3c);
        mVar.k(byteArrayOutputStream, aVar.f4d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    public final a g(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        m mVar = m.f328a;
        Object e2 = mVar.e(byteBuffer);
        Object e3 = mVar.e(byteBuffer);
        if ((e2 instanceof String) && !byteBuffer.hasRemaining()) {
            return new a(12, (Object) (String) e2, e3);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x0046
            goto L_0x001e
        L_0x0011:
            M.m r0 = M.m.f328a
            java.lang.Object r0 = r0.e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            M.m r0 = M.m.f328a
            java.lang.Object r1 = r0.e(r5)
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = r0.e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0036
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0046
        L_0x0036:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x0046
            M.g r5 = new M.g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M.n.h(java.nio.ByteBuffer):java.lang.Object");
    }
}
