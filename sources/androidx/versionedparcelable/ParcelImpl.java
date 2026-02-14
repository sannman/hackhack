package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import q.c;
import q.d;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final d f440a;

    public ParcelImpl(Parcel parcel) {
        this.f440a = new c(parcel).g();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        new c(parcel).i(this.f440a);
    }
}
