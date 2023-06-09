package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.p001a.p002a.p004b.C0016n;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0016n();

    /* renamed from: b */
    public final int f75b;

    /* renamed from: c */
    public final MediaDescriptionCompat f76c;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f75b = parcel.readInt();
        this.f76c = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f75b + ", mDescription=" + this.f76c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f75b);
        this.f76c.writeToParcel(parcel, i);
    }
}