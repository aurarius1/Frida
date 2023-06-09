package p010b.p077q;

import android.os.Parcel;
import android.support.p007v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.q.h */
/* loaded from: classes.dex */
public class C0817h extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ C0810d0 f3330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0817h(C0819i c0819i, Object obj, C0810d0 c0810d0) {
        super(obj);
        this.f3330e = c0810d0;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        ArrayList arrayList;
        List<MediaBrowserCompat$MediaItem> list = (List) obj;
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
        this.f3330e.m1793a(arrayList);
    }
}