package p000a.p001a.p002a.p004b.p005x;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.ParcelableVolumeInfo;

/* renamed from: a.a.a.b.x.p */
/* loaded from: classes.dex */
public final class C0041p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}