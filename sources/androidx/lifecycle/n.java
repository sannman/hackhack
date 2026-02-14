package androidx.lifecycle;

import android.os.Looper;
import c.C0020a;
import d.C0022a;
import d.C0023b;
import d.C0024c;
import d.C0025d;
import d0.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m0.g;

public final class n extends h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f419a = true;

    /* renamed from: b  reason: collision with root package name */
    public C0022a f420b = new C0022a();

    /* renamed from: c  reason: collision with root package name */
    public g f421c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f422d;

    /* renamed from: e  reason: collision with root package name */
    public int f423e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f424f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f425g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f426h;

    /* renamed from: i  reason: collision with root package name */
    public final g f427i;

    public n(l lVar) {
        new AtomicReference();
        g gVar = g.f411c;
        this.f421c = gVar;
        this.f426h = new ArrayList();
        this.f422d = new WeakReference(lVar);
        this.f427i = new g(gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.lifecycle.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.g a(io.flutter.embedding.engine.renderer.b r4) {
        /*
            r3 = this;
            d.a r0 = r3.f420b
            java.util.HashMap r0 = r0.f454f
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r4 = r0.get(r4)
            d.c r4 = (d.C0024c) r4
            d.c r4 = r4.f461d
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001c
            androidx.lifecycle.m r4 = r4.f459b
            androidx.lifecycle.g r4 = r4.f417a
            goto L_0x001d
        L_0x001c:
            r4 = r2
        L_0x001d:
            java.util.ArrayList r0 = r3.f426h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0032
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.g r2 = (androidx.lifecycle.g) r2
        L_0x0032:
            androidx.lifecycle.g r0 = r3.f421c
            java.lang.String r1 = "state1"
            d0.h.e(r0, r1)
            if (r4 == 0) goto L_0x0042
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = r0
        L_0x0043:
            if (r2 == 0) goto L_0x004c
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x004c
            return r2
        L_0x004c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.n.a(io.flutter.embedding.engine.renderer.b):androidx.lifecycle.g");
    }

    public final void b(String str) {
        C0020a aVar;
        if (this.f419a) {
            if (C0020a.f447f != null) {
                aVar = C0020a.f447f;
            } else {
                synchronized (C0020a.class) {
                    try {
                        if (C0020a.f447f == null) {
                            C0020a.f447f = new C0020a(0);
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                aVar = C0020a.f447f;
            }
            ((C0020a) aVar.f448e).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
            }
        }
    }

    public final void c(f fVar) {
        h.e(fVar, "event");
        b("handleLifecycleEvent");
        g a2 = fVar.a();
        g gVar = this.f421c;
        if (gVar != a2) {
            g gVar2 = g.f411c;
            g gVar3 = g.f410b;
            if (gVar == gVar2 && a2 == gVar3) {
                throw new IllegalStateException(("no event down from " + this.f421c + " in component " + this.f422d.get()).toString());
            }
            this.f421c = a2;
            if (this.f424f || this.f423e != 0) {
                this.f425g = true;
                return;
            }
            this.f424f = true;
            d();
            this.f424f = false;
            if (this.f421c == gVar3) {
                this.f420b = new C0022a();
            }
        }
    }

    public final void d() {
        f fVar;
        f fVar2;
        l lVar = (l) this.f422d.get();
        if (lVar != null) {
            while (true) {
                C0022a aVar = this.f420b;
                if (aVar.f453e != 0) {
                    C0024c cVar = aVar.f450b;
                    h.b(cVar);
                    g gVar = cVar.f459b.f417a;
                    C0024c cVar2 = this.f420b.f451c;
                    h.b(cVar2);
                    g gVar2 = cVar2.f459b.f417a;
                    if (gVar == gVar2 && this.f421c == gVar2) {
                        break;
                    }
                    this.f425g = false;
                    g gVar3 = this.f421c;
                    C0024c cVar3 = this.f420b.f450b;
                    h.b(cVar3);
                    if (gVar3.compareTo(cVar3.f459b.f417a) < 0) {
                        C0022a aVar2 = this.f420b;
                        C0023b bVar = new C0023b(aVar2.f451c, aVar2.f450b, 1);
                        aVar2.f452d.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f425g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            h.d(entry, "next()");
                            k kVar = (k) entry.getKey();
                            m mVar = (m) entry.getValue();
                            while (mVar.f417a.compareTo(this.f421c) > 0 && !this.f425g && this.f420b.f454f.containsKey(kVar)) {
                                d dVar = f.Companion;
                                g gVar4 = mVar.f417a;
                                dVar.getClass();
                                h.e(gVar4, "state");
                                int ordinal = gVar4.ordinal();
                                if (ordinal == 2) {
                                    fVar2 = f.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    fVar2 = f.ON_STOP;
                                } else if (ordinal != 4) {
                                    fVar2 = null;
                                } else {
                                    fVar2 = f.ON_PAUSE;
                                }
                                if (fVar2 != null) {
                                    this.f426h.add(fVar2.a());
                                    mVar.a(lVar, fVar2);
                                    ArrayList arrayList = this.f426h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + mVar.f417a);
                                }
                            }
                        }
                    }
                    C0024c cVar4 = this.f420b.f451c;
                    if (!this.f425g && cVar4 != null && this.f421c.compareTo(cVar4.f459b.f417a) > 0) {
                        C0022a aVar3 = this.f420b;
                        aVar3.getClass();
                        C0025d dVar2 = new C0025d(aVar3);
                        aVar3.f452d.put(dVar2, Boolean.FALSE);
                        while (dVar2.hasNext() && !this.f425g) {
                            Map.Entry entry2 = (Map.Entry) dVar2.next();
                            k kVar2 = (k) entry2.getKey();
                            m mVar2 = (m) entry2.getValue();
                            while (mVar2.f417a.compareTo(this.f421c) < 0 && !this.f425g && this.f420b.f454f.containsKey(kVar2)) {
                                this.f426h.add(mVar2.f417a);
                                d dVar3 = f.Companion;
                                g gVar5 = mVar2.f417a;
                                dVar3.getClass();
                                h.e(gVar5, "state");
                                int ordinal2 = gVar5.ordinal();
                                if (ordinal2 == 1) {
                                    fVar = f.ON_CREATE;
                                } else if (ordinal2 == 2) {
                                    fVar = f.ON_START;
                                } else if (ordinal2 != 3) {
                                    fVar = null;
                                } else {
                                    fVar = f.ON_RESUME;
                                }
                                if (fVar != null) {
                                    mVar2.a(lVar, fVar);
                                    ArrayList arrayList2 = this.f426h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + mVar2.f417a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.f425g = false;
            this.f427i.c(this.f421c);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
