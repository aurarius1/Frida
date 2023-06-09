package p010b.p077q;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.q.i */
/* loaded from: classes.dex */
public class C0819i implements InterfaceC0815g, InterfaceC0812e0 {

    /* renamed from: a */
    public final List f3331a = new ArrayList();

    /* renamed from: b */
    public Object f3332b;

    /* renamed from: c */
    public Messenger f3333c;

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat f3334d;

    public C0819i(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f3334d = mediaBrowserServiceCompat;
    }

    @Override // p010b.p077q.InterfaceC0815g
    /* renamed from: a */
    public void mo1790a() {
        C0808c0 c0808c0 = new C0808c0(this.f3334d, this);
        this.f3332b = c0808c0;
        c0808c0.onCreate();
    }

    @Override // p010b.p077q.InterfaceC0815g
    /* renamed from: b */
    public IBinder mo1789b(Intent intent) {
        return ((MediaBrowserService) this.f3332b).onBind(intent);
    }
}