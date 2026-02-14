package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i.a;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f395k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f396a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f397b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f398c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f399d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f400e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f401f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f402g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f403h = f395k;

    /* renamed from: i  reason: collision with root package name */
    public String f404i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f405j;

    public final String toString() {
        String str;
        int i2;
        if (this.f396a == -1) {
            return String.valueOf(this.f397b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f396a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f396a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f397b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f397b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f405j);
                sb.append(" id=");
                int i3 = this.f396a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f397b;
                    if (i4 >= 28) {
                        i2 = a.a(obj);
                    } else {
                        i2 = 0;
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        }
                    }
                } else if (i3 == 2) {
                    i2 = this.f400e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(i2)}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f400e);
                if (this.f401f != 0) {
                    sb.append(" off=");
                    sb.append(this.f401f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f397b);
                break;
        }
        if (this.f402g != null) {
            sb.append(" tint=");
            sb.append(this.f402g);
        }
        if (this.f403h != f395k) {
            sb.append(" mode=");
            sb.append(this.f403h);
        }
        sb.append(")");
        return sb.toString();
    }
}
