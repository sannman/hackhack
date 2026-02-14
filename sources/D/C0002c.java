package D;

import android.media.ImageReader;

/* renamed from: D.c  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0002c {
    public static /* synthetic */ ImageReader.Builder c(int i2, int i3) {
        return new ImageReader.Builder(i2, i3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void g() {
        /*
            android.media.ImageReader$Builder r0 = new android.media.ImageReader$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0002c.g():void");
    }
}
