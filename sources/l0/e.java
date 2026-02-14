package l0;

import io.flutter.plugin.platform.c;
import j0.C0046d;
import j0.C0047e;
import j0.C0052j;
import j0.C0053k;
import j0.C0061t;
import j0.W;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0.C0087a;
import o0.q;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f927a = new k(-1, (k) null, (c) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f928b = C0087a.i("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f929c = C0087a.i("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final c f930d = new c(4, "BUFFERED");

    /* renamed from: e  reason: collision with root package name */
    public static final c f931e = new c(4, "SHOULD_BUFFER");

    /* renamed from: f  reason: collision with root package name */
    public static final c f932f = new c(4, "S_RESUMING_BY_RCV");

    /* renamed from: g  reason: collision with root package name */
    public static final c f933g = new c(4, "RESUMING_BY_EB");

    /* renamed from: h  reason: collision with root package name */
    public static final c f934h = new c(4, "POISONED");

    /* renamed from: i  reason: collision with root package name */
    public static final c f935i = new c(4, "DONE_RCV");

    /* renamed from: j  reason: collision with root package name */
    public static final c f936j = new c(4, "INTERRUPTED_SEND");

    /* renamed from: k  reason: collision with root package name */
    public static final c f937k = new c(4, "INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    public static final c f938l = new c(4, "CHANNEL_CLOSED");
    public static final c m = new c(4, "SUSPEND");

    /* renamed from: n  reason: collision with root package name */
    public static final c f939n = new c(4, "SUSPEND_NO_WAITER");

    /* renamed from: o  reason: collision with root package name */
    public static final c f940o = new c(4, "FAILED");

    /* renamed from: p  reason: collision with root package name */
    public static final c f941p = new c(4, "NO_RECEIVE_RESULT");

    /* renamed from: q  reason: collision with root package name */
    public static final c f942q = new c(4, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r  reason: collision with root package name */
    public static final c f943r = new c(4, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s  reason: collision with root package name */
    public static final c f944s = new c(4, "NO_CLOSE_CAUSE");

    public static final boolean a(C0046d dVar, Object obj, q qVar) {
        c cVar;
        C0047e eVar = (C0047e) dVar;
        eVar.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0047e.f849h;
            Object obj2 = atomicReferenceFieldUpdater.get(eVar);
            boolean z2 = obj2 instanceof W;
            cVar = C0061t.f871a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0052j;
                cVar = null;
                break;
            }
            int i2 = eVar.f883d;
            if (!(obj instanceof C0053k) && i2 != 1) {
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(eVar, obj2, obj)) {
                    if (!eVar.s()) {
                        eVar.n();
                    }
                } else if (atomicReferenceFieldUpdater.get(eVar) != obj2) {
                }
            }
        }
        if (cVar == null) {
            return false;
        }
        eVar.o(eVar.f883d);
        return true;
    }
}
