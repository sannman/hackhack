package l;

import android.os.Build;
import android.view.View;
import h.C0041a;
import java.util.Objects;

/* renamed from: l.m  reason: case insensitive filesystem */
public class C0080m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f907b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final C0081n f908a;

    static {
        C0074g gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new C0073f();
        } else if (i2 >= 29) {
            gVar = new C0072e();
        } else {
            gVar = new C0071d();
        }
        gVar.b().f909a.a().f909a.b().f909a.c();
    }

    public C0080m(C0081n nVar) {
        this.f908a = nVar;
    }

    public C0081n a() {
        return this.f908a;
    }

    public C0081n b() {
        return this.f908a;
    }

    public C0081n c() {
        return this.f908a;
    }

    public C0068a e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080m)) {
            return false;
        }
        C0080m mVar = (C0080m) obj;
        if (i() != mVar.i() || h() != mVar.h() || !Objects.equals(g(), mVar.g()) || !Objects.equals(f(), mVar.f()) || !Objects.equals(e(), mVar.e())) {
            return false;
        }
        return true;
    }

    public C0041a f() {
        return C0041a.f529e;
    }

    public C0041a g() {
        return C0041a.f529e;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(i()), Boolean.valueOf(h()), g(), f(), e()});
    }

    public boolean i() {
        return false;
    }

    public void d(View view) {
    }

    public void j(C0041a[] aVarArr) {
    }

    public void k(C0081n nVar) {
    }

    public void l(C0041a aVar) {
    }
}
