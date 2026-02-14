package d0;

import c0.a;
import c0.c;
import c0.d;
import c0.f;
import c0.g;
import c0.h;
import c0.i;
import c0.j;
import c0.k;
import c0.l;
import c0.m;
import c0.n;
import c0.o;
import c0.p;
import c0.q;
import c0.r;
import c0.s;
import c0.t;
import c0.u;
import c0.v;
import g0.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e implements b, d {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f474b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f475c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f476d;

    /* renamed from: a  reason: collision with root package name */
    public final Class f477a;

    static {
        List asList = Arrays.asList(new Class[]{a.class, l.class, p.class, l0.b.class, q.class, r.class, s.class, t.class, u.class, v.class, c0.b.class, c.class, d.class, c0.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class});
        h.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList(asList.size());
        int i2 = 0;
        for (Object next : asList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new T.b((Class) next, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        Map map = U.n.f365b;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(a.a.o(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    T.b bVar = (T.b) it.next();
                    map.put(bVar.f349b, bVar.f350c);
                }
            } else {
                T.b bVar2 = (T.b) arrayList.get(0);
                h.e(bVar2, "pair");
                map = Collections.singletonMap(bVar2.f349b, bVar2.f350c);
                h.d(map, "singletonMap(...)");
            }
        }
        f474b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(i0.g.G(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f474b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + intValue);
        }
        f475c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.a.o(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, i0.g.G(str2));
        }
        f476d = linkedHashMap;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f477a = cls;
    }

    public final Class a() {
        return this.f477a;
    }

    public final String b() {
        String str;
        Class cls = this.f477a;
        h.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return i0.g.F(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return i0.g.F(simpleName, enclosingConstructor.getName() + '$');
            }
            int indexOf = simpleName.indexOf(36, 0);
            if (indexOf == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(indexOf + 1, simpleName.length());
            h.d(substring, "substring(...)");
            return substring;
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f476d;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e) || !a.a.k(this).equals(a.a.k((b) obj))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a.a.k(this).hashCode();
    }

    public final String toString() {
        return this.f477a + " (Kotlin reflection is not available)";
    }
}
