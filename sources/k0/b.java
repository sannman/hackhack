package k0;

import V.a;
import V.g;
import j0.C0059q;

public final class b extends a implements g {
    private volatile Object _preHandler = this;

    public b() {
        super(C0059q.f869b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Throwable r6) {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r1 > r0) goto L_0x004f
            r1 = 28
            if (r0 >= r1) goto L_0x004f
            java.lang.Object r0 = r5._preHandler
            r1 = 0
            r2 = 0
            if (r0 == r5) goto L_0x0013
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L_0x0035
        L_0x0013:
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.String r3 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x0032 }
            int r3 = r0.getModifiers()     // Catch:{ all -> 0x0032 }
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0032
            int r3 = r0.getModifiers()     // Catch:{ all -> 0x0032 }
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            r5._preHandler = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.invoke(r2, r1)
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            boolean r1 = r0 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L_0x0046
            r2 = r0
            java.lang.Thread$UncaughtExceptionHandler r2 = (java.lang.Thread.UncaughtExceptionHandler) r2
        L_0x0046:
            if (r2 == 0) goto L_0x004f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r2.uncaughtException(r0, r6)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.c(java.lang.Throwable):void");
    }
}
