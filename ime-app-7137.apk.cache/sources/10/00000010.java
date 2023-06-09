package p000a.p001a.p002a.p004b;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaBrowserCompat$MediaItem;

/* renamed from: a.a.a.b.n */
/* loaded from: classes.dex */
public final class C0016n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat$MediaItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}