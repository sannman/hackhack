package s;

import D.C0009j;
import U.b;
import U.m;
import a.a;
import android.util.Log;
import c0.l;
import d0.h;
import java.util.ArrayList;
import java.util.List;
import n.d;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Object f1170e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1171f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1172g;

    /* renamed from: h  reason: collision with root package name */
    public final i f1173h;

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Throwable, java.lang.Exception, s.i] */
    public f(Object obj, String str, C0092a aVar, int i2) {
        h.e(obj, "value");
        C0009j.f("verificationMode", i2);
        this.f1170e = obj;
        this.f1171f = str;
        this.f1172g = i2;
        String h2 = a.h(obj, str);
        h.e(h2, "message");
        ? exc = new Exception(h2);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            List list = m.f364b;
            List list2 = list;
            if (length != 0) {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    int length3 = stackTrace.length;
                    list2 = list;
                    if (length3 != 0) {
                        if (length3 != 1) {
                            list2 = new ArrayList(new b(stackTrace, false));
                        } else {
                            list2 = a.n(stackTrace[0]);
                        }
                    }
                } else if (length == 1) {
                    list2 = a.n(stackTrace[length2 - 1]);
                } else {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i3 = length2 - length; i3 < length2; i3++) {
                        arrayList.add(stackTrace[i3]);
                    }
                    list2 = arrayList;
                }
            }
            exc.setStackTrace((StackTraceElement[]) list2.toArray(new StackTraceElement[0]));
            this.f1173h = exc;
            return;
        }
        throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
    }

    public final Object f() {
        int a2 = d.a(this.f1172g);
        if (a2 == 0) {
            throw this.f1173h;
        } else if (a2 == 1) {
            String h2 = a.h(this.f1170e, this.f1171f);
            h.e(h2, "message");
            Log.d("f", h2);
            return null;
        } else if (a2 == 2) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    public final a w(String str, l lVar) {
        return this;
    }
}
