package p010b.p077q;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Collections;
import java.util.List;

/* renamed from: b.q.a */
/* loaded from: classes.dex */
public class C0803a extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ C0813f f3312e;

    /* renamed from: f */
    public final /* synthetic */ String f3313f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f3314g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f3315h;

    /* renamed from: i */
    public final /* synthetic */ MediaBrowserServiceCompat f3316i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803a(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, C0813f c0813f, String str, Bundle bundle, Bundle bundle2) {
        super(obj);
        this.f3316i = mediaBrowserServiceCompat;
        this.f3312e = c0813f;
        this.f3313f = str;
        this.f3314g = bundle;
        this.f3315h = bundle2;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        List list = (List) obj;
        Object obj2 = this.f3316i.f569d.get(this.f3312e.f3327b.m1797a());
        C0813f c0813f = this.f3312e;
        if (obj2 != c0813f) {
            if (MediaBrowserServiceCompat.f567b) {
                String str = c0813f.f3326a;
                return;
            }
            return;
        }
        if ((this.f3353d & 1) != 0) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3316i;
            Bundle bundle = this.f3314g;
            mediaBrowserServiceCompat.getClass();
            if (list == null) {
                list = null;
            } else {
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i != -1 || i2 != -1) {
                    int i3 = i2 * i;
                    int i4 = i3 + i2;
                    if (i < 0 || i2 < 1 || i3 >= list.size()) {
                        list = Collections.emptyList();
                    } else {
                        if (i4 > list.size()) {
                            i4 = list.size();
                        }
                        list = list.subList(i3, i4);
                    }
                }
            }
        }
        try {
            this.f3312e.f3327b.m1796b(this.f3313f, list, this.f3314g, this.f3315h);
        } catch (RemoteException unused) {
            String str2 = this.f3312e.f3326a;
        }
    }
}