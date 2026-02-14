package U;

import java.util.Collection;

public abstract class e extends k {
    public static String E(Collection collection, String str, String str2, a aVar, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i3 = 0;
        for (Object next : collection) {
            boolean z2 = true;
            i3++;
            if (i3 > 1) {
                sb.append(", ");
            }
            if (next != null) {
                z2 = next instanceof CharSequence;
            }
            if (z2) {
                sb.append((CharSequence) next);
            } else if (next instanceof Character) {
                sb.append(((Character) next).charValue());
            } else {
                sb.append(next.toString());
            }
        }
        sb.append(str2);
        return sb.toString();
    }
}
