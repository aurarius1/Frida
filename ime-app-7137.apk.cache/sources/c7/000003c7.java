package p010b.p077q;

import android.support.p007v4.p008os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.q.u */
/* loaded from: classes.dex */
public class RunnableC0835u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3371b;

    /* renamed from: c */
    public final /* synthetic */ String f3372c;

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f3373d;

    /* renamed from: e */
    public final /* synthetic */ C0840z f3374e;

    public RunnableC0835u(C0840z c0840z, C0804a0 c0804a0, String str, ResultReceiver resultReceiver) {
        this.f3374e = c0840z;
        this.f3371b = c0804a0;
        this.f3372c = str;
        this.f3373d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((C0813f) this.f3374e.f3393a.f569d.get(this.f3371b.m1797a())) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3374e.f3393a;
        String str = this.f3372c;
        C0805b c0805b = new C0805b(mediaBrowserServiceCompat, str, this.f3373d);
        mediaBrowserServiceCompat.m3306e(c0805b);
        if (!c0805b.m1788a()) {
            throw new IllegalStateException(AbstractC1124a.m1190f("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}