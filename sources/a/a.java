package a;

import E.c;
import S.b;
import V.d;
import V.f;
import V.g;
import V.i;
import V.j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import c0.l;
import d0.e;
import d0.h;
import f.C0034c;
import f.C0037f;
import f.C0038g;
import io.flutter.plugins.GeneratedPluginRegistrant;
import j0.C0058p;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C0071d;
import l.C0072e;
import l.C0073f;
import l.C0074g;
import l.C0081n;
import org.json.JSONArray;
import org.json.JSONObject;
import v.m;
import v.n;
import z.C0113a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f384a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f385b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f386c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f387d;

    public static String A(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static final boolean B(String str, c0.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.a()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static Object C(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object C2 : (Collection) obj) {
                    jSONArray.put(C(C2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray2.put(C(Array.get(obj, i2)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), C(entry.getValue()));
                }
                return jSONObject;
            } else if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            } else {
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    public static ArrayList D(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void a(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = Z.a.f383a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = Y.a.f382a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static void b(Context context, b bVar) {
        Rect rect;
        C0081n nVar;
        C0074g gVar;
        Activity j2 = j(context);
        if (j2 != null) {
            m.f1218a.getClass();
            int i2 = n.f1219b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                rect = ((WindowManager) j2.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = j2.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                if (i3 >= 30) {
                    gVar = new C0073f();
                } else if (i3 >= 29) {
                    gVar = new C0072e();
                } else {
                    gVar = new C0071d();
                }
                nVar = gVar.b();
                h.d(nVar, "{\n            WindowInse…ilder().build()\n        }");
            } else if (i3 >= 30) {
                nVar = C0113a.f1254a.a(j2);
            } else {
                throw new Exception("Incompatible SDK version");
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
            } else if (i5 <= i7) {
                h.e(nVar, "_windowInsetsCompat");
                float f2 = context.getResources().getDisplayMetrics().density;
                ((c) bVar).f139a.updateDisplayMetrics(0, (float) new Rect(i4, i5, i6, i7).width(), (float) new Rect(i4, i5, i6, i7).height(), f2);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    public static final T.c g(Throwable th) {
        h.e(th, "exception");
        return new T.c(th);
    }

    public static String h(Object obj, String str) {
        h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static boolean i(Method method, e eVar) {
        Class a2 = eVar.a();
        h.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static Activity j(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return j(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Class k(g0.b r2) {
        /*
            java.lang.String r0 = "<this>"
            d0.h.e(r2, r0)
            d0.d r2 = (d0.d) r2
            java.lang.Class r2 = r2.a()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L_0x0013
            goto L_0x0088
        L_0x0013:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L_0x0080;
                case 104431: goto L_0x0074;
                case 3039496: goto L_0x0068;
                case 3052374: goto L_0x005c;
                case 3327612: goto L_0x0050;
                case 3625364: goto L_0x0044;
                case 64711720: goto L_0x0038;
                case 97526364: goto L_0x002c;
                case 109413500: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0088
        L_0x0020:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0029
            goto L_0x0088
        L_0x0029:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L_0x002c:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x0088
        L_0x0035:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L_0x0038:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0041
            goto L_0x0088
        L_0x0041:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L_0x0044:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004d
            goto L_0x0088
        L_0x004d:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L_0x0050:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0059
            goto L_0x0088
        L_0x0059:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L_0x005c:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x0088
        L_0x0065:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L_0x0068:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0071
            goto L_0x0088
        L_0x0071:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L_0x0074:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007d
            goto L_0x0088
        L_0x007d:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L_0x0080:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0089
        L_0x0088:
            return r2
        L_0x0089:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.k(g0.b):java.lang.Class");
    }

    public static void l(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static d m(d dVar) {
        X.b bVar;
        d dVar2;
        h.e(dVar, "<this>");
        if (dVar instanceof X.b) {
            bVar = (X.b) dVar;
        } else {
            bVar = null;
        }
        if (bVar == null || (dVar = bVar.f378d) != null) {
            return dVar;
        }
        i iVar = bVar.f377c;
        h.b(iVar);
        f fVar = (f) iVar.g(V.e.f371b);
        if (fVar != null) {
            dVar2 = new o0.h((C0058p) fVar, bVar);
        } else {
            dVar2 = bVar;
        }
        bVar.f378d = dVar2;
        return dVar2;
    }

    public static List n(Object obj) {
        List singletonList = Collections.singletonList(obj);
        h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int o(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static i p(g gVar, V.h hVar) {
        h.e(hVar, "key");
        if (h.a(gVar.getKey(), hVar)) {
            return j.f372b;
        }
        return gVar;
    }

    public static s.h q(String str) {
        String group;
        String str2;
        if (str != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= str.length()) {
                    break;
                }
                char charAt = str.charAt(i2);
                if (Character.isWhitespace(charAt) || Character.isSpaceChar(charAt)) {
                    i2++;
                } else {
                    Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        int parseInt = Integer.parseInt(group);
                        String group2 = matcher.group(2);
                        if (group2 != null) {
                            int parseInt2 = Integer.parseInt(group2);
                            String group3 = matcher.group(3);
                            if (group3 != null) {
                                int parseInt3 = Integer.parseInt(group3);
                                if (matcher.group(4) != null) {
                                    str2 = matcher.group(4);
                                } else {
                                    str2 = "";
                                }
                                h.d(str2, "description");
                                return new s.h(parseInt, parseInt2, parseInt3, str2);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static i r(g gVar, i iVar) {
        h.e(iVar, "context");
        return s(gVar, iVar);
    }

    public static i s(i iVar, i iVar2) {
        h.e(iVar2, "context");
        if (iVar2 == j.f372b) {
            return iVar;
        }
        return (i) iVar2.d(iVar, new V.b(1));
    }

    public static void v(c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{c.class}).invoke((Object) null, new Object[]{cVar});
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static final void z(Object obj) {
        if (obj instanceof T.c) {
            throw ((T.c) obj).f351b;
        }
    }

    public abstract boolean c(C0038g gVar, C0034c cVar);

    public abstract boolean d(C0038g gVar, Object obj, Object obj2);

    public abstract boolean e(C0038g gVar, C0037f fVar, C0037f fVar2);

    public abstract Object f();

    public abstract void t(C0037f fVar, C0037f fVar2);

    public abstract void u(C0037f fVar, Thread thread);

    public abstract a w(String str, l lVar);

    public abstract void y(boolean z2);

    public void x(boolean z2) {
    }
}
