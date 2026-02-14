package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

public final class n extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final q f681a;

    /* renamed from: b  reason: collision with root package name */
    public q f682b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f683c;

    public n(Context context, q qVar, Context context2) {
        super(context);
        this.f681a = qVar;
        this.f683c = context2;
    }

    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i2 = 0;
        while (i2 < stackTrace.length && i2 < 11) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f683c.getSystemService(str);
            }
            i2++;
        }
        if (this.f682b == null) {
            this.f682b = this.f681a;
        }
        return this.f682b;
    }
}
