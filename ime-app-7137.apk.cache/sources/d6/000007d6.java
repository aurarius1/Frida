package p093c.p145g.p146a.p147a.p155h0;

import android.os.Handler;
import android.os.Message;

/* renamed from: c.g.a.a.h0.f */
/* loaded from: classes.dex */
public class C1874f implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C1876h f5750a;

    public C1874f(C1876h c1876h) {
        this.f5750a = c1876h;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C1876h c1876h = this.f5750a;
        AbstractC1875g abstractC1875g = (AbstractC1875g) message.obj;
        synchronized (c1876h.f5752b) {
            if (abstractC1875g == null) {
                throw null;
            }
        }
        return true;
    }
}