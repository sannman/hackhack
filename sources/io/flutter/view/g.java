package io.flutter.view;

import D.C0009j;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import n.d;

public final class g {
    public String A;

    /* renamed from: B  reason: collision with root package name */
    public int f720B = -1;

    /* renamed from: C  reason: collision with root package name */
    public boolean f721C = false;

    /* renamed from: D  reason: collision with root package name */
    public long f722D;

    /* renamed from: E  reason: collision with root package name */
    public int f723E;

    /* renamed from: F  reason: collision with root package name */
    public int f724F;

    /* renamed from: G  reason: collision with root package name */
    public int f725G;

    /* renamed from: H  reason: collision with root package name */
    public float f726H;
    public String I;

    /* renamed from: J  reason: collision with root package name */
    public String f727J;
    public float K;

    /* renamed from: L  reason: collision with root package name */
    public float f728L;

    /* renamed from: M  reason: collision with root package name */
    public float f729M;

    /* renamed from: N  reason: collision with root package name */
    public float f730N;

    /* renamed from: O  reason: collision with root package name */
    public float[] f731O;

    /* renamed from: P  reason: collision with root package name */
    public g f732P;

    /* renamed from: Q  reason: collision with root package name */
    public final ArrayList f733Q = new ArrayList();

    /* renamed from: R  reason: collision with root package name */
    public final ArrayList f734R = new ArrayList();

    /* renamed from: S  reason: collision with root package name */
    public ArrayList f735S;

    /* renamed from: T  reason: collision with root package name */
    public e f736T;

    /* renamed from: U  reason: collision with root package name */
    public e f737U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f738V = true;

    /* renamed from: W  reason: collision with root package name */
    public float[] f739W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f740X = true;

    /* renamed from: Y  reason: collision with root package name */
    public float[] f741Y;

    /* renamed from: Z  reason: collision with root package name */
    public Rect f742Z;

    /* renamed from: a  reason: collision with root package name */
    public final k f743a;

    /* renamed from: b  reason: collision with root package name */
    public int f744b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f745c;

    /* renamed from: d  reason: collision with root package name */
    public int f746d;

    /* renamed from: e  reason: collision with root package name */
    public int f747e;

    /* renamed from: f  reason: collision with root package name */
    public int f748f;

    /* renamed from: g  reason: collision with root package name */
    public int f749g;

    /* renamed from: h  reason: collision with root package name */
    public int f750h;

    /* renamed from: i  reason: collision with root package name */
    public int f751i;

    /* renamed from: j  reason: collision with root package name */
    public int f752j;

    /* renamed from: k  reason: collision with root package name */
    public int f753k;

    /* renamed from: l  reason: collision with root package name */
    public float f754l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public float f755n;

    /* renamed from: o  reason: collision with root package name */
    public String f756o;

    /* renamed from: p  reason: collision with root package name */
    public String f757p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f758q;

    /* renamed from: r  reason: collision with root package name */
    public String f759r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f760s;

    /* renamed from: t  reason: collision with root package name */
    public String f761t;
    public ArrayList u;

    /* renamed from: v  reason: collision with root package name */
    public String f762v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f763w;

    /* renamed from: x  reason: collision with root package name */
    public String f764x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f765y;

    /* renamed from: z  reason: collision with root package name */
    public String f766z;

    public g(k kVar) {
        this.f743a = kVar;
    }

    public static boolean a(g gVar, d dVar) {
        if ((gVar.f746d & dVar.f713b) != 0) {
            return true;
        }
        return false;
    }

