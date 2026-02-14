package H;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f225a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f226b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f227c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f228d;

    static {
        Class<f> cls = f.class;
        f225a = cls.getName().concat(".aot-shared-library-name");
        f226b = cls.getName().concat(".vm-snapshot-data");
        f227c = cls.getName().concat(".isolate-snapshot-data");
        f228d = cls.getName().concat(".flutter-assets-dir");
    }

    public static b a(Context context) {
        String str;
        String str2;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str3 = null;
            if (bundle == null) {
                str = null;
            } else {
                str = bundle.getString(f225a, (String) null);
            }
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(f226b, (String) null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(f227c, (String) null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            if (bundle4 == null) {
                str2 = null;
            } else {
                str2 = bundle4.getString(f228d, (String) null);
            }
            Bundle bundle5 = applicationInfo.metaData;
            boolean z2 = true;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2 && xml.getName().equals("domain-config")) {
                            b(xml, jSONArray, false);
                        }
                    }
                    str3 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str4 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            if (bundle6 != null) {
                z2 = bundle6.getBoolean("io.flutter.automatically-register-plugins", true);
            }
            return new b(str, str2, str3, str4, z2);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (!xmlResourceParser.getName().equals("domain")) {
                    if (!xmlResourceParser.getName().equals("domain-config")) {
                        String name = xmlResourceParser.getName();
                        int eventType = xmlResourceParser.getEventType();
                        while (true) {
                            if (eventType == 3 && xmlResourceParser.getName() == name) {
                                break;
                            }
                            eventType = xmlResourceParser.next();
                        }
                    } else {
                        b(xmlResourceParser, jSONArray, attributeBooleanValue);
                    }
                } else {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() == 4) {
                        String trim = xmlResourceParser.getText().trim();
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(trim);
                        jSONArray2.put(attributeBooleanValue2);
                        jSONArray2.put(attributeBooleanValue);
                        jSONArray.put(jSONArray2);
                        xmlResourceParser.next();
                        if (xmlResourceParser.getEventType() != 3) {
                            throw new IllegalStateException("Expected end of domain tag");
                        }
                    } else {
                        throw new IllegalStateException("Expected text");
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
