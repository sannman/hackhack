package D;

import E.c;
import E.e;
import L.b;
import L.d;
import L.k;
import S.a;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.f;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.j;
import io.flutter.plugin.platform.p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: D.f  reason: case insensitive filesystem */
public abstract class C0005f extends Activity implements l {

    /* renamed from: e  reason: collision with root package name */
    public static final int f68e = View.generateViewId();

    /* renamed from: a  reason: collision with root package name */
    public boolean f69a = false;

    /* renamed from: b  reason: collision with root package name */
    public C0008i f70b;

    /* renamed from: c  reason: collision with root package name */
    public final n f71c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f72d;

    public C0005f() {
        OnBackInvokedCallback onBackInvokedCallback;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            onBackInvokedCallback = null;
        } else if (i2 >= 34) {
            onBackInvokedCallback = new C0004e(this);
        } else {
            onBackInvokedCallback = new C0003d(this);
        }
        this.f72d = onBackInvokedCallback;
        this.f71c = new n(this);
    }

    public final n a() {
        return this.f71c;
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int c() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        } else if (stringExtra.equals("opaque")) {
            return 1;
        } else {
            if (stringExtra.equals("transparent")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
        }
    }

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        String str;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle g2 = g();
            if (g2 != null) {
                str = g2.getString("io.flutter.Entrypoint");
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            return "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle g2 = g();
            if (g2 != null) {
                return g2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z2) {
        if (!z2 || this.f69a) {
            if (!z2 && this.f69a && Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f72d);
                this.f69a = false;
            }
        } else if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f72d);
            this.f69a = true;
        }
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (d() != null || this.f70b.f83g) {
            return booleanExtra;
        }
        return getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (d() != null) {
            return false;
        }
        return true;
    }

    public final boolean k(String str) {
        C0008i iVar = this.f70b;
        if (iVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (iVar.f86j) {
            return true;
        } else {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0008i iVar = this.f70b;
            iVar.c();
            if (iVar.f78b != null) {
                Objects.toString(intent);
                e eVar = iVar.f78b.f142d;
                if (eVar.f()) {
                    a.b("FlutterEngineConnectionRegistry#onActivityResult");
                    try {
                        eVar.f171f.a(i2, i3, intent);
                        Trace.endSection();
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                    return;
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onBackPressed() {
        if (k("onBackPressed")) {
            C0008i iVar = this.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                cVar.f147i.f247a.e("popRoute", (Object) null, (k) null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    /* JADX WARNING: type inference failed for: r6v14, types: [C.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v19, types: [D.q, android.view.TextureView] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            android.os.Bundle r4 = r14.g()     // Catch:{ NameNotFoundException -> 0x0017 }
            if (r4 == 0) goto L_0x001e
            java.lang.String r5 = "io.flutter.embedding.android.NormalTheme"
            r6 = -1
            int r4 = r4.getInt(r5, r6)     // Catch:{ NameNotFoundException -> 0x0017 }
            if (r4 == r6) goto L_0x001e
            r14.setTheme(r4)     // Catch:{ NameNotFoundException -> 0x0017 }
            goto L_0x001e
        L_0x0017:
            java.lang.String r4 = "FlutterActivity"
            java.lang.String r5 = "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme."
            android.util.Log.e(r4, r5)
        L_0x001e:
            super.onCreate(r15)
            if (r15 == 0) goto L_0x002c
            java.lang.String r4 = "enableOnBackInvokedCallbackState"
            boolean r4 = r15.getBoolean(r4)
            r14.h(r4)
        L_0x002c:
            D.i r4 = new D.i
            r4.<init>(r14)
            r14.f70b = r4
            r4.c()
            E.c r5 = r4.f78b
            if (r5 != 0) goto L_0x0279
            D.f r5 = r4.f77a
            java.lang.String r5 = r5.d()
            if (r5 == 0) goto L_0x0078
            E.i r6 = E.i.f183c
            if (r6 != 0) goto L_0x004d
            E.i r6 = new E.i
            r6.<init>(r2)
            E.i.f183c = r6
        L_0x004d:
            E.i r6 = E.i.f183c
            java.util.HashMap r6 = r6.f184a
            java.lang.Object r6 = r6.get(r5)
            E.c r6 = (E.c) r6
            r4.f78b = r6
            r4.f83g = r2
            if (r6 == 0) goto L_0x005f
            goto L_0x0279
        L_0x005f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The requested cached FlutterEngine did not exist in the FlutterEngineCache: '"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0078:
            D.f r5 = r4.f77a
            r5.getClass()
            r4.f78b = r1
            D.f r5 = r4.f77a
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r6 = "cached_engine_group_id"
            java.lang.String r5 = r5.getStringExtra(r6)
            if (r5 == 0) goto L_0x00e3
            E.i r6 = E.i.f182b
            if (r6 != 0) goto L_0x00a7
            java.lang.Class<E.i> r6 = E.i.class
            monitor-enter(r6)
            E.i r7 = E.i.f182b     // Catch:{ all -> 0x00a0 }
            if (r7 != 0) goto L_0x00a3
            E.i r7 = new E.i     // Catch:{ all -> 0x00a0 }
            r7.<init>(r3)     // Catch:{ all -> 0x00a0 }
            E.i.f182b = r7     // Catch:{ all -> 0x00a0 }
            goto L_0x00a3
        L_0x00a0:
            r0 = move-exception
            r15 = r0
            goto L_0x00a5
        L_0x00a3:
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            throw r15
        L_0x00a7:
            E.i r6 = E.i.f182b
            java.util.HashMap r6 = r6.f184a
            java.lang.Object r6 = r6.get(r5)
            E.h r6 = (E.h) r6
            if (r6 == 0) goto L_0x00ca
            E.g r5 = new E.g
            D.f r7 = r4.f77a
            r7.getClass()
            r5.<init>(r7)
            r4.a(r5)
            E.c r5 = r6.a(r5)
            r4.f78b = r5
            r4.f83g = r3
            goto L_0x0279
        L_0x00ca:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00e3:
            E.h r5 = new E.h
            D.f r6 = r4.f77a
            r6.getClass()
            D.f r7 = r4.f77a
            android.content.Intent r7 = r7.getIntent()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = "trace-startup"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0102
            java.lang.String r9 = "--trace-startup"
            r8.add(r9)
        L_0x0102:
            java.lang.String r9 = "start-paused"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x010f
            java.lang.String r9 = "--start-paused"
            r8.add(r9)
        L_0x010f:
            java.lang.String r9 = "vm-service-port"
            int r9 = r7.getIntExtra(r9, r3)
            if (r9 <= 0) goto L_0x012c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "--vm-service-port="
            r10.<init>(r11)
            java.lang.String r9 = java.lang.Integer.toString(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.add(r9)
        L_0x012c:
            java.lang.String r9 = "disable-service-auth-codes"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0139
            java.lang.String r9 = "--disable-service-auth-codes"
            r8.add(r9)
        L_0x0139:
            java.lang.String r9 = "endless-trace-buffer"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0146
            java.lang.String r9 = "--endless-trace-buffer"
            r8.add(r9)
        L_0x0146:
            java.lang.String r9 = "use-test-fonts"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0153
            java.lang.String r9 = "--use-test-fonts"
            r8.add(r9)
        L_0x0153:
            java.lang.String r9 = "enable-dart-profiling"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0160
            java.lang.String r9 = "--enable-dart-profiling"
            r8.add(r9)
        L_0x0160:
            java.lang.String r9 = "enable-software-rendering"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x016d
            java.lang.String r9 = "--enable-software-rendering"
            r8.add(r9)
        L_0x016d:
            java.lang.String r9 = "skia-deterministic-rendering"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x017a
            java.lang.String r9 = "--skia-deterministic-rendering"
            r8.add(r9)
        L_0x017a:
            java.lang.String r9 = "trace-skia"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0187
            java.lang.String r9 = "--trace-skia"
            r8.add(r9)
        L_0x0187:
            java.lang.String r9 = "trace-skia-allowlist"
            java.lang.String r9 = r7.getStringExtra(r9)
            if (r9 == 0) goto L_0x0198
            java.lang.String r10 = "--trace-skia-allowlist="
            java.lang.String r9 = r10.concat(r9)
            r8.add(r9)
        L_0x0198:
            java.lang.String r9 = "trace-systrace"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x01a5
            java.lang.String r9 = "--trace-systrace"
            r8.add(r9)
        L_0x01a5:
            java.lang.String r9 = "trace-to-file"
            boolean r10 = r7.hasExtra(r9)
            if (r10 == 0) goto L_0x01c2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "--trace-to-file="
            r10.<init>(r11)
            java.lang.String r9 = r7.getStringExtra(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.add(r9)
        L_0x01c2:
            java.lang.String r9 = "profile-microtasks"
            boolean r9 = r7.hasExtra(r9)
            if (r9 == 0) goto L_0x01cf
            java.lang.String r9 = "--profile-microtasks"
            r8.add(r9)
        L_0x01cf:
            java.lang.String r9 = "enable-impeller"
            boolean r10 = r7.hasExtra(r9)
            if (r10 == 0) goto L_0x01e8
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x01e3
            java.lang.String r9 = "--enable-impeller=true"
            r8.add(r9)
            goto L_0x01e8
        L_0x01e3:
            java.lang.String r9 = "--enable-impeller=false"
            r8.add(r9)
        L_0x01e8:
            java.lang.String r9 = "enable-vulkan-validation"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x01f5
            java.lang.String r9 = "--enable-vulkan-validation"
            r8.add(r9)
        L_0x01f5:
            java.lang.String r9 = "dump-skp-on-shader-compilation"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0202
            java.lang.String r9 = "--dump-skp-on-shader-compilation"
            r8.add(r9)
        L_0x0202:
            java.lang.String r9 = "cache-sksl"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x020f
            java.lang.String r9 = "--cache-sksl"
            r8.add(r9)
        L_0x020f:
            java.lang.String r9 = "purge-persistent-cache"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x021c
            java.lang.String r9 = "--purge-persistent-cache"
            r8.add(r9)
        L_0x021c:
            java.lang.String r9 = "verbose-logging"
            boolean r9 = r7.getBooleanExtra(r9, r3)
            if (r9 == 0) goto L_0x0229
            java.lang.String r9 = "--verbose-logging"
            r8.add(r9)
        L_0x0229:
            java.lang.String r9 = "dart-flags"
            boolean r10 = r7.hasExtra(r9)
            if (r10 == 0) goto L_0x0246
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "--dart-flags="
            r10.<init>(r11)
            java.lang.String r7 = r7.getStringExtra(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r8.add(r7)
        L_0x0246:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r8)
            int r8 = r7.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r5.<init>(r6, r7)
            E.g r6 = new E.g
            D.f r7 = r4.f77a
            r7.getClass()
            r6.<init>(r7)
            r6.f179e = r3
            D.f r7 = r4.f77a
            boolean r7 = r7.j()
            r6.f180f = r7
            r4.a(r6)
            E.c r5 = r5.a(r6)
            r4.f78b = r5
            r4.f83g = r3
        L_0x0279:
            D.f r5 = r4.f77a
            r5.getClass()
            E.c r5 = r4.f78b
            E.e r5 = r5.f142d
            D.f r6 = r4.f77a
            androidx.lifecycle.n r6 = r6.f71c
            r5.getClass()
            java.lang.String r7 = "FlutterEngineConnectionRegistry#attachToActivity"
            S.a.b(r7)
            D.i r7 = r5.f170e     // Catch:{ all -> 0x0296 }
            if (r7 == 0) goto L_0x029a
            r7.b()     // Catch:{ all -> 0x0296 }
            goto L_0x029a
        L_0x0296:
            r0 = move-exception
            r15 = r0
            goto L_0x0661
        L_0x029a:
            r5.e()     // Catch:{ all -> 0x0296 }
            r5.f170e = r4     // Catch:{ all -> 0x0296 }
            D.f r7 = r4.f77a     // Catch:{ all -> 0x0296 }
            r7.getClass()     // Catch:{ all -> 0x0296 }
            r5.b(r7, r6)     // Catch:{ all -> 0x0296 }
            android.os.Trace.endSection()
            D.f r5 = r4.f77a
            r5.getClass()
            D.f r6 = r4.f77a
            E.c r7 = r4.f78b
            r6.getClass()
            io.flutter.plugin.platform.f r8 = new io.flutter.plugin.platform.f
            B.a r7 = r7.f150l
            r8.<init>(r6, r7, r6)
            r4.f80d = r8
            D.f r6 = r4.f77a
            E.c r7 = r4.f78b
            r6.getClass()
            Q.a r6 = new Q.a
            D.u r7 = r7.f151n
            int r8 = f68e
            r6.<init>(r8, r5, r7)
            r4.f81e = r6
            D.f r5 = r4.f77a
            E.c r6 = r4.f78b
            D.i r5 = r5.f70b
            boolean r5 = r5.f83g
            if (r5 == 0) goto L_0x02dc
            goto L_0x02df
        L_0x02dc:
            a.a.v(r6)
        L_0x02df:
            r4.f86j = r2
            D.i r4 = r14.f70b
            r4.c()
            if (r15 == 0) goto L_0x02f4
            java.lang.String r5 = "plugins"
            r15.getBundle(r5)
            java.lang.String r5 = "framework"
            byte[] r15 = r15.getByteArray(r5)
            goto L_0x02f5
        L_0x02f4:
            r15 = r1
        L_0x02f5:
            D.f r5 = r4.f77a
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x032a
            E.c r5 = r4.f78b
            L.l r5 = r5.f149k
            r5.f294e = r2
            L.k r6 = r5.f293d
            if (r6 == 0) goto L_0x0313
            java.util.HashMap r7 = L.l.a(r15)
            r6.c(r7)
            r5.f293d = r1
            r5.f291b = r15
            goto L_0x032a
        L_0x0313:
            boolean r6 = r5.f295f
            if (r6 == 0) goto L_0x0328
            java.util.HashMap r6 = L.l.a(r15)
            L.k r7 = new L.k
            r7.<init>(r3, r5, r15)
            C.b r15 = r5.f292c
            java.lang.String r5 = "push"
            r15.e(r5, r6, r7)
            goto L_0x032a
        L_0x0328:
            r5.f291b = r15
        L_0x032a:
            D.f r15 = r4.f77a
            r15.getClass()
            E.c r15 = r4.f78b
            E.e r15 = r15.f142d
            boolean r4 = r15.f()
            if (r4 == 0) goto L_0x0368
            java.lang.String r4 = "FlutterEngineConnectionRegistry#onRestoreInstanceState"
            S.a.b(r4)
            E.d r15 = r15.f171f     // Catch:{ all -> 0x035d }
            java.util.HashSet r15 = r15.f165f     // Catch:{ all -> 0x035d }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x035d }
            boolean r4 = r15.hasNext()     // Catch:{ all -> 0x035d }
            if (r4 != 0) goto L_0x0350
            android.os.Trace.endSection()
            goto L_0x036f
        L_0x0350:
            java.lang.Object r15 = r15.next()     // Catch:{ all -> 0x035d }
            if (r15 != 0) goto L_0x0357
            throw r1     // Catch:{ all -> 0x035d }
        L_0x0357:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException     // Catch:{ all -> 0x035d }
            r15.<init>()     // Catch:{ all -> 0x035d }
            throw r15     // Catch:{ all -> 0x035d }
        L_0x035d:
            r0 = move-exception
            r15 = r0
            android.os.Trace.endSection()     // Catch:{ all -> 0x0363 }
            goto L_0x0367
        L_0x0363:
            r0 = move-exception
            r15.addSuppressed(r0)
        L_0x0367:
            throw r15
        L_0x0368:
            java.lang.String r15 = "FlutterEngineCxnRegstry"
            java.lang.String r4 = "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."
            android.util.Log.e(r15, r4)
        L_0x036f:
            androidx.lifecycle.n r15 = r14.f71c
            androidx.lifecycle.f r4 = androidx.lifecycle.f.ON_CREATE
            r15.c(r4)
            int r15 = r14.c()
            if (r15 != r0) goto L_0x0388
            android.view.Window r15 = r14.getWindow()
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r3)
            r15.setBackgroundDrawable(r4)
        L_0x0388:
            D.i r15 = r14.f70b
            int r4 = r14.c()
            if (r4 != r2) goto L_0x0392
            r4 = r2
            goto L_0x0393
        L_0x0392:
            r4 = r0
        L_0x0393:
            if (r4 != r2) goto L_0x0397
            r4 = r2
            goto L_0x0398
        L_0x0397:
            r4 = r3
        L_0x0398:
            r15.c()
            D.f r5 = r15.f77a
            int r5 = r5.c()
            if (r5 != r2) goto L_0x03ca
            D.o r5 = new D.o
            D.f r6 = r15.f77a
            r6.getClass()
            D.f r7 = r15.f77a
            int r7 = r7.c()
            if (r7 != r2) goto L_0x03b4
            r7 = r3
            goto L_0x03b5
        L_0x03b4:
            r7 = r2
        L_0x03b5:
            r5.<init>(r6, r7)
            D.f r6 = r15.f77a
            r6.getClass()
            D.x r6 = new D.x
            D.f r7 = r15.f77a
            r7.getClass()
            r6.<init>((D.C0005f) r7, (D.C0014o) r5)
            r15.f79c = r6
            goto L_0x03ff
        L_0x03ca:
            D.q r5 = new D.q
            D.f r6 = r15.f77a
            r6.getClass()
            r5.<init>(r6, r1)
            r5.f101a = r3
            r5.f102b = r3
            D.p r6 = new D.p
            r6.<init>(r5)
            r5.setSurfaceTextureListener(r6)
            D.f r6 = r15.f77a
            int r6 = r6.c()
            if (r6 != r2) goto L_0x03ea
            r6 = r2
            goto L_0x03eb
        L_0x03ea:
            r6 = r3
        L_0x03eb:
            r5.setOpaque(r6)
            D.f r6 = r15.f77a
            r6.getClass()
            D.x r6 = new D.x
            D.f r7 = r15.f77a
            r7.getClass()
            r6.<init>((D.C0005f) r7, (D.C0016q) r5)
            r15.f79c = r6
        L_0x03ff:
            D.x r5 = r15.f79c
            D.g r6 = r15.f88l
            java.util.HashSet r5 = r5.f119f
            r5.add(r6)
            D.f r5 = r15.f77a
            r5.getClass()
            D.x r7 = r15.f79c
            E.c r5 = r15.f78b
            r7.getClass()
            java.util.Objects.toString(r5)
            boolean r6 = r7.c()
            if (r6 == 0) goto L_0x0426
            E.c r6 = r7.f121h
            if (r5 != r6) goto L_0x0423
            goto L_0x05e4
        L_0x0423:
            r7.a()
        L_0x0426:
            r7.f121h = r5
            io.flutter.embedding.engine.renderer.j r6 = r5.f140b
            boolean r8 = r6.f570c
            r7.f120g = r8
            android.view.View r8 = r7.f117d
            r8.a(r6)
            D.g r12 = r7.f133v
            r6.a(r12)
            B.a r6 = new B.a
            E.c r8 = r7.f121h
            D.u r8 = r8.f146h
            r6.<init>((O.a) r7, (D.u) r8)
            r7.f123j = r6
            io.flutter.plugin.editing.k r6 = new io.flutter.plugin.editing.k
            E.c r8 = r7.f121h
            r9 = r8
            B.a r8 = r9.f155r
            io.flutter.plugin.platform.j r10 = r9.f156s
            io.flutter.plugin.platform.i r11 = r9.f157t
            D.u r9 = r9.m
            r6.<init>(r7, r8, r9, r10, r11)
            r7.f124k = r6
            android.content.Context r6 = r7.getContext()     // Catch:{ Exception -> 0x046f }
            java.lang.String r8 = "textservices"
            java.lang.Object r6 = r6.getSystemService(r8)     // Catch:{ Exception -> 0x046f }
            android.view.textservice.TextServicesManager r6 = (android.view.textservice.TextServicesManager) r6     // Catch:{ Exception -> 0x046f }
            r7.f129q = r6     // Catch:{ Exception -> 0x046f }
            io.flutter.plugin.editing.g r8 = new io.flutter.plugin.editing.g     // Catch:{ Exception -> 0x046f }
            E.c r9 = r7.f121h     // Catch:{ Exception -> 0x046f }
            D.u r9 = r9.f153p     // Catch:{ Exception -> 0x046f }
            r8.<init>(r6, r9)     // Catch:{ Exception -> 0x046f }
            r7.f125l = r8     // Catch:{ Exception -> 0x046f }
            goto L_0x0476
        L_0x046f:
            java.lang.String r6 = "FlutterView"
            java.lang.String r8 = "TextServicesManager not supported by device, spell check disabled."
            android.util.Log.e(r6, r8)
        L_0x0476:
            B.a r6 = new B.a
            io.flutter.plugin.editing.k r8 = r7.f124k
            android.view.inputmethod.InputMethodManager r8 = r8.f620b
            E.c r9 = r7.f121h
            D.u r9 = r9.m
            r6.<init>((android.view.View) r7, (android.view.inputmethod.InputMethodManager) r8, (D.u) r9)
            E.c r6 = r7.f121h
            N.a r6 = r6.f143e
            r7.m = r6
            C.b r6 = new C.b
            r6.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r6.f14b = r8
            r6.f15c = r7
            D.E r8 = new D.E
            M.f r9 = r7.getBinaryMessenger()
            r8.<init>(r9)
            B.a r9 = new B.a
            L.c r10 = new L.c
            M.f r11 = r7.getBinaryMessenger()
            r10.<init>((M.f) r11)
            r9.<init>((L.c) r10)
            D.I[] r0 = new D.I[r0]
            r0[r3] = r8
            r0[r2] = r9
            r6.f13a = r0
            D.u r0 = new D.u
            M.f r8 = r7.getBinaryMessenger()
            r0.<init>(r8)
            r0.f108c = r6
            r7.f126n = r6
            D.b r0 = new D.b
            E.c r6 = r7.f121h
            io.flutter.embedding.engine.renderer.j r6 = r6.f140b
            r0.<init>(r6, r3)
            r7.f127o = r0
            io.flutter.view.k r6 = new io.flutter.view.k
            android.content.Context r0 = r7.getContext()
            java.lang.String r8 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r8)
            r9 = r0
            android.view.accessibility.AccessibilityManager r9 = (android.view.accessibility.AccessibilityManager) r9
            android.content.Context r0 = r7.getContext()
            android.content.ContentResolver r10 = r0.getContentResolver()
            B.a r11 = new B.a
            E.c r0 = r7.f121h
            io.flutter.plugin.platform.j r8 = r0.f156s
            r13 = 16
            r11.<init>((int) r13, (boolean) r3)
            r11.f3c = r8
            io.flutter.plugin.platform.i r0 = r0.f157t
            r11.f4d = r0
            C.b r8 = r5.f144f
            r6.<init>(r7, r8, r9, r10, r11)
            r7.f128p = r6
            D.u r0 = r7.f132t
            r6.f787q = r0
            android.view.accessibility.AccessibilityManager r0 = r6.f774c
            boolean r0 = r0.isEnabled()
            io.flutter.view.k r6 = r7.f128p
            android.view.accessibility.AccessibilityManager r6 = r6.f774c
            boolean r6 = r6.isTouchExplorationEnabled()
            E.c r8 = r7.f121h
            io.flutter.embedding.engine.renderer.j r8 = r8.f140b
            io.flutter.embedding.engine.FlutterJNI r8 = r8.f568a
            boolean r8 = r8.getIsSoftwareRenderingEnabled()
            if (r8 != 0) goto L_0x0526
            if (r0 != 0) goto L_0x0521
            if (r6 != 0) goto L_0x0521
            r0 = r2
            goto L_0x0522
        L_0x0521:
            r0 = r3
        L_0x0522:
            r7.setWillNotDraw(r0)
            goto L_0x0529
        L_0x0526:
            r7.setWillNotDraw(r3)
        L_0x0529:
            E.c r0 = r7.f121h
            io.flutter.plugin.platform.j r6 = r0.f156s
            io.flutter.view.k r8 = r7.f128p
            io.flutter.plugin.platform.a r6 = r6.f666h
            r6.f634a = r8
            D.b r6 = new D.b
            io.flutter.embedding.engine.renderer.j r0 = r0.f140b
            r6.<init>(r0, r2)
            E.c r0 = r7.f121h
            io.flutter.plugin.platform.i r6 = r0.f157t
            io.flutter.view.k r8 = r7.f128p
            io.flutter.plugin.platform.a r6 = r6.f652f
            r6.f634a = r8
            D.b r6 = new D.b
            io.flutter.embedding.engine.renderer.j r0 = r0.f140b
            r6.<init>(r0, r2)
            io.flutter.plugin.editing.k r0 = r7.f124k
            android.view.inputmethod.InputMethodManager r0 = r0.f620b
            r0.restartInput(r7)
            r7.d()
            android.content.Context r0 = r7.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r6 = "show_password"
            android.net.Uri r6 = android.provider.Settings.System.getUriFor(r6)
            D.v r8 = r7.u
            r0.registerContentObserver(r6, r3, r8)
            r7.e()
            io.flutter.plugin.platform.j r0 = r5.f156s
            r0.f661c = r7
            r6 = r3
        L_0x0570:
            android.util.SparseArray r8 = r0.f671n
            int r9 = r8.size()
            if (r6 >= r9) goto L_0x0585
            java.lang.Object r8 = r8.valueAt(r6)
            io.flutter.plugin.platform.h r8 = (io.flutter.plugin.platform.h) r8
            D.x r9 = r0.f661c
            r9.addView(r8)
            int r6 = r6 + r2
            goto L_0x0570
        L_0x0585:
            r6 = r3
        L_0x0586:
            android.util.SparseArray r8 = r0.f670l
            int r9 = r8.size()
            if (r6 >= r9) goto L_0x05a1
            java.lang.Object r8 = r8.valueAt(r6)
            if (r8 != 0) goto L_0x059b
            D.x r8 = r0.f661c
            r8.addView(r1)
            int r6 = r6 + r2
            goto L_0x0586
        L_0x059b:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x05a1:
            android.util.SparseArray r0 = r0.f669k
            int r6 = r0.size()
            if (r6 > 0) goto L_0x0654
            io.flutter.plugin.platform.i r0 = r5.f157t
            r0.f649c = r7
            r5 = r3
        L_0x05ae:
            android.util.SparseArray r6 = r0.f654h
            int r8 = r6.size()
            if (r5 >= r8) goto L_0x05c9
            java.lang.Object r6 = r6.valueAt(r5)
            if (r6 != 0) goto L_0x05c3
            D.x r6 = r0.f649c
            r6.addView(r1)
            int r5 = r5 + r2
            goto L_0x05ae
        L_0x05c3:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x05c9:
            android.util.SparseArray r0 = r0.f653g
            int r1 = r0.size()
            if (r1 > 0) goto L_0x0647
            java.util.HashSet r0 = r7.f122i
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x063a
            boolean r0 = r7.f120g
            if (r0 == 0) goto L_0x05e4
            r12.a()
        L_0x05e4:
            D.x r0 = r15.f79c
            int r1 = f68e
            r0.setId(r1)
            if (r4 == 0) goto L_0x061d
            D.x r0 = r15.f79c
            D.f r1 = r15.f77a
            int r1 = r1.c()
            if (r1 != r2) goto L_0x0615
            D.h r1 = r15.f82f
            if (r1 == 0) goto L_0x0604
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            D.h r2 = r15.f82f
            r1.removeOnPreDrawListener(r2)
        L_0x0604:
            D.h r1 = new D.h
            r1.<init>(r15, r0)
            r15.f82f = r1
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            D.h r1 = r15.f82f
            r0.addOnPreDrawListener(r1)
            goto L_0x061d
        L_0x0615:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."
            r15.<init>(r0)
            throw r15
        L_0x061d:
            D.x r15 = r15.f79c
            r14.setContentView(r15)
            android.view.Window r15 = r14.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15.addFlags(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            r15.setStatusBarColor(r0)
            android.view.View r15 = r15.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r15.setSystemUiVisibility(r0)
            return
        L_0x063a:
            java.lang.Object r15 = r0.next()
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x0647:
            java.lang.Object r15 = r0.valueAt(r3)
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x0654:
            java.lang.Object r15 = r0.valueAt(r3)
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x0661:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0665 }
            goto L_0x0669
        L_0x0665:
            r0 = move-exception
            r15.addSuppressed(r0)
        L_0x0669:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0005f.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        if (k("onDestroy")) {
            this.f70b.e();
            this.f70b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f72d);
            this.f69a = false;
        }
        C0008i iVar = this.f70b;
        if (iVar != null) {
            iVar.f77a = null;
            iVar.f78b = null;
            iVar.f79c = null;
            iVar.f80d = null;
            iVar.f81e = null;
            this.f70b = null;
        }
        this.f71c.c(f.ON_DESTROY);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0008i iVar = this.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                e eVar = cVar.f142d;
                if (eVar.f()) {
                    a.b("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
                        Iterator it = eVar.f171f.f163d.iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                String d2 = iVar.d(intent);
                if (d2 != null && !d2.isEmpty()) {
                    b bVar = iVar.f78b.f147i;
                    bVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("location", d2);
                    bVar.f247a.e("pushRouteInformation", hashMap, (k) null);
                    return;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        return;
        throw th;
    }

    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0008i iVar = this.f70b;
            iVar.c();
            iVar.f77a.getClass();
            c cVar = iVar.f78b;
            if (cVar != null) {
                d dVar = cVar.f145g;
                dVar.a(3, dVar.f251c);
            }
        }
        this.f71c.c(f.ON_PAUSE);
    }

    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0008i iVar = this.f70b;
            iVar.c();
            if (iVar.f78b != null) {
                io.flutter.plugin.platform.f fVar = iVar.f80d;
                if (fVar != null) {
                    fVar.b();
                }
                Iterator it = iVar.f78b.f156s.f667i.values().iterator();
                if (it.hasNext()) {
                    ((p) it.next()).getClass();
                    throw null;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0008i iVar = this.f70b;
            iVar.c();
            if (iVar.f78b != null) {
                Arrays.toString(strArr);
                Arrays.toString(iArr);
                e eVar = iVar.f78b.f142d;
                if (eVar.f()) {
                    a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
                        Iterator it = eVar.f171f.f161b.iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                            return;
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                    return;
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onResume() {
        super.onResume();
        this.f71c.c(f.ON_RESUME);
        if (k("onResume")) {
            C0008i iVar = this.f70b;
            iVar.c();
            iVar.f77a.getClass();
            c cVar = iVar.f78b;
            if (cVar != null) {
                d dVar = cVar.f145g;
                dVar.a(2, dVar.f251c);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0008i iVar = this.f70b;
            iVar.c();
            if (iVar.f77a.j()) {
                bundle.putByteArray("framework", iVar.f78b.f149k.f291b);
            }
            iVar.f77a.getClass();
            Bundle bundle2 = new Bundle();
            e eVar = iVar.f78b.f142d;
            if (eVar.f()) {
                a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = eVar.f171f.f165f.iterator();
                    if (!it.hasNext()) {
                        Trace.endSection();
                    } else if (it.next() == null) {
                        throw null;
                    } else {
                        throw new ClassCastException();
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (iVar.f77a.d() != null && !iVar.f77a.i()) {
                bundle.putBoolean("enableOnBackInvokedCallbackState", iVar.f77a.f69a);
                return;
            }
            return;
        }
        return;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.n r0 = r6.f71c
            androidx.lifecycle.f r1 = androidx.lifecycle.f.ON_START
            r0.c(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.k(r0)
            if (r0 == 0) goto L_0x00be
            D.i r0 = r6.f70b
            r0.c()
            D.f r1 = r0.f77a
            java.lang.String r1 = r1.d()
            if (r1 == 0) goto L_0x0021
            goto L_0x00b1
        L_0x0021:
            E.c r1 = r0.f78b
            F.b r1 = r1.f141c
            boolean r1 = r1.f194g
            if (r1 == 0) goto L_0x002b
            goto L_0x00b1
        L_0x002b:
            D.f r1 = r0.f77a
            java.lang.String r1 = r1.f()
            if (r1 != 0) goto L_0x0044
            D.f r1 = r0.f77a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = "/"
        L_0x0044:
            D.f r2 = r0.f77a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.g()     // Catch:{ NameNotFoundException -> 0x0057 }
            if (r2 == 0) goto L_0x0057
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch:{ NameNotFoundException -> 0x0057 }
            goto L_0x0058
        L_0x0057:
            r2 = r3
        L_0x0058:
            D.f r4 = r0.f77a
            r4.e()
            E.c r4 = r0.f78b
            L.b r4 = r4.f147i
            C.b r4 = r4.f247a
            java.lang.String r5 = "setInitialRoute"
            r4.e(r5, r1, r3)
            D.f r1 = r0.f77a
            java.lang.String r1 = r1.b()
            if (r1 == 0) goto L_0x0076
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0082
        L_0x0076:
            C.b r1 = C.b.d()
            java.lang.Object r1 = r1.f13a
            H.f r1 = (H.f) r1
            H.b r1 = r1.f243d
            java.lang.String r1 = r1.f230b
        L_0x0082:
            if (r2 != 0) goto L_0x0090
            F.a r2 = new F.a
            D.f r3 = r0.f77a
            java.lang.String r3 = r3.e()
            r2.<init>(r1, r3)
            goto L_0x009c
        L_0x0090:
            F.a r3 = new F.a
            D.f r4 = r0.f77a
            java.lang.String r4 = r4.e()
            r3.<init>(r1, r2, r4)
            r2 = r3
        L_0x009c:
            E.c r1 = r0.f78b
            F.b r1 = r1.f141c
            D.f r3 = r0.f77a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r1.b(r2, r3)
        L_0x00b1:
            java.lang.Integer r1 = r0.f87k
            if (r1 == 0) goto L_0x00be
            D.x r0 = r0.f79c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0005f.onStart():void");
    }

    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0008i iVar = this.f70b;
            iVar.c();
            iVar.f77a.getClass();
            c cVar = iVar.f78b;
            if (cVar != null) {
                d dVar = cVar.f145g;
                dVar.a(5, dVar.f251c);
            }
            iVar.f87k = Integer.valueOf(iVar.f79c.getVisibility());
            iVar.f79c.setVisibility(8);
            c cVar2 = iVar.f78b;
            if (cVar2 != null) {
                cVar2.f140b.b(40);
            }
        }
        this.f71c.c(f.ON_STOP);
    }

    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0008i iVar = this.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                if (iVar.f85i && i2 >= 10) {
                    FlutterJNI flutterJNI = cVar.f141c.f189b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    L.c cVar2 = iVar.f78b.f154q;
                    cVar2.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    cVar2.f248a.f(hashMap, (M.c) null);
                }
                iVar.f78b.f140b.b(i2);
                j jVar = iVar.f78b.f156s;
                if (i2 < 40) {
                    jVar.getClass();
                    return;
                }
                Iterator it = jVar.f667i.values().iterator();
                if (it.hasNext()) {
                    ((p) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0008i iVar = this.f70b;
            iVar.c();
            c cVar = iVar.f78b;
            if (cVar != null) {
                e eVar = cVar.f142d;
                if (eVar.f()) {
                    a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
                        Iterator it = eVar.f171f.f164e.iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                            return;
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                    return;
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (k("onWindowFocusChanged")) {
            C0008i iVar = this.f70b;
            iVar.c();
            iVar.f77a.getClass();
            c cVar = iVar.f78b;
            if (cVar != null) {
                d dVar = cVar.f145g;
                if (z2) {
                    dVar.a(dVar.f249a, true);
                } else {
                    dVar.a(dVar.f249a, false);
                }
            }
        }
    }
}
