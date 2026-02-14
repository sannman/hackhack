package n;

import B.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import f.C0038g;
import f.C0039h;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final C0039h f1027a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1028b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static b f1029c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return n.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static b b() {
        b bVar = new b(12);
        f1029c = bVar;
        C0039h hVar = f1027a;
        hVar.getClass();
        if (C0038g.f524f.d(hVar, (Object) null, bVar)) {
            C0038g.b(hVar);
        }
        return f1029c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|39|40|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00cb */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            if (r19 != 0) goto L_0x0008
            B.b r0 = f1029c
            if (r0 == 0) goto L_0x0008
            goto L_0x00d4
        L_0x0008:
            java.lang.Object r1 = f1028b
            monitor-enter(r1)
            if (r19 != 0) goto L_0x0016
            B.b r0 = f1029c     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0016
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r0 = move-exception
            goto L_0x00da
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0013 }
            r2 = 28
            if (r0 < r2) goto L_0x00d5
            r2 = 30
            if (r0 != r2) goto L_0x0022
            goto L_0x00d5
        L_0x0022:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "/data/misc/profiles/ref/"
            java.lang.String r4 = r18.getPackageName()     // Catch:{ all -> 0x0013 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "primary.prof"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0013 }
            long r2 = r0.length()     // Catch:{ all -> 0x0013 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0013 }
            r4 = 0
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0048
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            r0 = r7
            goto L_0x0049
        L_0x0048:
            r0 = r4
        L_0x0049:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch:{ all -> 0x0013 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0013 }
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch:{ all -> 0x0013 }
            long r16 = r8.length()     // Catch:{ all -> 0x0013 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x006b
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x006b
            r5 = r7
            goto L_0x006c
        L_0x006b:
            r5 = r4
        L_0x006c:
            long r14 = a(r18)     // Catch:{ NameNotFoundException -> 0x00d0 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0013 }
            java.io.File r8 = r18.getFilesDir()     // Catch:{ all -> 0x0013 }
            java.lang.String r9 = "profileInstalled"
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0013 }
            boolean r8 = r6.exists()     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x008b
            n.o r8 = n.o.a(r6)     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x00d4
        L_0x008b:
            r8 = 0
        L_0x008c:
            r9 = 2
            if (r8 == 0) goto L_0x009c
            long r10 = r8.f1025c     // Catch:{ all -> 0x0013 }
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x009c
            int r10 = r8.f1024b     // Catch:{ all -> 0x0013 }
            if (r10 != r9) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r4 = r10
            goto L_0x00a3
        L_0x009c:
            if (r0 == 0) goto L_0x00a0
            r4 = r7
            goto L_0x00a3
        L_0x00a0:
            if (r5 == 0) goto L_0x00a3
            r4 = r9
        L_0x00a3:
            if (r19 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00aa
            if (r4 == r7) goto L_0x00aa
            r4 = r9
        L_0x00aa:
            if (r8 == 0) goto L_0x00b9
            int r0 = r8.f1024b     // Catch:{ all -> 0x0013 }
            if (r0 != r9) goto L_0x00b9
            if (r4 != r7) goto L_0x00b9
            long r9 = r8.f1026d     // Catch:{ all -> 0x0013 }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            r4 = 3
        L_0x00b9:
            r13 = r4
            n.o r11 = new n.o     // Catch:{ all -> 0x0013 }
            r12 = 1
            r11.<init>(r12, r13, r14, r16)     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x00c8
            boolean r0 = r8.equals(r11)     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x00cb
        L_0x00c8:
            r11.b(r6)     // Catch:{ IOException -> 0x00cb }
        L_0x00cb:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x00d4
        L_0x00d0:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
        L_0x00d4:
            return
        L_0x00d5:
            b()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            return
        L_0x00da:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.p.c(android.content.Context, boolean):void");
    }
}
