package C;

import D.G;
import D.H;
import D.I;
import D.J;
import D.x;
import L.k;
import M.a;
import M.f;
import android.app.Activity;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import d0.h;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import io.flutter.view.d;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import y.j;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static b f12d;

    /* renamed from: a  reason: collision with root package name */
    public Object f13a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f13a = obj;
        this.f14b = obj2;
        this.f15c = obj3;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [C.a, java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARNING: type inference failed for: r3v0, types: [H.f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [C.b, java.lang.Object] */
    public static b d() {
        if (f12d == null) {
            B.b bVar = new B.b(2);
            ? obj = new Object();
            obj.f11a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(obj);
            FlutterJNI flutterJNI = new FlutterJNI();
            ? obj2 = new Object();
            obj2.f240a = false;
            obj2.f244e = flutterJNI;
            obj2.f245f = newCachedThreadPool;
            ? obj3 = new Object();
            obj3.f13a = obj2;
            obj3.f14b = bVar;
            obj3.f15c = newCachedThreadPool;
            f12d = obj3;
        }
        return f12d;
    }

    public void a(int i2, d dVar) {
        ((FlutterJNI) this.f14b).dispatchSemanticsAction(i2, dVar);
    }

    public void b(int i2, d dVar, Serializable serializable) {
        ((FlutterJNI) this.f14b).dispatchSemanticsAction(i2, dVar, serializable);
    }

    public boolean c(KeyEvent keyEvent) {
        if (((HashSet) this.f14b).remove(keyEvent)) {
            return false;
        }
        I[] iArr = (I[]) this.f13a;
        if (iArr.length > 0) {
            H h2 = new H(this, keyEvent);
            for (I a2 : iArr) {
                a2.a(keyEvent, new G(h2));
            }
            return true;
        }
        f(keyEvent);
        return true;
    }

    public void e(String str, Object obj, k kVar) {
        a aVar;
        ByteBuffer f2 = ((M.k) this.f15c).f(new B.a(12, (Object) str, obj));
        if (kVar == null) {
            aVar = null;
        } else {
            aVar = new a(1, this, kVar);
        }
        ((f) this.f13a).f((String) this.f14b, f2, aVar);
    }

    public void f(KeyEvent keyEvent) {
        c cVar;
        J j2 = (J) this.f15c;
        if (j2 != null) {
            x xVar = (x) j2;
            io.flutter.plugin.editing.k kVar = xVar.f124k;
            boolean z2 = false;
            if (kVar.f620b.isAcceptingText() && (cVar = kVar.f628j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z2 = cVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z2 = cVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z2 = cVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z2 = cVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = cVar.f580e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & 255);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f579d;
                    int selectionStart = Selection.getSelectionStart(fVar);
                    int selectionEnd = Selection.getSelectionEnd(fVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = Math.min(selectionStart, selectionEnd);
                        int max = Math.max(selectionStart, selectionEnd);
                        cVar.beginBatchEdit();
                        if (min != max) {
                            fVar.delete(min, max);
                        }
                        fVar.insert(min, String.valueOf((char) unicodeChar));
                        int i2 = min + 1;
                        cVar.setSelection(i2, i2);
                        cVar.endBatchEdit();
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                HashSet hashSet = (HashSet) this.f14b;
                hashSet.add(keyEvent);
                xVar.getRootView().dispatchKeyEvent(keyEvent);
                if (hashSet.remove(keyEvent)) {
                    Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }

    public void g(Activity activity, v.k kVar) {
        h.e(activity, "activity");
        h.e(kVar, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f14b;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f15c;
        try {
            if (!kVar.equals((v.k) weakHashMap.get(activity))) {
                v.k kVar2 = (v.k) weakHashMap.put(activity, kVar);
                reentrantLock.unlock();
                Iterator it = ((y.k) ((io.flutter.plugin.platform.c) this.f13a).f637c).f1253b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f1247a.equals(activity)) {
                        jVar.f1249c = kVar;
                        jVar.f1248b.accept(kVar);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void h(M.j jVar) {
        B.a aVar = new B.a(this, jVar, 13, false);
        ((f) this.f13a).a((String) this.f14b, aVar);
    }
}
