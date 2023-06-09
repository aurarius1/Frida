package p010b.p077q;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p057k.C0561b;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.q.s */
/* loaded from: classes.dex */
public class RunnableC0833s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3362b;

    /* renamed from: c */
    public final /* synthetic */ String f3363c;

    /* renamed from: d */
    public final /* synthetic */ IBinder f3364d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f3365e;

    /* renamed from: f */
    public final /* synthetic */ C0840z f3366f;

    public RunnableC0833s(C0840z c0840z, C0804a0 c0804a0, String str, IBinder iBinder, Bundle bundle) {
        this.f3366f = c0840z;
        this.f3362b = c0804a0;
        this.f3363c = str;
        this.f3364d = iBinder;
        this.f3365e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0813f c0813f = (C0813f) this.f3366f.f3393a.f569d.get(this.f3362b.m1797a());
        if (c0813f == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3366f.f3393a;
        String str = this.f3363c;
        IBinder iBinder = this.f3364d;
        Bundle bundle = this.f3365e;
        mediaBrowserServiceCompat.getClass();
        List<C0561b> list = (List) c0813f.f3328c.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (C0561b c0561b : list) {
            if (iBinder == c0561b.f2654a) {
                Bundle bundle2 = (Bundle) c0561b.f2655b;
                boolean z = true;
                if (bundle != bundle2 && (bundle != null ? bundle2 != null ? bundle.getInt("android.media.browse.extra.PAGE", -1) != bundle2.getInt("android.media.browse.extra.PAGE", -1) || bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) != bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) : bundle.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1)) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
        }
        list.add(new C0561b(iBinder, bundle));
        c0813f.f3328c.put(str, list);
        C0803a c0803a = new C0803a(mediaBrowserServiceCompat, str, c0813f, str, bundle, null);
        if (bundle == null) {
            mediaBrowserServiceCompat.m3308c(str, c0803a);
        } else {
            mediaBrowserServiceCompat.m3307d(str, c0803a);
        }
        if (c0803a.m1788a()) {
            mediaBrowserServiceCompat.m3304g();
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("onLoadChildren must call detach() or sendResult() before returning for package=");
        m1187i.append(c0813f.f3326a);
        m1187i.append(" id=");
        m1187i.append(str);
        throw new IllegalStateException(m1187i.toString());
    }
}