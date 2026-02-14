package E;

import B.e;
import D.C0005f;
import D.u;
import H.f;
import L.d;
import L.l;
import L.n;
import M.m;
import N.a;
import S.b;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.i;
import java.util.HashMap;
import java.util.HashSet;

public final class c implements b {

    /* renamed from: x  reason: collision with root package name */
    public static long f137x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final HashMap f138y = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f139a;

    /* renamed from: b  reason: collision with root package name */
    public final j f140b;

    /* renamed from: c  reason: collision with root package name */
    public final F.b f141c;

    /* renamed from: d  reason: collision with root package name */
    public final e f142d;

    /* renamed from: e  reason: collision with root package name */
    public final a f143e;

    /* renamed from: f  reason: collision with root package name */
    public final C.b f144f;

    /* renamed from: g  reason: collision with root package name */
    public final d f145g;

    /* renamed from: h  reason: collision with root package name */
    public final u f146h;

    /* renamed from: i  reason: collision with root package name */
    public final L.b f147i;

    /* renamed from: j  reason: collision with root package name */
    public final L.b f148j;

    /* renamed from: k  reason: collision with root package name */
    public final l f149k;

    /* renamed from: l  reason: collision with root package name */
    public final B.a f150l;
    public final u m;

    /* renamed from: n  reason: collision with root package name */
    public final u f151n;

    /* renamed from: o  reason: collision with root package name */
    public final n f152o;

    /* renamed from: p  reason: collision with root package name */
    public final u f153p;

    /* renamed from: q  reason: collision with root package name */
    public final L.c f154q;

    /* renamed from: r  reason: collision with root package name */
    public final B.a f155r;

    /* renamed from: s  reason: collision with root package name */
    public final io.flutter.plugin.platform.j f156s;

    /* renamed from: t  reason: collision with root package name */
    public final i f157t;
    public final HashSet u = new HashSet();

    /* renamed from: v  reason: collision with root package name */
    public final long f158v;

    /* renamed from: w  reason: collision with root package name */
    public final a f159w = new a(this);

    /* JADX WARNING: type inference failed for: r0v7, types: [C.b, java.lang.Object] */
    public c(C0005f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.j jVar, boolean z2, boolean z3) {
        AssetManager assetManager;
        long j2 = f137x;
        f137x = 1 + j2;
        this.f158v = j2;
        f138y.put(Long.valueOf(j2), this);
        try {
            assetManager = fVar.createPackageContext(fVar.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = fVar.getAssets();
        }
        C.b d2 = C.b.d();
        if (flutterJNI == null) {
            Object obj = d2.f14b;
            flutterJNI = new FlutterJNI();
        }
        this.f139a = flutterJNI;
        F.b bVar = new F.b(flutterJNI, assetManager, this.f158v);
        this.f141c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f192e);
        C.b.d().getClass();
        ? obj2 = new Object();
        u uVar = new u(5, (Object) obj2);
        e eVar = new e(bVar, "flutter/accessibility", m.f328a, (B.b) null);
        obj2.f13a = eVar;
        eVar.g(uVar);
        obj2.f14b = flutterJNI;
        this.f144f = obj2;
        new B.b(bVar);
        this.f145g = new d(bVar);
        B.a aVar = new B.a(bVar, 5);
        this.f146h = new u(bVar, 10);
        this.f147i = new L.b(bVar, 1);
        this.f148j = new L.b(bVar, 0);
        this.f150l = new B.a(bVar, 6);
        B.a aVar2 = new B.a(bVar, fVar.getPackageManager());
        this.f149k = new l(bVar, z3);
        this.m = new u(bVar, 19);
        this.f151n = new u(bVar, 21);
        this.f152o = new n(bVar);
        this.f153p = new u(bVar, 23);
        this.f154q = new L.c(bVar);
        this.f155r = new B.a(bVar, 9);
        a aVar3 = new a(fVar, aVar);
        this.f143e = aVar3;
        f fVar2 = (f) d2.f13a;
        if (!flutterJNI.isAttached()) {
            fVar2.b(fVar.getApplicationContext());
            fVar2.a(fVar, (String[]) null);
        }
        i iVar = new i();
        iVar.f647a = jVar.f659a;
        iVar.f650d = flutterJNI;
        jVar.f662d = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f159w);
        flutterJNI.setPlatformViewsController(jVar);
        flutterJNI.setPlatformViewsController2(iVar);
        flutterJNI.setLocalizationPlugin(aVar3);
        d2.getClass();
        flutterJNI.setDeferredComponentManager((G.a) null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f140b = new j(flutterJNI);
        this.f156s = jVar;
        this.f157t = iVar;
        e eVar2 = new e(fVar.getApplicationContext(), this);
        this.f142d = eVar2;
        aVar3.b(fVar.getResources().getConfiguration());
        if (z2 && fVar2.f243d.f233e) {
            a.a.v(this);
        }
        a.a.b(fVar, this);
        eVar2.a(new P.a(aVar2));
    }
}
