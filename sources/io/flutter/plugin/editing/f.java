package io.flutter.plugin.editing;

import L.q;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

public final class f extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public int f590a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f591b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f592c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f593d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f594e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public String f595f;

    /* renamed from: g  reason: collision with root package name */
    public String f596g;

    /* renamed from: h  reason: collision with root package name */
    public int f597h;

    /* renamed from: i  reason: collision with root package name */
    public int f598i;

    /* renamed from: j  reason: collision with root package name */
    public int f599j;

    /* renamed from: k  reason: collision with root package name */
    public int f600k;

    /* renamed from: l  reason: collision with root package name */
    public final d f601l;

    public f(q qVar, View view) {
        this.f601l = new d(view, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(e eVar) {
        if (this.f591b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f590a > 0) {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f593d.add(eVar);
            return;
        }
        this.f592c.add(eVar);
    }

    public final void b() {
        this.f590a++;
        if (this.f591b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f590a == 1 && !this.f592c.isEmpty()) {
            this.f596g = toString();
            this.f597h = Selection.getSelectionStart(this);
            this.f598i = Selection.getSelectionEnd(this);
            this.f599j = BaseInputConnection.getComposingSpanStart(this);
            this.f600k = BaseInputConnection.getComposingSpanEnd(this);
        }
    }

    public final void c() {
        boolean z2;
        int i2 = this.f590a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f592c;
        ArrayList arrayList2 = this.f593d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f591b++;
                ((e) it.next()).a(true);
                this.f591b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                boolean z3 = !toString().equals(this.f596g);
                boolean z4 = false;
                if (this.f597h == Selection.getSelectionStart(this) && this.f598i == Selection.getSelectionEnd(this)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!(this.f599j == BaseInputConnection.getComposingSpanStart(this) && this.f600k == BaseInputConnection.getComposingSpanEnd(this))) {
                    z4 = true;
                }
                d(z3, z2, z4);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f590a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f592c.iterator();
            while (it.hasNext()) {
                this.f591b++;
                ((e) it.next()).a(z2);
                this.f591b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f591b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f592c.remove(eVar);
        if (this.f590a > 0) {
            this.f593d.remove(eVar);
        }
    }

    public final void f(q qVar) {
        int i2;
        b();
        replace(0, length(), qVar.f316a);
        int i3 = qVar.f317b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, qVar.f318c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = qVar.f319d;
        if (i4 < 0 || i4 >= (i2 = qVar.f320e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f601l.setComposingRegion(i4, i2);
        }
        this.f594e.clear();
        c();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [io.flutter.plugin.editing.h, java.lang.Object] */
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f594e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        ? obj2 = new Object();
        obj2.f610e = selectionStart;
        obj2.f611f = selectionEnd;
        obj2.f612g = composingSpanStart;
        obj2.f613h = composingSpanEnd;
        obj2.f606a = fVar;
        obj2.f607b = "";
        obj2.f608c = -1;
        obj2.f609d = -1;
        arrayList.add(obj2);
    }

    public final String toString() {
        String str = this.f595f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f595f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [io.flutter.plugin.editing.h, java.lang.Object] */
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        if (this.f591b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i8 = i7 - i6;
        boolean z2 = i8 != i5 - i4;
        for (int i9 = 0; i9 < i8 && !z2; i9++) {
            z2 |= charAt(i6 + i9) != charSequence.charAt(i4 + i9);
        }
        CharSequence charSequence2 = charSequence;
        if (z2) {
            this.f595f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f594e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        ? obj = new Object();
        obj.f610e = selectionStart2;
        obj.f611f = selectionEnd2;
        obj.f612g = composingSpanStart2;
        obj.f613h = composingSpanEnd2;
        String charSequence3 = charSequence.toString();
        obj.f606a = fVar;
        obj.f607b = charSequence3;
        obj.f608c = i6;
        obj.f609d = i7;
        arrayList.add(obj);
        if (this.f590a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
