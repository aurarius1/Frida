package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.p008os.ResultReceiver;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
/* loaded from: classes.dex */
public class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.p007v4.p008os.ResultReceiver
    /* renamed from: k */
    public void mo3453k(int i, Bundle bundle) {
        AbstractC0040o.m3456a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
        throw null;
    }
}