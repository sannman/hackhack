package n;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f1018b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f1019c;

    public /* synthetic */ h(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1018b = profileInstallerInitializer;
        this.f1019c = context;
    }

    public final void run() {
        Handler handler;
        this.f1018b.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = m.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new i(this.f1019c, 0), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
