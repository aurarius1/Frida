package p000a.p001a.p002a.p004b.p005x;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat$Token;

/* renamed from: a.a.a.b.x.n */
/* loaded from: classes.dex */
public final class C0039n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaSessionCompat$Token[i];
    }
}