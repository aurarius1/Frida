package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.b.i0.p.z1.i */
/* loaded from: classes.dex */
public class HandlerC1397i extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C1400l f4631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1397i(C1400l c1400l, Looper looper) {
        super(looper);
        this.f4631a = c1400l;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Context context;
        int i = message.what;
        if (i != 446) {
            if (i != 447) {
                super.handleMessage(message);
                return;
            }
            C1400l c1400l = this.f4631a;
            int i2 = C1400l.f4634X;
            c1400l.m1099U0();
            return;
        }
        C1400l c1400l2 = this.f4631a;
        Intent intent = c1400l2.f4638b0;
        if (intent == null || (context = c1400l2.f4637a0) == null) {
            return;
        }
        context.startActivity(intent);
        this.f4631a.f4638b0 = null;
    }
}