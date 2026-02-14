package M;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f332a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final o f333b = new Object();

    public static String a(ByteBuffer byteBuffer) {
        int i2;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new String(bArr, i2, remaining, f332a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f332a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    public final /* bridge */ /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }

    public final /* bridge */ /* synthetic */ ByteBuffer c(Object obj) {
        return d((String) obj);
    }
}
