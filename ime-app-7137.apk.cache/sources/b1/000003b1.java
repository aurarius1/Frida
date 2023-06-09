package p010b.p077q;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* renamed from: b.q.f */
/* loaded from: classes.dex */
public class C0813f implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final String f3326a;

    /* renamed from: b */
    public final C0804a0 f3327b;

    /* renamed from: c */
    public final HashMap f3328c = new HashMap();

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat f3329d;

    public C0813f(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, Bundle bundle, C0804a0 c0804a0) {
        this.f3329d = mediaBrowserServiceCompat;
        this.f3326a = str;
        if (Build.VERSION.SDK_INT >= 28) {
            new C0824k0(str, i, i2);
        }
        this.f3327b = c0804a0;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f3329d.f570e.post(new RunnableC0811e(this));
    }
}