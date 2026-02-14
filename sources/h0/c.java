package h0;

import U.m;
import a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class c extends d {
    public static List E(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return m.f364b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a.n(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
