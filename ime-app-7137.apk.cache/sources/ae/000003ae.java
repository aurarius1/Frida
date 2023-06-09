package p010b.p077q;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.q.d0 */
/* loaded from: classes.dex */
public class C0810d0 {

    /* renamed from: a */
    public MediaBrowserService.Result f3324a;

    public C0810d0(MediaBrowserService.Result result) {
        this.f3324a = result;
    }

    /* renamed from: a */
    public void m1793a(Object obj) {
        ArrayList arrayList = null;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                this.f3324a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            this.f3324a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        MediaBrowserService.Result result = this.f3324a;
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList();
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }
}