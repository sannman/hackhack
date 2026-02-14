package H;

import B.b;
import S.a;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f240a;

    /* renamed from: b  reason: collision with root package name */
    public b f241b;

    /* renamed from: c  reason: collision with root package name */
    public long f242c;

    /* renamed from: d  reason: collision with root package name */
    public b f243d;

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f244e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f245f;

    /* renamed from: g  reason: collision with root package name */
    public Future f246g;

    public final void a(Context context, String[] strArr) {
        Throwable th;
        int i2;
        Context context2;
        boolean z2;
        String str;
        String[] strArr2 = strArr;
        if (!this.f240a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f241b != null) {
                try {
                    a.b("FlutterLoader#ensureInitializationComplete");
                    e eVar = (e) this.f246g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                    sb.append(this.f243d.f232d);
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr2 != null) {
                        Collections.addAll(arrayList, strArr2);
                    }
                    arrayList.add("--aot-shared-library-name=".concat(this.f243d.f229a));
                    arrayList.add("--aot-shared-library-name=" + this.f243d.f232d + str2 + this.f243d.f229a);
                    StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                    sb2.append(eVar.f239b);
                    arrayList.add(sb2.toString());
                    arrayList.add("--domain-network-policy=".concat(this.f243d.f231c));
                    this.f241b.getClass();
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        i2 = bundle.getInt("io.flutter.embedding.android.OldGenHeapSize");
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        context2 = context;
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        i2 = (int) ((((double) memoryInfo.totalMem) / 1000000.0d) / 2.0d);
                    } else {
                        context2 = context;
                    }
                    arrayList.add("--old-gen-heap-size=" + i2);
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                arrayList.add("--enable-impeller=true");
                            } else {
                                arrayList.add("--enable-impeller=false");
                            }
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                            arrayList.add("--enable-opengl-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                            arrayList.add("--enable-vulkan-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                            arrayList.add("--merged-platform-ui-thread=disabled");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                            arrayList.add("--enable-flutter-gpu");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                            arrayList.add("--enable-surface-control");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=".concat(string));
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                            arrayList.add("--impeller-lazy-shader-mode");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                            arrayList.add("--impeller-antialias-lines");
                        }
                    }
                    if (bundle == null) {
                        z2 = true;
                    } else {
                        z2 = bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
                    }
                    if (z2) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    arrayList.add("--leak-vm=".concat(str));
                    this.f244e.init(context2, (String[]) arrayList.toArray(new String[0]), (String) null, eVar.f238a, eVar.f239b, SystemClock.uptimeMillis() - this.f242c, Build.VERSION.SDK_INT);
                    this.f240a = true;
                    Trace.endSection();
                    return;
                } catch (Exception e2) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e2);
                    throw new RuntimeException(e2);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        } else {
            return;
        }
        throw th;
    }

    public final void b(Context context) {
        b bVar = new b(4);
        if (this.f241b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f241b = bVar;
                    this.f242c = SystemClock.uptimeMillis();
                    this.f243d = a.a(applicationContext);
                    s a2 = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f244e);
                    a2.f808b.setAsyncWaitForVsyncDelegate(a2.f810d);
                    this.f246g = this.f245f.submit(new d(this, applicationContext));
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        } else {
            return;
        }
        throw th;
    }
}
