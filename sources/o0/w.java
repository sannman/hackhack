package o0;

import T.d;
import X.b;
import a.a;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1094a = 0;

    static {
        Object obj;
        Object obj2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            obj = b.class.getCanonicalName();
        } catch (Throwable th) {
            obj = a.g(th);
        }
        if (d.a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = w.class.getCanonicalName();
        } catch (Throwable th2) {
            obj2 = a.g(th2);
        }
        if (d.a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
