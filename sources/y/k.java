package y;

import D.C0018t;
import android.app.Activity;
import io.flutter.plugin.platform.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import w.C0105a;

public final class k implements C0105a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile k f1250c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f1251d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final i f1252a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f1253b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f1252a = iVar;
        if (iVar != null) {
            iVar.d(new c(6, this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: v.k} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079 A[Catch:{ all -> 0x0022 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r9, n.e r10, D.C0018t r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0008
            android.app.Activity r9 = (android.app.Activity) r9
            goto L_0x0009
        L_0x0008:
            r9 = r1
        L_0x0009:
            U.m r0 = U.m.f364b
            if (r9 == 0) goto L_0x00ad
            java.util.concurrent.locks.ReentrantLock r2 = f1251d
            r2.lock()
            y.i r3 = r8.f1252a     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0025
            v.k r9 = new v.k     // Catch:{ all -> 0x0022 }
            r9.<init>(r0)     // Catch:{ all -> 0x0022 }
            r11.accept(r9)     // Catch:{ all -> 0x0022 }
            r2.unlock()
            return
        L_0x0022:
            r9 = move-exception
            goto L_0x00a9
        L_0x0025:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.f1253b
            r5 = 0
            if (r4 == 0) goto L_0x0031
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0022 }
            if (r6 == 0) goto L_0x0031
            goto L_0x004a
        L_0x0031:
            java.util.Iterator r6 = r4.iterator()     // Catch:{ all -> 0x0022 }
        L_0x0035:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x004a
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0022 }
            y.j r7 = (y.j) r7     // Catch:{ all -> 0x0022 }
            android.app.Activity r7 = r7.f1247a     // Catch:{ all -> 0x0022 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0035
            r5 = 1
        L_0x004a:
            y.j r6 = new y.j     // Catch:{ all -> 0x0022 }
            r6.<init>(r9, r10, r11)     // Catch:{ all -> 0x0022 }
            r4.add(r6)     // Catch:{ all -> 0x0022 }
            if (r5 != 0) goto L_0x0079
            android.view.Window r10 = r9.getWindow()     // Catch:{ all -> 0x0022 }
            if (r10 == 0) goto L_0x0062
            android.view.WindowManager$LayoutParams r10 = r10.getAttributes()     // Catch:{ all -> 0x0022 }
            if (r10 == 0) goto L_0x0062
            android.os.IBinder r1 = r10.token     // Catch:{ all -> 0x0022 }
        L_0x0062:
            if (r1 == 0) goto L_0x0068
            r3.c(r1, r9)     // Catch:{ all -> 0x0022 }
            goto L_0x00a3
        L_0x0068:
            y.h r10 = new y.h     // Catch:{ all -> 0x0022 }
            r10.<init>(r3, r9)     // Catch:{ all -> 0x0022 }
            android.view.Window r9 = r9.getWindow()     // Catch:{ all -> 0x0022 }
            android.view.View r9 = r9.getDecorView()     // Catch:{ all -> 0x0022 }
            r9.addOnAttachStateChangeListener(r10)     // Catch:{ all -> 0x0022 }
            goto L_0x00a3
        L_0x0079:
            java.util.Iterator r10 = r4.iterator()     // Catch:{ all -> 0x0022 }
        L_0x007d:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0022 }
            r4 = r3
            y.j r4 = (y.j) r4     // Catch:{ all -> 0x0022 }
            android.app.Activity r4 = r4.f1247a     // Catch:{ all -> 0x0022 }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x007d
            goto L_0x0094
        L_0x0093:
            r3 = r1
        L_0x0094:
            y.j r3 = (y.j) r3     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x009a
            v.k r1 = r3.f1249c     // Catch:{ all -> 0x0022 }
        L_0x009a:
            if (r1 == 0) goto L_0x00a3
            r6.f1249c = r1     // Catch:{ all -> 0x0022 }
            D.t r9 = r6.f1248b     // Catch:{ all -> 0x0022 }
            r9.accept(r1)     // Catch:{ all -> 0x0022 }
        L_0x00a3:
            r2.unlock()
            T.g r1 = T.g.f356a
            goto L_0x00ad
        L_0x00a9:
            r2.unlock()
            throw r9
        L_0x00ad:
            if (r1 != 0) goto L_0x00b7
            v.k r9 = new v.k
            r9.<init>(r0)
            r11.accept(r9)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.k.a(android.content.Context, n.e, D.t):void");
    }

    public final void b(C0018t tVar) {
        synchronized (f1251d) {
            try {
                if (this.f1252a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f1253b.iterator();
                    while (it.hasNext()) {
                        j jVar = (j) it.next();
                        if (jVar.f1248b == tVar) {
                            arrayList.add(jVar);
                        }
                    }
                    this.f1253b.removeAll(arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Activity activity = ((j) it2.next()).f1247a;
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f1253b;
                        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                            Iterator it3 = copyOnWriteArrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((j) it3.next()).f1247a.equals(activity)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        i iVar = this.f1252a;
                        if (iVar != null) {
                            iVar.b(activity);
                        }
                    }
                }
            } finally {
            }
        }
    }
}
