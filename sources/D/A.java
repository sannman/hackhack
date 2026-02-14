package D;

import M.c;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class A implements c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16b;

    public /* synthetic */ A(Object obj) {
        this.f16b = obj;
    }

    public void d(Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((G) ((A) this.f16b).f16b).a(z2);
    }
}
