package p093c.p097b.p108i0.p110p.p113z1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: c.b.i0.p.z1.b */
/* loaded from: classes.dex */
public class HandlerC1390b extends Handler {

    /* renamed from: a */
    public final WeakReference f4620a;

    public HandlerC1390b(C1391c c1391c) {
        super(Looper.getMainLooper());
        this.f4620a = new WeakReference(c1391c);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C1391c c1391c = (C1391c) this.f4620a.get();
        if (c1391c == null) {
            return;
        }
        int i = message.what;
        if (i == 444) {
            c1391c.f4622X.m1197v(message.arg1, true);
        } else if (i != 446) {
            super.handleMessage(message);
        } else if (!c1391c.m1890M() || c1391c.m1872h() == null) {
            c1391c.f4625a0 = true;
        } else {
            c1391c.m1105Q0();
        }
    }
}