package p210g.p211a.p212a;

import android.os.Parcel;
import android.os.Parcelable;
import pub.devrel.easypermissions.AppSettingsDialog;

/* renamed from: g.a.a.b */
/* loaded from: classes.dex */
public final class C2303b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AppSettingsDialog(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AppSettingsDialog[i];
    }
}