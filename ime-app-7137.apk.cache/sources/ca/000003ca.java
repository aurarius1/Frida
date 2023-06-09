package p010b.p077q;

import android.os.Bundle;
import android.support.p007v4.p008os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.q.x */
/* loaded from: classes.dex */
public class RunnableC0838x implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3383b;

    /* renamed from: c */
    public final /* synthetic */ String f3384c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f3385d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f3386e;

    /* renamed from: f */
    public final /* synthetic */ C0840z f3387f;

    public RunnableC0838x(C0840z c0840z, C0804a0 c0804a0, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f3387f = c0840z;
        this.f3383b = c0804a0;
        this.f3384c = str;
        this.f3385d = bundle;
        this.f3386e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((C0813f) this.f3387f.f3393a.f569d.get(this.f3383b.m1797a())) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3387f.f3393a;
        String str = this.f3384c;
        C0807c c0807c = new C0807c(mediaBrowserServiceCompat, str, this.f3386e);
        mediaBrowserServiceCompat.m3305f(c0807c);
        if (!c0807c.m1788a()) {
            throw new IllegalStateException(AbstractC1124a.m1190f("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}