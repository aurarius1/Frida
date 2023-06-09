package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.i0.p.z1.j */
/* loaded from: classes.dex */
public class C1398j extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C1400l f4632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398j(C1400l c1400l, Handler handler) {
        super(null);
        this.f4632a = c1400l;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        if (this.f4632a.m1890M()) {
            return;
        }
        C1400l c1400l = this.f4632a;
        Context m1866k = c1400l.m1866k();
        c1400l.getClass();
        if (AbstractC1077v0.m1299E(m1866k)) {
            this.f4632a.f4635Y.removeMessages(446);
            Handler handler = this.f4632a.f4635Y;
            handler.sendMessageDelayed(handler.obtainMessage(446), 50L);
        }
    }
}