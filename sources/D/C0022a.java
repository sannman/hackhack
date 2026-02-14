package d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: d.a  reason: case insensitive filesystem */
public final class C0022a implements Iterable {

    /* renamed from: b  reason: collision with root package name */
    public C0024c f450b;

    /* renamed from: c  reason: collision with root package name */
    public C0024c f451c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f452d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f453e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f454f = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((d.C0023b) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof d.C0022a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            d.a r7 = (d.C0022a) r7
            int r1 = r6.f453e
            int r3 = r7.f453e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            d.b r3 = (d.C0023b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            d.b r4 = (d.C0023b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            d.b r7 = (d.C0023b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            return r0
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.C0022a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0023b bVar = (C0023b) it;
            if (!bVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        C0023b bVar = new C0023b(this.f450b, this.f451c, 0);
        this.f452d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0023b bVar = (C0023b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
