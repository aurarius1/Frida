package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p001a.p002a.p004b.C0024v;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;
import p010b.p036g.C0378b;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* renamed from: b */
    public static final C0378b f86b;

    /* renamed from: c */
    public final Bundle f87c;

    static {
        C0378b c0378b = new C0378b();
        f86b = c0378b;
        c0378b.put("android.media.metadata.TITLE", 1);
        c0378b.put("android.media.metadata.ARTIST", 1);
        c0378b.put("android.media.metadata.DURATION", 0);
        c0378b.put("android.media.metadata.ALBUM", 1);
        c0378b.put("android.media.metadata.AUTHOR", 1);
        c0378b.put("android.media.metadata.WRITER", 1);
        c0378b.put("android.media.metadata.COMPOSER", 1);
        c0378b.put("android.media.metadata.COMPILATION", 1);
        c0378b.put("android.media.metadata.DATE", 1);
        c0378b.put("android.media.metadata.YEAR", 0);
        c0378b.put("android.media.metadata.GENRE", 1);
        c0378b.put("android.media.metadata.TRACK_NUMBER", 0);
        c0378b.put("android.media.metadata.NUM_TRACKS", 0);
        c0378b.put("android.media.metadata.DISC_NUMBER", 0);
        c0378b.put("android.media.metadata.ALBUM_ARTIST", 1);
        c0378b.put("android.media.metadata.ART", 2);
        c0378b.put("android.media.metadata.ART_URI", 1);
        c0378b.put("android.media.metadata.ALBUM_ART", 2);
        c0378b.put("android.media.metadata.ALBUM_ART_URI", 1);
        c0378b.put("android.media.metadata.USER_RATING", 3);
        c0378b.put("android.media.metadata.RATING", 3);
        c0378b.put("android.media.metadata.DISPLAY_TITLE", 1);
        c0378b.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c0378b.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c0378b.put("android.media.metadata.DISPLAY_ICON", 2);
        c0378b.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c0378b.put("android.media.metadata.MEDIA_ID", 1);
        c0378b.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c0378b.put("android.media.metadata.MEDIA_URI", 1);
        c0378b.put("android.media.metadata.ADVERTISEMENT", 0);
        c0378b.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0024v();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f87c = parcel.readBundle(AbstractC0040o.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f87c);
    }
}