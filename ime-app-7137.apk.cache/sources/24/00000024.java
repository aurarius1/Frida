package p000a.p001a.p002a.p004b.p005x;

import android.os.IBinder;
import android.os.RemoteException;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;

/* renamed from: a.a.a.b.x.k */
/* loaded from: classes.dex */
public class C0036k implements InterfaceC0031f {

    /* renamed from: a */
    public InterfaceC0028c f71a;

    public C0036k(MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f71a = AbstractBinderC0027b.m3458c((IBinder) mediaSessionCompat$Token.f94b);
    }

    @Override // p000a.p001a.p002a.p004b.p005x.InterfaceC0031f
    /* renamed from: a */
    public boolean mo3457a(KeyEvent keyEvent) {
        try {
            ((C0026a) this.f71a).m3459c(keyEvent);
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}