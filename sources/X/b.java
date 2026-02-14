package X;

import V.d;
import V.e;
import V.f;
import V.g;
import V.i;
import W.a;
import d0.h;
import j0.C0047e;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.C0087a;

public abstract class b implements d, c, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final d f376b;

    /* renamed from: c  reason: collision with root package name */
    public final i f377c;

    /* renamed from: d  reason: collision with root package name */
    public transient d f378d;

    public b(d dVar) {
        i iVar;
        if (dVar != null) {
            iVar = dVar.i();
        } else {
            iVar = null;
        }
        this.f376b = dVar;
        this.f377c = iVar;
    }

    public d b(d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final void c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0047e eVar;
        d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            d dVar2 = bVar.f376b;
            h.b(dVar2);
            try {
                obj = bVar.h(obj);
                if (obj == a.f373b) {
                    return;
                }
            } catch (Throwable th) {
                obj = a.a.g(th);
            }
            d dVar3 = bVar.f378d;
            if (!(dVar3 == null || dVar3 == bVar)) {
                i iVar = bVar.f377c;
                h.b(iVar);
                g g2 = iVar.g(e.f371b);
                h.b(g2);
                f fVar = (f) g2;
                o0.h hVar = (o0.h) dVar3;
                do {
                    atomicReferenceFieldUpdater = o0.h.f1064i;
                } while (atomicReferenceFieldUpdater.get(hVar) == C0087a.f1054d);
                Object obj2 = atomicReferenceFieldUpdater.get(hVar);
                if (obj2 instanceof C0047e) {
                    eVar = (C0047e) obj2;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.n();
                }
            }
            bVar.f378d = a.f375b;
            if (dVar2 instanceof b) {
                dVar = dVar2;
            } else {
                dVar2.c(obj);
                return;
            }
        }
    }

    public final c e() {
        d dVar = this.f376b;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    public abstract Object h(Object obj);

    public final i i() {
        i iVar = this.f377c;
        h.b(iVar);
        return iVar;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.StackTraceElement] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.Class r1 = r11.getClass()
            java.lang.Class<X.d> r2 = X.d.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            X.d r1 = (X.d) r1
            r2 = 0
            if (r1 != 0) goto L_0x0018
            goto L_0x00fd
        L_0x0018:
            int r3 = r1.v()
            r4 = 1
            if (r3 > r4) goto L_0x0110
            r3 = -1
            r5 = 0
            java.lang.Class r6 = r11.getClass()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r7 = "label"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0044 }
            r6.setAccessible(r4)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r6 = r6.get(r11)     // Catch:{ Exception -> 0x0044 }
            boolean r7 = r6 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0044 }
            if (r7 == 0) goto L_0x0039
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0044 }
            goto L_0x003a
        L_0x0039:
            r6 = r2
        L_0x003a:
            if (r6 == 0) goto L_0x0041
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0042
        L_0x0041:
            r6 = r5
        L_0x0042:
            int r6 = r6 - r4
            goto L_0x0045
        L_0x0044:
            r6 = r3
        L_0x0045:
            if (r6 >= 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int[] r3 = r1.l()
            r3 = r3[r6]
        L_0x004e:
            C.b r4 = X.e.f380b
            C.b r6 = X.e.f379a
            if (r4 != 0) goto L_0x0096
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r7 = "getModule"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0093 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0093 }
            java.lang.Class r7 = r11.getClass()     // Catch:{ Exception -> 0x0093 }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r8 = "java.lang.Module"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r8 = "getDescriptor"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0093 }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r9)     // Catch:{ Exception -> 0x0093 }
            java.lang.Class r8 = r11.getClass()     // Catch:{ Exception -> 0x0093 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r9 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r8 = r8.loadClass(r9)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r9 = "name"
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0093 }
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0093 }
            C.b r9 = new C.b     // Catch:{ Exception -> 0x0093 }
            r9.<init>(r4, r7, r8)     // Catch:{ Exception -> 0x0093 }
            X.e.f380b = r9     // Catch:{ Exception -> 0x0093 }
            r4 = r9
            goto L_0x0096
        L_0x0093:
            X.e.f380b = r6
            r4 = r6
        L_0x0096:
            if (r4 != r6) goto L_0x0099
            goto L_0x00d0
        L_0x0099:
            java.lang.Object r6 = r4.f13a
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x00d0
            java.lang.Class r7 = r11.getClass()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = r6.invoke(r7, r8)
            if (r6 != 0) goto L_0x00ac
            goto L_0x00d0
        L_0x00ac:
            java.lang.Object r7 = r4.f14b
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L_0x00d0
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = r7.invoke(r6, r8)
            if (r6 != 0) goto L_0x00bb
            goto L_0x00d0
        L_0x00bb:
            java.lang.Object r4 = r4.f15c
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L_0x00c8
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r4 = r4.invoke(r6, r5)
            goto L_0x00c9
        L_0x00c8:
            r4 = r2
        L_0x00c9:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x00d0
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        L_0x00d0:
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = r1.c()
            goto L_0x00ef
        L_0x00d7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 47
            r4.append(r2)
            java.lang.String r2 = r1.c()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x00ef:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.String r5 = r1.m()
            java.lang.String r1 = r1.f()
            r4.<init>(r2, r5, r1, r3)
            r2 = r4
        L_0x00fd:
            if (r2 == 0) goto L_0x0100
            goto L_0x0108
        L_0x0100:
            java.lang.Class r1 = r11.getClass()
            java.lang.String r2 = r1.getName()
        L_0x0108:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0110:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Debug metadata version mismatch. Expected: 1, got "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please update the Kotlin standard library."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.b.toString():java.lang.String");
    }
}
