package io.flutter.view;

import android.view.View;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final View f799a;

    /* renamed from: b  reason: collision with root package name */
    public final int f800b;

    public m(View view, int i2) {
        this.f799a = view;
        this.f800b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (io.flutter.view.m) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof io.flutter.view.m
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            io.flutter.view.m r5 = (io.flutter.view.m) r5
            int r1 = r5.f800b
            int r3 = r4.f800b
            if (r3 != r1) goto L_0x001d
            android.view.View r1 = r4.f799a
            android.view.View r5 = r5.f799a
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x001d
            return r0
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.f799a.hashCode() + 31) * 31) + this.f800b;
    }
}
