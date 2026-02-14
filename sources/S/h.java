package s;

import T.e;
import java.math.BigInteger;
import r.C0090a;

public final class h implements Comparable {

    /* renamed from: g  reason: collision with root package name */
    public static final h f1177g = new h(0, 1, 0, "");

    /* renamed from: b  reason: collision with root package name */
    public final int f1178b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1179c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1180d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1181e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1182f = new e(new C0090a(1, this));

    static {
        new h(0, 0, 0, "");
        new h(1, 0, 0, "");
    }

    public h(int i2, int i3, int i4, String str) {
        this.f1178b = i2;
        this.f1179c = i3;
        this.f1180d = i4;
        this.f1181e = str;
    }

    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        d0.h.e(hVar, "other");
        Object a2 = this.f1182f.a();
        d0.h.d(a2, "<get-bigInteger>(...)");
        Object a3 = hVar.f1182f.a();
        d0.h.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (s.h) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof s.h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            s.h r4 = (s.h) r4
            int r0 = r4.f1178b
            int r2 = r3.f1178b
            if (r2 != r0) goto L_0x001c
            int r0 = r3.f1179c
            int r2 = r4.f1179c
            if (r0 != r2) goto L_0x001c
            int r0 = r3.f1180d
            int r4 = r4.f1180d
            if (r0 != r4) goto L_0x001c
            r4 = 1
            return r4
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((527 + this.f1178b) * 31) + this.f1179c) * 31) + this.f1180d;
    }

    public final String toString() {
        String str;
        String str2 = this.f1181e;
        int i2 = 0;
        while (true) {
            if (i2 >= str2.length()) {
                str = "";
                break;
            }
            char charAt = str2.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                str = "-".concat(str2);
                break;
            }
            i2++;
        }
        return this.f1178b + '.' + this.f1179c + '.' + this.f1180d + str;
    }
}
