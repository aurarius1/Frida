package p010b.p077q;

import android.os.Bundle;
import android.support.p007v4.p008os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.q.y */
/* loaded from: classes.dex */
public class RunnableC0839y implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3388b;

    /* renamed from: c */
    public final /* synthetic */ String f3389c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f3390d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f3391e;

    /* renamed from: f */
    public final /* synthetic */ C0840z f3392f;

    public RunnableC0839y(C0840z c0840z, C0804a0 c0804a0, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f3392f = c0840z;
        this.f3388b = c0804a0;
        this.f3389c = str;
        this.f3390d = bundle;
        this.f3391e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((C0813f) this.f3392f.f3393a.f569d.get(this.f3388b.m1797a())) == null) {
            StringBuilder m1187i = AbstractC1124a.m1187i("sendCustomAction for callback that isn't registered action=");
            m1187i.append(this.f3389c);
            m1187i.append(", extras=");
            m1187i.append(this.f3390d);
            m1187i.toString();
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3392f.f3393a;
        String str = this.f3389c;
        Bundle bundle = this.f3390d;
        C0809d c0809d = new C0809d(mediaBrowserServiceCompat, str, this.f3391e);
        mediaBrowserServiceCompat.m3310a(c0809d);
        if (c0809d.m1788a()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}