package n;

import B.b;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1008a = new b(9);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1009b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f1010c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f1011d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f1012e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f1013f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f1014g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f1015h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f1016i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f1017j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i2 = 0;
        for (c cVar : cVarArr) {
            i2 += ((((cVar.f1004g * 2) + 7) & -8) / 8) + (cVar.f1002e * 2) + d(cVar.f998a, cVar.f999b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f1003f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f1013f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f998a, cVar2.f999b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f1005h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f998a, cVar3.f999b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f1005h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File c2 : listFiles) {
                if (!c(c2) || !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = f1015h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1014g;
        String str4 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str4 = ":";
                }
                sb.append(str4);
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
            }
            if (i4 != i2) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f1016i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(f1011d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int m = (int) m(fileInputStream, 1);
                byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                    try {
                        c[] j2 = j(byteArrayInputStream, m, cVarArr);
                        byteArrayInputStream.close();
                        return j2;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f1017j)) {
            int m2 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
                try {
                    c[] k2 = k(byteArrayInputStream2, bArr2, m2, cVarArr);
                    byteArrayInputStream2.close();
                    return k2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i2, c[] cVarArr) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 == cVarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = (int) m(byteArrayInputStream, 2);
                strArr[i4] = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i3 < i2) {
                c cVar = cVarArr[i3];
                if (cVar.f999b.equals(strArr[i3])) {
                    int i5 = iArr[i3];
                    cVar.f1002e = i5;
                    cVar.f1005h = g(byteArrayInputStream, i5);
                    i3++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 == cVarArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m = m(byteArrayInputStream, 4);
                int m2 = (int) m(byteArrayInputStream, 2);
                c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= cVarArr.length) {
                            break;
                        } else if (cVarArr[i4].f999b.equals(str)) {
                            cVar = cVarArr[i4];
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                if (cVar != null) {
                    cVar.f1001d = m;
                    int[] g2 = g(byteArrayInputStream, m2);
                    if (Arrays.equals(bArr, f1015h)) {
                        cVar.f1002e = m2;
                        cVar.f1005h = g2;
                    }
                    i3++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f1012e)) {
            int m = (int) m(fileInputStream, 1);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                try {
                    c[] n2 = n(byteArrayInputStream, str, m);
                    byteArrayInputStream.close();
                    return n2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (f2[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        int i3;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i4 = i2;
        if (byteArrayInputStream2.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m = (int) m(byteArrayInputStream2, 2);
            long m2 = m(byteArrayInputStream2, 4);
            String str2 = str;
            cVarArr[i5] = new c(str2, new String(f(byteArrayInputStream2, (int) m(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream2, 4), m, (int) m2, (int) m(byteArrayInputStream2, 4), new int[m], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i4) {
            c cVar = cVarArr[i6];
            int available = byteArrayInputStream2.available() - cVar.f1003f;
            int i7 = 0;
            while (true) {
                int available2 = byteArrayInputStream2.available();
                treeMap = cVar.f1006i;
                if (available2 <= available) {
                    break;
                }
                i7 += (int) m(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i7), 1);
                for (int m3 = (int) m(byteArrayInputStream2, 2); m3 > 0; m3--) {
                    m(byteArrayInputStream2, 2);
                    int m4 = (int) m(byteArrayInputStream2, 1);
                    if (!(m4 == 6 || m4 == 7)) {
                        while (m4 > 0) {
                            m(byteArrayInputStream2, 1);
                            for (int m5 = (int) m(byteArrayInputStream2, 1); m5 > 0; m5--) {
                                m(byteArrayInputStream2, 2);
                            }
                            m4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream2.available() == available) {
                cVar.f1005h = g(byteArrayInputStream2, cVar.f1002e);
                int i8 = cVar.f1004g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream2, (((i8 * 2) + 7) & -8) / 8));
                for (int i9 = 0; i9 < i8; i9++) {
                    if (valueOf.get(i9)) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    if (valueOf.get(i9 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i9), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j2;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        c[] cVarArr2 = cVarArr;
        byte[] bArr3 = f1011d;
        int i2 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream5, cVarArr2.length);
                int i3 = 2;
                int i4 = 2;
                for (c cVar : cVarArr2) {
                    t(byteArrayOutputStream5, cVar.f1000c, 4);
                    t(byteArrayOutputStream5, cVar.f1001d, 4);
                    t(byteArrayOutputStream5, (long) cVar.f1004g, 4);
                    String d2 = d(cVar.f998a, cVar.f999b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d2.getBytes(charset).length;
                    u(byteArrayOutputStream5, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream5.write(d2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i4 == byteArray.length) {
                    q qVar = new q(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(qVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < cVarArr2.length) {
                        try {
                            c cVar2 = cVarArr2[i5];
                            u(byteArrayOutputStream6, i5);
                            u(byteArrayOutputStream6, cVar2.f1002e);
                            i6 = i6 + 4 + (cVar2.f1002e * i3);
                            int[] iArr = cVar2.f1005h;
                            int length3 = iArr.length;
                            int i7 = i2;
                            int i8 = i3;
                            int i9 = i7;
                            while (i9 < length3) {
                                int i10 = iArr[i9];
                                u(byteArrayOutputStream6, i10 - i7);
                                i9++;
                                i7 = i10;
                            }
                            i5++;
                            i3 = i8;
                            i2 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    int i11 = i3;
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i6 == byteArray2.length) {
                        q qVar2 = new q(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(qVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < cVarArr2.length) {
                            try {
                                c cVar3 = cVarArr2[i12];
                                int i14 = 0;
                                for (Map.Entry value : cVar3.f1006i.entrySet()) {
                                    i14 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream2, cVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream3, cVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                u(byteArrayOutputStream7, i12);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i15 = i13 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream7, (long) length4, 4);
                                u(byteArrayOutputStream7, i14);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i13 = i15 + length4;
                                i12++;
                                arrayList3 = arrayList4;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i13 == byteArray5.length) {
                            q qVar3 = new q(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(qVar3);
                            long j3 = (long) 4;
                            long size = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
                            t(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i16 = 0;
                            while (i16 < arrayList2.size()) {
                                q qVar4 = (q) arrayList2.get(i16);
                                int i17 = qVar4.f1030a;
                                if (i17 == 1) {
                                    j2 = 0;
                                } else if (i17 == 2) {
                                    j2 = 1;
                                } else if (i17 == 3) {
                                    j2 = 2;
                                } else if (i17 == 4) {
                                    j2 = 3;
                                } else if (i17 == 5) {
                                    j2 = 4;
                                } else {
                                    throw null;
                                }
                                t(byteArrayOutputStream4, j2, 4);
                                t(byteArrayOutputStream4, size, 4);
                                byte[] bArr4 = qVar4.f1031b;
                                if (qVar4.f1032c) {
                                    long length5 = (long) bArr4.length;
                                    byte[] a2 = a(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    t(byteArrayOutputStream4, (long) a2.length, 4);
                                    t(byteArrayOutputStream4, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    t(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    t(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i16++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i18));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = f1012e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] b2 = b(cVarArr2, bArr5);
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b2.length, 4);
                byte[] a3 = a(b2);
                t(byteArrayOutputStream4, (long) a3.length, 4);
                byteArrayOutputStream4.write(a3);
                return true;
            }
            byte[] bArr6 = f1014g;
            if (Arrays.equals(bArr2, bArr6)) {
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                for (c cVar4 : cVarArr2) {
                    String d3 = d(cVar4.f998a, cVar4.f999b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream4, d3.getBytes(charset2).length);
                    u(byteArrayOutputStream4, cVar4.f1005h.length);
                    t(byteArrayOutputStream4, (long) (cVar4.f1006i.size() * 4), 4);
                    t(byteArrayOutputStream4, cVar4.f1000c, 4);
                    byteArrayOutputStream4.write(d3.getBytes(charset2));
                    for (Integer intValue : cVar4.f1006i.keySet()) {
                        u(byteArrayOutputStream4, intValue.intValue());
                        u(byteArrayOutputStream4, 0);
                    }
                    for (int u : cVar4.f1005h) {
                        u(byteArrayOutputStream4, u);
                    }
                }
                return true;
            }
            byte[] bArr7 = f1013f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] b3 = b(cVarArr2, bArr7);
                t(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b3.length, 4);
                byte[] a4 = a(b3);
                t(byteArrayOutputStream4, (long) a4.length, 4);
                byteArrayOutputStream4.write(a4);
                return true;
            }
            byte[] bArr8 = f1015h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            u(byteArrayOutputStream4, cVarArr2.length);
            for (c cVar5 : cVarArr2) {
                String d4 = d(cVar5.f998a, cVar5.f999b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream4, d4.getBytes(charset3).length);
                TreeMap treeMap = cVar5.f1006i;
                u(byteArrayOutputStream4, treeMap.size());
                u(byteArrayOutputStream4, cVar5.f1005h.length);
                t(byteArrayOutputStream4, cVar5.f1000c, 4);
                byteArrayOutputStream4.write(d4.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    u(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int u2 : cVar5.f1005h) {
                    u(byteArrayOutputStream4, u2);
                }
            }
            return true;
        }
        throw th2;
        throw th5;
        throw th;
        throw th3;
        throw th4;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f1002e);
        t(byteArrayOutputStream, (long) cVar.f1003f, 4);
        t(byteArrayOutputStream, cVar.f1000c, 4);
        t(byteArrayOutputStream, (long) cVar.f1004g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[((((cVar.f1004g * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : cVar.f1006i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + cVar.f1004g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i2 = 0;
        for (Map.Entry entry : cVar.f1006i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0246, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0253, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:179:0x0233, B:194:0x024f] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc A[SYNTHETIC, Splitter:B:54:0x00fc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, n.f r20, boolean r21) {
        /*
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0299 }
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L_0x008c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L_0x0041
        L_0x003f:
            r0 = r9
            goto L_0x006f
        L_0x0041:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ IOException -> 0x003f }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003f }
            r14.<init>(r0)     // Catch:{ IOException -> 0x003f }
            r7.<init>(r14)     // Catch:{ IOException -> 0x003f }
            long r14 = r7.readLong()     // Catch:{ all -> 0x0064 }
            r7.close()     // Catch:{ IOException -> 0x003f }
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = r9
        L_0x005d:
            if (r0 == 0) goto L_0x006f
            r7 = 2
            r5.a(r7, r12)
            goto L_0x006f
        L_0x0064:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch:{ IOException -> 0x003f }
        L_0x006e:
            throw r13     // Catch:{ IOException -> 0x003f }
        L_0x006f:
            if (r0 != 0) goto L_0x0072
            goto L_0x008c
        L_0x0072:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            n.p.c(r1, r9)
            goto L_0x0298
        L_0x008c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r13 = "/data/misc/profiles/cur/0"
            r3.<init>(r13, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            n.b r2 = new n.b
            java.lang.String r13 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.f992c
            if (r4 != 0) goto L_0x00ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.b(r3, r0)
        L_0x00c7:
            r7 = 1
            goto L_0x028d
        L_0x00ca:
            boolean r0 = r7.exists()
            r6 = 4
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r7.canWrite()
            if (r0 != 0) goto L_0x00db
            r2.b(r6, r12)
            goto L_0x00c7
        L_0x00db:
            r7 = 1
            goto L_0x00e1
        L_0x00dd:
            r7.createNewFile()     // Catch:{ IOException -> 0x0289 }
            goto L_0x00db
        L_0x00e1:
            r2.f995f = r7
            byte[] r7 = f1009b
            r14 = 6
            java.io.FileInputStream r0 = r2.a(r3, r13)     // Catch:{ FileNotFoundException -> 0x00f1, IOException -> 0x00ec }
            r13 = r0
            goto L_0x00f6
        L_0x00ec:
            r0 = move-exception
            r5.a(r8, r0)
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            r5.a(r14, r0)
        L_0x00f5:
            r13 = r12
        L_0x00f6:
            java.lang.String r15 = "Invalid magic"
            r14 = 8
            if (r13 == 0) goto L_0x0146
            byte[] r0 = f(r13, r6)     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            boolean r0 = java.util.Arrays.equals(r7, r0)     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            if (r0 == 0) goto L_0x0121
            byte[] r0 = f(r13, r6)     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            java.lang.String r9 = r2.f994e     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            n.c[] r9 = l(r13, r0, r9)     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            r13.close()     // Catch:{ IOException -> 0x0114 }
            goto L_0x013a
        L_0x0114:
            r0 = move-exception
            r5.a(r8, r0)
            goto L_0x013a
        L_0x0119:
            r1 = r0
            goto L_0x013d
        L_0x011b:
            r0 = move-exception
            goto L_0x0119
        L_0x011d:
            r0 = move-exception
            goto L_0x0127
        L_0x011f:
            r0 = move-exception
            goto L_0x0133
        L_0x0121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            r0.<init>(r15)     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
            throw r0     // Catch:{ IOException -> 0x011f, IllegalStateException -> 0x011d }
        L_0x0127:
            r5.a(r14, r0)     // Catch:{ all -> 0x011b }
            r13.close()     // Catch:{ IOException -> 0x012e }
            goto L_0x0139
        L_0x012e:
            r0 = move-exception
            r5.a(r8, r0)
            goto L_0x0139
        L_0x0133:
            r5.a(r8, r0)     // Catch:{ all -> 0x011b }
            r13.close()     // Catch:{ IOException -> 0x012e }
        L_0x0139:
            r9 = r12
        L_0x013a:
            r2.f996g = r9
            goto L_0x0146
        L_0x013d:
            r13.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            r5.a(r8, r0)
        L_0x0145:
            throw r1
        L_0x0146:
            n.c[] r0 = r2.f996g
            if (r0 == 0) goto L_0x01b2
            int r9 = android.os.Build.VERSION.SDK_INT
            r13 = 34
            if (r9 <= r13) goto L_0x0152
            goto L_0x01b2
        L_0x0152:
            r13 = 24
            if (r9 == r13) goto L_0x015e
            r13 = 25
            if (r9 == r13) goto L_0x015e
            switch(r9) {
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                default: goto L_0x015d;
            }
        L_0x015d:
            goto L_0x01b2
        L_0x015e:
            java.lang.String r9 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.a(r3, r9)     // Catch:{ FileNotFoundException -> 0x0185, IOException -> 0x0183, IllegalStateException -> 0x0181 }
            if (r3 == 0) goto L_0x0199
            byte[] r9 = f1010c     // Catch:{ all -> 0x0187 }
            byte[] r13 = f(r3, r6)     // Catch:{ all -> 0x0187 }
            boolean r9 = java.util.Arrays.equals(r9, r13)     // Catch:{ all -> 0x0187 }
            if (r9 == 0) goto L_0x018a
            byte[] r6 = f(r3, r6)     // Catch:{ all -> 0x0187 }
            n.c[] r0 = i(r3, r6, r4, r0)     // Catch:{ all -> 0x0187 }
            r2.f996g = r0     // Catch:{ all -> 0x0187 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0185, IOException -> 0x0183, IllegalStateException -> 0x0181 }
            r0 = r2
            goto L_0x01af
        L_0x0181:
            r0 = move-exception
            goto L_0x019f
        L_0x0183:
            r0 = move-exception
            goto L_0x01a5
        L_0x0185:
            r0 = move-exception
            goto L_0x01a9
        L_0x0187:
            r0 = move-exception
            r4 = r0
            goto L_0x0190
        L_0x018a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0187 }
            r0.<init>(r15)     // Catch:{ all -> 0x0187 }
            throw r0     // Catch:{ all -> 0x0187 }
        L_0x0190:
            r3.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0185, IOException -> 0x0183, IllegalStateException -> 0x0181 }
        L_0x0198:
            throw r4     // Catch:{ FileNotFoundException -> 0x0185, IOException -> 0x0183, IllegalStateException -> 0x0181 }
        L_0x0199:
            if (r3 == 0) goto L_0x01ae
            r3.close()     // Catch:{ FileNotFoundException -> 0x0185, IOException -> 0x0183, IllegalStateException -> 0x0181 }
            goto L_0x01ae
        L_0x019f:
            r2.f996g = r12
            r5.a(r14, r0)
            goto L_0x01ae
        L_0x01a5:
            r5.a(r8, r0)
            goto L_0x01ae
        L_0x01a9:
            r3 = 9
            r5.a(r3, r0)
        L_0x01ae:
            r0 = r12
        L_0x01af:
            if (r0 == 0) goto L_0x01b2
            r2 = r0
        L_0x01b2:
            n.f r3 = r2.f991b
            n.c[] r0 = r2.f996g
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0208
            byte[] r5 = r2.f992c
            if (r5 != 0) goto L_0x01bf
            goto L_0x0208
        L_0x01bf:
            boolean r6 = r2.f995f
            if (r6 == 0) goto L_0x0202
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01e0, IllegalStateException -> 0x01de }
            r6.<init>()     // Catch:{ IOException -> 0x01e0, IllegalStateException -> 0x01de }
            r6.write(r7)     // Catch:{ all -> 0x01e2 }
            r6.write(r5)     // Catch:{ all -> 0x01e2 }
            boolean r0 = o(r6, r5, r0)     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x01e5
            r0 = 5
            r3.a(r0, r12)     // Catch:{ all -> 0x01e2 }
            r2.f996g = r12     // Catch:{ all -> 0x01e2 }
            r6.close()     // Catch:{ IOException -> 0x01e0, IllegalStateException -> 0x01de }
            goto L_0x0208
        L_0x01de:
            r0 = move-exception
            goto L_0x01f8
        L_0x01e0:
            r0 = move-exception
            goto L_0x01fc
        L_0x01e2:
            r0 = move-exception
            r5 = r0
            goto L_0x01ef
        L_0x01e5:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01e2 }
            r2.f997h = r0     // Catch:{ all -> 0x01e2 }
            r6.close()     // Catch:{ IOException -> 0x01e0, IllegalStateException -> 0x01de }
            goto L_0x01ff
        L_0x01ef:
            r6.close()     // Catch:{ all -> 0x01f3 }
            goto L_0x01f7
        L_0x01f3:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ IOException -> 0x01e0, IllegalStateException -> 0x01de }
        L_0x01f7:
            throw r5     // Catch:{ IOException -> 0x01e0, IllegalStateException -> 0x01de }
        L_0x01f8:
            r3.a(r14, r0)
            goto L_0x01ff
        L_0x01fc:
            r3.a(r8, r0)
        L_0x01ff:
            r2.f996g = r12
            goto L_0x0208
        L_0x0202:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0208:
            byte[] r0 = r2.f997h
            if (r0 != 0) goto L_0x0210
            r0 = 0
            r7 = 1
            goto L_0x0277
        L_0x0210:
            boolean r3 = r2.f995f
            if (r3 == 0) goto L_0x0283
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0258 }
            java.io.File r0 = r2.f993d     // Catch:{ all -> 0x0258 }
            r4.<init>(r0)     // Catch:{ all -> 0x0258 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x024c }
        L_0x0224:
            int r5 = r3.read(r0)     // Catch:{ all -> 0x024c }
            if (r5 <= 0) goto L_0x022f
            r6 = 0
            r4.write(r0, r6, r5)     // Catch:{ all -> 0x024c }
            goto L_0x0224
        L_0x022f:
            r7 = 1
            r2.b(r7, r12)     // Catch:{ all -> 0x0249 }
            r4.close()     // Catch:{ all -> 0x0246 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0243, IOException -> 0x0241 }
            r2.f997h = r12
            r2.f996g = r12
            r0 = r7
            goto L_0x0277
        L_0x023f:
            r0 = move-exception
            goto L_0x027e
        L_0x0241:
            r0 = move-exception
            goto L_0x026a
        L_0x0243:
            r0 = move-exception
        L_0x0244:
            r3 = 6
            goto L_0x0272
        L_0x0246:
            r0 = move-exception
        L_0x0247:
            r4 = r0
            goto L_0x025b
        L_0x0249:
            r0 = move-exception
        L_0x024a:
            r5 = r0
            goto L_0x024f
        L_0x024c:
            r0 = move-exception
            r7 = 1
            goto L_0x024a
        L_0x024f:
            r4.close()     // Catch:{ all -> 0x0253 }
            goto L_0x0257
        L_0x0253:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ all -> 0x0246 }
        L_0x0257:
            throw r5     // Catch:{ all -> 0x0246 }
        L_0x0258:
            r0 = move-exception
            r7 = 1
            goto L_0x0247
        L_0x025b:
            r3.close()     // Catch:{ all -> 0x025f }
            goto L_0x0263
        L_0x025f:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0243, IOException -> 0x0241 }
        L_0x0263:
            throw r4     // Catch:{ FileNotFoundException -> 0x0243, IOException -> 0x0241 }
        L_0x0264:
            r0 = move-exception
            r7 = 1
            goto L_0x026a
        L_0x0267:
            r0 = move-exception
            r7 = 1
            goto L_0x0244
        L_0x026a:
            r2.b(r8, r0)     // Catch:{ all -> 0x023f }
        L_0x026d:
            r2.f997h = r12
            r2.f996g = r12
            goto L_0x0276
        L_0x0272:
            r2.b(r3, r0)     // Catch:{ all -> 0x023f }
            goto L_0x026d
        L_0x0276:
            r0 = 0
        L_0x0277:
            if (r0 == 0) goto L_0x027c
            e(r10, r11)
        L_0x027c:
            r6 = r0
            goto L_0x028e
        L_0x027e:
            r2.f997h = r12
            r2.f996g = r12
            throw r0
        L_0x0283:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0289:
            r7 = 1
            r2.b(r6, r12)
        L_0x028d:
            r6 = 0
        L_0x028e:
            if (r6 == 0) goto L_0x0294
            if (r21 == 0) goto L_0x0294
            r9 = r7
            goto L_0x0295
        L_0x0294:
            r9 = 0
        L_0x0295:
            n.p.c(r1, r9)
        L_0x0298:
            return
        L_0x0299:
            r0 = move-exception
            r5.a(r8, r0)
            r6 = 0
            n.p.c(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.g.s(android.content.Context, java.util.concurrent.Executor, n.f, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((int) ((j2 >> (i3 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, (long) i2, 2);
    }
}
