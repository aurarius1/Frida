package p010b.p077q;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;

/* renamed from: b.q.h0 */
/* loaded from: classes.dex */
public class C0818h0 extends C0814f0 {
    public C0818h0(Context context, C0827m c0827m) {
        super(context, c0827m);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        AbstractC0040o.m3456a(bundle);
        C0827m c0827m = (C0827m) this.f3322b;
        c0827m.f3347f.m3307d(str, new C0825l(c0827m, str, new C0820i0(result)));
    }
}