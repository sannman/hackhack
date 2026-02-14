package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q.b;
import q.c;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f389a;
        boolean z2 = true;
        if (bVar.e(1)) {
            obj = bVar.g();
        }
        remoteActionCompat.f389a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f390b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1150e);
        }
        remoteActionCompat.f390b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f391c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1150e);
        }
        remoteActionCompat.f391c = charSequence2;
        remoteActionCompat.f392d = (PendingIntent) bVar.f(remoteActionCompat.f392d, 4);
        boolean z3 = remoteActionCompat.f393e;
        if (bVar.e(5)) {
            if (((c) bVar).f1150e.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        remoteActionCompat.f393e = z3;
        boolean z4 = remoteActionCompat.f394f;
        if (!bVar.e(6)) {
            z2 = z4;
        } else if (((c) bVar).f1150e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f394f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f389a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f390b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f1150e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f391c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f392d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f393e;
        bVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f394f;
        bVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
