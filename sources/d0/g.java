package d0;

import g0.a;

public abstract class g extends c implements f, a, T.a {

    /* renamed from: h  reason: collision with root package name */
    public final int f478h;

    /* renamed from: i  reason: collision with root package name */
    public final int f479i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 != r0) goto L_0x000c
            r7 = r0
        L_0x0006:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto L_0x000e
        L_0x000c:
            r7 = r1
            goto L_0x0006
        L_0x000e:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f478h = r9
            r2.f479i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public final a c() {
        l.f484a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!this.f471e.equals(gVar.f471e) || !this.f472f.equals(gVar.f472f) || this.f479i != gVar.f479i || this.f478h != gVar.f478h || !this.f469c.equals(gVar.f469c) || !b().equals(gVar.b())) {
                return false;
            }
            return true;
        } else if (!(obj instanceof g)) {
            return false;
        } else {
            a aVar = this.f468b;
            if (aVar == null) {
                c();
                this.f468b = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final int f() {
        return this.f478h;
    }

    public final int hashCode() {
        b();
        int hashCode = this.f471e.hashCode();
        return this.f472f.hashCode() + ((hashCode + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a aVar = this.f468b;
        if (aVar == null) {
            c();
            this.f468b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f471e;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