    public static CharSequence b(g gVar) {
        CharSequence[] charSequenceArr = {d(gVar.f759r, gVar.f760s), gVar.e(), d(gVar.f764x, gVar.f765y)};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                if (charSequence == null || charSequence.length() == 0) {
                    charSequence = charSequence2;
                } else {
                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                }
            }
        }
        return charSequence;
    }

    public static SpannableString d(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                int a2 = d.a(iVar.f769c);
                if (a2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), iVar.f767a, iVar.f768b, 0);
                } else if (a2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((f) iVar).f719d)), iVar.f767a, iVar.f768b, 0);
                } else if (a2 == 2) {
                    spannableString.setSpan(new URLSpan(((j) iVar).f770d), iVar.f767a, iVar.f768b, 0);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [io.flutter.view.i, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [io.flutter.view.i, java.lang.Object, io.flutter.view.f] */
    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = d.b(3)[byteBuffer.getInt()];
            int a2 = d.a(i6);
            if (a2 == 0) {
                byteBuffer.getInt();
                ? obj = new Object();
                obj.f767a = i4;
                obj.f768b = i5;
                obj.f769c = i6;
                arrayList.add(obj);
            } else if (a2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                ? obj2 = new Object();
                obj2.f767a = i4;
                obj2.f768b = i5;
                obj2.f769c = i6;
                obj2.f719d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = fArr;
        Matrix.multiplyMV(fArr4, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr4[3];
        fArr4[0] = fArr4[0] / f2;
        fArr4[1] = fArr4[1] / f2;
        fArr4[2] = fArr4[2] / f2;
        fArr4[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f733Q.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(arrayList);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [io.flutter.view.j, io.flutter.view.i, java.lang.Object] */
    public final SpannableString e() {
        ArrayList arrayList = this.f758q;
        String str = this.A;
        if (str != null && str.length() > 0) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(arrayList);
            }
            ? obj = new Object();
            obj.f767a = 0;
            obj.f768b = this.f757p.length();
            obj.f770d = this.A;
            obj.f769c = 3;
            arrayList.add(obj);
        }
        return d(this.f757p, arrayList);
    }

    public final String f() {
        String str;
        if (h(13) && (str = this.f757p) != null && !str.isEmpty()) {
            return this.f757p;
        }
        Iterator it = this.f733Q.iterator();
        while (it.hasNext()) {
            String f2 = ((g) it.next()).f();
            if (f2 != null && !f2.isEmpty()) {
                return f2;
            }
        }
        return null;
    }

    public final boolean h(int i2) {
        if ((this.f745c & ((long) C0009j.d(i2))) != 0) {
            return true;
        }
        return false;
    }

    public final g i(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.K || f3 >= this.f729M || f4 < this.f728L || f4 >= this.f730N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f734R.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.h(14)) {
                if (gVar.f738V) {
                    gVar.f738V = false;
                    if (gVar.f739W == null) {
                        gVar.f739W = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f739W, 0, gVar.f731O, 0)) {
                        Arrays.fill(gVar.f739W, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, gVar.f739W, 0, fArr3, 0);
                g i2 = gVar.i(fArr2, z2);
                if (i2 != null) {
                    return i2;
                }
                fArr = fArr3;
            }
        }
        if (z2 && this.f751i != -1) {
            z3 = true;
        }
        if (j() || z3) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        int i2 = this.f746d;
        int i3 = k.f771x;
        if ((i2 & -61) != 0 || (this.f745c & ((long) 10682871)) != 0) {
            return true;
        }
        String str = this.f757p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f759r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f764x;
        if (str3 == null || str3.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f740X) {
            z2 = true;
        }
        if (z2) {
            if (this.f741Y == null) {
                this.f741Y = new float[16];
            }
            if (this.f731O == null) {
                this.f731O = new float[16];
            }
            Matrix.multiplyMM(this.f741Y, 0, fArr, 0, this.f731O, 0);
            float[] fArr2 = new float[4];
            fArr2[2] = 0.0f;
            fArr2[3] = 1.0f;
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            fArr2[0] = this.K;
            fArr2[1] = this.f728L;
            k(fArr3, this.f741Y, fArr2);
            fArr2[0] = this.f729M;
            fArr2[1] = this.f728L;
            k(fArr4, this.f741Y, fArr2);
            fArr2[0] = this.f729M;
            fArr2[1] = this.f730N;
            k(fArr5, this.f741Y, fArr2);
            fArr2[0] = this.K;
            fArr2[1] = this.f730N;
            k(fArr6, this.f741Y, fArr2);
            if (this.f742Z == null) {
                this.f742Z = new Rect();
            }
            this.f742Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f740X = false;
        }
        Iterator it = this.f733Q.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.f720B = i2;
            i2 = gVar.f744b;
            gVar.l(this.f741Y, hashSet, z2);
        }
    }
}
