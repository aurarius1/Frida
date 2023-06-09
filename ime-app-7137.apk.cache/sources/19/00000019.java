package p000a.p001a.p002a.p004b;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.RatingCompat;

/* renamed from: a.a.a.b.w */
/* loaded from: classes.dex */
public final class C0025w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new RatingCompat[i];
    }
}