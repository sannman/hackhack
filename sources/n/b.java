package n;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f990a;

    /* renamed from: b  reason: collision with root package name */
    public final f f991b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f992c;

    /* renamed from: d  reason: collision with root package name */
    public final File f993d;

    /* renamed from: e  reason: collision with root package name */
    public final String f994e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f995f = false;

    /* renamed from: g  reason: collision with root package name */
    public c[] f996g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f997h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f990a = executor;
        this.f991b = fVar;
        this.f994e = str;
        this.f993d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = g.f1015h;
                    break;
                case 26:
                    bArr = g.f1014g;
                    break;
                case 27:
                    bArr = g.f1013f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f1012e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f1011d;
                    break;
            }
        }
        this.f992c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f991b.c();
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f990a.execute(new C0085a(this, i2, serializable));
    }
}
