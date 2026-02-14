package o;

import a.a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.example.palladium_secure.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p.C0088a;

/* renamed from: o.a  reason: case insensitive filesystem */
public final class C0086a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile C0086a f1044d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f1045e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1046a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f1047b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f1048c;

    public C0086a(Context context) {
        this.f1048c = context.getApplicationContext();
    }

    public static C0086a c(Context context) {
        if (f1044d == null) {
            synchronized (f1045e) {
                try {
                    if (f1044d == null) {
                        f1044d = new C0086a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1044d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1048c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1047b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = C0088a.c();
        } else {
            Class<Trace> cls2 = Trace.class;
            try {
                if (a.f385b == null) {
                    a.f384a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                    a.f385b = cls2.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                z2 = ((Boolean) a.f385b.invoke((Object) null, new Object[]{Long.valueOf(a.f384a)})).booleanValue();
            } catch (Exception e2) {
                a.l("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(a.A(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f1046a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls3 : a2) {
                        if (!hashMap.containsKey(cls3)) {
                            b(cls3, hashSet);
                        }
                    }
                }
                Object b2 = bVar.b(this.f1048c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } else {
                hashMap.get(cls);
            }
            Trace.endSection();
            return;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
