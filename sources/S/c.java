package s;

import d0.e;
import java.lang.reflect.InvocationHandler;
import x.C0107b;

public final class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final e f1165a;

    /* renamed from: b  reason: collision with root package name */
    public final C0107b f1166b;

    public c(e eVar, C0107b bVar) {
        this.f1165a = eVar;
        this.f1166b = bVar;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.String r0 = "obj"
            d0.h.e(r7, r0)
            java.lang.String r0 = "method"
            d0.h.e(r8, r0)
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = "accept"
            boolean r0 = d0.h.a(r0, r1)
            x.b r1 = r6.f1166b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00be
            if (r9 == 0) goto L_0x00be
            int r0 = r9.length
            if (r0 != r3) goto L_0x00be
            r7 = r9[r4]
            d0.e r8 = r6.f1165a
            java.lang.Class r8 = r8.f477a
            java.lang.String r9 = "jClass"
            d0.h.e(r8, r9)
            java.util.Map r9 = d0.e.f474b
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            d0.h.c(r9, r0)
            java.lang.Object r9 = r9.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0043
            int r9 = r9.intValue()
            boolean r9 = d0.n.b(r9, r7)
            goto L_0x0057
        L_0x0043:
            boolean r9 = r8.isPrimitive()
            if (r9 == 0) goto L_0x0052
            d0.e r9 = d0.l.a(r8)
            java.lang.Class r9 = a.a.k(r9)
            goto L_0x0053
        L_0x0052:
            r9 = r8
        L_0x0053:
            boolean r9 = r9.isInstance(r7)
        L_0x0057:
            if (r9 != 0) goto L_0x00b3
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Value cannot be cast to "
            r9.<init>(r0)
            boolean r0 = r8.isAnonymousClass()
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r8.isLocalClass()
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r8.isArray()
            java.util.HashMap r1 = d0.e.f475c
            if (r0 == 0) goto L_0x0097
            java.lang.Class r8 = r8.getComponentType()
            boolean r0 = r8.isPrimitive()
            if (r0 == 0) goto L_0x0092
            java.lang.String r8 = r8.getName()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0092
            java.lang.String r0 = "Array"
            java.lang.String r2 = r8.concat(r0)
        L_0x0092:
            if (r2 != 0) goto L_0x00a8
            java.lang.String r2 = "kotlin.Array"
            goto L_0x00a8
        L_0x0097:
            java.lang.String r0 = r8.getName()
            java.lang.Object r0 = r1.get(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00a8
            java.lang.String r2 = r8.getCanonicalName()
        L_0x00a8:
            r9.append(r2)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L_0x00b3:
            java.lang.String r8 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast"
            d0.h.c(r7, r8)
            r1.g(r7)
            T.g r7 = T.g.f356a
            return r7
        L_0x00be:
            java.lang.String r0 = r8.getName()
            java.lang.String r5 = "equals"
            boolean r0 = d0.h.a(r0, r5)
            if (r0 == 0) goto L_0x00dd
            java.lang.Class r0 = r8.getReturnType()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00dd
            if (r9 == 0) goto L_0x00dd
            int r0 = r9.length
            if (r0 != r3) goto L_0x00dd
            r0 = r3
            goto L_0x00de
        L_0x00dd:
            r0 = r4
        L_0x00de:
            if (r0 == 0) goto L_0x00ed
            if (r9 == 0) goto L_0x00e4
            r2 = r9[r4]
        L_0x00e4:
            if (r7 != r2) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r3 = r4
        L_0x00e8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L_0x00ed:
            java.lang.String r0 = r8.getName()
            java.lang.String r2 = "hashCode"
            boolean r0 = d0.h.a(r0, r2)
            if (r0 == 0) goto L_0x0109
            java.lang.Class r0 = r8.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0109
            if (r9 != 0) goto L_0x0109
            r0 = r3
            goto L_0x010a
        L_0x0109:
            r0 = r4
        L_0x010a:
            if (r0 == 0) goto L_0x0115
            int r7 = r1.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L_0x0115:
            java.lang.String r0 = r8.getName()
            java.lang.String r2 = "toString"
            boolean r0 = d0.h.a(r0, r2)
            if (r0 == 0) goto L_0x0130
            java.lang.Class r0 = r8.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0130
            if (r9 != 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r3 = r4
        L_0x0131:
            if (r3 == 0) goto L_0x0138
            java.lang.String r7 = r1.toString()
            return r7
        L_0x0138:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected method call object:"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ", method: "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = ", args: "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
