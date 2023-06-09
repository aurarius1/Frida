package p010b.p077q;

import android.os.Parcel;
import android.support.p007v4.media.MediaBrowserCompat$MediaItem;

/* renamed from: b.q.j */
/* loaded from: classes.dex */
public class C0821j extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ C0810d0 f3336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0821j(C0823k c0823k, Object obj, C0810d0 c0810d0) {
        super(obj);
        this.f3336e = c0810d0;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        Parcel obtain;
        C0810d0 c0810d0;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if (mediaBrowserCompat$MediaItem == null) {
            c0810d0 = this.f3336e;
            obtain = null;
        } else {
            obtain = Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
            c0810d0 = this.f3336e;
        }
        c0810d0.m1793a(obtain);
    }
}