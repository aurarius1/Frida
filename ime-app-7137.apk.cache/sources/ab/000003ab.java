package p010b.p077q;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.media.MediaBrowserCompat$MediaItem;
import android.support.p007v4.p008os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* renamed from: b.q.c */
/* loaded from: classes.dex */
public class C0807c extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f3321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0807c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f3321e = resultReceiver;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        List list = (List) obj;
        if ((this.f3353d & 4) != 0 || list == null) {
            this.f3321e.m3452l(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
        this.f3321e.m3452l(0, bundle);
    }
}