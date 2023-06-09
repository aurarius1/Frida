package p010b.p077q;

import androidx.media.MediaBrowserServiceCompat;

/* renamed from: b.q.k */
/* loaded from: classes.dex */
public class C0823k extends C0819i implements InterfaceC0816g0 {

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat f3338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0823k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f3338e = mediaBrowserServiceCompat;
    }

    @Override // p010b.p077q.C0819i, p010b.p077q.InterfaceC0815g
    /* renamed from: a */
    public void mo1790a() {
        C0814f0 c0814f0 = new C0814f0(this.f3338e, this);
        this.f3332b = c0814f0;
        c0814f0.onCreate();
    }
}