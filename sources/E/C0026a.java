package e;

import B.e;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: e.a  reason: case insensitive filesystem */
public final class C0026a implements Map {

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f485f;

    /* renamed from: g  reason: collision with root package name */
    public static int f486g;

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f487h;

    /* renamed from: i  reason: collision with root package name */
    public static int f488i;

    /* renamed from: b  reason: collision with root package name */
    public int[] f489b = C0027b.f493a;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f490c = C0027b.f494b;

    /* renamed from: d  reason: collision with root package name */
    public int f491d = 0;

    /* renamed from: e  reason: collision with root package name */
    public e f492e;

    public static int b(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            try {
                int i7 = iArr[i6];
                if (i7 < i3) {
                    i5 = i6 + 1;
                } else if (i7 <= i3) {
                    return i6;
                } else {
                    i4 = i6 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return ~i5;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0026a.class) {
                try {
                    if (f488i < 10) {
                        objArr[0] = f487h;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f487h = objArr;
                        f488i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0026a.class) {
                try {
                    if (f486g < 10) {
                        objArr[0] = f485f;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f485f = objArr;
                        f486g++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C0026a.class) {
                try {
                    Object[] objArr = f487h;
                    if (objArr != null) {
                        this.f490c = objArr;
                        f487h = (Object[]) objArr[0];
                        this.f489b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f488i--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (C0026a.class) {
                try {
                    Object[] objArr2 = f485f;
                    if (objArr2 != null) {
                        this.f490c = objArr2;
                        f485f = (Object[]) objArr2[0];
                        this.f489b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f486g--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f489b = new int[i2];
        this.f490c = new Object[(i2 << 1)];
    }

    public final void clear() {
        int i2 = this.f491d;
        if (i2 > 0) {
            int[] iArr = this.f489b;
            Object[] objArr = this.f490c;
            this.f489b = C0027b.f493a;
            this.f490c = C0027b.f494b;
            this.f491d = 0;
            c(iArr, objArr, i2);
        }
        if (this.f491d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.f491d;
        if (i3 == 0) {
            return -1;
        }
        int b2 = b(this.f489b, i3, i2);
        if (b2 < 0 || obj.equals(this.f490c[b2 << 1])) {
            return b2;
        }
        int i4 = b2 + 1;
        while (i4 < i3 && this.f489b[i4] == i2) {
            if (obj.equals(this.f490c[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = b2 - 1;
        while (i5 >= 0 && this.f489b[i5] == i2) {
            if (obj.equals(this.f490c[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final Set entrySet() {
        if (this.f492e == null) {
            this.f492e = new e(this);
        }
        e eVar = this.f492e;
        if (((C0029d) eVar.f7a) == null) {
            eVar.f7a = new C0029d(eVar, 0);
        }
        return (C0029d) eVar.f7a;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:6:0x0014=Splitter:B:6:0x0014, B:23:0x004c=Splitter:B:23:0x004c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 != r6) goto L_0x0004
            goto L_0x0073
        L_0x0004:
            boolean r0 = r6 instanceof e.C0026a
            r1 = 0
            if (r0 == 0) goto L_0x003c
            e.a r6 = (e.C0026a) r6
            int r0 = r5.f491d
            int r2 = r6.f491d
            if (r0 == r2) goto L_0x0013
            goto L_0x0075
        L_0x0013:
            r0 = r1
        L_0x0014:
            int r2 = r5.f491d     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r0 >= r2) goto L_0x0073
            java.lang.Object[] r2 = r5.f490c     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            int r3 = r0 << 1
            r4 = r2[r3]     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            int r3 = r3 + 1
            r2 = r2[r3]     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            r3 = 0
            java.lang.Object r3 = r6.getOrDefault(r4, r3)     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r2 != 0) goto L_0x0032
            if (r3 != 0) goto L_0x0075
            boolean r2 = r6.containsKey(r4)     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r2 != 0) goto L_0x0039
            goto L_0x0075
        L_0x0032:
            boolean r2 = r2.equals(r3)     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r2 != 0) goto L_0x0039
            goto L_0x0075
        L_0x0039:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x003c:
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L_0x0075
            java.util.Map r6 = (java.util.Map) r6
            int r0 = r5.f491d
            int r2 = r6.size()
            if (r0 == r2) goto L_0x004b
            goto L_0x0075
        L_0x004b:
            r0 = r1
        L_0x004c:
            int r2 = r5.f491d     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r0 >= r2) goto L_0x0073
            java.lang.Object[] r2 = r5.f490c     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            int r3 = r0 << 1
            r4 = r2[r3]     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            int r3 = r3 + 1
            r2 = r2[r3]     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            java.lang.Object r3 = r6.get(r4)     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r2 != 0) goto L_0x0069
            if (r3 != 0) goto L_0x0075
            boolean r2 = r6.containsKey(r4)     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0069:
            boolean r2 = r2.equals(r3)     // Catch:{ ClassCastException | NullPointerException -> 0x0075 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            int r0 = r0 + 1
            goto L_0x004c
        L_0x0073:
            r6 = 1
            return r6
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.C0026a.equals(java.lang.Object):boolean");
    }

    public final int f() {
        int i2 = this.f491d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f489b, i2, 0);
        if (b2 < 0 || this.f490c[b2 << 1] == null) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f489b[i3] == 0) {
            if (this.f490c[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = b2 - 1;
        while (i4 >= 0 && this.f489b[i4] == 0) {
            if (this.f490c[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final int g(Object obj) {
        int i2 = this.f491d * 2;
        Object[] objArr = this.f490c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return this.f490c[(e2 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i2) {
        Object[] objArr = this.f490c;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f491d;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f489b, objArr, i4);
            this.f489b = C0027b.f493a;
            this.f490c = C0027b.f494b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f489b;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.f490c;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f490c;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f491d) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f489b, 0, i2);
                        System.arraycopy(objArr, 0, this.f490c, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f489b, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.f490c, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f491d) {
            this.f491d = i5;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int i2;
        int[] iArr = this.f489b;
        Object[] objArr = this.f490c;
        int i3 = this.f491d;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            int i7 = iArr[i5];
            if (obj == null) {
                i2 = 0;
            } else {
                i2 = obj.hashCode();
            }
            i6 += i2 ^ i7;
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final boolean isEmpty() {
        if (this.f491d <= 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        if (this.f492e == null) {
            this.f492e = new e(this);
        }
        e eVar = this.f492e;
        if (((C0029d) eVar.f8b) == null) {
            eVar.f8b = new C0029d(eVar, 1);
        }
        return (C0029d) eVar.f8b;
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4 = this.f491d;
        if (obj == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = d(hashCode, obj);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f490c;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~i3;
        int[] iArr = this.f489b;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f490c;
            a(i7);
            if (i4 == this.f491d) {
                int[] iArr2 = this.f489b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f490c, 0, objArr2.length);
                }
                c(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f489b;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f490c;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f491d - i6) << 1);
        }
        int i9 = this.f491d;
        if (i4 == i9) {
            int[] iArr4 = this.f489b;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f490c;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f491d = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(Map map) {
        int size = map.size() + this.f491d;
        int i2 = this.f491d;
        int[] iArr = this.f489b;
        if (iArr.length < size) {
            Object[] objArr = this.f490c;
            a(size);
            if (this.f491d > 0) {
                System.arraycopy(iArr, 0, this.f489b, 0, i2);
                System.arraycopy(objArr, 0, this.f490c, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f491d == i2) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, (Object) null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return h(e2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return null;
        }
        int i2 = (e2 << 1) + 1;
        Object[] objArr = this.f490c;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f491d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f491d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f491d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = i2 << 1;
            Object obj = this.f490c[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f490c[i3 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Collection values() {
        if (this.f492e == null) {
            this.f492e = new e(this);
        }
        e eVar = this.f492e;
        if (((C0031f) eVar.f9c) == null) {
            eVar.f9c = new C0031f(eVar);
        }
        return (C0031f) eVar.f9c;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object obj3 = this.f490c[(e2 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        h(e2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        int i2 = (e2 << 1) + 1;
        Object obj4 = this.f490c[i2];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        Object[] objArr = this.f490c;
        Object obj5 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
