package j0;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f843a = new ThreadLocal();

    public static D a() {
        ThreadLocal threadLocal = f843a;
        D d2 = (D) threadLocal.get();
        if (d2 != null) {
            return d2;
        }
        C0045c cVar = new C0045c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
