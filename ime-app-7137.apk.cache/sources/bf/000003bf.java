package p010b.p077q;

import androidx.media.MediaBrowserServiceCompat;
import java.lang.reflect.Field;

/* renamed from: b.q.m */
/* loaded from: classes.dex */
public class C0827m extends C0823k implements InterfaceC0816g0 {

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat f3347f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827m(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f3347f = mediaBrowserServiceCompat;
    }

    @Override // p010b.p077q.C0823k, p010b.p077q.C0819i, p010b.p077q.InterfaceC0815g
    /* renamed from: a */
    public void mo1790a() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3347f;
        Field field = AbstractC0822j0.f3337a;
        C0818h0 c0818h0 = new C0818h0(mediaBrowserServiceCompat, this);
        this.f3332b = c0818h0;
        c0818h0.onCreate();
    }
}