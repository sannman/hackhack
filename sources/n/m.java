package n;

import android.os.Handler;
import android.os.Looper;

public abstract class m {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
