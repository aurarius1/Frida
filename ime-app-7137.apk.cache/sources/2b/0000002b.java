package p000a.p001a.p002a.p004b.p005x;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.PlaybackStateCompat;

/* renamed from: a.a.a.b.x.r */
/* loaded from: classes.dex */
public final class C0043r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}