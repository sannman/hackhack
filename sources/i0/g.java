package i0;

import d0.h;

public abstract class g extends f {
    public static final int E(CharSequence charSequence) {
        h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String F(String str, String str2) {
        h.e(str2, "delimiter");
        h.e(str2, "string");
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + indexOf, str.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public static String G(String str) {
        int lastIndexOf = str.lastIndexOf(46, E(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        h.d(substring, "substring(...)");
        return substring;
    }
}
