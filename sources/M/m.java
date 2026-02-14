package M;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class m implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final m f328a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f329b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f330c = Charset.forName("UTF8");

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, M.m] */
    static {
        boolean z2;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z2 = true;
        } else {
            z2 = false;
        }
        f329b = z2;
    }

    public static final void a(ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get() & 255;
            if (b2 < 254) {
                return b2;
            }
            if (b2 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void g(l lVar, int i2) {
        int size = lVar.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                lVar.write(0);
            }
        }
    }

    public static final void h(l lVar, int i2) {
        if (f329b) {
            lVar.write(i2);
            lVar.write(i2 >>> 8);
            lVar.write(i2 >>> 16);
            lVar.write(i2 >>> 24);
            return;
        }
        lVar.write(i2 >>> 24);
        lVar.write(i2 >>> 16);
        lVar.write(i2 >>> 8);
        lVar.write(i2);
    }

    public static final void i(l lVar, long j2) {
        if (f329b) {
            lVar.write((byte) ((int) j2));
            lVar.write((byte) ((int) (j2 >>> 8)));
            lVar.write((byte) ((int) (j2 >>> 16)));
            lVar.write((byte) ((int) (j2 >>> 24)));
            lVar.write((byte) ((int) (j2 >>> 32)));
            lVar.write((byte) ((int) (j2 >>> 40)));
            lVar.write((byte) ((int) (j2 >>> 48)));
            lVar.write((byte) ((int) (j2 >>> 56)));
            return;
        }
        lVar.write((byte) ((int) (j2 >>> 56)));
        lVar.write((byte) ((int) (j2 >>> 48)));
        lVar.write((byte) ((int) (j2 >>> 40)));
        lVar.write((byte) ((int) (j2 >>> 32)));
        lVar.write((byte) ((int) (j2 >>> 24)));
        lVar.write((byte) ((int) (j2 >>> 16)));
        lVar.write((byte) ((int) (j2 >>> 8)));
        lVar.write((byte) ((int) j2));
    }

    public static final void j(l lVar, int i2) {
        if (i2 < 254) {
            lVar.write(i2);
        } else if (i2 <= 65535) {
            lVar.write(254);
            if (f329b) {
                lVar.write(i2);
                lVar.write(i2 >>> 8);
                return;
            }
            lVar.write(i2 >>> 8);
            lVar.write(i2);
        } else {
            lVar.write(255);
            h(lVar, i2);
        }
    }

    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e2 = e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e2;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, M.l] */
    public final ByteBuffer c(Object obj) {
        if (obj == null) {
            return null;
        }
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARNING: type inference failed for: r5v16, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v2, types: [long[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [double[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v6, types: [float[], java.io.Serializable] */
    public Serializable f(byte b2, ByteBuffer byteBuffer) {
        Charset charset = f330c;
        int i2 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                ? r5 = new byte[d(byteBuffer)];
                byteBuffer.get(r5);
                return r5;
            case 9:
                int d2 = d(byteBuffer);
                ? r0 = new int[d2];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(r0);
                byteBuffer.position((d2 * 4) + byteBuffer.position());
                return r0;
            case 10:
                int d3 = d(byteBuffer);
                ? r02 = new long[d3];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(r02);
                byteBuffer.position((d3 * 8) + byteBuffer.position());
                return r02;
            case 11:
                int d4 = d(byteBuffer);
                ? r03 = new double[d4];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(r03);
                byteBuffer.position((d4 * 8) + byteBuffer.position());
                return r03;
            case 12:
                int d5 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d5);
                while (i2 < d5) {
                    arrayList.add(e(byteBuffer));
                    i2++;
                }
                return arrayList;
            case 13:
                int d6 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i2 < d6) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i2++;
                }
                return hashMap;
            case 14:
                int d7 = d(byteBuffer);
                ? r04 = new float[d7];
                a(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(r04);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return r04;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public void k(l lVar, Object obj) {
        int i2;
        int i3 = 0;
        if (obj == null || obj.equals((Object) null)) {
            lVar.write(0);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            lVar.write(i2);
        } else {
            boolean z2 = obj instanceof Number;
            Charset charset = f330c;
            if (z2) {
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    lVar.write(3);
                    h(lVar, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    lVar.write(4);
                    i(lVar, ((Long) obj).longValue());
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    lVar.write(6);
                    g(lVar, 8);
                    i(lVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                } else if (obj instanceof BigInteger) {
                    lVar.write(5);
                    byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                    j(lVar, bytes.length);
                    lVar.write(bytes, 0, bytes.length);
                } else {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
            } else if (obj instanceof CharSequence) {
                lVar.write(7);
                byte[] bytes2 = obj.toString().getBytes(charset);
                j(lVar, bytes2.length);
                lVar.write(bytes2, 0, bytes2.length);
            } else if (obj instanceof byte[]) {
                lVar.write(8);
                byte[] bArr = (byte[]) obj;
                j(lVar, bArr.length);
                lVar.write(bArr, 0, bArr.length);
            } else if (obj instanceof int[]) {
                lVar.write(9);
                int[] iArr = (int[]) obj;
                j(lVar, iArr.length);
                g(lVar, 4);
                int length = iArr.length;
                while (i3 < length) {
                    h(lVar, iArr[i3]);
                    i3++;
                }
            } else if (obj instanceof long[]) {
                lVar.write(10);
                long[] jArr = (long[]) obj;
                j(lVar, jArr.length);
                g(lVar, 8);
                int length2 = jArr.length;
                while (i3 < length2) {
                    i(lVar, jArr[i3]);
                    i3++;
                }
            } else if (obj instanceof double[]) {
                lVar.write(11);
                double[] dArr = (double[]) obj;
                j(lVar, dArr.length);
                g(lVar, 8);
                int length3 = dArr.length;
                while (i3 < length3) {
                    i(lVar, Double.doubleToLongBits(dArr[i3]));
                    i3++;
                }
            } else if (obj instanceof List) {
                lVar.write(12);
                List<Object> list = (List) obj;
                j(lVar, list.size());
                for (Object k2 : list) {
                    k(lVar, k2);
                }
            } else if (obj instanceof Map) {
                lVar.write(13);
                Map map = (Map) obj;
                j(lVar, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    k(lVar, entry.getKey());
                    k(lVar, entry.getValue());
                }
            } else if (obj instanceof float[]) {
                lVar.write(14);
                float[] fArr = (float[]) obj;
                j(lVar, fArr.length);
                g(lVar, 4);
                int length4 = fArr.length;
                while (i3 < length4) {
                    h(lVar, Float.floatToIntBits(fArr[i3]));
                    i3++;
                }
            } else {
                throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
            }
        }
    }
}
