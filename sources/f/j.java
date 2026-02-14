package F;

import C.b;
import D.u;
import M.d;
import M.e;
import M.f;
import M.h;
import S.a;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p.C0088a;

public final class j implements f, k {

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f214b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f215c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f216d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Object f217e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f218f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f219g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public int f220h = 1;

    /* renamed from: i  reason: collision with root package name */
    public final l f221i = new l();

    /* renamed from: j  reason: collision with root package name */
    public final WeakHashMap f222j = new WeakHashMap();

    /* renamed from: k  reason: collision with root package name */
    public final u f223k;

    public j(FlutterJNI flutterJNI) {
        u uVar = new u();
        uVar.f108c = (ExecutorService) b.d().f15c;
        this.f214b = flutterJNI;
        this.f223k = uVar;
    }

    public final void a(String str, d dVar) {
        e(str, dVar, (B.b) null);
    }

    public final void b(String str, f fVar, ByteBuffer byteBuffer, int i2, long j2) {
        e eVar;
        if (fVar != null) {
            eVar = fVar.f205b;
        } else {
            eVar = null;
        }
        String a2 = a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            C0088a.a(a.a.A(a2), i2);
        } else {
            String A = a.a.A(a2);
            try {
                if (a.a.f386c == null) {
                    a.a.f386c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                a.a.f386c.invoke((Object) null, new Object[]{Long.valueOf(a.a.f384a), A, Integer.valueOf(i2)});
            } catch (Exception e2) {
                a.a.l("asyncTraceBegin", e2);
            }
        }
        c cVar = new c(this, str, i2, fVar, byteBuffer, j2);
        if (eVar == null) {
            eVar = this.f221i;
        }
        eVar.a(cVar);
    }

    public final B.b d(h hVar) {
        u uVar = this.f223k;
        uVar.getClass();
        i iVar = new i((ExecutorService) uVar.f108c);
        B.b bVar = new B.b(3);
        this.f222j.put(bVar, iVar);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r10.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        r11 = (F.d) r10.next();
        b(r9, (F.f) r8.f215c.get(r9), r11.f201a, r11.f202b, r11.f203c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r9, M.d r10, B.b r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0010
            java.lang.Object r1 = r8.f217e
            monitor-enter(r1)
            java.util.HashMap r10 = r8.f215c     // Catch:{ all -> 0x000c }
            r10.remove(r9)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r9
        L_0x0010:
            if (r11 == 0) goto L_0x0025
            java.util.WeakHashMap r0 = r8.f222j
            java.lang.Object r11 = r0.get(r11)
            F.e r11 = (F.e) r11
            if (r11 == 0) goto L_0x001d
            goto L_0x0026
        L_0x001d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0025:
            r11 = 0
        L_0x0026:
            java.lang.Object r1 = r8.f217e
            monitor-enter(r1)
            java.util.HashMap r0 = r8.f215c     // Catch:{ all -> 0x003f }
            F.f r2 = new F.f     // Catch:{ all -> 0x003f }
            r2.<init>(r10, r11)     // Catch:{ all -> 0x003f }
            r0.put(r9, r2)     // Catch:{ all -> 0x003f }
            java.util.HashMap r10 = r8.f216d     // Catch:{ all -> 0x003f }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x003f }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x003f }
            if (r10 != 0) goto L_0x0042
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r0 = move-exception
            r9 = r0
            goto L_0x0069
        L_0x0042:
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            java.util.Iterator r10 = r10.iterator()
        L_0x0047:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0068
            java.lang.Object r11 = r10.next()
            F.d r11 = (F.d) r11
            java.util.HashMap r0 = r8.f215c
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            F.f r3 = (F.f) r3
            java.nio.ByteBuffer r4 = r11.f201a
            int r5 = r11.f202b
            long r6 = r11.f203c
            r1 = r8
            r2 = r9
            r1.b(r2, r3, r4, r5, r6)
            goto L_0x0047
        L_0x0068:
            return
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F.j.e(java.lang.String, M.d, B.b):void");
    }

    public final void f(String str, ByteBuffer byteBuffer, e eVar) {
        a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f220h;
            this.f220h = i2 + 1;
            if (eVar != null) {
                this.f219g.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f214b;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
            Trace.endSection();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
