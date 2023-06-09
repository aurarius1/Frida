package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaDescriptionCompat;
import p000a.p001a.p002a.p004b.p005x.C0037l;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0037l();

    /* renamed from: b */
    public final MediaDescriptionCompat f91b;

    /* renamed from: c */
    public final long f92c;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f91b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f92c = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("MediaSession.QueueItem {Description=");
        m1187i.append(this.f91b);
        m1187i.append(", Id=");
        m1187i.append(this.f92c);
        m1187i.append(" }");
        return m1187i.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f91b.writeToParcel(parcel, i);
        parcel.writeLong(this.f92c);
    }
}