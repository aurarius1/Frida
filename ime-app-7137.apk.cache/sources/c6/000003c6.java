package p010b.p077q;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p057k.C0561b;

/* renamed from: b.q.t */
/* loaded from: classes.dex */
public class RunnableC0834t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0804a0 f3367b;

    /* renamed from: c */
    public final /* synthetic */ String f3368c;

    /* renamed from: d */
    public final /* synthetic */ IBinder f3369d;

    /* renamed from: e */
    public final /* synthetic */ C0840z f3370e;

    public RunnableC0834t(C0840z c0840z, C0804a0 c0804a0, String str, IBinder iBinder) {
        this.f3370e = c0840z;
        this.f3367b = c0804a0;
        this.f3368c = str;
        this.f3369d = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0813f c0813f = (C0813f) this.f3370e.f3393a.f569d.get(this.f3367b.m1797a());
        if (c0813f == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3370e.f3393a;
        String str = this.f3368c;
        IBinder iBinder = this.f3369d;
        mediaBrowserServiceCompat.getClass();
        try {
            if (iBinder != null) {
                List list = (List) c0813f.f3328c.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((C0561b) it.next()).f2654a) {
                            it.remove();
                        }
                    }
                    if (list.size() == 0) {
                        c0813f.f3328c.remove(str);
                    }
                }
            } else if (c0813f.f3328c.remove(str) != null) {
            }
        } finally {
            mediaBrowserServiceCompat.m3303h();
        }
    }
}