package p010b.p077q;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: b.q.o */
/* loaded from: classes.dex */
public class C0829o implements InterfaceC0815g {

    /* renamed from: a */
    public Messenger f3348a;

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat f3349b;

    public C0829o(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f3349b = mediaBrowserServiceCompat;
    }

    @Override // p010b.p077q.InterfaceC0815g
    /* renamed from: a */
    public void mo1790a() {
        this.f3348a = new Messenger(this.f3349b.f570e);
    }

    @Override // p010b.p077q.InterfaceC0815g
    /* renamed from: b */
    public IBinder mo1789b(Intent intent) {
        if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
            return this.f3348a.getBinder();
        }
        return null;
    }
}