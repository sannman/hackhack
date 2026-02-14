package F;

import D.u;
import M.d;
import M.e;
import M.f;
import M.h;
import S.a;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f189b;

    /* renamed from: c  reason: collision with root package name */
    public final AssetManager f190c;

    /* renamed from: d  reason: collision with root package name */
    public final long f191d;

    /* renamed from: e  reason: collision with root package name */
    public final j f192e;

    /* renamed from: f  reason: collision with root package name */
    public final u f193f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f194g = false;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        u uVar = new u(2, (Object) this);
        this.f189b = flutterJNI;
        this.f190c = assetManager;
        this.f191d = j2;
        j jVar = new j(flutterJNI);
        this.f192e = jVar;
        jVar.e("flutter/isolate", uVar, (B.b) null);
        this.f193f = new u(3, (Object) jVar);
        if (flutterJNI.isAttached()) {
            this.f194g = true;
        }
    }

    public final void a(String str, d dVar) {
        this.f193f.a(str, dVar);
    }

    public final void b(a aVar, List list) {
        Throwable th;
        if (this.f194g) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f189b.runBundleAndSnapshotFromLibrary(aVar.f186a, aVar.f188c, aVar.f187b, this.f190c, list, this.f191d);
            this.f194g = true;
            Trace.endSection();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final B.b d(h hVar) {
        return ((j) this.f193f.f108c).d(hVar);
    }

    public final void e(String str, d dVar, B.b bVar) {
        this.f193f.e(str, dVar, bVar);
    }

    public final void f(String str, ByteBuffer byteBuffer, e eVar) {
        this.f193f.f(str, byteBuffer, eVar);
    }
}
