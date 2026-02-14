package androidx.lifecycle;

import U.m;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import d0.h;
import java.util.List;
import o.C0086a;
import o.b;

public final class ProcessLifecycleInitializer implements b {
    public final List a() {
        return m.f364b;
    }

    public final Object b(Context context) {
        h.e(context, "context");
        C0086a c2 = C0086a.c(context);
        h.d(c2, "getInstance(context)");
        if (c2.f1047b.contains(ProcessLifecycleInitializer.class)) {
            if (!j.f416a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new i());
            }
            r rVar = r.f429i;
            rVar.getClass();
            rVar.f434e = new Handler();
            rVar.f435f.c(f.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q(rVar));
            return rVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
