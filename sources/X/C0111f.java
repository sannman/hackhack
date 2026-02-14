package x;

import D.C0018t;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.h;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k.a;
import v.k;

/* renamed from: x.f  reason: case insensitive filesystem */
public final class C0111f implements a, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1230a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f1231b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public k f1232c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f1233d = new LinkedHashSet();

    public C0111f(Context context) {
        this.f1230a = context;
    }

    /* renamed from: a */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1231b;
        reentrantLock.lock();
        try {
            this.f1232c = C0110e.b(this.f1230a, windowLayoutInfo);
            for (a accept : this.f1233d) {
                accept.accept(this.f1232c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0018t tVar) {
        ReentrantLock reentrantLock = this.f1231b;
        reentrantLock.lock();
        try {
            k kVar = this.f1232c;
            if (kVar != null) {
                tVar.accept(kVar);
            }
            this.f1233d.add(tVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
