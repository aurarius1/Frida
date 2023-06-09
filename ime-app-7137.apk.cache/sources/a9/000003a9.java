package p010b.p077q;

import android.os.Bundle;
import android.support.p007v4.media.MediaBrowserCompat$MediaItem;
import android.support.p007v4.p008os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: b.q.b */
/* loaded from: classes.dex */
public class C0805b extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f3318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f3318e = resultReceiver;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if ((this.f3353d & 2) != 0) {
            this.f3318e.m3452l(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
        this.f3318e.m3452l(0, bundle);
    }
}