package U;

import d0.h;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class c extends AbstractList implements List {

    /* renamed from: e  reason: collision with root package name */
    public static final Object[] f359e = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public int f360b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f361c = f359e;

    /* renamed from: d  reason: collision with root package name */
    public int f362d;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f361c.length;
        while (i2 < length && it.hasNext()) {
            this.f361c[i2] = it.next();
            i2++;
        }
        int i3 = this.f360b;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f361c[i4] = it.next();
        }
        this.f362d = collection.size() + this.f362d;
    }

    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f362d;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i4);
        } else if (i2 == i4) {
            addLast(obj);
        } else if (i2 == 0) {
            addFirst(obj);
        } else {
            g();
            b(this.f362d + 1);
            int f2 = f(this.f360b + i2);
            int i5 = this.f362d;
            if (i2 < ((i5 + 1) >> 1)) {
                if (f2 == 0) {
                    Object[] objArr = this.f361c;
                    h.e(objArr, "<this>");
                    f2 = objArr.length;
                }
                int i6 = f2 - 1;
                int i7 = this.f360b;
                if (i7 == 0) {
                    Object[] objArr2 = this.f361c;
                    h.e(objArr2, "<this>");
                    i3 = objArr2.length - 1;
                } else {
                    i3 = i7 - 1;
                }
                int i8 = this.f360b;
                if (i6 >= i8) {
                    Object[] objArr3 = this.f361c;
                    objArr3[i3] = objArr3[i8];
                    d.E(objArr3, objArr3, i8, i8 + 1, i6 + 1);
                } else {
                    Object[] objArr4 = this.f361c;
                    d.E(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                    Object[] objArr5 = this.f361c;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    d.E(objArr5, objArr5, 0, 1, i6 + 1);
                }
                this.f361c[i6] = obj;
                this.f360b = i3;
            } else {
                int f3 = f(this.f360b + i5);
                if (f2 < f3) {
                    Object[] objArr6 = this.f361c;
                    d.E(objArr6, objArr6, f2 + 1, f2, f3);
                } else {
                    Object[] objArr7 = this.f361c;
                    d.E(objArr7, objArr7, 1, 0, f3);
                    Object[] objArr8 = this.f361c;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    d.E(objArr8, objArr8, f2 + 1, f2, objArr8.length - 1);
                }
                this.f361c[f2] = obj;
            }
            this.f362d++;
        }
    }

    public final boolean addAll(int i2, Collection collection) {
        h.e(collection, "elements");
        int i3 = this.f362d;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i2 == this.f362d) {
                return addAll(collection);
            }
            g();
            b(collection.size() + this.f362d);
            int f2 = f(this.f360b + this.f362d);
            int f3 = f(this.f360b + i2);
            int size = collection.size();
            if (i2 < ((this.f362d + 1) >> 1)) {
                int i4 = this.f360b;
                int i5 = i4 - size;
                if (f3 < i4) {
                    Object[] objArr = this.f361c;
                    d.E(objArr, objArr, i5, i4, objArr.length);
                    if (size >= f3) {
                        Object[] objArr2 = this.f361c;
                        d.E(objArr2, objArr2, objArr2.length - size, 0, f3);
                    } else {
                        Object[] objArr3 = this.f361c;
                        d.E(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f361c;
                        d.E(objArr4, objArr4, 0, size, f3);
                    }
                } else if (i5 >= 0) {
                    Object[] objArr5 = this.f361c;
                    d.E(objArr5, objArr5, i5, i4, f3);
                } else {
                    Object[] objArr6 = this.f361c;
                    i5 += objArr6.length;
                    int i6 = f3 - i4;
                    int length = objArr6.length - i5;
                    if (length >= i6) {
                        d.E(objArr6, objArr6, i5, i4, f3);
                    } else {
                        d.E(objArr6, objArr6, i5, i4, i4 + length);
                        Object[] objArr7 = this.f361c;
                        d.E(objArr7, objArr7, 0, this.f360b + length, f3);
                    }
                }
                this.f360b = i5;
                a(d(f3 - size), collection);
                return true;
            }
            int i7 = f3 + size;
            if (f3 < f2) {
                int i8 = size + f2;
                Object[] objArr8 = this.f361c;
                if (i8 <= objArr8.length) {
                    d.E(objArr8, objArr8, i7, f3, f2);
                } else if (i7 >= objArr8.length) {
                    d.E(objArr8, objArr8, i7 - objArr8.length, f3, f2);
                } else {
                    int length2 = f2 - (i8 - objArr8.length);
                    d.E(objArr8, objArr8, 0, length2, f2);
                    Object[] objArr9 = this.f361c;
                    d.E(objArr9, objArr9, i7, f3, length2);
                }
            } else {
                Object[] objArr10 = this.f361c;
                d.E(objArr10, objArr10, size, 0, f2);
                Object[] objArr11 = this.f361c;
                if (i7 >= objArr11.length) {
                    d.E(objArr11, objArr11, i7 - objArr11.length, f3, objArr11.length);
                } else {
                    d.E(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f361c;
                    d.E(objArr12, objArr12, i7, f3, objArr12.length - size);
                }
            }
            a(f3, collection);
            return true;
        }
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f362d + 1);
        int i2 = this.f360b;
        if (i2 == 0) {
            Object[] objArr = this.f361c;
            h.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f360b = i3;
        this.f361c[i3] = obj;
        this.f362d++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f362d + 1);
        this.f361c[f(this.f360b + this.f362d)] = obj;
        this.f362d++;
    }

    public final void b(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f361c;
            if (i2 > objArr.length) {
                if (objArr == f359e) {
                    if (i2 < 10) {
                        i2 = 10;
                    }
                    this.f361c = new Object[i2];
                    return;
                }
                int length = objArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                if (i3 - 2147483639 > 0) {
                    if (i2 > 2147483639) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i3];
                d.E(objArr, objArr2, 0, this.f360b, objArr.length);
                Object[] objArr3 = this.f361c;
                int length2 = objArr3.length;
                int i4 = this.f360b;
                d.E(objArr3, objArr2, length2 - i4, 0, i4);
                this.f360b = 0;
                this.f361c = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int i2) {
        Object[] objArr = this.f361c;
        h.e(objArr, "<this>");
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f360b, f(this.f360b + this.f362d));
        }
        this.f360b = 0;
        this.f362d = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i2) {
        if (i2 < 0) {
            return i2 + this.f361c.length;
        }
        return i2;
    }

    public final void e(int i2, int i3) {
        if (i2 < i3) {
            Object[] objArr = this.f361c;
            h.e(objArr, "<this>");
            Arrays.fill(objArr, i2, i3, (Object) null);
            return;
        }
        Object[] objArr2 = this.f361c;
        Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
        Object[] objArr3 = this.f361c;
        h.e(objArr3, "<this>");
        Arrays.fill(objArr3, 0, i3, (Object) null);
    }

    public final int f(int i2) {
        Object[] objArr = this.f361c;
        if (i2 >= objArr.length) {
            return i2 - objArr.length;
        }
        return i2;
    }

    public final void g() {
        this.modCount++;
    }

    public final Object get(int i2) {
        int i3 = this.f362d;
        if (i2 >= 0 && i2 < i3) {
            return this.f361c[f(this.f360b + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    public final int indexOf(Object obj) {
        int i2;
        int f2 = f(this.f360b + this.f362d);
        int i3 = this.f360b;
        if (i3 < f2) {
            while (i3 < f2) {
                if (h.a(obj, this.f361c[i3])) {
                    i2 = this.f360b;
                } else {
                    i3++;
                }
            }
            return -1;
        } else if (i3 < f2) {
            return -1;
        } else {
            int length = this.f361c.length;
            while (true) {
                if (i3 >= length) {
                    int i4 = 0;
                    while (i4 < f2) {
                        if (h.a(obj, this.f361c[i4])) {
                            i3 = i4 + this.f361c.length;
                            i2 = this.f360b;
                        } else {
                            i4++;
                        }
                    }
                    return -1;
                } else if (h.a(obj, this.f361c[i3])) {
                    i2 = this.f360b;
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i3 - i2;
    }

    public final boolean isEmpty() {
        if (this.f362d == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i2;
        int i3;
        int f2 = f(this.f360b + this.f362d);
        int i4 = this.f360b;
        if (i4 < f2) {
            i2 = f2 - 1;
            if (i4 <= i2) {
                while (!h.a(obj, this.f361c[i2])) {
                    if (i2 != i4) {
                        i2--;
                    }
                }
                i3 = this.f360b;
            }
            return -1;
        }
        if (i4 > f2) {
            int i5 = f2 - 1;
            while (true) {
                if (-1 >= i5) {
                    Object[] objArr = this.f361c;
                    h.e(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i6 = this.f360b;
                    if (i6 <= length) {
                        while (!h.a(obj, this.f361c[i2])) {
                            if (i2 != i6) {
                                length = i2 - 1;
                            }
                        }
                        i3 = this.f360b;
                    }
                } else if (h.a(obj, this.f361c[i5])) {
                    i2 = i5 + this.f361c.length;
                    i3 = this.f360b;
                    break;
                } else {
                    i5--;
                }
            }
        }
        return -1;
        return i2 - i3;
    }

    public final Object remove(int i2) {
        int i3 = this.f362d;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        } else if (i2 == i3 - 1) {
            return removeLast();
        } else {
            if (i2 == 0) {
                return removeFirst();
            }
            g();
            int f2 = f(this.f360b + i2);
            Object[] objArr = this.f361c;
            Object obj = objArr[f2];
            int i4 = this.f362d;
            if (i2 < (i4 >> 1)) {
                int i5 = this.f360b;
                if (f2 >= i5) {
                    d.E(objArr, objArr, i5 + 1, i5, f2);
                } else {
                    d.E(objArr, objArr, 1, 0, f2);
                    Object[] objArr2 = this.f361c;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i6 = this.f360b;
                    d.E(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
                }
                Object[] objArr3 = this.f361c;
                int i7 = this.f360b;
                objArr3[i7] = null;
                this.f360b = c(i7);
            } else {
                int f3 = f((i4 - 1) + this.f360b);
                if (f2 <= f3) {
                    Object[] objArr4 = this.f361c;
                    d.E(objArr4, objArr4, f2, f2 + 1, f3 + 1);
                } else {
                    Object[] objArr5 = this.f361c;
                    d.E(objArr5, objArr5, f2, f2 + 1, objArr5.length);
                    Object[] objArr6 = this.f361c;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    d.E(objArr6, objArr6, 0, 1, f3 + 1);
                }
                this.f361c[f3] = null;
            }
            this.f362d--;
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            d0.h.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0094
            java.lang.Object[] r0 = r11.f361c
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0094
        L_0x0013:
            int r0 = r11.f360b
            int r2 = r11.f362d
            int r0 = r0 + r2
            int r0 = r11.f(r0)
            int r2 = r11.f360b
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f361c
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f361c
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f361c
            java.lang.String r2 = "<this>"
            d0.h.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f361c
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f361c
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f361c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = r4
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.f(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f361c
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f361c
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = r4
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0094
            r11.g()
            int r12 = r11.f360b
            int r5 = r5 - r12
            int r12 = r11.d(r5)
            r11.f362d = r12
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            g();
            Object[] objArr = this.f361c;
            int i2 = this.f360b;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f360b = c(i2);
            this.f362d--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            g();
            int f2 = f((this.f362d - 1) + this.f360b);
            Object[] objArr = this.f361c;
            Object obj = objArr[f2];
            objArr[f2] = null;
            this.f362d--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void removeRange(int i2, int i3) {
        int i4 = this.f362d;
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        } else if (i2 <= i3) {
            int i5 = i3 - i2;
            if (i5 != 0) {
                if (i5 == this.f362d) {
                    clear();
                } else if (i5 == 1) {
                    remove(i2);
                } else {
                    g();
                    if (i2 < this.f362d - i3) {
                        int f2 = f((i2 - 1) + this.f360b);
                        int f3 = f((i3 - 1) + this.f360b);
                        while (i2 > 0) {
                            int i6 = f2 + 1;
                            int min = Math.min(i2, Math.min(i6, f3 + 1));
                            Object[] objArr = this.f361c;
                            int i7 = f3 - min;
                            int i8 = f2 - min;
                            d.E(objArr, objArr, i7 + 1, i8 + 1, i6);
                            f2 = d(i8);
                            f3 = d(i7);
                            i2 -= min;
                        }
                        int f4 = f(this.f360b + i5);
                        e(this.f360b, f4);
                        this.f360b = f4;
                    } else {
                        int f5 = f(this.f360b + i3);
                        int f6 = f(this.f360b + i2);
                        int i9 = this.f362d;
                        while (true) {
                            i9 -= i3;
                            if (i9 <= 0) {
                                break;
                            }
                            Object[] objArr2 = this.f361c;
                            i3 = Math.min(i9, Math.min(objArr2.length - f5, objArr2.length - f6));
                            Object[] objArr3 = this.f361c;
                            int i10 = f5 + i3;
                            d.E(objArr3, objArr3, f6, f5, i10);
                            f5 = f(i10);
                            f6 = f(f6 + i3);
                        }
                        int f7 = f(this.f360b + this.f362d);
                        e(d(f7 - i5), f7);
                    }
                    this.f362d -= i5;
                }
            }
        } else {
            throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            d0.h.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0094
            java.lang.Object[] r0 = r11.f361c
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0094
        L_0x0013:
            int r0 = r11.f360b
            int r2 = r11.f362d
            int r0 = r0 + r2
            int r0 = r11.f(r0)
            int r2 = r11.f360b
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f361c
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f361c
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f361c
            java.lang.String r2 = "<this>"
            d0.h.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f361c
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f361c
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f361c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = r4
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.f(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f361c
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f361c
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = r4
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0094
            r11.g()
            int r12 = r11.f360b
            int r5 = r5 - r12
            int r12 = r11.d(r5)
            r11.f362d = r12
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i2, Object obj) {
        int i3 = this.f362d;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int f2 = f(this.f360b + i2);
        Object[] objArr = this.f361c;
        Object obj2 = objArr[f2];
        objArr[f2] = obj;
        return obj2;
    }

    public final int size() {
        return this.f362d;
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f362d]);
    }

    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f362d;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f2 = f(this.f360b + this.f362d);
        int i3 = this.f360b;
        if (i3 < f2) {
            d.E(this.f361c, objArr, 0, i3, f2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f361c;
            d.E(objArr2, objArr, 0, this.f360b, objArr2.length);
            Object[] objArr3 = this.f361c;
            d.E(objArr3, objArr, objArr3.length - this.f360b, 0, f2);
        }
        int i4 = this.f362d;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f362d);
        a(f(this.f360b + this.f362d), collection);
        return true;
    }
}
