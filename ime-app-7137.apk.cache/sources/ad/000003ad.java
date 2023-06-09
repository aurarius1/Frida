package p010b.p077q;

import android.os.Bundle;
import android.support.p007v4.p008os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: b.q.d */
/* loaded from: classes.dex */
public class C0809d extends AbstractC0830p {

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f3323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f3323e = resultReceiver;
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: b */
    public void mo1787b(Bundle bundle) {
        this.f3323e.m3452l(-1, bundle);
    }

    @Override // p010b.p077q.AbstractC0830p
    /* renamed from: c */
    public void mo1786c(Object obj) {
        this.f3323e.m3452l(0, (Bundle) obj);
    }
}