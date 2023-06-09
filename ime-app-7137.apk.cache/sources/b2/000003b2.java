package p010b.p077q;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* renamed from: b.q.f0 */
/* loaded from: classes.dex */
public class C0814f0 extends C0808c0 {
    public C0814f0(Context context, InterfaceC0816g0 interfaceC0816g0) {
        super(context, interfaceC0816g0);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String str, MediaBrowserService.Result result) {
        C0823k c0823k = (C0823k) ((InterfaceC0816g0) this.f3322b);
        c0823k.f3338e.m3306e(new C0821j(c0823k, str, new C0810d0(result)));
    }
}