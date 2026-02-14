package B;

import E.j;
import M.a;
import M.b;
import M.c;
import M.f;
import M.i;
import android.content.Context;
import e.C0026a;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Object f7a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10d;

    public e(C0026a aVar) {
        this.f10d = aVar;
    }

    public static boolean c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public Object a(int i2, int i3) {
        return ((C0026a) this.f10d).f490c[(i2 << 1) + i3];
    }

    public void b(int i2) {
        ((C0026a) this.f10d).h(i2);
    }

    public File d(Context context) {
        ((b) this.f8b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void e(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((j) this.f10d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void f(Serializable serializable, c cVar) {
        a aVar;
        ByteBuffer c2 = ((i) this.f9c).c(serializable);
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = new a(0, this, cVar);
        }
        ((f) this.f7a).f((String) this.f8b, c2, aVar);
    }

    public void g(b bVar) {
        String str = (String) this.f8b;
        f fVar = (f) this.f7a;
        a aVar = null;
        b bVar2 = (b) this.f10d;
        if (bVar2 != null) {
            if (bVar != null) {
                aVar = new a(this, bVar, 11, false);
            }
            fVar.e(str, aVar, bVar2);
            return;
        }
        if (bVar != null) {
            aVar = new a(this, bVar, 11, false);
        }
        fVar.a(str, aVar);
    }

    public Object[] h(Object[] objArr, int i2) {
        int i3 = ((C0026a) this.f10d).f491d;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = a(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public e(f fVar, String str, i iVar, b bVar) {
        this.f7a = fVar;
        this.f8b = str;
        this.f9c = iVar;
        this.f10d = bVar;
    }
}
