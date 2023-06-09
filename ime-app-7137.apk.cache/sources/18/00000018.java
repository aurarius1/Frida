package p000a.p001a.p002a.p004b;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaMetadataCompat;

/* renamed from: a.a.a.b.v */
/* loaded from: classes.dex */
public final class C0024v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}