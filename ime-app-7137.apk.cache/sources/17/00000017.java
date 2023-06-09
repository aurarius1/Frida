package p000a.p001a.p002a.p004b;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaDescriptionCompat;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;

/* renamed from: a.a.a.b.u */
/* loaded from: classes.dex */
public final class C0023u implements Parcelable.Creator {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createFromParcel(Parcel parcel) {
        Uri uri;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return new MediaDescriptionCompat(parcel);
        }
        Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
        if (createFromParcel == null || i < 21) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) createFromParcel;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            AbstractC0040o.m3456a(extras);
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                bundle = null;
                if (uri == null) {
                    uri = i >= 23 ? mediaDescription.getMediaUri() : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                mediaDescriptionCompat.f85j = createFromParcel;
                return mediaDescriptionCompat;
            }
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = extras;
        if (uri == null) {
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
        mediaDescriptionCompat2.f85j = createFromParcel;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}