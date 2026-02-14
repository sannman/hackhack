package D;

import android.view.KeyCharacterMap;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public int f34a;

    public F() {
        this.f34a = 0;
    }

    public Character a(int i2) {
        char c2 = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = this.f34a;
            if (i4 != 0) {
                this.f34a = KeyCharacterMap.getDeadChar(i4, i3);
            } else {
                this.f34a = i3;
            }
        } else {
            int i5 = this.f34a;
            if (i5 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i5, i2);
                if (deadChar > 0) {
                    c2 = (char) deadChar;
                }
                this.f34a = 0;
            }
        }
        return Character.valueOf(c2);
    }

    public F(int i2) {
        this.f34a = i2;
    }
}
