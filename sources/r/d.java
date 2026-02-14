package R;

import B.b;
import B.e;
import J.a;
import M.f;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public Context f348a;

    /* JADX WARNING: type inference failed for: r0v0, types: [M.h, java.lang.Object] */
    public static void d(f fVar, d dVar) {
        fVar.getClass();
        b d2 = fVar.d(new Object());
        b bVar = b.f345d;
        e eVar = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, d2);
        if (dVar != null) {
            eVar.g(new a(dVar, 0));
        } else {
            eVar.g((M.b) null);
        }
        e eVar2 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, d2);
        if (dVar != null) {
            eVar2.g(new a(dVar, 1));
        } else {
            eVar2.g((M.b) null);
        }
        e eVar3 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, d2);
        if (dVar != null) {
            eVar3.g(new a(dVar, 2));
        } else {
            eVar3.g((M.b) null);
        }
        e eVar4 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, d2);
        if (dVar != null) {
            eVar4.g(new a(dVar, 3));
        } else {
            eVar4.g((M.b) null);
        }
        e eVar5 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, d2);
        if (dVar != null) {
            eVar5.g(new a(dVar, 4));
        } else {
            eVar5.g((M.b) null);
        }
        e eVar6 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, d2);
        if (dVar != null) {
            eVar6.g(new a(dVar, 5));
        } else {
            eVar6.g((M.b) null);
        }
        e eVar7 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, d2);
        if (dVar != null) {
            eVar7.g(new a(dVar, 6));
        } else {
            eVar7.g((M.b) null);
        }
    }

    public final void a(B.a aVar) {
        try {
            d((f) aVar.f4d, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f348a = (Context) aVar.f3c;
    }

    public final void b(B.a aVar) {
        d((f) aVar.f4d, (d) null);
    }

    public final ArrayList c(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f348a;
        switch (cVar.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case 2:
                str = "podcasts";
                break;
            case 3:
                str = "ringtones";
                break;
            case 4:
                str = "alarms";
                break;
            case 5:
                str = "notifications";
                break;
            case 6:
                str = "pictures";
                break;
            case 7:
                str = "movies";
                break;
            case 8:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }
}
