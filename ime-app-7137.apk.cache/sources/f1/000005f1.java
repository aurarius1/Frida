package p093c.p097b.p108i0.p110p.p113z1;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: c.b.i0.p.z1.a */
/* loaded from: classes.dex */
public class C1389a extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C1391c f4619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389a(C1391c c1391c, Handler handler) {
        super(null);
        this.f4619a = c1391c;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        this.f4619a.f4621W.removeMessages(446);
        Handler handler = this.f4619a.f4621W;
        handler.sendMessageDelayed(handler.obtainMessage(446), 50L);
    }
}