package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import io.flutter.plugin.platform.c;
import java.io.File;
import java.io.Serializable;
import n.g;

public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARNING: type inference failed for: r7v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                g.s(context, new Object(), new c(3, this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        c cVar = new c(3, this);
                        try {
                            g.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            cVar.a(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e2) {
                            cVar.a(7, e2);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                c cVar2 = new c(3, this);
                if (!"DROP_SHADER_CACHE".equals(string2)) {
                    cVar2.a(16, (Serializable) null);
                } else if (g.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    cVar2.a(14, (Serializable) null);
                } else {
                    cVar2.a(15, (Serializable) null);
                }
            }
        }
    }
}
