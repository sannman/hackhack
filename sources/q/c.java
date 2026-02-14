package q;

import android.os.Parcel;
import android.util.SparseIntArray;
import e.C0026a;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1149d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1150e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1151f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1152g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1153h;

    /* renamed from: i  reason: collision with root package name */
    public int f1154i;

    /* renamed from: j  reason: collision with root package name */
    public int f1155j;

    /* renamed from: k  reason: collision with root package name */
    public int f1156k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0026a(), new C0026a(), new C0026a());
    }

    public final c a() {
        Parcel parcel = this.f1150e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1155j;
        if (i2 == this.f1151f) {
            i2 = this.f1152g;
        }
        return new c(parcel, dataPosition, i2, this.f1153h + "  ", this.f1146a, this.f1147b, this.f1148c);
    }

    public final boolean e(int i2) {
        while (this.f1155j < this.f1152g) {
            int i3 = this.f1156k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1155j;
            Parcel parcel = this.f1150e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1156k = parcel.readInt();
            this.f1155j += readInt;
        }
        if (this.f1156k == i2) {
            return true;
        }
        return false;
    }

    public final void h(int i2) {
        int i3 = this.f1154i;
        SparseIntArray sparseIntArray = this.f1149d;
        Parcel parcel = this.f1150e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1154i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, C0026a aVar, C0026a aVar2, C0026a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1149d = new SparseIntArray();
        this.f1154i = -1;
        this.f1156k = -1;
        this.f1150e = parcel;
        this.f1151f = i2;
        this.f1152g = i3;
        this.f1155j = i2;
        this.f1153h = str;
    }
}
