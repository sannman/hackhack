package M;

import a.a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class h implements i, k {

    /* renamed from: a  reason: collision with root package name */
    public static final h f326a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final h f327b = new Object();

    public ByteBuffer a(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(a.C(str)).put(JSONObject.NULL).put(a.C(str2));
        if (put == null) {
            return null;
        }
        Object C2 = a.C(put);
        if (C2 instanceof String) {
            o oVar = o.f333b;
            String quote = JSONObject.quote((String) C2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f333b;
        String obj = C2.toString();
        oVar2.getClass();
        return o.d(obj);
    }

    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            o.f333b.getClass();
            JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    public ByteBuffer c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object C2 = a.C(obj);
        if (C2 instanceof String) {
            o oVar = o.f333b;
            String quote = JSONObject.quote((String) C2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f333b;
        String obj2 = C2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    public ByteBuffer d(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(a.C(str2)).put(a.C(obj));
        if (put == null) {
            return null;
        }
        Object C2 = a.C(put);
        if (C2 instanceof String) {
            o oVar = o.f333b;
            String quote = JSONObject.quote((String) C2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f333b;
        String obj2 = C2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    public ByteBuffer e(Object obj) {
        JSONArray put = new JSONArray().put(a.C(obj));
        if (put == null) {
            return null;
        }
        Object C2 = a.C(put);
        if (C2 instanceof String) {
            o oVar = o.f333b;
            String quote = JSONObject.quote((String) C2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f333b;
        String obj2 = C2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    public ByteBuffer f(B.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) aVar.f3c);
            jSONObject.put("args", a.C(aVar.f4d));
            Object C2 = a.C(jSONObject);
            if (C2 instanceof String) {
                o oVar = o.f333b;
                String quote = JSONObject.quote((String) C2);
                oVar.getClass();
                return o.d(quote);
            }
            o oVar2 = o.f333b;
            String obj = C2.toString();
            oVar2.getClass();
            return o.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    public B.a g(ByteBuffer byteBuffer) {
        Object obj;
        Object obj2 = null;
        if (byteBuffer == null) {
            obj = null;
        } else {
            try {
                o.f333b.getClass();
                JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
                obj = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
            } catch (JSONException e2) {
                throw new IllegalArgumentException("Invalid JSON", e2);
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Object obj3 = jSONObject.get("method");
            Object opt = jSONObject.opt("args");
            if (opt != JSONObject.NULL) {
                obj2 = opt;
            }
            if (obj3 instanceof String) {
                return new B.a(12, (Object) (String) obj3, obj2);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + obj);
    }

    public Object h(ByteBuffer byteBuffer) {
        try {
            o.f333b.getClass();
            JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object opt = jSONArray.opt(0);
                        if (opt == JSONObject.NULL) {
                            return null;
                        }
                        return opt;
                    } else if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object opt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (opt2 == obj3) {
                            opt2 = null;
                        }
                        Object opt3 = jSONArray.opt(2);
                        if (opt3 != obj3) {
                            obj = opt3;
                        }
                        if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                            throw new g((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
