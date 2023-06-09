package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.p008os.ResultReceiver;
import java.util.ArrayList;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
/* loaded from: classes.dex */
public class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    @Override // android.support.p007v4.p008os.ResultReceiver
    /* renamed from: k */
    public void mo3453k(int i, Bundle bundle) {
        AbstractC0040o.m3456a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}