package p010b.p077q;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p007v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.q.l */
/* loaded from: classes.dex */
public class C0825l extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ C0820i0 f3340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825l(C0827m c0827m, Object obj, C0820i0 c0820i0) {
        super(obj);
        this.f3340e = c0820i0;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        ArrayList<Parcel> arrayList;
        List<MediaBrowserCompat$MediaItem> list = (List) obj;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                Parcel obtain = Parcel.obtain();
                mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        C0820i0 c0820i0 = this.f3340e;
        int i = this.f3353d;
        c0820i0.getClass();
        try {
            AbstractC0822j0.f3337a.setInt(c0820i0.f3335a, i);
        } catch (IllegalAccessException unused) {
        }
        MediaBrowserService.Result result = c0820i0.f3335a;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Parcel parcel : arrayList) {
                parcel.setDataPosition(0);
                arrayList2.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
        }
        result.sendResult(arrayList2);
    }
}