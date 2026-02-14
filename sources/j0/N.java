package j0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class N extends T {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f825d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N() {
        super(true);
        C0051i iVar;
        C0051i iVar2;
        boolean z2 = true;
        B((K) null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f840c;
        C0050h hVar = (C0050h) atomicReferenceFieldUpdater.get(this);
        if (hVar instanceof C0051i) {
            iVar = (C0051i) hVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            T n2 = iVar.n();
            while (true) {
                if (!n2.w()) {
                    C0050h hVar2 = (C0050h) atomicReferenceFieldUpdater.get(n2);
                    if (hVar2 instanceof C0051i) {
                        iVar2 = (C0051i) hVar2;
                    } else {
                        iVar2 = null;
                    }
                    if (iVar2 == null) {
                        break;
                    }
                    n2 = iVar2.n();
                } else {
                    break;
                }
            }
        }
        z2 = false;
        this.f825d = z2;
    }

    public final boolean w() {
        return this.f825d;
    }
}
