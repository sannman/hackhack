package q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: q.a  reason: case insensitive filesystem */
public final class C0089a implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    public final Object[] newArray(int i2) {
        return new ParcelImpl[i2];
    }
}
