package L;

import org.json.JSONObject;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f316a;

    /* renamed from: b  reason: collision with root package name */
    public final int f317b;

    /* renamed from: c  reason: collision with root package name */
    public final int f318c;

    /* renamed from: d  reason: collision with root package name */
    public final int f319d;

    /* renamed from: e  reason: collision with root package name */
    public final int f320e;

    public q(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i2) + ", " + String.valueOf(i3) + ")");
        } else if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
        } else if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i4));
        } else if (i2 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i2));
        } else if (i3 <= str.length()) {
            this.f316a = str;
            this.f317b = i2;
            this.f318c = i3;
            this.f319d = i4;
            this.f320e = i5;
        } else {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i3));
        }
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
