package p010b.p077q;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* renamed from: b.q.q */
/* loaded from: classes.dex */
public class RunnableC0831q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3354b;

    /* renamed from: c */
    public final /* synthetic */ String f3355c;

    /* renamed from: d */
    public final /* synthetic */ int f3356d;

    /* renamed from: e */
    public final /* synthetic */ int f3357e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f3358f;

    /* renamed from: g */
    public final /* synthetic */ C0840z f3359g;

    public RunnableC0831q(C0840z c0840z, C0804a0 c0804a0, String str, int i, int i2, Bundle bundle) {
        this.f3359g = c0840z;
        this.f3354b = c0804a0;
        this.f3355c = str;
        this.f3356d = i;
        this.f3357e = i2;
        this.f3358f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3359g.f3393a.f569d.remove(this.f3354b.m1797a());
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3359g.f3393a;
        String str = this.f3355c;
        int i = this.f3356d;
        int i2 = this.f3357e;
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            new C0824k0(str, i, i2);
        }
        this.f3359g.f3393a.getClass();
        this.f3359g.f3393a.m3309b(this.f3355c, this.f3357e, this.f3358f);
        this.f3359g.f3393a.getClass();
        try {
            this.f3354b.m1795c(2, null);
        } catch (RemoteException unused) {
        }
    }
}