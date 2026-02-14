package F;

import S.a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import p.C0088a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f196c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f197d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f198e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f199f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f200g;

    public /* synthetic */ c(j jVar, String str, int i2, f fVar, ByteBuffer byteBuffer, long j2) {
        this.f195b = jVar;
        this.f196c = str;
        this.f197d = i2;
        this.f198e = fVar;
        this.f199f = byteBuffer;
        this.f200g = j2;
    }

    public final void run() {
        long j2 = this.f200g;
        FlutterJNI flutterJNI = this.f195b.f214b;
        StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
        String str = this.f196c;
        sb.append(str);
        String a2 = a.a(sb.toString());
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f197d;
        if (i2 >= 29) {
            C0088a.b(a.a.A(a2), i3);
        } else {
            String A = a.a.A(a2);
            try {
                if (a.a.f387d == null) {
                    a.a.f387d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                a.a.f387d.invoke((Object) null, new Object[]{Long.valueOf(a.a.f384a), A, Integer.valueOf(i3)});
            } catch (Exception e2) {
                a.a.l("asyncTraceEnd", e2);
            }
        }
        try {
            a.b("DartMessenger#handleMessageFromDart on " + str);
            f fVar = this.f198e;
            ByteBuffer byteBuffer = this.f199f;
            if (fVar != null) {
                try {
                    fVar.f204a.c(byteBuffer, new g(flutterJNI, i3));
                } catch (Exception e3) {
                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e3);
                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
                } catch (Error e4) {
                    Thread currentThread = Thread.currentThread();
                    if (currentThread.getUncaughtExceptionHandler() != null) {
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
                    } else {
                        throw e4;
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
            }
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
            Trace.endSection();
            flutterJNI.cleanupMessageData(j2);
        } catch (Throwable th2) {
            flutterJNI.cleanupMessageData(j2);
            throw th2;
        }
    }
}
