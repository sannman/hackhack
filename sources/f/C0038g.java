package f;

import a.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f.g  reason: case insensitive filesystem */
public abstract class C0038g implements Future {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f522d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f523e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f524f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f525g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f526a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0034c f527b;

    /* renamed from: c  reason: collision with root package name */
    public volatile C0037f f528c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: f.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: f.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: f.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<f.f> r2 = f.C0037f.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f522d = r3
            java.lang.Class<f.g> r3 = f.C0038g.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f523e = r4
            f.d r5 = new f.d     // Catch:{ all -> 0x0043 }
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r1)     // Catch:{ all -> 0x0043 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r4)     // Catch:{ all -> 0x0043 }
            java.lang.Class<f.c> r2 = f.C0034c.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0043 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0043 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0043 }
            r0 = 0
            goto L_0x0049
        L_0x0043:
            r0 = move-exception
            f.e r5 = new f.e
            r5.<init>()
        L_0x0049:
            f524f = r5
            if (r0 == 0) goto L_0x0056
            java.util.logging.Logger r1 = f523e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0056:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f525g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.C0038g.<clinit>():void");
    }

    public static void b(C0038g gVar) {
        C0037f fVar;
        C0034c cVar;
        do {
            fVar = gVar.f528c;
        } while (!f524f.e(gVar, fVar, C0037f.f519c));
        while (fVar != null) {
            Thread thread = fVar.f520a;
            if (thread != null) {
                fVar.f520a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f521b;
        }
        do {
            cVar = gVar.f527b;
        } while (!f524f.c(gVar, cVar));
        C0034c cVar2 = null;
        while (cVar != null) {
            C0034c cVar3 = cVar.f513a;
            cVar.f513a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f513a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f523e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0032a) {
            CancellationException cancellationException = ((C0032a) obj).f511a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        } else if (obj instanceof C0033b) {
            ((C0033b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        } else if (obj == f525g) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object d(C0038g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String str;
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            if (d2 == this) {
                str = "this future";
            } else {
                str = String.valueOf(d2);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z2) {
        C0032a aVar;
        Object obj = this.f526a;
        if (obj != null) {
            return false;
        }
        if (f522d) {
            aVar = new C0032a(z2, new CancellationException("Future.cancel() was called."));
        } else if (z2) {
            aVar = C0032a.f509b;
        } else {
            aVar = C0032a.f510c;
        }
        if (!f524f.d(this, obj, aVar)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0037f fVar) {
        fVar.f520a = null;
        while (true) {
            C0037f fVar2 = this.f528c;
            if (fVar2 != C0037f.f519c) {
                C0037f fVar3 = null;
                while (fVar2 != null) {
                    C0037f fVar4 = fVar2.f521b;
                    if (fVar2.f520a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f521b = fVar4;
                        if (fVar3.f520a == null) {
                        }
                    } else if (!f524f.e(this, fVar2, fVar4)) {
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f526a;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0037f fVar = this.f528c;
                C0037f fVar2 = C0037f.f519c;
                if (fVar != fVar2) {
                    C0037f fVar3 = new C0037f();
                    do {
                        a aVar = f524f;
                        aVar.t(fVar3, fVar);
                        if (aVar.e(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f526a;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar = this.f528c;
                        }
                    } while (fVar != fVar2);
                }
                return c(this.f526a);
            }
            while (nanos > 0) {
                Object obj3 = this.f526a;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z2 = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z2) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z2) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f526a instanceof C0032a;
    }

    public final boolean isDone() {
        if (this.f526a != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f526a instanceof C0032a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f526a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0037f fVar = this.f528c;
            C0037f fVar2 = C0037f.f519c;
            if (fVar != fVar2) {
                C0037f fVar3 = new C0037f();
                do {
                    a aVar = f524f;
                    aVar.t(fVar3, fVar);
                    if (aVar.e(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f526a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f528c;
                } while (fVar != fVar2);
            }
            return c(this.f526a);
        }
        throw new InterruptedException();
    }
}
