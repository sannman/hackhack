package D;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.util.Locale;

/* renamed from: D.a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0000a {
    public static /* bridge */ /* synthetic */ AutofillManager d(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue f(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return AutofillManager.class;
    }

    public static /* synthetic */ Locale.LanguageRange l(String str) {
        return new Locale.LanguageRange(str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void n() {
        /*
            java.util.Locale$LanguageRange r0 = new java.util.Locale$LanguageRange
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0000a.n():void");
    }
}
