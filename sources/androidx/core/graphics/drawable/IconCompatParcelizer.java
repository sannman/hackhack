package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import q.b;
import q.c;

public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f396a;
        if (bVar.e(1)) {
            i2 = ((c) bVar).f1150e.readInt();
        }
        iconCompat.f396a = i2;
        byte[] bArr = iconCompat.f398c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f1150e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f398c = bArr;
        iconCompat.f399d = bVar.f(iconCompat.f399d, 3);
        int i3 = iconCompat.f400e;
        if (bVar.e(4)) {
            i3 = ((c) bVar).f1150e.readInt();
        }
        iconCompat.f400e = i3;
        int i4 = iconCompat.f401f;
        if (bVar.e(5)) {
            i4 = ((c) bVar).f1150e.readInt();
        }
        iconCompat.f401f = i4;
        iconCompat.f402g = (ColorStateList) bVar.f(iconCompat.f402g, 6);
        String str = iconCompat.f404i;
        if (bVar.e(7)) {
            str = ((c) bVar).f1150e.readString();
        }
        iconCompat.f404i = str;
        String str2 = iconCompat.f405j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f1150e.readString();
        }
        iconCompat.f405j = str2;
        iconCompat.f403h = PorterDuff.Mode.valueOf(iconCompat.f404i);
        switch (iconCompat.f396a) {
            case -1:
                Parcelable parcelable = iconCompat.f399d;
                if (parcelable != null) {
                    iconCompat.f397b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f399d;
                if (parcelable2 != null) {
                    iconCompat.f397b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f398c;
                iconCompat.f397b = bArr3;
                iconCompat.f396a = 3;
                iconCompat.f400e = 0;
                iconCompat.f401f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f398c, Charset.forName("UTF-16"));
                iconCompat.f397b = str3;
                if (iconCompat.f396a == 2 && iconCompat.f405j == null) {
                    iconCompat.f405j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f397b = iconCompat.f398c;
                return iconCompat;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f404i = iconCompat.f403h.name();
        switch (iconCompat.f396a) {
            case -1:
                iconCompat.f399d = (Parcelable) iconCompat.f397b;
                break;
            case 1:
            case 5:
                iconCompat.f399d = (Parcelable) iconCompat.f397b;
                break;
            case 2:
                iconCompat.f398c = ((String) iconCompat.f397b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f398c = (byte[]) iconCompat.f397b;
                break;
            case 4:
            case 6:
                iconCompat.f398c = iconCompat.f397b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f396a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f1150e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f398c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f1150e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f399d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f1150e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f400e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f1150e.writeInt(i3);
        }
        int i4 = iconCompat.f401f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f1150e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f402g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f1150e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f404i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f1150e.writeString(str);
        }
        String str2 = iconCompat.f405j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f1150e.writeString(str2);
        }
    }
}
