package P;

import E.d;
import L.k;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;

public class a implements J.a {

    /* renamed from: a  reason: collision with root package name */
    public final PackageManager f336a;

    /* renamed from: b  reason: collision with root package name */
    public d f337b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap f338c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f339d = new HashMap();

    public a(B.a aVar) {
        this.f336a = (PackageManager) aVar.f3c;
        aVar.f4d = this;
    }

    public final void c(String str, String str2, boolean z2, k kVar) {
        if (this.f337b == null) {
            kVar.a("error", "Plugin not bound to an Activity", (Object) null);
            return;
        }
        HashMap hashMap = this.f338c;
        if (hashMap == null) {
            kVar.a("error", "Can not process text actions before calling queryTextActions", (Object) null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            kVar.a("error", "Text processing activity not found", (Object) null);
            return;
        }
        int hashCode = kVar.hashCode();
        this.f339d.put(Integer.valueOf(hashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        this.f337b.f160a.startActivityForResult(intent, hashCode);
    }

    public final HashMap d() {
        List<ResolveInfo> list;
        HashMap hashMap = this.f338c;
        PackageManager packageManager = this.f336a;
        if (hashMap == null) {
            this.f338c = new HashMap();
            int i2 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (i2 >= 33) {
                list = packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0));
            } else {
                list = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo next : list) {
                String str = next.activityInfo.name;
                next.loadLabel(packageManager).toString();
                this.f338c.put(str, next);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f338c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f338c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    public final void a(B.a aVar) {
    }

    public final void b(B.a aVar) {
    }
}
