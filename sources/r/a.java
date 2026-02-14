package R;

import M.b;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;

public final /* synthetic */ class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f343b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f344c;

    public /* synthetic */ a(d dVar, int i2) {
        this.f343b = i2;
        this.f344c = dVar;
    }

    public final void g(Object obj, B.a aVar) {
        switch (this.f343b) {
            case 0:
                d dVar = this.f344c;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(0, dVar.f348a.getCacheDir().getPath());
                } catch (Throwable th) {
                    arrayList = a.a.D(th);
                }
                aVar.d(arrayList);
                return;
            case 1:
                d dVar2 = this.f344c;
                ArrayList arrayList2 = new ArrayList();
                try {
                    Context context = dVar2.f348a;
                    File filesDir = context.getFilesDir();
                    if (filesDir == null) {
                        filesDir = new File(context.getDataDir().getPath(), "files");
                    }
                    arrayList2.add(0, filesDir.getPath());
                } catch (Throwable th2) {
                    arrayList2 = a.a.D(th2);
                }
                aVar.d(arrayList2);
                return;
            case 2:
                d dVar3 = this.f344c;
                ArrayList arrayList3 = new ArrayList();
                try {
                    Context context2 = dVar3.f348a;
                    File dir = context2.getDir("flutter", 0);
                    if (dir == null) {
                        dir = new File(context2.getDataDir().getPath(), "app_flutter");
                    }
                    arrayList3.add(0, dir.getPath());
                } catch (Throwable th3) {
                    arrayList3 = a.a.D(th3);
                }
                aVar.d(arrayList3);
                return;
            case 3:
                d dVar4 = this.f344c;
                ArrayList arrayList4 = new ArrayList();
                try {
                    arrayList4.add(0, dVar4.f348a.getCacheDir().getPath());
                } catch (Throwable th4) {
                    arrayList4 = a.a.D(th4);
                }
                aVar.d(arrayList4);
                return;
            case 4:
                d dVar5 = this.f344c;
                ArrayList arrayList5 = new ArrayList();
                try {
                    String str = null;
                    File externalFilesDir = dVar5.f348a.getExternalFilesDir((String) null);
                    if (externalFilesDir != null) {
                        str = externalFilesDir.getAbsolutePath();
                    }
                    arrayList5.add(0, str);
                } catch (Throwable th5) {
                    arrayList5 = a.a.D(th5);
                }
                aVar.d(arrayList5);
                return;
            case 5:
                d dVar6 = this.f344c;
                ArrayList arrayList6 = new ArrayList();
                try {
                    dVar6.getClass();
                    ArrayList arrayList7 = new ArrayList();
                    for (File file : dVar6.f348a.getExternalCacheDirs()) {
                        if (file != null) {
                            arrayList7.add(file.getAbsolutePath());
                        }
                    }
                    arrayList6.add(0, arrayList7);
                } catch (Throwable th6) {
                    arrayList6 = a.a.D(th6);
                }
                aVar.d(arrayList6);
                return;
            default:
                d dVar7 = this.f344c;
                ArrayList arrayList8 = new ArrayList();
                try {
                    arrayList8.add(0, dVar7.c((c) ((ArrayList) obj).get(0)));
                } catch (Throwable th7) {
                    arrayList8 = a.a.D(th7);
                }
                aVar.d(arrayList8);
                return;
        }
    }
}
